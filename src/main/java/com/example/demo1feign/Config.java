package com.example.demo1feign;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Github",url = "https://api.github.com")
public interface Config {
    @GetMapping({"/users/{name}"})
    User getByName(@PathVariable String name);
}
