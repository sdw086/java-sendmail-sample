# Senmail 처리 작업

## 작업환경
* 인텔리j
* spring4.2.4

## 코드설명
* Spring에서 메일 처리 코드

* 메일 보내는 클래스 위치
[/src/main/java/com/common/util/SendMail.java](https://github.com/sdw086/java-sendmail/blob/main/src/main/java/com/common/util/SendMail.java) 로컬 및 gmail 기준 샘플구현

        /* localhost stmp*/
        javaMailSender.setHost("localhost");   // 주소
        javaMailSender.setPort(25); // 포트번호

        /* gmail smtp*/         
        javaMailSender.setHost("smtp.gmail.com"); // 메일서버
        javaMailSender.setPort(587); //포트
        javaMailSender.setUsername("id@domain"); //id
        javaMailSender.setPassword("pssword"); // pw
        Properties prop = new Properties(); // 프로퍼티스
        prop.setProperty("mail.smtp.auth", "true"); // 인증서
        prop.setProperty("mail.smtp.starttls.enable", "true"); // 인증서
        javaMailSender.setJavaMailProperties(prop);            
        
