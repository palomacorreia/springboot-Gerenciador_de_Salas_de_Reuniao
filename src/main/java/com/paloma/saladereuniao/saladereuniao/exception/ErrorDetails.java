package com.paloma.saladereuniao.saladereuniao.exception;

import java.util.Date;


public class ErrorDetails {

    private Date  timestamp;
    private String messageDetails;
    private String details;

    public ErrorDetails(Date timestamp, String messageDetails, String details) {
        super();
        this.timestamp = timestamp;
        this.messageDetails = messageDetails;
        this.details = details;
    }
}
