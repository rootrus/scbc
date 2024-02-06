package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

public class BarCodeReader {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile boolean f3278a;
    private Symbology[] _symbology;

    /* renamed from: b */
    private int f3279b;

    /* renamed from: c */
    private Direction f3280c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f3281d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private ErrorInfo f3282e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ArrayList<BarcodeReadCompleteListener> f3283f = new ArrayList<>();

    public interface BarcodeReadCompleteListener {
        void barcodeReadComplete(BarcodeReadCompleteEvent barcodeReadCompleteEvent);
    }

    public BarCodeReader() {
        m3695a(1);
        this._symbology = new Symbology[0];
        this.f3280c = Direction.ALL;
    }

    public BarCodeReader(Symbology[] symbologyArr, Direction direction, int i) {
        m3695a(i);
        if (symbologyArr == null) {
            this._symbology = new Symbology[0];
        }
        this._symbology = symbologyArr;
        if (direction == null) {
            this.f3280c = Direction.ALL;
        }
        this.f3280c = direction;
    }

    public String getBcVersion() {
        return new BarcodeReaderEngineManager().mo53589b();
    }

    public void readBarcodes(Image image) throws KmcException {
        synchronized (this.f3281d) {
            if (!f3278a) {
                f3278a = true;
            } else {
                throw new KmcException(ErrorInfo.KMC_BC_BUSY);
            }
        }
        try {
            m3696a(image);
        } catch (KmcException e) {
            f3278a = false;
            throw e;
        } catch (KmcRuntimeException e2) {
            f3278a = false;
            throw e2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m3689a(Bitmap bitmap) {
        return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 2.0f), (int) (((float) bitmap.getHeight()) * 2.0f), true);
    }

