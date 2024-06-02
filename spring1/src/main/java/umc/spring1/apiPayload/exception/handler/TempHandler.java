package umc.spring1.apiPayload.exception.handler;

import umc.spring1.apiPayload.code.BaseErrorCode;
import umc.spring1.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
