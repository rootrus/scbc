package com.kofax.mobile.sdk.p029y;

import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import java.io.File;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.n */
public class C1002n implements C0862c {
    /* access modifiers changed from: private */

    /* renamed from: Sr */
    public final C0862c f2403Sr;

    @HmlPinActivity
    public C1002n(@C1012a C0862c cVar) {
        this.f2403Sr = cVar;
    }

    /* renamed from: f */
    public boolean mo12123f(final String str, final String str2) {
        return ((Boolean) new C8660v().mo55533a("BundledExtractionConfigModelProvider.hasExtractionVariant()", new C8660v.C8662a<Boolean>() {
            /* renamed from: qw */
            public Boolean run() {
                return Boolean.valueOf(C1002n.this.f2403Sr.mo12123f(str, str2));
            }
        })).booleanValue();
    }

    /* renamed from: g */
    public File mo12124g(final String str, final String str2) {
        return (File) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getExtractionConfig()", new C8660v.C8662a<File>() {
            /* renamed from: qp */
            public File run() {
                return C1002n.this.f2403Sr.mo12124g(str, str2);
            }
        });
    }

    /* renamed from: h */
    public File mo12125h(final String str, final String str2) {
        return (File) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getExtractionCompact()", new C8660v.C8662a<File>() {
            /* renamed from: qp */
            public File run() {
                return C1002n.this.f2403Sr.mo12125h(str, str2);
            }
        });
    }

    /* renamed from: J */
    public File mo12121J(final String str) {
        return (File) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getExtractionCompact()", new C8660v.C8662a<File>() {
            /* renamed from: qp */
            public File run() {
                return C1002n.this.f2403Sr.mo12121J(str);
            }
        });
    }

    /* renamed from: i */
    public String mo12126i(final String str, final String str2) {
        return (String) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getPassOneOpString()", new C8660v.C8662a<String>() {
            /* renamed from: qx */
            public String run() {
                return C1002n.this.f2403Sr.mo12126i(str, str2);
            }
        });
    }

    /* renamed from: j */
    public String mo12127j(final String str, final String str2) {
        return (String) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getPassTwoOpString()", new C8660v.C8662a<String>() {
            /* renamed from: qx */
            public String run() {
                return C1002n.this.f2403Sr.mo12127j(str, str2);
            }
        });
    }

    /* renamed from: k */
    public File mo12128k(final String str, final String str2) {
        return (File) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getOcrConfig()", new C8660v.C8662a<File>() {
            /* renamed from: qp */
            public File run() {
                return C1002n.this.f2403Sr.mo12128k(str, str2);
            }
        });
    }

    /* renamed from: K */
    public String mo12122K(final String str) {
        return (String) new C8660v().mo55533a("BundledExtractionConfigModelProvider.getTessDataPath()", new C8660v.C8662a<String>() {
            /* renamed from: qx */
            public String run() {
                return C1002n.this.f2403Sr.mo12122K(str);
            }
        });
    }
}
