package com.kofax.mobile.sdk.p021i;

import bolts.Capture;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.extract.p018id.ICompletionListener;
import com.kofax.mobile.sdk.extract.p018id.IProjectProvider;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.kofax.mobile.sdk.i.i */
public class C0925i {

    /* renamed from: zx */
    private final IProjectProvider f2223zx;

    public C0925i(IProjectProvider iProjectProvider) {
        this.f2223zx = iProjectProvider;
    }

    /* renamed from: X */
    public String mo12315X(String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Capture capture = new Capture();
        final Capture capture2 = new Capture();
        try {
            this.f2223zx.getHighestVersion(str, SdkVersion.getSdkVersion(), new ICompletionListener<String>() {
                /* renamed from: a */
                public void onComplete(String str, Exception exc) {
                    capture.set(str);
                    capture2.set(exc);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            m2397a(capture2);
            return (String) capture.get();
        } catch (InterruptedException e) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_INTERNAL_ERROR, e);
        }
    }

    public File getVariant(String str, String str2, String str3) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Capture capture = new Capture();
        final Capture capture2 = new Capture();
        try {
            this.f2223zx.getVariant(str, str2, str3, new ICompletionListener<File>() {
                /* renamed from: a */
                public void onComplete(File file, Exception exc) {
                    capture.set(file);
                    capture2.set(exc);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            m2397a(capture2);
            return (File) capture.get();
        } catch (InterruptedException e) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_INTERNAL_ERROR, e);
        }
    }

    public File getProject(String str, String str2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Capture capture = new Capture();
        final Capture capture2 = new Capture();
        try {
            this.f2223zx.getProject(str, str2, new ICompletionListener<File>() {
                /* renamed from: a */
                public void onComplete(File file, Exception exc) {
                    capture.set(file);
                    capture2.set(exc);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            m2397a(capture2);
            return (File) capture.get();
        } catch (InterruptedException e) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_INTERNAL_ERROR, e);
        }
    }

    /* renamed from: a */
    private void m2397a(Capture<Exception> capture) {
        Exception exc = (Exception) capture.get();
        if (exc == null) {
            return;
        }
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}
