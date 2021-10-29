package cn.minirpc.core.common;

/**
 * @Author: wangzc
 * @Date: 2021/10/29 14:51
 */

public class CommonException extends RuntimeException {

    public CommonException(String msg) {
        super(msg);
    }

    public CommonException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

}
