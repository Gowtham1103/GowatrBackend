package com.redweber.GowatrBackend.service;

import com.redweber.GowatrBackend.entity.PlutusTotal;
import com.redweber.GowatrBackend.repository.PlutusTotalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlutusTotalService {
    @Autowired
    private PlutusTotalRepository plutusTotalRepository;

    public PlutusTotal postPlutusTotal(PlutusTotal data) {
        return plutusTotalRepository.save(data);
    }

    public List <PlutusTotal> getPlutusTotal() {
        return plutusTotalRepository.findAll();
    }

    public void deletePlutusTotal(Long id) {
        plutusTotalRepository.deleteById(id);
    }
}
