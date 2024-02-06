package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionResult;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ae */
public class C8032ae extends C8169v {

    /* renamed from: LK */
    private final C8034a f3876LK = new C8034a();

    public C8032ae(IIdExtractor iIdExtractor) {
        super(iIdExtractor);
    }

    public void extractFields(IdExtractionParameters idExtractionParameters) {
        synchronized (this.f3876LK) {
            if (!this.f3876LK.isBusy()) {
                this.f3876LK.m4033u(true);
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY);
            }
        }
        super.extractFields(idExtractionParameters);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54431a(IdExtractionParameters idExtractionParameters, IIdExtractionResult iIdExtractionResult, AggregateException aggregateException) {
        synchronized (this.f3876LK) {
            try {
                super.mo54431a(idExtractionParameters, iIdExtractionResult, aggregateException);
                this.f3876LK.m4033u(false);
            } catch (Throwable th) {
                this.f3876LK.m4033u(false);
                throw th;
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ae$a */
    static class C8034a {

        /* renamed from: LL */
        private boolean f3877LL;

        private C8034a() {
            this.f3877LL = false;
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public void m4033u(boolean z) {
            this.f3877LL = z;
        }

        /* access modifiers changed from: private */
        public boolean isBusy() {
            return this.f3877LL;
        }
    }
}
