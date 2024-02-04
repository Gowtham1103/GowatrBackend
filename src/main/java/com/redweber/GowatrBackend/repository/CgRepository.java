package com.redweber.GowatrBackend.repository;

import com.redweber.GowatrBackend.entity.CloudGraze;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CgRepository extends MongoRepository<CloudGraze,Long> {
}
