package com.springdemo.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class FirstTestingService {
    /**This is constructor dependency injection,
     * we can use the @Qualifier, @Primary, @Repository when using the constructor DI **/
   // private final FirstTestingClass firstTestingClass;
//    public FirstTestingService(@Qualifier("bean2") FirstTestingClass firstTestingClass) {
//        this.firstTestingClass = firstTestingClass;
//    }

    /**Constructor DI ends**/

    /**Field dependency injection**/
    //field injection is not recommended
//    @Autowired
//    private FirstTestingClass firstTestingClass;
    /**Field DI ends**/


    /**Method Injection**/
//    private FirstTestingClass firstTestingClass;
//
//    @Autowired
//    public void injectDependency( @Qualifier("bean1") FirstTestingClass firstTestingClass){
//        this.firstTestingClass = firstTestingClass;
//    }
    /**method injection ends**/


    /**Setter injection**/
    private FirstTestingClass firstTestingClass;

    @Autowired
    public void setFirstTestingClass( @Qualifier("bean1") FirstTestingClass firstTestingClass){
        this.firstTestingClass = firstTestingClass;
    }
    /**setter injection ends**/
    public String loadBeanFromClass(){
        return  "this bean is loaded from the "+ firstTestingClass.sayHello();
    }



    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    //using Environment bean to get the java version
    public String getJavaVersionFromEnvironmentBean(){
        return "Java version is: "+this.environment.getProperty("java.version");
    }
    //using environment bean to read from the application.properties file
    public String readFromTheApplicationProperties(){
        return "spring.application.name: "+ this.environment.getProperty("spring.application.name");
    }




    /**read custom properties from another properties file**/
    @Value("${my.custom.prop}")
    private String customPropertyFromAnotherFile;

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }
    /**Ends**/
}
