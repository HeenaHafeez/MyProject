package com.simpli.phase4.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simpli.phase4.sportyshoes.entity.Purchase;
import com.simpli.phase4.sportyshoes.service.PurchaseService;

@Controller
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping(value = "/purchase-history")
    public String viewPurchaseHistory(Model model) {
        List<Purchase> purchaseList = purchaseService.fetchAllPurchase();

        model.addAttribute("purchaseList", purchaseList);
        return "purchase-history";
    }
}
