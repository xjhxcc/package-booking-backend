package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.PackageOrder;
import com.oocl.packagebooking.repository.PackageOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageOrderService {
    private List<PackageOrder> packageOrderList=new ArrayList<>();
    PackageOrder packageOrder =new PackageOrder("61111","张三","18855565",1,"20190725");

    @Autowired
    private PackageOrderRepository packageOrderRepository;
    public  PackageOrder addPackageOrder(PackageOrder packageOrder){
        return packageOrderRepository.save(packageOrder);
    }
    public List<PackageOrder> findAllPackageOrder(){
        packageOrderList.add(packageOrder);
        return packageOrderRepository.findAll();
    }
//    public List<PackageOrder> findByStatus(String packageStatus){
//        return packageOrderRepository.findByPackageStatus();
//    }

}
