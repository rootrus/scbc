package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C7959ap;
import com.kofax.mobile.sdk._internal.impl.event.C7976p;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.BufferedQuickBarcodeExtractor;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.BufferedQuickFaceExtractor;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.BufferedQuickMrzExtractor;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.C8161f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk.extract.id.QuickExtractorAgent */
public final class QuickExtractorAgent {
    /* access modifiers changed from: private */
    public static final String TAG = QuickExtractorAgent.class.getSimpleName();
    private final BufferedQuickMrzExtractor aeE;
    private final BufferedQuickBarcodeExtractor aeF;
    private final BufferedQuickFaceExtractor aeG;
    /* access modifiers changed from: private */
    public final QuickExtractorAgentListener aeH;
    private final IBus aeI;
    private final C8355a aeJ;
    private Task<Void> aeK;
    private Task<Void> aeL;
    private final AtomicBoolean aeM;
    private Task<Void> aeN;
    private final AtomicBoolean aeO;

    public QuickExtractorAgent(Context context, QuickExtractorSettings quickExtractorSettings, QuickExtractorAgentListener quickExtractorAgentListener) {
        this(new BufferedQuickMrzExtractor(), new BufferedQuickBarcodeExtractor(quickExtractorSettings.getBarcodes()), new BufferedQuickFaceExtractor(context, quickExtractorSettings), quickExtractorAgentListener, Injector.getInjector(context).getIBus());
    }

    QuickExtractorAgent(BufferedQuickMrzExtractor bufferedQuickMrzExtractor, BufferedQuickBarcodeExtractor bufferedQuickBarcodeExtractor, BufferedQuickFaceExtractor bufferedQuickFaceExtractor, QuickExtractorAgentListener quickExtractorAgentListener, IBus iBus) {
        this.aeJ = new C8355a();
        this.aeK = Task.forResult((Object) null);
        this.aeL = Task.forResult((Object) null);
        this.aeM = new AtomicBoolean();
        this.aeN = Task.forResult((Object) null);
        this.aeO = new AtomicBoolean();
        this.aeE = bufferedQuickMrzExtractor;
        this.aeF = bufferedQuickBarcodeExtractor;
        this.aeG = bufferedQuickFaceExtractor;
        this.aeH = quickExtractorAgentListener;
        this.aeI = iBus;
        iBus.register(this.aeJ);
    }

    public final void destroy() {
        this.aeM.set(true);
        this.aeO.set(true);
        this.aeI.unregister(this.aeJ);
        this.aeE.destroy();
        this.aeF.destroy();
        this.aeG.destroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m4805h(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        if (!this.aeM.get()) {
            if (this.aeK.isCompleted()) {
                this.aeK = this.aeE.extract(previewImageReadyBusEvent).continueWithTask(m4799a(this.aeM));
            } else {
                C0767k.m1801b(TAG, "MRZ extractor is busy");
            }
            if (this.aeL.isCompleted()) {
                this.aeL = this.aeF.extract(previewImageReadyBusEvent).continueWithTask(m4799a(this.aeM));
            } else {
                C0767k.m1801b(TAG, "Barcode extractor is busy");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m4806i(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        if (!this.aeO.get()) {
            if (this.aeN.isCompleted()) {
                this.aeN = this.aeG.extract(previewImageReadyBusEvent).continueWithTask(m4799a(this.aeO));
            } else {
                C0767k.m1801b(TAG, "Face extractor is busy");
            }
        }
    }

    /* renamed from: a */
    private Continuation<C8161f, Task<Void>> m4799a(final AtomicBoolean atomicBoolean) {
        return new Continuation<C8161f, Task<Void>>() {
            public Task<Void> then(Task<C8161f> task) {
                Exception error = task.getError();
                if (error != null) {
                    C0767k.m1802b(QuickExtractorAgent.TAG, "Exception", (Throwable) error);
                }
                C8161f fVar = (C8161f) task.getResult();
                if (fVar == null || !atomicBoolean.compareAndSet(false, true)) {
                    return Task.forResult((Object) null);
                }
                return QuickExtractorAgent.this.m4803b(fVar);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Task<Void> m4803b(final C8161f fVar) {
        return Task.call(new Callable<Void>() {
            public Void call() {
                Image qi = fVar.mo54565qi();
                if (qi != null) {
                    QuickExtractorAgent.this.aeH.onFaceExtracted(qi, fVar.mo54566qj());
                    return null;
                }
                QuickExtractorAgent.this.aeH.onFieldsExtracted(fVar.getFields(), fVar.mo54566qj());
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.QuickExtractorAgent$a */
    class C8355a {

        /* renamed from: II */
        private volatile boolean f4889II;

        /* renamed from: Ix */
        private volatile boolean f4890Ix;

        /* renamed from: Jf */
        private volatile boolean f4891Jf;

        private C8355a() {
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: c */
        public void mo55190c(C0676aa aaVar) {
            this.f4889II = aaVar.f1610II;
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo55189a(C7976p pVar) {
            this.f4890Ix = pVar.mo54367mn();
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: d */
        public void mo55191d(C7959ap apVar) {
            this.f4891Jf = apVar.f3715Jf;
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: j */
        public void mo55192j(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
            if (!this.f4889II) {
                C0767k.m1801b(QuickExtractorAgent.TAG, "Not focused");
            } else if (!this.f4890Ix) {
                C0767k.m1801b(QuickExtractorAgent.TAG, "Not stable");
            } else if (!this.f4891Jf) {
                C0767k.m1801b(QuickExtractorAgent.TAG, "No document");
            } else {
                QuickExtractorAgent.this.m4805h(previewImageReadyBusEvent);
                QuickExtractorAgent.this.m4806i(previewImageReadyBusEvent);
            }
        }
    }
}
