# Cloud

基于Spring Boot 2.x，Spring Cloud整合相关的常用模块，简易的使用例子。

## 模块

* **admin**：监控应用，针对服务提供简明的监控界面。

* **common**：通用的依赖，提供整体的AOP、配置、注解、过滤、API功能。
* **eureka**：Netflix的注册中心。
* **flux**：Spring WebFlux，非阻塞响应式Web框架。
* **gateway**：Spring Gateway，zuul网关的替代，基于WebFlux开发。
* **redis**：Spring Redis和Redisson相关。
* **resilience**：Hystrix的替代，提供熔断降级、流量控制等模块。
* **sentinel**：Alibaba Sentinel，流量控制、熔断降级、系统负载保护等多个维度保护服务。
* **turbine**：Hystrix集群管理。
* **txlcn-manager**：LCN分式式事务框架服务端。
* **zipkin**：微服务链路跟踪，提供简明的管理界面。（SpringBoot 2.x后，官方不再支持使用自建Zipkin Server的方式，而是直接提供了编译好的 jar）
* **zuul**：Netflix的网关服务，包括路径规则、服务限流等。

### 整合样例

* **sample**：整合了RabbitMQ，Zipkin，Feign，Hystrix，Cache，Sentinel，Nacos等。

* **substitute**：主要提供sample模块调用。

### Alibaba Fescar样例

* **fescar-account**：Fescar账户服务

* **fescar-order**：Fescar订单服务
* **fescar-storage**：Fescar库存服务
* **fescar-caller**： 服务间调用入口。

**运行Fescar样例需要[Fescar服务端](https://github.com/Lance8799/cloud/blob/2.0/FescarServer.md)和[初始化数据库](https://github.com/Lance8799/cloud/blob/2.0/fescar-caller/src/main/resources/fescar.sql)。**

## 依赖

* **部分模块使用到Swagger，依赖于[swagger-spring-boot-starter](https://github.com/Lance8799/swagger-spring-boot-starter)。需要在本地使用mvn install布署到本地maven仓库。**

* 注册中心可替换为[Alibaba Nacos](https://github.com/alibaba/Nacos)，需配置Nacos服务。可查看[Nacos服务配置](https://github.com/Lance8799/cloud/blob/2.0/NacosServer.md)或查看[官网](https://nacos.io/zh-cn/)。
