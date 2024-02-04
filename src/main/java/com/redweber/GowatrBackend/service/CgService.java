package com.redweber.GowatrBackend.service;

import com.redweber.GowatrBackend.entity.CloudGraze;
import com.redweber.GowatrBackend.repository.CgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CgService implements GowatrService {

    @Autowired
    private CgRepository cgRepository;


    @Override
    public CloudGraze addData(CloudGraze data) {
        return cgRepository.save(data);
    }

    @Override
    public List<CloudGraze> getData() {
        return cgRepository.findAll();
    }

    @Override
    public void deleteData(Long id) {
        cgRepository.deleteById(id);
    }

    @Override
    public CloudGraze getDataById(Long id) {
        return cgRepository.findById(id).get();
    }
}
