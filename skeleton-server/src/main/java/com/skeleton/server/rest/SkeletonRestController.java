package com.skeleton.server.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skeleton")
public class SkeletonRestController {

    @GetMapping
    public String helloSkeleton() {
        return "Hello, Skeleton";
    }
}
