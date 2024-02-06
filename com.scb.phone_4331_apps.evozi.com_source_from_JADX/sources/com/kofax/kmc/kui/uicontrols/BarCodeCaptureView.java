package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeDirection;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.data.GuidingLine;
import com.kofax.kmc.kui.uicontrols.data.SearchDirection;
import com.kofax.kmc.kui.uicontrols.data.Symbology;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.event.GPSEnabledEvent;
import com.kofax.mobile.sdk._internal.impl.event.LevelChangedEvent;
import com.kofax.mobile.sdk._internal.impl.event.LocationEvent;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.view.C8228v;
import com.manateeworks.kfx.BarcodeScanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.p088sf.scuba.smartcards.ISO7816;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

public class BarCodeCaptureView extends ImageCaptureView {
    private static final String TAG = BarCodeCaptureView.class.getSimpleName();

    /* renamed from: jD */
    private static final Rect f3460jD = new Rect(0, 0, 100, 100);

    /* renamed from: jE */
    private static final int f3461jE = 1;

    /* renamed from: jF */
    private static final int f3462jF = 2;

    /* renamed from: jG */
    private static final int f3463jG = 4;

    /* renamed from: jH */
    private static final int f3464jH = 8;
    @HmlPinActivity

    /* renamed from: jI */
    C7890l f3465jI;

    /* renamed from: jJ */
    private boolean f3466jJ;

    /* renamed from: jK */
    private C8228v f3467jK;

    /* renamed from: jL */
    private final List<BarCodeFoundListener> f3468jL;

    /* renamed from: jM */
    private boolean f3469jM;

    /* renamed from: jN */
    private int f3470jN;

    /* renamed from: jO */
    private float f3471jO;

    /* renamed from: jP */
    private float f3472jP;

    /* renamed from: jQ */
    private float f3473jQ;

    /* renamed from: jR */
    private float f3474jR;

    /* renamed from: jS */
    private boolean f3475jS;

    /* renamed from: jT */
    private Symbology[] f3476jT;

    /* renamed from: jU */
    private SearchDirection[] f3477jU;

