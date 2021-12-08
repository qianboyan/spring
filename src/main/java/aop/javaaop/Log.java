package aop.javaaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {
  @Pointcut("execution(* aop.javaaop.*.*(..))")
  private void selectAll(){}

  @Before("selectAll()")
  public void beforeAdvice(){
    System.out.println("Going to setup student profile from annotation.");
  }

  @After("selectAll()")
  public void afterAdvice(){
    System.out.println("after advice.");
  }

  @AfterReturning(pointcut = "selectAll()", returning = "retVal")
  public void doAfterReturningTask(Object retVal){
    System.out.println("Returning from afterReturning.");
  }

  @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
  public void doAfterThrowingTask(Exception ex){
    System.out.println("throwing something");
  }

  // @Around("selectAll()")
  public String doAroundTask(ProceedingJoinPoint jp) throws Throwable{
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
