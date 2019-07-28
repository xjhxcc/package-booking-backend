package com.oocl.packagebooking.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc()
public class PackageOrderControlerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_packageOrders_when_call_findAllPackageOrder() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/packageOrders")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
    @Test
    public void should_return_packageOrders_when_call_findByPackageStatus() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/packageOrders/1")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
    @Test
    public void should_return_packageOrders_when_call_addOrder() throws Exception {
        String para="{}";
        mockMvc.perform(MockMvcRequestBuilders.patch("/packageOrders")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
    @Test
    public void should_return_packageOrders_when_call_updatePackageStatus() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("packageStatus//packageOrders/123456")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
    @Test
    public void should_return_packageOrders_when_call_updateByPreTime() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("preTime/packageOrders/2019-07-25 12:25:03/123456")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }


}
