package com.redweber.GowatrBackend.controller;

import com.redweber.GowatrBackend.entity.CloudGraze;
import com.redweber.GowatrBackend.service.CgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api.cg")
@CrossOrigin("*")
public class CgController {
    @Autowired
    private CgService cgService;

    @PostMapping("/postdata")
    public CloudGraze addData(@RequestBody CloudGraze data){
        return cgService.addData(data);
    }
    @GetMapping("/getdata")
    public List <CloudGraze> getData(){
        return cgService.getData();
    }
    @DeleteMapping("/deletedata/{id}")
    public String deleteData(@PathVariable("id") Long id){
        cgService.deleteData(id);
        return "data successfully deleted !";
    }
    @GetMapping("/getdata/{id}")
    public CloudGraze getDataById(@PathVariable("id") Long id){
        return cgService.getDataById(id);
    }
}
