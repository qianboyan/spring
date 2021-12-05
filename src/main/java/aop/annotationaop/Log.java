package aop.annotationaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {
  @Pointcut("execution(* aop.annotationaop.*.*(..))")
  private void selectAll(){}

  @Before("selectAll()")
  public void beforeAdvice(){
    System.out.println("Going to setup student profile from annotation.");
  }
}
