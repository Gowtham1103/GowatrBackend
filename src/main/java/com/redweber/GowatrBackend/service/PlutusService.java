package com.redweber.GowatrBackend.service;

import com.redweber.GowatrBackend.entity.Plutus;
import com.redweber.GowatrBackend.repository.PlutusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlutusService {
    @Autowired
    private PlutusRepository plutusRepository;

    public Plutus postData(Plutus data) {
        return plutusRepository.save(data);
    }

    public List<Plutus> getData() {
        return plutusRepository.findAll();
    }

    public Plutus getDataById(Long id) {
        return plutusRepository.findById(id).get();
    }

    public void deleteDataById(Long id) {
        plutusRepository.deleteById(id);
    }
}
