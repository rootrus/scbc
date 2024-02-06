package com.pingan.p031ai;

import android.content.Context;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pingan.ai.p */
public class C8677p {

    /* renamed from: a */
    public static final String f5438a = "p";

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5665a(int r4, int r5) {
        /*
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 270(0x10e, float:3.78E-43)
            r2 = 90
            r3 = 1
            if (r4 != r3) goto L_0x0010
            if (r5 == r2) goto L_0x0016
            if (r5 == r1) goto L_0x0012
            if (r5 != r0) goto L_0x001b
            goto L_0x001c
        L_0x0010:
            if (r5 != r2) goto L_0x0014
        L_0x0012:
            r3 = 0
            goto L_0x001c
        L_0x0014:
            if (r5 != r1) goto L_0x0018
        L_0x0016:
            r3 = 2
            goto L_0x001c
        L_0x0018:
            if (r5 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 3
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pingan.p031ai.C8677p.m5665a(int, int):int");
    }

    /* renamed from: a */
    public static void m5667a(Context context) {
        PaFaceLogger.m2759i(f5438a, "preLoadModel start");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        sb.append("/model");
        File file = new File(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        sb2.append("/model/4.9.0");
        String obj = sb2.toString();
        File file2 = new File(obj);
        if (!file.exists()) {
            boolean mkdir = file.mkdir();
            String str = f5438a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("oldFile.mkdir:");
            sb3.append(mkdir);
            PaFaceLogger.m2759i(str, sb3.toString());
        }
        if (!file2.exists()) {
            boolean b = C8683y.m5729b(file);
            boolean mkdirs = file2.mkdirs();
            String str2 = f5438a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("preLoadModel deleteDirWithFile : dir1=");
            sb4.append(b);
            sb4.append(",modeldir=");
            sb4.append(mkdirs);
            PaFaceLogger.m2759i(str2, sb4.toString());
            try {
                m5668a(context, obj);
            } catch (Exception e) {
                String str3 = f5438a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("preLoadModel copyAllModel exception : ");
                sb5.append(e.getMessage());
                PaFaceLogger.error(str3, sb5.toString());
            }
        }
        String str4 = f5438a;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("preLoadModel end use time : ");
        sb6.append(System.currentTimeMillis() - currentTimeMillis);
        PaFaceLogger.m2759i(str4, sb6.toString());
    }

    /* renamed from: b */
    public static void m5672b(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        String obj = sb.toString();
        if (m5670a(obj)) {
            File file = new File(obj);
            if (!str3.equals(m5666a(file))) {
                file.delete();
            } else {
                return;
            }
        }
        m5669a(context, str2, str, str2);
    }

    /* renamed from: a */
    public static void m5668a(Context context, String str) {
        try {
            m5672b(context, str, "blur_nx.dat", "3754244cc3ede570b0a6c9d8fa36affc");
            m5672b(context, str, "detect_nx.dat", "0f19d184dc00f49c90200be7914f2db7");
            m5672b(context, str, "eye_close_nx.dat", "915d4b4961d131ad3e589939565631f9");
            m5672b(context, str, "head_pose_nx.dat", "1663571f19ca714c05ad43c75645d9dc");
            m5672b(context, str, "landmark_nx_106.dat", "14e8a4c80ae42e3570a7fbfd5d29bd19");
            m5672b(context, str, "license.txt", "ec60d4305b43308e9ad8f7ed7cbf9c0e");
            m5672b(context, str, "live_nx_224.dat", "036035c3716efbee62f68333ecf8152d");
            m5672b(context, str, "live_nx_320.dat", "a1e2a6c9ae95ad1269519660516fe08a");
            m5672b(context, str, "occ_nx.dat", "ab472620bd3e330318c5058aae482763");
            m5672b(context, str, "ranking_nx.dat", "a3bed8b8ac0f0f6da2a5d817c024f4ab");
            m5672b(context, str, "reg_nx.dat", "45d3438d2baf4aab6a861858289c612f");
            m5672b(context, str, "anti_splicing_nx.dat", "094a25e2802d39c5c22f30584ed133bf");
            m5672b(context, str, "live_nx_light.dat", "9c8a45eb2e779a25fae3bc4bc73e5f0b");
            m5672b(context, str, "live_nx_light_0.dat", "b1b8bcd66fa85a40c2f091751ae9d814");
            m5672b(context, str, "live_nx_light_1.dat", "6823f392a8c6ff0fae9a388067ba65aa");
            m5672b(context, str, "live_nx_light_2.dat", "4af132fbbb699d3b3522bacd238d5335");
            m5672b(context, str, "live_nx_light_3.dat", "6437acaf700b7fcb1c1ff49ac0e53b8c");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("copy model error, ");
            sb.append(e.getMessage());
            PaFaceLogger.error(sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m5670a(String str) {
        try {
            if (!new File(str).exists()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC, Splitter:B:41:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa A[SYNTHETIC, Splitter:B:46:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c A[SYNTHETIC, Splitter:B:54:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139 A[SYNTHETIC, Splitter:B:59:0x0139] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5669a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "copy model InputStream close exception : "
            java.lang.String r1 = "copy model FileOutputStream close exception : "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r8)
            boolean r8 = r2.exists()
            if (r8 != 0) goto L_0x0047
            boolean r8 = r2.mkdir()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "copy model,mkdir : "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r8 = ",dir:"
            r3.append(r8)
            java.lang.String r8 = r2.getAbsolutePath()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r8)
        L_0x0047:
            r8 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            r2.<init>(r9)     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            if (r2 != 0) goto L_0x007f
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            java.io.InputStream r6 = r6.open(r7)     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r8 = 7168(0x1c00, float:1.0045E-41)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x0075 }
        L_0x0068:
            int r9 = r6.read(r8)     // Catch:{ Exception -> 0x0075 }
            if (r9 <= 0) goto L_0x0073
            r2 = 0
            r7.write(r8, r2, r9)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0068
        L_0x0073:
            r8 = r7
            goto L_0x0080
        L_0x0075:
            r8 = move-exception
            goto L_0x00c3
        L_0x0077:
            r7 = move-exception
            goto L_0x011a
        L_0x007a:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00c3
        L_0x007f:
            r6 = r8
        L_0x0080:
            if (r8 == 0) goto L_0x009d
            r8.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x009d
        L_0x0086:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r7)
        L_0x009d:
            if (r6 == 0) goto L_0x0115
            r6.close()     // Catch:{ IOException -> 0x00a3 }
            return
        L_0x00a3:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r6)
            return
        L_0x00bb:
            r6 = move-exception
            r7 = r6
            r6 = r8
            goto L_0x011a
        L_0x00bf:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
        L_0x00c3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0116 }
            r9.<init>()     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = "copy model exception : "
            r9.append(r2)     // Catch:{ all -> 0x0116 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0116 }
            r9.append(r8)     // Catch:{ all -> 0x0116 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0116 }
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r8)     // Catch:{ all -> 0x0116 }
            if (r7 == 0) goto L_0x00f8
            r7.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00f8
        L_0x00e1:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r7)
        L_0x00f8:
            if (r6 == 0) goto L_0x0115
            r6.close()     // Catch:{ IOException -> 0x00fe }
            return
        L_0x00fe:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r6)
        L_0x0115:
            return
        L_0x0116:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x011a:
            if (r8 == 0) goto L_0x0137
            r8.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x0137
        L_0x0120:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r8)
        L_0x0137:
            if (r6 == 0) goto L_0x0154
            r6.close()     // Catch:{ IOException -> 0x013d }
            goto L_0x0154
        L_0x013d:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r6)
        L_0x0154:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pingan.p031ai.C8677p.m5669a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m5671a(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        C8683y.m5729b(file);
        return C8683y.m5728a(str, str2);
    }

    /* renamed from: a */
    public static String m5666a(File file) {
        if (!file.isFile()) {
            return null;
        }
        try {
            return C8680v.m5684b((InputStream) new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
