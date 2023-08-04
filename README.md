# Contents
- [Advantages](#Advantages)
- [What we want to achieve?](#What-we-want-to-achieve?)
- [Creating application](#creatig-application)

## Advantages
- Speed (Faster and Flexible delivery)
- Resilience(Availability and stability)
- Scale(Elasticity and Dynamic scaling)
- Cost(Efficiency and Cost Optimization)

## What we want to achieve?
```
Development            Containerization                Deployment
Spring Boot ---------> Cloud Native BuildPacks -------> Kubernates
```

## Creating application
- Create Spring boot application with ```reactive web, actuator, and prometheus``` Dependency
- Define a controlller ```CloudNativeExController``` and greet endpoint.
- Since we want to chnage the message between the deployments(depending on env) so we need to externalize the configuration which may change between deployments.
  - Define a message in application.yml file
  - Define a configuration properties bean to parse the message. There is an annotation for that ```@ConfigurationProperties```
    ```
    Self contained application (this is the default behaviour in spring boot)
    -> Embedded Server
    -> No External dependency
    -> Jar packaging (fat jar or uber jar)
    ```



  
