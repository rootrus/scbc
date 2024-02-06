package com.kofax.kmc.klo.logistics.service;

import com.kofax.mobile.sdk._internal.C0767k;
import java.security.MessageDigest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

public class CryptoService {
    private static final String TAG = CryptoService.class.getSimpleName();

    public static char convertIntToHexChar(int i) {
        return (char) ((i < 0 || i > 9) ? (i - 10) + 97 : i + 48);
    }

    public static String convertBytesToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte convertByteToHex : bArr) {
            stringBuffer.append(convertByteToHex(convertByteToHex).toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static String convertByteToHex(byte b) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(convertIntToHexChar((b >>> 4) & 15));
        stringBuffer.append(convertIntToHexChar(b & 15));
        return stringBuffer.toString();
    }

    public static String md5Hash(String str) {
        try {
            return MessageDigest.getInstance("md5").digest(str.getBytes()).toString();
        } catch (Exception e) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating md5 hash for '");
            sb.append(str);
            sb.append("'");
            C0767k.m1821e(str2, sb.toString(), (Throwable) e);
            return null;
        }
    }

    public static String sha256Hash(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            instance.update(str.getBytes());
            return convertBytesToHex(instance.digest());
        } catch (Exception e) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating sha hash for '");
            sb.append(str);
            sb.append("'");
            C0767k.m1821e(str2, sb.toString(), (Throwable) e);
            return null;
        }
    }

    public static String sha1Hash(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            instance.update(str.getBytes());
            return convertBytesToHex(instance.digest());
        } catch (Exception e) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating sha hash for '");
            sb.append(str);
            sb.append("'");
            C0767k.m1821e(str2, sb.toString(), (Throwable) e);
            return null;
        }
    }
}
