package com.kofax.mobile.sdk.p080t;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.PrefixFileFilter;

/* renamed from: com.kofax.mobile.sdk.t.d */
class C8472d {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    /* renamed from: NH */
    private final File f5050NH;

    /* renamed from: NI */
    private String f5051NI;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C8472d(java.lang.String r4) {
        /*
            r3 = this;
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "com.kofax.mobile.sdk/ode/"
            r1.append(r2)
            r1.append(r4)
            java.io.File r4 = new java.io.File
            java.lang.String r1 = r1.toString()
            r4.<init>(r0, r1)
            r3.<init>((java.io.File) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p080t.C8472d.<init>(java.lang.String):void");
    }

    /* renamed from: az */
    public void mo55373az(String str) {
        this.f5051NI = str;
    }

    private C8472d(File file) {
        this.f5051NI = null;
        this.f5050NH = file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo55371B(String str, String str2) {
        mo55375e(str, str2, "txt");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo55375e(String str, String str2, String str3) {
        m5099a(str.getBytes(UTF_8), str2, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55372a(Bitmap bitmap, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        m5099a(byteArrayOutputStream.toByteArray(), str, "png");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55374b(File file, String str) {
        try {
            FileUtils.copyFile(file, m5098C(str, FilenameUtils.getExtension(file.getName())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private void m5099a(byte[] bArr, String str, String str2) {
        try {
            FileUtils.writeByteArrayToFile(m5098C(str, str2), bArr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: C */
    private File m5098C(String str, String str2) {
        File file;
        File file2 = this.f5050NH;
        String str3 = this.f5051NI;
        if (!(str3 == null || str3.length() == 0)) {
            file2 = new File(this.f5050NH, this.f5051NI);
        }
        if (file2.exists() || file2.mkdirs()) {
            do {
                file = new File(file2, String.format("%s_%s.%s", new Object[]{m5101e(file2), str, str2}));
                try {
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (!file.createNewFile());
            return file;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to createdirectory: ");
        sb.append(file2);
        throw new RuntimeException(new IOException(sb.toString()));
    }

    /* renamed from: e */
    private static String m5101e(File file) {
        String format = new SimpleDateFormat("yyMMdd_HHmmss", Locale.US).format(new Date());
        int i = 1;
        while (true) {
            String format2 = String.format(Locale.US, "%s_%03d", new Object[]{format, Integer.valueOf(i)});
            if (m5100c(file, format2).length == 0) {
                return format2;
            }
            i++;
        }
    }

    /* renamed from: c */
    private static File[] m5100c(File file, String str) {
        return file.listFiles(new PrefixFileFilter(str));
    }
}
