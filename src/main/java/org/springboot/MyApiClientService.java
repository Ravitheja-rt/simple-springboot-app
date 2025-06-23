package org.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyApiClientService {

    private final RestTemplate restTemplate;

    @Autowired
    public MyApiClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchDataFromExternalApi() {
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        return restTemplate.getForObject(url, String.class);
    }
}
