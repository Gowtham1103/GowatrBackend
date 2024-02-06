package com.redweber.GowatrBackend.controller;

import com.redweber.GowatrBackend.entity.PlutusTotal;
import com.redweber.GowatrBackend.service.PlutusService;
import com.redweber.GowatrBackend.service.PlutusTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pl.tot")
public class PlutusTotalController {
    @Autowired
    private PlutusTotalService plutusTotalService;

    @PostMapping("/post")
    public PlutusTotal postPlutusTotal(@RequestBody PlutusTotal data){
        return plutusTotalService.postPlutusTotal(data);
    }
    @GetMapping("/get")
    public List <PlutusTotal> getPlutusTotal(){
        return plutusTotalService.getPlutusTotal();
    }
    @DeleteMapping("/delete/{id}")
    public String deletePlutusTotal(@PathVariable("id") Long id){
        plutusTotalService.deletePlutusTotal(id);
        return "Data Deleted Successfully ! ";
    }
}
