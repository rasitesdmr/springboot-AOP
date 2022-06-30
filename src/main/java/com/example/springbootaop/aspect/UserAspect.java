package com.example.springbootaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class UserAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.springbootaop.service.*.saveUser(..))")
    public void saveBefore(JoinPoint joinPoint) {
        logger.info("Kullanıcı bilgilerini giriniz  ");
        logger.info("{}", joinPoint);
    }

    @After("execution(* com.example.springbootaop.service.*.saveUser(..))")
    public void saveAfter(JoinPoint joinPoint) {
        logger.info("Kullanıcı  bilgileri girildi  ");
        logger.info("{}", joinPoint);
    }

    @AfterReturning(value = "execution(* com.example.springbootaop.service.*.saveUser(..))")
    public void saveAfterReturning(JoinPoint joinPoint) {
        logger.info("Advice başarıyla tamamlandı ");
        logger.info("{}", joinPoint);
    }

    @Before("execution(* com.example.springbootaop.service.*.updateUser(..))")
    public void updateBefore(JoinPoint joinPoint) {
        logger.info("Kullanıcı bilgileri güncelleyin : ");
        logger.info("{}", joinPoint);
    }

    @After("execution(* com.example.springbootaop.service.*.updateUser(..))")
    public void updateAfter(JoinPoint joinPoint) {
        logger.info("Kullanıcı  bilgileri güncellendi  ");
        logger.info("{}", joinPoint);
    }

    @Around(value = "execution(* com.example.springbootaop.service.*.*(..))", argNames = "pjp")
    public Object logExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("Anotasyon kullanıldı");
        logger.info("{}" , pjp);
        return pjp.proceed();
    }


}




