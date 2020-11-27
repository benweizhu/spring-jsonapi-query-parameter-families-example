package me.zeph.spring.jsonapi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
    @GetMapping(value = "/get-data")
    public JsonApiParams get(JsonApiParams jsonApiParams) {
        return jsonApiParams;
    }
}
