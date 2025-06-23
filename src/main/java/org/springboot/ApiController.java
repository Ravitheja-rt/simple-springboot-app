package org.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private MyApiClientService service;

    @GetMapping("/get-data")
    public String getData() {
        return service.fetchDataFromExternalApi();
    }
}
