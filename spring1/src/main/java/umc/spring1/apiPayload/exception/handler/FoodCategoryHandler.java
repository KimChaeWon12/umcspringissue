package umc.spring1.apiResponse.exception.handler;

import umc.spring1.apiResponse.code.BaseErrorCode;
import umc.spring1.apiResponse.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
