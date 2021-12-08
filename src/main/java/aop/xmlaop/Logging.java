package aop.xmlaop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {
  public void beforeAdvice() {
    System.out.println("Going to setup student profile.");
  }

  public void afterAdvice() {
    System.out.println("Student profile has been setup.");
  }

  public void afterReturningAdvice(Object retVal){
    System.out.println("Returning:" + retVal.toString() );
  }

  public void AfterThrowingAdvice(IllegalArgumentException ex) {
    System.out.println("There has been an exception: " + ex.toString());
  }

  public String aroundAdvice(ProceedingJoinPoint jp) throws Throwable{
    System.out.println("Around advice");
    Object[] args = jp.getArgs();
    if(args.length>0){
      System.out.print("Arguments passed: " );
      for (int i = 0; i < args.length; i++) {
        System.out.print("arg "+(i+1)+": "+args[i]);
      }
    }
    Object result = jp.proceed(args);
    System.out.println("Returning " + result);
    return result.toString();
  }

}
