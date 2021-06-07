package com.common.util;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Map;
import java.util.Properties;

public class SendMail {

    public String setMainSander(Map<String,Object> mapList) throws Exception {

        try {
            JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

            /* localhost stmp*/
            javaMailSender.setHost("localhost");   // 주소
            javaMailSender.setPort(25); // 포트번호

            /* gmail smtp*/
            /*
            javaMailSender.setHost("smtp.gmail.com"); // 메일서버
            javaMailSender.setPort(587); //포트
            javaMailSender.setUsername("id@domain"); //id
            javaMailSender.setPassword("pssword"); // pw
            Properties prop = new Properties(); // 프로퍼티스
            prop.setProperty("mail.smtp.auth", "true"); // 인증서
            prop.setProperty("mail.smtp.starttls.enable", "true"); // 인증서
            javaMailSender.setJavaMailProperties(prop);
             */

            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");

            mimeMessageHelper.setFrom((String) mapList.get("from"));
            mimeMessageHelper.setTo((String) mapList.get("to"));
            mimeMessageHelper.setSubject((String) mapList.get("subject"));
            mimeMessageHelper.setText((String) mapList.get("contents"), true);

            // 파일 첨부! 향후 조작 필요.
            FileSystemResource file = new FileSystemResource(new File("C:\\work\\project\\source\\210603_test-sendmail-class\\test.txt"));
            mimeMessageHelper.addAttachment("test.txt", file);

            javaMailSender.send(mimeMessage);

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

        return "ok";
    }
}
