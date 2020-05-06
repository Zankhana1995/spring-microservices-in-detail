## spring-microservices
Microservices and RESTful web services with Spring and Spring Boot. 

## Following things are configured in this project.
# 01. restful-web-services. 
Include all the basic functionality of using REST web services.

# 02. microservices
1. Rest Template to communicate with other ms.
2. Feign to invoke other ms.
3. Ribbon for load balancing
4. Eureka Naming server for service registration and service discovery.
5. API gateway with Zuul which intercept call between ms and pass them through API gateway.
6. Spring cloud sleuth to assign unique id to request so one can trace it.
7. Zipkin for distributed tracing to debug all ms centrally and check logs.
8. Spring Cloud Bus links independent ms through message broker like rabbitMQ or kafka.
9. Fault tolerance with hystrix, Hystrix will help to configure default response when a service goes down. It will help to prevent ripple effect.

Reference: https://github.com/in28minutes/spring-microservices and Udemy videos of in28minutes. 
