package com.redweber.GowatrBackend.repository;

import com.redweber.GowatrBackend.entity.Plutus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlutusRepository extends MongoRepository<Plutus,Long> {
}
