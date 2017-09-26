package core.com.aster.exception;

/**
 * Created by wangjianan on 16-7-10.
 */
public class AsterException extends RuntimeException {

    private String code;
    private String error;

    public AsterException(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "AsterException{" +
                "code='" + code + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
