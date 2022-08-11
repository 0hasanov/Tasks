package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Worker student = new Worker("Ayaz", "Baxalov", 20);
        Class<Worker> workerClass = (Class<Worker>) Class.forName("reflection.Worker");

        Field[] fields = workerClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " : " + field.get(student));
        }

        System.out.println("");

        Constructor<Worker> declaredConstructor = workerClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Worker cc = declaredConstructor.newInstance();
        Field name = cc.getClass().getDeclaredField("name");
        Field surname = cc.getClass().getDeclaredField("surname");
        Field age = cc.getClass().getDeclaredField("age");

        name.setAccessible(true);
        surname.setAccessible(true);
        age.setAccessible(true);

        name.set(cc, "Nizam");
        surname.set(cc, "Kerimov");
        age.set(cc, 25);

        System.out.println(cc.getName());
        System.out.println(cc.getSurname());
        System.out.println(cc.getAge());
    }
}