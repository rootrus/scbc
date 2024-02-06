package com.kofax.mobile.sdk.p083w;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.p075e.C8342c;

/* renamed from: com.kofax.mobile.sdk.w.j */
public class C8546j implements C8342c {

    /* renamed from: PR */
    private final KmcRuntimeException f5229PR = new KmcRuntimeException(ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.kofax.kmc.kut.utilities.error.KmcRuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.kofax.kmc.kut.utilities.error.KmcRuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.kofax.kmc.kut.utilities.error.KmcRuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.kofax.kmc.kut.utilities.error.KmcRuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.kofax.kmc.kut.utilities.error.KmcRuntimeException} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55143a(java.lang.Object r14, bolts.CancellationToken r15) {
        /*
            r13 = this;
            com.kofax.mobile.sdk.e.a r14 = (com.kofax.mobile.sdk.p075e.C8340a) r14
            com.kofax.mobile.sdk.extract.id.IIdExtractionListener r0 = r14.getExtractionListener()
            com.kofax.mobile.sdk.extract.id.IdExtractionParameters r1 = r14.mo55125hq()
            boolean r15 = r15.isCancellationRequested()     // Catch:{ Exception -> 0x007a }
            r2 = 0
            if (r15 == 0) goto L_0x003b
            com.kofax.mobile.sdk.u.a r14 = new com.kofax.mobile.sdk.u.a     // Catch:{ Exception -> 0x007a }
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x007a }
            com.kofax.mobile.sdk.extract.id.AggregateException r15 = new com.kofax.mobile.sdk.extract.id.AggregateException     // Catch:{ Exception -> 0x007a }
            com.kofax.kmc.ken.engines.data.Image r3 = r1.getFrontImage()     // Catch:{ Exception -> 0x007a }
            if (r3 == 0) goto L_0x002b
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r3 = r13.f5229PR     // Catch:{ Exception -> 0x007a }
            goto L_0x002c
        L_0x002b:
            r3 = r2
        L_0x002c:
            com.kofax.kmc.ken.engines.data.Image r1 = r1.getBackImage()     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0034
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r2 = r13.f5229PR     // Catch:{ Exception -> 0x007a }
        L_0x0034:
            r15.<init>(r3, r2)     // Catch:{ Exception -> 0x007a }
            r0.onExtractionComplete(r14, r15)     // Catch:{ Exception -> 0x007a }
            return
        L_0x003b:
            r15 = 0
            com.kofax.mobile.sdk.c.a r1 = r14.mo55129hu()     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0052
            com.kofax.mobile.sdk.c.a r15 = r14.mo55129hu()     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = r15.getClassId()     // Catch:{ Exception -> 0x007a }
            com.kofax.mobile.sdk.c.a r15 = r14.mo55129hu()     // Catch:{ Exception -> 0x007a }
            float r15 = r15.getConfidence()     // Catch:{ Exception -> 0x007a }
        L_0x0052:
            r7 = r15
            r6 = r2
            com.kofax.mobile.sdk.u.a r15 = new com.kofax.mobile.sdk.u.a     // Catch:{ Exception -> 0x007a }
            boolean r2 = r14.isBarcodeRead()     // Catch:{ Exception -> 0x007a }
            boolean r3 = r14.isOcrRead()     // Catch:{ Exception -> 0x007a }
            double r4 = r14.getDocumentVerificationConfidenceRating()     // Catch:{ Exception -> 0x007a }
            com.kofax.mobile.sdk.extract.id.ImageField r8 = r14.getFaceImageField()     // Catch:{ Exception -> 0x007a }
            com.kofax.mobile.sdk.extract.id.ImageField r9 = r14.getSignatureImageField()     // Catch:{ Exception -> 0x007a }
            java.util.List r10 = r14.mo55134hz()     // Catch:{ Exception -> 0x007a }
            r1 = r15
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007a }
            com.kofax.mobile.sdk.extract.id.AggregateException r14 = r14.mo55116hA()     // Catch:{ Exception -> 0x007a }
            r0.onExtractionComplete(r15, r14)     // Catch:{ Exception -> 0x007a }
            return
        L_0x007a:
            r14 = move-exception
            java.lang.String r15 = "Unhandled exception in application code"
            com.kofax.mobile.sdk._internal.C0767k.m1822e((java.lang.String) r15, (java.lang.Throwable) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p083w.C8546j.mo55143a(java.lang.Object, bolts.CancellationToken):void");
    }
}
