package aop.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class TestAOP {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestAOP.class);
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");

        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeVO());
        manager.deleteEmployee(100);
    }
}
