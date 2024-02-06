package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.w.ab */
public class C8494ab extends C8500ae {

    /* renamed from: Qj */
    private final C8495a f5151Qj;

    /* renamed from: Qk */
    private final C7908c f5152Qk;

    /* renamed from: com.kofax.mobile.sdk.w.ab$a */
    public interface C8495a {
        /* renamed from: b */
        void mo55395b(C8340a aVar, List<DataField> list, Exception exc);

        /* renamed from: x */
        List<List<DataField>> mo55396x(C8340a aVar);

        /* renamed from: y */
        List<List<DataField>> mo55397y(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    public C8494ab(C7908c cVar, C8495a aVar) {
        this.f5152Qk = cVar;
        this.f5151Qj = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.List<com.kofax.mobile.sdk.extract.id.DataField>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.List<com.kofax.mobile.sdk.extract.id.DataField>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.util.List<com.kofax.mobile.sdk.extract.id.DataField>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.List<com.kofax.mobile.sdk.extract.id.DataField>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.util.List<com.kofax.mobile.sdk.extract.id.DataField>} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Exception] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55390a(com.kofax.mobile.sdk.p075e.C8340a r7) {
        /*
            r6 = this;
            r0 = 0
            com.kofax.mobile.sdk.w.ab$a r1 = r6.f5151Qj     // Catch:{ Exception -> 0x0057 }
            java.util.List r1 = r1.mo55396x(r7)     // Catch:{ Exception -> 0x0057 }
            com.kofax.mobile.sdk.w.ab$a r2 = r6.f5151Qj     // Catch:{ Exception -> 0x0057 }
            java.util.List r2 = r2.mo55397y(r7)     // Catch:{ Exception -> 0x0057 }
            r3 = 2
            java.util.List[] r3 = new java.util.List[r3]     // Catch:{ Exception -> 0x0057 }
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x0057 }
            r1 = 1
            r3[r1] = r2     // Catch:{ Exception -> 0x0057 }
            java.util.List r1 = java.util.Arrays.asList(r3)     // Catch:{ Exception -> 0x0057 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0057 }
            r2 = r0
        L_0x001f:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x0055 }
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x0055 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x0055 }
            if (r3 == 0) goto L_0x001f
            int r4 = r3.size()     // Catch:{ Exception -> 0x0055 }
            if (r4 <= 0) goto L_0x001f
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0055 }
        L_0x0037:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0055 }
            if (r4 == 0) goto L_0x001f
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0055 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x0055 }
            if (r4 == 0) goto L_0x0037
            int r5 = r4.size()     // Catch:{ Exception -> 0x0055 }
            if (r5 <= 0) goto L_0x0037
            com.kofax.mobile.sdk._internal.extraction.id.c r5 = r6.f5152Qk     // Catch:{ Exception -> 0x0055 }
            java.util.List r2 = r5.mo54313a(r2, r4)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0037
        L_0x0052:
            r1 = r0
            r0 = r2
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            goto L_0x0052
        L_0x0057:
            r1 = move-exception
        L_0x0058:
            com.kofax.mobile.sdk.w.ab$a r2 = r6.f5151Qj
            r2.mo55395b(r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p083w.C8494ab.mo55390a(com.kofax.mobile.sdk.e.a):void");
    }
}
