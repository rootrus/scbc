package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.ImageClassificationResult;
import com.kofax.kmc.ken.engines.iplib.IpFileBuffer;
import com.kofax.kmc.ken.engines.service.ImageService;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.IllegalThreadStateException;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p015ak.C0857a;
import com.kofax.mobile.sdk.p027r.C0990b;
import com.kofax.mobile.sdk.p027r.C0991c;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.jmrtd.lds.ImageInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.ModifyQuickTopUpReviewActivity;

public class Image implements Serializable {
    public static final int DEFAULT_JPEG_QUALITY = 90;
    public static final int MAX_JPEG_QUALITY = 100;
    public static final float MAX_SCALING_FACTOR = 1.0f;
    public static final int MIN_DPI_VALUE = 25;
    public static final int MIN_JPEG_QUALITY = 1;
    public static final float MIN_SCALING_FACTOR = 0.1f;
    private static final String TAG = Image.class.getSimpleName();

    /* renamed from: cT */
    private static final int f215cT = 10;

    /* renamed from: cU */
    private static final int f216cU = 72;
    private static final long serialVersionUID = 1704759624970925806L;
    private transient IBus _bus;

    /* renamed from: cV */
    private transient File f217cV;

    /* renamed from: cW */
    private transient ImageMimeType f218cW;
    /* access modifiers changed from: private */

    /* renamed from: cX */
    public transient Bitmap f219cX;
    /* access modifiers changed from: private */

    /* renamed from: cY */
    public transient ImageRep f220cY;
    /* access modifiers changed from: private */

    /* renamed from: cZ */
    public transient Integer f221cZ;
    /* access modifiers changed from: private */

    /* renamed from: dA */
    public transient String f222dA;

    /* renamed from: dB */
    private transient boolean f223dB;

    /* renamed from: dC */
    private transient Rect f224dC;
    /* access modifiers changed from: private */

    /* renamed from: da */
    public transient Integer f225da;

    /* renamed from: db */
    private transient Float f226db;
    /* access modifiers changed from: private */

    /* renamed from: dc */
    public transient Integer f227dc;
    /* access modifiers changed from: private */

    /* renamed from: dd */
    public transient Integer f228dd;

    /* renamed from: de */
    private transient String f229de;
    /* access modifiers changed from: private */

    /* renamed from: df */
    public transient String f230df;
    /* access modifiers changed from: private */

    /* renamed from: dg */
    public transient String f231dg;
    /* access modifiers changed from: private */

    /* renamed from: dh */
    public transient String f232dh;
    /* access modifiers changed from: private */

    /* renamed from: di */
    public transient ImagePerfectionProfile f233di;
    /* access modifiers changed from: private */

    /* renamed from: dj */
    public transient BasicSettingsProfile f234dj;
    /* access modifiers changed from: private */

    /* renamed from: dk */
    public transient QuickAnalysisFeedback f235dk;
    /* access modifiers changed from: private */

    /* renamed from: dl */
    public transient Float f236dl;
    /* access modifiers changed from: private */

    /* renamed from: dm */
    public transient Float f237dm;

    /* renamed from: dn */
    private transient List<BarCodeResult> f238dn;

    /* renamed from: do */
    private transient List<ImageClassificationResult> f239do;
    /* access modifiers changed from: private */

    /* renamed from: dp */
    public transient Float f240dp;
    /* access modifiers changed from: private */

    /* renamed from: dq */
    public transient Float f241dq;

    /* renamed from: dr */
    private transient String f242dr;
    /* access modifiers changed from: private */

    /* renamed from: ds */
    public transient Integer f243ds;

    /* renamed from: dt */
    private transient Integer f244dt;

    /* renamed from: du */
    private transient OutputColor f245du;

    /* renamed from: dv */
    private transient FileIOEngine f246dv;
    /* access modifiers changed from: private */

    /* renamed from: dw */
    public transient ImageFileRep f247dw;
    /* access modifiers changed from: private */

    /* renamed from: dx */
    public transient IpFileBuffer f248dx;

    /* renamed from: dy */
    private transient String f249dy;
    /* access modifiers changed from: private */

    /* renamed from: dz */
    public transient long f250dz;

    public enum FileIOEngine {
        FILE_ENG_KFIL,
        FILE_ENG_ANDROID
    }

    public enum FileRestriction {
        NONE,
        ANSI_X9
    }

    public enum ImageFileRep {
        FILE_NONE,
        FILE_STORED,
        FILE_BUFFERED
    }

    public enum ImageMimeType {
        MIMETYPE_JPEG,
        MIMETYPE_PNG,
        MIMETYPE_TIFF,
        MIMETYPE_UNKNOWN
    }

    public enum ImageRep {
        IMAGE_REP_NONE,
        IMAGE_REP_BITMAP,
        IMAGE_REP_FILE,
        IMAGE_REP_BOTH
    }

    /* renamed from: com.kofax.kmc.ken.engines.data.Image$a */
    enum C0439a {
        IMAGE_REP_NONE_NONE,
        IMAGE_REP_FILE_STORED,
        IMAGE_REP_FILE_BUFFERED,
        IMAGE_REP_BITMAP_NONE,
        IMAGE_REP_BOTH_STORED,
        IMAGE_REP_BOTH_BUFFERED
    }

    /* renamed from: com.kofax.kmc.ken.engines.data.Image$b */
    enum C0440b {
        FILE_IO_READ,
        FILE_IO_WRITE
    }

    public enum OutputColor {
        BITDEPTH_BITONAL(1, 1),
        BITDEPTH_GRAYSCALE(1, 8),
        BITDEPTH_COLOR(3, 8);
        
        private int bitsPerPixel;

        /* renamed from: dV */
        private int f261dV;

        /* renamed from: dW */
        private int f262dW;

        private OutputColor(int i, int i2) {
            this.f261dV = i;
            this.f262dW = i2;
            this.bitsPerPixel = i * i2;
        }

        public final int getChannels() {
            return this.f261dV;
        }

        public final int getBitsPerChannel() {
            return this.f262dW;
        }

        public final int getBitsPerPixel() {
            return this.bitsPerPixel;
        }
    }

    protected class BitmapDataObject implements Serializable {
        private static final long serialVersionUID = 2569305159857742532L;
        public byte[] imageByteArray;

        protected BitmapDataObject() {
        }
    }

    public static class KenBitmap {
        public Bitmap bitmap = null;
        public ErrorInfo errInfo = ErrorInfo.KMC_SUCCESS;
        public Integer mDpiX = null;
        public Integer mDpiY = null;
        public int scaleFactor = 1;

        public KenBitmap() {
        }

        public KenBitmap(Bitmap bitmap2) {
            this.bitmap = bitmap2;
        }

