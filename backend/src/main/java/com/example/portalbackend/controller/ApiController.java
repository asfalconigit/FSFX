package com.example.portalbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ApiController {

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/api/beneficiaries")
    public List<Map<String, Object>> beneficiaries() {
        return List.of(
            Map.of("name", "Ademar Gonçalves de Castro", "card", "U9731511352A00RE", "status", "Ativo"),
            Map.of("name", "Adriana Sorranto Vieira Silva", "card", "U9731511356600RE", "status", "Pendente")
        );
    }

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody Map<String,String> body) {
        String cnpj = body.getOrDefault("cnpj", "");
        String password = body.getOrDefault("password", "");
        if (("12.345.678/0001-99".equals(cnpj) || "ADMIN".equalsIgnoreCase(cnpj)) && "123456".equals(password)) {
            return ResponseEntity.ok(Map.of("result", "ok"));
        }
        return ResponseEntity.status(401).body(Map.of("error", "invalid_credentials"));
    }
}
