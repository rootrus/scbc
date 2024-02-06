package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.logging.Logger;

class Platform {
    private static final Logger logger = Logger.getLogger(Platform.class.getCanonicalName());

    static <T> T[] clone(T[] tArr) {
        return (Object[]) tArr.clone();
    }

    static void unsafeArrayCopy(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        System.arraycopy(objArr, i, objArr2, i2, i3);
    }

    static <T> T[] newArray(Class<T> cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    static <T> T[] newArray(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }

    private Platform() {
    }
}