        private void recycle() {
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.bitmap = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 != 4) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getImageSize() {
        /*
            r5 = this;
            com.kofax.kmc.ken.engines.data.Image$ImageRep r0 = r5.getImageRepresentation()
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r1 = r5.getImageFileRep()
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r2 = com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED
            if (r1 != r2) goto L_0x0011
            com.kofax.kmc.ken.engines.iplib.IpFileBuffer r0 = r5.f248dx
            int r0 = r0.mFileBufferLength
            goto L_0x004c
        L_0x0011:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r1 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE
            if (r0 == r1) goto L_0x0051
            com.kofax.kmc.ken.engines.data.Image$ImageRep r1 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            if (r0 == r1) goto L_0x0051
            com.kofax.kmc.ken.engines.data.Image$ImageRep r1 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP
            if (r0 != r1) goto L_0x004e
            android.graphics.Bitmap r0 = r5.f219cX
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            r1 = 2
            r2 = 4
            r3 = 1
            if (r0 != 0) goto L_0x0029
            goto L_0x003b
        L_0x0029:
            int[] r4 = com.kofax.kmc.ken.engines.data.Image.C04381.f252dD
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 == r3) goto L_0x003d
            if (r0 == r1) goto L_0x003e
            r3 = 3
            if (r0 == r3) goto L_0x003b
            if (r0 != r2) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            r1 = r2
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            java.lang.Integer r0 = r5.f225da
            int r0 = r0.intValue()
            java.lang.Integer r2 = r5.f221cZ
            int r2 = r2.intValue()
            int r0 = r0 * r2
            int r0 = r0 * r1
        L_0x004c:
            long r0 = (long) r0
            goto L_0x0057
        L_0x004e:
            r0 = 0
            goto L_0x0057
        L_0x0051:
            java.io.File r0 = r5.f217cV
            long r0 = r0.length()
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.Image.getImageSize():long");
    }

    public Image() {
        this.f217cV = null;
        this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
        this.f219cX = null;
        this.f220cY = ImageRep.IMAGE_REP_NONE;
        this.f221cZ = null;
        this.f225da = null;
        this.f226db = Float.valueOf(1.0f);
        this.f227dc = null;
        this.f228dd = null;
        this.f229de = new String();
        this.f230df = new String();
        this.f231dg = new String();
        this.f232dh = new String();
        this.f233di = null;
        this.f234dj = null;
        this.f235dk = null;
        this.f236dl = null;
        this.f237dm = null;
        this.f238dn = new ArrayList();
        this.f239do = new ArrayList();
        this.f240dp = null;
        this.f241dq = null;
        this.f242dr = new String();
        this.f243ds = null;
        this.f244dt = 90;
        this.f245du = OutputColor.BITDEPTH_COLOR;
        this.f246dv = FileIOEngine.FILE_ENG_KFIL;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f248dx = null;
        this.f249dy = new String();
        this.f250dz = 0;
        this.f222dA = new String();
        this.f223dB = false;
        this.f224dC = null;
        this.f220cY = ImageRep.IMAGE_REP_NONE;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
        Date date = new Date();
        this.f242dr = ImageService.UTCStringFromDate(date);
        this.f222dA = ImageService.exifTimeFromDate(date, "UTC");
        this.f230df = UUID.randomUUID().toString();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("imgCreateDateTime: ");
        sb.append(this.f242dr);
        C0767k.m1807c(str, sb.toString());
        m266t();
    }

    public Image(Bitmap bitmap) throws NullPointerException {
        this.f217cV = null;
        this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
        this.f219cX = null;
        this.f220cY = ImageRep.IMAGE_REP_NONE;
        this.f221cZ = null;
        this.f225da = null;
        this.f226db = Float.valueOf(1.0f);
        this.f227dc = null;
        this.f228dd = null;
        this.f229de = new String();
        this.f230df = new String();
        this.f231dg = new String();
        this.f232dh = new String();
        this.f233di = null;
        this.f234dj = null;
        this.f235dk = null;
        this.f236dl = null;
        this.f237dm = null;
        this.f238dn = new ArrayList();
        this.f239do = new ArrayList();
        this.f240dp = null;
        this.f241dq = null;
        this.f242dr = new String();
        this.f243ds = null;
        this.f244dt = 90;
        this.f245du = OutputColor.BITDEPTH_COLOR;
        this.f246dv = FileIOEngine.FILE_ENG_KFIL;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f248dx = null;
        this.f249dy = new String();
        this.f250dz = 0;
        this.f222dA = new String();
        this.f223dB = false;
        this.f224dC = null;
        if (bitmap != null) {
            this.f219cX = bitmap;
            this.f220cY = ImageRep.IMAGE_REP_BITMAP;
            this.f247dw = ImageFileRep.FILE_NONE;
            Date date = new Date();
            this.f242dr = ImageService.UTCStringFromDate(date);
            this.f222dA = ImageService.exifTimeFromDate(date, "UTC");
            this.f243ds = 72;
            this.f230df = UUID.randomUUID().toString();
            this.f221cZ = Integer.valueOf(this.f219cX.getWidth());
            this.f225da = Integer.valueOf(this.f219cX.getHeight());
            m266t();
            return;
        }
        throw new NullPointerException("bitmap parameter is null");
    }

    public Image(File file, ImageMimeType imageMimeType) {
        this.f217cV = null;
        this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
        this.f219cX = null;
        this.f220cY = ImageRep.IMAGE_REP_NONE;
        this.f221cZ = null;
        this.f225da = null;
        this.f226db = Float.valueOf(1.0f);
        this.f227dc = null;
        this.f228dd = null;
        this.f229de = new String();
        this.f230df = new String();
        this.f231dg = new String();
        this.f232dh = new String();
        this.f233di = null;
        this.f234dj = null;
        this.f235dk = null;
        this.f236dl = null;
        this.f237dm = null;
        this.f238dn = new ArrayList();
        this.f239do = new ArrayList();
        this.f240dp = null;
        this.f241dq = null;
        this.f242dr = new String();
        this.f243ds = null;
        this.f244dt = 90;
        this.f245du = OutputColor.BITDEPTH_COLOR;
        this.f246dv = FileIOEngine.FILE_ENG_KFIL;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f248dx = null;
        this.f249dy = new String();
        this.f250dz = 0;
        this.f222dA = new String();
        this.f223dB = false;
        this.f224dC = null;
        m227a(file, imageMimeType, true);
        this.f217cV = new File(file.getAbsolutePath());
        this.f220cY = ImageRep.IMAGE_REP_FILE;
        this.f247dw = ImageFileRep.FILE_STORED;
        this.f218cW = imageMimeType;
        Date date = new Date();
        this.f242dr = ImageService.UTCStringFromDate(date);
        this.f222dA = ImageService.exifTimeFromDate(date, "UTC");
        this.f230df = UUID.randomUUID().toString();
        m253d(this.f217cV.getAbsolutePath());
        m266t();
    }

    public Image(String str, ImageMimeType imageMimeType) {
        this.f217cV = null;
        this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
        this.f219cX = null;
        this.f220cY = ImageRep.IMAGE_REP_NONE;
        this.f221cZ = null;
        this.f225da = null;
        this.f226db = Float.valueOf(1.0f);
        this.f227dc = null;
        this.f228dd = null;
        this.f229de = new String();
        this.f230df = new String();
        this.f231dg = new String();
        this.f232dh = new String();
        this.f233di = null;
        this.f234dj = null;
        this.f235dk = null;
        this.f236dl = null;
        this.f237dm = null;
        this.f238dn = new ArrayList();
        this.f239do = new ArrayList();
        this.f240dp = null;
        this.f241dq = null;
        this.f242dr = new String();
        this.f243ds = null;
        this.f244dt = 90;
        this.f245du = OutputColor.BITDEPTH_COLOR;
        this.f246dv = FileIOEngine.FILE_ENG_KFIL;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f248dx = null;
        this.f249dy = new String();
        this.f250dz = 0;
        this.f222dA = new String();
        this.f223dB = false;
        this.f224dC = null;
        File file = new File(str);
        m227a(file, imageMimeType, true);
        this.f217cV = file;
        this.f220cY = ImageRep.IMAGE_REP_FILE;
        this.f247dw = ImageFileRep.FILE_STORED;
        this.f218cW = imageMimeType;
        Date date = new Date();
        this.f242dr = ImageService.UTCStringFromDate(date);
        this.f222dA = ImageService.exifTimeFromDate(date, "UTC");
        this.f230df = UUID.randomUUID().toString();
        m253d(this.f217cV.getAbsolutePath());
        m266t();
    }

    /* renamed from: t */
    private void m266t() {
        if (this.f220cY != ImageRep.IMAGE_REP_NONE && AppContextProvider.getContext() != null) {
            if (!this.f223dB) {
                this._bus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
                this.f250dz = System.currentTimeMillis();
                this._bus.post(new C0990b(this, ImageSource.IMAGE));
                this.f223dB = true;
                return;
            }
            this._bus.post(new C0991c(this, ImageSource.IMAGE));
        }
    }

    public String getImageFilePath() {
        File file = this.f217cV;
        return file == null ? "" : file.getAbsolutePath();
    }

    public void setImageFilePath(String str) throws KmcRuntimeException {
        ImageMimeType imageMimeType;
        File file;
        if (str != null) {
            file = new File(str);
            imageMimeType = m213a(file);
        } else {
            file = null;
            imageMimeType = null;
        }
        if (imageMimeType != ImageMimeType.MIMETYPE_UNKNOWN || str.isEmpty()) {
            m233a(str, imageMimeType, false, true);
            if (!file.exists()) {
                this.f220cY = (m272z() || m202A()) ? ImageRep.IMAGE_REP_BITMAP : ImageRep.IMAGE_REP_NONE;
                this.f247dw = ImageFileRep.FILE_NONE;
                this.f227dc = null;
                this.f228dd = null;
            } else if (m272z() || m202A()) {
                throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH);
            } else {
                this.f220cY = ImageRep.IMAGE_REP_FILE;
                this.f247dw = ImageFileRep.FILE_STORED;
                m253d(str);
            }
            if (str.isEmpty()) {
                this.f217cV = null;
            } else {
                this.f217cV = file;
                this.f218cW = imageMimeType;
            }
            m266t();
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_ED_UNRECOGNIZED_MIME_TYPE);
    }

    public ImageMimeType getImageMimeType() {
        return this.f218cW;
    }

    public void setImageMimeType(ImageMimeType imageMimeType) {
        if (imageMimeType != null) {
            this.f218cW = imageMimeType;
            return;
        }
        throw new IllegalArgumentException("imgMimeType may not null");
    }

    public Bitmap getImageBitmap() {
        return this.f219cX;
    }

