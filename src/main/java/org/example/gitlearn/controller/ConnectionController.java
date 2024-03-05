package org.example.gitlearn.controller;

import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLEngineResult;

@RestController
@RequestMapping("/connection")
public class ConnectionController {
    @GetMapping("/v1")
    public ResponseEntity getV1(){
        System.out.println("this is v1 version");

        return ResponseEntity.ok("success, this is v1 version!");
    }
    @GetMapping("/v2")
    public ResponseEntity getV2(){
        System.out.println("this is v1 version");

        return ResponseEntity.ok("success, this is v1 version!");
    }
}
