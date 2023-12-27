package com.example.springrest.service.impl;

import com.example.springrest.entities.Product;
import com.example.springrest.persistence.IProductDAO;
import com.example.springrest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDAO iproductDAO;
    @Override
    public List<Product> findAll() {
        return iproductDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iproductDAO.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return iproductDAO.findByPriceInRange(minPrice,maxPrice);
    }

    @Override
    public void save(Product product) {
        iproductDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        iproductDAO.deleteById(id);
    }
}
