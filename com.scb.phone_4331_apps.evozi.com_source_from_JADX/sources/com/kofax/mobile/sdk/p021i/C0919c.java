package com.kofax.mobile.sdk.p021i;

import com.google.gson.Gson;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0704a;
import com.kofax.mobile.sdk.p016b.C0862c;
import java.io.File;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import p040o.HmlPinActivity;
import p040o.SetupQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.i.c */
public class C0919c implements C0862c {
    private static final String MODEL = "Extractor.model";

    /* renamed from: yT */
    private static final String f2192yT = "EvrsOpString1.txt";

    /* renamed from: yU */
    private static final String f2193yU = "EvrsOpString2.txt";

    /* renamed from: yV */
    private static final String f2194yV = "Extractor.config";

    /* renamed from: yW */
    private static final String f2195yW = "cities.zip";

    /* renamed from: yX */
    private static final String f2196yX = "VariantsList.json";

    /* renamed from: yY */
    private static final String f2197yY = "OCR.config";

    /* renamed from: yZ */
    private static final String f2198yZ = ".traineddata";

    /* renamed from: yR */
    private final C0925i f2199yR;

    @HmlPinActivity
    public C0919c(C0704a aVar) {
        if (aVar != null) {
            this.f2199yR = new C0925i(aVar.get());
            return;
        }
        throw new IllegalArgumentException("provider cannot be null");
    }

    /* renamed from: f */
    public boolean mo12123f(String str, String str2) {
        try {
            return SetupQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver(new Gson().getAdapter(String[].class).fromJson(IOUtils.toString(m2377s(str, f2196yX).toURI())), str2);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public File mo12124g(String str, String str2) {
        return m2375b(str, str2, f2194yV);
    }

    /* renamed from: J */
    public File mo12121J(String str) {
        File s = m2377s(str, f2195yW);
        if (!s.exists()) {
            return null;
        }
        return s;
    }

    /* renamed from: s */
    private File m2377s(String str, String str2) {
        return new File(m2373W(str), str2);
    }

    /* renamed from: W */
    private File m2373W(String str) {
        return this.f2199yR.getProject(str, this.f2199yR.mo12315X(str));
    }

    /* renamed from: h */
    public File mo12125h(String str, String str2) {
        return m2375b(str, str2, MODEL);
    }

    /* renamed from: i */
    public String mo12126i(String str, String str2) {
        return m2376c(str, str2, f2192yT);
    }

    /* renamed from: j */
    public String mo12127j(String str, String str2) {
        return m2376c(str, str2, f2193yU);
    }

    /* renamed from: k */
    public File mo12128k(String str, String str2) {
        return m2375b(str, str2, f2197yY);
    }

    /* renamed from: K */
    public String mo12122K(String str) {
        File W = m2373W(str);
        return W.listFiles(new SuffixFileFilter(f2198yZ)).length > 0 ? W.getAbsolutePath() : "";
    }

    /* renamed from: b */
    private File m2375b(String str, String str2, String str3) {
        return m2374b(new File(this.f2199yR.getVariant(str, str2, this.f2199yR.mo12315X(str)), str3));
    }

    /* renamed from: b */
    private File m2374b(File file) {
        if (file != null && file.exists()) {
            return file;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
    }

    /* renamed from: c */
    private String m2376c(String str, String str2, String str3) {
        try {
            return IOUtils.toString(m2375b(str, str2, str3).toURI(), Charset.defaultCharset()).replaceAll("\r\n", "");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
