package com.wxz.resp;

public class Resp<T> {
    //响应状态码
    private Integer code;
    //提示消息
    private String msg;
    //相应数据
    private T data;

    public Resp(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Resp() {
    }
    public Resp(T data){this.data=data;}
    public Resp(String mes){this.msg=mes;}

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static<T> Resp<T> ok(T data){
        Resp<T> resp = new Resp<T>(data);
        resp.setCode(0);//操作成功
        resp.setMsg("success");
        return resp;
    }
    public static<T> Resp<T> fail(){
        Resp<T> resp = new Resp<>();
        resp.setCode(1);//操作失败
        resp.setMsg("error");
        return resp;
    }
}
