package Java03;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface MyAnnotations {
    String name();

    String email();

    String address();

    int age();

    int phone();
}

class Employee {
    @MyAnnotations(
            name = "Jack",
            email = "jacksteve@gmail.com",
            address = "Burke street NYC",
            age = 24,
            phone = 634578)
        public void companyEmployee()
        {
            System.out.println("Employee Details are Updated");
        }
    }


class CustomAnnotationTest {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        Method method = e.getClass().getMethod("companyEmployee");
        MyAnnotations manno = method.getAnnotation(MyAnnotations.class);
        System.out.println("Name is: " + manno.name());
        System.out.println("Email is: " + manno.email());
        System.out.println("Address is: " + manno.email());
        System.out.println("Age is: " + manno.age());
        System.out.println("Phone Number is: " + manno.phone());

    }
}



