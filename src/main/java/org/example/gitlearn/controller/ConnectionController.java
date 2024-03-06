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
        System.out.println("this is v2 version");

        return ResponseEntity.ok("success, this is v2 version!");
    }
    @GetMapping("/v3")
    public ResponseEntity getV3(){
        System.out.println("this is v3 version");

        return ResponseEntity.ok("success, this is v3 version!");
    }
    @GetMapping("/v4")
    public ResponseEntity getV4(){
        System.out.println("this is v4 version");
        System.out.println("v4 is better!");
        return ResponseEntity.ok("success, this is v4 version!");
    }
    @GetMapping("/v5")
    public ResponseEntity getV5(){
        System.out.println("this is v5 version");
        System.out.println("v5 is better!");
        System.out.println("there is something new in v5");
        return ResponseEntity.ok("success, this is v5 version!");
    }
    @GetMapping("/v6")
    public ResponseEntity getV6(){
        System.out.println("this is v6 version");

        System.out.println("this is the change in main branch");

        System.out.println("this is change in feature2 branch");

        System.out.println("this is the second change in feature2 branch");

        return ResponseEntity.ok("success, this is v6 version!");
    }

}
