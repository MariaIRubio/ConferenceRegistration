package com.exercise.conferenceregistration.controller;

import com.exercise.conferenceregistration.entity.Attendee;
import com.exercise.conferenceregistration.repo.AttendeeRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ConferenceController {

    @Autowired
    private AttendeeRepo attendeeRepo;

    @GetMapping ("/conferenceregistration")
    public String registration(Model model){
        model.addAttribute("attendee", new Attendee());
        return"registration-form";
    }

    @PostMapping("/processForm")
    public String process(@Valid @ModelAttribute("attendee") Attendee attendee, BindingResult binder){
        if(binder.hasErrors()){
            return "registration-form";
        }else{
            attendeeRepo.save(attendee);
            return "confirmation";
        }
    }

    @RequestMapping("/viewParticipants")
    public String displayParticipants(Model model){
    List<Attendee> attendeeList = attendeeRepo.findAll();
    model.addAttribute("attendeeList", attendeeList);
    return "participants";
    }
}
