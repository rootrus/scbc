package com.kofax.mobile.sdk.p011ag;

import android.os.Environment;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p015ak.C0858b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.ag.a */
public class C0808a implements C0858b {

    /* renamed from: UX */
    private static final int f1966UX = 4000;
    public final String DATE_FORMAT = "dd.MM.yyyy_kk.mm.ss";

    /* renamed from: UT */
    public final String f1967UT = "kofax_mobile_sdk";

    /* renamed from: UU */
    public final C0809a f1968UU = C0809a.VERBOSE;

    /* renamed from: UV */
    private final boolean f1969UV = false;

    /* renamed from: UW */
    private final Map<String, Boolean> f1970UW = new HashMap();

    /* renamed from: UY */
    private final String f1971UY = ")";

    /* renamed from: UZ */
    private final String f1972UZ = "> (";

    /* renamed from: Va */
    private final String f1973Va = " > ";

    /* renamed from: Vb */
    public final String f1974Vb = "/.kofax_mobile_sdk.txt";

    /* renamed from: Vc */
    private final Object[] f1975Vc = new Object[0];

    /* renamed from: Vd */
    public File f1976Vd;

    @HmlPinActivity
    public C0808a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/.kofax_mobile_sdk.txt");
        this.f1976Vd = new File(sb.toString());
    }

    /* renamed from: c */
    public void mo11996c(String str, boolean z) {
        this.f1970UW.put(str, Boolean.valueOf(z));
    }

    /* renamed from: B */
    public void mo11976B(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11982a("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: C */
    public void mo11977C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11987b("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: D */
    public void mo11978D(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11993c("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: E */
    public void mo11979E(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12000d("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: F */
    public void mo11980F(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12006e("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: a */
    public void mo11984a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11983a("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: b */
    public void mo11989b(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11988b("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: c */
    public void mo11995c(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11994c("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: d */
    public void mo12002d(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12001d("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: e */
    public void mo12008e(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12007e("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: a */
    public void mo11985a(Throwable th) {
        mo11983a("kofax_mobile_sdk", getLocation(), th);
    }

    /* renamed from: b */
    public void mo11990b(Throwable th) {
        mo11988b("kofax_mobile_sdk", getLocation(), th);
    }

    /* renamed from: c */
    public void mo11997c(Throwable th) {
        mo11994c("kofax_mobile_sdk", getLocation(), th);
    }

    /* renamed from: d */
    public void mo12003d(Throwable th) {
        mo12001d("kofax_mobile_sdk", getLocation(), th);
    }

    /* renamed from: e */
    public void mo12009e(Throwable th) {
        mo12007e("kofax_mobile_sdk", getLocation(), th);
    }

    /* renamed from: c */
    public void mo11991c(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11982a("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: d */
    public void mo11998d(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11987b("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: e */
    public void mo12004e(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11993c("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: f */
    public void mo12010f(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12000d("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: g */
    public void mo12011g(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12006e("kofax_mobile_sdk", sb.toString());
    }

    /* renamed from: a */
    public void mo11981a(Object obj, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11983a("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: b */
    public void mo11986b(Object obj, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11988b("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: c */
    public void mo11992c(Object obj, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo11994c("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: d */
    public void mo11999d(Object obj, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12001d("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: e */
    public void mo12005e(Object obj, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("> (");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        sb.append(getLocation());
        sb.append(" ");
        sb.append(str);
        mo12007e("kofax_mobile_sdk", sb.toString(), th);
    }

    /* renamed from: a */
    public void mo11982a(String str, String str2) {
        if (this.f1968UU.mo12015rx() && m1963ru()) {
            m1951J(str, str2);
        }
    }

    /* renamed from: b */
    public void mo11987b(String str, String str2) {
        if (this.f1968UU.mo12016ry() && m1963ru()) {
            m1952K(str, str2);
        }
    }

    /* renamed from: c */
    public void mo11993c(String str, String str2) {
        if (this.f1968UU.mo12017rz() && m1963ru()) {
            m1953L(str, str2);
        }
    }

    /* renamed from: d */
    public void mo12000d(String str, String str2) {
        if (this.f1968UU.mo12013rA() && m1963ru()) {
            m1954M(str, str2);
        }
    }

    /* renamed from: e */
    public void mo12006e(String str, String str2) {
        if (this.f1968UU.mo12014rB() && m1963ru()) {
            m1955N(str, str2);
        }
    }

    /* renamed from: a */
    public void mo11983a(String str, String str2, Throwable th) {
        if (this.f1968UU.mo12015rx() && m1963ru()) {
            m1958f(str, str2, th);
        }
    }

    /* renamed from: b */
    public void mo11988b(String str, String str2, Throwable th) {
        if (this.f1968UU.mo12016ry() && m1963ru()) {
            m1959g(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo11994c(String str, String str2, Throwable th) {
        if (this.f1968UU.mo12017rz() && m1963ru()) {
            m1960h(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo12001d(String str, String str2, Throwable th) {
        if (this.f1968UU.mo12013rA() && m1963ru()) {
            m1961i(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo12007e(String str, String str2, Throwable th) {
        if (this.f1968UU.mo12014rB() && m1963ru()) {
            m1962j(str, str2, th);
        }
    }

    /* renamed from: J */
    private void m1951J(String str, String str2) {
        while (str2.length() > f1966UX) {
            Log.v(str, str2.substring(0, f1966UX));
            str2 = str2.substring(f1966UX);
        }
        Log.v(str, str2);
    }

    /* renamed from: K */
    private void m1952K(String str, String str2) {
        while (str2.length() > f1966UX) {
            Log.d(str, str2.substring(0, f1966UX));
            str2 = str2.substring(f1966UX);
        }
        Log.d(str, str2);
    }

    /* renamed from: L */
    private void m1953L(String str, String str2) {
        while (str2.length() > f1966UX) {
            Log.i(str, str2.substring(0, f1966UX));
            str2 = str2.substring(f1966UX);
        }
        Log.i(str, str2);
    }

    /* renamed from: M */
    private void m1954M(String str, String str2) {
        while (str2.length() > f1966UX) {
            Log.w(str, str2.substring(0, f1966UX));
            str2 = str2.substring(f1966UX);
        }
        Log.w(str, str2);
    }

    /* renamed from: N */
    private void m1955N(String str, String str2) {
        while (str2.length() > f1966UX) {
            Log.e(str, str2.substring(0, f1966UX));
            str2 = str2.substring(f1966UX);
        }
        Log.e(str, str2);
    }

    /* renamed from: f */
    private void m1958f(String str, String str2, Throwable th) {
        if (str2.length() > f1966UX) {
            Log.v(str, str2.substring(0, f1966UX), th);
            m1951J(str, str2.substring(f1966UX));
            return;
        }
        Log.v(str, str2, th);
    }

    /* renamed from: g */
    private void m1959g(String str, String str2, Throwable th) {
        if (str2.length() > f1966UX) {
            Log.d(str, str2.substring(0, f1966UX), th);
            m1952K(str, str2.substring(f1966UX));
            return;
        }
        Log.d(str, str2, th);
    }

    /* renamed from: h */
    private void m1960h(String str, String str2, Throwable th) {
        if (str2.length() > f1966UX) {
            Log.i(str, str2.substring(0, f1966UX), th);
            m1953L(str, str2.substring(f1966UX));
            return;
        }
        Log.i(str, str2, th);
    }

    /* renamed from: i */
    private void m1961i(String str, String str2, Throwable th) {
        if (str2.length() > f1966UX) {
            Log.w(str, str2.substring(0, f1966UX), th);
            m1954M(str, str2.substring(f1966UX));
            return;
        }
        Log.w(str, str2, th);
    }

    /* renamed from: j */
    private void m1962j(String str, String str2, Throwable th) {
        if (str2.length() > f1966UX) {
            Log.e(str, str2.substring(0, f1966UX), th);
            m1955N(str, str2.substring(f1966UX));
            return;
        }
        Log.e(str, str2, th);
    }

    /* renamed from: com.kofax.mobile.sdk.ag.a$a */
    public enum C0809a {
        VERBOSE(5),
        DEBUG(4),
        INFO(3),
        WARNING(2),
        ERROR(1),
        NONE(0);
        
        private final int level;

        private C0809a(int i) {
            this.level = i;
        }

        /* renamed from: rx */
        public final boolean mo12015rx() {
            return this.level == VERBOSE.level;
        }

        /* renamed from: ry */
        public final boolean mo12016ry() {
            return this.level >= DEBUG.level;
        }

        /* renamed from: rz */
        public final boolean mo12017rz() {
            return this.level >= INFO.level;
        }

        /* renamed from: rA */
        public final boolean mo12013rA() {
            return this.level >= WARNING.level;
        }

        /* renamed from: rB */
        public final boolean mo12014rB() {
            return this.level >= ERROR.level;
        }
    }

    private String getLocation() {
        String name = C0808a.class.getName();
        boolean z = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (z) {
                try {
                    if (!stackTraceElement.getClassName().startsWith(name) && !stackTraceElement.getClassName().equals(C0767k.class.getName())) {
                        Class<?> cls = Class.forName(stackTraceElement.getClassName());
                        StringBuilder sb = new StringBuilder();
                        sb.append(" > ");
                        sb.append(m1956a(cls));
                        sb.append(":");
                        sb.append(stackTraceElement.getMethodName());
                        sb.append(":");
                        sb.append(stackTraceElement.getLineNumber());
                        return sb.toString();
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            } else if (stackTraceElement.getClassName().startsWith(name)) {
                z = true;
            }
        }
        return "[]: ";
    }

    /* renamed from: ru */
    private boolean m1963ru() {
        String rv = m1964rv();
        for (String next : this.f1970UW.keySet()) {
            if (rv.startsWith(next)) {
                return this.f1970UW.get(next).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: rv */
    private static String m1964rv() {
        String name = C0808a.class.getName();
        boolean z = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (z) {
                try {
                    if (!stackTraceElement.getClassName().startsWith(name) && !stackTraceElement.getClassName().equals(C0767k.class.getName())) {
                        return getPackageName(Class.forName(stackTraceElement.getClassName()));
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            } else if (stackTraceElement.getClassName().startsWith(name)) {
                z = true;
            }
        }
        return "[]: ";
    }

    /* renamed from: a */
    private static String m1956a(Class<?> cls) {
        while (cls != null) {
            if (!TextUtils.isEmpty(cls.getSimpleName())) {
                return cls.getSimpleName();
            }
            cls = cls.getEnclosingClass();
        }
        return "";
    }

    private static String getPackageName(Class<?> cls) {
        while (cls != null) {
            if (!TextUtils.isEmpty(cls.getPackage().getName())) {
                return cls.getPackage().getName();
            }
            cls = cls.getEnclosingClass();
        }
        return "";
    }

    /* renamed from: b */
    private boolean m1957b(String... strArr) {
        boolean z = false;
        try {
            synchronized (this.f1975Vc) {
                if (this.f1976Vd != null) {
                    this.f1976Vd.createNewFile();
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f1976Vd, true), 1024);
                    for (String append : strArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(append);
                        sb.append(";");
                        bufferedWriter.write(sb.toString());
                    }
                    bufferedWriter.write("\n");
                    bufferedWriter.close();
                    z = true;
                }
            }
        } catch (IOException unused) {
        }
        return z;
    }

    /* renamed from: rw */
    public String mo12012rw() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(System.currentTimeMillis()));
        return DateFormat.format("dd.MM.yyyy_kk.mm.ss", instance).toString();
    }
}
