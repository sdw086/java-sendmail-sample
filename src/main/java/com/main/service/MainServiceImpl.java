package com.main.service;

import com.common.util.SendMail;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("mainService")
public class MainServiceImpl implements MainService{

    @Override
    public String setEmailSend(Map<String, Object> requestMap) {

        // 메일 선언
        SendMail mailSender = new SendMail();
        String mailresult = null;

        try {
            mailresult = mailSender.setMainSander(requestMap);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return mailresult;
    }
}
