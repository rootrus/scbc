package com.kofax.mobile.sdk.p023k;

import com.kofax.kmc.kui.uicontrols.PreviewCallbackListener;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.kofax.mobile.sdk.k.l */
class C0957l {

    /* renamed from: GI */
    private final C0958a f2328GI;

    public C0957l(PreviewCallbackListener previewCallbackListener) {
        this.f2328GI = new C0958a(previewCallbackListener);
    }

    /* renamed from: b */
    public void mo12358b(C0500f fVar) {
        this.f2328GI.mo12360b(fVar);
    }

    public void stopListening() {
        this.f2328GI.stopListening();
    }

    /* renamed from: com.kofax.mobile.sdk.k.l$a */
    static class C0958a implements PreviewCallbackListener {

        /* renamed from: GJ */
        private final Lock f2329GJ = new ReentrantLock(true);

        /* renamed from: GK */
        private final PreviewCallbackListener f2330GK;

        /* renamed from: GL */
        private C0500f f2331GL = null;

        public C0958a(PreviewCallbackListener previewCallbackListener) {
            if (previewCallbackListener != null) {
                this.f2330GK = previewCallbackListener;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        public void mo12360b(C0500f fVar) {
            this.f2329GJ.lock();
            try {
                if (this.f2331GL == null) {
                    fVar.addPreviewCallbackListener(this);
                    this.f2331GL = fVar;
                    return;
                }
                throw new IllegalStateException();
            } finally {
                this.f2329GJ.unlock();
            }
        }

        public void stopListening() {
            this.f2329GJ.lock();
            try {
                this.f2331GL.removePreviewCallbackListener(this);
                this.f2331GL = null;
            } finally {
                this.f2329GJ.unlock();
            }
        }

        public void onPreviewFrame(PreviewFrameEvent previewFrameEvent) {
            if (this.f2329GJ.tryLock()) {
                try {
                    if (this.f2331GL != null) {
                        this.f2330GK.onPreviewFrame(previewFrameEvent);
                    }
                } finally {
                    this.f2329GJ.unlock();
                }
            }
        }
    }
}
