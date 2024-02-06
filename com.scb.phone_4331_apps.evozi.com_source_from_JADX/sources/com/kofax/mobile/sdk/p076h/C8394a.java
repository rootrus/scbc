package com.kofax.mobile.sdk.p076h;

import bolts.Capture;
import bolts.Task;
import com.kofax.kmc.ken.engines.BarCodeReader;
import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7888b;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk.p070a.C8239a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.h.a */
public class C8394a implements C8239a {

    /* renamed from: yy */
    private static final Object f4910yy = new Object();

    /* renamed from: yz */
    private static final Map<BarCodeType, BarCodeReader.Symbology> f4911yz;

    /* renamed from: wM */
    private final C7919g f4912wM;

    /* renamed from: yA */
    private final C7888b f4913yA;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BarCodeType.PDF417, BarCodeReader.Symbology.Pdf417);
        hashMap.put(BarCodeType.QR, BarCodeReader.Symbology.QRCode);
        hashMap.put(BarCodeType.CODE39, BarCodeReader.Symbology.Code39);
        f4911yz = Collections.unmodifiableMap(hashMap);
    }

    @HmlPinActivity
    C8394a(C7888b bVar, C7919g gVar) {
        this.f4913yA = bVar;
        this.f4912wM = gVar;
    }

    /* renamed from: a */
    public Task<BarCodeResult> mo54699a(final Image image, final Set<BarCodeType> set) {
        return Task.callInBackground(new Callable<BarCodeResult>() {
            /* renamed from: iN */
            public BarCodeResult call() throws Exception {
                return C8394a.this.m4882b(image, set);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public BarCodeResult m4882b(Image image, Set<BarCodeType> set) {
        BarCodeResult barCodeResult;
        synchronized (f4910yy) {
            BarCodeReader.Symbology[] a = m4881a(set);
            final BarCodeReader barCodeReader = new BarCodeReader(a, BarCodeReader.Direction.ALL, a.length);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final Capture capture = new Capture();
            barCodeReader.addBarcodeReadCompleteEventListener(new BarCodeReader.BarcodeReadCompleteListener() {
                public void barcodeReadComplete(BarCodeReader.BarcodeReadCompleteEvent barcodeReadCompleteEvent) {
                    try {
                        if (barcodeReadCompleteEvent.getStatus().equals(ErrorInfo.KMC_SUCCESS)) {
                            capture.set(C8394a.this.m4878a(barcodeReadCompleteEvent));
                            return;
                        }
                        throw new KmcRuntimeException(barcodeReadCompleteEvent.getStatus());
                    } finally {
                        barCodeReader.removeBarcodeReadCompleteEventListener(this);
                        countDownLatch.countDown();
                    }
                }
            });
            C7919g.C7920a w = this.f4912wM.mo54325w(image);
            try {
                barCodeReader.readBarcodes(new Image(w.getBitmap()));
                countDownLatch.await();
                w.mo54326be();
                barCodeResult = (BarCodeResult) capture.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                w.mo54326be();
                throw th;
            }
        }
        return barCodeResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BarCodeResult m4878a(BarCodeReader.BarcodeReadCompleteEvent barcodeReadCompleteEvent) {
        List<BarCodeResult> imageBarCodes = barcodeReadCompleteEvent.getImage().getImageBarCodes();
        if (imageBarCodes.isEmpty()) {
            return null;
        }
        BarCodeResult barCodeResult = imageBarCodes.get(0);
        if (barCodeResult.getDataFormat() != BarCodeDataFormat.BASE_64) {
            return barCodeResult;
        }
        barCodeResult.setValue(this.f4913yA.decode(barCodeResult.getValue()));
        return barCodeResult;
    }

    /* renamed from: a */
    private static BarCodeReader.Symbology[] m4881a(Set<BarCodeType> set) {
        BarCodeReader.Symbology[] symbologyArr = new BarCodeReader.Symbology[set.size()];
        int i = 0;
        for (BarCodeType barCodeType : set) {
            symbologyArr[i] = f4911yz.get(barCodeType);
            i++;
        }
        return symbologyArr;
    }
}
