package com.example.springsecuirtykakaogooglenaver.controller;

import com.example.springsecuirtykakaogooglenaver.config.ApiResponse;
import com.example.springsecuirtykakaogooglenaver.config.SuccessStatus;
import com.example.springsecuirtykakaogooglenaver.dto.TokenResponse;
import com.example.springsecuirtykakaogooglenaver.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TokenController {
    private final TokenService authService;

    // 액세스 토큰을 재발행하는 API
    @GetMapping("/reissue/access-token")
    public ResponseEntity<ApiResponse<Object>> reissueAccessToken(@RequestHeader("Authorization") String authorizationHeader) {
        TokenResponse accessToken = authService.reissueAccessToken(authorizationHeader);
        return ApiResponse.onSuccess(SuccessStatus._CREATE_ACCESS_TOKEN,accessToken);
    }
}
