package cn.minirpc.core.serialize;

/**
 * @Author: wangzc
 * @Date: 2021/10/29 14:37
 */

public interface Serializer {

    /**
     * 序列化
     * @param object
     * @param <T>
     * @return
     */
    default <T> byte[] serialize(T object) {
        return null;
    }

    /**
     * 反序列化
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     */
    default <T> Object deserialize(byte[] bytes, Class<T> clazz) {
        return null;
    }

}
