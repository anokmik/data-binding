package com.anokmik.databinding.util;

public class BaseUtils {

    public static <T> T castObjectOrThrow(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            throw new ClassCastException(o.toString() + " must implement " + clazz.getSimpleName());
        }
    }

}