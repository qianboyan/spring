package xmlinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlinjection.hellocountries.HelloFrance;
import xmlinjection.hellocountries.HelloGermany;
import xmlinjection.hellocountries.HelloWorld;
import xmlinjection.hellocountries.HelloWorldSingleton;
import xmlinjection.hellocountries.LifeCycle;

public class MainApp {
  public static void main(String[] args) {
    // ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();

    HelloWorldSingleton objA = (HelloWorldSingleton) context.getBean("helloWorldSingleton");
    objA.setMessage("set new message in singleton");
    objA.getMessage();
    HelloWorldSingleton objB = (HelloWorldSingleton) context.getBean("helloWorldSingleton");
    objB.getMessage();

    LifeCycle lifeCycle = (LifeCycle) context.getBean("lifeCycle");
    lifeCycle.getMessage();
    context.registerShutdownHook();

    HelloGermany helloGermany = (HelloGermany) context.getBean("helloGermany");
    helloGermany.getMessage();
    helloGermany.getMessage1();
    helloGermany.getMessage2();
    helloGermany.getMessage3();

    HelloFrance helloFrance = (HelloFrance) context.getBean("helloFrance");
    helloFrance.getMessage();
    helloFrance.getMessage1();
    helloFrance.getMessage2();
    helloFrance.getMessage3();

  }

}
