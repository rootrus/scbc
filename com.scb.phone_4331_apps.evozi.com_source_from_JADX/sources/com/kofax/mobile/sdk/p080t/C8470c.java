package com.kofax.mobile.sdk.p080t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Element;
import com.kofax.android.abc.document.Field;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.commonextractionengine.LogConfig;
import com.kofax.mobile.commonextractionengine.recognition.TextRecognizer;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0719e;
import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p072am.C8287b;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* renamed from: com.kofax.mobile.sdk.t.c */
class C8470c extends C0719e {

    /* renamed from: NC */
    private final C8472d f5046NC;

    /* renamed from: NE */
    private final C8471a f5047NE = new C8471a();

    /* renamed from: NF */
    private C8473e f5048NF;

    C8470c(Context context, C0862c cVar, C0530i iVar, C8472d dVar, C8473e eVar) {
        super(context, cVar, iVar);
        this.f5046NC = dVar;
        this.f5048NF = eVar;
    }

    /* renamed from: a */
    public Document mo11746a(TextRecognizer textRecognizer, VrsImage vrsImage) {
        this.f5047NE.mo55370os();
        C8287b bVar = new C8287b();
        try {
            Document f = bVar.mo54755f(super.mo11746a(textRecognizer, vrsImage));
            if (this.f5047NE.mo55366av("evrs_ops_phase1.txt")) {
                this.f5046NC.mo55371B(this.f5047NE.mo55367aw("evrs_ops_phase1.txt"), "p1_evrs_operations");
                Bitmap o = bVar.mo54757o(this.f5047NE.mo55368ax("evrs_image_phase1.jpg"));
                this.f5046NC.mo55372a(o, "p1_evrs_result");
                String aw = this.f5047NE.mo55367aw("evrs_results_phase1.txt");
                this.f5046NC.mo55375e(aw, "p1_evrs_metadata", "json");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55378b(o, aw)), "p1_evrs_words");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55377b(o, (Iterable<Field>) f.getFields())), "p1_evrs_fields");
            }
            if (this.f5047NE.mo55366av("tesseract_image_phase1.jpg")) {
                Bitmap o2 = bVar.mo54757o(this.f5047NE.mo55368ax("tesseract_image_phase1.jpg"));
                this.f5046NC.mo55372a(o2, "p1_tess_result");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55376a(o2, (Iterable<Element>) f.getElements())), "p1_tess_words");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55379c(o2, f.getElements())), "p1_tess_values");
            }
            return (Document) bVar.mo54756f(f);
        } finally {
            bVar.dispose();
        }
    }

    /* renamed from: a */
    public Document mo11747a(TextRecognizer textRecognizer, VrsImage vrsImage, Document document) {
        C8287b bVar = new C8287b();
        try {
            if (this.f5047NE.mo55366av("tesseract_image_phase1.jpg")) {
                Bitmap o = bVar.mo54757o(this.f5047NE.mo55368ax("tesseract_image_phase1.jpg"));
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55377b(o, (Iterable<Field>) document.getFields())), "p1_tess_fields");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55380d(o, document.getFields())), "p1_tess_values");
            }
            Document f = bVar.mo54755f(super.mo11747a(textRecognizer, vrsImage, document));
            if (this.f5047NE.mo55366av("evrs_ops_phase2.txt")) {
                this.f5046NC.mo55371B(this.f5047NE.mo55367aw("evrs_ops_phase2.txt"), "p2_evrs_operations");
                Bitmap o2 = bVar.mo54757o(this.f5047NE.mo55368ax("evrs_image_phase2.jpg"));
                this.f5046NC.mo55372a(o2, "p2_evrs_result");
                String aw = this.f5047NE.mo55367aw("evrs_results_phase2.txt");
                this.f5046NC.mo55375e(aw, "p2_evrs_metadata", "json");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55378b(o2, aw)), "p2_evrs_words");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55377b(o2, (Iterable<Field>) f.getFields())), "p2_evrs_fields");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55380d(o2, f.getFields())), "p2_evrs_values");
            }
            if (this.f5047NE.mo55366av("tesseract_image_phase2.jpg")) {
                Bitmap o3 = bVar.mo54757o(this.f5047NE.mo55368ax("tesseract_image_phase2.jpg"));
                this.f5046NC.mo55372a(o3, "p2_tess_result");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55377b(o3, (Iterable<Field>) f.getFields())), "p2_tess_fields");
                this.f5046NC.mo55372a(bVar.mo54757o(this.f5048NF.mo55380d(o3, f.getFields())), "p2_tess_values");
            }
            return (Document) bVar.mo54756f(f);
        } finally {
            bVar.dispose();
        }
    }

    /* renamed from: com.kofax.mobile.sdk.t.c$a */
    static class C8471a {

        /* renamed from: NG */
        private static final File f5049NG = new File(Environment.getExternalStorageDirectory(), "com.kofax.mobile.sdk/cee/dump");

        C8471a() {
            LogConfig.setLogEnabled(true);
            if (f5049NG.exists() || f5049NG.mkdirs()) {
                LogConfig.setDumpDir(f5049NG.getPath());
                LogConfig.setEvrsDumpEnabled(true);
                LogConfig.setTesseractDumpEnabled(true);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create directory '");
            sb.append(f5049NG);
            sb.append("'");
            throw new RuntimeException(new IOException(sb.toString()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: av */
        public boolean mo55366av(String str) {
            return mo55369ay(str).exists();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: aw */
        public String mo55367aw(String str) {
            try {
                return FileUtils.readFileToString(mo55369ay(str), "UTF-8");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ax */
        public Bitmap mo55368ax(String str) {
            return BitmapFactory.decodeFile(mo55369ay(str).getAbsolutePath());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ay */
        public File mo55369ay(String str) {
            return new File(f5049NG, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: os */
        public void mo55370os() {
            try {
                FileUtils.cleanDirectory(f5049NG);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
