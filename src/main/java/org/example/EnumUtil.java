package org.example;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EnumUtil {
    private String getEnumGetterName(Class<? extends Enum> clazz) {
        String annotationValue = clazz.getAnnotation(EnumCustomName.class).value();
        String name = "get" + annotationValue.substring(0, 1).toUpperCase() + annotationValue.substring(1);
        return name;
    }

    @SneakyThrows
    public boolean enumBelongsTo(Class<? extends Enum> clazz, String value) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getType().getSimpleName().equals(clazz.getSimpleName())) {
                Class declaredClass = field.getDeclaringClass();
                Method method = declaredClass.getDeclaredMethod(getEnumGetterName(clazz));
                if (method.invoke(field.get(field)).equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }
}
