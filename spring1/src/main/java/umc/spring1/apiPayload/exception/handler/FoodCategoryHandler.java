package umc.spring1.apiPayload.exception.handler;

import umc.spring1.apiPayload.code.BaseErrorCode;
import umc.spring1.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
