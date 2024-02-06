package com.redweber.GowatrBackend.repository;

import com.redweber.GowatrBackend.entity.CgTotal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CgTotalRepository extends MongoRepository<CgTotal,Long> {
}
