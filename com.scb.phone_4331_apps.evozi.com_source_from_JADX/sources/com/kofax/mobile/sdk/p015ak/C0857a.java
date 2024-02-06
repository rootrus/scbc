package com.kofax.mobile.sdk.p015ak;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.kofax.mobile.sdk.ak.a */
public class C0857a {
    private C0857a() {
    }

    /* renamed from: b */
    public static void m2190b(ObjectOutputStream objectOutputStream, Bitmap bitmap) throws IOException {
        objectOutputStream.writeObject(m2193m(bitmap));
    }

    /* renamed from: d */
    public static Bitmap m2191d(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        return m2192j((byte[]) objectInputStream.readObject());
    }

    /* renamed from: m */
    public static byte[] m2193m(Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IOException("Unable to compress bitmap");
    }

    /* renamed from: n */
    public static byte[] m2194n(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    /* renamed from: a */
    public static Bitmap m2189a(byte[] bArr, int i, int i2, Bitmap.Config config) throws IOException {
        if (bArr == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        if (createBitmap != null && createBitmap.getByteCount() != 0) {
            return createBitmap;
        }
        throw new IOException("Unable to decode bitmap");
    }

    /* renamed from: j */
    public static Bitmap m2192j(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IOException("Unable to decode bitmap");
    }
}
