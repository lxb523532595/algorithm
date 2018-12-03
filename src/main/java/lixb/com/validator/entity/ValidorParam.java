package lixb.com.validator.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;


/**
 * @author lixb
 * 2018/6/6 下午6:43
 */
public class ValidorParam {
    @NotNull(message = "名字不能为空")
    private String name;
    @NotNull(message = "数量不能为空")
    private Long num;
    @NotBlank(message = "地址不能为空")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
