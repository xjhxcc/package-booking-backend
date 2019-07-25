package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.PackageOrder;
import com.oocl.packagebooking.service.PackageOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packageOrders")
public class PackageOrderController {
    @Autowired
    private PackageOrderService packageOrderService;
    @PostMapping
    public PackageOrder addOrder(@RequestBody PackageOrder packageOrder){
        return packageOrderService.addPackageOrder(packageOrder);
    }
    @GetMapping
    public List<PackageOrder> findAllPackageOrder(){
        return packageOrderService.findAllPackageOrder();
    }
    @GetMapping(path="/{packageStatus}")
    public List<PackageOrder> findByStatus(@PathVariable int packageStatus){
        return packageOrderService.findByStatus(packageStatus);
    }
}
