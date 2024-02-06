package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import com.kofax.android.abc.xvrs.Detection.XVrsMultiDetector;
import com.kofax.android.abc.xvrs.XVrsDocument;
import com.kofax.android.abc.xvrs.XVrsDocumentBoundary;
import com.kofax.android.abc.xvrs.XVrsDocumentLandmark;
import com.kofax.android.abc.xvrs.XVrsImage;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.i */
public class C0672i {

    /* renamed from: HB */
    private static final String f1598HB = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Configuration name=\"Sample Multi-Detector Configuration\">\n   <Section name=\"MultiDetection\">\n      <Parm name=\"DetectorType\" type=\"string\" value=\"MultiDetector\" />\n      <Parm name=\"Mode\" type=\"string\" value=\"Still\" />\n      <Parm name=\"ConcurrentThreadsCount\" type=\"int\" value=\"%1$d\" />\n      <List name=\"DetectorConfigurations\">\n         <Parm type=\"string\" value=\"MrzConfig\" />\n         <Parm type=\"string\" value=\"MRFDetector\" />\n      </List>\n   </Section>\n\n   <Section name=\"MrzConfig\">\n      <Parm name=\"DetectorType\" type=\"string\" value=\"MrzDetector\" />\n      <Parm name=\"IsHorizontalOnly\" type=\"bool\" value=\"no\" />\n      <Parm name=\"UseFixedAspectRatio\" type=\"bool\" value=\"no\" />\n      <Parm name=\"VideoMode\" type=\"bool\" value=\"no\" />\n      %3$s      <Parm name=\"MaxSideSize\" type=\"int\" value=\"1920\" />\n      <List name=\"MRZLines\">\n         <Parm type=\"int\" value=\"3\" />\n         <Parm type=\"int\" value=\"2\" />\n         <Parm type=\"int\" value=\"2\" />\n      </List>\n      <List name=\"MRZCharacters\">\n         <Parm type=\"int\" value=\"30\" />\n         <Parm type=\"int\" value=\"44\" />\n         <Parm type=\"int\" value=\"36\" />\n      </List>\n      <Parm name=\"ROIExtensionMargin\" type=\"float\" value=\"1.0\" />\n      <Parm name=\"MinAspectRatio\" type=\"float\" value=\"0.3\" />\n      <Parm name=\"CharacterHeight\" type=\"float\" value=\"0.11\" />\n      <Parm name=\"ContrastThreshold\" type=\"int\" value=\"20\" />\n      <Parm name=\"MaxAngleError\" type=\"float\" value=\"7.0\" />\n      <Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.55\" />\n      <Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.55\" />\n   </Section>\n\n   <Section name=\"MRFDetector\">\n      <Parm name=\"DetectorType\" type=\"string\" value=\"MRFDetector\" />\n      <Parm name=\"UseRandomFieldsOnly\" type=\"bool\" value=\"no\" />\n      <Parm name=\"UsePageSegmentationOnly\" type=\"bool\" value=\"no\" />\n      <Parm name=\"UseCombined\" type=\"bool\" value=\"yes\" />\n      <Parm name=\"ExternalAreaConfidenceThreshold\" type=\"float\" value=\"0.75\" />\n      <Parm name=\"MiddleAreaConfidenceThreshold\" type=\"float\" value=\"0.95\" />\n      <Parm name=\"InternalAreaConfidenceThreshold\" type=\"float\" value=\"0.97\" />\n      <Parm name=\"MinimumEdgeConfidenceThreshold\" type=\"float\" value=\"0.625\" />\n      <Section name=\"RandomFields\">\n         <Parm name=\"MobileImage\" type=\"bool\" value=\"no\" />\n         <Parm name=\"ScannerImage\" type=\"bool\" value=\"no\" />\n         <Parm name=\"UnknownImage\" type=\"bool\" value=\"yes\" />\n         <Parm name=\"IterCount\" type=\"int\" value=\"7\" />\n         <Parm name=\"RelativeAspectRatioError\" type=\"float\" value=\"0.05\" />\n         <Parm name=\"DownScaleSize\" type=\"int\" value=\"120000\" />\n         <Parm name=\"ReturnScaledImage\" type=\"bool\" value=\"no\" />\n         <Parm name=\"Mode\" type=\"int\" value=\"0\" />\n         <Parm name=\"Beta\" type=\"float\" value=\"0.025\" />\n         <Parm name=\"BackgroundMargin\" type=\"int\" value=\"8\" />\n         <Parm name=\"ForgoundSizeRatio\" type=\"float\" value=\"0.2\" />\n         <Parm name=\"NumFgdGaussians\" type=\"int\" value=\"2\" />\n         <Parm name=\"NumBgdGaussians\" type=\"int\" value=\"4\" />\n         <Parm name=\"EnergyThreshold\" type=\"float\" value=\"0.05\" />\n         <Parm name=\"NumItersGaussian\" type=\"int\" value=\"7\" />\n         <Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.0001\" />\n         <Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"0.05\" />\n         <Parm name=\"CornerDetection\" type=\"bool\" value=\"yes\" />\n         <Parm name=\"CropImage\" type=\"bool\" value=\"yes\" />\n         <Parm name=\"UseMultiCores\" type=\"bool\" value=\"no\" />\n         <Parm name=\"RandomInit\" type=\"bool\" value=\"no\" />\n         <Parm name=\"SamplingMode\" type=\"int\" value=\"1\" />\n         %2$s      </Section>\n      <Section name=\"PageSegmentation\">\n         <Parm name=\"MobileImage\" type=\"bool\" value=\"no\" />\n         <Parm name=\"ScannerImage\" type=\"bool\" value=\"no\" />\n         <Parm name=\"UnknownImage\" type=\"bool\" value=\"yes\" />\n         <Parm name=\"Mode\" type=\"int\" value=\"0\" />\n         <Parm name=\"SpeedMode\" type=\"int\" value=\"4\" />\n         <Parm name=\"RelativeAspectRatioError\" type=\"float\" value=\"0.1\" />\n         <Parm name=\"ReturnScaledImage\" type=\"bool\" value=\"no\" />\n         <Parm name=\"DownscaleSizeLow\" type=\"int\" value=\"240000\" />\n         <Parm name=\"DownscaleSizeHigh\" type=\"int\" value=\"1254528\" />\n         <Parm name=\"MiniLengthThreshold\" type=\"float\" value=\"0.1\" />\n         <Parm name=\"MaxAngleDeviation\" type=\"int\" value=\"15\" />\n         <Parm name=\"BinThreshold\" type=\"float\" value=\"0.05\" />\n         <Parm name=\"LineGroupThreshold\" type=\"float\" value=\"1.5\" />\n         <Parm name=\"CropImage\" type=\"bool\" value=\"yes\" />\n         <Parm name=\"UseMultiCores\" type=\"bool\" value=\"no\" />\n         <Parm name=\"UseAngleInRanking\" type=\"bool\" value=\"yes\" />\n         <Parm name=\"UseCorridor\" type=\"bool\" value=\"no\" />\n         <Parm name=\"CorridorMargin\" type=\"float\" value=\"0.10\" />\n         <Parm name=\"CorridorMaxAngleDeviation\" type=\"float\" value=\"0.75\" />\n         %2$s         <List name=\"CorridorFourCornersXs\">\n            <Parm type=\"float\" value=\"0.0\" />\n            <Parm type=\"float\" value=\"0.0\" />\n            <Parm type=\"float\" value=\"0.0\" />\n            <Parm type=\"float\" value=\"0.0\" />\n         </List>\n         <List name=\"CorridorFourCornersYs\">\n            <Parm type=\"float\" value=\"0.0\" />\n            <Parm type=\"float\" value=\"0.0\" />\n            <Parm type=\"float\" value=\"0.0\" />\n            <Parm type=\"float\" value=\"0.0\" />\n         </List>\n      </Section>\n   </Section>\n</Configuration>";

