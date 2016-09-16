package com.vlad3.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Влад on 7/27/2016.
 */

/*@Controller
public class HomeController {
    @RequestMapping (value = "/")
    public String home()
    {
        return "test";
    }
}*/

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping (method= RequestMethod.GET)
    public String printWelcome(ModelMap model)
    {
        model.addAttribute("message","Hello world!");
        return "hello";
    }
}
