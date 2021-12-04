package xmlinjection.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("BeansCI.xml");
    CollectionInjection collectionInjection = (CollectionInjection)context.getBean("collectionInjection");

    collectionInjection.getAddressList();
    collectionInjection.getAddressSet();
    collectionInjection.getAddressMap();
    collectionInjection.getAddressProp();
  }

}
