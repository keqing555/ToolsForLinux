import java.io.*;

/**
 * 对象序列化工具
 */
public class SerializableUtil {
    /**
     * 将任意对象转为字节数组
     */
    public static byte[] serializable(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            bytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * 反序列化：将字节数组还原为任意对象
     */
    public static Object unSerializable(byte[] bytes)  {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        Object object = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            object = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
