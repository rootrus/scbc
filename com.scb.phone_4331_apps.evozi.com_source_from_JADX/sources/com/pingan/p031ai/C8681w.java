package com.pingan.p031ai;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.pingan.ai.w */
public final class C8681w {
    /* renamed from: a */
    public static byte[] m5688a(byte[] bArr, byte[] bArr2, int i, String str) {
        return m5689a(bArr, bArr2, i, str, true);
    }

    /* renamed from: a */
    public static byte[] m5689a(byte[] bArr, byte[] bArr2, int i, String str, boolean z) {
        Key key;
        if (!(bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0)) {
            if (z) {
                try {
                    key = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (NoSuchPaddingException e2) {
                    e2.printStackTrace();
                } catch (InvalidKeyException e3) {
                    e3.printStackTrace();
                } catch (BadPaddingException e4) {
                    e4.printStackTrace();
                } catch (IllegalBlockSizeException e5) {
                    e5.printStackTrace();
                } catch (InvalidKeySpecException e6) {
                    e6.printStackTrace();
                }
            } else {
                key = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
            }
            if (key == null) {
                return null;
            }
            Cipher instance = Cipher.getInstance(str);
            instance.init(z ? 1 : 2, key);
            int length = bArr.length;
            int i2 = i / 8;
            if (z && str.toLowerCase().endsWith("pkcs1padding")) {
                i2 -= 11;
            }
            int i3 = length / i2;
            if (i3 <= 0) {
                return instance.doFinal(bArr);
            }
            byte[] bArr3 = new byte[0];
            byte[] bArr4 = new byte[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                System.arraycopy(bArr, i4, bArr4, 0, i2);
                bArr3 = m5687a(bArr3, instance.doFinal(bArr4));
                i4 += i2;
            }
            if (i4 == length) {
                return bArr3;
            }
            int i6 = length - i4;
            byte[] bArr5 = new byte[i6];
            System.arraycopy(bArr, i4, bArr5, 0, i6);
            return m5687a(bArr3, instance.doFinal(bArr5));
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m5687a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
