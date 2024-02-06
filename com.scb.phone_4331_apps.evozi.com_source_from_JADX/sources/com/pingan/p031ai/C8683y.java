package com.pingan.p031ai;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.pingan.ai.y */
public final class C8683y {

    /* renamed from: com.pingan.ai.y$a */
    public static final class C8684a implements FileFilter {
        public final boolean accept(File file) {
            return true;
        }
    }

    /* renamed from: com.pingan.ai.y$b */
    public interface C8685b {
        /* renamed from: a */
        boolean mo55598a(File file, File file2);
    }

    static {
        System.getProperty("line.separator");
    }

    /* renamed from: a */
    public static File m5722a(String str) {
        if (m5732b(str)) {
            return null;
        }
        return new File(str);
    }

    /* renamed from: b */
    public static boolean m5730b(File file, File file2, C8685b bVar) {
        return m5725a(file, file2, bVar, false);
    }

    /* renamed from: c */
    public static boolean m5734c(File file, File file2, C8685b bVar) {
        return m5731b(file, file2, bVar, false);
    }

    /* renamed from: d */
    public static boolean m5735d(File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    /* renamed from: a */
    public static boolean m5723a(File file) {
        return file != null && (!file.exists() ? file.mkdirs() : file.isDirectory());
    }

    /* renamed from: b */
    public static boolean m5731b(File file, File file2, C8685b bVar, boolean z) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (bVar != null && !bVar.mo55598a(file, file2)) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!m5723a(file2.getParentFile())) {
                return false;
            }
            try {
                if (!m5727a(file2, (InputStream) new FileInputStream(file))) {
                    return false;
                }
                if (!z || m5735d(file)) {
                    return true;
                }
                return false;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m5733c(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !m5733c(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static boolean m5728a(String str, String str2) {
        return m5724a(m5722a(str), m5722a(str2), (C8685b) null);
    }

    /* renamed from: a */
    public static boolean m5724a(File file, File file2, C8685b bVar) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return m5730b(file, file2, bVar);
        }
        return m5734c(file, file2, bVar);
    }

    /* renamed from: a */
    public static boolean m5725a(File file, File file2, C8685b bVar, boolean z) {
        if (file == null || file2 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(File.separator);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file2.getPath());
        sb2.append(File.separator);
        String obj2 = sb2.toString();
        if (obj2.contains(obj) || !file.exists() || !file.isDirectory() || !m5723a(file2)) {
            return false;
        }
        for (File file3 : file.listFiles()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(file3.getName());
            File file4 = new File(sb3.toString());
            if (file3.isFile()) {
                if (!m5731b(file3, file4, bVar, z)) {
                    return false;
                }
            } else if (file3.isDirectory() && !m5725a(file3, file4, bVar, z)) {
                return false;
            }
        }
        if (!z || m5733c(file)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m5729b(File file) {
        return m5726a(file, (FileFilter) new C8684a());
    }

    /* renamed from: b */
    public static boolean m5732b(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5726a(File file, FileFilter fileFilter) {
        if (file == null || fileFilter == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !m5733c(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC, Splitter:B:29:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0056 A[SYNTHETIC, Splitter:B:40:0x0056] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5727a(java.io.File r5, java.io.InputStream r6) {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0034 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0034 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0034 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0034 }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r5]     // Catch:{ IOException -> 0x002f, all -> 0x002d }
        L_0x0010:
            int r3 = r6.read(r1, r0, r5)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            r4 = -1
            if (r3 == r4) goto L_0x001b
            r2.write(r1, r0, r3)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            goto L_0x0010
        L_0x001b:
            r6.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0023:
            r2.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r5 = move-exception
            r5.printStackTrace()
        L_0x002b:
            r5 = 1
            return r5
        L_0x002d:
            r5 = move-exception
            goto L_0x004c
        L_0x002f:
            r5 = move-exception
            r1 = r2
            goto L_0x0035
        L_0x0032:
            r5 = move-exception
            goto L_0x004b
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            r5.printStackTrace()     // Catch:{ all -> 0x0032 }
            r6.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0040:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r5 = move-exception
            r5.printStackTrace()
        L_0x004a:
            return r0
        L_0x004b:
            r2 = r1
        L_0x004c:
            r6.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0054:
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x005e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pingan.p031ai.C8683y.m5727a(java.io.File, java.io.InputStream):boolean");
    }
}
