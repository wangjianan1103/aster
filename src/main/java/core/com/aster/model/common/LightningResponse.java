package core.com.aster.model.common;

public class LightningResponse {

    private int status;

    private String message;

    private Object content;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public LightningResponse() {
    }

    /**
     * @param status
     * @param message
     */
    public LightningResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * @param status
     * @param message
     * @param content
     */
    public LightningResponse(int status, String message, Object content) {
        this.status = status;
        this.message = message;
        this.content = content;
    }

    @Override
    public String toString() {
        return "LightningResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
