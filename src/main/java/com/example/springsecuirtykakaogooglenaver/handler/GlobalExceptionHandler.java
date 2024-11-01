package com.example.springsecuirtykakaogooglenaver.handler;

import com.example.springsecuirtykakaogooglenaver.config.ApiResponse;
import com.example.springsecuirtykakaogooglenaver.config.TokenException;
import com.example.springsecuirtykakaogooglenaver.config.UserException;
import com.example.springsecuirtykakaogooglenaver.error.BaseErrorCode;
import com.example.springsecuirtykakaogooglenaver.error.TokenErrorResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TokenException.class)
    public ResponseEntity<ApiResponse<BaseErrorCode>> handleTokenException(TokenException e) {
        TokenErrorResult errorResult = e.getTokenErrorResult();
        return ApiResponse.onFailure(errorResult);
    }

    @ExceptionHandler(UserException.class)
    public ResponseEntity<ApiResponse<BaseErrorCode>> handleUserException(TokenException e) {
        TokenErrorResult errorResult = e.getTokenErrorResult();
        return ApiResponse.onFailure(errorResult);
    }
}
