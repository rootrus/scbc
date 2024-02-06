package com.pingan.p031ai;

import android.os.Build;
import android.util.Base64;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import pingan.p063ai.paverify.vertify.PFaceDetector;

/* renamed from: com.pingan.ai.a0 */
public class C8663a0 {
    /* renamed from: a */
    public static String m5611a(String str, String str2, String str3) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append("android490");
            sb.append("|");
            sb.append(m5610a());
            sb.append("|");
            sb.append(m5612b());
            sb.append("|");
            sb.append(str3);
            String obj = sb.toString();
            return Base64.encodeToString(C8681w.m5688a(obj.getBytes("UTF-8"), Base64.decode(PFaceDetector.nativeGateOfHeaven(), 2), 2048, "RSA/ECB/PKCS1Padding"), 2);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getUniqueId exception:");
            sb2.append(e.getMessage());
            PaFaceLogger.error("UniqueUtils", sb2.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static String m5612b() {
        StringBuilder sb = new StringBuilder();
        sb.append("phone android OS=");
        sb.append(Build.VERSION.RELEASE);
        PaFaceLogger.m2758i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Android");
        sb2.append(Build.VERSION.RELEASE);
        return sb2.toString();
    }

    /* renamed from: a */
    public static String m5610a() {
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append("phone brand=");
        sb.append(str);
        sb.append(",model=");
        sb.append(str2);
        PaFaceLogger.m2758i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        return sb2.toString();
    }
}
