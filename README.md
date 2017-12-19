# spring-cloud-learning
此项目是spring cloud在真实项目中的一些实践
- 添加**docker**支持
- 添加**docker-compose**支持
- 添加**spring io platform**支持
- 添加**Spring Boot Admin**监控模板
- **spring cloud**更新到**Edgware.RELEASE**版
- 添加Spring retry支持
- 添加**Spring Cloud Feign**、**Spring Cloud Ribbon**、**Spring Cloud Hystrix**整合

使用到的Spring Cloud 组件:
  - [x] Spring Cloud Zuul
  - [x] Spring Cloud Eureka
  - [x] Spring Cloud Config
  - [x] Spring Cloud Bus-RabbitMQ
  - [x] Spring Cloud Feign
  - [x] Spring Cloud Ribbon
  - [x] Spring Cloud Hystrix
  - [x] Spring Cloud Stream - RabbitMQ
  
待整合的：
  - [ ] Swagger2
  - [ ] Google Protocol Buffers
  - [ ] Spring Security + JWT
  - [ ] Spring Cloud Sleuth
  - [ ] 分布式跟踪系统Zipkin或Sky Walking
  - [ ] GraphQL
  
  
  
# 环境依赖
## RabbitMQ
- docker 部署： 
`docker run -d --name rabbitmq --publish 5671:5671 --publish 5672:5672 --publish 4369:4369 --publish 25672:25672 --publish 15671:15671 --publish 15672:15672 rabbitmq:management-alpine`