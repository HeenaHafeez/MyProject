package com.simpli.phase4.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.phase4.sportyshoes.dao.PurchaseDAO;
import com.simpli.phase4.sportyshoes.entity.Purchase;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseDAO purchaseDAO;

    @Override
    public List<Purchase> fetchAllPurchase() {
        return purchaseDAO.fetchAllPurchase();
    }

}
