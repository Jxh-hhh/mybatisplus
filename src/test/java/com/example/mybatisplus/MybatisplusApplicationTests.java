package com.example.mybatisplus;

import com.example.mybatisplus.model.domain.Admin;
import com.example.mybatisplus.model.domain.BatchSetting;
import com.example.mybatisplus.service.AdminService;
import com.example.mybatisplus.service.BatchSettingService;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private AdminService adminService;
    @Autowired
    private BatchSettingService batchSettingService;
    @Test
    void contextLoads() {
        Admin byId = adminService.getById(1);
        System.out.println(byId);
    }


    @Test
    void testObject() {

    }

}
