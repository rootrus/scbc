package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

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

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.b */
public class C8175b implements IServerExtractor {

    /* renamed from: Eg */
    private static final Object f4213Eg = new Object();
    /* access modifiers changed from: private */

    /* renamed from: Jw */
    public static Task<Void>.TaskCompletionSource f4214Jw;
    /* access modifiers changed from: private */

    /* renamed from: JA */
    public final IImageToByteArray f4215JA;
    /* access modifiers changed from: private */

    /* renamed from: Jx */
    public final ErrorInfo f4216Jx = ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS;
    /* access modifiers changed from: private */

    /* renamed from: Jy */
    public ServerExtractionParameters f4217Jy;
    /* access modifiers changed from: private */

    /* renamed from: SF */
    public final C8174a f4218SF;

    @HmlPinActivity
    public C8175b(IImageToByteArray iImageToByteArray, C8174a aVar) {
        this.f4215JA = iImageToByteArray;
        this.f4218SF = aVar;
    }

    public void login(LoginCredentials loginCredentials, ICompletionListener<String> iCompletionListener) {
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_LOGIN_NOT_APPLICABLE);
    }

    public void extractData(ServerExtractionParameters serverExtractionParameters, final ICompletionListener<String> iCompletionListener) {
        if (iCompletionListener != null) {
            this.f4217Jy = serverExtractionParameters;
            synchronized (f4213Eg) {
                if (f4214Jw == null) {
                    f4214Jw = Task.create();
                    Task.callInBackground(new C8179c()).onSuccess(new C8178b(), Task.BACKGROUND_EXECUTOR).onSuccess(new C8177a(), Task.BACKGROUND_EXECUTOR).continueWith(new Continuation<String, Void>() {
                        public Void then(Task<String> task) throws Exception {
                            return C8175b.this.m4432a(iCompletionListener, task);
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
        synchronized (f4213Eg) {
            if (f4214Jw != null) {
                f4214Jw.trySetCancelled();
            } else {
                throw new KmcRuntimeException(this.f4216Jx);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void m4432a(ICompletionListener iCompletionListener, Task<String> task) {
        synchronized (f4213Eg) {
            try {
                if (f4214Jw.getTask().isCancelled()) {
                    iCompletionListener.onComplete(null, new ExtractionServerException(0, this.f4216Jx.getErrMsg()));
                } else {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                }
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Throwable th) {
                    f4214Jw = null;
                    throw th;
                }
            }
            f4214Jw = null;
        }
        return null;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.b$b */
    class C8178b<T> implements Continuation<T, T> {
        private C8178b() {
        }

        public T then(Task<T> task) throws Exception {
            if (C8175b.f4214Jw.getTask().isCancelled()) {
                throw new KmcRuntimeException(C8175b.this.f4216Jx);
            } else if (!task.isFaulted()) {
                return task.getResult();
            } else {
                throw task.getError();
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.b$c */
    class C8179c implements Callable<Void> {
        private C8179c() {
        }

        public Void call() throws Exception {
            try {
                if (C8175b.this.f4217Jy.getImages() == null || C8175b.this.f4217Jy.getImages().size() <= 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Image convert : C8175b.this.f4217Jy.getImages()) {
                    arrayList.add(C8175b.this.f4215JA.convert(convert));
                }
                ServerExtractionParameters unused = C8175b.this.f4217Jy = new ServerExtractionParameters(C8175b.this.f4217Jy.getServerUrl(), C8175b.this.f4217Jy.getImages(), arrayList, C8175b.this.f4217Jy.getCertificateValidationListener(), C8175b.this.f4217Jy.getParameters(), C8175b.this.f4217Jy.getTimeOutParameters());
                return null;
            } catch (Exception e) {
                throw new ExtractionServerException(0, e.getMessage());
            }
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.b$a */
    class C8177a implements Continuation<Void, String> {
        private C8177a() {
        }

        /* renamed from: b */
        public String then(Task<Void> task) throws Exception {
            return C8175b.this.f4218SF.mo54583b(C8175b.this.f4217Jy);
        }
    }
}
