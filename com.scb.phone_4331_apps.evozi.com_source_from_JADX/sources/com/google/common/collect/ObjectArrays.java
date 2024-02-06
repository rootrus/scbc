package com.google.common.collect;

import java.util.Collection;

public final class ObjectArrays {
    private ObjectArrays() {
    }

    public static <T> T[] newArray(Class<T> cls, int i) {
        return Platform.newArray(cls, i);
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return Platform.newArray(tArr, i);
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] newArray = newArray(cls, tArr.length + tArr2.length);
        Platform.unsafeArrayCopy(tArr, 0, newArray, 0, tArr.length);
        Platform.unsafeArrayCopy(tArr2, 0, newArray, tArr.length, tArr2.length);
        return newArray;
    }

    public static <T> T[] concat(T t, T[] tArr) {
        T[] newArray = newArray(tArr, tArr.length + 1);
        newArray[0] = t;
        Platform.unsafeArrayCopy(tArr, 0, newArray, 1, tArr.length);
        return newArray;
    }

    public static <T> T[] concat(T[] tArr, T t) {
        T[] arraysCopyOf = arraysCopyOf(tArr, tArr.length + 1);
        arraysCopyOf[tArr.length] = t;
        return arraysCopyOf;
    }

    private static <T> T[] arraysCopyOf(T[] tArr, int i) {
        T[] newArray = newArray(tArr, i);
        Platform.unsafeArrayCopy(tArr, 0, newArray, 0, Math.min(tArr.length, i));
        return newArray;
    }

    static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static Object[] toArrayImpl(Collection<?> collection) {
        return fillArray(collection, new Object[collection.size()]);
    }

    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }

    static void swap(Object[] objArr, int i, int i2) {
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }
}
