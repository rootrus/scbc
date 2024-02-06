package com.kofax.mobile.sdk.p005aa;

import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.mobile.sdk._internal.C0767k;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* renamed from: com.kofax.mobile.sdk.aa.e */
public class C0781e {
    private static final String TAG = C0781e.class.getSimpleName();

    /* renamed from: Th */
    public static final Map<String, Integer> f1884Th = new HashMap<String, Integer>() {
        {
            put(Licensing.LicenseServerType.RTTI.name(), 0);
            put(Licensing.LicenseServerType.TotalAgility.name(), 1);
        }
    };

    /* renamed from: Ti */
    public static final Map<String, Integer> f1885Ti = new HashMap<String, Integer>() {
        {
            put(Licensing.LicenseType.IMAGE_CAPTURE.name(), 0);
            put(Licensing.LicenseType.IMAGE_PROCESSING.name(), 1);
            put(Licensing.LicenseType.BARCODE_CAPTURE.name(), 2);
            put(Licensing.LicenseType.LOGISTICS.name(), 3);
            put(Licensing.LicenseType.ID_EXTRACTION.name(), 4);
        }
    };

    /* renamed from: Tj */
    public static final Map<String, Integer> f1886Tj = new HashMap<String, Integer>() {
        {
            put(Licensing.LicenseType.IMAGE_CAPTURE.name(), 5);
            put(Licensing.LicenseType.IMAGE_PROCESSING.name(), 6);
            put(Licensing.LicenseType.BARCODE_CAPTURE.name(), 7);
            put(Licensing.LicenseType.LOGISTICS.name(), 3);
            put(Licensing.LicenseType.ID_EXTRACTION.name(), 8);
        }
    };

    /* renamed from: aE */
    static String m1859aE(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("0");
                    sb2.append(hexString);
                    hexString = sb2.toString();
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            String str2 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to get SHA-1 instance");
            sb3.append(e.getMessage());
            C0767k.m1820e(str2, sb3.toString());
            return "";
        }
    }
}
