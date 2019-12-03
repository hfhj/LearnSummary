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
    @RequestMapping("/index")
    public String Index(){
        logger.info("now we at Index");
        return "index";
    }

    @RequestMapping("/icon-fontawesome")
    public String iconFontawesome(){
        logger.info("now we at icon-fontawesome");
        return "icon-fontawesome";
    }

    @RequestMapping("/pages-blank")
    public String pagesBlank(){
        logger.info("now we at pages-blank");
        return "pages-blank";
    }

    @RequestMapping("/pages-error-404")
    public String pagesError404(){
        logger.info("now we at pages-error-404");
        return "pages-error-404";
    }

    @RequestMapping("/pages-profile")
    public String pagesProfile(){
        logger.info("now we at pages-profile");
        return "pages-profile";
    }

    @RequestMapping("/table-basic")
    public String tableBasic(){
        logger.info("now we at table-basic");
        return "table-basic";
    }
}
