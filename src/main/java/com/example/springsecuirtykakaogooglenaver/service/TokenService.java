package com.example.springsecuirtykakaogooglenaver.service;

import com.example.springsecuirtykakaogooglenaver.dto.TokenResponse;

public interface TokenService {
    TokenResponse reissueAccessToken(String authorizationHeader);
}
