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
    <T> byte[] serialize(T object);

    /**
     * 反序列化
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     */
    <T> Object deserialize(byte[] bytes, Class<T> clazz);

}
