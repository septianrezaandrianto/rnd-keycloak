package com.rnd.belajar_keycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/doTestUser")
    @PreAuthorize("hasRole('client_user')")
    public ResponseEntity<?> doTestUser() {
        return ResponseEntity.ok("Controller doTestUser() OK!");
    }

    @GetMapping("/doTestAdmin")
    @PreAuthorize("hasRole('client_admin')")
    public ResponseEntity<?> doTestAdmin() {
        return ResponseEntity.ok("Controller doTestAdmin() OK!");
    }

}
