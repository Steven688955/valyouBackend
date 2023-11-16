package com.valyou.valyou.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investor")
public class InvestorController {

    // @GetMapping("/create")
    // ResponseEntity<?> createBusinessAccount() {
    //     return new ResponseEntity<>(new ResponseMessage("success", "everything coming soon"), HttpStatus.BAD_REQUEST);
    // }
}

@Setter
@Getter
@AllArgsConstructor
class ResponseMessage {
    private String status;
    private String message;
}