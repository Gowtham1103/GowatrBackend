package com.redweber.GowatrBackend.controller;
import com.redweber.GowatrBackend.entity.Plutus;
import com.redweber.GowatrBackend.service.PlutusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api.pl")
@CrossOrigin("*")
public class PlutusController {
    @Autowired
    private PlutusService plutusService;

    @PostMapping("/postdata")
    public Plutus postData(@RequestBody Plutus data){
        return plutusService.postData(data);
    }

    @GetMapping("/getdata")
    public List<Plutus> getData(){
        return plutusService.getData();
    }

    @GetMapping("/getdata/{id}")
    public Plutus getDataById(@PathVariable("id") Long id){
        return plutusService.getDataById(id);
    }
    @DeleteMapping("/deletedata/{id}")
    public String deleteDataById(@PathVariable("id") Long id){
        plutusService.deleteDataById(id);
        return "Data Deleted Sucessfully !";
    }
}