    /* renamed from: a */
    private void m3696a(Image image) throws KmcException {
        this.f3282e = ErrorInfo.KMC_SUCCESS;
        m3694a();
        ErrorInfo b = m3700b(image);
        this.f3282e = b;
        if (b == ErrorInfo.KMC_SUCCESS) {
            Image.ImageRep imageRepresentation = image.getImageRepresentation();
            if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE) {
                image.imageReadFromFile();
            }
            Bitmap imageBitmap = image.getImageBitmap();
            m3697a(image, imageRepresentation, imageBitmap, imageBitmap.getWidth(), imageBitmap.getHeight(), m3688a(this._symbology), this.f3280c.f3300u, this.f3279b, image.getImageOutputColor().getBitsPerPixel());
            return;
        }
        throw new KmcException(this.f3282e);
    }

    /* renamed from: a */
    private void m3697a(Image image, Image.ImageRep imageRep, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        final Bitmap bitmap2 = bitmap;
        final int i7 = i;
        final int i8 = i2;
        final int i9 = i3;
        final int i10 = i4;
        final int i11 = i5;
        final int i12 = i6;
        final Image image2 = image;
        final Image.ImageRep imageRep2 = imageRep;
        new Thread() {
            public void run() {
                int i;
                BarcodeReaderEngineManager barcodeReaderEngineManager = new BarcodeReaderEngineManager();
                final int i2 = 1;
                Symbology[] symbologyArr = {Symbology.QRCode};
                Symbology[] symbologyArr2 = {Symbology.QRCode, Symbology.Pdf417};
                int a = BarCodeReader.this.m3688a(symbologyArr);
                int a2 = BarCodeReader.this.m3688a(symbologyArr2);
                final RecognitionContext a3 = barcodeReaderEngineManager.mo53587a(bitmap2, i7, i8, i9, i10, i11, i12);
                if (a3.getSymbolsFound() == 0 && (a == (i = i9) || a2 == i)) {
                    Bitmap a4 = BarCodeReader.this.m3689a(bitmap2);
                    a3 = barcodeReaderEngineManager.mo53587a(a4, a4.getWidth(), a4.getHeight(), a, i10, i11, i12);
                    a4.recycle();
                    i2 = 2;
                }
                BarCodeReader.this.f3281d.post(new Runnable() {
                    /* JADX INFO: finally extract failed */
                    public void run() {
                        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
                        ArrayList arrayList = new ArrayList();
                        try {
                            if (a3 != null) {
                                if (a3.getBarcode().length == 0) {
                                    errorInfo = BarCodeReader.this.m3691a(a3.getResultCode(), a3);
                                }
                                arrayList.addAll(a3.getBarCodeResults(i2));
                            }
                            if (image2.getImageBarCodes().size() > 0) {
                                image2.getImageBarCodes().clear();
                            }
                            image2.setImageBarCodes(arrayList);
                            if (imageRep2 == Image.ImageRep.IMAGE_REP_FILE) {
                                image2.imageClearBitmap();
                            }
                            boolean unused = BarCodeReader.f3278a = false;
                            m3701a(image2, errorInfo, BarCodeReader.this.f3283f);
                        } catch (Throwable th) {
                            boolean unused2 = BarCodeReader.f3278a = false;
                            throw th;
                        }
                    }

                    /* renamed from: a */
                    private void m3701a(Image image, ErrorInfo errorInfo, List<BarcodeReadCompleteListener> list) {
                        if (list != null) {
                            for (BarcodeReadCompleteListener next : list) {
                                if (next != null) {
                                    next.barcodeReadComplete(new BarcodeReadCompleteEvent(this, errorInfo, image));
                                }
                            }
                        }
                    }
                });
            }
        }.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.kut.utilities.error.ErrorInfo m3700b(com.kofax.kmc.ken.engines.data.Image r7) throws com.kofax.kmc.kut.utilities.error.KmcException {
        /*
            r6 = this;
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r7 != 0) goto L_0x0007
            com.kofax.kmc.kut.utilities.error.ErrorInfo r7 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_BC_INVALID_IMAGE
            return r7
        L_0x0007:
            com.kofax.kmc.ken.engines.data.Image$OutputColor r1 = r7.getImageOutputColor()
            int r1 = r1.getBitsPerPixel()
            r2 = 1
            if (r1 != r2) goto L_0x0014
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_BC_INVALID_IMAGE
        L_0x0014:
            java.lang.Float r1 = r7.getImageBitmapScaling()
            float r1 = r1.floatValue()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 0
            if (r1 >= 0) goto L_0x0025
            r1 = r2
            goto L_0x0026
        L_0x0025:
            r1 = r3
        L_0x0026:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r4 = r7.getImageRepresentation()
            com.kofax.kmc.ken.engines.data.Image$ImageRep r5 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP
            if (r4 != r5) goto L_0x0038
            if (r1 == 0) goto L_0x0058
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_BC_NO_REPRESENTATION
            java.lang.String r1 = "Only representation is bitmap but it is scaled down"
            r0.setErrCause(r1)
            goto L_0x0057
        L_0x0038:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r4 = r7.getImageRepresentation()
            com.kofax.kmc.ken.engines.data.Image$ImageRep r5 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE
            if (r4 != r5) goto L_0x004b
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r1 = r7.getImageFileRep()
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r2 = com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED
            if (r1 != r2) goto L_0x0057
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_BC_IMAGE_BUFFERED
            goto L_0x0057
        L_0x004b:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r4 = r7.getImageRepresentation()
            com.kofax.kmc.ken.engines.data.Image$ImageRep r5 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            if (r4 != r5) goto L_0x0055
            r2 = r2 ^ r1
            goto L_0x0058
        L_0x0055:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_BC_NO_REPRESENTATION
        L_0x0057:
            r2 = r3
        L_0x0058:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r0 != r1) goto L_0x0087
            if (r2 == 0) goto L_0x006c
            android.graphics.Bitmap r7 = r7.getImageBitmap()
            if (r7 != 0) goto L_0x0087
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NOIMAGE
            java.lang.String r7 = "imageBitmap field is null"
            r0.setErrCause(r7)
            goto L_0x0087
        L_0x006c:
            java.lang.String r7 = r7.getImageFilePath()
            if (r7 != 0) goto L_0x007a
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILEPATH
            java.lang.String r7 = "imageFilePath field is null"
            r0.setErrCause(r7)
            goto L_0x0087
        L_0x007a:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r7 = r1.exists()
            if (r7 != 0) goto L_0x0087
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_FILE_NOT_FOUND
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.BarCodeReader.m3700b(com.kofax.kmc.ken.engines.data.Image):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m3688a(Symbology[] symbologyArr) {
        int i = 0;
        for (Symbology a : symbologyArr) {
            i |= a.f3302u;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ErrorInfo m3691a(int i, RecognitionContext recognitionContext) {
        return i != 0 ? ErrorInfo.KMC_BC_UNKNOWN : ErrorInfo.KMC_SUCCESS;
    }

    /* renamed from: a */
    private static void m3694a() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.BARCODE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_BARCODE_CAPTURE);
        }
    }

    public int getMaxBarcodes() {
        return this.f3279b;
    }

    public void setMaxBarcodes(int i) {
        m3695a(i);
    }

    public Symbology[] getSearchSymbology() {
        return this._symbology;
    }

    public void setSearchSymbology(Symbology[] symbologyArr) {
        this._symbology = symbologyArr;
    }

    public Direction getSearchDirections() {
        return this.f3280c;
    }

    public void setSearchDirections(Direction direction) {
        this.f3280c = direction;
    }

    public void addBarcodeReadCompleteEventListener(BarcodeReadCompleteListener barcodeReadCompleteListener) {
        if (barcodeReadCompleteListener == null) {
            throw new KmcRuntimeException(ErrorInfo.KMC_BC_UNKNOWN);
        } else if (!this.f3283f.contains(barcodeReadCompleteListener)) {
            this.f3283f.add(barcodeReadCompleteListener);
        }
    }

    public void removeBarcodeReadCompleteEventListener(BarcodeReadCompleteListener barcodeReadCompleteListener) {
        if (barcodeReadCompleteListener != null) {
            this.f3283f.remove(barcodeReadCompleteListener);
        }
    }

    public static class BarcodeReadCompleteEvent extends EventObject {
        private static final long serialVersionUID = 5157442993015269738L;

        /* renamed from: e */
        private ErrorInfo f3297e;

        /* renamed from: t */
        private Image f3298t;

        public BarcodeReadCompleteEvent(Object obj, ErrorInfo errorInfo, Image image) {
            super(obj);
            this.f3297e = errorInfo;
            this.f3298t = image;
        }

        public ErrorInfo getStatus() {
            return this.f3297e;
        }

        public Image getImage() {
            return this.f3298t;
        }
    }

    public enum Symbology {
        Code128(1),
        Ean(6),
        Upc(24),
        Code39(32),
        Code25(64),
        Code93(512),
        Codabar(1024),
        Postnet(4096),
        Datamatrix(PKIFailureInfo.badCertTemplate),
        Pdf417(PKIFailureInfo.badSenderNonce),
        QRCode(4194304);
        
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final int f3302u;

        public static BarCodeType getBarCodeType(int i) {
            if (i == 1) {
                return BarCodeType.CODE128;
            }
            if (i != 2) {
                switch (i) {
                    case 4:
                        break;
                    case 8:
                    case 16:
                        return BarCodeType.UPC;
                    case 32:
                        return BarCodeType.CODE39;
                    case 64:
                        return BarCodeType.CODE25;
                    case 512:
                        return BarCodeType.CODE93;
                    case 1024:
                        return BarCodeType.CODABAR;
                    case 4096:
                        return BarCodeType.POSTNET;
                    case PKIFailureInfo.badCertTemplate /*1048576*/:
                        return BarCodeType.DATAMATRIX;
                    case PKIFailureInfo.badSenderNonce /*2097152*/:
                        return BarCodeType.PDF417;
                    case 4194304:
                        return BarCodeType.QR;
                    default:
                        return BarCodeType.UNKNOWN;
                }
            }
            return BarCodeType.EAN;
        }

        private Symbology(int i) {
            this.f3302u = i;
        }
    }

    public enum Direction {
        LEFT_RIGHT(1),
        RIGHT_LEFT(4),
        TOP_DOWN(2),
        BOTTOM_UP(8),
        ALL(LEFT_RIGHT.f3300u | RIGHT_LEFT.f3300u | TOP_DOWN.f3300u | BOTTOM_UP.f3300u);
        
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final int f3300u;

        private Direction(int i) {
            this.f3300u = i;
        }
    }

    /* renamed from: a */
    private void m3695a(int i) {
        if (i > 0) {
            this.f3279b = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("maxBarcodes <= 0: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
