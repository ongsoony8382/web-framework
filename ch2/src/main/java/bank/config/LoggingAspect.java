package bank.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* bank.service.AccountCreateService.*(..)) || " +
            "execution(* bank.service.TransactionService.*(..))")
    public void before(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        System.out.println(
                className + "." + methodName
                        + ": 호출 시간 = " + LocalDateTime.now()
        );
    }

    @AfterReturning(
            pointcut = "execution(* bank.service.AccountCreateService.*(..)) || " +
            "execution(* bank.service.TransactionService.*(..))",
            returning = "retVal")
    public void afterReturning(Object retVal) {
        System.out.println("return 값 = " + retVal);
    }
}
