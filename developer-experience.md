# Table of contents
- [Dev Exp](#dev-exp)
   - [001 Dev Exp](#001-dev-exp)
   - [002 Dev Exp](#002-dev-exp)
 
# Dev Exp
## 001 Dev Exp
- Create a new spring boot application with web flux and actuator dependency.
- Create two endpoints "/" and "/customers"
- Run the application and try to access "/customers" endpoint it will return list of customer, but what if i want to modify and add another customer. I have to perform following things
   - Modify the code(ex i want to add one more customer)
   - Run the application(to get rid of this step use dev tools see 002-dev-exp branch)
 

## 002 Dev Exp
- Add dev tools dependency run the application try to access "/customer" endpoint. Now make some changes ex add one more customer and access the url u will observe changes will auto reload, no need to re-run the application.

