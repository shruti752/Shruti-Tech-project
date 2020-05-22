package com.shruti.teche.endtoend.project.ShrutiTechproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ExceptionHandlerController  {

    @ExceptionHandler(value = DataNotFoundException.class)
    public ResponseEntity<?> exception(DataNotFoundException exception, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new  ResponseEntity(errorDetails,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<?> globalException(Exception exception, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
        return new  ResponseEntity(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    @ExceptionHandler
//    public String handleInvalidFeildException(DataNotFoundException exception){
//        return exception.getMessage();
//    }

}

class ErrorDetails{
    private Date timeStamp;
    private String message;
    private String details;

    public ErrorDetails(Date timeStamp,String message,String details){
        this.details = details;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
