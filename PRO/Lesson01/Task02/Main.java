package task02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer container = new TextContainer();
        Class<?> aClass = container.getClass();

        SaveTo saveTo = aClass.getAnnotation(SaveTo.class);
        String path = saveTo.path();

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(Saver.class)){
                method.invoke(container, path);
            }
        }
    }
}
