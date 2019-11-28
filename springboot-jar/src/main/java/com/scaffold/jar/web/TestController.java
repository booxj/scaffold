package com.scaffold.jar.web;

import com.scaffold.jar.config.PropertiesConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;

/**
 * @ClassName: TestController
 * @Description:
 * @Author: booxj
 * @Date: 2019/11/28 10:38
 */
@RestController
public class TestController {

    private final PropertiesConfig config;

    public TestController(PropertiesConfig config) {
        this.config = config;
    }

    @GetMapping("prop")
    public String properties() throws IllegalAccessException {
        Field[] fields = PropertiesConfig.class.getDeclaredFields();

        StringBuilder sb = new StringBuilder("PropertiesConfig:\n");
        for (Field field : fields) {
            field.setAccessible(true);
            sb.append(field.getName()).append(" : ").append(field.get(config)).append("\n");
        }
        return sb.toString();
    }

    @GetMapping("yml")
    public String yml() {
        // TODO: 2019/11/28
        return "todo";
    }

}
