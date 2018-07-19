package org.wcf.demo.controller;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.wcf.demo.pojo.User;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping
    public String index() {
        return "hello world2..";
    }

    /** @RequestParam 简单类型的绑定，可以出来get和post
     *
     * @param name
     * @return
     */
    //跨域局部配置
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello eva");
        map.put("name", name);
        return map;
    }

    /** @PathVariable 获得请求url中的动态参数
     *
     * @param id
     * @param name
     * @return
     */
    @RequestMapping(value = "/get/{id}/{name}")
    public User getUser(@PathVariable int id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setDate(new Date());
        return user;
    }

}
