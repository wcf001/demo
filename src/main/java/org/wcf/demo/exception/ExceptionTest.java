/*
package org.wcf.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping(value = "error",method = RequestMethod.GET)
public class ExceptionTest implements ErrorController {
    private static final Logger logger=LoggerFactory.getLogger(ExceptionTest.class);

    @Override
    public String getErrorPath() {
        ModelMap modelMap=new ModelMap();
        logger.info("出错啦！进入自定义错误控制器");
        modelMap.addAttribute("title","hahah");
        modelMap.addAttribute("timestamp",new Date());
        return "error";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }
}
*/
