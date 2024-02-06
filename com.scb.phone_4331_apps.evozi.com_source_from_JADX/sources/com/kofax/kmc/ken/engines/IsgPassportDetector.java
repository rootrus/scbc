package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.android.abc.machine_vision.CaptureGuidance;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.OrientationGuidance;
import com.kofax.kmc.ken.engines.data.PassportDetectionResult;
import com.kofax.kmc.ken.engines.data.PassportDetectionSettings;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import com.kofax.mobile.sdk.p026o.C0984d;
import com.kofax.mobile.sdk.p026o.C8460e;
import java.util.List;
import java.util.Locale;

public class IsgPassportDetector implements IPassportDetector {
    private static final String TAG = IsgPassportDetector.class.getSimpleName();

    /* renamed from: bD */
    private static final int f3335bD = 1;

    /* renamed from: bE */
    private static int f3336bE = 0;

    /* renamed from: bM */
    private static final int f3337bM = 921600;

    /* renamed from: T */
    private final IBoundingRectCalculator f3338T;

    /* renamed from: ae */
    private final IOrientationGuidanceCalculator f3339ae;

    /* renamed from: bA */
    private final DocumentTracker f3340bA = new DocumentTracker();

    /* renamed from: bB */
    private Rect f3341bB;

    public IsgPassportDetector() {
        C0433a aVar = new C0433a();
        this.f3338T = aVar;
        this.f3339ae = new C0466l(aVar);
        this.f3341bB = new Rect();
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    public void destroy() {
        this.f3340bA.dispose();
    }

    public PassportDetectionResult detect(PassportDetectionSettings passportDetectionSettings, Bitmap bitmap) {
        return m3727a(passportDetectionSettings, new C0984d(bitmap));
    }

    public PassportDetectionResult detect(PassportDetectionSettings passportDetectionSettings, byte[] bArr, int i, int i2) {
        return m3727a(passportDetectionSettings, new C8460e(bArr, 17, i, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.ken.engines.IsgPassportDetector.C7868a m3727a(com.kofax.kmc.ken.engines.data.PassportDetectionSettings r19, com.kofax.mobile.sdk.p026o.C0985f r20) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r20.getWidth()
            int r9 = r20.getHeight()
            double r2 = r19.getTargetFramePaddingPercent()
            double r4 = r19.getTargetFrameAspectRatio()
            android.graphics.Point r6 = r19.getCenterPoint()
            r7 = r0
            r8 = r9
            android.graphics.Rect r11 = com.kofax.kmc.kut.utilities.RectUtil.createTargetRect(r2, r4, r6, r7, r8)
            com.kofax.android.abc.machine_vision.DocumentTracker r2 = r1.f3340bA
            monitor-enter(r2)
            r3 = r19
            r1.m3728a(r0, r9, r3)     // Catch:{ all -> 0x011d }
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3340bA     // Catch:{ Exception -> 0x0038 }
            r4 = r20
            r4.mo12394a(r0)     // Catch:{ Exception -> 0x0033 }
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3340bA     // Catch:{ Exception -> 0x0033 }
            r0.processFrame()     // Catch:{ Exception -> 0x0033 }
        L_0x0030:
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3340bA     // Catch:{ all -> 0x011d }
            goto L_0x0043
        L_0x0033:
            r0 = move-exception
            goto L_0x003b
        L_0x0035:
            r0 = move-exception
            goto L_0x0117
        L_0x0038:
            r0 = move-exception
            r4 = r20
        L_0x003b:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = " Exception while native tracker processing"
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r5, (java.lang.String) r6, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0030
        L_0x0043:
            r0.releaseFrame()     // Catch:{ all -> 0x011d }
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3340bA     // Catch:{ all -> 0x011d }
            java.util.Vector r0 = r0.Documents()     // Catch:{ all -> 0x011d }
            int r5 = r0.size()     // Catch:{ all -> 0x011d }
            r6 = 0
            if (r5 > 0) goto L_0x005c
            java.lang.String r0 = TAG     // Catch:{ all -> 0x011d }
            java.lang.String r3 = "docs.size() < 1, returning null detection"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x011d }
            monitor-exit(r2)
            return r6
        L_0x005c:
            r5 = 0
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x011d }
            com.kofax.android.abc.machine_vision.TrackedDocument r0 = (com.kofax.android.abc.machine_vision.TrackedDocument) r0     // Catch:{ all -> 0x011d }
            com.kofax.android.abc.machine_vision.CaptureGuidance r15 = new com.kofax.android.abc.machine_vision.CaptureGuidance     // Catch:{ all -> 0x011d }
            com.kofax.android.abc.machine_vision.CaptureGuidance$GuidanceSource r7 = com.kofax.android.abc.machine_vision.CaptureGuidance.GuidanceSource.BEST_RECTANGLE     // Catch:{ all -> 0x011d }
            r15.<init>(r0, r7)     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.IsgPassportDetector$a r7 = new com.kofax.kmc.ken.engines.IsgPassportDetector$a     // Catch:{ all -> 0x011d }
            java.util.Vector r12 = r15.getDocumentRectangle()     // Catch:{ all -> 0x011d }
            boolean r13 = r0.IsComplete()     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.IOrientationGuidanceCalculator r8 = r1.f3339ae     // Catch:{ all -> 0x011d }
            r10 = r7
            r14 = r20
            r16 = r19
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x011d }
            java.lang.String r3 = TAG     // Catch:{ all -> 0x011d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x011d }
            r4.<init>()     // Catch:{ all -> 0x011d }
            java.lang.String r8 = "Guidence: HOR = "
            r4.append(r8)     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.HorizontalGuidance r8 = r7.getHorizontalMovementGuidance()     // Catch:{ all -> 0x011d }
            r4.append(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r8 = ", VER = "
            r4.append(r8)     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.VerticalGuidance r8 = r7.getVerticalMovementGuidance()     // Catch:{ all -> 0x011d }
            r4.append(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r8 = ", TURN = "
            r4.append(r8)     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.TurnGuidance r8 = r7.getTurnGuidance()     // Catch:{ all -> 0x011d }
            r4.append(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r8 = ", ZOOM = "
            r4.append(r8)     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.ZoomGuidance r8 = r7.getZoomGuidance()     // Catch:{ all -> 0x011d }
            r4.append(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x011d }
            com.kofax.mobile.sdk._internal.C0767k.m1796a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.ZoomGuidance r3 = r7.getZoomGuidance()     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.ZoomGuidance r4 = com.kofax.kmc.ken.engines.data.ZoomGuidance.ZOOM_OK     // Catch:{ all -> 0x011d }
            if (r3 != r4) goto L_0x0113
            com.kofax.kmc.ken.engines.data.VerticalGuidance r3 = r7.getVerticalMovementGuidance()     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.VerticalGuidance r4 = com.kofax.kmc.ken.engines.data.VerticalGuidance.VERTICAL_MOVE_OK     // Catch:{ all -> 0x011d }
            if (r3 != r4) goto L_0x0113
            com.kofax.kmc.ken.engines.data.HorizontalGuidance r3 = r7.getHorizontalMovementGuidance()     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.HorizontalGuidance r4 = com.kofax.kmc.ken.engines.data.HorizontalGuidance.HORIZONTAL_MOVE_OK     // Catch:{ all -> 0x011d }
            if (r3 != r4) goto L_0x0113
            com.kofax.kmc.ken.engines.data.TurnGuidance r3 = r7.getTurnGuidance()     // Catch:{ all -> 0x011d }
            com.kofax.kmc.ken.engines.data.TurnGuidance r4 = com.kofax.kmc.ken.engines.data.TurnGuidance.TURN_OK     // Catch:{ all -> 0x011d }
            if (r3 != r4) goto L_0x0113
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary r0 = r0.Boundary()     // Catch:{ all -> 0x011d }
            boolean[] r0 = r0.IsEdgeConfident()     // Catch:{ all -> 0x011d }
            r3 = r5
            r4 = r3
        L_0x00e8:
            int r8 = r0.length     // Catch:{ all -> 0x011d }
            if (r3 >= r8) goto L_0x00f1
            boolean r8 = r0[r3]     // Catch:{ all -> 0x011d }
            int r4 = r4 + r8
            int r3 = r3 + 1
            goto L_0x00e8
        L_0x00f1:
            r0 = 2
            r3 = 1
            if (r4 < r0) goto L_0x00f7
            r0 = r3
            goto L_0x00f8
        L_0x00f7:
            r0 = r5
        L_0x00f8:
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = TAG     // Catch:{ all -> 0x011d }
            java.lang.String r3 = " All guidences OK, but atLeastTwoEdgesGood"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x011d }
            monitor-exit(r2)
            return r6
        L_0x0103:
            int r0 = f3336bE     // Catch:{ all -> 0x011d }
            int r0 = r0 + r3
            f3336bE = r0     // Catch:{ all -> 0x011d }
            if (r0 > 0) goto L_0x0113
            java.lang.String r0 = TAG     // Catch:{ all -> 0x011d }
            java.lang.String r3 = " All OK, but DOCUMENT_DETECTION_COUNT_THRESHOLD"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x011d }
            monitor-exit(r2)
            return r6
        L_0x0113:
            f3336bE = r5     // Catch:{ all -> 0x011d }
            monitor-exit(r2)
            return r7
        L_0x0117:
            com.kofax.android.abc.machine_vision.DocumentTracker r3 = r1.f3340bA     // Catch:{ all -> 0x011d }
            r3.releaseFrame()     // Catch:{ all -> 0x011d }
            throw r0     // Catch:{ all -> 0x011d }
        L_0x011d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.IsgPassportDetector.m3727a(com.kofax.kmc.ken.engines.data.PassportDetectionSettings, com.kofax.mobile.sdk.o.f):com.kofax.kmc.ken.engines.IsgPassportDetector$a");
    }

    /* renamed from: a */
    private void m3728a(int i, int i2, PassportDetectionSettings passportDetectionSettings) {
        if (i != this.f3341bB.width() || i2 != this.f3341bB.height()) {
            Rect rect = new Rect(0, 0, i, i2);
            this.f3340bA.initializeString(m3729b(i, i2), "DocumentTracker");
            m3730r();
            this.f3341bB = rect;
        }
    }

    /* renamed from: r */
    private void m3730r() {
        this.f3340bA.reset();
        this.f3340bA.startup();
        this.f3340bA.RunDetection = true;
        this.f3340bA.RunLocalSearch = false;
        this.f3340bA.RunBoundaryDetection = true;
        this.f3340bA.RunDirectionDetection = true;
        this.f3340bA.RunRecognition = false;
    }

    /* renamed from: b */
    private static String m3729b(int i, int i2) {
        float f;
        float f2;
        if (i * i2 < f3337bM) {
            f2 = 50.0f;
            f = 1.0f;
        } else {
            f2 = 100.0f;
            f = 0.5f;
        }
        return String.format(Locale.US, "<?xml version='1.0' encoding='iso-8859-1'?><Configuration name='Cadence'>   <Section name='DocumentTracker'>     <Parm name='DetectorConfig' type='string' value='MRZConfig' />     <Parm name='FrameHistorySize' type='int' value='20' />      <Parm name='MaxTrackedDocuments' type='int' value='5' />      <Parm name='IsUseReferenceFeature' type='bool' value='yes' />    </Section>   <Section name='MRZConfig'>     <Parm name='DetectorType' type='string' value='MRZDocumentDetector' />     <Parm name='SideConfig' type='string' value='MRZSideConfig' />     <Parm name='NumberOfOrientations' type='int' value='2' />     <Parm name='ScalingFactor' type='float' value='%f' />     <Parm name='LowDPI' type='float' value='%f' />     <Parm name='HighDPI' type='float' value='500.0' />     <Parm name='MinAspectRatio' type='float' value='0.3' />     <Parm name='CharacterHeight' type='float' value='0.11' />     <Parm name='ErrorThreshold' type='float' value='0.3' />     <Parm name='NumCharacterThreshold2' type='int' value='22' />      <Parm name='ROIExtensionMargin' type='float' value='1.00' />     <Parm name='FrameMargin' type='float' value='0.02' />   </Section>   <Section name='MRZSideConfig'>     <Parm name='ContrastThreshold' type='int' value='15' />     <Parm name='ToleranceRatio' type='float' value='0.02' />     <Parm name='TotalSegmentSupportRatio' type='float' value='2.6'/>     <Parm name='MaxTopBottomSegmentSupportRatio' type='float' value='0.65'/>     <Parm name='MaxLeftRightSegmentSupportRatio' type='float' value='0.65'/>   </Section></Configuration>", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
    }

    /* renamed from: com.kofax.kmc.ken.engines.IsgPassportDetector$a */
    static class C7868a extends PassportDetectionResult {

        /* renamed from: U */
        private final OrientationGuidance f3342U;

        /* renamed from: bG */
        private final C0434b f3343bG;

        public C7868a(Rect rect, List<Point> list, boolean z, Frame frame, CaptureGuidance captureGuidance, PassportDetectionSettings passportDetectionSettings, IOrientationGuidanceCalculator iOrientationGuidanceCalculator) {
            super(rect, list, frame);
            this.f3343bG = new C0434b(new C0465k(captureGuidance), passportDetectionSettings, rect, frame.getWidth(), frame.getHeight(), this.bounds, z);
            this.f3342U = iOrientationGuidanceCalculator.calculate(rect, this.bounds);
        }

        public ZoomGuidance getZoomGuidance() {
            return this.f3343bG.mo10105e();
        }

        public TurnGuidance getTurnGuidance() {
            return this.f3343bG.getTurnGuidance();
        }

        public HorizontalGuidance getHorizontalMovementGuidance() {
            return this.f3343bG.getHorizontalMovementGuidance();
        }

        public VerticalGuidance getVerticalMovementGuidance() {
            return this.f3343bG.getVerticalMovementGuidance();
        }

        public OrientationGuidance getOrientationGuidance() {
            return this.f3342U;
        }
    }
}
