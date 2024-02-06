package com.kofax.mobile.sdk.p009ae;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.dagger.C7896d;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import com.kofax.mobile.sdk.capture.processing.IImageProcessor;
import com.kofax.mobile.sdk.capture.processing.IImageProcessorListener;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.ae.b */
public class C8247b implements IImageProcessor {
    /* access modifiers changed from: private */

    /* renamed from: Co */
    public boolean f4386Co;

    /* renamed from: TQ */
    private final ImageProcessor f4387TQ;

    /* renamed from: TR */
    private ProcessingParameters f4388TR;

    /* renamed from: t */
    private Image f4389t;

    @HmlPinActivity
    public C8247b(ImageProcessor imageProcessor) {
        if (imageProcessor != null) {
            this.f4387TQ = imageProcessor;
            return;
        }
        throw new IllegalArgumentException("processor cannot be null");
    }

    @Deprecated
    public void process(Bitmap bitmap) {
        process(new Image(bitmap));
    }

    public void process(Image image) {
        synchronized (this) {
            if (image != null) {
                this.f4386Co = true;
                this.f4389t = image;
                ImagePerfectionProfile imagePerfectionProfile = new ImagePerfectionProfile();
                imagePerfectionProfile.setIpOperations(this.f4388TR.operations);
                if (this.f4388TR.useMrzPageDetection) {
                    imagePerfectionProfile.setUseMRZPassportDetection(ImagePerfectionProfile.UseMRZPassportDetection.ON);
                }
                if (this.f4388TR.useTargetFrameCrop) {
                    imagePerfectionProfile.setUseTargetFrameCrop(ImagePerfectionProfile.UseTargetFrameCrop.ON);
                }
                this.f4387TQ.setImagePerfectionProfile(imagePerfectionProfile);
                this.f4387TQ.setProcessedImageMimeType(Image.ImageMimeType.MIMETYPE_TIFF);
                this.f4387TQ.setProcessedImageRepresentation(Image.ImageRep.IMAGE_REP_BITMAP);
                try {
                    this.f4387TQ.processImage(this.f4389t);
                } catch (KmcException e) {
                    e.printStackTrace();
                    this.f4386Co = false;
                    throw new KmcRuntimeException(e.getErrorInfo());
                }
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_INTERNAL_ERROR, new Throwable("No image available for processing"));
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            if (this.f4386Co) {
                this.f4387TQ.cancel();
            }
        }
    }

    public void setImageOutListener(final IImageProcessorListener iImageProcessorListener) {
        this.f4387TQ.addImageOutEventListener(new ImageProcessor.ImageOutListener() {
            /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0021=Splitter:B:13:0x0021, B:21:0x003e=Splitter:B:21:0x003e} */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void imageOut(com.kofax.kmc.ken.engines.ImageProcessor.ImageOutEvent r5) {
                /*
                    r4 = this;
                    com.kofax.mobile.sdk.ae.b r0 = com.kofax.mobile.sdk.p009ae.C8247b.this
                    monitor-enter(r0)
                    r1 = 0
                    com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = r5.getStatus()     // Catch:{ all -> 0x0045 }
                    com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS     // Catch:{ all -> 0x0045 }
                    boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0045 }
                    if (r2 == 0) goto L_0x0028
                    com.kofax.kmc.ken.engines.data.Image r5 = r5.getImage()     // Catch:{ all -> 0x0045 }
                    if (r5 == 0) goto L_0x0021
                    r5.imageClearBitmap()     // Catch:{ KmcException -> 0x001d }
                    r5.imageClearFileBuffer()     // Catch:{ KmcException -> 0x001d }
                    goto L_0x0021
                L_0x001d:
                    r5 = move-exception
                    r5.printStackTrace()     // Catch:{ all -> 0x0045 }
                L_0x0021:
                    com.kofax.mobile.sdk.ae.b r5 = com.kofax.mobile.sdk.p009ae.C8247b.this     // Catch:{ all -> 0x004c }
                    boolean unused = r5.f4386Co = r1     // Catch:{ all -> 0x004c }
                    monitor-exit(r0)     // Catch:{ all -> 0x004c }
                    return
                L_0x0028:
                    com.kofax.mobile.sdk.capture.processing.IImageProcessorListener r2 = r3     // Catch:{ all -> 0x0045 }
                    if (r2 == 0) goto L_0x003e
                    com.kofax.kmc.ken.engines.data.Image r2 = r5.getImage()     // Catch:{ all -> 0x0045 }
                    com.kofax.kmc.ken.engines.data.Image$ImageMimeType r3 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF     // Catch:{ all -> 0x0045 }
                    r2.setImageMimeType(r3)     // Catch:{ all -> 0x0045 }
                    com.kofax.mobile.sdk.capture.processing.IImageProcessorListener r2 = r3     // Catch:{ all -> 0x0045 }
                    com.kofax.kmc.ken.engines.data.Image r5 = r5.getImage()     // Catch:{ all -> 0x0045 }
                    r2.onImageProcessed(r5)     // Catch:{ all -> 0x0045 }
                L_0x003e:
                    com.kofax.mobile.sdk.ae.b r5 = com.kofax.mobile.sdk.p009ae.C8247b.this     // Catch:{ all -> 0x004c }
                    boolean unused = r5.f4386Co = r1     // Catch:{ all -> 0x004c }
                    monitor-exit(r0)
                    return
                L_0x0045:
                    r5 = move-exception
                    com.kofax.mobile.sdk.ae.b r2 = com.kofax.mobile.sdk.p009ae.C8247b.this     // Catch:{ all -> 0x004c }
                    boolean unused = r2.f4386Co = r1     // Catch:{ all -> 0x004c }
                    throw r5     // Catch:{ all -> 0x004c }
                L_0x004c:
                    r5 = move-exception
                    monitor-exit(r0)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p009ae.C8247b.C82481.imageOut(com.kofax.kmc.ken.engines.ImageProcessor$ImageOutEvent):void");
            }
        });
    }

    public void setParameters(ProcessingParameters processingParameters) {
        if (processingParameters != null) {
            this.f4388TR = processingParameters;
            return;
        }
        throw new IllegalArgumentException("parameters cannot be null");
    }

    /* renamed from: a */
    private void m4558a(C7896d dVar) {
        try {
            this.f4387TQ.doCleanup();
        } catch (Exception unused) {
        }
    }
}
