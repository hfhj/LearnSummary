package com.wangjian.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspIndexController {
    private static Logger logger = LoggerFactory.getLogger(JspIndexController.class);
    @RequestMapping("/jspIndex")
    public String jspIndex(){
        logger.info("now we at jspIndex");
        return "jspIndex";
    }
}
