package cn.aikuiba.core.resp;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by 蛮小满Sama at 2024-02-19 19:29
 *
 * @description
 */
@Accessors(chain = true)
@Data
public class R {

    private String message;

    private Integer code;

    private Object data;

    private Boolean success;

    private R() {
    }

    private static R me() {
        return new R().setSuccess(Boolean.TRUE).setCode(200).setMessage("SUCCESS").setData(null);
    }

    public static R ok() {
        return me();
    }

    public static R ok(Integer code, String message) {
        return ok().setCode(code).setMessage(message);
    }

    public static R ok(String message, Object data) {
        return ok().setMessage(message).setData(data);
    }

    public static R ok(Object data) {
        return ok().setData(data);
    }

    public static R failure(Integer code, String message) {
        return me().setCode(code).setMessage(message).setSuccess(Boolean.FALSE);
    }
}
