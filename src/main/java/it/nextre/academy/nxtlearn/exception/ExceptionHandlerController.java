package it.nextre.academy.nxtlearn.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.*;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFound(NotFoundException msg){
        return new MyErrorPage(HttpStatus.NOT_FOUND,msg.getMessage()).addHeader("header-1","text-1").addData("body-example",123456789).getPage();
}
}//end class
class MyErrorPage {
    private HttpStatus statusCode;
    private Object body;
    private Map<String, Object> data = new HashMap<>();
    private MultiValueMap<String, String> customHeaders = new HttpHeaders();

    public MyErrorPage(HttpStatus statusCode, Object body) {
        this.statusCode = statusCode;
        this.body = body;
        this.data.put("data", body);
        this.data.put("status", statusCode);
        this.data.put("error", statusCode.toString().substring(3).trim());
        this.data.put("timestamp", Instant.now().toEpochMilli());
    }

    ResponseEntity getPage() {
        return new ResponseEntity(data, customHeaders, statusCode);
    }

    public MyErrorPage addData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public MyErrorPage addHeader(String key, String value) {
        this.customHeaders.put(key, Arrays.asList(value));
        return this;
    }

    public MyErrorPage addHeaders(String key, List<String> value) {
        this.customHeaders.put(key, value);
        return this;
    }
}
