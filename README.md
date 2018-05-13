### Spring Cloud项目执行顺序 ###
* 1 eureka-server-demo是注册中心（首先启动）
* 2 service-zuul-demo是网关，专门负责**路由转发和过滤器**（可以用与登录等等的校验）
* 3 service-member是服务提供者，启动会向配置文件中的注册中心注册自己
    可修改端口号，再继续启动项目，实现集群效果，让消费者开启负载均衡即可
* 4 service-order-demo 消费者（使用ribbon显示开启负载均衡，在启动类中使用@LoadBalanced注解表明这个restRemplate开启负载均衡的功能）
```aidl
	@Bean
	@LoadBalanced  //注解表明这个restRemplate开启负载均衡的功能,是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
```
* 5 service-order-feign-demo 消费者（使用feign默认集成ribbon，并和eureka结合，默认实现了负载均衡的效果）
** Feign 采用的是基于接口的注解
```aidl
@FeignClient(value = "service-member", fallback = UserServiceImpl.class)
public interface  UserService {

    @GetMapping("/getUserList")
    public List<String> getUserList();
}
```
 * 这样即可实现远程的接口调用    
 
 
### swagger接口暴露测试集成插件 ###
