package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.graphics.Bitmap;
import bolts.Capture;
import bolts.Continuation;
import bolts.Task;
import com.google.gson.Gson;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.extraction.C7905h;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk.capture.p017id.IIdExtractionServer;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionListener;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionResult;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import com.kofax.mobile.sdk.extract.p018id.IdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.HmlPinActivity;

public class OnDeviceExtractionServer implements IIdExtractionServer {
    /* access modifiers changed from: private */
    public static final String TAG = OnDeviceExtractionServer.class.getSimpleName();
    @HmlPinActivity

    /* renamed from: Mn */
    IIdExtractor f3854Mn;

    /* renamed from: Mo */
    private IdParameters f3855Mo;

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
    }

    public void setParameters(ExtractionParameters extractionParameters) {
    }

    /* access modifiers changed from: private */
    public static String toString(Object obj) {
        return new Gson().toJson(obj);
    }

    public void setIdParameters(IdParameters idParameters) {
        if (idParameters != null) {
            this.f3855Mo = idParameters;
            return;
        }
        throw new IllegalArgumentException("parameters cannot be null");
    }

    public void extract(final DataUnit dataUnit, final IDataUnitProcessedListener iDataUnitProcessedListener) {
        if (iDataUnitProcessedListener == null) {
            throw new IllegalArgumentException("listener cannot be null");
        } else if (dataUnit != null) {
            Task.callInBackground(new Callable<String>() {
                /* renamed from: mB */
                public String call() throws Exception {
                    return OnDeviceExtractionServer.this.m4013a(dataUnit);
                }
            }).continueWith(new Continuation<String, Void>() {
                public Void then(Task<String> task) throws Exception {
                    if (task.getError() != null) {
                        dataUnit.returnData = new C7905h(-1, OnDeviceExtractionServer.toString(task.getError()));
                    } else {
                        dataUnit.returnData = new C7905h(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, (String) task.getResult());
                        dataUnit.success = true;
                    }
                    try {
                        iDataUnitProcessedListener.onExtractionComplete(dataUnit);
                        return null;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("unit cannot be null");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if ((!r2) != false) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m4013a(com.kofax.mobile.sdk._internal.extraction.DataUnit r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            com.kofax.kmc.ken.engines.data.Image[] r0 = r0.images
            r2 = 0
            r3 = r0[r2]
            int r4 = r0.length
            r5 = 0
            r6 = 1
            if (r4 <= r6) goto L_0x0011
            r0 = r0[r6]
            goto L_0x0012
        L_0x0011:
            r0 = r5
        L_0x0012:
            com.kofax.mobile.sdk.extract.id.IdRegion r4 = r21.m4017oc()
            com.kofax.mobile.sdk.capture.id.IdParameters r7 = r1.f3855Mo
            java.lang.String r7 = r7.barcode
            com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer$a r8 = new com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer$a
            r8.<init>()
            if (r3 != 0) goto L_0x0030
            if (r0 != 0) goto L_0x0030
            if (r7 == 0) goto L_0x002c
            int r9 = r7.length()
            if (r9 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = r6
        L_0x002d:
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x009d
        L_0x0030:
            com.kofax.mobile.sdk.extract.id.IIdExtractionResult r0 = r1.m4012a(r3, r0, r7, r4)     // Catch:{ AggregateException -> 0x0099 }
            java.util.List r2 = r0.getFields()     // Catch:{ AggregateException -> 0x0099 }
            r8.mo54424a((java.util.Collection<com.kofax.mobile.sdk.extract.p018id.DataField>) r2)     // Catch:{ AggregateException -> 0x0099 }
            com.kofax.mobile.sdk.extract.id.DataField r2 = new com.kofax.mobile.sdk.extract.id.DataField     // Catch:{ AggregateException -> 0x0099 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AggregateException -> 0x0099 }
            r3.<init>()     // Catch:{ AggregateException -> 0x0099 }
            boolean r4 = r0.isOcrRead()     // Catch:{ AggregateException -> 0x0099 }
            r3.append(r4)     // Catch:{ AggregateException -> 0x0099 }
            java.lang.String r10 = "IsOcrRead"
            java.lang.String r11 = r3.toString()     // Catch:{ AggregateException -> 0x0099 }
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kofax.mobile.sdk.capture.model.FieldLocation r14 = com.kofax.mobile.sdk.capture.model.FieldLocation.UNDEFINED     // Catch:{ AggregateException -> 0x0099 }
            r9 = r2
            r9.<init>(r10, r11, r12, r14)     // Catch:{ AggregateException -> 0x0099 }
            r8.mo54425c(r2)     // Catch:{ AggregateException -> 0x0099 }
            com.kofax.mobile.sdk.extract.id.DataField r2 = new com.kofax.mobile.sdk.extract.id.DataField     // Catch:{ AggregateException -> 0x0099 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AggregateException -> 0x0099 }
            r3.<init>()     // Catch:{ AggregateException -> 0x0099 }
            boolean r4 = r0.isBarcodeRead()     // Catch:{ AggregateException -> 0x0099 }
            r3.append(r4)     // Catch:{ AggregateException -> 0x0099 }
            java.lang.String r16 = "IsBarcodeRead"
            java.lang.String r17 = r3.toString()     // Catch:{ AggregateException -> 0x0099 }
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kofax.mobile.sdk.capture.model.FieldLocation r20 = com.kofax.mobile.sdk.capture.model.FieldLocation.UNDEFINED     // Catch:{ AggregateException -> 0x0099 }
            r15 = r2
            r15.<init>(r16, r17, r18, r20)     // Catch:{ AggregateException -> 0x0099 }
            r8.mo54425c(r2)     // Catch:{ AggregateException -> 0x0099 }
            com.kofax.mobile.sdk.extract.id.DataField r2 = new com.kofax.mobile.sdk.extract.id.DataField     // Catch:{ AggregateException -> 0x0099 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AggregateException -> 0x0099 }
            r3.<init>()     // Catch:{ AggregateException -> 0x0099 }
            double r6 = r0.getDocumentVerificationConfidenceRating()     // Catch:{ AggregateException -> 0x0099 }
            r3.append(r6)     // Catch:{ AggregateException -> 0x0099 }
            java.lang.String r10 = "DocumentVerificationConfidenceRating"
            java.lang.String r11 = r3.toString()     // Catch:{ AggregateException -> 0x0099 }
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kofax.mobile.sdk.capture.model.FieldLocation r14 = com.kofax.mobile.sdk.capture.model.FieldLocation.UNDEFINED     // Catch:{ AggregateException -> 0x0099 }
            r9 = r2
            r9.<init>(r10, r11, r12, r14)     // Catch:{ AggregateException -> 0x0099 }
            r8.mo54425c(r2)     // Catch:{ AggregateException -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            r8.mo54423a((com.kofax.mobile.sdk.extract.p018id.AggregateException) r0)
        L_0x009d:
            java.util.List r0 = r8.getFields()
            r8.mo54427od()
            if (r0 != 0) goto L_0x00aa
            r8.mo54428oe()
            return r5
        L_0x00aa:
            java.lang.String r0 = toString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer.m4013a(com.kofax.mobile.sdk._internal.extraction.DataUnit):java.lang.String");
    }

    /* renamed from: a */
    private IIdExtractionResult m4012a(Image image, Image image2, String str, IdRegion idRegion) {
        Image.ImageRep imageRepresentation;
        Bitmap imageBitmap;
        Image.ImageRep imageRepresentation2;
        Bitmap imageBitmap2;
        boolean z = true;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Capture capture = new Capture();
        final Capture capture2 = new Capture();
        if (image == null || (!(Image.ImageRep.IMAGE_REP_BITMAP == (imageRepresentation2 = image.getImageRepresentation()) || Image.ImageRep.IMAGE_REP_BOTH == imageRepresentation2) || ((imageBitmap2 = image.getImageBitmap()) != null && !imageBitmap2.isRecycled()))) {
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z || image2 == null || (!(Image.ImageRep.IMAGE_REP_BITMAP == (imageRepresentation = image2.getImageRepresentation()) || Image.ImageRep.IMAGE_REP_BOTH == imageRepresentation) || ((imageBitmap = image2.getImageBitmap()) != null && !imageBitmap.isRecycled()))) {
                delegateToExtractor(this.f3854Mn, idRegion, image, image2, str, new IIdExtractionListener() {
                    public void onExtractionComplete(IIdExtractionResult iIdExtractionResult, AggregateException aggregateException) {
                        capture.set(iIdExtractionResult);
                        capture2.set(aggregateException);
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await();
                    IIdExtractionResult iIdExtractionResult = (IIdExtractionResult) capture.get();
                    AggregateException aggregateException = (AggregateException) capture2.get();
                    if (aggregateException != null) {
                        if (iIdExtractionResult == null || iIdExtractionResult.getFields() == null) {
                            throw aggregateException;
                        }
                        C0767k.m1821e(TAG, "getDataFromImages exception", (Throwable) aggregateException);
                    }
                    return iIdExtractionResult;
                } catch (Exception e) {
                    throw new AggregateException(e, (Exception) null);
                }
            } else {
                throw new AggregateException((Exception) null, new KmcException(ErrorInfo.KMC_ED_NOIMAGE));
            }
        } else {
            throw new AggregateException(new KmcException(ErrorInfo.KMC_ED_NOIMAGE), (Exception) null);
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer$5 */
    static /* synthetic */ class C80265 {

        /* renamed from: Mw */
        static final /* synthetic */ int[] f3868Mw;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.mobile.sdk.extract.id.IdRegion[] r0 = com.kofax.mobile.sdk.extract.p018id.IdRegion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3868Mw = r0
                com.kofax.mobile.sdk.extract.id.IdRegion r1 = com.kofax.mobile.sdk.extract.p018id.IdRegion.US     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3868Mw     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk.extract.id.IdRegion r1 = com.kofax.mobile.sdk.extract.p018id.IdRegion.ASIA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3868Mw     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk.extract.id.IdRegion r1 = com.kofax.mobile.sdk.extract.p018id.IdRegion.AUSTRALIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer.C80265.<clinit>():void");
        }
    }

    /* renamed from: oc */
    private IdRegion m4017oc() {
        int i = C80265.f3868Mw[this.f3855Mo.state.region.ordinal()];
        if (i == 1) {
            return IdRegion.US;
        }
        if (i == 2) {
            return IdRegion.ASIA;
        }
        if (i == 3) {
            return IdRegion.AUSTRALIA;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unsupported region '");
        sb.append(this.f3855Mo.state.region.name());
        sb.append("'");
        throw new AggregateException(new IllegalArgumentException(sb.toString()), (Exception) null);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer$a */
    static class C8027a {

        /* renamed from: Mx */
        private final List<AggregateException> f3869Mx;

        /* renamed from: My */
        private Set<DataField> f3870My;

        private C8027a() {
            this.f3869Mx = new ArrayList();
            this.f3870My = null;
        }

        /* renamed from: a */
        public void mo54423a(AggregateException aggregateException) {
            this.f3869Mx.add(aggregateException);
        }

        /* renamed from: c */
        public void mo54425c(DataField dataField) {
            if (dataField != null) {
                if (this.f3870My == null) {
                    this.f3870My = new HashSet();
                }
                this.f3870My.add(dataField);
            }
        }

        /* renamed from: a */
        public void mo54424a(Collection<DataField> collection) {
            if (collection != null) {
                if (this.f3870My == null) {
                    this.f3870My = new HashSet();
                }
                this.f3870My.addAll(collection);
            }
        }

        public List<DataField> getFields() {
            if (this.f3870My == null) {
                return null;
            }
            return new ArrayList(this.f3870My);
        }

        /* renamed from: od */
        public void mo54427od() {
            for (AggregateException d : this.f3869Mx) {
                C0767k.m1815d(OnDeviceExtractionServer.TAG, "Extraction exceptions", (Throwable) d);
            }
        }

        /* renamed from: oe */
        public void mo54428oe() {
            if (!this.f3869Mx.isEmpty()) {
                throw this.f3869Mx.get(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void delegateToExtractor(IIdExtractor iIdExtractor, IdRegion idRegion, Image image, Image image2, String str, IIdExtractionListener iIdExtractionListener) {
        IIdExtractor iIdExtractor2 = iIdExtractor;
        final String str2 = str;
        if (str2 == null || str.length() == 0) {
            iIdExtractor2.extractFields(new IdExtractionParameters(idRegion, IdType.Id, image, (List<BarCodeResult>) null, image2, (List<BarCodeResult>) null, true, iIdExtractionListener));
        } else {
            iIdExtractor2.extractFields(new IdExtractionParameters(idRegion, IdType.Id, image, (List<BarCodeResult>) null, (Image) null, (List<BarCodeResult>) new ArrayList<BarCodeResult>() {
                {
                    add(new BarCodeResult() {
                        {
                            setType(BarCodeType.PDF417);
                            setValue(str2);
                        }
                    });
                }
            }, true, iIdExtractionListener));
        }
    }
}
