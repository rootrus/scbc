package com.pingan.p031ai;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.pingan.ai.v */
public class C8680v {

    /* renamed from: a */
    public static final char[] f5439a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final char[] f5440b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static char[] m5681a(byte[] bArr) {
        return m5682a(bArr, true);
    }

    /* renamed from: b */
    public static String m5684b(InputStream inputStream) {
        return m5685b(m5679a(inputStream));
    }

    /* renamed from: a */
    public static char[] m5682a(byte[] bArr, boolean z) {
        return m5683a(bArr, z ? f5439a : f5440b);
    }

    /* renamed from: b */
    public static String m5685b(byte[] bArr) {
        return new String(m5681a(bArr));
    }

    /* renamed from: a */
    public static char[] m5683a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    /* renamed from: b */
    public static MessageDigest m5686b(MessageDigest messageDigest, InputStream inputStream) {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read >= 0) {
            messageDigest.update(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
        return messageDigest;
    }

    /* renamed from: a */
    public static byte[] m5679a(InputStream inputStream) {
        return m5680a(m5677a(), inputStream);
    }

    /* renamed from: a */
    public static byte[] m5680a(MessageDigest messageDigest, InputStream inputStream) {
        return m5686b(messageDigest, inputStream).digest();
    }

    /* renamed from: a */
    public static MessageDigest m5677a() {
        return m5678a("MD5");
    }

    /* renamed from: a */
    public static MessageDigest m5678a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