    /* renamed from: HD */
    public static final String f1599HD = "MrzDetector";

    /* renamed from: HE */
    private final XVrsMultiDetector f1600HE = new XVrsMultiDetector();

    /* renamed from: HF */
    private long f1601HF = -1023;

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
        System.loadLibrary("XVrs");
    }

    @HmlPinActivity
    public C0672i() {
        checkLicense();
    }

    private void checkLicense() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING) && !Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
        }
    }

    /* renamed from: a */
    public C0673j mo11604a(C0674k kVar, String str) {
        return m1462a(kVar, new XVrsImage(str));
    }

    /* renamed from: a */
    public C0673j mo11603a(C0674k kVar, Bitmap bitmap) {
        XVrsImage xVrsImage = new XVrsImage(bitmap);
        if (xVrsImage.getPtr() != this.f1601HF) {
            return m1462a(kVar, xVrsImage);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_EV_UNSUPPORTED_BITMAP_FORMAT);
    }

    /* renamed from: a */
    public C0673j mo11605a(C0674k kVar, byte[] bArr, int i, int i2) {
        return m1462a(kVar, new XVrsImage(bArr, i, i2));
    }

    /* renamed from: a */
    private C0673j m1462a(C0674k kVar, XVrsImage xVrsImage) {
        m1464a(kVar);
        this.f1600HE.process(xVrsImage);
        XVrsDocument document = this.f1600HE.getDocument();
        XVrsImage processedImage = this.f1600HE.getProcessedImage();
        Bitmap bitmap = processedImage.toBitmap();
        XVrsDocumentBoundary Boundary = document.Boundary();
        XVrsDocumentLandmark Landmark = document.Landmark();
        String DetectorName = document.DetectorName();
        processedImage.dispose();
        xVrsImage.dispose();
        return m1461a(bitmap, Boundary, Landmark, DetectorName);
    }

    /* renamed from: a */
    private void m1464a(C0674k kVar) {
        if (!TextUtils.isEmpty(kVar.advancedConfiguration)) {
            this.f1600HE.loadConfigurationString(kVar.advancedConfiguration, "MultiDetection");
        } else {
            this.f1600HE.loadConfigurationString(String.format(Locale.US, f1598HB, new Object[]{Integer.valueOf(Runtime.getRuntime().availableProcessors()), m1465r(kVar.f1605HJ), m1463a(kVar.f1606HK)}), "MultiDetection");
        }
        this.f1600HE.reset();
    }

    /* renamed from: a */
    private C0673j m1461a(Bitmap bitmap, XVrsDocumentBoundary xVrsDocumentBoundary, XVrsDocumentLandmark xVrsDocumentLandmark, String str) {
        ArrayList arrayList;
        Vector<Point> Corners = xVrsDocumentBoundary.Corners();
        if (Corners == null || Corners.size() != 4) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(Corners);
        }
        return new C0673j(bitmap, arrayList, str.equals(f1599HD) && xVrsDocumentLandmark.getLandmark() == XVrsDocumentLandmark.LandmarkType.MRZ);
    }

    public void doCleanUp() {
        this.f1600HE.dispose();
    }

    /* renamed from: r */
    private static String m1465r(List<Float> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && !list.isEmpty()) {
            sb.append("<List name=\"AspectRatios\">\n");
            for (Float next : list) {
                if (next == null) {
                    next = Float.valueOf(-1.0f);
                }
                sb.append(String.format(Locale.US, "<Parm type=\"float\" value=\"%.5f\" />\n", new Object[]{next}));
            }
            sb.append("</List>\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m1463a(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return "";
        }
        return String.format(Locale.US, "<Parm name=\"DesiredDPI\" type=\"int\" value=\"%d\" />\n", new Object[]{num});
    }
}
