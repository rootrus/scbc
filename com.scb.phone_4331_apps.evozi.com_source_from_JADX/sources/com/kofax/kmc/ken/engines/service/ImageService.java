package com.kofax.kmc.ken.engines.service;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Debug;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.iplib.IpFileBuffer;
import com.kofax.kmc.ken.engines.iplib.IpImage;
import com.kofax.kmc.ken.engines.iplib.IpImageMetadata;
import com.kofax.kmc.ken.engines.iplib.IpLib;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.ken.engines.iplib.ProcessPageResults;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.FileNotFoundException;
import com.kofax.kmc.kut.utilities.error.IOException;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk.p009ae.C0793c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.ModifyQuickTopUpReviewActivity;
import p040o.PrepaidDetailsActivity;
import p040o.onPrepaidTravelTopUpClick;
import p040o.onTransferOutClick;

public class ImageService {
    public static final String EXIF_TIME_FORMAT = "yyyy:MM:dd HH:mm:ss";
    public static final String KExifTagDateTime = "Digitized Date Time: ";
    public static final String KExifTagDateTimeDigitized = "File_Change_Date_Time: ";
    public static final String KExifTagDateTimeOriginal = "Original Date Time: ";
    private static final String TAG = ImageService.class.getSimpleName();

    /* renamed from: ig */
    private static final int f528ig = 1;

    /* renamed from: ih */
    private static final int f529ih = 1;

    /* renamed from: ii */
    private static final int f530ii = 200;

    /* renamed from: ij */
    private static final int f531ij = 200;

    /* renamed from: ik */
    private static final int f532ik = 24;

    /* renamed from: il */
    private static final int f533il = 3;

    /* renamed from: im */
    private static final int f534im = 72;

    /* renamed from: io */
    private static final int f535io = 72;

    /* renamed from: ip */
    private static final int f536ip = 5;

    /* renamed from: iq */
    static final int f537iq = 0;

    /* renamed from: ir */
    static final int f538ir = 2;

    /* renamed from: is */
    static final int f539is = 3;

    /* renamed from: it */
    static final int f540it = 5;

    /* renamed from: iu */
    private static final onPrepaidTravelTopUpClick f541iu = PrepaidDetailsActivity.write;

    /* renamed from: iv */
    private static final String f542iv = "Software Used: Kofax";

    /* renamed from: iw */
    private static final boolean f543iw = true;

    /* renamed from: ix */
    private static UseableImageMemoryLimit f544ix = UseableImageMemoryLimit.NORMAL;

    /* renamed from: iy */
    private static InterimImageFileFormat f545iy = InterimImageFileFormat.PNG;
    public static boolean passBarcodes = false;

    public enum InterimImageFileFormat {
        PNG,
        JPEG
    }

    public enum UseableImageMemoryLimit {
        NORMAL,
        LARGE,
        MAXIMUM
    }

    public static class ImageDimension {
        private int height;
        private int width;

        public ImageDimension(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public int getWidth() {
            return this.width;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int i) {
            this.height = i;
        }
    }

    public static void setInterimImageFileFormat(InterimImageFileFormat interimImageFileFormat) {
        f545iy = interimImageFileFormat;
    }

    public static InterimImageFileFormat getInterimImageFileFormat() {
        return f545iy;
    }

    public static IpImageMetadata getImageFileMetadata(String str) {
        IpImageMetadata ipImageMetadata = new IpImageMetadata();
        readBitmapFromFileUsingIp(str, 1.0f, ipImageMetadata);
        return ipImageMetadata;
    }

    public static void cancelImageProcessing() {
        try {
            IpLib.getInstance().cancelProcessing();
        } catch (KmcException e) {
            e.printStackTrace();
        }
    }

