package com.pingan.p031ai;

import com.pingan.p031ai.face.utils.PaFaceLogger;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.pingan.ai.b */
public class C8664b<T> {
    /* renamed from: a */
    public static void m5615a(String str, String str2, String str3) {
        m5613a(str2, str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str3);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("\r\n");
        String obj2 = sb2.toString();
        try {
            File file = new File(obj);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.seek(file.length());
            randomAccessFile.write(obj2.getBytes());
            randomAccessFile.close();
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("writeTxtToFile throws exception: ");
            sb3.append(e.getMessage());
            PaFaceLogger.m2758i(sb3.toString());
        }
    }

    /* renamed from: a */
    public static File m5613a(String str, String str2) {
        File file;
        m5614a(str);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
            file = new File(sb.toString());
            try {
                if (!file.exists()) {
                    boolean createNewFile = file.createNewFile();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("makeFilePath, ");
                    sb2.append(str2);
                    sb2.append(", success: ");
                    sb2.append(createNewFile);
                    PaFaceLogger.m2758i(sb2.toString());
                }
            } catch (Exception e) {
                e = e;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("makeFilePath throws exception: ");
                sb3.append(e.getMessage());
                PaFaceLogger.m2758i(sb3.toString());
                return file;
            }
        } catch (Exception e2) {
            e = e2;
            file = null;
            StringBuilder sb32 = new StringBuilder();
            sb32.append("makeFilePath throws exception: ");
            sb32.append(e.getMessage());
            PaFaceLogger.m2758i(sb32.toString());
            return file;
        }
        return file;
    }

    /* renamed from: a */
    public static void m5614a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                boolean mkdir = file.mkdir();
                StringBuilder sb = new StringBuilder();
                sb.append("makeRootDirectory, ");
                sb.append(str);
                sb.append(", success: ");
                sb.append(mkdir);
                PaFaceLogger.m2758i(sb.toString());
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("makeRootDirectory throws exception: ");
            sb2.append(e.getMessage());
            PaFaceLogger.m2758i(sb2.toString());
        }
    }
}
