package user.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/20 0020.
 */
@RestController
@RequestMapping(value = "user")
public class UserRegisterController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ResponseEntity<String> hello(String name){
        return ResponseEntity.ok("hello " + name);
    }


}