    public static String createGPSMetadata(Image image) {
        StringBuilder sb = new StringBuilder();
        String str = image.getImageLatitude().floatValue() < BitmapDescriptorFactory.HUE_RED ? "S" : "N";
        String str2 = image.getImageLongitude().floatValue() < BitmapDescriptorFactory.HUE_RED ? "W" : "E";
        sb.append("GPS Latitude Reference: ");
        sb.append(str);
        sb.append(System.getProperty("line.separator"));
        sb.append("GPS Latitude: ");
        int intValue = image.getImageLatitude().intValue();
        sb.append(Integer.toString(intValue));
        sb.append("/1, ");
        sb.append(Integer.toString(Float.valueOf((image.getImageLatitude().floatValue() - ((float) intValue)) * 100.0f * 60.0f).intValue()));
        sb.append("/100, 0/1");
        sb.append(System.getProperty("line.separator"));
        sb.append("GPS Longitude Reference: ");
        sb.append(str2);
        sb.append(System.getProperty("line.separator"));
        sb.append("GPS Longitude: ");
        int intValue2 = image.getImageLongitude().intValue();
        sb.append(Integer.toString(intValue2));
        sb.append("/1, ");
        sb.append(Integer.toString(Float.valueOf((image.getImageLongitude().floatValue() - ((float) intValue2)) * 100.0f * 60.0f).intValue()));
        sb.append("/100, 0/1");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

    public static String createTargetFrameMetadata(Image image) {
        StringBuilder sb = new StringBuilder();
        Rect targetFrame = image.getTargetFrame();
        sb.append("Subject Area: ");
        sb.append(String.format(Locale.US, "%d, %d, %d, %d", new Object[]{Integer.valueOf(targetFrame.centerX()), Integer.valueOf(targetFrame.centerY()), Integer.valueOf(targetFrame.width()), Integer.valueOf(targetFrame.height())}));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df A[SYNTHETIC, Splitter:B:38:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3 A[SYNTHETIC, Splitter:B:45:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe A[Catch:{ Exception -> 0x00fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.kofax.kmc.kut.utilities.error.ErrorInfo saveBitmap(android.graphics.Bitmap r6, java.lang.String r7, com.kofax.kmc.ken.engines.data.Image.ImageMimeType r8, int r9) {
        /*
            java.lang.String r0 = ", quality="
            java.lang.String r1 = "Error flushing streams"
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Saving a bitmap to "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r2, (java.lang.String) r3)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r3 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG
            if (r8 != r3) goto L_0x0023
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L_0x0025
        L_0x0023:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x0025:
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r4 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF
            if (r8 == r4) goto L_0x010b
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r4 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN
            if (r8 == r4) goto L_0x010b
            r8 = 0
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r4.<init>(r7)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            if (r4 == 0) goto L_0x0055
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILE_EXISTS     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r2.<init>()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.lang.String r3 = "saveBitmap failed: file "
            r2.append(r3)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r2.append(r7)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.lang.String r3 = " already exists."
            r2.append(r3)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r6.setErrCause(r2)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            return r6
        L_0x0055:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r4.<init>(r7)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0098 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0098 }
            boolean r6 = r6.compress(r3, r9, r5)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            if (r6 != 0) goto L_0x0081
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_BITMAP_WRITE_TO_FILE_FAILED     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            r6.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            java.lang.String r8 = "bitmap.compress failed: file "
            r6.append(r8)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            r6.append(r7)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            r6.append(r0)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            r6.append(r9)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            r2.setErrCause(r6)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
        L_0x0081:
            r5.flush()     // Catch:{ Exception -> 0x008e }
            r5.close()     // Catch:{ Exception -> 0x008e }
            r4.flush()     // Catch:{ Exception -> 0x008e }
        L_0x008a:
            r4.close()     // Catch:{ Exception -> 0x008e }
            goto L_0x00f0
        L_0x008e:
            r6 = move-exception
            goto L_0x00eb
        L_0x0090:
            r6 = move-exception
            r8 = r5
            goto L_0x00f1
        L_0x0093:
            r6 = move-exception
            r8 = r5
            goto L_0x009f
        L_0x0096:
            r6 = move-exception
            goto L_0x00f1
        L_0x0098:
            r6 = move-exception
            goto L_0x009f
        L_0x009a:
            r6 = move-exception
            r4 = r8
            goto L_0x00f1
        L_0x009d:
            r6 = move-exception
            r4 = r8
        L_0x009f:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r3.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "Error saving image - "
            r3.append(r5)     // Catch:{ all -> 0x0096 }
            r3.append(r7)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0096 }
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r6)     // Catch:{ all -> 0x0096 }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_BITMAP_WRITE_TO_FILE_FAILED     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r3.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "bitmap.compress exception: file "
            r3.append(r5)     // Catch:{ all -> 0x0096 }
            r3.append(r7)     // Catch:{ all -> 0x0096 }
            r3.append(r0)     // Catch:{ all -> 0x0096 }
            r3.append(r9)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = ", exception info: "
            r3.append(r7)     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0096 }
            r3.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0096 }
            r2.setErrCause(r6)     // Catch:{ all -> 0x0096 }
            if (r8 == 0) goto L_0x00e5
            r8.flush()     // Catch:{ Exception -> 0x008e }
            r8.close()     // Catch:{ Exception -> 0x008e }
        L_0x00e5:
            if (r4 == 0) goto L_0x00f0
            r4.flush()     // Catch:{ Exception -> 0x008e }
            goto L_0x008a
        L_0x00eb:
            java.lang.String r7 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r7, (java.lang.String) r1, (java.lang.Throwable) r6)
        L_0x00f0:
            return r2
        L_0x00f1:
            if (r8 == 0) goto L_0x00fc
            r8.flush()     // Catch:{ Exception -> 0x00fa }
            r8.close()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00fc
        L_0x00fa:
            r7 = move-exception
            goto L_0x0105
        L_0x00fc:
            if (r4 == 0) goto L_0x010a
            r4.flush()     // Catch:{ Exception -> 0x00fa }
            r4.close()     // Catch:{ Exception -> 0x00fa }
            goto L_0x010a
        L_0x0105:
            java.lang.String r8 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r8, (java.lang.String) r1, (java.lang.Throwable) r7)
        L_0x010a:
            throw r6
        L_0x010b:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r6 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_MIMETYPE
            java.lang.String r7 = "saveBitmap method supports MIMETYPE_JPG, MIMETYPE_PNG only"
            r6.setErrCause(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.saveBitmap(android.graphics.Bitmap, java.lang.String, com.kofax.kmc.ken.engines.data.Image$ImageMimeType, int):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r13 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r14.releaseImage(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        if (r9 != com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.kofax.kmc.kut.utilities.error.ErrorInfo saveIpBitmap(android.graphics.Bitmap r15, java.lang.String r16, com.kofax.kmc.ken.engines.data.Image.ImageMimeType r17, int r18, int r19, int r20, java.lang.String r21) {
        /*
            r0 = r16
            r7 = r20
            r8 = r21
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Saving a bitmap using image processor to "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            com.kofax.kmc.kut.utilities.error.ErrorInfo r10 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            r11 = 3
            r12 = 1
            r1 = 24
            r3 = r18
            if (r3 != r1) goto L_0x002a
            r2 = r11
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            if (r15 == 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00a7
            r13 = 0
            com.kofax.kmc.ken.engines.iplib.IpLib r14 = com.kofax.kmc.ken.engines.iplib.IpLib.getInstance()     // Catch:{ KmcException -> 0x0089, all -> 0x0086 }
            r6 = 0
            r1 = r15
            r3 = r18
            r4 = r19
            r5 = r19
            com.kofax.kmc.ken.engines.iplib.IpImage r13 = m406a(r1, r2, r3, r4, r5, r6)     // Catch:{ KmcException -> 0x0084 }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = r13.mErrorInfo     // Catch:{ KmcException -> 0x0084 }
            int[] r2 = com.kofax.kmc.ken.engines.service.ImageService.C04671.f547iz     // Catch:{ KmcException -> 0x007f }
            int r3 = r17.ordinal()     // Catch:{ KmcException -> 0x007f }
            r2 = r2[r3]     // Catch:{ KmcException -> 0x007f }
            if (r2 == r12) goto L_0x0064
            r3 = 2
            if (r2 == r3) goto L_0x005f
            if (r2 == r11) goto L_0x005a
            com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_MIMETYPE     // Catch:{ KmcException -> 0x007f }
            java.lang.String r0 = "saveIpBitmap method does not support MIMETYPE_UNKNOWN"
            r9.setErrCause(r0)     // Catch:{ KmcException -> 0x007f }
            r0 = 0
            goto L_0x0068
        L_0x005a:
            int r0 = r14.writePngImage(r13, r0)     // Catch:{ KmcException -> 0x007f }
            goto L_0x0068
        L_0x005f:
            int r0 = r14.writeTiffImage(r13, r7, r0, r8)     // Catch:{ KmcException -> 0x007f }
            goto L_0x0068
        L_0x0064:
            int r0 = r14.writeJpegImage(r13, r7, r0, r8)     // Catch:{ KmcException -> 0x007f }
        L_0x0068:
            if (r0 == 0) goto L_0x007c
            com.kofax.kmc.kut.utilities.IpLibUtil$IpErrHashMap<java.lang.Integer, com.kofax.kmc.kut.utilities.error.ErrorInfo> r2 = com.kofax.kmc.kut.utilities.IpLibUtil.ipErrHashMap     // Catch:{ KmcException -> 0x007f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ KmcException -> 0x007f }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ KmcException -> 0x007f }
            r9 = r0
            com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = (com.kofax.kmc.kut.utilities.error.ErrorInfo) r9     // Catch:{ KmcException -> 0x007f }
            java.lang.String r0 = "saveIpBitmap write to file returned error"
            r9.setErrCause(r0)     // Catch:{ KmcException -> 0x007f }
        L_0x007c:
            if (r13 == 0) goto L_0x0098
            goto L_0x0095
        L_0x007f:
            r0 = move-exception
            r10 = r1
            goto L_0x008b
        L_0x0082:
            r0 = move-exception
            goto L_0x00a1
        L_0x0084:
            r0 = move-exception
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            r14 = r13
            goto L_0x00a1
        L_0x0089:
            r0 = move-exception
            r14 = r13
        L_0x008b:
            r0.printStackTrace()     // Catch:{ all -> 0x0082 }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = r0.getErrorInfo()     // Catch:{ all -> 0x0082 }
            r1 = r10
            if (r13 == 0) goto L_0x0098
        L_0x0095:
            r14.releaseImage(r13)
        L_0x0098:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r9 != r0) goto L_0x009f
            if (r1 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r1 = r9
        L_0x00a0:
            return r1
        L_0x00a1:
            if (r13 == 0) goto L_0x00a6
            r14.releaseImage(r13)
        L_0x00a6:
            throw r0
        L_0x00a7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "saveIpBitmap: "
            r0.<init>(r1)
            if (r15 != 0) goto L_0x00b3
            java.lang.String r1 = "bitmap is null"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r1 = "filename is null"
        L_0x00b5:
            r0.append(r1)
            com.kofax.kmc.kut.utilities.error.NullPointerException r1 = new com.kofax.kmc.kut.utilities.error.NullPointerException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.saveIpBitmap(android.graphics.Bitmap, java.lang.String, com.kofax.kmc.ken.engines.data.Image$ImageMimeType, int, int, int, java.lang.String):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    public static int imgMimeTypetoIpFileType(Image.ImageMimeType imageMimeType) {
        if (Image.ImageMimeType.MIMETYPE_JPEG == imageMimeType) {
            return 2;
        }
        if (Image.ImageMimeType.MIMETYPE_PNG == imageMimeType) {
            return 5;
        }
        if (Image.ImageMimeType.MIMETYPE_TIFF == imageMimeType) {
            return 3;
        }
        if (imageMimeType == null || Image.ImageMimeType.MIMETYPE_UNKNOWN == imageMimeType) {
            return 0;
        }
        throw new InternalError("ProcessPageOutRep: unable to recognize imageMimeType");
    }

    public static ErrorInfo saveToFileBuffer(byte[] bArr, IpFileBuffer ipFileBuffer) {
        try {
            int writeToFileBuffer = IpLib.getInstance().writeToFileBuffer(bArr, ipFileBuffer);
            ErrorInfo errorInfo = IpLibUtil.ipErrHashMap.get(Integer.valueOf(writeToFileBuffer));
            StringBuilder sb = new StringBuilder();
            sb.append("saveToFileBuffer: writeToFileBuffer returned error ");
            sb.append(writeToFileBuffer);
            errorInfo.setErrCause(sb.toString());
            return errorInfo;
        } catch (KmcException e) {
            return e.getErrorInfo();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r8 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r8 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        r9.releaseImage(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r0 != com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        if (r10 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r10 != com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_EV_MEMORY) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.kofax.kmc.kut.utilities.error.ErrorInfo saveIpBitmap(android.graphics.Bitmap r10, int r11, com.kofax.kmc.ken.engines.iplib.IpFileBuffer r12) {
        /*
            java.lang.String r0 = TAG
            java.lang.String r1 = "Saving a bitmap using image processor to FileBuffer"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r1)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            int r4 = r12.mBitDepth
            r2 = 24
            if (r4 != r2) goto L_0x0013
            r2 = 3
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            r3 = r2
            if (r10 == 0) goto L_0x006f
            r8 = 0
            com.kofax.kmc.ken.engines.iplib.IpLib r9 = com.kofax.kmc.ken.engines.iplib.IpLib.getInstance()     // Catch:{ KmcException -> 0x004b, all -> 0x0048 }
            r7 = 0
            r2 = r10
            r5 = r11
            r6 = r11
            com.kofax.kmc.ken.engines.iplib.IpImage r8 = m406a(r2, r3, r4, r5, r6, r7)     // Catch:{ KmcException -> 0x0046 }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r10 = r8.mErrorInfo     // Catch:{ KmcException -> 0x0046 }
            int r11 = r9.writeImageToFileBuffer(r8, r12)     // Catch:{ KmcException -> 0x0041 }
            if (r11 == 0) goto L_0x003e
            com.kofax.kmc.kut.utilities.IpLibUtil$IpErrHashMap<java.lang.Integer, com.kofax.kmc.kut.utilities.error.ErrorInfo> r12 = com.kofax.kmc.kut.utilities.IpLibUtil.ipErrHashMap     // Catch:{ KmcException -> 0x0041 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ KmcException -> 0x0041 }
            java.lang.Object r11 = r12.get(r11)     // Catch:{ KmcException -> 0x0041 }
            r0 = r11
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = (com.kofax.kmc.kut.utilities.error.ErrorInfo) r0     // Catch:{ KmcException -> 0x0041 }
            java.lang.String r11 = "saveIpBitmap: writeImageToFileBuffer returned error"
            r0.setErrCause(r11)     // Catch:{ KmcException -> 0x0041 }
        L_0x003e:
            if (r8 == 0) goto L_0x005a
            goto L_0x0057
        L_0x0041:
            r11 = move-exception
            r1 = r10
            goto L_0x004d
        L_0x0044:
            r10 = move-exception
            goto L_0x0069
        L_0x0046:
            r11 = move-exception
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r9 = r8
            goto L_0x0069
        L_0x004b:
            r11 = move-exception
            r9 = r8
        L_0x004d:
            r11.printStackTrace()     // Catch:{ all -> 0x0044 }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = r11.getErrorInfo()     // Catch:{ all -> 0x0044 }
            r10 = r1
            if (r8 == 0) goto L_0x005a
        L_0x0057:
            r9.releaseImage(r8)
        L_0x005a:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r0 != r11) goto L_0x0061
            if (r10 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r10 = r0
        L_0x0062:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r11 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_EV_MEMORY
            if (r10 != r11) goto L_0x0068
            com.kofax.kmc.kut.utilities.error.ErrorInfo r10 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE
        L_0x0068:
            return r10
        L_0x0069:
            if (r8 == 0) goto L_0x006e
            r9.releaseImage(r8)
        L_0x006e:
            throw r10
        L_0x006f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "saveIpBitmapToFileBuffer: "
            r10.<init>(r11)
            java.lang.String r11 = "bitmap is null"
            r10.append(r11)
            com.kofax.kmc.kut.utilities.error.NullPointerException r11 = new com.kofax.kmc.kut.utilities.error.NullPointerException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.saveIpBitmap(android.graphics.Bitmap, int, com.kofax.kmc.ken.engines.iplib.IpFileBuffer):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    public static ErrorInfo deleteImage(File file) {
        if (!file.exists()) {
            return ErrorInfo.KMC_GN_FILE_NOT_FOUND;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Deleting image from '");
        sb.append(file);
        sb.append("'");
        C0767k.m1801b(str, sb.toString());
        return file.delete() ? ErrorInfo.KMC_SUCCESS : ErrorInfo.KMC_ED_FILE_STILL_REMAINS;
    }

    public static Image.KenBitmap createScaledBitmapFromBitmapWithMatrix(Bitmap bitmap, float f) {
        Image.KenBitmap kenBitmap = new Image.KenBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int round = Math.round(((float) width) * f);
        int round2 = Math.round(((float) height) * f);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        try {
            kenBitmap.bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (OutOfMemoryError e) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("OOM while creating preview bitmap. width -> ");
            sb.append(round);
            sb.append(", height -> ");
            sb.append(round2);
            C0767k.m1821e(str, sb.toString(), (Throwable) e);
            ErrorInfo errorInfo = ErrorInfo.KMC_GN_OUT_OF_MEMORY;
            errorInfo.setErrCause("Out of memory error creating scaled bitmap from original bitmap with matrix.");
            kenBitmap.errInfo = errorInfo;
        }
        return kenBitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r1 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r1 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c0, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c1, code lost:
        com.kofax.mobile.sdk._internal.C0767k.m1821e(TAG, "Error closing input stream", (java.lang.Throwable) r11);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[Catch:{ OutOfMemoryError -> 0x00a0, Exception -> 0x0050 }, ExcHandler: Exception (e java.lang.Exception), Splitter:B:11:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[LOOP:0: B:22:0x0064->B:23:0x0066, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[SYNTHETIC, Splitter:B:50:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca A[SYNTHETIC, Splitter:B:57:0x00ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadScaledBitmap(android.content.Context r10, android.net.Uri r11, int r12, int r13, int r14) {
        /*
            long r0 = m415af()
            java.lang.String r2 = com.kofax.kmc.ken.engines.service.FileService.getFileNameByUri(r11, r10)
            r3 = 1
            if (r2 == 0) goto L_0x0013
            int r4 = r2.length()
            if (r4 == 0) goto L_0x0013
            r4 = 0
            goto L_0x0014
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 != 0) goto L_0x003d
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            java.lang.String r2 = TAG
            java.lang.String r5 = "Getting file size..."
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "... file -> "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r2, (java.lang.String) r5)
            long r4 = r4.length()
            goto L_0x003f
        L_0x003d:
            r4 = -1
        L_0x003f:
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r6 = "Error closing input stream"
            r7 = 0
            if (r2 > 0) goto L_0x0052
            int r0 = m404a(r10, r11, r12, r13)     // Catch:{ OutOfMemoryError -> 0x00a0, Exception -> 0x0050 }
            goto L_0x0064
        L_0x004d:
            r10 = move-exception
            goto L_0x00c7
        L_0x0050:
            r10 = move-exception
            goto L_0x0088
        L_0x0052:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r0 = java.lang.Math.min(r0, r4)     // Catch:{ OutOfMemoryError -> 0x00a0, Exception -> 0x0050 }
            double r0 = (double) r0     // Catch:{ OutOfMemoryError -> 0x00a0, Exception -> 0x0050 }
            double r0 = java.lang.Math.pow(r8, r0)     // Catch:{ OutOfMemoryError -> 0x00a0, Exception -> 0x0050 }
            int r0 = (int) r0
            goto L_0x0064
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r0 > r14) goto L_0x0069
            int r0 = r0 << 1
            goto L_0x0064
        L_0x0069:
            android.graphics.BitmapFactory$Options r14 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }
            r14.<init>()     // Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }
            r14.inPurgeable = r3     // Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }
            if (r0 <= r3) goto L_0x0074
            r14.inSampleSize = r0     // Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }
        L_0x0074:
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }
            java.io.InputStream r1 = r1.openInputStream(r11)     // Catch:{ OutOfMemoryError -> 0x009f, Exception -> 0x0050 }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r1, r7, r14)     // Catch:{ OutOfMemoryError -> 0x0085, Exception -> 0x0083 }
            if (r1 == 0) goto L_0x009c
            goto L_0x0092
        L_0x0083:
            r10 = move-exception
            goto L_0x0089
        L_0x0085:
            r3 = r0
            r7 = r1
            goto L_0x00a0
        L_0x0088:
            r1 = r7
        L_0x0089:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x009d }
            java.lang.String r12 = "Error decoding image"
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r11, (java.lang.String) r12, (java.lang.Throwable) r10)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x009c
        L_0x0092:
            r1.close()     // Catch:{ Exception -> 0x0096 }
            goto L_0x009c
        L_0x0096:
            r10 = move-exception
            java.lang.String r11 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r11, (java.lang.String) r6, (java.lang.Throwable) r10)
        L_0x009c:
            return r7
        L_0x009d:
            r10 = move-exception
            goto L_0x00c8
        L_0x009f:
            r3 = r0
        L_0x00a0:
            java.lang.String r14 = TAG     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "Encountered OOM while trying to load scaled bitmap. Increasing minimum scale to "
            r0.append(r1)     // Catch:{ all -> 0x004d }
            r0.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004d }
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r14, (java.lang.String) r0)     // Catch:{ all -> 0x004d }
            android.graphics.Bitmap r10 = loadScaledBitmap(r10, r11, r12, r13, r3)     // Catch:{ all -> 0x004d }
            if (r7 == 0) goto L_0x00c6
            r7.close()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00c6
        L_0x00c0:
            r11 = move-exception
            java.lang.String r12 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r12, (java.lang.String) r6, (java.lang.Throwable) r11)
        L_0x00c6:
            return r10
        L_0x00c7:
            r1 = r7
        L_0x00c8:
            if (r1 == 0) goto L_0x00d4
            r1.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d4
        L_0x00ce:
            r11 = move-exception
            java.lang.String r12 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r12, (java.lang.String) r6, (java.lang.Throwable) r11)
        L_0x00d4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.loadScaledBitmap(android.content.Context, android.net.Uri, int, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static int m404a(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
            int i3 = options.outHeight;
            float f = (float) (i / options.outWidth);
            float f2 = (float) (i2 / i3);
            try {
                openInputStream.close();
            } catch (Exception e) {
                C0767k.m1821e(TAG, "Error closing input stream", (Throwable) e);
            }
            if (decodeStream != null) {
                decodeStream.recycle();
            }
            return (int) Math.pow(2.0d, (double) Math.min(f, f2));
        } catch (java.io.FileNotFoundException e2) {
            e2.printStackTrace();
            throw new FileNotFoundException(e2);
        }
    }

    public static void setUseableImageMemoryLimits(UseableImageMemoryLimit useableImageMemoryLimit) {
        f544ix = useableImageMemoryLimit;
    }

    public static UseableImageMemoryLimit getUseableImageMemoryLimits() {
        return f544ix;
    }

    /* renamed from: af */
    private static long m415af() {
        long j = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j2 = maxMemory / 2;
        long min = Math.min(j, j2);
        int i = C04671.f546iA[f544ix.ordinal()];
        if (i == 1) {
            maxMemory = j2;
        } else if (i != 2) {
            maxMemory = min;
        }
        dumpHeapStats("getLargestUseableImage()");
        return maxMemory;
    }

    /* renamed from: com.kofax.kmc.ken.engines.service.ImageService$1 */
    static /* synthetic */ class C04671 {

        /* renamed from: iA */
        static final /* synthetic */ int[] f546iA;

        /* renamed from: iz */
        static final /* synthetic */ int[] f547iz;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.kofax.kmc.ken.engines.service.ImageService$UseableImageMemoryLimit[] r0 = com.kofax.kmc.ken.engines.service.ImageService.UseableImageMemoryLimit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f546iA = r0
                r1 = 1
                com.kofax.kmc.ken.engines.service.ImageService$UseableImageMemoryLimit r2 = com.kofax.kmc.ken.engines.service.ImageService.UseableImageMemoryLimit.LARGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f546iA     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.service.ImageService$UseableImageMemoryLimit r3 = com.kofax.kmc.ken.engines.service.ImageService.UseableImageMemoryLimit.MAXIMUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f546iA     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.service.ImageService$UseableImageMemoryLimit r4 = com.kofax.kmc.ken.engines.service.ImageService.UseableImageMemoryLimit.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType[] r3 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f547iz = r3
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType r4 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f547iz     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType r3 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f547iz     // Catch:{ NoSuchFieldError -> 0x004d }
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_PNG     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.C04671.<clinit>():void");
        }
    }

    public static void dumpHeapStats(String str) {
        C0767k.m1801b(TAG, "*** [START] Dumping heap stats ***");
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("--- msg -> ");
        sb.append(str);
        C0767k.m1801b(str2, sb.toString());
        String str3 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--- native heap size -> ");
        sb2.append(Debug.getNativeHeapSize());
        C0767k.m1801b(str3, sb2.toString());
        String str4 = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--- native heap size (free) -> ");
        sb3.append(Debug.getNativeHeapFreeSize());
        C0767k.m1801b(str4, sb3.toString());
        String str5 = TAG;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("--- native heap size (allocated) -> ");
        sb4.append(Debug.getNativeHeapAllocatedSize());
        C0767k.m1801b(str5, sb4.toString());
        String str6 = TAG;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("--- totalMemory -> ");
        sb5.append(Runtime.getRuntime().totalMemory());
        C0767k.m1801b(str6, sb5.toString());
        String str7 = TAG;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("--- maxMemory -> ");
        sb6.append(Runtime.getRuntime().maxMemory());
        C0767k.m1801b(str7, sb6.toString());
        C0767k.m1801b(TAG, "*** [END] Dumping heap stats ***");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[SYNTHETIC, Splitter:B:30:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.kofax.kmc.ken.engines.service.ImageService.ImageDimension getImageDimension(java.lang.String r5) throws com.kofax.kmc.kut.utilities.error.IOException {
        /*
            java.lang.String r0 = "Unable to close file"
            boolean r1 = m417g(r5)
            if (r1 != 0) goto L_0x001d
            boolean r1 = m418h(r5)
            if (r1 != 0) goto L_0x001d
            boolean r1 = m419i(r5)
            if (r1 == 0) goto L_0x0015
            goto L_0x001d
        L_0x0015:
            com.kofax.kmc.kut.utilities.error.IOException r5 = new com.kofax.kmc.kut.utilities.error.IOException
            java.lang.String r0 = "File format not supported"
            r5.<init>((java.lang.String) r0)
            throw r5
        L_0x001d:
            boolean r1 = m418h(r5)
            if (r1 == 0) goto L_0x0060
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            long r1 = r1.length()
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0048 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0048 }
            com.kofax.kmc.ken.engines.service.ImageService$ImageDimension r5 = m410a((java.io.InputStream) r4, (long) r1)     // Catch:{ FileNotFoundException -> 0x0043, all -> 0x0041 }
            r4.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r1 = move-exception
            java.lang.String r2 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1815d((java.lang.String) r2, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0040:
            return r5
        L_0x0041:
            r5 = move-exception
            goto L_0x0053
        L_0x0043:
            r5 = move-exception
            r3 = r4
            goto L_0x0049
        L_0x0046:
            r5 = move-exception
            goto L_0x0052
        L_0x0048:
            r5 = move-exception
        L_0x0049:
            r5.printStackTrace()     // Catch:{ all -> 0x0046 }
            com.kofax.kmc.kut.utilities.error.FileNotFoundException r1 = new com.kofax.kmc.kut.utilities.error.FileNotFoundException     // Catch:{ all -> 0x0046 }
            r1.<init>((java.io.FileNotFoundException) r5)     // Catch:{ all -> 0x0046 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0052:
            r4 = r3
        L_0x0053:
            if (r4 == 0) goto L_0x005f
            r4.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005f
        L_0x0059:
            r1 = move-exception
            java.lang.String r2 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1815d((java.lang.String) r2, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x005f:
            throw r5
        L_0x0060:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r5, r0)
            com.kofax.kmc.ken.engines.service.ImageService$ImageDimension r5 = new com.kofax.kmc.ken.engines.service.ImageService$ImageDimension
            int r1 = r0.outWidth
            int r0 = r0.outHeight
            r5.<init>(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.getImageDimension(java.lang.String):com.kofax.kmc.ken.engines.service.ImageService$ImageDimension");
    }

    /* renamed from: a */
    private static ImageDimension m410a(InputStream inputStream, long j) throws IOException {
        ReadableByteChannel newChannel = Channels.newChannel(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(12);
        m414a(newChannel, allocate, 8);
        byte b = allocate.get();
        if (b == allocate.get() && (b == 73 || b == 77)) {
            allocate.order(b == 73 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
            if (allocate.getShort() == 42) {
                try {
                    int i = allocate.getInt();
                    if (((long) i) < j) {
                        inputStream.skip((long) (i - 8));
                        m414a(newChannel, allocate, 2);
                        int i2 = -1;
                        int i3 = -1;
                        int i4 = -1;
                        for (int i5 = allocate.getShort(); i5 > 0 && (i2 < 0 || i3 < 0 || i4 < 0); i5--) {
                            m414a(newChannel, allocate, 12);
                            short s = allocate.getShort();
                            if (s == 256) {
                                i2 = m405a(allocate);
                            } else if (s == 257) {
                                i3 = m405a(allocate);
                            } else if (s == 259 && (i4 = m405a(allocate)) == 5) {
                                throw new IOException("Unsupported tiff compression type - LZW");
                            }
                        }
                        return new ImageDimension(i2, i3);
                    }
                    throw new IOException("Invalid tiff file.");
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                    throw new IOException(e);
                }
            } else {
                throw new IOException("Not a tiff file.");
            }
        } else {
            throw new IOException("Not a tiff file.");
        }
    }

    /* renamed from: a */
    private static void m414a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.hasRemaining()) {
            try {
                readableByteChannel.read(byteBuffer);
            } catch (java.io.IOException e) {
                e.printStackTrace();
                throw new IOException(e);
            }
        }
        byteBuffer.flip();
    }

    /* renamed from: a */
    private static int m405a(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        if (byteBuffer.getInt() != 1) {
            throw new RuntimeException("Expected a count of 1 for the given field.");
        } else if (s == 3) {
            return byteBuffer.getShort();
        } else {
            if (s != 4) {
                return byteBuffer.get() & 255;
            }
            return byteBuffer.getInt();
        }
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, boolean z) {
        long af = m415af();
        long rowBytes = (long) (bitmap.getRowBytes() * bitmap.getHeight());
        C0767k.m1801b(TAG, "Creating scaled bitmap...");
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("... original bitmap size -> ");
        sb.append(rowBytes);
        C0767k.m1801b(str, sb.toString());
        if (rowBytes > af) {
            dumpHeapStats("createScaledBitmap - preScale");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = ((float) af) / ((float) rowBytes);
            int i = (int) (((float) width) * f);
            int i2 = (int) (((float) height) * f);
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("... scaling bitmap with factor of ");
            sb2.append(f);
            C0767k.m1801b(str2, sb2.toString());
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                String str3 = TAG;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("... new bitmap size -> ");
                sb3.append(createScaledBitmap.getRowBytes() * createScaledBitmap.getHeight());
                C0767k.m1801b(str3, sb3.toString());
                if (z) {
                    C0767k.m1801b(TAG, "... recyling old bitmap");
                    bitmap.recycle();
                }
                dumpHeapStats("createScaledBitmap - postScale");
                return createScaledBitmap;
            } catch (OutOfMemoryError e) {
                C0767k.m1821e(TAG, "Got OOM while trying to create scaled bitmap", (Throwable) e);
                String str4 = TAG;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("... largestImageSize -> ");
                sb4.append(af);
                C0767k.m1820e(str4, sb4.toString());
                String str5 = TAG;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("... bmSize -> ");
                sb5.append(rowBytes);
                C0767k.m1820e(str5, sb5.toString());
                String str6 = TAG;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("... orgHeight -> ");
                sb6.append(height);
                sb6.append(", orgWidth -> ");
                sb6.append(width);
                C0767k.m1820e(str6, sb6.toString());
                String str7 = TAG;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("... height -> ");
                sb7.append(i2);
                sb7.append(", width -> ");
                sb7.append(i);
                C0767k.m1820e(str7, sb7.toString());
            }
        }
        return bitmap;
    }

    public static Bitmap rotateImage(byte[] bArr, boolean z, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        dumpHeapStats("rotateImage - preDecode");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        dumpHeapStats("rotateImage - postDecode");
        return rotateBitmap(decodeByteArray, z, z2);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, boolean z, boolean z2) {
        return rotateBitmap(bitmap, z, z2, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap r13, boolean r14, boolean r15, boolean r16) {
        /*
            java.lang.String r1 = "Error rotating bitmap"
            java.lang.String r0 = TAG
            java.lang.String r2 = "About to scale bitmap. Source information before scaling: "
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r0 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "... size -> "
            r2.append(r3)
            int r4 = r13.getRowBytes()
            int r5 = r13.getHeight()
            int r4 = r4 * r5
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r0 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "... height -> "
            r2.append(r4)
            int r5 = r13.getHeight()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r0 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "... width -> "
            r2.append(r5)
            int r6 = r13.getWidth()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r2)
            if (r15 == 0) goto L_0x0066
            r0 = 1
            r2 = r13
            android.graphics.Bitmap r0 = createScaledBitmap(r13, r0)
            r2 = r0
            goto L_0x0067
        L_0x0066:
            r2 = r13
        L_0x0067:
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            if (r14 == 0) goto L_0x0071
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0073
        L_0x0071:
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x0073:
            r11.postRotate(r0)
            java.lang.String r0 = "rotateImage - preRotate"
            dumpHeapStats(r0)
            java.lang.String r0 = TAG
            java.lang.String r6 = "About to rotate bitmap. Source information: "
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r6)
            java.lang.String r0 = TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            int r3 = r2.getRowBytes()
            int r7 = r2.getHeight()
            int r3 = r3 * r7
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)
            java.lang.String r0 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            int r4 = r2.getHeight()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)
            java.lang.String r0 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            int r4 = r2.getWidth()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)
            r7 = 0
            r8 = 0
            r3 = 0
            int r9 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            int r10 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            r12 = 0
            r6 = r2
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            java.lang.String r0 = TAG     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            java.lang.String r5 = "... rotated bitmap size -> "
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            int r5 = r3.getRowBytes()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            int r6 = r3.getHeight()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            int r5 = r5 * r6
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            java.lang.String r4 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
            if (r16 == 0) goto L_0x0104
            r2.recycle()     // Catch:{ OutOfMemoryError -> 0x010c, Exception -> 0x0105 }
        L_0x0104:
            return r3
        L_0x0105:
            r0 = move-exception
            java.lang.String r4 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r4, (java.lang.String) r1, (java.lang.Throwable) r0)
            goto L_0x0112
        L_0x010c:
            r0 = move-exception
            java.lang.String r4 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r4, (java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0112:
            if (r3 == 0) goto L_0x0117
            r3.recycle()
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.rotateBitmap(android.graphics.Bitmap, boolean, boolean, boolean):android.graphics.Bitmap");
    }

    /* renamed from: f */
    private static void m416f(Bitmap bitmap) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RttiJsonExactionHelper.HEIGHT, bitmap.getHeight());
            jSONObject.put(RttiJsonExactionHelper.WIDTH, bitmap.getWidth());
            jSONObject.put("density", bitmap.getDensity());
            jSONObject.put("rowBytes", bitmap.getRowBytes());
            jSONObject.put("totalBytes", bitmap.getRowBytes() * bitmap.getHeight());
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Error creating JSON for Bitmap", (Throwable) e);
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Bitmap -> ");
        sb.append(jSONObject.toString());
        C0767k.m1801b(str, sb.toString());
    }

    /* renamed from: a */
    private static void m413a(int i, ProcessPageResults processPageResults) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", i);
            jSONObject.put("resultStr", processPageResults.resultStr);
            jSONObject.put("processedImage", m412a(processPageResults.processedImg));
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Error creating JSON for ProcessPageResults", (Throwable) e);
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessPageResults -> ");
        sb.append(jSONObject.toString());
        C0767k.m1801b(str, sb.toString());
    }

    /* renamed from: a */
    private static JSONObject m412a(IpImage ipImage) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RttiJsonExactionHelper.WIDTH, ipImage.getWidth());
            jSONObject.put(RttiJsonExactionHelper.HEIGHT, ipImage.getHeight());
            jSONObject.put("channels", ipImage.getChannels());
            jSONObject.put("bitDepth", ipImage.getBitDepth());
            jSONObject.put("dpiX", ipImage.getDpiX());
            jSONObject.put("dpiY", ipImage.getDpiY());
        } catch (Exception e) {
            C0767k.m1821e("IpImage", "Error creating JSON", (Throwable) e);
        }
        return jSONObject;
    }

    public static Image.KenBitmap readBitmapFromFileUsingIp(String str, float f, IpImageMetadata ipImageMetadata) {
        Image.KenBitmap kenBitmap = new Image.KenBitmap();
        try {
            IpLib instance = IpLib.getInstance();
            IpImage ipImage = new IpImage();
            Integer valueOf = Integer.valueOf(instance.readImageFile(ipImage, str, f, ipImageMetadata));
            if (valueOf.intValue() != 0) {
                kenBitmap.errInfo = IpLibUtil.ipErrHashMap.get(valueOf);
            } else {
                kenBitmap.bitmap = instance.createBitmap(ipImage);
                kenBitmap.mDpiX = Integer.valueOf(ipImage.mDpiX);
                kenBitmap.mDpiY = Integer.valueOf(ipImage.mDpiY);
                instance.releaseImage(ipImage);
            }
        } catch (KmcException e) {
            kenBitmap.errInfo = e.getErrorInfo();
            e.printStackTrace();
        }
        return kenBitmap;
    }

    public static Image.KenBitmap loadBitmapFromFileBuffer(IpFileBuffer ipFileBuffer) {
        Image.KenBitmap kenBitmap = new Image.KenBitmap();
        ByteBuffer byteBuffer = ipFileBuffer.mByteBuffer;
        if (byteBuffer.capacity() > 0) {
            int capacity = byteBuffer.capacity();
            byte[] bArr = new byte[capacity];
            byteBuffer.get(bArr);
            kenBitmap.bitmap = BitmapFactory.decodeByteArray(bArr, 0, capacity);
            if (kenBitmap.bitmap == null) {
                kenBitmap.errInfo = ErrorInfo.KMC_ED_BUFFERED_READ_FAILED;
            }
            return kenBitmap;
        }
        throw new InternalError("loadBitmapFromFileBuffer: fileBuffer has no capacity");
    }

    public static Image.KenBitmap readBitmapFromFileBufferUsingIp(IpFileBuffer ipFileBuffer, float f) {
        Image.KenBitmap kenBitmap = new Image.KenBitmap();
        try {
            IpLib instance = IpLib.getInstance();
            IpImage ipImage = new IpImage();
            Integer valueOf = Integer.valueOf(instance.readImageFromFileBuffer(ipImage, f, ipFileBuffer));
            if (valueOf.intValue() != 0) {
                kenBitmap.errInfo = IpLibUtil.ipErrHashMap.get(valueOf);
            } else {
                try {
                    kenBitmap.bitmap = instance.createBitmap(ipImage);
                } catch (OutOfMemoryError e) {
                    C0767k.m1821e(TAG, "OOM while creating bitmap.", (Throwable) e);
                    ErrorInfo errorInfo = ErrorInfo.KMC_GN_OUT_OF_MEMORY;
                    errorInfo.setErrCause("Out of memory error reading bitmap from file buffer");
                    kenBitmap.errInfo = errorInfo;
                }
                if (kenBitmap.errInfo == ErrorInfo.KMC_SUCCESS) {
                    kenBitmap.mDpiX = Integer.valueOf(ipImage.mDpiX);
                    kenBitmap.mDpiY = Integer.valueOf(ipImage.mDpiY);
                    instance.releaseImage(ipImage);
                }
            }
        } catch (KmcException e2) {
            kenBitmap.errInfo = e2.getErrorInfo();
            e2.printStackTrace();
        }
        return kenBitmap;
    }

    public static ErrorInfo clearFileBufferUsingIp(IpFileBuffer ipFileBuffer) throws KmcException {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        if (IpLib.getInstance().releaseFileBuffer(ipFileBuffer) == 0) {
            return errorInfo;
        }
        throw new InternalError("clearFileBufferUsingIp: releaseFileBuffer failed");
    }

    /* renamed from: a */
    private static IpImage m407a(Bitmap bitmap, Integer num) throws KmcException {
        return createIpImageFromBitmap(bitmap, num, false);
    }

    public static IpImage createIpImageFromBitmap(Bitmap bitmap, Integer num, boolean z) throws KmcException {
        int i;
        int i2;
        int i3 = 1;
        int i4 = z ? 1 : 3;
        if (!z) {
            i3 = 24;
        }
        int i5 = i3;
        int i6 = 72;
        int i7 = z ? 200 : 72;
        if (z) {
            i6 = 200;
        }
        if (num == null || num.intValue() <= 0) {
            i = i6;
            i2 = i7;
        } else {
            i2 = num.intValue();
            i = i2;
        }
        return m406a(bitmap, i4, i5, i2, i, false);
    }

    /* renamed from: a */
    private static IpImage m406a(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z) throws KmcException {
        IpLib instance = IpLib.getInstance();
        IpImage ipImage = new IpImage();
        int createImage = instance.createImage(ipImage, bitmap, i, i2, i3, i4);
        if (z) {
            bitmap.recycle();
        }
        if (createImage == -9900) {
            ipImage.mErrorInfo = ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL;
        } else if (createImage == -9901) {
            ipImage.mErrorInfo = ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY;
        } else if (createImage < 0) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Bad return code when creating an image from a bitmap. rc = ");
            sb.append(createImage);
            C0767k.m1820e(str, sb.toString());
            throw new KmcException(IpLibUtil.ipErrHashMap.get(Integer.valueOf(createImage)));
        }
        return ipImage;
    }

    public static class EnhancementResults {
        public ErrorInfo errorInfo;
        public Image image;
        public Image originalImage;

        public EnhancementResults(ErrorInfo errorInfo2) {
            this.errorInfo = errorInfo2;
        }

        public EnhancementResults(Image image2, Image image3) {
            this.errorInfo = ErrorInfo.KMC_SUCCESS;
            this.image = image2;
            this.originalImage = image3;
        }
    }

    /* renamed from: a */
    private static EnhancementResults m409a(Bitmap bitmap, ImagePerfectionProfile imagePerfectionProfile, ImageProcessorConfiguration imageProcessorConfiguration, BoundingTetragon boundingTetragon, Image image, int i, ProcessPageOutRep processPageOutRep, IpLib.ProcessingProgressClient processingProgressClient, Image image2, Integer num) throws KmcException {
        boolean z;
        m416f(bitmap);
        Integer imageDPI = image.getImageDPI();
        if (num == null || num.intValue() <= 0) {
            z = false;
        } else {
            z = true;
            imageDPI = num;
        }
        IpLib instance = IpLib.getInstance();
        Bitmap bitmap2 = bitmap;
        IpImage a = m407a(bitmap, imageDPI);
        ProcessPageResults processPageResults = new ProcessPageResults();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("inImg width ------> ");
        sb.append(a.getWidth());
        C0767k.m1801b(str, sb.toString());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("inImg height ------> ");
        sb2.append(a.getHeight());
        C0767k.m1801b(str2, sb2.toString());
        C0468a a2 = m411a(imagePerfectionProfile, imageProcessorConfiguration, boundingTetragon, image, z);
        String a3 = a2.f550iC;
        processPageResults.resultStr = a2.f551iD;
        dumpHeapStats("enhanceImage(before processPage)");
        int processPage = instance.processPage(processPageResults, a, a3, processPageOutRep, i, processingProgressClient, processPageOutRep);
        m413a(processPage, processPageResults);
        instance.releaseImage(a);
        dumpHeapStats("enhanceImage(after processPage)");
        return m408a(processPage, instance, processPageResults, imagePerfectionProfile, a3, image, processPageOutRep, image2);
    }

    public static EnhancementResults enhanceImage(Bitmap bitmap, ImagePerfectionProfile imagePerfectionProfile, ImageProcessorConfiguration imageProcessorConfiguration, BoundingTetragon boundingTetragon, Image image, int i, ProcessPageOutRep processPageOutRep, IpLib.ProcessingProgressClient processingProgressClient, Image image2, Integer num) throws KmcException {
        return m409a(bitmap, imagePerfectionProfile, imageProcessorConfiguration, boundingTetragon, image, i, processPageOutRep, processingProgressClient, image2, num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0106  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults m408a(int r7, com.kofax.kmc.ken.engines.iplib.IpLib r8, com.kofax.kmc.ken.engines.iplib.ProcessPageResults r9, com.kofax.kmc.ken.engines.data.ImagePerfectionProfile r10, java.lang.String r11, com.kofax.kmc.ken.engines.data.Image r12, com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r13, com.kofax.kmc.ken.engines.data.Image r14) throws com.kofax.kmc.kut.utilities.error.KmcException {
        /*
            if (r7 < 0) goto L_0x0115
            java.lang.String r7 = r12.getImageID()
            com.kofax.kmc.ken.engines.data.Image$ImageRep r10 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP
            com.kofax.kmc.ken.engines.data.Image$ImageRep r11 = r13.imageRep
            r0 = 0
            r1 = 1
            if (r10 == r11) goto L_0x0027
            boolean r10 = r13.isQuickAnalysisBitmapNeeded()
            if (r10 != 0) goto L_0x0027
            com.kofax.kmc.ken.engines.data.Image$ImageRep r10 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE
            com.kofax.kmc.ken.engines.data.Image$ImageRep r11 = r13.imageRep
            if (r10 != r11) goto L_0x001c
            r10 = r1
            goto L_0x0029
        L_0x001c:
            com.kofax.kmc.ken.engines.data.Image$ImageRep r10 = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH
            com.kofax.kmc.ken.engines.data.Image$ImageRep r11 = r13.imageRep
            if (r10 != r11) goto L_0x0025
            r10 = r1
            r0 = r10
            goto L_0x0029
        L_0x0025:
            r10 = r0
            goto L_0x0029
        L_0x0027:
            r10 = r0
            r0 = r1
        L_0x0029:
            r11 = 0
            if (r0 == 0) goto L_0x00c1
            java.lang.String r2 = "createEnhancementResults()"
            dumpHeapStats(r2)     // Catch:{ OutOfMemoryError -> 0x00a7 }
            com.kofax.kmc.ken.engines.iplib.IpImage r2 = r9.processedImg     // Catch:{ OutOfMemoryError -> 0x00a7 }
            android.graphics.Bitmap r2 = r8.createBitmap(r2)     // Catch:{ OutOfMemoryError -> 0x00a7 }
            java.lang.String r3 = TAG     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r5 = "Enhanced bitmap height -> "
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            int r5 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r4 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r3 = TAG     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r5 = "Enhanced bitmap width -> "
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            int r5 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r4 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r3 = TAG     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r5 = "Enhanced bitmap row bytes -> "
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            int r5 = r2.getRowBytes()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r4 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r3 = TAG     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00a5 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r5 = "Enhanced bitmap total bytes -> "
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            int r5 = r2.getRowBytes()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            int r6 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            int r5 = r5 * r6
            r4.append(r5)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            java.lang.String r4 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x00a5 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ OutOfMemoryError -> 0x00a5 }
            goto L_0x00b1
        L_0x00a5:
            r3 = move-exception
            goto L_0x00aa
        L_0x00a7:
            r2 = move-exception
            r3 = r2
            r2 = r11
        L_0x00aa:
            java.lang.String r4 = TAG
            java.lang.String r5 = "Out of memory error creating bitmap from processed image. Saving the Bitmap to a temp file and re-loading it as a scaled image."
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r4, (java.lang.String) r5, (java.lang.Throwable) r3)
        L_0x00b1:
            if (r2 == 0) goto L_0x00b4
            goto L_0x00c2
        L_0x00b4:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r7 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_OUT_OF_MEMORY
            java.lang.String r8 = "Out of memory error creating bitmap from processed image."
            r7.setErrCause(r8)
            com.kofax.kmc.kut.utilities.error.KmcException r8 = new com.kofax.kmc.kut.utilities.error.KmcException
            r8.<init>(r7)
            throw r8
        L_0x00c1:
            r2 = r11
        L_0x00c2:
            com.kofax.kmc.ken.engines.iplib.IpImage r3 = r9.processedImg
            int r3 = r3.getDpiX()
            com.kofax.kmc.ken.engines.iplib.IpImage r4 = r9.processedImg
            int r4 = r4.getBitDepth()
            com.kofax.kmc.ken.engines.iplib.IpImage r5 = r9.processedImg
            r8.releaseImage(r5)
            r9.processedImg = r11
            if (r10 == 0) goto L_0x00e1
            java.lang.String r8 = r13.processedFilePathStr
            r14.setImageFilePath(r8)
            com.kofax.kmc.ken.engines.data.Image$ImageMimeType r8 = r13.imageMimeType
            r14.setImageMimeType(r8)
        L_0x00e1:
            com.kofax.kmc.ken.engines.data.Image$FriendI r8 = new com.kofax.kmc.ken.engines.data.Image$FriendI
            java.lang.String r10 = "com.kofax"
            r8.<init>(r10)
            if (r0 == 0) goto L_0x00f0
            r2.setDensity(r3)
            r8.setImageBitmap(r2)
        L_0x00f0:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r8.setImageDPI(r10)
            r8.setImageSrcID(r7)
            java.lang.String r7 = r9.resultStr
            r8.setImageMetaData(r7)
            com.kofax.kmc.ken.engines.data.Image$OutputColor r7 = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_COLOR
            if (r1 != r4) goto L_0x0106
            com.kofax.kmc.ken.engines.data.Image$OutputColor r7 = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_BITONAL
            goto L_0x010c
        L_0x0106:
            r8 = 8
            if (r8 != r4) goto L_0x010c
            com.kofax.kmc.ken.engines.data.Image$OutputColor r7 = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_GRAYSCALE
        L_0x010c:
            r14.setImageOutputColor(r7)
            com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults r7 = new com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults
            r7.<init>(r14, r12)
            return r7
        L_0x0115:
            com.kofax.kmc.kut.utilities.IpLibUtil$IpErrHashMap<java.lang.Integer, com.kofax.kmc.kut.utilities.error.ErrorInfo> r8 = com.kofax.kmc.kut.utilities.IpLibUtil.ipErrHashMap
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r8.get(r9)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r8 = (com.kofax.kmc.kut.utilities.error.ErrorInfo) r8
            java.lang.String r9 = "Unable to enhance image due to IpLib error"
            r8.setErrCause(r9)
            com.kofax.kmc.kut.utilities.error.KmcException r9 = new com.kofax.kmc.kut.utilities.error.KmcException
            r9.<init>(r8)
            java.lang.String r8 = TAG
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "IpLib rc="
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r8, (java.lang.String) r7)
            java.lang.String r7 = TAG
            java.lang.String r8 = "IpLib error"
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r7, (java.lang.String) r8, (java.lang.Throwable) r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.m408a(int, com.kofax.kmc.ken.engines.iplib.IpLib, com.kofax.kmc.ken.engines.iplib.ProcessPageResults, com.kofax.kmc.ken.engines.data.ImagePerfectionProfile, java.lang.String, com.kofax.kmc.ken.engines.data.Image, com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep, com.kofax.kmc.ken.engines.data.Image):com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults");
    }

    public static File copyToTempImage(Context context, File file, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(FileService.getLocalPath(context));
        sb.append(File.separator);
        sb.append(str);
        File file2 = new File(sb.toString());
        try {
            if (FileService.copyFile(file, file2)) {
                return file2;
            }
            return null;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        }
    }

    public static File createTempImageFile(Context context, String str) {
        File file = new File(FileService.getLocalPath(context));
        file.mkdir();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mmddyy-hhMMss", Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(".");
        sb.append(str);
        return new File(file, sb.toString());
    }

    public static String dumpBitmapSize(Bitmap bitmap, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return "Unable to calculate size";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dumping bitmap data from ");
        sb2.append(str);
        sb2.append(": ");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Height -> ");
        sb3.append(bitmap.getHeight());
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(", Width -> ");
        sb4.append(bitmap.getWidth());
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(", Density -> ");
        sb5.append(bitmap.getDensity());
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(", Size -> ");
        sb6.append(bitmap.getRowBytes() * bitmap.getHeight());
        sb.append(sb6.toString());
        return sb.toString();
    }

    public static String[] getRawTempFilenames(Activity activity, boolean z) {
        String[] strArr = new String[2];
        if (z) {
            strArr[0] = "temp_raw";
            strArr[1] = "temp_raw_thmb";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(FileService.getLocalPath(activity));
            sb.append(File.separator);
            sb.append("temp_raw");
            strArr[0] = new File(sb.toString()).getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileService.getLocalPath(activity));
            sb2.append(File.separator);
            sb2.append("temp_raw_thmb");
            strArr[1] = new File(sb2.toString()).getAbsolutePath();
        }
        return strArr;
    }

    public static String[] getProcessedTempFilenames(Activity activity, boolean z) {
        String[] strArr = new String[2];
        if (z) {
            strArr[0] = "temp_proc";
            strArr[1] = "temp_proc_thmb";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(FileService.getLocalPath(activity));
            sb.append(File.separator);
            sb.append("temp_proc");
            strArr[0] = new File(sb.toString()).getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileService.getLocalPath(activity));
            sb2.append(File.separator);
            sb2.append("temp_proc_thmb");
            strArr[1] = new File(sb2.toString()).getAbsolutePath();
        }
        return strArr;
    }

    public static Image.KenBitmap loadBitmapFromFile(String str, int i, boolean z) {
        return loadBitmapFromURI(Uri.fromFile(new File(str)), i, -1, z);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.graphics.Rect, android.graphics.Bitmap] */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:34|35|(1:37)|38|(1:40)|(2:41|42)|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5 = TAG;
        r6 = new java.lang.StringBuilder();
        r6.append("OOM while loading a bitmap at scale ");
        r6.append(r9);
        com.kofax.mobile.sdk._internal.C0767k.m1820e(r5, r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r3 != 0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        r1.errInfo = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_OUT_OF_MEMORY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r12 != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        r1 = loadBitmapFromURI(r8, r9 << 1, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        com.kofax.mobile.sdk._internal.C0767k.m1821e(TAG, "Error closing input stream", (java.lang.Throwable) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00c4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap loadBitmapFromURI(android.net.Uri r8, int r9, long r10, boolean r12) {
        /*
            java.lang.String r0 = "Error closing input stream"
        L_0x0002:
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Loading bitmap from uri '"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = "' at scale "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " with a largest image size of "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            com.kofax.kmc.ken.engines.data.Image$KenBitmap r1 = new com.kofax.kmc.ken.engines.data.Image$KenBitmap
            r1.<init>()
            android.content.Context r2 = com.kofax.kmc.kut.utilities.AppContextProvider.getContext()     // Catch:{ FileNotFoundException -> 0x0100 }
            r3 = 0
            if (r2 == 0) goto L_0x003d
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0100 }
            java.io.InputStream r2 = r2.openInputStream(r8)     // Catch:{ FileNotFoundException -> 0x0100 }
            goto L_0x0042
        L_0x003d:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_BAD_APPLICATION_CONTEXT     // Catch:{ FileNotFoundException -> 0x0100 }
            r1.errInfo = r2     // Catch:{ FileNotFoundException -> 0x0100 }
            r2 = r3
        L_0x0042:
            r4 = 1
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r5.inPurgeable = r4     // Catch:{ OutOfMemoryError -> 0x00c4 }
            if (r9 <= r4) goto L_0x004e
            r5.inSampleSize = r9     // Catch:{ OutOfMemoryError -> 0x00c4 }
        L_0x004e:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r3, r5)     // Catch:{ OutOfMemoryError -> 0x00c4 }
            if (r3 != 0) goto L_0x0059
            com.kofax.kmc.kut.utilities.error.ErrorInfo r5 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_BITMAP_READ_FROM_FILE_FAILED     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r1.errInfo = r5     // Catch:{ OutOfMemoryError -> 0x00c4 }
            goto L_0x009a
        L_0x0059:
            r1.bitmap = r3     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r1.scaleFactor = r9     // Catch:{ OutOfMemoryError -> 0x00c4 }
            if (r9 <= r4) goto L_0x0062
            com.kofax.kmc.kut.utilities.error.ErrorInfo r5 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_IMAGE_IS_SCALED     // Catch:{ OutOfMemoryError -> 0x00c4 }
            goto L_0x0064
        L_0x0062:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r5 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS     // Catch:{ OutOfMemoryError -> 0x00c4 }
        L_0x0064:
            r1.errInfo = r5     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.String r5 = TAG     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.String r7 = "bm width="
            r6.append(r7)     // Catch:{ OutOfMemoryError -> 0x00c4 }
            int r7 = r3.getWidth()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r6.append(r7)     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.String r6 = r6.toString()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.String r5 = TAG     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.String r7 = "bm height="
            r6.append(r7)     // Catch:{ OutOfMemoryError -> 0x00c4 }
            int r7 = r3.getHeight()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            r6.append(r7)     // Catch:{ OutOfMemoryError -> 0x00c4 }
            java.lang.String r6 = r6.toString()     // Catch:{ OutOfMemoryError -> 0x00c4 }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ OutOfMemoryError -> 0x00c4 }
        L_0x009a:
            r2.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00a4
        L_0x009e:
            r2 = move-exception
            java.lang.String r4 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x00a4:
            r4 = 0
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c1
            int r2 = r3.getRowBytes()
            int r4 = r3.getHeight()
            int r2 = r2 * r4
            long r4 = (long) r2
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00bd
            r3.recycle()
        L_0x00bd:
            int r9 = r9 << 1
            goto L_0x0002
        L_0x00c1:
            return r1
        L_0x00c2:
            r8 = move-exception
            goto L_0x00f5
        L_0x00c4:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r6.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "OOM while loading a bitmap at scale "
            r6.append(r7)     // Catch:{ all -> 0x00c2 }
            r6.append(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c2 }
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x00df
            r3.recycle()     // Catch:{ all -> 0x00c2 }
        L_0x00df:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_OUT_OF_MEMORY     // Catch:{ all -> 0x00c2 }
            r1.errInfo = r3     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x00ea
            int r9 = r9 << r4
            com.kofax.kmc.ken.engines.data.Image$KenBitmap r1 = loadBitmapFromURI(r8, r9, r10, r12)     // Catch:{ all -> 0x00c2 }
        L_0x00ea:
            r2.close()     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f4
        L_0x00ee:
            r8 = move-exception
            java.lang.String r9 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r9, (java.lang.String) r0, (java.lang.Throwable) r8)
        L_0x00f4:
            return r1
        L_0x00f5:
            r2.close()     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00ff
        L_0x00f9:
            r9 = move-exception
            java.lang.String r10 = TAG
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r10, (java.lang.String) r0, (java.lang.Throwable) r9)
        L_0x00ff:
            throw r8
        L_0x0100:
            r8 = move-exception
            java.lang.String r9 = TAG
            java.lang.String r10 = "Error loading file"
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r9, (java.lang.String) r10, (java.lang.Throwable) r8)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_FILE_NOT_FOUND
            r1.errInfo = r9
            com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = r1.errInfo
            java.lang.String r8 = r8.getMessage()
            r9.setErrCause(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.loadBitmapFromURI(android.net.Uri, int, long, boolean):com.kofax.kmc.ken.engines.data.Image$KenBitmap");
    }

    public static File saveIpPNG(Context context, IpLib ipLib, IpImage ipImage, File file) {
        if (file == null) {
            file = createTempImageFile(context, "png");
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Using image processor to save a png to ");
        sb.append(file.getAbsolutePath());
        C0767k.m1801b(str, sb.toString());
        int writePngImage = ipLib.writePngImage(ipImage, file.getAbsolutePath());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result code -> ");
        sb2.append(writePngImage);
        C0767k.m1801b(str2, sb2.toString());
        return file;
    }

    public static File saveIpJPG(Context context, IpLib ipLib, IpImage ipImage) {
        File createTempImageFile = createTempImageFile(context, "jpg");
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Using image processor to save a jpg to ");
        sb.append(createTempImageFile.getAbsolutePath());
        C0767k.m1801b(str, sb.toString());
        int writeJpegImage = ipLib.writeJpegImage(ipImage, 90, createTempImageFile.getAbsolutePath());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result code -> ");
        sb2.append(writeJpegImage);
        C0767k.m1801b(str2, sb2.toString());
        return createTempImageFile;
    }

    public static File saveToGallery(Bitmap bitmap) {
        File file = new File(Environment.getExternalStorageDirectory(), "KofaxMobileCapture");
        file.mkdir();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mmddyy-hhMMss", Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(".png");
        File file2 = new File(file, sb.toString());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2;
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Error saving image to gallery", (Throwable) e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091 A[SYNTHETIC, Splitter:B:29:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ IOException -> 0x0095 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyImageToExternalStorage(java.io.File r10) throws com.kofax.kmc.kut.utilities.error.IOException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r10.getName()
            r0.append(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            r0 = 0
            r1.createNewFile()     // Catch:{ IOException -> 0x0082, all -> 0x007e }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0082, all -> 0x007e }
            r2.<init>(r10)     // Catch:{ IOException -> 0x0082, all -> 0x007e }
            java.nio.channels.FileChannel r10 = r2.getChannel()     // Catch:{ IOException -> 0x0082, all -> 0x007e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            r4 = 0
            long r6 = r10.size()     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            r3 = r10
            r8 = r0
            r3.transferTo(r4, r6, r8)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.String r2 = TAG     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            r3.<init>()     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.String r4 = "copyImageToExternalStorage(), successfully moved image to external storage Path: "
            r3.append(r4)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            r3.append(r1)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            if (r10 == 0) goto L_0x0064
            r10.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0064
        L_0x0062:
            r10 = move-exception
            goto L_0x006a
        L_0x0064:
            if (r0 == 0) goto L_0x0073
            r0.close()     // Catch:{ IOException -> 0x0062 }
            return
        L_0x006a:
            r10.printStackTrace()
            com.kofax.kmc.kut.utilities.error.IOException r0 = new com.kofax.kmc.kut.utilities.error.IOException
            r0.<init>((java.io.IOException) r10)
            throw r0
        L_0x0073:
            return
        L_0x0074:
            r1 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x008f
        L_0x0079:
            r1 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x0085
        L_0x007e:
            r10 = move-exception
            r1 = r10
            r10 = r0
            goto L_0x008f
        L_0x0082:
            r10 = move-exception
            r1 = r10
            r10 = r0
        L_0x0085:
            r1.printStackTrace()     // Catch:{ all -> 0x008e }
            com.kofax.kmc.kut.utilities.error.IOException r2 = new com.kofax.kmc.kut.utilities.error.IOException     // Catch:{ all -> 0x008e }
            r2.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x008e }
            throw r2     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
        L_0x008f:
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            r10 = move-exception
            goto L_0x009d
        L_0x0097:
            if (r10 == 0) goto L_0x00a6
            r10.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x00a6
        L_0x009d:
            r10.printStackTrace()
            com.kofax.kmc.kut.utilities.error.IOException r0 = new com.kofax.kmc.kut.utilities.error.IOException
            r0.<init>((java.io.IOException) r10)
            throw r0
        L_0x00a6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.ImageService.copyImageToExternalStorage(java.io.File):void");
    }

    /* renamed from: com.kofax.kmc.ken.engines.service.ImageService$a */
    static class C0468a {
        /* access modifiers changed from: private */

        /* renamed from: iC */
        public String f550iC;
        /* access modifiers changed from: private */

        /* renamed from: iD */
        public String f551iD;

        private C0468a() {
        }

        /* synthetic */ C0468a(C04671 r1) {
            this();
        }
    }

    /* renamed from: a */
    private static C0468a m411a(ImagePerfectionProfile imagePerfectionProfile, ImageProcessorConfiguration imageProcessorConfiguration, BoundingTetragon boundingTetragon, Image image, boolean z) throws KmcException {
        String str;
        C0468a aVar = new C0468a((C04671) null);
        if (imagePerfectionProfile == null && imageProcessorConfiguration == null) {
            throw new KmcRuntimeException(ErrorInfo.KMC_IP_NO_PROFILE);
        }
        if (imageProcessorConfiguration != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0793c.m1873a(imageProcessorConfiguration, false, z).ippString);
            str = sb.toString();
            if (boundingTetragon != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m421k(boundingTetragon));
                str = sb2.toString();
            }
        } else if (imagePerfectionProfile != null) {
            str = new ImagePerfectionProfile.FriendIPP(BuildConfig.APPLICATION_ID).toFinalOpString();
            if (boundingTetragon != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(m421k(boundingTetragon));
                str = sb3.toString();
            }
        } else {
            str = "";
        }
        if (passBarcodes) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(m422u(image));
            str = sb4.toString();
        }
        String unused = aVar.f550iC = str;
        String unused2 = aVar.f551iD = "";
        return aVar;
    }

    /* renamed from: k */
    private static String m421k(BoundingTetragon boundingTetragon) {
        StringBuilder sb = new StringBuilder("");
        sb.append("_ExternalCornersFront_");
        sb.append(boundingTetragon.getTopLeft().x);
        sb.append(",");
        sb.append(boundingTetragon.getTopLeft().y);
        sb.append(",");
        sb.append(boundingTetragon.getTopRight().x);
        sb.append(",");
        sb.append(boundingTetragon.getTopRight().y);
        sb.append(",");
        sb.append(boundingTetragon.getBottomLeft().x);
        sb.append(",");
        sb.append(boundingTetragon.getBottomLeft().y);
        sb.append(",");
        sb.append(boundingTetragon.getBottomRight().x);
        sb.append(",");
        sb.append(boundingTetragon.getBottomRight().y);
        return sb.toString();
    }

    /* renamed from: u */
    private static String m422u(Image image) {
        StringBuilder sb = new StringBuilder("");
        List<BarCodeResult> imageBarCodes = image.getImageBarCodes();
        if (imageBarCodes != null) {
            for (int i = 0; i < imageBarCodes.size(); i++) {
                BarCodeResult barCodeResult = imageBarCodes.get(i);
                sb.append("_ExternalBarcodeFront_");
                BoundingTetragon boundingBox = barCodeResult.getBoundingBox();
                sb.append(boundingBox.getTopLeft().x);
                sb.append(",");
                sb.append(boundingBox.getTopLeft().y);
                sb.append(",");
                sb.append(boundingBox.getTopRight().x);
                sb.append(",");
                sb.append(boundingBox.getTopRight().y);
                sb.append(",");
                sb.append(boundingBox.getBottomLeft().x);
                sb.append(",");
                sb.append(boundingBox.getBottomLeft().y);
                sb.append(",");
                sb.append(boundingBox.getBottomRight().x);
                sb.append(",");
                sb.append(boundingBox.getBottomRight().y);
                sb.append(",");
                sb.append(barCodeResult.getType());
                sb.append(",");
                sb.append(barCodeResult.getDirection());
                sb.append(",");
                sb.append(BarCodeDataFormat.ASCII);
                sb.append(",");
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void checkDateTimeFormat(String str) {
        try {
            f541iu.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(str);
        } catch (ParseException unused) {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_ISO_DATE_TIME_FORMAT);
        }
    }

    public static String getTimeStringFromExif(Image image, String str) {
        String str2;
        String imageMetaData = image.getImageMetaData();
        if (isImageProcessingMetadata(imageMetaData)) {
            return null;
        }
        int length = str.length();
        String[] split = imageMetaData.split("\n");
        int length2 = split.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length2) {
                str2 = null;
                break;
            }
            String str3 = split[i];
            if (str3.contains(str)) {
                String str4 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Found timeTag: ");
                sb.append(str3);
                C0767k.m1807c(str4, sb.toString());
                str2 = str3.substring(length);
                break;
            }
            i++;
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        return str2;
    }

    /* renamed from: j */
    private static String m420j(String str) {
        if (!str.contains(f542iv)) {
            return null;
        }
        return "UTC";
    }

    public static boolean isImageProcessingMetadata(String str) {
        return str.startsWith("{");
    }

    public static String exifTimeFromDate(Date date, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EXIF_TIME_FORMAT, Locale.US);
        if (true ^ (str == null || str.length() == 0)) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
        }
        return simpleDateFormat.format(date);
    }

    public static String UTCStringFromDate(Date date) {
        onTransferOutClick ontransferoutclick = f541iu.read;
        Calendar instance = Calendar.getInstance(ontransferoutclick.MediaBrowserCompat$CustomActionResultReceiver, ontransferoutclick.MediaBrowserCompat$ItemReceiver);
        instance.setTime(date);
        return ((StringBuilder) ontransferoutclick.write(instance, new StringBuilder(ontransferoutclick.read))).toString();
    }

    public static ErrorInfo verifyRestrictions(Image image, Image.FileRestriction fileRestriction) {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        if (Image.FileRestriction.ANSI_X9 != fileRestriction) {
            return errorInfo;
        }
        if (image.getImageMimeType() != Image.ImageMimeType.MIMETYPE_TIFF) {
            return ErrorInfo.KMC_ED_FILE_RESTRICTION_MIMETYPE;
        }
        if (image.getImageOutputColor() != Image.OutputColor.BITDEPTH_BITONAL) {
            return ErrorInfo.KMC_ED_FILE_RESTRICTION_BITDEPTH;
        }
        return (image.getImageDPI().intValue() == 200 || image.getImageDPI().intValue() == 240) ? errorInfo : ErrorInfo.KMC_ED_FILE_RESTRICTION_DPI;
    }

    public static String createMetadataFromImage(Image image, Image.FileRestriction fileRestriction) throws KmcException {
        StringBuilder sb = new StringBuilder();
        if (Image.FileRestriction.ANSI_X9 == fileRestriction) {
            sb.append(KExifTagDateTimeDigitized);
            sb.append(exifTimeFromDate(UTCStringToDate(image.getImageCreateDateTime()), "UTC"));
            sb.append(System.getProperty("line.separator"));
            return sb.toString();
        }
        if (!(image.getImageLatitude() == null || image.getImageLongitude() == null)) {
            sb.append(createGPSMetadata(image));
        }
        if (image.getTargetFrame() != null) {
            sb.append(createTargetFrameMetadata(image));
        }
        sb.append(KExifTagDateTimeOriginal);
        Image.FriendI friendI = new Image.FriendI(BuildConfig.APPLICATION_ID);
        sb.append(friendI.getImageOriginalDateTime());
        sb.append(System.getProperty("line.separator"));
        sb.append(KExifTagDateTime);
        sb.append(friendI.getImageOriginalDateTime());
        sb.append(System.getProperty("line.separator"));
        sb.append(KExifTagDateTimeDigitized);
        sb.append(exifTimeFromDate(UTCStringToDate(image.getImageCreateDateTime()), "UTC"));
        sb.append(System.getProperty("line.separator"));
        sb.append(f542iv);
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

    public static String getCornersJsonFromMetaData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\\"Corners\\\"[\\s]*:[\\s]*\\{[^\\{\\}]*\\}", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        Matcher matcher2 = Pattern.compile("\\{[^\\{\\}]*\\}").matcher(matcher.group());
        if (matcher2.find()) {
            return matcher2.group();
        }
        return null;
    }

    public static BoundingTetragon getCornersTetragonFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new BoundingTetragon((int) jSONObject.getDouble("TLx"), (int) jSONObject.getDouble("TLy"), (int) jSONObject.getDouble("TRx"), (int) jSONObject.getDouble("TRy"), (int) jSONObject.getDouble("BLx"), (int) jSONObject.getDouble("BLy"), (int) jSONObject.getDouble("BRx"), (int) jSONObject.getDouble("BRy"));
        } catch (JSONException e) {
            C0767k.m1823e(e);
            return null;
        }
    }

    public static Date UTCStringToDate(String str) {
        if (!(true ^ (str == null || str.length() == 0))) {
            return null;
        }
        try {
            return f541iu.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(str);
        } catch (ParseException e) {
            throw new InternalError(e.getMessage());
        }
    }

    public static Date exifTimeToDate(String str, String str2) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EXIF_TIME_FORMAT, Locale.US);
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str2));
            }
            try {
                return simpleDateFormat.parse(str);
            } catch (ParseException e) {
                C0767k.m1820e(TAG, e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: g */
    private static boolean m417g(String str) {
        return ModifyQuickTopUpReviewActivity.read((CharSequence) str, (CharSequence) ".png");
    }

    /* renamed from: h */
    private static boolean m418h(String str) {
        return ModifyQuickTopUpReviewActivity.read((CharSequence) str, (CharSequence) ".tif") || ModifyQuickTopUpReviewActivity.read((CharSequence) str, (CharSequence) ".tiff");
    }

    /* renamed from: i */
    private static boolean m419i(String str) {
        return ModifyQuickTopUpReviewActivity.read((CharSequence) str, (CharSequence) ".jpg") || ModifyQuickTopUpReviewActivity.read((CharSequence) str, (CharSequence) ".jpeg");
    }
}
