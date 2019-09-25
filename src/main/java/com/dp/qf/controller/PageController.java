package com.dp.qf.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class PageController {

    @RequestMapping(value = "/FenYe/{page}/{list}")
    public String pageList(@PathVariable String  page ,@PathVariable String  list){
        log.debug(page);
        log.debug(list);
        return "返回什么不重要";
    }
}
