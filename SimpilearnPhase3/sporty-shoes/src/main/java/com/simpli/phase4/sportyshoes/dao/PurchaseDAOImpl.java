package com.simpli.phase4.sportyshoes.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simpli.phase4.sportyshoes.entity.Purchase;
import com.simpli.phase4.sportyshoes.repo.PurchaseRepository;

@Repository
@Transactional
public class PurchaseDAOImpl implements PurchaseDAO {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public List<Purchase> fetchAllPurchase() {
        return purchaseRepository.findAll();
    }

}
