package com.redweber.GowatrBackend.controller;

import com.redweber.GowatrBackend.entity.CgTotal;
import com.redweber.GowatrBackend.service.CgTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cg.tot")
@CrossOrigin("*")
public class CgTotalController {
    @Autowired
    private CgTotalService cgTotalService;

    @PostMapping("/post")
    public CgTotal postCgTotal(@RequestBody CgTotal data){
        return cgTotalService.postCgTotal(data);
    }
    @GetMapping("/get")
    public List <CgTotal> getCgTotal(){
        return cgTotalService.getCgTotal();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCgTotal(@PathVariable("id") Long id){
        cgTotalService.deleteCgTotal(id);
        return "Data Deleted Successfully ! ";
    }
}
