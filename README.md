# Contents
- Tech Stack
   - Spring
   -  BuildPacks, Paketo Impl of Buildpacks
   - Docker
   - Kubernates
- [Spring Cloud Native](#spring-cloud-native)
  - [Goals](#Goals)
  - [Advantages of spring cloud native](#Advantages-of-spring-cloud-native)
  - [What we want to achieve?](#What-we-want-to-achieve?)
  - [Creating application](#creatig-application)
  - [Building Image using Paketo](#building-image-using-paketo)
- [Branches](#branches)
  - [001-dev-exp](#001-dev-exp)
- Ref
   - [Thomas vitale](https://www.youtube.com/watch?v=LuOZyHUtOc8&t=906s)

# Spring Cloud Native
## Goals
  1. Rapic and Continous Feedback Loop
  2. Reduced Cognitive loads
  3. Clear and safe path to production
## Advantages of spring cloud native
- Speed (Faster and Flexible delivery)
- Resilience(Availability and stability)
- Scale(Elasticity and Dynamic scaling)
- Cost(Efficiency and Cost Optimization)

### Traditional VS Native Stack 
- [Diagram](/img1.png)
- Traditional -> We package our application as war/ear file, before jvm we work with web/server and the deploy our application
  ```
  c)Application- war/ear file
  b)web server(middleware)
  a)runtime(JVM)
  Note-> slow feedback loop, and cognitive load is higher.
  ```
- SelfContained Jar
   ```
   b)application jar
   a)runtime(jvm)
   Note -> Fast feedback loop and reduced cognitive load
   ```
- with Container

   ```
   application(container)
   Runtime (OCI) container

   Note-> have one additional steps, feedback loop becomes a bit slower (as we need to know how to build image) and cognitive load becomes 
   a bit higher
   ```
- With K8s
  ```
   c)application(container)
   b)Kubernates(middleware)
   a)Runtime (OCI) container
  Note:- Feedback loop is as slow as it was in begning,cognitive load is aslo worse.
  ```
  - Issue with K8s
     - Need to deal with multiple configuration file such as ```deployment.yml, service.yml and IngressController.yml``` file
  -      
  

## What we want to achieve?
```
Development            Containerization                Deployment
Spring Boot ---------> Cloud Native BuildPacks -------> Kubernates
```
# Branches
### 001-dev-exp
- Here we will create a simple spring boot application and do the some changes and run the application.for more details follow [link](/001-dev-exp.md)



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


## Building Image using paketo
- In spring boot we don't have to install anything, its already included in spring boot plugin.
- First Start the docker and run the ```docker context ls ``` command, it should return the result which looks like below
  ```
  NAME                TYPE                DESCRIPTION                               DOCKER ENDPOINT                                               KUBERNETES ENDPOINT   ORCHESTRATOR
    default             moby                Current DOCKER_HOST based configuration   unix:///var/run/docker.sock                                               
    desktop-linux *     moby                Docker Desktop                            unix:///Users/rakeshsingh/.docker/run/docker.sock                         
  ```
- To build image run ```mvn spring-boot:build-image``` command
- 
