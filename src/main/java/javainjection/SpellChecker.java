package javainjection;

public class SpellChecker {
  private String lang;

  public SpellChecker(String lang){
    this.lang = lang;
    System.out.println("Inside SpellChecker constructor." );
    System.out.println("Language for this is: " + lang);
  }

  public void checkSpelling() {
    System.out.println("Inside checkSpelling." );
  }

}
