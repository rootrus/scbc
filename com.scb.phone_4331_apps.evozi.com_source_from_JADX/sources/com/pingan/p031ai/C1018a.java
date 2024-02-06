package com.pingan.p031ai;

import android.content.Context;
import android.os.AsyncTask;
import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.entity.PaFaceDetectFrame;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import java.io.File;

/* renamed from: com.pingan.ai.a */
public class C1018a {

    /* renamed from: a */
    public String f2430a;

    /* renamed from: b */
    public StringBuilder f2431b;

    /* renamed from: com.pingan.ai.a$a */
    public static class C1019a {

        /* renamed from: a */
        public static final C1018a f2432a = new C1018a();
    }

    /* renamed from: com.pingan.ai.a$b */
    public static class C1020b extends AsyncTask<PaFaceDetectFrame, Integer, Object> {

        /* renamed from: a */
        public String f2433a;

        /* renamed from: b */
        public String f2434b;

        /* renamed from: c */
        public LiveFaceConfig f2435c;

        public C1020b(String str, String str2, LiveFaceConfig liveFaceConfig) {
            this.f2433a = str;
            this.f2434b = str2;
            this.f2435c = liveFaceConfig;
        }

        /* renamed from: a */
        public native Object doInBackground(PaFaceDetectFrame... paFaceDetectFrameArr);
    }

    /* renamed from: c */
    public static C1018a m2608c() {
        return C1019a.f2432a;
    }

    /* renamed from: a */
    public String mo12481a() {
        return this.f2430a;
    }

    /* renamed from: a */
    public void mo12482a(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        StringBuilder sb = new StringBuilder();
        sb.append("PAFaceSDK");
        sb.append(File.separator);
        sb.append("logs");
        File file = new File(externalFilesDir, sb.toString());
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sdkRootPath.mkdirs suc: ");
            sb2.append(mkdirs);
            PaFaceLogger.m2758i(sb2.toString());
        }
        this.f2430a = file.getAbsolutePath();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("debug log dir: ");
        sb3.append(this.f2430a);
        PaFaceLogger.m2758i(sb3.toString());
    }

    /* renamed from: a */
    public native void mo12483a(String str, String str2, LiveFaceConfig liveFaceConfig);

    /* renamed from: b */
    public StringBuilder mo12484b() {
        if (this.f2431b == null) {
            this.f2431b = new StringBuilder();
        }
        return this.f2431b;
    }
}
