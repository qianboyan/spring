package aop.javaaop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(StudentConfig.class);
    context.refresh();
    Student student = context.getBean(Student.class);

    student.setAge(12);
    student.setName("John");

    AspectJProxyFactory proxyFactory = new AspectJProxyFactory(student);
    proxyFactory.addAspect(Log.class);
    Student proxyStudent = proxyFactory.getProxy();
    proxyStudent.getAge();
    proxyStudent.getName();
    proxyStudent.printThrowException();
  }
}
