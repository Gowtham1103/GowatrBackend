package com.redweber.GowatrBackend.service;

import com.redweber.GowatrBackend.entity.CloudGraze;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GowatrService {
    CloudGraze addData(CloudGraze data);
    public List <CloudGraze> getData();
    public void deleteData(Long id);

    public CloudGraze getDataById(Long id);

}
