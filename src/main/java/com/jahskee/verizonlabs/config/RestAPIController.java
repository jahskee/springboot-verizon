package com.jahskee.verizonlabs.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class RestAPIController {
 
  @RequestMapping("/hello")
  public String hello() {
    return "Rest API calls.";
  }
}