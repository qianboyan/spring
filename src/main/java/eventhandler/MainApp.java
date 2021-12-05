package eventhandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansEvent.xml");

    context.start();
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    context.stop();
  }

}
