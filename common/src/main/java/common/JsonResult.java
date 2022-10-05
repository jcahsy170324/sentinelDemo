package common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName JsonResult
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/3 8:35
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult <T>{
    public Integer code;
    public T data;
}
