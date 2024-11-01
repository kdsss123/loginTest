package com.example.springsecuirtykakaogooglenaver.error;

import com.example.springsecuirtykakaogooglenaver.entity.ReasonDto;

public interface BaseCode {
    public ReasonDto getReason();

    public ReasonDto getReasonHttpStatus();
}
