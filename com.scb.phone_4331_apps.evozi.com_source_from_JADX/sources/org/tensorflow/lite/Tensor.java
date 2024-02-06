package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p040o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder;

public final class Tensor {
    public int[] IconCompatParcelizer;
    public long MediaBrowserCompat$CustomActionResultReceiver;
    private final PreLoginTutorialViewPagerAdapter$TutorialItemHolder MediaBrowserCompat$ItemReceiver;

    public static native ByteBuffer buffer(long j);

    private static native long create(long j, int i);

    static native void delete(long j);

    private static native int dtype(long j);

    private static native int numBytes(long j);

    public static native void readMultiDimensionalArray(long j, Object obj);

    public static native int[] shape(long j);

    public static native void writeDirectBuffer(long j, ByteBuffer byteBuffer);

    public static native void writeMultiDimensionalArray(long j, Object obj);

    public static Tensor read(long j, int i) {
        return new Tensor(create(j, i));
    }

    private static PreLoginTutorialViewPagerAdapter$TutorialItemHolder IconCompatParcelizer(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                return PreLoginTutorialViewPagerAdapter$TutorialItemHolder.FLOAT32;
            }
            if (Integer.TYPE.equals(cls)) {
                return PreLoginTutorialViewPagerAdapter$TutorialItemHolder.INT32;
            }
            if (Byte.TYPE.equals(cls)) {
                return PreLoginTutorialViewPagerAdapter$TutorialItemHolder.UINT8;
            }
            if (Long.TYPE.equals(cls)) {
                return PreLoginTutorialViewPagerAdapter$TutorialItemHolder.INT64;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DataType error: cannot resolve DataType of ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static int[] read(Object obj) {
        int[] iArr = new int[MediaBrowserCompat$ItemReceiver(obj)];
        MediaBrowserCompat$ItemReceiver(obj, 0, iArr);
        return iArr;
    }

    private static int MediaBrowserCompat$ItemReceiver(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return MediaBrowserCompat$ItemReceiver(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static void MediaBrowserCompat$ItemReceiver(Object obj, int i, int[] iArr) {
        if (iArr != null && i != iArr.length) {
            int length = Array.getLength(obj);
            if (iArr[i] == 0) {
                iArr[i] = length;
            } else if (iArr[i] != length) {
                throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)}));
            }
            for (int i2 = 0; i2 < length; i2++) {
                MediaBrowserCompat$ItemReceiver(Array.get(obj, i2), i + 1, iArr);
            }
        }
    }

    public static boolean write(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private Tensor(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.MediaBrowserCompat$ItemReceiver = PreLoginTutorialViewPagerAdapter$TutorialItemHolder.MediaBrowserCompat$CustomActionResultReceiver(dtype(j));
        this.IconCompatParcelizer = shape(j);
    }

    static {
        TensorFlowLite.IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.capacity() != numBytes(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite buffer with %d bytes and a ByteBuffer with %d bytes.", new Object[]{Integer.valueOf(numBytes(this.MediaBrowserCompat$CustomActionResultReceiver)), Integer.valueOf(byteBuffer.capacity())}));
            }
            return;
        }
        PreLoginTutorialViewPagerAdapter$TutorialItemHolder IconCompatParcelizer2 = IconCompatParcelizer(obj);
        PreLoginTutorialViewPagerAdapter$TutorialItemHolder preLoginTutorialViewPagerAdapter$TutorialItemHolder = this.MediaBrowserCompat$ItemReceiver;
        if (IconCompatParcelizer2 == preLoginTutorialViewPagerAdapter$TutorialItemHolder) {
            int[] read = read(obj);
            if (!Arrays.equals(read, this.IconCompatParcelizer)) {
                throw new IllegalArgumentException(String.format("Cannot copy between a TensorFlowLite tensor with shape %s and a Java object with shape %s.", new Object[]{Arrays.toString(this.IconCompatParcelizer), Arrays.toString(read)}));
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", new Object[]{preLoginTutorialViewPagerAdapter$TutorialItemHolder, obj.getClass().getName(), IconCompatParcelizer2}));
    }
}
