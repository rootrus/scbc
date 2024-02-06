package com.kofax.mobile.sdk.p023k;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.SelfieDetectionSettings;
import com.kofax.mobile.sdk._internal.detection.IFaceDetectionResult;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.kofax.mobile.sdk.k.j */
public class C8419j implements IFaceDetector {

    /* renamed from: gt */
    private final ExecutorService f4991gt = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: np */
    public final IFaceDetector f4992np;

    public C8419j(IFaceDetector iFaceDetector) {
        this.f4992np = iFaceDetector;
    }

    public IFaceDetectionResult detect(final SelfieDetectionSettings selfieDetectionSettings, final Bitmap bitmap, final int i) {
        return (IFaceDetectionResult) call(new Callable<IFaceDetectionResult>() {
            /* renamed from: lt */
            public IFaceDetectionResult call() {
                return C8419j.this.f4992np.detect(selfieDetectionSettings, bitmap, i);
            }
        });
    }

    public IFaceDetectionResult detect(SelfieDetectionSettings selfieDetectionSettings, byte[] bArr, int i, int i2, int i3) {
        final SelfieDetectionSettings selfieDetectionSettings2 = selfieDetectionSettings;
        final byte[] bArr2 = bArr;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        return (IFaceDetectionResult) call(new Callable<IFaceDetectionResult>() {
            /* renamed from: lt */
            public IFaceDetectionResult call() {
                return C8419j.this.f4992np.detect(selfieDetectionSettings2, bArr2, i4, i5, i6);
            }
        });
    }

    public boolean isOperational() {
        return ((Boolean) call(new Callable<Boolean>() {
            /* renamed from: lu */
            public Boolean call() {
                return Boolean.valueOf(C8419j.this.f4992np.isOperational());
            }
        })).booleanValue();
    }

    public void destroy() {
        call(new Callable<Void>() {
            public Void call() {
                C8419j.this.f4992np.destroy();
                return null;
            }
        });
        this.f4991gt.shutdown();
        try {
            this.f4991gt.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted");
        }
    }

    private <T> T call(Callable<T> callable) {
        try {
            return this.f4991gt.submit(callable).get();
        } catch (ExecutionException e) {
            throwIfUnchecked(e.getCause());
            throw new RuntimeException("Unexpected exception");
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted");
        }
    }

    private static void throwIfUnchecked(Throwable th) {
        throwIfInstanceOf(th, RuntimeException.class);
        throwIfInstanceOf(th, Error.class);
    }

    private static <T extends Throwable> void throwIfInstanceOf(Throwable th, Class<T> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
