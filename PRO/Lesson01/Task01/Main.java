import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = MyClass.class;

        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test annotation = method.getAnnotation(Test.class);
                method.invoke(new MyClass(), annotation.value1(), annotation.value2());
            }
        }
    }
}