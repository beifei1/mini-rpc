package cn.minirpc.core.serialize.impl;

import cn.minirpc.core.serialize.Serializer;

/**
 * @Author: wangzc
 * @Date: 2021/10/29 14:42
 */

public class KyroSerializer implements Serializer {

    @Override
    public <T> byte[] serialize(T object) {
        return new byte[0];
    }

    @Override
    public <T> Object deserialize(byte[] bytes, Class<T> clazz) {
        return null;
    }
}
