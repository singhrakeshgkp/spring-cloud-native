# Contents
- Tech Stack
   - Spring
   -  BuildPacks, Paketo Impl of Buildpacks
   - Docker
   - Kubernates
- [Advantages of spring cloud native](#Advantages-of-spring-cloud-native)
- [What we want to achieve?](#What-we-want-to-achieve?)
- [Creating application](#creatig-application)
- [Building Image using Paketo](#building-image-using-paketo)

## Advantages of spring cloud native
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
