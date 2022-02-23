package com.example.mybatisplus.web.controller;


import com.example.mybatisplus.common.utls.SecurityUtils;
import com.example.mybatisplus.common.utls.SessionUtils;
import com.example.mybatisplus.service.FileService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/file")
@Slf4j
public class FileController {
    protected FileService fileService;

    protected ResourceLoader resourceLoader;

    public FileController(FileService fileService, ResourceLoader resourceLoader) {
        this.fileService = fileService;
        this.resourceLoader = resourceLoader;
    }

    @ApiOperation(value = "文件上传", notes = "文件上传")
    @PostMapping(value = "/upload")
    public ResponseEntity<Map<String, String>> upload(MultipartFile file, HttpServletRequest request) throws IOException {
        Map<String, String> map = new HashMap();
        if (SecurityUtils.getCurrentUserInfo() == null) {
            map.put("message", "请登录后重试");
            return ResponseEntity.badRequest().body(map);
        }
        map = fileService.upload(file);
        return ResponseEntity.ok().body(map);
    }

    @PostMapping(value = "/uploadImg")
    public Map uploadImg(MultipartFile file, HttpServletRequest request) throws IOException{
        Map upload = fileService.upload(file);
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "上传成功");
        map2.put("src", upload.get("url"));
        map.put("data", map2);
        return map;
    }


    private static String suffix(String fileName) {
        int i = fileName.lastIndexOf('.');
        return i == -1 ? "" : fileName.substring(i + 1);
    }

}
