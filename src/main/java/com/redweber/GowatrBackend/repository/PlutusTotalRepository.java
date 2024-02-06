package com.redweber.GowatrBackend.repository;

import com.redweber.GowatrBackend.entity.PlutusTotal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlutusTotalRepository extends MongoRepository<PlutusTotal,Long> {
}
