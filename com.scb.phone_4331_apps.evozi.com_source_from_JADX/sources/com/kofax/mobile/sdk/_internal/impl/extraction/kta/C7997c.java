package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk.extract.p018id.ICompletionListener;
import com.kofax.mobile.sdk.extract.server.ExtractionServerException;
import com.kofax.mobile.sdk.extract.server.IServerExtractor;
import com.kofax.mobile.sdk.extract.server.LoginCredentials;
import com.kofax.mobile.sdk.extract.server.ServerExtractionParameters;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.c */
public class C7997c implements IServerExtractor {

    /* renamed from: Eg */
    private static final Object f3778Eg = new Object();
    /* access modifiers changed from: private */

    /* renamed from: Jw */
    public static Task<Void>.TaskCompletionSource f3779Jw;
    /* access modifiers changed from: private */

    /* renamed from: JA */
    public final IImageToByteArray f3780JA;
    /* access modifiers changed from: private */

    /* renamed from: JB */
    public final C7995a f3781JB;
    /* access modifiers changed from: private */

    /* renamed from: Jx */
    public final ErrorInfo f3782Jx = ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS;
    /* access modifiers changed from: private */

    /* renamed from: Jy */
    public ServerExtractionParameters f3783Jy;
    /* access modifiers changed from: private */

    /* renamed from: Jz */
    public LoginCredentials f3784Jz;

    @HmlPinActivity
    public C7997c(IImageToByteArray iImageToByteArray, C7995a aVar) {
        this.f3780JA = iImageToByteArray;
        this.f3781JB = aVar;
    }

    public void login(LoginCredentials loginCredentials, final ICompletionListener<String> iCompletionListener) {
        if (iCompletionListener != null) {
            this.f3784Jz = loginCredentials;
            Task.callInBackground(new C8002c()).continueWith(new Continuation<String, Void>() {
                public Void then(Task<String> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("listener cannot be null"));
    }

    public void extractData(ServerExtractionParameters serverExtractionParameters, final ICompletionListener<String> iCompletionListener) {
        if (iCompletionListener != null) {
            this.f3783Jy = serverExtractionParameters;
            synchronized (f3778Eg) {
                if (f3779Jw == null) {
                    f3779Jw = Task.create();
                    Task.callInBackground(new C8001b()).onSuccess(new C8003d(), Task.BACKGROUND_EXECUTOR).onSuccess(new C8000a(), Task.BACKGROUND_EXECUTOR).continueWith(new Continuation<String, Void>() {
                        public Void then(Task<String> task) throws Exception {
                            return C7997c.this.m3971a(iCompletionListener, task);
                        }
                    }, Task.UI_THREAD_EXECUTOR);
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY);
                }
            }
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("listener cannot be null"));
    }

    public void cancelExtraction() {
        synchronized (f3778Eg) {
            if (f3779Jw != null) {
                f3779Jw.trySetCancelled();
            } else {
                throw new KmcRuntimeException(this.f3782Jx);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void m3971a(ICompletionListener iCompletionListener, Task<String> task) {
        synchronized (f3778Eg) {
            try {
                if (f3779Jw.getTask().isCancelled()) {
                    iCompletionListener.onComplete(null, new ExtractionServerException(0, this.f3782Jx.getErrMsg()));
                } else {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                }
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Throwable th) {
                    f3779Jw = null;
                    throw th;
                }
            }
            f3779Jw = null;
        }
        return null;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.c$d */
    class C8003d<T> implements Continuation<T, T> {
        private C8003d() {
        }

        public T then(Task<T> task) throws Exception {
            if (C7997c.f3779Jw.getTask().isCancelled()) {
                throw new KmcRuntimeException(C7997c.this.f3782Jx);
            } else if (!task.isFaulted()) {
                return task.getResult();
            } else {
                throw task.getError();
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.c$a */
    class C8000a implements Continuation<Void, String> {
        private C8000a() {
        }

        /* renamed from: b */
        public String then(Task<Void> task) throws Exception {
            return C7997c.this.f3781JB.mo54386my();
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.c$b */
    class C8001b implements Callable<Void> {
        private C8001b() {
        }

        public Void call() throws Exception {
            try {
                if (C7997c.this.f3783Jy.getImages() != null && C7997c.this.f3783Jy.getImages().size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Image convert : C7997c.this.f3783Jy.getImages()) {
                        arrayList.add(C7997c.this.f3780JA.convert(convert));
                    }
                    ServerExtractionParameters unused = C7997c.this.f3783Jy = new ServerExtractionParameters(C7997c.this.f3783Jy.getServerUrl(), C7997c.this.f3783Jy.getImages(), arrayList, C7997c.this.f3783Jy.getCertificateValidationListener(), C7997c.this.f3783Jy.getParameters(), C7997c.this.f3783Jy.getTimeOutParameters());
                }
                C7997c.this.f3781JB.mo54385a(C7997c.this.f3783Jy);
                return null;
            } catch (Exception e) {
                throw new ExtractionServerException(0, e.getMessage());
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.c$c */
    class C8002c implements Callable<String> {
        private C8002c() {
        }

        /* renamed from: mB */
        public String call() throws Exception {
            return C7997c.this.f3781JB.mo54384a(C7997c.this.f3784Jz);
        }
    }
}
