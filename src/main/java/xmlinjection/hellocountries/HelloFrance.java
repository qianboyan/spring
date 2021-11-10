package xmlinjection.hellocountries;

public class HelloFrance {
  private String message;
  private String message1;
  private String message2;
  private String message3;

  public void setMessage(String message) {
    this.message = message;
  }

  public void setMessage1(String message1) {
    this.message1 = message1;
  }

  public void setMessage2(String message2) {
    this.message2 = message2;
  }

  public void setMessage3(String message3) {
    this.message3 = message3;
  }

  public void getMessage(){
    System.out.println("France Message : " + message);
  }

  public void getMessage1(){
    System.out.println("France Message1 : " + message1);
  }

  public void getMessage2(){
    System.out.println("France Message2 : " + message2);
  }

  public void getMessage3(){
    System.out.println("France Message3 : " + message3);
  }

}
