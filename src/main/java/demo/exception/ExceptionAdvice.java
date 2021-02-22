package demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> <br>
 *
 * @author yss<br>
 * @version 1.0<br>
 * @createDate 2021/02/21 22:16 <br>
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({ArrayIndexOutOfBoundsException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map handleArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException e) {
        // TODO 记录log日志
        e.printStackTrace();
        Map map = new HashMap();
        map.put("msg", "数组越界异常");

        return map;
    }


    @ExceptionHandler({Exception.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map handleException(Exception e) {
        // TODO 记录log日志
        e.printStackTrace();
        Map map = new HashMap();
        map.put("msg", "未知异常");
        return map;
    }

}
