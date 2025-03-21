# *Practices*
## *Library Management System Project*
### **@Configuration and @Bean Usage**

@Configuration annotation is used for EmailConfig. EmailConfig has a method with @Bean annotation.
That method returns a Bean object to Spring.

### **@Service , @Component, @ComponentScan Annotations Usage**

These annotations are used in services package. @Service and @Component annotation has the same functionality but they have semantic differences.
@ComponentScan annotation is used to scan components but Spring Boot makes that automatically that is why it is not necessary.


### **@Repository annotation**

That annotation is used for the classes that have an access to persistent data. @Component and @Repository have no differences , only differences are semantic differences.
It is used in **repository** package and it behave as it has an access to a database.

### **@Controller Annotation**

Instead of @Controller , I use @RestController annotation to use json response and restfull api. I design a restful API :
Post ->  http://localhost:8080/api/v1/hiring/hire
That API gets bookId and userId to give a book to a user.



