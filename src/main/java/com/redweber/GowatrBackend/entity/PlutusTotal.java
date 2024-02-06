package com.redweber.GowatrBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "PlutusTotal")
public class PlutusTotal {
    @Id
    private Long id;
    private Long tot;
}
