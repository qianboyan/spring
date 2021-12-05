package javainjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TextEditorConfig {
  @Bean
  public TextEditor textEditor(){
    return new TextEditor(spellChecker());
  }

  @Bean
  @Scope("prototype")
  public SpellChecker spellChecker(){
    return new SpellChecker("DE");
  }

}
