package com.kofax.kmc.ken.engines.gpu;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p040o.HmlPinActivity;

public class GPUImageHolderImpl implements IGPUImageHolder {
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Context f352V;
    volatile int count = 0;
    /* access modifiers changed from: private */

    /* renamed from: gs */
    public C0460d f353gs = null;

    /* renamed from: gt */
    private ExecutorService f354gt = null;

    @HmlPinActivity
    GPUImageHolderImpl(Context context) {
        this.f352V = context;
    }

    public void init() {
        synchronized (this) {
            this.count++;
            if (this.f354gt == null) {
                this.f354gt = Executors.newSingleThreadExecutor();
            }
        }
    }

    public void destroy() {
        synchronized (this) {
            this.count--;
            if (this.count == 0) {
                call(new Callable<Void>() {
                    public Void call() throws Exception {
                        if (GPUImageHolderImpl.this.f353gs != null) {
                            GPUImageHolderImpl.this.f353gs.destroy();
                            C0460d unused = GPUImageHolderImpl.this.f353gs = null;
                        }
                        return null;
                    }
                });
                this.f354gt.shutdown();
                try {
                    this.f354gt.awaitTermination(1, TimeUnit.DAYS);
                    this.f354gt = null;
                } catch (InterruptedException unused) {
                    throw new RuntimeException("Interrupted");
                }
            }
        }
    }

    public void handleData(byte[] bArr, int i, int i2, IGPUImageRenderer iGPUImageRenderer) {
        final byte[] bArr2 = bArr;
        final int i3 = i;
        final int i4 = i2;
        final IGPUImageRenderer iGPUImageRenderer2 = iGPUImageRenderer;
        call(new Callable<Void>() {
            public Void call() throws Exception {
                if (GPUImageHolderImpl.this.f353gs == null) {
                    GPUImageHolderImpl gPUImageHolderImpl = GPUImageHolderImpl.this;
                    C0460d unused = gPUImageHolderImpl.f353gs = new C0460d(gPUImageHolderImpl.f352V);
                }
                GPUImageHolderImpl.this.f353gs.handleData(bArr2, i3, i4, iGPUImageRenderer2);
                return null;
            }
        });
    }

    public Bitmap getBitmap(final int i) {
        return (Bitmap) call(new Callable<Bitmap>() {
            /* renamed from: U */
            public Bitmap call() throws Exception {
                return GPUImageHolderImpl.this.f353gs.getBitmap(i);
            }
        });
    }

    public <T> T call(Callable<T> callable) {
        try {
            return this.f354gt.submit(callable).get();
        } catch (ExecutionException e) {
            throwIfUnchecked(e.getCause());
            throw new RuntimeException("Unexpected exception");
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted");
        }
    }

    public static void throwIfUnchecked(Throwable th) {
        throwIfInstanceOf(th, RuntimeException.class);
        throwIfInstanceOf(th, Error.class);
    }

    public static <T extends Throwable> void throwIfInstanceOf(Throwable th, Class<T> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
