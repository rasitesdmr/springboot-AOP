# Aspect Oriented Programming ? 
<img src="https://github.com/rasitesdmr/springboot-AOP/blob/master/images/aop.png" width="75%" height="75%"/>

## Maven Dependencies 
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-aop</artifactId>
    </dependency>
</dependencies>
```

## Prerequisites

* AOP
* MySQL

## Used Technologies

* Spring Boot 2.7.1
* Spring Boot Validation
* Lombok
* Dev Tools
* MySQL
* Spring Boot AOP
* Spring Boot Jpa

## (AOP) ?
- Kaliteli kod yazarak projeyi geliştirmek için temelde kodun tekrar kullanılabilirliği  , 
okunabilirliği , modularity ve bakımının yapılabilirliği özelliklerine dikkat ederek uygulama
geliştirmemiz gerekiyor . 
+ Geliştirdiğimiz modüllerde ortak olarak kullandığımız bazı yapılar var bunlar ;
- Caching
- Exception Handling
- Logging
- Performance
- Transaction
-Validation 
+ Bu işler birer Cross Cutting Concerns 

## CROSS CUTTING CONCERNS ? 
+ Türkçe anlamı "Kesişen ilgiler" ya da "Çapraz Kesen İlgiler" diye geçmektedir. Cross Cutting Concerns denilmesinin 
sebebi katman bağımsız olması , Projenin istenilen yerinde kullanılması ile bulunduğu yerden soyutlanmış olmasından
kaynaklanmaktadır.

### @Before ? 
+ Bu tavsiye , joinPoints yöntemlerinin yürütülmesinden önce çalışır . Bu işlevsellik ,
önerilen yöntem çağrılmadan önce gerçekleşir.

### @After ? 
- Bu tavsiye , joinPoint yönteminin yürütülmesi tamamlandıktan sonra yürütülür . Bu işlevsellik , sonuca 
bakılmaksızın tavsiye yöntemi tamamlandıktan sonra gerçekleşir.

### @AfterReturning ? 
- Bu tavsiye yöntemi yalnızca joinPoints yöntemi normal şekilde yürütülürse yürütülür . Bu işlevsellik ,
tavsiye yöntemi başarıyla tamamlamndıktan sonra yürütülür.

### @AfterThrowing ? 
- Bu tavsiye, yalnızca birleştirme noktası yöntemi bir istisna oluşturduğunda yürütülür. 
- Bunu, işlemi bildirimsel olarak geri almak için kullanabiliriz.

### @Around ? 
- Önerilen yöntemi sarar, önerilen yöntem çağrılmadan önce ve sonra işlevsellik sağlar.



## @EnableAspectJAutoProxy(proxyTargetClass = true) 
- AspectJ'nin @Aspect işaretlenmiş bileşenlerin işlenmesi için  destek sağlar . 
- @Configuration ek açıklamasıyla birlikte kullanılır . 
- (proxyTargetClass = true ) özniteliğini kullanarak proxy türünü kontrol edebiliriz . Varsayılan değeri false dir. 




