package javainjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    // Variante 1
    // ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class, TextEditorConfig.class);
    // Variante 2
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(StudentConfig.class);
    context.register(TextEditorConfig.class);
    context.refresh();
    Student student = context.getBean(Student.class);

    student.setFach("Maschinenbau");
    student.getFach();

    TextEditor textEditor = context.getBean(TextEditor.class);
    textEditor.spellCheck();
  }

}
