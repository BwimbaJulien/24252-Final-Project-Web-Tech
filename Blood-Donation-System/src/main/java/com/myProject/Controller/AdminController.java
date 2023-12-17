package com.myProject.Controller;

import com.myProject.Model.AdminModel;
import com.myProject.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

    @Autowired
    private AdminService service;

    @GetMapping("/admins/new")
    public String showSignUpForm(Model model){
        model.addAttribute("adminModel", new AdminModel());
        model.addAttribute("pageTitle", "Add New Admin");
        return "signup_form";
    }

    @PostMapping("/admins/save")
    public String saveAdmin(AdminModel adminModel, RedirectAttributes ra){
        service.save(adminModel);
        ra.addFlashAttribute("message", "You're Signed Up Successfully !");
        return "login_form";
    }

    @GetMapping("/admins/login")
    public String showLoginForm(Model model){
        AdminModel adminModel = new AdminModel();
        model.addAttribute("adminModel", adminModel);
        return "login_form";
    }

    @PostMapping("/admins/login/save")
    public String adminLogin(Model model, AdminModel adminModel, RedirectAttributes ra){
        AdminModel savedAdmin = service.findAdminByPassword(adminModel.getPassword());

        if (savedAdmin != null && savedAdmin.getPassword().equals(adminModel.getPassword())){
            //Password is correct
            return "admin_dash";
        } else {
            // Wrong Password or user not found
            ra.addFlashAttribute("message", "Invalid Credentials");
            return "redirect:/admins/login";
        }

    }
}
