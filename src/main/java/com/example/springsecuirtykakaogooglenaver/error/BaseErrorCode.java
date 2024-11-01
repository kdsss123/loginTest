package com.example.springsecuirtykakaogooglenaver.error;

import com.example.springsecuirtykakaogooglenaver.entity.ErrorReasonDto;
import com.nimbusds.oauth2.sdk.ErrorResponse;

public interface BaseErrorCode {
    public ErrorReasonDto getReason();

    public ErrorReasonDto getReasonHttpStatus();
}
