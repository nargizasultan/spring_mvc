package com.peaksoft.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.rmi.MarshalledObject;

@org.springframework.stereotype.Controller
@RequestMapping("/employee")
public class Controller {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }


    @RequestMapping("askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails(@RequestParam("EmployeeName") String empName, Model model) {
        empName = "Hello " + empName;
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";

    }


}
