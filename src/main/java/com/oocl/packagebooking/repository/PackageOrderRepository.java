package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.PackageOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PackageOrderRepository extends JpaRepository<PackageOrder,Integer> {
    List<PackageOrder> findByPackageStatus(int packageStatus);
    @Transactional
    @Modifying
    @Query("update PackageOrder set packageStatus=2, preTime = null where packageId=:packageId")
    int updateByPackageStatus(@Param("packageId")String packageId);
    @Transactional
    @Modifying
    @Query("update PackageOrder set preTime=:preTime, packageStatus=1 where packageId=:packageId")
    int  updateByPreTime(@Param("preTime") String preTime,@Param("packageId")String packageId);
}
