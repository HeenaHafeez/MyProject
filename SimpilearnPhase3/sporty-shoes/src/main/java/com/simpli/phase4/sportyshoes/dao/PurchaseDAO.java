package com.simpli.phase4.sportyshoes.dao;

import java.util.List;

import com.simpli.phase4.sportyshoes.entity.Purchase;

public interface PurchaseDAO {

    List<Purchase> fetchAllPurchase();

}
