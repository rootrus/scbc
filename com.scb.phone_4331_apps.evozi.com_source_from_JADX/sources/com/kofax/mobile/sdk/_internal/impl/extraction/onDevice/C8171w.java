package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.graphics.Rect;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.DocumentConsolidator;
import com.kofax.android.abc.document.Field;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.w */
class C8171w implements C7908c {
    @HmlPinActivity
    C8171w() {
    }

    /* renamed from: a */
    public List<DataField> mo54313a(List<DataField> list, List<DataField> list2) {
        Document document;
        Document document2;
        if (list == null) {
            return m4420t(list2);
        }
        if (list2 == null) {
            return m4420t(list);
        }
        try {
            document2 = m4419s(list);
            try {
                document = m4419s(list2);
                try {
                    Document mergeDocument = new DocumentConsolidator().mergeDocument(document2, document);
                    List<DataField> c = m4417c(mergeDocument);
                    m4418d(mergeDocument);
                    m4418d(document);
                    m4418d(document2);
                    return c;
                } catch (Throwable th) {
                    th = th;
                    m4418d((Document) null);
                    m4418d(document);
                    m4418d(document2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                document = null;
                m4418d((Document) null);
                m4418d(document);
                m4418d(document2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            document2 = null;
            document = null;
            m4418d((Document) null);
            m4418d(document);
            m4418d(document2);
            throw th;
        }
    }

    /* renamed from: s */
    private static Document m4419s(List<DataField> list) {
        Document document = new Document();
        try {
            document.addPage(0, 1, 1);
            for (DataField next : list) {
                document.addField(0, m4416b(next), next.getName(), next.getObject(), (float) next.getConfidence());
            }
            return document;
        } catch (Throwable th) {
            document.dispose();
            throw th;
        }
    }

    /* renamed from: t */
    private static List<DataField> m4420t(List<DataField> list) {
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    /* renamed from: c */
    private static List<DataField> m4417c(Document document) {
        ArrayList arrayList = new ArrayList(document.getFields().size());
        Iterator<Field> it = document.getFields().iterator();
        while (it.hasNext()) {
            arrayList.add(DataField.fromExtractorField(it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Rect m4416b(DataField dataField) {
        Rect rect = new Rect();
        FieldLocation location = dataField.getLocation();
        if (location != null) {
            rect.left = (int) location.origin.f4794x;
            rect.top = (int) location.origin.f4795y;
            rect.right = (int) (location.origin.f4794x + location.size.width);
            rect.bottom = (int) (location.origin.f4795y + location.size.height);
        }
        return rect;
    }

    /* renamed from: d */
    private static void m4418d(Document document) {
        if (document != null) {
            document.dispose();
        }
    }
}
