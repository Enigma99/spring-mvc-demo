package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // new a controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from the HTML form
        String name = request.getParameter("studentName");

        // convert the data to all caps
        name = name.toUpperCase();

        // create the message
        String theResult = "Yo, " + name;

        // add message to the model -- name/value pair
        model.addAttribute("message", theResult);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name,
                                          Model model){

        // convert the data to all caps
        name = name.toUpperCase();

        // create the message
        String theResult = "Hey My Friend v3! , " + name;

        // add message to the model -- name/value pair
        model.addAttribute("message", theResult);

        return "helloworld";
    }
}