    public BarCodeCaptureView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BarCodeCaptureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarCodeCaptureView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (C8228v) null);
    }

    @HmlPinActivity
    BarCodeCaptureView(Context context, C8228v vVar) {
        this(context, (AttributeSet) null, 0, vVar);
    }

    private BarCodeCaptureView(Context context, AttributeSet attributeSet, int i, C8228v vVar) {
        super(context, attributeSet, i);
        this.f3468jL = new CopyOnWriteArrayList();
        boolean z = false;
        this.f3469jM = false;
        this.f3475jS = false;
        this.f3476jT = new Symbology[0];
        this.f3477jU = new SearchDirection[]{SearchDirection.HORIZONTAL, SearchDirection.VERTICAL};
        if (!isInEditMode()) {
            this.f3467jK = vVar == null ? Injector.getInjector(context.getApplicationContext()).getGuideLineRenderer() : vVar;
            this.f3466jJ = getResources().getConfiguration().orientation == 1 ? true : z;
            m3768aj();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f3467jK.setLayoutParams(layoutParams);
            addView(this.f3467jK);
            this._bus.register(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public void mo10553ai() {
        Injector.getInjector(getContext()).injectMembers(this);
    }

    public GuidingLine getGuidingLine() {
        return this.f3467jK.getGuidingLine();
    }

    public void setGuidingLine(GuidingLine guidingLine) {
        this.f3467jK.setGuidingLine(guidingLine);
    }

    public Symbology[] getSymbologies() {
        return this.f3476jT;
    }

    public void setSymbologies(Symbology[] symbologyArr) {
        this.f3476jT = symbologyArr;
        m3769ak();
    }

    public SearchDirection[] getSearchDirection() {
        return this.f3477jU;
    }

    public void setSearchDirection(SearchDirection[] searchDirectionArr) {
        this.f3477jU = searchDirectionArr;
        m3770al();
    }

    public void addBarCodeFoundEventListener(BarCodeFoundListener barCodeFoundListener) {
        if (!this.f3468jL.contains(barCodeFoundListener)) {
            this.f3468jL.add(barCodeFoundListener);
        }
    }

    public void removeBarCodeFoundEventListener(BarCodeFoundListener barCodeFoundListener) {
        this.f3468jL.remove(barCodeFoundListener);
    }

    public void readBarcode() {
        this.f3469jM = true;
    }

    /* access modifiers changed from: protected */
    public void checkLicense() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.BARCODE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_BARCODE_CAPTURE);
        }
    }

    /* renamed from: aj */
    private void m3768aj() {
        BarcodeScanner.registerCode(64, "Kofax.Android.PDF.UDL", "5A52C54FD2EEB8A9DC6599740ABB69E6B397378ADBE1CE342517D4700C9F56AD");
        BarcodeScanner.registerCode(8, "Kofax.Android.C39.UDL", "2DBAB7E1F20796746AFA20069DE9F5B7C2D5CAA2F63A86BB6B89634D6C4336DD");
        BarcodeScanner.registerCode(1, "Kofax.Android.QR.UDL", "5C44241E3E38A6E3BFBA3FB5949112DA91544173A67BFA58B622123B0C5341BC");
        BarcodeScanner.registerCode(512, "Kofax.Android.C93.UDL", "076F86B485C8E77B90FC504C5CBE62C710B1D4EACB687C4211B688AE073E85A0");
        BarcodeScanner.registerCode(1024, "Kofax.Android.CB.UDL", "722D1BF70863DBF0D933606DC43A259E2B0DFE7BE1DEAF3F7A5599CEBF076BC3");
        BarcodeScanner.registerCode(2, "Kofax.Android.DM.UDL", "2CA472C41CEF35CFDC61211A06C1AEF49AD8D4405B07598C6008F4287D34ACFA");
        BarcodeScanner.registerCode(16, "Kofax.Android.EANUPC.UDL", "295D23C3BCCF2A8C4E684BE761DFA13C44F30E15A707430D645BC4584083491B");
        BarcodeScanner.registerCode(32, "Kofax.Android.C128.UDL", "5C62C3BE32CA208BD81CAE8F4390CEA5B3E36DD5BCA6379291B4A0F398A5F437");
        BarcodeScanner.registerCode(256, "Kofax.Android.C25.UDL", "9A5282B31BBFF5DDA1B564105401D219B8C5A5832EE7897D42E2B1C83F487B59");
        BarcodeScanner.registerCode(128, "Kofax.Android.AZTEC.UDL", "5C6F013332805C58FA52848F854B6DD4B593CE2A91AF0CAAE252E0D8C50B9A9B");
        m3769ak();
        m3770al();
        BarcodeScanner.setFlags(512, 8);
        BarcodeScanner.setFlags(256, 1);
        BarcodeScanner.setLevel(2);
    }

    /* renamed from: ak */
    private void m3769ak() {
        int i = 0;
        for (Symbology a : this.f3476jT) {
            int a2 = m3762a(a);
            BarcodeScanner.setScanningRect(a2, f3460jD);
            i |= a2;
        }
        BarcodeScanner.setActiveCodes(i);
    }

    /* renamed from: al */
    private void m3770al() {
        int a = m3763a(this.f3477jU);
        int i = 0;
        int i2 = 2;
        if (!((a & 1) == 0 && (a & 2) == 0)) {
            i = 0 | (this.f3466jJ ? 2 : 1);
        }
        if (!((a & 8) == 0 && (a & 4) == 0)) {
            if (this.f3466jJ) {
                i2 = 1;
            }
            i |= i2;
        }
        BarcodeScanner.setDirection(i);
    }

    /* renamed from: a */
    private int m3763a(SearchDirection[] searchDirectionArr) {
        int i = 0;
        for (SearchDirection value : searchDirectionArr) {
            i |= value.getValue();
        }
        return i;
    }

    /* renamed from: a */
    private int m3762a(Symbology symbology) {
        if (symbology == Symbology.AZTEC) {
            return 128;
        }
        if (symbology == Symbology.CODABAR) {
            return 1024;
        }
        if (symbology == Symbology.CODE128) {
            return 32;
        }
        if (symbology == Symbology.CODE25) {
            return 256;
        }
        if (symbology == Symbology.CODE39) {
            return 8;
        }
        if (symbology == Symbology.CODE93) {
            return 512;
        }
        if (symbology == Symbology.DATAMATRIX) {
            return 2;
        }
        if (symbology == Symbology.EAN || symbology == Symbology.UPC) {
            return 16;
        }
        if (symbology == Symbology.PDF417) {
            return 64;
        }
        return symbology == Symbology.QR ? 1 : 0;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c A[LOOP:0: B:10:0x0046->B:12:0x004c, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3764a(com.kofax.kmc.ken.engines.data.BarCodeResult r4, com.kofax.kmc.ken.engines.data.Image r5) {
        /*
            r3 = this;
            boolean r0 = r3.f3475jS
            java.lang.String r1 = "com.kofax.kmc.kui.uicontrols"
            if (r0 == 0) goto L_0x0029
            com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits r0 = com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits.ALWAYS_USE_IF_ENABLED
            com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits r2 = r3.getGpsUsage()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
            com.kofax.kmc.ken.engines.data.Image$FriendI r0 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x0029 }
            r0.<init>(r1)     // Catch:{ KmcException -> 0x0029 }
            float r2 = r3.f3473jQ     // Catch:{ KmcException -> 0x0029 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ KmcException -> 0x0029 }
            r0.setImageLatitude(r2)     // Catch:{ KmcException -> 0x0029 }
            float r2 = r3.f3474jR     // Catch:{ KmcException -> 0x0029 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ KmcException -> 0x0029 }
            r0.setImageLongitude(r2)     // Catch:{ KmcException -> 0x0029 }
        L_0x0029:
            com.kofax.kmc.ken.engines.data.Image$FriendI r0 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x0040 }
            r0.<init>(r1)     // Catch:{ KmcException -> 0x0040 }
            float r1 = r3.f3471jO     // Catch:{ KmcException -> 0x0040 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ KmcException -> 0x0040 }
            r0.setImagePitch(r1)     // Catch:{ KmcException -> 0x0040 }
            float r1 = r3.f3472jP     // Catch:{ KmcException -> 0x0040 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ KmcException -> 0x0040 }
            r0.setImageRoll(r1)     // Catch:{ KmcException -> 0x0040 }
        L_0x0040:
            java.util.List<com.kofax.kmc.kui.uicontrols.BarCodeFoundListener> r0 = r3.f3468jL
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            com.kofax.kmc.kui.uicontrols.BarCodeFoundListener r1 = (com.kofax.kmc.kui.uicontrols.BarCodeFoundListener) r1
            com.kofax.kmc.kui.uicontrols.BarCodeFoundEvent r2 = new com.kofax.kmc.kui.uicontrols.BarCodeFoundEvent
            r2.<init>(r3, r4, r5)
            r1.barCodeFound(r2)
            goto L_0x0046
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kui.uicontrols.BarCodeCaptureView.m3764a(com.kofax.kmc.ken.engines.data.BarCodeResult, com.kofax.kmc.ken.engines.data.Image):void");
    }

    /* renamed from: a */
    private void m3765a(C7879b bVar) {
        Bitmap imageDataToBitmap = this.f3465jI.imageDataToBitmap(bVar.f3479jW.data, bVar.f3479jW.format, bVar.width, bVar.height, this.f3470jN);
        BarCodeResult barCodeResult = new BarCodeResult();
        barCodeResult.setType(m3775d(bVar.type));
        barCodeResult.setBoundingBox(calculateBound(bVar.f3481jY, this.f3470jN, bVar.width, bVar.height));
        barCodeResult.setDirection(m3776l(barCodeResult.getBoundingBox()));
        if (m3767a(bVar.f3480jX)) {
            barCodeResult.setDataFormat(BarCodeDataFormat.ASCII);
            barCodeResult.setValue(new String(bVar.f3480jX));
        } else {
            barCodeResult.setDataFormat(BarCodeDataFormat.BASE_64);
            barCodeResult.setValue(Base64.encodeToString(bVar.f3480jX, 0));
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("handleDecodeSuccess: ");
        sb.append(barCodeResult.getType());
        C0767k.m1801b(str, sb.toString());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  Direction: ");
        sb2.append(barCodeResult.getDirection());
        C0767k.m1801b(str2, sb2.toString());
        if (barCodeResult.getBoundingBox() != null) {
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  Bound: TL=");
            sb3.append(barCodeResult.getBoundingBox().getTopLeft());
            sb3.append(" TR=");
            sb3.append(barCodeResult.getBoundingBox().getTopRight());
            sb3.append(" BL=");
            sb3.append(barCodeResult.getBoundingBox().getBottomLeft());
            sb3.append(" BR=");
            sb3.append(barCodeResult.getBoundingBox().getBottomRight());
            C0767k.m1801b(str3, sb3.toString());
        }
        String str4 = TAG;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("  Format: ");
        sb4.append(barCodeResult.getDataFormat());
        C0767k.m1801b(str4, sb4.toString());
        String str5 = TAG;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("  Message: ");
        sb5.append(barCodeResult.getValue());
        C0767k.m1801b(str5, sb5.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(barCodeResult);
        Image image = new Image(imageDataToBitmap);
        image.setImageBarCodes(arrayList);
        m3764a(barCodeResult, image);
    }

    /* renamed from: a */
    private boolean m3767a(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b >= Byte.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private BarCodeType m3775d(int i) {
        if (i == 1) {
            return BarCodeType.DATAMATRIX;
        }
        if (i == 2) {
            return BarCodeType.CODE39;
        }
        switch (i) {
            case 7:
            case 8:
                return BarCodeType.EAN;
            case 9:
            case 10:
                return BarCodeType.UPC;
            case 11:
                return BarCodeType.CODE128;
            case 12:
                return BarCodeType.PDF417;
            case 13:
                return BarCodeType.QR;
            case 14:
                return BarCodeType.AZTEC;
            case 15:
            case 16:
                return BarCodeType.CODE25;
            case 17:
                return BarCodeType.CODE93;
            case 18:
                return BarCodeType.CODABAR;
            default:
                return BarCodeType.UNKNOWN;
        }
    }

    /* renamed from: b */
    private boolean m3772b(float[] fArr) {
        if (fArr == null) {
            return true;
        }
        int i = 0;
        for (float f : fArr) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                i++;
            }
        }
        if (i != fArr.length) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private BarCodeDirection m3776l(BoundingTetragon boundingTetragon) {
        if (boundingTetragon == null) {
            return BarCodeDirection.UNKNOWN;
        }
        float f = (float) (boundingTetragon.getTopRight().x - boundingTetragon.getTopLeft().x);
        float f2 = (float) (boundingTetragon.getTopRight().y - boundingTetragon.getTopLeft().y);
        double sqrt = Math.sqrt((double) ((f * f) + (f2 * f2)));
        double atan2 = Math.atan2(((double) f2) / sqrt, ((double) f) / sqrt);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Angle: ");
        sb.append((180.0d * atan2) / 3.141592653589793d);
        C0767k.m1801b(str, sb.toString());
        if (m3773b(getSearchDirection())) {
            if (atan2 <= -1.5707963267948966d) {
                return BarCodeDirection.RIGHT_LEFT;
            }
            if (atan2 > -1.5707963267948966d && atan2 <= 1.5707963267948966d) {
                return BarCodeDirection.LEFT_RIGHT;
            }
            if (atan2 > 1.5707963267948966d) {
                return BarCodeDirection.RIGHT_LEFT;
            }
        } else if (m3774c(getSearchDirection())) {
            if ((atan2 > -3.141592653589793d && atan2 <= 0.0d) || (atan2 > 3.141592653589793d && atan2 < 6.283185307179586d)) {
                return BarCodeDirection.BOTTOM_UP;
            }
            if ((atan2 > 0.0d && atan2 <= 3.141592653589793d) || (atan2 < -3.141592653589793d && atan2 > -6.283185307179586d)) {
                return BarCodeDirection.TOP_DOWN;
            }
        } else if (atan2 <= -2.356194490192345d) {
            return BarCodeDirection.RIGHT_LEFT;
        } else {
            if (atan2 > -2.356194490192345d && atan2 <= -0.7853981633974483d) {
                return BarCodeDirection.BOTTOM_UP;
            }
            if (atan2 > -0.7853981633974483d && atan2 <= 0.7853981633974483d) {
                return BarCodeDirection.LEFT_RIGHT;
            }
            if (atan2 > 0.7853981633974483d && atan2 <= 2.356194490192345d) {
                return BarCodeDirection.TOP_DOWN;
            }
            if (atan2 > 2.356194490192345d) {
                return BarCodeDirection.RIGHT_LEFT;
            }
        }
        return BarCodeDirection.UNKNOWN;
    }

    /* renamed from: b */
    private boolean m3773b(SearchDirection[] searchDirectionArr) {
        return m3766a(SearchDirection.HORIZONTAL, SearchDirection.VERTICAL, searchDirectionArr);
    }

    /* renamed from: c */
    private boolean m3774c(SearchDirection[] searchDirectionArr) {
        return m3766a(SearchDirection.VERTICAL, SearchDirection.HORIZONTAL, searchDirectionArr);
    }

    /* renamed from: a */
    private boolean m3766a(SearchDirection searchDirection, SearchDirection searchDirection2, SearchDirection[] searchDirectionArr) {
        if (searchDirectionArr == null || searchDirectionArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (SearchDirection searchDirection3 : searchDirectionArr) {
            if (searchDirection3 == SearchDirection.ALL || searchDirection3 == searchDirection2) {
                return false;
            }
            if (searchDirection3 == searchDirection) {
                z = true;
            }
        }
        return z;
    }

    public BoundingTetragon calculateBound(float[] fArr, int i, int i2, int i3) {
        float[] fArr2 = fArr;
        int i4 = i;
        if (m3772b(fArr) || fArr2.length != 8) {
            return null;
        }
        if (i4 < 0) {
            i4 += 360;
        }
        if (i4 == 0) {
            return new BoundingTetragon((int) fArr2[0], (int) fArr2[1], (int) fArr2[2], (int) fArr2[3], (int) fArr2[6], (int) fArr2[7], (int) fArr2[4], (int) fArr2[5]);
        }
        if (i4 == 90) {
            int i5 = i3 - ((int) fArr2[1]);
            int i6 = i3 - ((int) fArr2[3]);
            int i7 = i3 - ((int) fArr2[7]);
            return new BoundingTetragon(i5, (int) fArr2[0], i6, (int) fArr2[2], i7, (int) fArr2[6], i3 - ((int) fArr2[5]), (int) fArr2[4]);
        } else if (i4 == 180) {
            return new BoundingTetragon(i2 - ((int) fArr2[0]), i3 - ((int) fArr2[1]), i2 - ((int) fArr2[2]), i3 - ((int) fArr2[3]), i2 - ((int) fArr2[6]), i3 - ((int) fArr2[7]), i2 - ((int) fArr2[4]), i3 - ((int) fArr2[5]));
        } else if (i4 != 270) {
            return null;
        } else {
            return new BoundingTetragon((int) fArr2[1], i2 - ((int) fArr2[0]), (int) fArr2[3], i2 - ((int) fArr2[2]), (int) fArr2[7], i2 - ((int) fArr2[6]), (int) fArr2[5], i2 - ((int) fArr2[4]));
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onLevelnessChanged(LevelChangedEvent levelChangedEvent) {
        this.f3471jO = levelChangedEvent.pitch;
        this.f3472jP = levelChangedEvent.roll;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onPreviewFrame(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        if (this.f3469jM) {
            byte[] bArr = previewImageReadyBusEvent.imageData;
            int i = previewImageReadyBusEvent.width;
            int i2 = previewImageReadyBusEvent.height;
            this.f3470jN = previewImageReadyBusEvent.rotation;
            byte[] scanGrayscaleImage = BarcodeScanner.scanGrayscaleImage(bArr, i, i2);
            if (scanGrayscaleImage != null && scanGrayscaleImage.length >= 4) {
                C7879b bVar = new C7879b();
                bVar.type = BarcodeScanner.getLastType();
                bVar.width = i;
                bVar.height = i2;
                bVar.f3480jX = scanGrayscaleImage;
                bVar.f3479jW = new C7878a(bArr, 17);
                bVar.f3481jY = BarcodeScanner.getBarcodeLocation();
                if (m3771b(bVar)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Decode Succeeded: ");
                    sb.append(new String(bVar.f3480jX));
                    C0767k.m1801b("BarCodeCaptureHandler", sb.toString());
                    this.f3469jM = false;
                    m3765a(bVar);
                }
            }
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onLocationEvent(LocationEvent locationEvent) {
        this.f3473jQ = (float) locationEvent.latitude;
        this.f3474jR = (float) locationEvent.longitude;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onLocationEnableEvent(GPSEnabledEvent gPSEnabledEvent) {
        this.f3475jS = gPSEnabledEvent.gpsEnabled;
    }

    /* renamed from: b */
    private boolean m3771b(C7879b bVar) {
        BarCodeType d = m3775d(bVar.type);
        List asList = Arrays.asList(getSymbologies());
        if (d == BarCodeType.EAN && !asList.contains(Symbology.EAN)) {
            return false;
        }
        if (d == BarCodeType.UPC && !asList.contains(Symbology.UPC)) {
            if (bVar.type != 9) {
                return false;
            }
            bVar.type = 7;
            byte[] bArr = new byte[(bVar.f3480jX.length + 1)];
            bArr[0] = ISO7816.INS_DECREASE;
            System.arraycopy(bVar.f3480jX, 0, bArr, 1, bVar.f3480jX.length);
            bVar.f3480jX = bArr;
        }
        return true;
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.BarCodeCaptureView$b */
    static class C7879b {
        int height;

        /* renamed from: jW */
        C7878a f3479jW;

        /* renamed from: jX */
        byte[] f3480jX;

        /* renamed from: jY */
        float[] f3481jY;
        int type;
        int width;

        C7879b() {
        }
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.BarCodeCaptureView$a */
    class C7878a {
        public byte[] data;
        public int format;

        public C7878a(byte[] bArr, int i) {
            this.data = bArr;
            this.format = i;
        }
    }
}
