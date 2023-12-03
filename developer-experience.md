# Table of contents
- [Dev Exp](#dev-exp)
   - [001 Dev Exp](#001-dev-exp)
   - [002 Dev Exp](#002-dev-exp)
   - [003 Dev Exp](#003-dev-exp)
 
# Dev Exp
## 001 Dev Exp
- Create a new spring boot application with web flux and actuator dependency.
- Create two endpoints "/" and "/customers"
- Run the application and try to access "/customers" endpoint it will return list of customer, but what if i want to modify and add another customer. I have to perform following things
   - Modify the code(ex i want to add one more customer)
   - Run the application(to get rid of this step use dev tools see 002-dev-exp branch)
 

## 002 Dev Exp
- Add dev tools dependency run the application try to access "/customer" endpoint. Now make some changes ex add one more customer and access the url u will observe changes will auto reload, no need to re-run the application.

## 003 Dev Exp 
- In 001 and 002 we have fast feedback loop and also cognitive load is lower. But what if we want to deploy the application in kubernates in that case we have to go through following process
 ```
b)application(container)
a)runtime(oci)
```
- Here we have to write the docker file to cintainerize the application. Feedback loop is slow and cognitive load is little bit high as you need to read docker and write the docker file to cintainerize the application
- To get rid of the above steps we are going to use Cloud Native BuildPacks.  Cloud Native BuildPacks is an specification that define how to transform application source code into container images
 ```
                          BUILDPACKS
Go,spring,.net...etc --------------------->image
```
- we don't need to install any additional software with spring boot, spirng boot provide in built plugin, we just need to run the following command to containerize the application. ``` mvn spring-boot:build image```
- Now run ```docker run --rm -p 8080:8080 <image name>``` command to start the application
  
