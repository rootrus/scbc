package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public final class Floats {
    private Floats() {
    }

    public static int hashCode(float f) {
        return Float.valueOf(f).hashCode();
    }

    public static int compare(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static boolean contains(float[] fArr, float f) {
        for (float f2 : fArr) {
            if (f2 == f) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(float[] fArr, float f) {
        return indexOf(fArr, f, 0, fArr.length);
    }

    /* access modifiers changed from: private */
    public static int indexOf(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int indexOf(float[] fArr, float[] fArr2) {
        Preconditions.checkNotNull(fArr, "array");
        Preconditions.checkNotNull(fArr2, "target");
        if (fArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (fArr.length - fArr2.length) + 1) {
            int i2 = 0;
            while (i2 < fArr2.length) {
                if (fArr[i + i2] != fArr2[i2]) {
                    i++;
                } else {
                    i2++;
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(float[] fArr, float f) {
        return lastIndexOf(fArr, f, 0, fArr.length);
    }

    /* access modifiers changed from: private */
    public static int lastIndexOf(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    public static float min(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.min(f, fArr[i]);
        }
        return f;
    }

    public static float max(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        return f;
    }

    public static float[] concat(float[]... fArr) {
        int i = 0;
        for (float[] length : fArr) {
            i += length.length;
        }
        float[] fArr2 = new float[i];
        int i2 = 0;
        for (float[] fArr3 : fArr) {
            System.arraycopy(fArr3, 0, fArr2, i2, fArr3.length);
            i2 += fArr3.length;
        }
        return fArr2;
    }

    public static float[] ensureCapacity(float[] fArr, int i, int i2) {
        Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return fArr.length < i ? copyOf(fArr, i + i2) : fArr;
    }

    private static float[] copyOf(float[] fArr, int i) {
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, Math.min(fArr.length, i));
        return fArr2;
    }

    public static String join(String str, float... fArr) {
        Preconditions.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i = 1; i < fArr.length; i++) {
            sb.append(str);
            sb.append(fArr[i]);
        }
        return sb.toString();
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        public final int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Floats.compare(fArr[i], fArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    public static float[] toArray(Collection<Float> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).toFloatArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Float) array[i]).floatValue();
        }
        return fArr;
    }

    public static List<Float> asList(float... fArr) {
        if (fArr.length == 0) {
            return Collections.emptyList();
        }
        return new FloatArrayAsList(fArr);
    }

    static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        public boolean isEmpty() {
            return false;
        }

        FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        FloatArrayAsList(float[] fArr, int i, int i2) {
            this.array = fArr;
            this.start = i;
            this.end = i2;
        }

        public int size() {
            return this.end - this.start;
        }

        public Float get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Float.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        public int indexOf(Object obj) {
            int access$000;
            if (!(obj instanceof Float) || (access$000 = Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return access$000 - this.start;
        }

        public int lastIndexOf(Object obj) {
            int access$100;
            if (!(obj instanceof Float) || (access$100 = Floats.lastIndexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return access$100 - this.start;
        }

        public Float set(int i, Float f) {
            Preconditions.checkElementIndex(i, size());
            float[] fArr = this.array;
            int i2 = this.start + i;
            float f2 = fArr[i2];
            fArr[i2] = f.floatValue();
            return Float.valueOf(f2);
        }

        public List<Float> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            float[] fArr = this.array;
            int i3 = this.start;
            return new FloatArrayAsList(fArr, i + i3, i3 + i2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != floatArrayAsList.array[floatArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Floats.hashCode(this.array[i2]);
            }
            return i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append(this.array[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float[] toFloatArray() {
            int size = size();
            float[] fArr = new float[size];
            System.arraycopy(this.array, this.start, fArr, 0, size);
            return fArr;
        }
    }
}