package xmlinjection.dependencyinject;

public class TextEditorNoConstructor {
  private SpellChecker spellChecker;
  private Printer printer;

  public void setPrinter(Printer printer) {
    this.printer = printer;
  }

  public void setSpellChecker(SpellChecker spellChecker) {
    System.out.println("Inside setSpellChecker." );
    this.spellChecker = spellChecker;
  }

  public SpellChecker getSpellChecker() {
    return spellChecker;
  }

  public void spellCheck() {
    spellChecker.checkSpelling();
  }

}