    public void setImageBitmap(Bitmap bitmap) throws KmcRuntimeException {
        m252d(bitmap);
        m270x();
        if (m202A() || m271y()) {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH);
        }
        Bitmap bitmap2 = this.f219cX;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f219cX = null;
        }
        this.f219cX = bitmap;
        this.f220cY = ImageRep.IMAGE_REP_BITMAP;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f243ds = 72;
        this.f221cZ = Integer.valueOf(this.f219cX.getWidth());
        this.f225da = Integer.valueOf(this.f219cX.getHeight());
        m266t();
    }

    public ImageRep getImageRepresentation() {
        return this.f220cY;
    }

    public Integer getImageBitmapWidth() {
        return this.f221cZ;
    }

    public Integer getImageBitmapHeight() {
        return this.f225da;
    }

    public Float getImageBitmapScaling() {
        return this.f226db;
    }

    public Integer getImageFileWidth() {
        return this.f227dc;
    }

    public Integer getImageFileHeight() {
        return this.f228dd;
    }

    /* renamed from: u */
    private boolean m267u() {
        if (m202A()) {
            return (this.f219cX.getWidth() == getImageFileWidth().intValue() && this.f219cX.getHeight() == getImageFileHeight().intValue()) ? false : true;
        }
        throw new IllegalStateException();
    }

    public String getImageTag() {
        return this.f229de;
    }

    public void setImageTag(String str) {
        this.f229de = str;
    }

    public String getImageID() {
        return this.f230df;
    }

    public String getImageSrcID() {
        return this.f231dg;
    }

    public String getImageMetaData() {
        return this.f232dh;
    }

    private void setImageMetaData(String str) {
        this.f232dh = str;
    }

    @Deprecated
    public ImagePerfectionProfile getImagePerfectProfileUsed() {
        ImagePerfectionProfile imagePerfectionProfile = this.f233di;
        if (imagePerfectionProfile != null) {
            return imagePerfectionProfile.clone();
        }
        return null;
    }

    @Deprecated
    public BasicSettingsProfile getBasicSettingsProfileUsed() {
        BasicSettingsProfile basicSettingsProfile = this.f234dj;
        if (basicSettingsProfile != null) {
            return basicSettingsProfile.clone();
        }
        return null;
    }

    public QuickAnalysisFeedback getImageQuickAnalysisFeedBack() {
        return this.f235dk;
    }

    public Float getImageLatitude() {
        return this.f236dl;
    }

    public Float getImageLongitude() {
        return this.f237dm;
    }

    public List<BarCodeResult> getImageBarCodes() {
        return this.f238dn;
    }

    public void setImageBarCodes(List<BarCodeResult> list) {
        m232a((Object) list, "imageBarCodes");
        this.f238dn = list;
    }

    @Deprecated
    public List<ImageClassificationResult> getImageClassifyResults() {
        return this.f239do;
    }

    @Deprecated
    public void setImageClassifyResults(List<ImageClassificationResult> list) {
        m232a((Object) list, "imgClassifyResults");
        this.f239do = list;
    }

    public Float getImagePitch() {
        return this.f240dp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10195a(float f) {
        this.f240dp = Float.valueOf(f);
    }

    public Float getImageRoll() {
        return this.f241dq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10196b(float f) {
        this.f241dq = Float.valueOf(f);
    }

    public String getImageCreateDateTime() {
        return this.f242dr;
    }

    public void setImageCreateDateTime(String str) {
        m232a((Object) str, "imgCreateDateTime");
        ImageService.checkDateTimeFormat(str);
        this.f242dr = str;
    }

    public Integer getImageDPI() {
        return this.f243ds;
    }

    public void setImageDPI(int i) {
        if (i >= 25) {
            this.f243ds = Integer.valueOf(i);
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_DPI);
    }

    public Integer getImageJpegQuality() {
        return this.f244dt;
    }

    public void setImageJpegQuality(int i) {
        if (i <= 0 || i > 100) {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_JPEG_QUALITY_VALUE);
        }
        this.f244dt = Integer.valueOf(i);
    }

    public OutputColor getImageOutputColor() {
        return this.f245du;
    }

    public void setImageOutputColor(OutputColor outputColor) {
        this.f245du = outputColor;
    }

    public ImageFileRep getImageFileRep() {
        return this.f247dw;
    }

    public ByteBuffer getImageFileBuffer() {
        if (!m205D()) {
            return ByteBuffer.allocate(0);
        }
        IpFileBuffer ipFileBuffer = this.f248dx;
        if (ipFileBuffer != null) {
            return ipFileBuffer.mByteBuffer.asReadOnlyBuffer();
        }
        throw new InternalError("Image.fileBuffer is null");
    }

    public ErrorInfo imageWriteToFile() throws KmcException, KmcRuntimeException {
        return imageWriteToFile(this.f246dv);
    }

    public ErrorInfo imageWriteToFile(FileIOEngine fileIOEngine) throws KmcException, KmcRuntimeException {
        return m219a(fileIOEngine, FileRestriction.NONE);
    }

    public ErrorInfo imageWriteToFile(FileRestriction fileRestriction) throws KmcException, KmcRuntimeException {
        return m219a(FileIOEngine.FILE_ENG_KFIL, fileRestriction);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0177  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.kut.utilities.error.ErrorInfo m219a(com.kofax.kmc.ken.engines.data.Image.FileIOEngine r11, com.kofax.kmc.ken.engines.data.Image.FileRestriction r12) throws com.kofax.kmc.kut.utilities.error.KmcException, com.kofax.kmc.kut.utilities.error.KmcRuntimeException {
        /*
            r10 = this;
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            com.kofax.kmc.ken.engines.data.Image$FileRestriction r0 = com.kofax.kmc.ken.engines.data.Image.FileRestriction.ANSI_X9
            if (r0 != r12) goto L_0x000d
            java.lang.String r0 = TAG
            java.lang.String r1 = "ANSI_X9"
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r0, (java.lang.String) r1)
        L_0x000d:
            java.io.File r0 = r10.f217cV
            if (r0 != 0) goto L_0x001a
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILEPATH
            java.lang.String r0 = "imgFile field is null"
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x001a:
            java.io.File r0 = r0.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0047
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_FILE_NOT_FOUND
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "imgFile directory"
            r0.append(r1)
            java.io.File r1 = r10.f217cV
            java.lang.String r1 = r1.getParent()
            r0.append(r1)
            java.lang.String r1 = " does not exist"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x0047:
            java.io.File r0 = r10.f217cV
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0071
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILE_EXISTS
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "imgFile "
            r0.append(r1)
            java.io.File r1 = r10.f217cV
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = " already exists"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x0071:
            android.graphics.Bitmap r0 = r10.f219cX
            if (r0 != 0) goto L_0x007d
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NOIMAGE
            java.lang.String r0 = "imgBitmap field is null"
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x007d:
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r0 = r10.f218cW
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN
            if (r0 != r1) goto L_0x008b
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_MIMETYPE
            java.lang.String r0 = "imgMimeType set to MIMETYPE_UNKNOWN"
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x008b:
            boolean r0 = r10.m205D()
            if (r0 == 0) goto L_0x0099
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_BUFFER_EXISTS
            java.lang.String r0 = "imgFileRep set to FILE_BUFFERED"
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x0099:
            java.io.File r0 = r10.f217cV
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r0 = r10.m213a((java.io.File) r0)
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = r10.f218cW
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c9
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_MIMETYPE_MISMATCH
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "imgMimeType: "
            r0.append(r1)
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = r10.f218cW
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " does not match MIME type of file"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.setErrCause(r0)
            goto L_0x00dc
        L_0x00c9:
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r0 = r10.f218cW
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG
            if (r0 != r1) goto L_0x00df
            com.kofax.kmc.ken.engines.data.Image$OutputColor r0 = r10.f245du
            com.kofax.kmc.ken.engines.data.Image$OutputColor r1 = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_BITONAL
            if (r0 != r1) goto L_0x00df
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_JPEG_BITDEPTH
            java.lang.String r0 = "OutputColor cannot be BITDEPTH_BITONAL when MIME type is MIMETYPE_JPEG"
            r12.setErrCause(r0)
        L_0x00dc:
            r0 = r11
            goto L_0x0158
        L_0x00df:
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r0 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_ANDROID
            if (r11 != r0) goto L_0x0103
            boolean r0 = r10.m207F()
            if (r0 == 0) goto L_0x0103
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r12 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_ANDROID
            android.graphics.Bitmap r0 = r10.f219cX
            java.io.File r1 = r10.f217cV
            java.lang.String r1 = r1.getAbsolutePath()
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r2 = r10.f218cW
            java.lang.Integer r3 = r10.f244dt
            int r3 = r3.intValue()
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.ken.engines.service.ImageService.saveBitmap(r0, r1, r2, r3)
            r9 = r0
            r0 = r12
            r12 = r9
            goto L_0x0158
        L_0x0103:
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r0 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_KFIL
            java.lang.Integer r1 = r10.f243ds
            if (r1 == 0) goto L_0x010e
            int r1 = r1.intValue()
            goto L_0x0110
        L_0x010e:
            r1 = 72
        L_0x0110:
            r6 = r1
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.ken.engines.service.ImageService.verifyRestrictions(r10, r12)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r2 != r1) goto L_0x0157
            java.lang.String r1 = r10.f232dh
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0129
            java.lang.String r12 = com.kofax.kmc.ken.engines.service.ImageService.createMetadataFromImage(r10, r12)
            r10.f232dh = r12
        L_0x0127:
            r8 = r12
            goto L_0x013c
        L_0x0129:
            java.lang.String r2 = r10.f232dh
            boolean r2 = com.kofax.kmc.ken.engines.service.ImageService.isImageProcessingMetadata(r2)
            if (r2 != 0) goto L_0x0137
            com.kofax.kmc.ken.engines.data.Image$FileRestriction r2 = com.kofax.kmc.ken.engines.data.Image.FileRestriction.NONE
            if (r2 != r12) goto L_0x0137
            r8 = r1
            goto L_0x013c
        L_0x0137:
            java.lang.String r12 = com.kofax.kmc.ken.engines.service.ImageService.createMetadataFromImage(r10, r12)
            goto L_0x0127
        L_0x013c:
            android.graphics.Bitmap r2 = r10.f219cX
            java.io.File r12 = r10.f217cV
            java.lang.String r3 = r12.getAbsolutePath()
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r4 = r10.f218cW
            com.kofax.kmc.ken.engines.data.Image$OutputColor r12 = r10.f245du
            int r5 = r12.getBitsPerPixel()
            java.lang.Integer r12 = r10.f244dt
            int r7 = r12.intValue()
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.ken.engines.service.ImageService.saveIpBitmap(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0158
        L_0x0157:
            r12 = r1
        L_0x0158:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL
            if (r12 == r1) goto L_0x017b
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY
            if (r12 != r1) goto L_0x0161
            goto L_0x017b
        L_0x0161:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r12 == r1) goto L_0x0177
            boolean r11 = m234a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r12)
            if (r11 == 0) goto L_0x0171
            com.kofax.kmc.kut.utilities.error.KmcException r11 = new com.kofax.kmc.kut.utilities.error.KmcException
            r11.<init>(r12)
            throw r11
        L_0x0171:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r11 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            r11.<init>(r12)
            throw r11
        L_0x0177:
            if (r0 == r11) goto L_0x017b
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
        L_0x017b:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r11 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            r10.f220cY = r11
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r11 = com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_STORED
            r10.f247dw = r11
            java.io.File r11 = r10.f217cV
            java.lang.String r11 = r11.getAbsolutePath()
            r10.m253d((java.lang.String) r11)
            r10.m266t()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.Image.m219a(com.kofax.kmc.ken.engines.data.Image$FileIOEngine, com.kofax.kmc.ken.engines.data.Image$FileRestriction):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    public ErrorInfo imageWriteToFileBuffer() throws KmcException, KmcRuntimeException {
        return imageWriteToFileBuffer(FileIOEngine.FILE_ENG_KFIL);
    }

    public ErrorInfo imageWriteToFileBuffer(FileIOEngine fileIOEngine) throws KmcException, KmcRuntimeException {
        return m236b(fileIOEngine, FileRestriction.NONE);
    }

    public ErrorInfo imageWriteToFileBuffer(FileRestriction fileRestriction) throws KmcException, KmcRuntimeException {
        return m236b(FileIOEngine.FILE_ENG_KFIL, fileRestriction);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.kut.utilities.error.ErrorInfo m236b(com.kofax.kmc.ken.engines.data.Image.FileIOEngine r5, com.kofax.kmc.ken.engines.data.Image.FileRestriction r6) throws com.kofax.kmc.kut.utilities.error.KmcException, com.kofax.kmc.kut.utilities.error.KmcRuntimeException {
        /*
            r4 = this;
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            android.graphics.Bitmap r0 = r4.f219cX
            if (r0 != 0) goto L_0x000e
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_OBJECT_REP_NO_BITMAP
            java.lang.String r0 = "imgBitmap field is null"
            r6.setErrCause(r0)
            goto L_0x004b
        L_0x000e:
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r0 = r4.f218cW
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN
            if (r0 != r1) goto L_0x001c
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_MIMETYPE
            java.lang.String r0 = "imgMimeType set to MIMETYPE_UNKNOWN"
            r6.setErrCause(r0)
            goto L_0x004b
        L_0x001c:
            boolean r0 = r4.m205D()
            if (r0 == 0) goto L_0x002a
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALREADY_BUFFERED
            java.lang.String r0 = "imgFileRep set to FILE_BUFFERED"
            r6.setErrCause(r0)
            goto L_0x004b
        L_0x002a:
            boolean r0 = r4.m204C()
            if (r0 == 0) goto L_0x0038
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH
            java.lang.String r0 = "imgFileRep set to FILE_BUFFERED or FILE_STORED"
            r6.setErrCause(r0)
            goto L_0x004b
        L_0x0038:
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r0 = r4.f218cW
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG
            if (r0 != r1) goto L_0x004d
            com.kofax.kmc.ken.engines.data.Image$OutputColor r0 = r4.f245du
            com.kofax.kmc.ken.engines.data.Image$OutputColor r1 = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_BITONAL
            if (r0 != r1) goto L_0x004d
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_JPEG_BITDEPTH
            java.lang.String r0 = "OutputColor cannot be BITDEPTH_BITONAL when MIME type is MIMETYPE_JPEG"
            r6.setErrCause(r0)
        L_0x004b:
            r0 = r5
            goto L_0x008e
        L_0x004d:
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r0 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_KFIL
            java.lang.Integer r1 = r4.f243ds
            if (r1 == 0) goto L_0x0058
            int r1 = r1.intValue()
            goto L_0x005a
        L_0x0058:
            r1 = 72
        L_0x005a:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.ken.engines.service.ImageService.verifyRestrictions(r4, r6)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r3 != r2) goto L_0x008d
            java.lang.String r2 = r4.f232dh
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0071
            java.lang.String r2 = com.kofax.kmc.ken.engines.service.ImageService.createMetadataFromImage(r4, r6)
            r4.f232dh = r2
            goto L_0x0081
        L_0x0071:
            java.lang.String r3 = r4.f232dh
            boolean r3 = com.kofax.kmc.ken.engines.service.ImageService.isImageProcessingMetadata(r3)
            if (r3 != 0) goto L_0x007d
            com.kofax.kmc.ken.engines.data.Image$FileRestriction r3 = com.kofax.kmc.ken.engines.data.Image.FileRestriction.NONE
            if (r3 == r6) goto L_0x0081
        L_0x007d:
            java.lang.String r2 = com.kofax.kmc.ken.engines.service.ImageService.createMetadataFromImage(r4, r6)
        L_0x0081:
            r4.m255e(r2)
            android.graphics.Bitmap r6 = r4.f219cX
            com.kofax.kmc.ken.engines.iplib.IpFileBuffer r2 = r4.f248dx
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.ken.engines.service.ImageService.saveIpBitmap(r6, r1, r2)
            goto L_0x008e
        L_0x008d:
            r6 = r2
        L_0x008e:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL
            if (r6 == r1) goto L_0x00b1
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY
            if (r6 != r1) goto L_0x0097
            goto L_0x00b1
        L_0x0097:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r6 == r1) goto L_0x00ad
            boolean r5 = m234a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r6)
            if (r5 == 0) goto L_0x00a7
            com.kofax.kmc.kut.utilities.error.KmcException r5 = new com.kofax.kmc.kut.utilities.error.KmcException
            r5.<init>(r6)
            throw r5
        L_0x00a7:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r5 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            r5.<init>(r6)
            throw r5
        L_0x00ad:
            if (r0 == r5) goto L_0x00b1
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
        L_0x00b1:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r5 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            r4.f220cY = r5
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r5 = com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED
            r4.f247dw = r5
            com.kofax.kmc.ken.engines.iplib.IpFileBuffer r5 = r4.f248dx
            r4.m226a((com.kofax.kmc.ken.engines.iplib.IpFileBuffer) r5)
            r4.m266t()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.Image.m236b(com.kofax.kmc.ken.engines.data.Image$FileIOEngine, com.kofax.kmc.ken.engines.data.Image$FileRestriction):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    public ErrorInfo imageReadFromFile() throws KmcException, KmcRuntimeException {
        return m220a(this.f246dv, true, this.f226db.floatValue());
    }

    public ErrorInfo imageReadFromFile(float f) throws KmcException, KmcRuntimeException {
        return m220a(FileIOEngine.FILE_ENG_KFIL, false, f);
    }

    public ErrorInfo imageReadFromFileBuffer() throws KmcException, KmcRuntimeException {
        return m218a(FileIOEngine.FILE_ENG_KFIL, this.f226db.floatValue());
    }

    public ErrorInfo imageReadFromFileBuffer(float f) throws KmcException, KmcRuntimeException {
        return m218a(FileIOEngine.FILE_ENG_KFIL, f);
    }

    /* renamed from: a */
    private static KenBitmap m215a(IpFileBuffer ipFileBuffer, FileIOEngine fileIOEngine, float f) {
        if (fileIOEngine != FileIOEngine.FILE_ENG_ANDROID) {
            return ImageService.readBitmapFromFileBufferUsingIp(ipFileBuffer, f);
        }
        KenBitmap loadBitmapFromFileBuffer = ImageService.loadBitmapFromFileBuffer(ipFileBuffer);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("kenBitmap: width=");
        sb.append(loadBitmapFromFileBuffer.bitmap.getWidth());
        C0767k.m1807c(str, sb.toString());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("kenBitmap: height=");
        sb2.append(loadBitmapFromFileBuffer.bitmap.getHeight());
        C0767k.m1807c(str2, sb2.toString());
        if (f >= 1.0f) {
            return loadBitmapFromFileBuffer;
        }
        KenBitmap createScaledBitmapFromBitmapWithMatrix = ImageService.createScaledBitmapFromBitmapWithMatrix(loadBitmapFromFileBuffer.bitmap, f);
        String str3 = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("kenBitmapScaled: width=");
        sb3.append(createScaledBitmapFromBitmapWithMatrix.bitmap.getWidth());
        C0767k.m1807c(str3, sb3.toString());
        String str4 = TAG;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("kenBitmapScaled: height=");
        sb4.append(createScaledBitmapFromBitmapWithMatrix.bitmap.getHeight());
        C0767k.m1807c(str4, sb4.toString());
        loadBitmapFromFileBuffer.bitmap.recycle();
        loadBitmapFromFileBuffer.bitmap = null;
        return createScaledBitmapFromBitmapWithMatrix;
    }

    public ErrorInfo imageDeleteFile() throws KmcException, KmcRuntimeException {
        ErrorInfo errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.KMC_SUCCESS;
        File file = this.f217cV;
        if (file == null) {
            errorInfo = ErrorInfo.KMC_ED_FILEPATH;
            errorInfo.setErrCause("imgFile field is null");
        } else if (!file.exists()) {
            errorInfo = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
        } else if (m205D()) {
            errorInfo = ErrorInfo.KMC_ED_DELETE_BUFFERED_FILE;
        } else {
            errorInfo = ImageService.deleteImage(this.f217cV);
        }
        if (errorInfo == ErrorInfo.KMC_SUCCESS || errorInfo == ErrorInfo.KMC_GN_FILE_NOT_FOUND) {
            this.f217cV = null;
            this.f220cY = this.f219cX != null ? ImageRep.IMAGE_REP_BITMAP : ImageRep.IMAGE_REP_NONE;
            this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
            this.f227dc = null;
            this.f228dd = null;
            this.f247dw = ImageFileRep.FILE_NONE;
            m266t();
            return errorInfo;
        } else if (m234a(errorInfo)) {
            throw new KmcException(errorInfo);
        } else {
            throw new KmcRuntimeException(errorInfo);
        }
    }

    public ErrorInfo imageClearBitmap() {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        m270x();
        Bitmap bitmap = this.f219cX;
        if (bitmap == null) {
            return ErrorInfo.KMC_ED_ALREADY_CLEAR;
        }
        bitmap.recycle();
        this.f219cX = null;
        this.f220cY = m272z() ? ImageRep.IMAGE_REP_NONE : ImageRep.IMAGE_REP_FILE;
        if (ImageRep.IMAGE_REP_NONE == this.f220cY) {
            this.f243ds = null;
        }
        this.f221cZ = null;
        this.f225da = null;
        m266t();
        return errorInfo;
    }

    public ErrorInfo imageClearFileBuffer() throws KmcException {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        if (!m205D()) {
            return ErrorInfo.KMC_ED_BUFFER_ALREADY_CLEARED;
        }
        ErrorInfo clearFileBufferUsingIp = ImageService.clearFileBufferUsingIp(this.f248dx);
        this.f248dx = null;
        this.f220cY = m202A() ? ImageRep.IMAGE_REP_BITMAP : ImageRep.IMAGE_REP_NONE;
        this.f247dw = ImageFileRep.FILE_NONE;
        m266t();
        return clearFileBufferUsingIp;
    }

    public Bitmap createScaledBitmap(float f) throws KmcException {
        Bitmap bitmap = this.f219cX;
        if (bitmap == null) {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_NO_BITMAP);
        } else if (f < 0.1f || f > 1.0f) {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGE_INVALID_SCALING_FACTOR);
        } else {
            KenBitmap createScaledBitmapFromBitmapWithMatrix = ImageService.createScaledBitmapFromBitmapWithMatrix(bitmap, f);
            if (createScaledBitmapFromBitmapWithMatrix.errInfo == ErrorInfo.KMC_SUCCESS) {
                return createScaledBitmapFromBitmapWithMatrix.bitmap;
            }
            throw new KmcException(createScaledBitmapFromBitmapWithMatrix.errInfo);
        }
    }

    /* renamed from: v */
    private String m268v() throws JSONException {
        JSONArray jSONArray = new JSONObject(this.f232dh).getJSONObject("Front Side").getJSONObject("Text Lines").getJSONArray("Lines");
        String str = new String();
        for (int i = 0; i < jSONArray.length(); i++) {
            if ("MICR".equals(jSONArray.getJSONObject(i).getString("Label"))) {
                str = jSONArray.getJSONObject(i).getString("OCR Data");
                if (jSONArray.getJSONObject(i).getInt("BLy") - jSONArray.getJSONObject(i).getInt("TLy") >= 8 && str.matches(".*C\\d{9}C.*")) {
                    break;
                }
            }
        }
        return str;
    }

    public String getMicrData() throws JSONException {
        String str = this.f249dy;
        if (str == null || str.isEmpty()) {
            this.f249dy = m268v();
        }
        return this.f249dy;
    }

    public void setMicrData(String str) throws NullPointerException {
        if (str != null) {
            this.f249dy = str;
            return;
        }
        throw new NullPointerException("micrData parameter is null");
    }

    public Rect getTargetFrame() {
        return this.f224dC;
    }

    public void setTargetFrame(Rect rect) {
        this.f224dC = rect;
    }

    public class FriendI {
        public FriendI(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public void setImageBitmapInternal(Bitmap bitmap) {
            Image.this.m252d(bitmap);
            Image.this.m270x();
            if (Image.this.f219cX != null) {
                Image.this.f219cX.recycle();
                Bitmap unused = Image.this.f219cX = null;
            }
            Bitmap unused2 = Image.this.f219cX = bitmap;
            Integer unused3 = Image.this.f221cZ = Integer.valueOf(bitmap.getWidth());
            Integer unused4 = Image.this.f225da = Integer.valueOf(bitmap.getHeight());
        }

        public ErrorInfo clearBitmapWithoutRecycle() {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            Image.this.m270x();
            if (Image.this.f219cX == null) {
                return ErrorInfo.KMC_ED_ALREADY_CLEAR;
            }
            Bitmap unused = Image.this.f219cX = null;
            Image image = Image.this;
            ImageRep unused2 = image.f220cY = image.m272z() ? ImageRep.IMAGE_REP_NONE : ImageRep.IMAGE_REP_FILE;
            if (ImageRep.IMAGE_REP_NONE == Image.this.f220cY) {
                Integer unused3 = Image.this.f243ds = null;
            }
            Integer unused4 = Image.this.f221cZ = null;
            Integer unused5 = Image.this.f225da = null;
            return errorInfo;
        }

        public long getFileBufferLength() {
            if (Image.this.f247dw == ImageFileRep.FILE_BUFFERED) {
                return (long) Image.this.f248dx.mFileBufferLength;
            }
            return 0;
        }

        public void setImageFileWidth(int i) {
            Integer unused = Image.this.f227dc = Integer.valueOf(i);
        }

        public void setImageFileHeight(int i) {
            Integer unused = Image.this.f228dd = Integer.valueOf(i);
        }

        public void setImageID(String str) {
            Image.this.m232a((Object) str, "imdID");
            String unused = Image.this.f230df = str;
        }

        public void setImageSrcID(String str) {
            Image.this.m232a((Object) str, "imgSrcID");
            String unused = Image.this.f231dg = str;
        }

        public void setImageMetaData(String str) {
            Image.this.m232a((Object) str, "imgMetaData");
            String unused = Image.this.f232dh = str;
        }

        public void setImageDPI(Integer num) {
            Integer unused = Image.this.f243ds = num;
        }

        public void setImageFileRepresentation(ImageFileRep imageFileRep) {
            ImageFileRep unused = Image.this.f247dw = imageFileRep;
        }

        public void setImagePerfectProfileUsed(ImagePerfectionProfile imagePerfectionProfile) {
            Image.this.m232a((Object) imagePerfectionProfile, "imgPerfectProfileUsed");
            ImagePerfectionProfile unused = Image.this.f233di = imagePerfectionProfile.clone();
        }

        public void setBasicSettingsProfileUsed(BasicSettingsProfile basicSettingsProfile) {
            Image.this.m232a((Object) basicSettingsProfile, "basicSettingsProfileUsed");
            BasicSettingsProfile unused = Image.this.f234dj = basicSettingsProfile;
        }

        public void setImageLatitude(Float f) {
            Float unused = Image.this.f236dl = f;
        }

        public void setImageLongitude(Float f) {
            Float unused = Image.this.f237dm = f;
        }

        public void setImagePitch(Float f) {
            Float unused = Image.this.f240dp = f;
        }

        public void setImageRoll(Float f) {
            Float unused = Image.this.f241dq = f;
        }

        public void setImageQuickAnalysisFeedBack(QuickAnalysisFeedback quickAnalysisFeedback) {
            Image.this.m232a((Object) quickAnalysisFeedback, "imgQckAnalysisFeedBck");
            QuickAnalysisFeedback unused = Image.this.f235dk = quickAnalysisFeedback;
        }

        public void setImageBitmap(Bitmap bitmap) {
            Image.this.m252d(bitmap);
            Image.this.m270x();
            if (!Image.this.m202A()) {
                if (Image.this.f219cX != null) {
                    Image.this.f219cX.recycle();
                    Bitmap unused = Image.this.f219cX = null;
                }
                Bitmap unused2 = Image.this.f219cX = bitmap;
                if (Image.this.m271y()) {
                    ImageRep unused3 = Image.this.f220cY = ImageRep.IMAGE_REP_BOTH;
                } else {
                    ImageRep unused4 = Image.this.f220cY = ImageRep.IMAGE_REP_BITMAP;
                }
                Integer unused5 = Image.this.f243ds = 72;
                Image image = Image.this;
                Integer unused6 = image.f221cZ = Integer.valueOf(image.f219cX.getWidth());
                Image image2 = Image.this;
                Integer unused7 = image2.f225da = Integer.valueOf(image2.f219cX.getHeight());
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH);
        }

        public long getImageCreationTime() {
            return Image.this.f250dz;
        }

        public void setImageOriginalDateTime(String str) {
            String unused = Image.this.f222dA = str;
        }

        public String getImageOriginalDateTime() {
            return Image.this.f222dA;
        }
    }

    /* renamed from: w */
    private void m269w() {
        this.f217cV = null;
        this.f218cW = ImageMimeType.MIMETYPE_UNKNOWN;
        Bitmap bitmap = this.f219cX;
        if (bitmap != null) {
            bitmap.recycle();
            this.f219cX = null;
        }
        this.f220cY = ImageRep.IMAGE_REP_NONE;
        this.f247dw = ImageFileRep.FILE_NONE;
        this.f229de = new String();
        this.f230df = new String();
        this.f231dg = new String();
        this.f232dh = new String();
        this.f233di = null;
        this.f234dj = null;
        this.f235dk = null;
        this.f236dl = null;
        this.f237dm = null;
        this.f238dn = null;
        this.f239do = null;
        this.f240dp = null;
        this.f241dq = null;
        this.f242dr = new String();
        this.f243ds = null;
        this.f246dv = FileIOEngine.FILE_ENG_KFIL;
        this.f245du = OutputColor.BITDEPTH_COLOR;
    }

    /* renamed from: a */
    private void m233a(String str, ImageMimeType imageMimeType, boolean z, boolean z2) {
        if (str == null) {
            throw new NullPointerException("filePath parameter is null");
        } else if (!z2) {
            m227a(new File(str), imageMimeType, z);
        }
    }

    /* renamed from: a */
    private void m227a(File file, ImageMimeType imageMimeType, boolean z) {
        if (file == null) {
            throw new NullPointerException("file parameter is null");
        } else if (imageMimeType == ImageMimeType.MIMETYPE_UNKNOWN) {
            throw new IllegalArgumentException("imgMimeType cannot be set to UNKNOWN");
        } else if (z && !file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("file: ");
            sb.append(file.getName());
            sb.append(" does not exist");
            throw new IllegalArgumentException(sb.toString());
        } else if (!m213a(file).equals(imageMimeType)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("imgMimeType: ");
            sb2.append(imageMimeType.toString());
            sb2.append(" does not match MIME type of file");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m252d(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("imgBitmap parameter is null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("imgBitmap is invalid because it's been recycled");
        } else if (bitmap.getWidth() < 10 || bitmap.getHeight() < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append("imgBitmap is invalid because it's smaller than ");
            sb.append(10);
            sb.append(" x ");
            sb.append(10);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m232a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" parameter is null");
            throw new NullPointerException(sb.toString());
        } else if (obj.getClass().getSimpleName().equals("Integer") && ((Integer) obj).intValue() < 0) {
            ErrorInfo errorInfo = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("'");
            sb2.append(str);
            sb2.append("' parameter is negative");
            errorInfo.setErrCause(sb2.toString());
            throw new KmcRuntimeException(errorInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m270x() {
        File file = this.f217cV;
        boolean z = true;
        boolean z2 = file != null && file.exists();
        if (!(this.f219cX != null && !m272z() && !m202A())) {
            if (!z2 || m271y() || m202A()) {
                z = false;
            }
            if (z) {
                C0767k.m1801b(TAG, "Warning: imgFileExists && !isImgRepFile() && !isImgRepBoth()");
                return;
            }
            return;
        }
        throw new IllegalThreadStateException("internal BITMAP state is inconsistent with imageRepresentation property");
    }

    /* renamed from: a */
    private ImageMimeType m213a(File file) {
        ImageMimeType imageMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        if (file != null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
            if (mimeTypeFromExtension == null) {
                if (ModifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver((CharSequence) fileExtensionFromUrl, (CharSequence) "tif") || ModifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver((CharSequence) fileExtensionFromUrl, (CharSequence) "tiff")) {
                    imageMimeType = ImageMimeType.MIMETYPE_TIFF;
                }
            } else if (mimeTypeFromExtension.equals("image/tiff")) {
                imageMimeType = ImageMimeType.MIMETYPE_TIFF;
            } else if (mimeTypeFromExtension.equals(ImageInfo.JPEG_MIME_TYPE)) {
                imageMimeType = ImageMimeType.MIMETYPE_JPEG;
            } else if (mimeTypeFromExtension.equals("image/png")) {
                imageMimeType = ImageMimeType.MIMETYPE_PNG;
            }
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("getMimeTypeFromFile: fileExtension=");
            sb.append(fileExtensionFromUrl);
            C0767k.m1807c(str, sb.toString());
        }
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getMimeTypeFromFile: imgMimeType=");
        sb2.append(imageMimeType.toString());
        C0767k.m1807c(str2, sb2.toString());
        return imageMimeType;
    }

    /* renamed from: a */
    private FileIOEngine m211a(FileIOEngine fileIOEngine, C0440b bVar) {
        if (fileIOEngine == FileIOEngine.FILE_ENG_ANDROID) {
            return (this.f218cW == ImageMimeType.MIMETYPE_JPEG || this.f218cW == ImageMimeType.MIMETYPE_PNG) ? FileIOEngine.FILE_ENG_ANDROID : FileIOEngine.FILE_ENG_KFIL;
        }
        if (fileIOEngine == FileIOEngine.FILE_ENG_KFIL && bVar == C0440b.FILE_IO_READ) {
            return (this.f218cW == ImageMimeType.MIMETYPE_JPEG || this.f218cW == ImageMimeType.MIMETYPE_TIFF) ? FileIOEngine.FILE_ENG_KFIL : FileIOEngine.FILE_ENG_ANDROID;
        }
        return FileIOEngine.FILE_ENG_KFIL;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public boolean m271y() {
        return this.f220cY == ImageRep.IMAGE_REP_FILE;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m272z() {
        return this.f220cY == ImageRep.IMAGE_REP_BITMAP;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public boolean m202A() {
        return this.f220cY == ImageRep.IMAGE_REP_BOTH;
    }

    /* renamed from: B */
    private boolean m203B() {
        return this.f220cY == ImageRep.IMAGE_REP_NONE;
    }

    /* renamed from: C */
    private boolean m204C() {
        return this.f247dw == ImageFileRep.FILE_STORED;
    }

    /* renamed from: D */
    private boolean m205D() {
        return this.f247dw == ImageFileRep.FILE_BUFFERED;
    }

    /* renamed from: E */
    private boolean m206E() {
        return this.f247dw == ImageFileRep.FILE_NONE;
    }

    /* renamed from: F */
    private boolean m207F() {
        return this.f245du == OutputColor.BITDEPTH_COLOR && this.f218cW != ImageMimeType.MIMETYPE_TIFF;
    }

    /* renamed from: a */
    private static boolean m234a(ErrorInfo errorInfo) {
        int i = C04381.f251bd[errorInfo.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    /* renamed from: b */
    private static Exception m237b(ErrorInfo errorInfo) {
        if (m234a(errorInfo)) {
            return new KmcException(errorInfo);
        }
        return new KmcRuntimeException(errorInfo);
    }

    /* renamed from: G */
    private void m208G() {
        String[] b;
        Boolean bool = Boolean.FALSE;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        boolean z = false;
        Boolean bool2 = bool;
        for (String str : this.f232dh.split("[\\r\\n]+")) {
            if (str.startsWith("GPS Latitude Reference:")) {
                bool = Boolean.valueOf(str.contains(": N"));
                z |= true;
            } else if (str.startsWith("GPS Latitude:")) {
                String[] b2 = m243b(str.trim());
                if (b2 != null) {
                    f = m245c(b2[0].trim());
                    f2 = Float.valueOf(m245c(b2[1].trim()).floatValue() / 60.0f);
                    z |= true;
                }
            } else if (str.startsWith("GPS Longitude Reference:")) {
                bool2 = Boolean.valueOf(str.contains(": W"));
                z |= true;
            } else if (str.startsWith("GPS Longitude:") && (b = m243b(str)) != null) {
                f3 = m245c(b[0].trim());
                f4 = Float.valueOf(m245c(b[1].trim()).floatValue() / 60.0f);
                z |= true;
            }
        }
        if (z) {
            this.f236dl = Float.valueOf(bool.booleanValue() ? f.floatValue() + f2.floatValue() : BitmapDescriptorFactory.HUE_RED - (f.floatValue() + f2.floatValue()));
            this.f237dm = Float.valueOf(bool2.booleanValue() ? BitmapDescriptorFactory.HUE_RED - (f3.floatValue() + f4.floatValue()) : f4.floatValue() + f3.floatValue());
        }
    }

    /* renamed from: H */
    private void m209H() {
        for (String str : this.f232dh.split("[\\r\\n]+")) {
            if (str.startsWith("Subject Area: ")) {
                String[] split = str.substring(14).split(", ");
                try {
                    if (split.length == 4) {
                        int intValue = Integer.valueOf(split[2].trim()).intValue();
                        int intValue2 = Integer.valueOf(split[3].trim()).intValue();
                        int intValue3 = Integer.valueOf(split[0].trim()).intValue() - (intValue / 2);
                        int intValue4 = Integer.valueOf(split[1].trim()).intValue() - (intValue2 / 2);
                        setTargetFrame(new Rect(intValue3, intValue4, intValue + intValue3, intValue2 + intValue4));
                    }
                } catch (NumberFormatException e) {
                    C0767k.m1823e(e);
                }
            }
        }
    }

    /* renamed from: b */
    private String[] m243b(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            return null;
        }
        String[] split2 = split[1].split(",");
        if (split2.length == 3) {
            return split2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0163  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.kut.utilities.error.ErrorInfo m220a(com.kofax.kmc.ken.engines.data.Image.FileIOEngine r10, boolean r11, float r12) throws com.kofax.kmc.kut.utilities.error.KmcException, com.kofax.kmc.kut.utilities.error.KmcRuntimeException {
        /*
            r9 = this;
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x016c
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r1 > 0) goto L_0x016c
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            java.io.File r1 = r9.f217cV
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001d
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILEPATH
            java.lang.String r12 = "imgFile field is null"
            r11.setErrCause(r12)
            goto L_0x0035
        L_0x001d:
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0026
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_FILE_NOT_FOUND
            goto L_0x0035
        L_0x0026:
            android.graphics.Bitmap r1 = r9.f219cX
            if (r1 == 0) goto L_0x002d
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGELEAK
            goto L_0x0035
        L_0x002d:
            boolean r1 = r9.m205D()
            if (r1 == 0) goto L_0x0039
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALREADY_BUFFERED
        L_0x0035:
            r1 = r10
            r12 = r3
            goto L_0x00ef
        L_0x0039:
            com.kofax.kmc.ken.engines.data.Image$b r1 = com.kofax.kmc.ken.engines.data.Image.C0440b.FILE_IO_READ
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r1 = r9.m211a((com.kofax.kmc.ken.engines.data.Image.FileIOEngine) r10, (com.kofax.kmc.ken.engines.data.Image.C0440b) r1)
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r4 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_ANDROID
            if (r1 != r4) goto L_0x00d8
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r1 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_ANDROID
            java.io.File r4 = r9.f217cV
            java.lang.String r4 = r4.getAbsolutePath()
            com.kofax.kmc.ken.engines.data.Image$KenBitmap r4 = com.kofax.kmc.ken.engines.service.ImageService.loadBitmapFromFile(r4, r2, r11)
            java.lang.String r5 = TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "kenBitmap: width="
            r6.append(r7)
            android.graphics.Bitmap r7 = r4.bitmap
            int r7 = r7.getWidth()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "kenBitmap: height="
            r6.append(r7)
            android.graphics.Bitmap r7 = r4.bitmap
            int r7 = r7.getHeight()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r5, (java.lang.String) r6)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d3
            if (r11 != 0) goto L_0x00d3
            android.graphics.Bitmap r11 = r4.bitmap
            com.kofax.kmc.ken.engines.data.Image$KenBitmap r11 = com.kofax.kmc.ken.engines.service.ImageService.createScaledBitmapFromBitmapWithMatrix(r11, r12)
            java.lang.String r12 = TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "kenBitmapScaled: width="
            r0.append(r5)
            android.graphics.Bitmap r5 = r11.bitmap
            int r5 = r5.getWidth()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r12, (java.lang.String) r0)
            java.lang.String r12 = TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "kenBitmapScaled: height="
            r0.append(r5)
            android.graphics.Bitmap r5 = r11.bitmap
            int r5 = r5.getHeight()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r12, (java.lang.String) r0)
            android.graphics.Bitmap r12 = r4.bitmap
            r12.recycle()
            r4.bitmap = r3
            r4 = r11
        L_0x00d3:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = r4.errInfo
            r12 = r3
            r3 = r4
            goto L_0x00ef
        L_0x00d8:
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r1 = com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_KFIL
            com.kofax.kmc.ken.engines.iplib.IpImageMetadata r3 = new com.kofax.kmc.ken.engines.iplib.IpImageMetadata
            r3.<init>()
            java.io.File r11 = r9.f217cV
            java.lang.String r11 = r11.getAbsolutePath()
            com.kofax.kmc.ken.engines.data.Image$KenBitmap r11 = com.kofax.kmc.ken.engines.service.ImageService.readBitmapFromFileUsingIp(r11, r12, r3)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = r11.errInfo
            r8 = r3
            r3 = r11
            r11 = r12
            r12 = r8
        L_0x00ef:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r11 != r0) goto L_0x0149
            android.graphics.Bitmap r0 = r3.bitmap
            if (r0 == 0) goto L_0x0149
            com.kofax.kmc.ken.engines.data.Image$ImageRep r0 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            r9.f220cY = r0
            android.graphics.Bitmap r0 = r3.bitmap
            r9.f219cX = r0
            java.lang.Integer r0 = r3.mDpiX
            r9.f243ds = r0
            android.graphics.Bitmap r0 = r9.f219cX
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.f221cZ = r0
            android.graphics.Bitmap r0 = r9.f219cX
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.f225da = r0
            java.lang.String r0 = r9.f232dh
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0149
            if (r12 == 0) goto L_0x0149
            java.lang.String r0 = r12.metadataStr
            if (r0 == 0) goto L_0x0149
            java.lang.String r12 = r12.metadataStr
            r9.f232dh = r12
            r9.m208G()
            r9.m209H()
            java.lang.String r12 = "Original Date Time: "
            java.lang.String r12 = com.kofax.kmc.ken.engines.service.ImageService.getTimeStringFromExif(r9, r12)
            if (r12 == 0) goto L_0x0143
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0143
            r0 = 0
            goto L_0x0144
        L_0x0143:
            r0 = r2
        L_0x0144:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0149
            r9.f222dA = r12
        L_0x0149:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r11 == r12) goto L_0x0163
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_IS_SCALED
            if (r11 == r12) goto L_0x0163
            boolean r10 = m234a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r11)
            if (r10 == 0) goto L_0x015d
            com.kofax.kmc.kut.utilities.error.KmcException r10 = new com.kofax.kmc.kut.utilities.error.KmcException
            r10.<init>(r11)
            throw r10
        L_0x015d:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r10 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            r10.<init>(r11)
            throw r10
        L_0x0163:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r12 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r11 != r12) goto L_0x016b
            if (r1 == r10) goto L_0x016b
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
        L_0x016b:
            return r11
        L_0x016c:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r10 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_INVALID_SCALING_FACTOR
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.Image.m220a(com.kofax.kmc.ken.engines.data.Image$FileIOEngine, boolean, float):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.kut.utilities.error.ErrorInfo m218a(com.kofax.kmc.ken.engines.data.Image.FileIOEngine r5, float r6) throws com.kofax.kmc.kut.utilities.error.KmcException, com.kofax.kmc.kut.utilities.error.KmcRuntimeException {
        /*
            r4 = this;
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008b
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008b
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            r0 = 0
            android.graphics.Bitmap r1 = r4.f219cX
            if (r1 == 0) goto L_0x0017
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGELEAK
            goto L_0x001f
        L_0x0017:
            boolean r1 = r4.m205D()
            if (r1 != 0) goto L_0x0021
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NO_BUFFERED_IMAGE
        L_0x001f:
            r1 = r5
            goto L_0x0033
        L_0x0021:
            com.kofax.kmc.ken.engines.data.Image$b r0 = com.kofax.kmc.ken.engines.data.Image.C0440b.FILE_IO_READ
            com.kofax.kmc.ken.engines.data.Image$FileIOEngine r0 = r4.m211a((com.kofax.kmc.ken.engines.data.Image.FileIOEngine) r5, (com.kofax.kmc.ken.engines.data.Image.C0440b) r0)
            com.kofax.kmc.ken.engines.iplib.IpFileBuffer r1 = r4.f248dx
            com.kofax.kmc.ken.engines.data.Image$KenBitmap r6 = m215a((com.kofax.kmc.ken.engines.iplib.IpFileBuffer) r1, (com.kofax.kmc.ken.engines.data.Image.FileIOEngine) r0, (float) r6)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = r6.errInfo
            r3 = r0
            r0 = r6
            r6 = r1
            r1 = r3
        L_0x0033:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r6 != r2) goto L_0x0068
            android.graphics.Bitmap r2 = r0.bitmap
            if (r2 == 0) goto L_0x0060
            com.kofax.kmc.ken.engines.data.Image$ImageRep r2 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            r4.f220cY = r2
            android.graphics.Bitmap r2 = r0.bitmap
            r4.f219cX = r2
            java.lang.Integer r0 = r0.mDpiX
            r4.f243ds = r0
            android.graphics.Bitmap r0 = r4.f219cX
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.f221cZ = r0
            android.graphics.Bitmap r0 = r4.f219cX
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.f225da = r0
            goto L_0x0068
        L_0x0060:
            com.kofax.kmc.kut.utilities.error.InternalError r5 = new com.kofax.kmc.kut.utilities.error.InternalError
            java.lang.String r6 = "imageReadFromFileBuffer: kenBitmap.bitmap == null"
            r5.<init>(r6)
            throw r5
        L_0x0068:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r6 == r0) goto L_0x0082
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_IS_SCALED
            if (r6 == r0) goto L_0x0082
            boolean r5 = m234a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r6)
            if (r5 == 0) goto L_0x007c
            com.kofax.kmc.kut.utilities.error.KmcException r5 = new com.kofax.kmc.kut.utilities.error.KmcException
            r5.<init>(r6)
            throw r5
        L_0x007c:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r5 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            r5.<init>(r6)
            throw r5
        L_0x0082:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r6 != r0) goto L_0x008a
            if (r1 == r5) goto L_0x008a
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
        L_0x008a:
            return r6
        L_0x008b:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r5 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_INVALID_SCALING_FACTOR
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.Image.m218a(com.kofax.kmc.ken.engines.data.Image$FileIOEngine, float):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    /* renamed from: c */
    private Float m245c(String str) {
        try {
            String[] split = str.split("/");
            if (split.length == 2) {
                return Float.valueOf(((float) Integer.parseInt(split[0].trim())) / ((float) Integer.parseInt(split[1].trim())));
            }
        } catch (NumberFormatException e) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("getGPSValue: NumberFormatException = ");
            sb.append(e.toString());
            C0767k.m1807c(str2, sb.toString());
        }
        return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: d */
    private void m253d(String str) {
        try {
            ImageService.ImageDimension imageDimension = ImageService.getImageDimension(str);
            this.f227dc = Integer.valueOf(imageDimension.getWidth());
            this.f228dd = Integer.valueOf(imageDimension.getHeight());
        } catch (IOException e) {
            e.printStackTrace();
            ErrorInfo.KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR.setErrCause(e.getMessage());
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR);
        }
    }

    /* renamed from: a */
    private void m226a(IpFileBuffer ipFileBuffer) {
        this.f227dc = Integer.valueOf(ipFileBuffer.mWidth);
        this.f228dd = Integer.valueOf(ipFileBuffer.mHeight);
    }

    /* renamed from: e */
    private void m255e(String str) {
        this.f248dx = new IpFileBuffer(this.f218cW, this.f245du.getBitsPerPixel(), this.f244dt.intValue(), str);
    }

    /* renamed from: a */
    private void m229a(ObjectOutputStream objectOutputStream) throws IOException {
        m230a(objectOutputStream, this.f219cX);
    }

    /* renamed from: a */
    private void m230a(ObjectOutputStream objectOutputStream, Bitmap bitmap) throws IOException {
        m231a(objectOutputStream, C0857a.m2193m(bitmap));
    }

    /* renamed from: a */
    private void m231a(ObjectOutputStream objectOutputStream, byte[] bArr) throws IOException {
        BitmapDataObject bitmapDataObject = new BitmapDataObject();
        bitmapDataObject.imageByteArray = bArr;
        objectOutputStream.writeObject(bitmapDataObject);
    }

    /* renamed from: a */
    private void m228a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        boolean z = true;
        boolean z2 = this.f220cY == ImageRep.IMAGE_REP_BITMAP || this.f220cY == ImageRep.IMAGE_REP_BOTH;
        if (this.f226db.floatValue() == 1.0f) {
            z = false;
        }
        try {
            m248c(objectInputStream);
            this.f247dw = ImageFileRep.FILE_NONE;
            imageWriteToFileBuffer();
            if (!z2) {
                imageClearBitmap();
            } else if (z) {
                imageClearBitmap();
                imageReadFromFileBuffer();
            }
        } catch (KmcException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: b */
    private void m242b(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f248dx.mIpFileType);
        objectOutputStream.writeInt(this.f248dx.mBitDepth);
        objectOutputStream.writeInt(this.f248dx.mJpegQuality);
        objectOutputStream.writeObject(this.f248dx.mExifMetadataStr);
        objectOutputStream.writeInt(this.f248dx.mWidth);
        objectOutputStream.writeInt(this.f248dx.mHeight);
        ByteBuffer imageFileBuffer = getImageFileBuffer();
        byte[] bArr = new byte[imageFileBuffer.capacity()];
        imageFileBuffer.get(bArr);
        objectOutputStream.writeObject(bArr);
    }

    /* renamed from: b */
    private void m241b(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        IpFileBuffer ipFileBuffer = new IpFileBuffer(objectInputStream.readInt(), objectInputStream.readInt(), objectInputStream.readInt(), (String) objectInputStream.readObject());
        this.f248dx = ipFileBuffer;
        ipFileBuffer.mWidth = objectInputStream.readInt();
        this.f248dx.mHeight = objectInputStream.readInt();
        ErrorInfo saveToFileBuffer = ImageService.saveToFileBuffer((byte[]) objectInputStream.readObject(), this.f248dx);
        if (saveToFileBuffer != ErrorInfo.KMC_SUCCESS) {
            throw new IOException(m237b(saveToFileBuffer));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(Image.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(getImageFilePath());
        objectOutputStream.writeObject(this.f218cW);
        objectOutputStream.writeObject(this.f220cY);
        objectOutputStream.writeObject(this.f221cZ);
        objectOutputStream.writeObject(this.f225da);
        objectOutputStream.writeObject(this.f226db);
        objectOutputStream.writeObject(this.f227dc);
        objectOutputStream.writeObject(this.f228dd);
        objectOutputStream.writeObject(this.f229de);
        objectOutputStream.writeObject(this.f230df);
        objectOutputStream.writeObject(this.f231dg);
        objectOutputStream.writeObject(this.f232dh);
        objectOutputStream.writeObject(this.f233di);
        objectOutputStream.writeObject(this.f234dj);
        objectOutputStream.writeObject(this.f235dk);
        objectOutputStream.writeObject(this.f236dl);
        objectOutputStream.writeObject(this.f237dm);
        objectOutputStream.writeObject(this.f238dn);
        objectOutputStream.writeObject(this.f239do);
        objectOutputStream.writeObject(this.f240dp);
        objectOutputStream.writeObject(this.f241dq);
        objectOutputStream.writeObject(this.f242dr);
        objectOutputStream.writeObject(this.f243ds);
        objectOutputStream.writeObject(this.f244dt);
        objectOutputStream.writeObject(this.f245du);
        objectOutputStream.writeObject(this.f246dv);
        objectOutputStream.writeObject(this.f247dw);
        if (!m203B() || !m206E()) {
            if (m271y() && m204C()) {
                objectOutputStream.writeObject(C0439a.IMAGE_REP_FILE_STORED);
                objectOutputStream.writeObject(this.f249dy);
                objectOutputStream.writeObject(this.f222dA);
                objectOutputStream.writeObject(this.f224dC);
            } else if (m271y() && m205D()) {
                objectOutputStream.writeObject(C0439a.IMAGE_REP_FILE_BUFFERED);
                m242b(objectOutputStream);
                objectOutputStream.writeObject(this.f249dy);
                objectOutputStream.writeObject(this.f222dA);
                objectOutputStream.writeObject(this.f224dC);
            } else if (m272z() && m206E()) {
                objectOutputStream.writeObject(C0439a.IMAGE_REP_BITMAP_NONE);
                m229a(objectOutputStream);
                objectOutputStream.writeObject(this.f249dy);
                objectOutputStream.writeObject(this.f222dA);
                objectOutputStream.writeObject(this.f224dC);
            } else if (m202A() && m204C()) {
                objectOutputStream.writeObject(C0439a.IMAGE_REP_BOTH_STORED);
                m229a(objectOutputStream);
                objectOutputStream.writeObject(this.f249dy);
                objectOutputStream.writeObject(this.f222dA);
                objectOutputStream.writeObject(this.f224dC);
            } else if (m202A() && m205D()) {
                objectOutputStream.writeObject(C0439a.IMAGE_REP_BOTH_BUFFERED);
                m229a(objectOutputStream);
                m242b(objectOutputStream);
                objectOutputStream.writeObject(this.f249dy);
                objectOutputStream.writeObject(this.f222dA);
                objectOutputStream.writeObject(this.f224dC);
            }
        }
        objectOutputStream.writeObject(C0439a.IMAGE_REP_NONE_NONE);
        objectOutputStream.writeObject(this.f249dy);
        objectOutputStream.writeObject(this.f222dA);
        objectOutputStream.writeObject(this.f224dC);
    }

    /* renamed from: c */
    private void m248c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f219cX = C0857a.m2192j(((BitmapDataObject) objectInputStream.readObject()).imageByteArray);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (Image.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            String str = (String) objectInputStream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), str).booleanValue()) {
                setImageFilePath((String) objectInputStream.readObject());
                this.f218cW = (ImageMimeType) objectInputStream.readObject();
                this.f220cY = (ImageRep) objectInputStream.readObject();
                this.f221cZ = (Integer) objectInputStream.readObject();
                this.f225da = (Integer) objectInputStream.readObject();
                this.f226db = (Float) objectInputStream.readObject();
                this.f227dc = (Integer) objectInputStream.readObject();
                this.f228dd = (Integer) objectInputStream.readObject();
                this.f229de = (String) objectInputStream.readObject();
                this.f230df = (String) objectInputStream.readObject();
                this.f231dg = (String) objectInputStream.readObject();
                this.f232dh = (String) objectInputStream.readObject();
                this.f233di = (ImagePerfectionProfile) objectInputStream.readObject();
                this.f234dj = (BasicSettingsProfile) objectInputStream.readObject();
                this.f235dk = (QuickAnalysisFeedback) objectInputStream.readObject();
                this.f236dl = (Float) objectInputStream.readObject();
                this.f237dm = (Float) objectInputStream.readObject();
                this.f238dn = (ArrayList) objectInputStream.readObject();
                this.f239do = (ArrayList) objectInputStream.readObject();
                this.f240dp = (Float) objectInputStream.readObject();
                this.f241dq = (Float) objectInputStream.readObject();
                this.f242dr = (String) objectInputStream.readObject();
                this.f243ds = (Integer) objectInputStream.readObject();
                this.f244dt = (Integer) objectInputStream.readObject();
                this.f245du = (OutputColor) objectInputStream.readObject();
                this.f246dv = (FileIOEngine) objectInputStream.readObject();
                this.f247dw = (ImageFileRep) objectInputStream.readObject();
                int i = C04381.f253dE[((C0439a) objectInputStream.readObject()).ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        m248c(objectInputStream);
                    } else if (i != 4) {
                        this.f219cX = null;
                        this.f248dx = null;
                    } else if (SdkVersion.compare(str, "3.3.0.0") >= 0) {
                        m248c(objectInputStream);
                        m241b(objectInputStream);
                    } else {
                        m228a(objectInputStream);
                    }
                } else if (SdkVersion.compare(str, "3.3.0.0") >= 0) {
                    m241b(objectInputStream);
                } else {
                    m228a(objectInputStream);
                }
                if (SdkVersion.compare(str, "2.4.0.0") >= 0) {
                    this.f249dy = (String) objectInputStream.readObject();
                    this.f222dA = (String) objectInputStream.readObject();
                }
                if (SdkVersion.compare(str, "3.1.0.0") >= 0) {
                    this.f224dC = (Rect) objectInputStream.readObject();
                    return;
                }
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }

    /* renamed from: com.kofax.kmc.ken.engines.data.Image$1 */
    static /* synthetic */ class C04381 {

        /* renamed from: bd */
        static final /* synthetic */ int[] f251bd;

        /* renamed from: dD */
        static final /* synthetic */ int[] f252dD;

        /* renamed from: dE */
        static final /* synthetic */ int[] f253dE;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a7 */
        static {
            /*
                com.kofax.kmc.ken.engines.data.Image$a[] r0 = com.kofax.kmc.ken.engines.data.Image.C0439a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f253dE = r0
                r1 = 1
                com.kofax.kmc.ken.engines.data.Image$a r2 = com.kofax.kmc.ken.engines.data.Image.C0439a.IMAGE_REP_FILE_BUFFERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f253dE     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.data.Image$a r3 = com.kofax.kmc.ken.engines.data.Image.C0439a.IMAGE_REP_BITMAP_NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f253dE     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.data.Image$a r4 = com.kofax.kmc.ken.engines.data.Image.C0439a.IMAGE_REP_BOTH_STORED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f253dE     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.ken.engines.data.Image$a r5 = com.kofax.kmc.ken.engines.data.Image.C0439a.IMAGE_REP_BOTH_BUFFERED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f253dE     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.kmc.ken.engines.data.Image$a r6 = com.kofax.kmc.ken.engines.data.Image.C0439a.IMAGE_REP_NONE_NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f253dE     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.kofax.kmc.ken.engines.data.Image$a r6 = com.kofax.kmc.ken.engines.data.Image.C0439a.IMAGE_REP_FILE_STORED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.kofax.kmc.kut.utilities.error.ErrorInfo[] r5 = com.kofax.kmc.kut.utilities.error.ErrorInfo.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f251bd = r5
                com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_FILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r5 = f251bd     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_OUT_OF_MEMORY     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r5 = f251bd     // Catch:{ NoSuchFieldError -> 0x006e }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILE_STILL_REMAINS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r5 = f251bd     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILE_EXISTS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r5 = f251bd     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGELEAK     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                android.graphics.Bitmap$Config[] r4 = android.graphics.Bitmap.Config.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f252dD = r4
                android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r1 = f252dD     // Catch:{ NoSuchFieldError -> 0x009d }
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x009d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = f252dD     // Catch:{ NoSuchFieldError -> 0x00a7 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = f252dD     // Catch:{ NoSuchFieldError -> 0x00b1 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.Image.C04381.<clinit>():void");
        }
    }
}
