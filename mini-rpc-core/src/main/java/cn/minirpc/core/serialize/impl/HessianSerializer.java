package cn.minirpc.core.serialize.impl;

import cn.minirpc.core.common.CommonException;
import cn.minirpc.core.serialize.Serializer;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Author: wangzc
 * @Date: 2021/10/29 14:41
 */

public class HessianSerializer implements Serializer {
    @Override
    public <T> byte[] serialize(T object) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        HessianOutput ho = new HessianOutput(os);
        try {
            ho.writeObject(object);
            ho.flush();
            byte[] result = os.toByteArray();
            return result;
        } catch (IOException e) {
            throw new CommonException(e);
        } finally {
            try {
                ho.close();
            } catch (IOException e) {
                throw new CommonException(e);
            }
            try {
                os.close();
            } catch (IOException e) {
                throw new CommonException(e);
            }
        }
    }

    @Override
    public <T> Object deserialize(byte[] bytes, Class<T> clazz) {
        ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        HessianInput hi = new HessianInput(is);
        try {
            Object result = hi.readObject();
            return result;
        } catch (IOException e) {
            throw new CommonException(e);
        } finally {
            try {
                hi.close();
            } catch (Exception e) {
                throw new CommonException(e);
            }
            try {
                is.close();
            } catch (IOException e) {
                throw new CommonException(e);
            }
        }
    }
}
