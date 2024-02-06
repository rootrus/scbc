package com.kofax.mobile.sdk.p009ae;

import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.processing.ColorDepth;
import com.kofax.kmc.ken.engines.processing.CropType;
import com.kofax.kmc.ken.engines.processing.DeskewType;
import com.kofax.kmc.ken.engines.processing.DocumentDimensions;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.ken.engines.processing.RotateType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.kofax.mobile.sdk.ae.c */
public class C0793c {
    private static final String DO_90_DEGREE_ROTATION = "_Do90DegreeRotation_";
    private static final String DO_BINARIZATION = "_DoBinarization_";
    private static final String DO_CROP_CORRECTION = "_DoCropCorrection_";
    private static final String DO_ENHANCED_BINARIZATION = "_DoEnhancedBinarization_";
    private static final String DO_GRAY_OUTPUT = "_DoGrayOutput_";
    private static final String DO_SCALE_IMAGE_TO_DPI = "_DoScaleImageToDPI_";
    private static final String DO_SKEW_CORRECTION_ALT = "_DoSkewCorrectionAlt_";
    private static final String DO_SKEW_CORRECTION_PAGE = "_DoSkewCorrectionPage_";

    /* renamed from: TU */
    private static final String f1899TU = "_DeviceType_0";

    /* renamed from: TV */
    private static final String f1900TV = "_DoNoPageDetection_";

    /* renamed from: TW */
    private static final String f1901TW = "[CROP_AUTO]";

    /* renamed from: cm */
    private static final String f1902cm = "_DoScaleBWImageToDPI_";

    /* renamed from: cn */
    private static final String f1903cn = "_DoScaleCGImageToDPI_";

    /* renamed from: co */
    private static final String f1904co = "_DocDimLarge_";

    /* renamed from: cp */
    private static final String f1905cp = "_DocDimSmall_";

    /* renamed from: cr */
    private static final int f1906cr = 300;

    /* renamed from: a */
    public static C0792a m1872a(ImageProcessorConfiguration imageProcessorConfiguration) {
        return m1873a(imageProcessorConfiguration, false, false);
    }

