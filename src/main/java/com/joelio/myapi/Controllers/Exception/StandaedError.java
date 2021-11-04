package com.joelio.myapi.Controllers.Exception;

public class StandaedError {
    private Integer status;
    private Long timestamp;
    private String message;

    public StandaedError() {
        super();
    }

    public StandaedError(Integer status, Long timestamp, String message) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
