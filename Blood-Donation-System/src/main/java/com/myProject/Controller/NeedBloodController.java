package com.myProject.Controller;

import com.myProject.Model.NeedBloodModel;
import com.myProject.Service.NeedBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class NeedBloodController {

    @Autowired
    private NeedBloodService service;

    @GetMapping("/needs_bloods")
    public String showNeedsBList(Model model){
        List<NeedBloodModel> listNeedsBlood = service.listAll();
        model.addAttribute("listNeedsBlood", listNeedsBlood);

        return "all_needs_blood";
    }

    @PostMapping("/needs_bloods/search")
    public String searchNeedsBlood(@RequestParam String bloodGroup, Model model){
        List<NeedBloodModel> searchResults = service.findByBloodGroup(bloodGroup);
        model.addAttribute("listNeedsBlood", searchResults);

        return "all_needs_blood";
    }

    @GetMapping("/needs_blood/new")
    public String showNeedBloodForm(Model model){
        model.addAttribute("need-bloodModel", new NeedBloodModel());
        model.addAttribute("pageTitle", "Enter Details");

        return "need_blood_form";
    }

    @PostMapping("/needs_blood/save")
    public String saveNeedsBlood(NeedBloodModel needBloodModel, RedirectAttributes ra){
        service.save(needBloodModel);
        ra.addFlashAttribute("message", "Your details have been submitted Successfully");

        return "redirect:/needs_blood/new";
    }

}
