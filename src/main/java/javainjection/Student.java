package javainjection;

public class Student {
  private String fach;

  public void getFach() {
    System.out.println(this.fach);
  }

  public void setFach(String fach) {
    this.fach = fach;
  }

  public void init() {
    System.out.println("init phase");
  }

  public void cleanup() {
    System.out.println("clean up phase");
  }
}
