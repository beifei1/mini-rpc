package cn.minirpc.core.remoting.provider.annotation;

import java.lang.annotation.*;

/**
 * @Author: wangzc
 * @Date: 2021/10/29 15:11
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RpcService {

    /**
     * provider service default version
     * @return
     */
    String version() default "";

}
