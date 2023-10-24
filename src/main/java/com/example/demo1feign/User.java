package com.example.demo1feign;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    private Long id;
    private String login;
    private String avatarUrl;
    private String name;
    private String company;
    private String publicRepos;
}
