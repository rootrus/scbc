package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Field;
import com.kofax.android.abc.quickextractor.MrzExtractor;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.h */
public class C8163h {

    /* renamed from: RT */
    private static final double f4192RT = 0.25d;

    /* renamed from: RU */
    private final MrzExtractor f4193RU = new MrzExtractor();

    public void destroy() {
        this.f4193RU.dispose();
    }

    /* renamed from: a */
    public C8161f mo54569a(C8160e eVar) {
        Document extract;
        VrsImage qd = eVar.mo54558qd();
        try {
            extract = this.f4193RU.extract(qd);
            C8161f a = m4395a(eVar, extract);
            if (m4394a(a) < f4192RT) {
                a = null;
            }
            extract.dispose();
            qd.dispose();
            return a;
        } catch (Throwable th) {
            qd.dispose();
            throw th;
        }
    }

    /* renamed from: a */
    private C8161f m4395a(C8160e eVar, Document document) {
        return new C8161f(m4396e(document), eVar.mo54560qf());
    }

    /* renamed from: a */
    private static double m4394a(C8161f fVar) {
        List<DataField> fields = fVar.getFields();
        if (fields.isEmpty()) {
            return 0.0d;
        }
        double d = 1.0d;
        for (DataField next : fields) {
            if (!m4397h(next) && !m4398i(next)) {
                d = Math.min(d, next.getConfidence());
            }
        }
        return d;
    }

    /* renamed from: e */
    private static List<DataField> m4396e(Document document) {
        ArrayList<Field> fields = document.getFields();
        ArrayList arrayList = new ArrayList(fields.size());
        for (Field fromExtractorField : fields) {
            arrayList.add(DataField.fromExtractorField(fromExtractorField));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static boolean m4397h(DataField dataField) {
        return dataField.getName().startsWith("MRZ");
    }

    /* renamed from: i */
    private static boolean m4398i(DataField dataField) {
        return dataField.getConfidence() < 0.01d;
    }
}
