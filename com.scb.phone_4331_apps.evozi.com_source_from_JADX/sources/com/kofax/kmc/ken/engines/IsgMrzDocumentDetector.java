package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.kofax.android.abc.machine_vision.DetectedDocumentBoundary;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p026o.C0984d;
import java.util.Vector;

public class IsgMrzDocumentDetector implements IMrzDocumentDetector {
    private static final String TAG = IsgMrzDocumentDetector.class.getSimpleName();

    /* renamed from: bK */
    private final DocumentTracker f3334bK = new DocumentTracker();

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    public void destroy() {
        this.f3334bK.dispose();
    }

    public BoundingTetragon detect(Bitmap bitmap) {
        synchronized (this.f3334bK) {
            m3726s();
            try {
                new C0984d(bitmap).mo12394a(this.f3334bK);
                this.f3334bK.processFrame();
            } catch (Exception e) {
                try {
                    C0767k.m1821e(TAG, " Exception while native tracker processing", (Throwable) e);
                } catch (Throwable th) {
                    this.f3334bK.releaseFrame();
                    throw th;
                }
            }
            this.f3334bK.releaseFrame();
            Vector<TrackedDocument> Documents = this.f3334bK.Documents();
            if (Documents.size() <= 0) {
                C0767k.m1801b(TAG, "docs.size() < 1, returning null detection");
                return null;
            }
            TrackedDocument trackedDocument = Documents.get(0);
            if (trackedDocument.Boundary().BoundaryType() != DetectedDocumentBoundary.DetectedBoundaryType.WHOLE_OBJECT) {
                return null;
            }
            Vector<Point> Corners = trackedDocument.Boundary().Corners();
            BoundingTetragon boundingTetragon = new BoundingTetragon();
            boundingTetragon.setTopLeft(Corners.get(0));
            boundingTetragon.setTopRight(Corners.get(1));
            boundingTetragon.setBottomLeft(Corners.get(3));
            boundingTetragon.setBottomRight(Corners.get(2));
            return boundingTetragon;
        }
    }

    /* renamed from: s */
    private void m3726s() {
        this.f3334bK.initializeString("<?xml version=\"1.0\" encoding=\"utf-8\"?><Configuration name=\"XXXX\"><Section name=\"DocumentTracker\"><Parm name=\"DetectorConfig\" type=\"string\" value=\"MrzCorridorConfig\" /><Parm name=\"FrameHistorySize\" type=\"int\" value=\"20\" /><Parm name=\"MaxTrackedDocuments\" type=\"int\" value=\"1\" /><Parm name=\"IsUseReferenceFeature\" type=\"bool\" value=\"yes\" /></Section><Section name=\"MrzCorridorConfig\"><Parm name=\"DetectorType\" type=\"string\" value=\"MrzCorridorDetector\" /><Parm name=\"CorridorConfig\" type=\"string\" value=\"CorridorConfig\" /><Parm name=\"MrzConfig\" type=\"string\" value=\"MrzConfig\" /><Parm name=\"UseMrzDetector\" type=\"bool\" value=\"yes\" /><Parm name=\"MarginRatio\" type=\"float\" value=\"0.08\" /></Section><Section name=\"CorridorConfig\"><Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.60\" /><Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.60\" /><Parm name=\"TotalSegmentSupportRatio\" type=\"float\" value=\"2.4\" /><Parm name=\"ContrastThreshold\" type=\"float\" value=\"13.0\" /><Parm name=\"LeftStartRatio\" type=\"float\" value=\"0.0\" /><Parm name=\"LeftEndRatio\" type=\"float\" value=\"0.5\" /><Parm name=\"RightStartRatio\" type=\"float\" value=\"0.5\" /><Parm name=\"RightEndRatio\" type=\"float\" value=\"0.99\" /><Parm name=\"TopStartRatio\" type=\"float\" value=\"0.0\" /><Parm name=\"TopEndRatio\" type=\"float\" value=\"0.5\" /><Parm name=\"BottomStartRatio\" type=\"float\" value=\"0.5\" /><Parm name=\"BottomEndRatio\" type=\"float\" value=\"0.99\" /><Parm name=\"AspectRatio\" type=\"float\" value=\"-1.0\" /><Parm name=\"MaxColorContrastFactor\" type=\"float\" value=\"1.5\" /><Parm name=\"MaxGreyContrastFactor\" type=\"float\" value=\"1.5\" /><Parm name=\"PixelColorConstrastFactor\" type=\"float\" value=\"1.0\" /><Parm name=\"PixelGreyConstrastFactor\" type=\"float\" value=\"1.0\" /><Parm name=\"UseFullScaleImage\" type=\"bool\" value=\"yes\" /><Parm name=\"UseAbsoluteRanking\" type=\"bool\" value=\"yes\" /><Parm name=\"UseFeatureB\" type=\"bool\" value=\"yes\" /><Parm name=\"OrientationThreshold\" type=\"double\" value=\"0.268\" /><Parm name=\"DownscaleSize\" type=\"int\" value=\"399360\" /><Parm name=\"MaxRotationAngles\" type=\"double\" value=\"5.5\" /><Parm name=\"MaxShapeError\" type=\"float\" value=\"0.1\" /></Section><Section name=\"MrzConfig\"><Parm name=\"SideConfig\" type=\"string\" value=\"MrzSideConfig\" /><Parm name=\"NumberOfOrientations\" type=\"int\" value=\"2\" /><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.5\" /><Parm name=\"LowDPI\" type=\"float\" value=\"100.0\"/><Parm name=\"HighDPI\" type=\"float\" value=\"400.0\"/><Parm name=\"MinAspectRatio\" type=\"float\" value=\"0.3\" /><Parm name=\"CharacterHeight\" type=\"float\" value=\"0.11\" /><Parm name=\"ErrorThreshold\" type=\"float\" value=\"0.30\"/><Parm name=\"NumCharacterThreshold2\" type=\"int\" value=\"22\"/><Parm name=\"ROIExtensionMargin\" type=\"float\" value=\"1.00\"/><Parm name=\"BottomHeightRatio\" type=\"float\" value=\"1.0\"/><Parm name=\"FrameMargin\" type=\"float\" value=\"0.02\"/></Section><Section name=\"MrzSideConfig\"><Parm name=\"ContrastThreshold\" type=\"int\" value=\"20\"/><Parm name=\"ToleranceRatio\" type=\"float\" value=\"0.02\"/><Parm name=\"TotalSegmentSupportRatio\" type=\"float\" value=\"2.4\"/><Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.60\"/><Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.60\"/></Section></Configuration>", "DocumentTracker");
        m3725r();
    }

    /* renamed from: r */
    private void m3725r() {
        this.f3334bK.reset();
        this.f3334bK.startup();
        this.f3334bK.RunDetection = true;
        this.f3334bK.RunLocalSearch = false;
        this.f3334bK.RunBoundaryDetection = true;
        this.f3334bK.RunDirectionDetection = true;
        this.f3334bK.RunRecognition = false;
    }
}
