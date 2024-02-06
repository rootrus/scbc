package com.kofax.mobile.sdk._internal.impl.camera;

import android.os.Environment;
import android.text.format.DateFormat;
import com.kofax.mobile.sdk._internal.C0767k;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.aj */
class C0561aj {

    /* renamed from: Ds */
    static final String f1277Ds = "/kofax_videos/";

    /* renamed from: Dt */
    static final String f1278Dt = ".mp4";

    /* renamed from: Du */
    static final String f1279Du = ".data";

    /* renamed from: Dv */
    static final String f1280Dv = ":";

    /* renamed from: Dw */
    private static final Object f1281Dw = new Object();

    /* renamed from: Dx */
    public static File f1282Dx;

    C0561aj() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append(f1277Ds);
        File file = new File(sb.toString());
        f1282Dx = file;
        if (!file.exists()) {
            f1282Dx.mkdirs();
        }
    }

    /* renamed from: kk */
    public static String m1143kk() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append(f1277Ds);
        sb.append(m1142e(System.currentTimeMillis()));
        sb.append(f1278Dt);
        return new File(sb.toString()).getAbsolutePath();
    }

    /* renamed from: a */
    public static boolean m1140a(File file, String str) {
        boolean z = false;
        try {
            synchronized (f1281Dw) {
                if (file != null) {
                    file.createNewFile();
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true), 1024);
                    bufferedWriter.write(str);
                    bufferedWriter.write("\n");
                    bufferedWriter.close();
                    z = true;
                }
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error appending string data to file ");
            sb.append(e.getMessage());
            C0767k.m1821e("TAG", sb.toString(), (Throwable) e);
        }
        return z;
    }

    /* renamed from: kl */
    public static List<String> m1144kl() {
        ArrayList arrayList = new ArrayList();
        List<File> km = m1145km();
        if (km.size() == 0) {
            return arrayList;
        }
        for (File absolutePath : km) {
            arrayList.add(absolutePath.getAbsolutePath());
        }
        return arrayList;
    }

    /* renamed from: ag */
    public static String m1141ag(String str) {
        List<File> km = m1145km();
        if (km.size() == 0) {
            return str;
        }
        for (File next : km) {
            if (str.equals(next.getName())) {
                return next.getAbsolutePath();
            }
        }
        return str;
    }

    /* renamed from: a */
    private static String m1139a(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return DateFormat.format("dd.MM.yyyy_kk.mm.ss", instance).toString();
    }

    /* renamed from: e */
    private static final String m1142e(long j) {
        return m1139a(new Date(j));
    }

    /* renamed from: km */
    private static List<File> m1145km() {
        File[] listFiles = f1282Dx.listFiles();
        ArrayList arrayList = new ArrayList();
        if (listFiles == null) {
            return arrayList;
        }
        for (File file : listFiles) {
            if (file.getName().endsWith(f1278Dt)) {
                StringBuilder sb = new StringBuilder();
                sb.append(file.getAbsolutePath());
                sb.append(f1279Du);
                if (new File(sb.toString()).exists()) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }
}
