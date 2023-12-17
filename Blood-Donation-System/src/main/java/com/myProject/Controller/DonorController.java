package com.myProject.Controller;

import com.myProject.DonorNotFoundException;
import com.myProject.Model.DonorModel;
import com.myProject.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class DonorController {

    @Autowired
    public DonorService service;

    @GetMapping("/donors")
    public String showDonorsList(Model model){
        List<DonorModel> listDonors = service.listAll();
        model.addAttribute("listDonors", listDonors);

        return "all_donors";
    }

    @GetMapping("/donors/new")
    public String showNewDonorForm(Model model){
        model.addAttribute("donorModel", new DonorModel());
        model.addAttribute("pageTitle", "Add New Donor");

        return "donor_form";
    }

    @PostMapping("/donors/save")
    public String saveDonor(DonorModel donorModel, RedirectAttributes ra){
        service.save(donorModel);

        ra.addFlashAttribute("message", "The donor has been added successfully.");

        return "redirect:/donors";
    }

    @GetMapping("/donors/update/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra){
        try{
            DonorModel donorModel = service.get(id);
            model.addAttribute("donorModel", donorModel);
            model.addAttribute("pageTitle", "Edit Donor (ID: " + id +")");

            return "donor_form";
        }catch (DonorNotFoundException e){
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/donors";
        }
    }

    @GetMapping("/donors/delete/{id}")
    public String deleteDonor(@PathVariable("id") Integer id, RedirectAttributes ra) {
        try{
            service.delete(id);
            ra.addFlashAttribute("message", "The Donor ID " + id + " has been deleted Successfully.");
        } catch (DonorNotFoundException e){
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/donors";
        }
    }

