package xmlinjection.dependencyinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("BeansDI.xml");

    TextEditor textEditor = (TextEditor) context.getBean("textEditor");
    textEditor.spellCheck();

    TextEditorNoConstructor textEditorNoConstructor = (TextEditorNoConstructor) context.getBean("textEditorNoConstructor");
    textEditorNoConstructor.spellCheck();
  }

}
