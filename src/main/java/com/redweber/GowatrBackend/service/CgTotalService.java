package com.redweber.GowatrBackend.service;

import com.redweber.GowatrBackend.entity.CgTotal;
import com.redweber.GowatrBackend.repository.CgTotalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CgTotalService {
    @Autowired
    private CgTotalRepository cgTotalRepository;

    public CgTotal postCgTotal(CgTotal data) {
        return cgTotalRepository.save(data);
    }

    public List<CgTotal> getCgTotal() {
        return cgTotalRepository.findAll();
    }

    public void deleteCgTotal(Long id) {
        cgTotalRepository.deleteById(id);
    }
}
