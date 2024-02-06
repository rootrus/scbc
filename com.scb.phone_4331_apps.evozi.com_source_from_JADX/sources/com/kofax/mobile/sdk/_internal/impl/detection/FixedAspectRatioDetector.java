package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.android.abc.xvrs.Detection.XVrsFARDetector;
import com.kofax.android.abc.xvrs.XVrsDocumentBoundary;
import com.kofax.android.abc.xvrs.XVrsImage;
import com.kofax.kmc.ken.engines.data.FixedAspectRatioDetectionSettings;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.impl.detection.data.FixedAspectRatioDetectionResult;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import p040o.HmlPinActivity;

public class FixedAspectRatioDetector {

    /* renamed from: HB */
    private static final String f3682HB = "<?xml version=\"1.0\" encoding=\"utf-8\"?><Configuration name=\"Sample FARDetector Configuration\"><Section name=\"FARDetection\"><Parm name=\"DetectorType\" type=\"string\" value=\"FARDetector\" /><Parm name=\"InnerSlopPercent\" type=\"float\" value=\"0.03\" /><Parm name=\"OuterSlopPercent\" type=\"float\" value=\"0.02\" /><Parm name=\"MinSlop\" type=\"int\" value=\"16\" /><Parm name=\"ScaleFactor\" type=\"float\" value=\"0.5\" /><Parm name=\"LowImageSideLimit\" type=\"int\" value=\"400\" /><Parm name=\"ConcurrentThreadsCount\" type=\"int\" value=\"%d\" /><Parm name=\"TargetFrameX\" type=\"float\" value=\"%f\" /><Parm name=\"TargetFrameY\" type=\"float\" value=\"%f\" /><Parm name=\"TargetFrameW\" type=\"float\" value=\"%f\" /><Parm name=\"TargetFrameH\" type=\"float\" value=\"%f\" /></Section></Configuration>";

    /* renamed from: HA */
    private Rect f3683HA = new Rect();

    /* renamed from: Hz */
    private final XVrsFARDetector f3684Hz = new XVrsFARDetector();

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
        System.loadLibrary("XVrs");
    }

    @HmlPinActivity
    public FixedAspectRatioDetector() {
        checkLicense();
    }

    private void checkLicense() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING) && !Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
        }
    }

    public FixedAspectRatioDetectionResult detect(FixedAspectRatioDetectionSettings fixedAspectRatioDetectionSettings, Bitmap bitmap) {
        return m3905a(fixedAspectRatioDetectionSettings, new XVrsImage(bitmap), (Frame) new C0668a(bitmap));
    }

    public FixedAspectRatioDetectionResult detect(FixedAspectRatioDetectionSettings fixedAspectRatioDetectionSettings, byte[] bArr, int i, int i2) {
        return m3905a(fixedAspectRatioDetectionSettings, new XVrsImage(bArr, i, i2), (Frame) new C7943b(bArr, 17, i, i2));
    }

    /* renamed from: a */
    private FixedAspectRatioDetectionResult m3905a(FixedAspectRatioDetectionSettings fixedAspectRatioDetectionSettings, XVrsImage xVrsImage, Frame frame) {
        Rect createTargetRect = RectUtil.createTargetRect(fixedAspectRatioDetectionSettings.getTargetFramePaddingPercent(), fixedAspectRatioDetectionSettings.getTargetFrameAspectRatio(), fixedAspectRatioDetectionSettings.getCenterPoint(), xVrsImage.width(), xVrsImage.height());
        m3907d(createTargetRect);
        this.f3684Hz.process(xVrsImage);
        XVrsDocumentBoundary Boundary = this.f3684Hz.getDocument().Boundary();
        xVrsImage.dispose();
        return m3906a(frame, Boundary, createTargetRect);
    }

    /* renamed from: d */
    private void m3907d(Rect rect) {
        if (!rect.equals(this.f3683HA)) {
            this.f3683HA = rect;
            m3908e(rect);
        }
    }

    /* renamed from: e */
    private void m3908e(Rect rect) {
        this.f3684Hz.loadConfigurationString(String.format(Locale.US, f3682HB, new Object[]{Integer.valueOf(Runtime.getRuntime().availableProcessors()), Float.valueOf((float) rect.left), Float.valueOf((float) rect.top), Float.valueOf((float) (rect.right - rect.left)), Float.valueOf((float) (rect.bottom - rect.top))}), "FARDetection");
        this.f3684Hz.reset();
    }

    public void doCleanUp() {
        this.f3684Hz.dispose();
    }

    /* renamed from: a */
    private C7947g m3906a(Frame frame, XVrsDocumentBoundary xVrsDocumentBoundary, Rect rect) {
        ArrayList arrayList;
        boolean[] zArr = new boolean[4];
        float[] Confidences = xVrsDocumentBoundary.Confidences();
        if (Confidences != null && Confidences.length == 4) {
            boolean z = true;
            zArr[0] = ((double) Confidences[3]) == 1.0d;
            zArr[1] = ((double) Confidences[0]) == 1.0d;
            zArr[2] = ((double) Confidences[1]) == 1.0d;
            if (((double) Confidences[2]) != 1.0d) {
                z = false;
            }
            zArr[3] = z;
        }
        Vector<Point> Corners = xVrsDocumentBoundary.Corners();
        if (Corners == null || Corners.size() != 4) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(Corners);
        }
        return new C7947g(rect, arrayList, frame, zArr);
    }
}
