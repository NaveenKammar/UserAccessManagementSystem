package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.Request;
import com.example.demo.ServiceImpl.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {
	@Autowired 
    private RequestService requestService;

    @GetMapping("/submit")
    public String showRequestForm(Model model) {
        model.addAttribute("request", new Request());
        return "requestAccess";
    }

    @PostMapping("/submit")
    public String submitRequest(@ModelAttribute Request request) {
        requestService.submitRequest(request);
        return "redirect:/dashboard";
    }
}
