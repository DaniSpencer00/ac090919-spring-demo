package it.nextre.academy.nxtlearn.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class BadRequestException extends RuntimeException{

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity handleBadRequest(NotFoundException msg){
        logger.debug("Bad Request REST");
        return new MyErrorPage(HttpStatus.BAD_REQUEST,msg.getMessage()).getPage();
    }

    public BadRequestException(String message){
        super(message);
    }
}//end class
