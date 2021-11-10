package xmlinjection.hellocountries;

public class HelloWorldSingleton {
  private String message;

  public void getMessage(){
    System.out.println("Your Message : " + message);
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
