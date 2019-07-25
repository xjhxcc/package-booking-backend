package com.oocl.packagebooking.model;

import javax.persistence.*;

@Entity
public class PackageOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String packageId;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String tel;
    @Column(nullable = false)
    private int packageStatus;
    private String preTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(int packageStatus) {
        this.packageStatus = packageStatus;
    }

    public String getPreTime() {
        return preTime;
    }

    public void setPreTime(String preTime) {
        this.preTime = preTime;
    }

    public PackageOrder(String packageId, String username, String tel, int packageStatus, String preTime) {
        this.packageId = packageId;
        this.username = username;
        this.tel = tel;
        this.packageStatus = packageStatus;
        this.preTime = preTime;
    }

    public PackageOrder() {
    }
}