    /* renamed from: a */
    public static C0792a m1873a(ImageProcessorConfiguration imageProcessorConfiguration, boolean z, boolean z2) {
        boolean z3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(imageProcessorConfiguration.ippString);
        int i = C07941.f1907TX[imageProcessorConfiguration.rotateType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            sb.append(String.format(Locale.US, "%s%d", new Object[]{"_Do90DegreeRotation_", Integer.valueOf(imageProcessorConfiguration.rotateType.type)}));
        }
        int i2 = C07941.f1908TY[imageProcessorConfiguration.deskewType.ordinal()];
        if (i2 == 1) {
            sb.append("_DoSkewCorrectionPage_");
        } else if (i2 == 2) {
            sb.append("_DoSkewCorrectionAlt_");
        }
        if (imageProcessorConfiguration.cropType == CropType.CROP_AUTO) {
            if (z) {
                sb.append("_DoCropCorrection_");
            } else {
                sb.append(f1900TV);
                sb2.append(f1901TW);
            }
        }
        if (imageProcessorConfiguration.outputDPI == null || imageProcessorConfiguration.outputDPI.intValue() <= 0) {
            z3 = false;
        } else {
            z3 = imageProcessorConfiguration.outputDPI.intValue() >= f1906cr;
            sb.append(String.format(Locale.US, "%s%d", new Object[]{f1902cm, imageProcessorConfiguration.outputDPI}));
            sb.append(String.format(Locale.US, "%s%d", new Object[]{f1903cn, imageProcessorConfiguration.outputDPI}));
        }
        int i3 = C07941.f1909TZ[imageProcessorConfiguration.outputColorDepth.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                sb.append("_DoGrayOutput_");
            }
        } else if (z3) {
            sb.append("_DoEnhancedBinarization_");
        } else {
            sb.append("_DoBinarization_");
        }
        DocumentDimensions documentDimensions = imageProcessorConfiguration.documentDimensions;
        if (documentDimensions != null) {
            if (documentDimensions.getShortEdge() != null && documentDimensions.getShortEdge().floatValue() > BitmapDescriptorFactory.HUE_RED) {
                sb.append(String.format(Locale.US, "%s%f", new Object[]{f1905cp, documentDimensions.getShortEdge()}));
            }
            if (documentDimensions.getLongEdge() != null && documentDimensions.getLongEdge().floatValue() > BitmapDescriptorFactory.HUE_RED) {
                sb.append(String.format(Locale.US, "%s%f", new Object[]{f1904co, documentDimensions.getLongEdge()}));
            }
        }
        if (z2) {
            sb.append(f1899TU);
        }
        C0792a aVar = new C0792a();
        aVar.ippString = sb.toString();
        if (TextUtils.isEmpty(aVar.ippString)) {
            aVar.ippString = f1900TV;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.toString());
        sb3.append(aVar.ippString);
        aVar.f1898TP = sb3.toString();
        return aVar;
    }

    /* renamed from: com.kofax.mobile.sdk.ae.c$1 */
    static /* synthetic */ class C07941 {

        /* renamed from: TX */
        static final /* synthetic */ int[] f1907TX;

        /* renamed from: TY */
        static final /* synthetic */ int[] f1908TY;

        /* renamed from: TZ */
        static final /* synthetic */ int[] f1909TZ;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
                com.kofax.kmc.ken.engines.processing.ColorDepth[] r0 = com.kofax.kmc.ken.engines.processing.ColorDepth.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1909TZ = r0
                r1 = 1
                com.kofax.kmc.ken.engines.processing.ColorDepth r2 = com.kofax.kmc.ken.engines.processing.ColorDepth.BITONAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1909TZ     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.processing.ColorDepth r3 = com.kofax.kmc.ken.engines.processing.ColorDepth.GRAYSCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1909TZ     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.processing.ColorDepth r4 = com.kofax.kmc.ken.engines.processing.ColorDepth.COLOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.kofax.kmc.ken.engines.processing.DeskewType[] r3 = com.kofax.kmc.ken.engines.processing.DeskewType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f1908TY = r3
                com.kofax.kmc.ken.engines.processing.DeskewType r4 = com.kofax.kmc.ken.engines.processing.DeskewType.DESKEW_BY_DOCUMENT_EDGES     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f1908TY     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.kofax.kmc.ken.engines.processing.DeskewType r4 = com.kofax.kmc.ken.engines.processing.DeskewType.DESKEW_BY_DOCUMENT_CONTENT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.kofax.kmc.ken.engines.processing.RotateType[] r3 = com.kofax.kmc.ken.engines.processing.RotateType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f1907TX = r3
                com.kofax.kmc.ken.engines.processing.RotateType r4 = com.kofax.kmc.ken.engines.processing.RotateType.ROTATE_90     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f1907TX     // Catch:{ NoSuchFieldError -> 0x005e }
                com.kofax.kmc.ken.engines.processing.RotateType r3 = com.kofax.kmc.ken.engines.processing.RotateType.ROTATE_180     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f1907TX     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.kofax.kmc.ken.engines.processing.RotateType r1 = com.kofax.kmc.ken.engines.processing.RotateType.ROTATE_270     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f1907TX     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.kofax.kmc.ken.engines.processing.RotateType r1 = com.kofax.kmc.ken.engines.processing.RotateType.ROTATE_AUTO     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f1907TX     // Catch:{ NoSuchFieldError -> 0x007e }
                com.kofax.kmc.ken.engines.processing.RotateType r1 = com.kofax.kmc.ken.engines.processing.RotateType.ROTATE_NONE     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p009ae.C0793c.C07941.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m1874a(ImageProcessorConfiguration imageProcessorConfiguration, String str) throws KmcException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m1880g(imageProcessorConfiguration, m1879f(imageProcessorConfiguration, m1878e(imageProcessorConfiguration, m1877d(imageProcessorConfiguration, m1876c(imageProcessorConfiguration, m1875b(imageProcessorConfiguration, str))))));
    }

    /* renamed from: b */
    private static String m1875b(ImageProcessorConfiguration imageProcessorConfiguration, String str) {
        if (m1871I("_DoCropCorrection_", str).find()) {
            imageProcessorConfiguration.cropType = CropType.CROP_AUTO;
        }
        return m1870D("_DoCropCorrection_", str);
    }

    /* renamed from: c */
    private static String m1876c(ImageProcessorConfiguration imageProcessorConfiguration, String str) {
        Matcher I = m1871I("(_DoBinarization_|_DoEnhancedBinarization_|_DoGrayOutput_)", str);
        if (I.find()) {
            if (I.group().equalsIgnoreCase("_DoGrayOutput_")) {
                imageProcessorConfiguration.outputColorDepth = ColorDepth.GRAYSCALE;
            } else {
                imageProcessorConfiguration.outputColorDepth = ColorDepth.BITONAL;
            }
        }
        return m1870D("(_DoBinarization_|_DoEnhancedBinarization_|_DoGrayOutput_)", str);
    }

    /* renamed from: d */
    private static String m1877d(ImageProcessorConfiguration imageProcessorConfiguration, String str) {
        Matcher I = m1871I("(_DoSkewCorrectionPage_|_DoSkewCorrectionAlt_)", str);
        if (I.find()) {
            if (I.group().equalsIgnoreCase("_DoSkewCorrectionPage_")) {
                imageProcessorConfiguration.deskewType = DeskewType.DESKEW_BY_DOCUMENT_EDGES;
            } else {
                imageProcessorConfiguration.deskewType = DeskewType.DESKEW_BY_DOCUMENT_CONTENT;
            }
        }
        return m1870D("(_DoSkewCorrectionPage_|_DoSkewCorrectionAlt_)", str);
    }

    /* renamed from: e */
    private static String m1878e(ImageProcessorConfiguration imageProcessorConfiguration, String str) throws KmcException {
        try {
            Matcher I = m1871I("(_DoScaleBWImageToDPI_|_DoScaleCGImageToDPI_|_DoScaleImageToDPI_)(\\d*)", str);
            if (I.find()) {
                imageProcessorConfiguration.outputDPI = Integer.valueOf(I.group(2));
            }
            return m1870D("(_DoScaleBWImageToDPI_|_DoScaleCGImageToDPI_|_DoScaleImageToDPI_)(\\d*)", str);
        } catch (NumberFormatException unused) {
            throw new KmcException(ErrorInfo.KMC_EV_OP_STRING_ERROR);
        }
    }

    /* renamed from: f */
    private static String m1879f(ImageProcessorConfiguration imageProcessorConfiguration, String str) throws KmcException {
        Matcher I = m1871I("(_Do90DegreeRotation_)([01234])", str);
        try {
            if (I.find()) {
                int intValue = Integer.valueOf(I.group(2)).intValue();
                if (intValue == 0) {
                    imageProcessorConfiguration.rotateType = RotateType.ROTATE_NONE;
                } else if (intValue == 1) {
                    imageProcessorConfiguration.rotateType = RotateType.ROTATE_270;
                } else if (intValue == 2) {
                    imageProcessorConfiguration.rotateType = RotateType.ROTATE_180;
                } else if (intValue == 3) {
                    imageProcessorConfiguration.rotateType = RotateType.ROTATE_90;
                } else if (intValue == 4) {
                    imageProcessorConfiguration.rotateType = RotateType.ROTATE_AUTO;
                }
            }
            return m1870D("(_Do90DegreeRotation_)([01234])", str);
        } catch (NumberFormatException unused) {
            throw new KmcException(ErrorInfo.KMC_EV_OP_STRING_ERROR);
        }
    }

    /* renamed from: g */
    private static String m1880g(ImageProcessorConfiguration imageProcessorConfiguration, String str) throws KmcException {
        Matcher I = m1871I("_DocDimSmall_([\\d\\.]*)", str);
        Matcher I2 = m1871I("_DocDimLarge_([\\d\\.]*)", str);
        try {
            Float f = null;
            Float valueOf = I.find() ? Float.valueOf(I.group(1)) : null;
            String D = m1870D("_DocDimSmall_([\\d\\.]*)", str);
            if (I2.find()) {
                f = Float.valueOf(I2.group(1));
            }
            if (!(valueOf == null && f == null)) {
                imageProcessorConfiguration.documentDimensions = new DocumentDimensions(valueOf, f);
            }
            return m1870D("_DocDimLarge_([\\d\\.]*)", D);
        } catch (NumberFormatException unused) {
            throw new KmcException(ErrorInfo.KMC_EV_OP_STRING_ERROR);
        }
    }

    /* renamed from: D */
    private static String m1870D(String str, String str2) {
        Matcher matcher = Pattern.compile(str, 2).matcher(str2);
        StringBuffer stringBuffer = new StringBuffer(str2.length());
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, (matcher.end() >= str2.length() || str2.charAt(matcher.end()) == '_') ? "" : "_");
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: I */
    private static Matcher m1871I(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(?!.*");
        sb.append(str);
        sb.append(")");
        return Pattern.compile(sb.toString(), 2).matcher(str2);
    }
}
