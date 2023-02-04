package com.testsalt.controllers;


import com.testsalt.entity.Konsumen;
import com.testsalt.service.konsumenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("")
public class HomeController {

    @Resource(name="konsumenServiceImp")
    konsumenService KonsumenService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model)
    {
        String a = "ABC";
        model.addAttribute("konsumen", KonsumenService.findAll());
        return "index";
    }

    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public String add(HttpServletRequest req) {
        List tickets = KonsumenService.findAll();
        return "index";
    }
    @RequestMapping(value = "/createPage", method = RequestMethod.GET)
    public String createPage(Model model) {
        model.addAttribute("konsumen", new Konsumen());
        model.addAttribute("pageTitle", "Create Ticket");
        model.addAttribute("formAction", "/create");
        return "add";
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@ModelAttribute("konsumen") Konsumen konsumen, Model model) {
        Date date = new Date();
        konsumen.setTgl_registrasi(String.valueOf(date));
        KonsumenService.save(konsumen);
        List konsumens = KonsumenService.findAll();
        model.addAttribute("konsumens", konsumens);
        return "index";
    }
    @RequestMapping(value = "/updatePage", method = RequestMethod.GET)
    public String updatePage(HttpServletRequest req) {
        Integer konsumenId = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("konsumen", KonsumenService.findbyId(konsumenId));
        req.setAttribute("pageTitle", "Update Ticket");
        req.setAttribute("formAction", "/update");
        return "add";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("konsumen") Konsumen konsumen, Model model) {
        Date date = new Date();
        konsumen.setTgl_registrasi(String.valueOf(date));
        KonsumenService.update(konsumen);
        List konsumens = KonsumenService.findAll();
        model.addAttribute("konsumens", konsumens);
        return "index";
    }
    @RequestMapping(value = "/deletePage", method = RequestMethod.GET)
    public String deletePage(HttpServletRequest req) {
        Integer konsumenId = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("konsumen", KonsumenService.findbyId(konsumenId));
        req.setAttribute("pageTitle", "Delete Konsumen");
        req.setAttribute("formAction", "/delete");
        return "add";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(HttpServletRequest req) {
        Integer ticketId = Integer.valueOf(req.getParameter("id"));
        Konsumen konsumen = KonsumenService.findbyId(ticketId).get();
        KonsumenService.delete(konsumen);
        List konsumens = KonsumenService.findAll();
        req.setAttribute("konsumens", konsumens);
        return "index";
    }

}
