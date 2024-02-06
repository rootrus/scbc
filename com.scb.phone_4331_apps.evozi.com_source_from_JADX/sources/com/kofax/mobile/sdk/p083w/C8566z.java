package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.ModifyQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.w.z */
public class C8566z extends C8500ae {

    /* renamed from: Qg */
    private static final double f5253Qg = 80.0d;

    /* renamed from: Qh */
    private final C8567a f5254Qh;

    /* renamed from: Qi */
    private final C7917o f5255Qi;

    /* renamed from: com.kofax.mobile.sdk.w.z$a */
    public interface C8567a {

        /* renamed from: com.kofax.mobile.sdk.w.z$a$a */
        public static abstract class C8568a {
            /* renamed from: e */
            public abstract void mo55474e(DataField dataField);

            /* renamed from: f */
            public abstract void mo55475f(DataField dataField);

            /* renamed from: g */
            public abstract void mo55476g(DataField dataField);

            /* renamed from: oL */
            public abstract DataField mo55477oL();

            /* renamed from: oM */
            public abstract DataField mo55478oM();

            /* renamed from: oN */
            public abstract DataField mo55479oN();
        }

        /* renamed from: a */
        void mo55470a(C8340a aVar, Exception exc);

        /* renamed from: u */
        boolean mo55471u(C8340a aVar);

        /* renamed from: v */
        C8568a mo55472v(C8340a aVar);

        /* renamed from: w */
        C8568a mo55473w(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8566z(C8567a aVar, C7917o oVar) {
        this.f5254Qh = aVar;
        this.f5255Qi = oVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        try {
            if (m5368p(aVar)) {
                m5369q(aVar);
            }
            e = null;
        } catch (Exception e) {
            e = e;
        }
        this.f5254Qh.mo55470a(aVar, e);
    }

    /* renamed from: p */
    private boolean m5368p(C8340a aVar) {
        C8567a.C8568a w = this.f5254Qh.mo55473w(aVar);
        return this.f5254Qh.mo55471u(aVar) && !(w.mo55477oL() == null && w.mo55478oM() == null && w.mo55479oN() == null);
    }

    /* renamed from: q */
    private void m5369q(C8340a aVar) {
        if (m5370r(aVar)) {
            m5371s(aVar);
        } else {
            m5372t(aVar);
        }
    }

    /* renamed from: r */
    private boolean m5370r(C8340a aVar) {
        C8567a.C8568a v = this.f5254Qh.mo55472v(aVar);
        return (v.mo55477oL() == null && v.mo55478oM() == null && v.mo55479oN() == null) ? false : true;
    }

    /* renamed from: s */
    private void m5371s(C8340a aVar) {
        C8567a.C8568a w = this.f5254Qh.mo55473w(aVar);
        DataField oL = w.mo55477oL();
        DataField oM = w.mo55478oM();
        DataField oN = w.mo55479oN();
        C8567a.C8568a v = this.f5254Qh.mo55472v(aVar);
        DataField oL2 = v.mo55477oL();
        DataField oM2 = v.mo55478oM();
        DataField oN2 = v.mo55479oN();
        StringBuilder sb = new StringBuilder();
        sb.append(oN2.getObject());
        sb.append(" ");
        sb.append(oL2.getObject());
        sb.append(" ");
        sb.append(oM2.getObject());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(oN.getObject());
        sb2.append(" ");
        sb2.append(oL.getObject());
        sb2.append(" ");
        sb2.append(oM.getObject());
        String obj2 = sb2.toString();
        if (m5365F(obj, obj2)) {
            ArrayList arrayList = new ArrayList(Arrays.asList(obj2.split(" ")));
            DataField a = m5367a(oN2, oN, arrayList);
            DataField a2 = m5367a(oL2, oL, arrayList);
            DataField a3 = m5367a(oM2, oM, arrayList);
            v.mo55474e(a2);
            v.mo55475f(a3);
            v.mo55476g(a);
            w.mo55474e(a2);
            w.mo55475f(a3);
            w.mo55476g(a);
        }
    }

    /* renamed from: F */
    private boolean m5365F(String str, String str2) {
        return m5366G(str, str2) > f5253Qg;
    }

    /* renamed from: G */
    private double m5366G(String str, String str2) {
        double length = (double) str.length();
        return ((length - this.f5255Qi.mo54323p(str, str2)) * 100.0d) / length;
    }

    /* renamed from: a */
    private DataField m5367a(DataField dataField, DataField dataField2, List<String> list) {
        String object = dataField.getObject();
        String str = "";
        if (!(object == null || object.length() == 0)) {
            for (int length = object.split(" ").length; length > 0; length--) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(list.remove(0));
                sb.append(" ");
                str = sb.toString();
            }
        }
        String trim = str.trim();
        char[] charArray = object.toCharArray();
        char[] charArray2 = trim.toCharArray();
        if (charArray2.length < charArray.length) {
            System.arraycopy(charArray2, 0, charArray, 0, trim.length());
            trim = new String(charArray);
        }
        return new DataField(dataField.getName(), trim, dataField2.getConfidence(), dataField.getLocation());
    }

    /* renamed from: t */
    private void m5372t(C8340a aVar) {
        C8567a.C8568a w = this.f5254Qh.mo55473w(aVar);
        DataField oL = w.mo55477oL();
        DataField oM = w.mo55478oM();
        DataField oN = w.mo55479oN();
        StringBuilder sb = new StringBuilder();
        sb.append(oN.getObject());
        sb.append(" ");
        sb.append(oL.getObject());
        String obj = sb.toString();
        String[] MediaBrowserCompat$CustomActionResultReceiver = ModifyQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(oM.getObject(), " ");
        String str = "";
        String str2 = MediaBrowserCompat$CustomActionResultReceiver.length > 0 ? MediaBrowserCompat$CustomActionResultReceiver[0] : str;
        if (MediaBrowserCompat$CustomActionResultReceiver.length > 1) {
            str = MediaBrowserCompat$CustomActionResultReceiver[1];
        }
        DataField dataField = new DataField("FirstName", str2, oL.getConfidence(), oL.getLocation());
        DataField dataField2 = new DataField("LastName", obj, oN.getConfidence(), oN.getLocation());
        DataField dataField3 = new DataField("MiddleName", str, oM.getConfidence(), oM.getLocation());
        w.mo55474e(dataField);
        w.mo55475f(dataField3);
        w.mo55476g(dataField2);
    }
}
