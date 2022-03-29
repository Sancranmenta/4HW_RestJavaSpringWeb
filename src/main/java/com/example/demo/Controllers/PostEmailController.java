package com.example.demo.Controllers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.Models.*;


@RestController
public class PostEmailController {

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    public ResponseEntity<emailResponse> postEmail(@RequestBody emailRequest emailRequest){
        emailResponse emailResponse = new emailResponse();
        emailResponse.setValue(emailRequest.getMessages().getEmail());
        Status status = new Status();
        status.setCode("SUCCESS");
        emailResponse.setStatusObject(status);

        return new ResponseEntity<>(emailResponse, HttpStatus.OK);
    }

}