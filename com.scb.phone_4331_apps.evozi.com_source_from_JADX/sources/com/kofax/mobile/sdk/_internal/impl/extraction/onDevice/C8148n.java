package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import bolts.Capture;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.extraction.C7901c;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.n */
class C8148n implements C7916m {

    /* renamed from: Lo */
    private C7901c f4168Lo;

    @HmlPinActivity
    public C8148n(C7901c cVar) {
        this.f4168Lo = cVar;
    }

    /* renamed from: b */
    public Image mo54322b(String str, Image image) {
        return mo54538c(this.f4168Lo.mo54271P(str), image);
    }

    /* renamed from: a */
    public Image mo54321a(ImagePerfectionProfile imagePerfectionProfile, Image image) {
        return mo54538c(this.f4168Lo.mo54272d(imagePerfectionProfile), image);
    }

    /* renamed from: c */
    public Image mo54538c(ImageProcessor imageProcessor, Image image) {
        Image image2;
        final Capture capture = new Capture();
        synchronized (this) {
            imageProcessor.addImageOutEventListener(new ImageProcessor.ImageOutListener() {
                public void imageOut(ImageProcessor.ImageOutEvent imageOutEvent) {
                    capture.set(imageOutEvent);
                    synchronized (C8148n.this) {
                        C8148n.this.notify();
                    }
                }
            });
            try {
                imageProcessor.processImage(image);
                wait();
                ImageProcessor.ImageOutEvent imageOutEvent = (ImageProcessor.ImageOutEvent) capture.get();
                if (imageOutEvent.getStatus() == ErrorInfo.KMC_SUCCESS) {
                    image2 = imageOutEvent.getImage();
                    imageProcessor.doCleanup();
                } else {
                    throw new KmcRuntimeException(imageOutEvent.getStatus());
                }
            } catch (KmcException | InterruptedException e) {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNKNOWN_ERROR, e);
            } catch (Throwable th) {
                imageProcessor.doCleanup();
                throw th;
            }
        }
        return image2;
    }
}
