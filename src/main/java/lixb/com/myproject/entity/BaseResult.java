package lixb.com.myproject.entity;

import lombok.Data;

@Data
public class BaseResult<T> {
    private int code = 200;
    private String message;
    private long time =System.currentTimeMillis();
    private T data;
}
