package umc.spring1.apiResponse.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.spring1.apiResponse.code.BaseErrorCode;
import umc.spring1.apiResponse.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return this.code.getReasonHttpStatus();
    }
}
