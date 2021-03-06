package org.levelup.lesson;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionLessons {

    public static void main(String[] args) throws ClassNotFoundException {
        //Class personClass = Person.class;

        Class personClass = Class.forName("org.levelup.lesson.Person");

        Method[] methods = personClass.getMethods();
        for (Method method : methods)
            System.out.println(method.getName() + ", "
                    + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));



    }
}
