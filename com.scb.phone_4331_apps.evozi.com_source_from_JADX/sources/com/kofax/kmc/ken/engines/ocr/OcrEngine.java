package com.kofax.kmc.ken.engines.ocr;

import android.graphics.Bitmap;
import android.os.Environment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.ocr.OcrRegion;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsOCRType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import com.kofax.mobile.sdk._internal.C0767k;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OcrEngine {

    /* renamed from: hE */
    private static boolean f3373hE;

    /* renamed from: hz */
    private static ArrayList<OcrWord> f3374hz = new ArrayList<>();
    /* access modifiers changed from: private */
    public String TAG = OcrEngine.class.getSimpleName();

    /* renamed from: aP */
    ImagePerfectionProfile f3375aP = new ImagePerfectionProfile();

    /* renamed from: bw */
    private ImageProcessor f3376bw;

    /* renamed from: hA */
    private Image f3377hA;

    /* renamed from: hB */
    private OcrResultData f3378hB = null;

    /* renamed from: hC */
    private OcrFailureData f3379hC = null;

    /* renamed from: hD */
    private AppStatsOCRType f3380hD;

    /* renamed from: hy */
    private ArrayList<OcrEventListener> f3381hy = new ArrayList<>();

    /* renamed from: aa */
    private void m3743aa() {
    }

    public OcrEngine() {
        m3739a();
    }

    /* renamed from: a */
    private void m3739a() {
        if (f3373hE) {
            return;
        }
        if (IpLibUtil.isIpLicensed()) {
            f3373hE = true;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
    }

    public void performOCR(Image image, OcrParameters ocrParameters) throws KmcException {
        m3742a((Object) image, "sourceImage");
        m3742a((Object) ocrParameters, "parameters");
        m3742a((Object) ocrParameters.getFont(), "OcrParameters font");
        this.f3377hA = image;
        ImageProcessor imageProcessor = new ImageProcessor();
        this.f3376bw = imageProcessor;
        imageProcessor.setProcessedImageRepresentation(Image.ImageRep.IMAGE_REP_NONE);
        int i = C78732.f3383hG[ocrParameters.getFont().ordinal()];
        if (i == 2) {
            m3744ab();
        } else if (i == 3) {
            m3744ab();
        } else if (i == 4) {
            m3743aa();
        }
        m3741a(ocrParameters.getRegion());
        this.f3376bw.addImageOutEventListener(new ImageProcessor.ImageOutListener() {
            public void imageOut(ImageProcessor.ImageOutEvent imageOutEvent) {
                ErrorInfo status = imageOutEvent.getStatus();
                if (ErrorInfo.KMC_SUCCESS == status) {
                    String a = OcrEngine.this.m3749f(imageOutEvent.getImage().getImageMetaData());
                    String a2 = OcrEngine.this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parsed Data = ");
                    sb.append(a);
                    C0767k.m1807c(a2, sb.toString());
                }
                OcrEngine.this.m3747c(status);
            }
        });
    }

    /* renamed from: com.kofax.kmc.ken.engines.ocr.OcrEngine$2 */
    static /* synthetic */ class C78732 {

        /* renamed from: hG */
        static final /* synthetic */ int[] f3383hG;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.kofax.kmc.ken.engines.ocr.OcrParameters$Font[] r0 = com.kofax.kmc.ken.engines.ocr.OcrParameters.Font.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3383hG = r0
                com.kofax.kmc.ken.engines.ocr.OcrParameters$Font r1 = com.kofax.kmc.ken.engines.ocr.OcrParameters.Font.E13B_MICR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3383hG     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.ocr.OcrParameters$Font r1 = com.kofax.kmc.ken.engines.ocr.OcrParameters.Font.DEFAULT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3383hG     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.ocr.OcrParameters$Font r1 = com.kofax.kmc.ken.engines.ocr.OcrParameters.Font.GENERIC_MACHINE_PRINT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3383hG     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.ken.engines.ocr.OcrParameters$Font r1 = com.kofax.kmc.ken.engines.ocr.OcrParameters.Font.FARRINGTON_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.ocr.OcrEngine.C78732.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m3741a(OcrRegion ocrRegion) throws KmcException {
        if (ocrRegion == null) {
            this.f3380hD = AppStatsOCRType.OCR_FULLPAGE;
        }
        if (ocrRegion != null) {
            if (ocrRegion.getRegionType() != null) {
                this.f3376bw.processImage(m3736a(ocrRegion, ocrRegion.getRegionType()));
                this.f3380hD = AppStatsOCRType.OCR_ZONAL;
                return;
            }
            throw new KmcException(ErrorInfo.KMC_ED_NONEXISTENT_OCR_REGION_TYPE);
        } else if (!m3750s(this.f3377hA)) {
            this.f3376bw.processImage(this.f3377hA);
        } else {
            OcrRegion ocrRegion2 = new OcrRegion();
            ocrRegion2.setRegionType(OcrRegion.RegionType.REGION_PERCENT);
            ocrRegion2.setRegionHeight(100);
            ocrRegion2.setRegionWidth(100);
            this.f3376bw.processImage(m3736a(ocrRegion2, ocrRegion2.getRegionType()));
        }
    }

    /* renamed from: s */
    private boolean m3750s(Image image) {
        return image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE && image.getImageFileRep() == Image.ImageFileRep.FILE_BUFFERED;
    }

    /* renamed from: a */
    private Image m3736a(OcrRegion ocrRegion, OcrRegion.RegionType regionType) {
        int i = ocrRegion.f3392hP;
        int i2 = ocrRegion.f3391hO;
        int i3 = ocrRegion.f3390hN;
        int i4 = ocrRegion.f3389hM;
        Image ad = m3746ad();
        Bitmap t = ad != null ? m3751t(ad) : null;
        if (regionType == OcrRegion.RegionType.REGION_PERCENT) {
            i = (int) (((double) t.getHeight()) * (((double) i) / 100.0d));
            i2 = (int) (((double) t.getWidth()) * (((double) i2) / 100.0d));
        }
        Image image = new Image(Bitmap.createBitmap(t, i3, i4, i2, i));
        ad.imageClearBitmap();
        t.recycle();
        return image;
    }

    /* renamed from: t */
    private Bitmap m3751t(Image image) {
        if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE) {
            if (image.getImageFileRep() == Image.ImageFileRep.FILE_STORED) {
                try {
                    if (image.imageReadFromFile() == ErrorInfo.KMC_SUCCESS) {
                        return image.getImageBitmap();
                    }
                    return null;
                } catch (KmcRuntimeException e) {
                    e.printStackTrace();
                    return null;
                } catch (KmcException e2) {
                    e2.printStackTrace();
                    return null;
                }
            } else if (image.getImageFileRep() != Image.ImageFileRep.FILE_BUFFERED) {
                return null;
            } else {
                try {
                    if (image.imageReadFromFileBuffer() == ErrorInfo.KMC_SUCCESS) {
                        return image.getImageBitmap();
                    }
                    return null;
                } catch (KmcRuntimeException e3) {
                    e3.printStackTrace();
                    return null;
                } catch (KmcException e4) {
                    e4.printStackTrace();
                    return null;
                }
            }
        } else if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BITMAP || image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BOTH) {
            return image.getImageBitmap();
        } else {
            return null;
        }
    }

    /* renamed from: ab */
    private void m3744ab() {
        this.f3375aP.setIpOperations("_DeviceType_2_DoNoPageDetection__DoRecognizeTextMP__LoadInlineSetting_[CBinarize.Contrast_Slider_Pos.Int=4]__LoadInlineSetting_[CBinarize.Cleanup_Slider_Pos.Int=4]");
        this.f3376bw.setImagePerfectionProfile(this.f3375aP);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3747c(ErrorInfo errorInfo) {
        if (errorInfo == ErrorInfo.KMC_SUCCESS) {
            this.f3379hC = null;
            OcrResultData ocrResultData = new OcrResultData();
            this.f3378hB = ocrResultData;
            ocrResultData.resultCode = ErrorInfo.KMC_SUCCESS;
            this.f3378hB.imageID = this.f3377hA.getImageID();
            this.f3378hB.getWords();
            Iterator<OcrEventListener> it = this.f3381hy.iterator();
            while (it.hasNext()) {
                it.next().ocrSucceeded(this.f3378hB);
            }
            return;
        }
        this.f3378hB = null;
        OcrFailureData ocrFailureData = new OcrFailureData();
        this.f3379hC = ocrFailureData;
        ocrFailureData.f3384hH = errorInfo;
        this.f3379hC.imageID = this.f3377hA.getImageID();
        Iterator<OcrEventListener> it2 = this.f3381hy.iterator();
        while (it2.hasNext()) {
            it2.next().ocrFailed(this.f3379hC);
        }
    }

    public void addOcrListener(OcrEventListener ocrEventListener) {
        if (ocrEventListener == null) {
            throw new NullPointerException("addOcrListener: listener parameter is null");
        } else if (!this.f3381hy.contains(ocrEventListener)) {
            this.f3381hy.add(ocrEventListener);
        }
    }

    public void removeListener(OcrEventListener ocrEventListener) {
        this.f3381hy.remove(ocrEventListener);
    }

    /* renamed from: ac */
    private boolean m3745ac() {
        ArrayList<OcrWord> arrayList = f3374hz;
        return arrayList != null && arrayList.size() > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public String m3749f(String str) {
        f3374hz.clear();
        StringBuilder sb = new StringBuilder();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONObject("Front Side").getJSONObject("Text Lines").getJSONArray("Lines");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("Words");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    OcrWord ocrWord = new OcrWord();
                    JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next.equalsIgnoreCase("Word")) {
                            String string = jSONObject.getString(next);
                            if (string != null) {
                                ocrWord.setText(string);
                            }
                        } else if (next.equalsIgnoreCase("TLx")) {
                            ocrWord.setX(jSONObject.getInt("TLx"));
                        } else if (next.equalsIgnoreCase("TLy")) {
                            ocrWord.setY(jSONObject.getInt("TLy"));
                        } else if (next.equalsIgnoreCase("BRy")) {
                            ocrWord.setBRy(jSONObject.getInt("BRy"));
                        } else if (next.equalsIgnoreCase("TRy")) {
                            ocrWord.setTRy(jSONObject.getInt("TRy"));
                        } else if (next.equalsIgnoreCase("TRx")) {
                            ocrWord.setTRx(jSONObject.getInt("TRx"));
                        } else if (next.equalsIgnoreCase("TLx")) {
                            ocrWord.setTRx(jSONObject.getInt("TLx"));
                        }
                    }
                    f3374hz.add(ocrWord);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    protected static ArrayList<OcrWord> ocrWords() {
        return f3374hz;
    }

    /* renamed from: ad */
    private Image m3746ad() {
        return this.f3377hA;
    }

    /* renamed from: a */
    private void m3742a(Object obj, String str) {
        if (obj != null) {
            boolean z = false;
            if ((obj.getClass().getSimpleName().equals("Integer") && ((Integer) obj).intValue() < 0) || (obj.getClass().getSimpleName().equals("Float") && ((Float) obj).floatValue() < BitmapDescriptorFactory.HUE_RED)) {
                z = true;
            }
            if (z) {
                ErrorInfo errorInfo = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
                StringBuilder sb = new StringBuilder();
                sb.append("'");
                sb.append(str);
                sb.append("' parameter is negative");
                errorInfo.setErrCause(sb.toString());
                throw new KmcRuntimeException(errorInfo);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("'");
        sb2.append(str);
        sb2.append("' parameter is null");
        throw new NullPointerException(sb2.toString());
    }

    /* renamed from: e */
    private void m3748e(Bitmap bitmap) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb.append("/Archana/");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("abcd.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(sb2.toString());
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            C0767k.m1820e("Could not save", e.toString());
        }
    }
}
