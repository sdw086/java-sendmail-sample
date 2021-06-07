package com.main;

import com.main.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    @Resource(name="mainService")
	private MainService mainService;

    @RequestMapping(value="/main")
    public String main(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "main/main";
    }

    @RequestMapping(value="/emailProc")
    public String emailProc(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {

        Map<String, Object> requestMap = new HashMap<String, Object>();

        requestMap.put("from", request.getParameter("from"));
        requestMap.put("to", request.getParameter("to"));
        requestMap.put("subject", request.getParameter("subject"));
        requestMap.put("contents", request.getParameter("contents"));

        mainService.setEmailSend(requestMap);


        return "redirect:/main";
    }
}
