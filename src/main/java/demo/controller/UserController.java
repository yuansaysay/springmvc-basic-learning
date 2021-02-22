package demo.controller;

import demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <Description> <br>
 *
 * @author yss<br>
 * @version 1.0<br>
 * @createDate 2021/02/21 10:58 <br>
 */
@Controller
public class UserController {

    /**
     * 用于研究 ResponseBody 处理的程序逻辑流向
     * @param name
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public Object getUser(@RequestParam String name) {

        User user = new User();
        user.setId(1);
        user.setName(name);

        if(true) {
            throw new RuntimeException("异常了");
        }

        return user;
    }

    /**
     * 用于研究 ModelAndView 的程序逻辑流向
     * @return
     */
    @RequestMapping(value = "/getUserModel", method = RequestMethod.GET)
    public Object getUserModel() {

        User user = new User();
        user.setId(1);
        user.setName("name");

        return user;
    }
}
