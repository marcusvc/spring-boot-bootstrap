package edu.marcus.springboot.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.marcus.springboot.model.Greeting;

@Controller
public class GreetingController {
	
    private final AtomicLong COUNTER = new AtomicLong();

    @GetMapping({"/", "/greeting"})
    public String getMethod(Model model) {
    	model.addAttribute("greeting", new Greeting());
        return "input";
    }
    
    @PostMapping("/greeting")
    public String postMethod(@Validated @ModelAttribute Greeting greeting, BindingResult bindingResult) {
    	if (bindingResult.hasErrors()) {
    		return "input";
    	}
    	greeting.setId(COUNTER.incrementAndGet());
        return "result";
    }

}
