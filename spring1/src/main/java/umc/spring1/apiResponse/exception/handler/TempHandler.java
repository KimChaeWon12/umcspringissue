package umc.spring1.apiResponse.exception.handler;

import umc.spring1.apiResponse.code.BaseErrorCode;
import umc.spring1.apiResponse.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
