package com.redweber.GowatrBackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "plutus")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plutus {
    @Id
    private Long id;
    private List<String> door_no;
    private List<Object> time;
    private List<Integer> last_month_tot;
    private List<Integer> current_month_tot;
    private List<Integer> last_tot;
}
