package com.javabackendsnippets.github.javabackendsnippets.RESTfulAPIs;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/getObject")
    public ResponseEntity<Object> getObject() {
        return ResponseEntity.ok("API Object");
    }

    @PostMapping("/postObject")
    public void postObject(@RequestBody RequestBodyObject requestBodyObject) {
        System.out.println(requestBodyObject.getMessage());
    }

}
