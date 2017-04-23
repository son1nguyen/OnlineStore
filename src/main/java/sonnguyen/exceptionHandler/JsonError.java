package sonnguyen.exceptionHandler;

import java.io.Serializable;

/**
 * Created by sonnguyen on 4/20/17.
 */
public class JsonError implements Serializable {

    private String errCode;
    private String errMsg;

    public JsonError() {
    }

    public JsonError(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "JsonError{" +
                "errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsonError jsonError = (JsonError) o;

        if (errCode != null ? !errCode.equals(jsonError.errCode) : jsonError.errCode != null) return false;
        return errMsg != null ? errMsg.equals(jsonError.errMsg) : jsonError.errMsg == null;
    }

    @Override
    public int hashCode() {
        int result = errCode != null ? errCode.hashCode() : 0;
        result = 31 * result + (errMsg != null ? errMsg.hashCode() : 0);
        return result;
    }
}
