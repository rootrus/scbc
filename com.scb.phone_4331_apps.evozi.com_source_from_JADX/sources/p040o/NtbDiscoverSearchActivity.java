package p040o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.TypeCastException;

/* renamed from: o.NtbDiscoverSearchActivity */
public final class NtbDiscoverSearchActivity {
    private static final Object[] IconCompatParcelizer = new Object[0];

    public static final Object[] write(Collection<?> collection) {
        onGetStartedClick.write((Object) collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        onGetStartedClick.IconCompatParcelizer((Object) objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return IconCompatParcelizer;
    }

    public static final Object[] write(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        onGetStartedClick.write((Object) collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size != 0) {
                Iterator<?> it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i2 = i + 1;
                        objArr2[i] = it.next();
                        if (i2 >= objArr2.length) {
                            if (!it.hasNext()) {
                                return objArr2;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                if (i2 < 2147483645) {
                                    i3 = 2147483645;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            onGetStartedClick.IconCompatParcelizer((Object) objArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            if (objArr2 == objArr) {
                                objArr[i2] = null;
                                return objArr;
                            }
                            Object[] copyOf = Arrays.copyOf(objArr2, i2);
                            onGetStartedClick.IconCompatParcelizer((Object) copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i = i2;
                    }
                } else if (objArr.length <= 0) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else {
            throw new NullPointerException();
        }
    }
}
