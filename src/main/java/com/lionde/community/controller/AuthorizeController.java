package com.lionde.community.controller;

import com.lionde.community.dto.AccessTokenDTO;
import com.lionde.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code, @RequestParam(name = "state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("1952844f9de4ed287b0a");
        accessTokenDTO.setClient_secret("ea8eadcab8c3dcbfa4c917df76e36737ad051698");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("https://localhost:8611/callback");
        accessTokenDTO.setState(state);
        githubProvider.getAccessToken(accessTokenDTO);
        return "index";
    }
}
