package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import bolts.Continuation;
import bolts.Task;
import bolts.TaskCompletionSource;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0704a;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8032ae;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8169v;
import java.lang.ref.WeakReference;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.OnDeviceIdExtractor */
public class OnDeviceIdExtractor implements IIdExtractor {

    /* renamed from: LU */
    private final WeakReference<Context> f4883LU;
    @HmlPinActivity
    C7914k aen;
    private IIdExtractor aeo;

    public OnDeviceIdExtractor(Context context) {
        this(context, Injector.getInjector(context.getApplicationContext()).getLocalProjectProvider());
    }

    @HmlPinActivity
    public OnDeviceIdExtractor(Context context, IProjectProvider iProjectProvider) {
        this.f4883LU = new WeakReference<>(context.getApplicationContext());
        new C0704a(context).mo11637a(iProjectProvider);
    }

    /* renamed from: tY */
    private C7914k m4782tY() {
        C7914k kVar;
        synchronized (this) {
            if (this.aen == null) {
                this.aen = Injector.getInjector(this.f4883LU.get()).getIIdExtractorProvider();
            }
            kVar = this.aen;
        }
        return kVar;
    }

    /* renamed from: tZ */
    private IIdExtractor m4783tZ() {
        IIdExtractor iIdExtractor;
        synchronized (this) {
            if (this.aeo == null) {
                this.aeo = new C8032ae(new C8344a(new C8348b(m4782tY())));
            }
            iIdExtractor = this.aeo;
        }
        return iIdExtractor;
    }

    public void extractFields(IdExtractionParameters idExtractionParameters) {
        m4783tZ().extractFields(idExtractionParameters);
    }

    public void cancel() {
        m4783tZ().cancel();
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.OnDeviceIdExtractor$b */
    static class C8348b implements IIdExtractor {

        /* renamed from: Ly */
        private IIdExtractor f4885Ly;

        private C8348b(C7914k kVar) {
            this.f4885Ly = kVar.mo11734hp();
        }

        public void extractFields(IdExtractionParameters idExtractionParameters) {
            synchronized (this) {
                this.f4885Ly.extractFields(idExtractionParameters);
            }
        }

        public void cancel() {
            synchronized (this) {
                if (this.f4885Ly != null) {
                    this.f4885Ly.cancel();
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS);
                }
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.OnDeviceIdExtractor$a */
    static class C8344a extends C8169v {
        C8344a(IIdExtractor iIdExtractor) {
            super(iIdExtractor);
        }

        public void extractFields(final IdExtractionParameters idExtractionParameters) {
            final IIdExtractionListener listener = idExtractionParameters.getListener();
            m4786ua().onSuccess(new Continuation<Void, Void>() {
                public Void then(Task<Void> task) throws Exception {
                    C8344a.super.extractFields(idExtractionParameters);
                    return null;
                }
            }).continueWith(new Continuation<Void, Void>() {
                public Void then(Task<Void> task) throws Exception {
                    if (task.isFaulted()) {
                        listener.onExtractionComplete((IIdExtractionResult) null, new AggregateException(task.getError(), (Exception) null));
                    }
                    return null;
                }
            });
        }

        /* renamed from: ua */
        private static Task<Void> m4786ua() {
            if (!Licensing.isSdkLicensed(Licensing.LicenseType.ID_EXTRACTION)) {
                return Task.forError(new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_ID_EXTRACTION));
            }
            if (Licensing.getRemainingLicenseCount(Licensing.LicenseType.ID_EXTRACTION) <= 0) {
                return m4785c(Licensing.LicenseType.ID_EXTRACTION, 1);
            }
            return Task.forResult((Object) null);
        }

        /* renamed from: c */
        private static Task<Void> m4785c(Licensing.LicenseType licenseType, int i) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Licensing.addVolumeLicenseEventListener(new Licensing.VolumeLicenseEventListener() {
                public final void licenseOperationSucceeded(Licensing.VolumeLicenseResultData volumeLicenseResultData) {
                    Licensing.removeVolumeLicenseEventListener(this);
                    taskCompletionSource.trySetResult((Object) null);
                }

                public final void licenseOperationFailed(Licensing.VolumeLicenseFailureData volumeLicenseFailureData) {
                    Licensing.removeVolumeLicenseEventListener(this);
                    taskCompletionSource.trySetError(new KmcRuntimeException(ErrorInfo.KMC_UT_OUT_OF_VOLUME_LICENSE, new KmcRuntimeException(volumeLicenseFailureData.resultCode)));
                }
            });
            Licensing.acquireVolumeLicenses(licenseType, i);
            return taskCompletionSource.getTask();
        }

        /* renamed from: a */
        public void mo54431a(IdExtractionParameters idExtractionParameters, IIdExtractionResult iIdExtractionResult, AggregateException aggregateException) {
            if (!(iIdExtractionResult == null || iIdExtractionResult.getFields() == null || iIdExtractionResult.getFields().size() <= 0)) {
                Licensing.decrementRemainingLicenseCount(Licensing.LicenseType.ID_EXTRACTION);
            }
            super.mo54431a(idExtractionParameters, iIdExtractionResult, aggregateException);
        }
    }
}
