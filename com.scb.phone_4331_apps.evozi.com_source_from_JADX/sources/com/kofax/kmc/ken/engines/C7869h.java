package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.android.abc.machine_vision.CaptureGuidance;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.OrientationGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.mobile.sdk.p026o.C0984d;
import com.kofax.mobile.sdk.p026o.C0985f;
import com.kofax.mobile.sdk.p026o.C8460e;
import java.util.List;
import java.util.Locale;

/* renamed from: com.kofax.kmc.ken.engines.h */
class C7869h implements ICheckDetector {
    private static final String TAG = C7869h.class.getSimpleName();

    /* renamed from: bD */
    private static final int f3358bD = 1;

    /* renamed from: bE */
    private static int f3359bE = 0;

    /* renamed from: bF */
    private static final int f3360bF = 30;

    /* renamed from: T */
    private final IBoundingRectCalculator f3361T;

    /* renamed from: ae */
    private final IOrientationGuidanceCalculator f3362ae;

    /* renamed from: bA */
    private final DocumentTracker f3363bA = new DocumentTracker();

    /* renamed from: bB */
    private Rect f3364bB;

    /* renamed from: bC */
    private CheckSide f3365bC;

    C7869h() {
        C0433a aVar = new C0433a();
        this.f3361T = aVar;
        this.f3362ae = new C0466l(aVar);
        this.f3364bB = new Rect();
        this.f3365bC = CheckSide.NONE;
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    public CheckDetectionResult detect(CheckDetectionSettings checkDetectionSettings, Bitmap bitmap) {
        if (checkDetectionSettings.getSide() == CheckSide.NONE) {
            return null;
        }
        return m3731a(checkDetectionSettings, (C0985f) new C0984d(bitmap));
    }

    public CheckDetectionResult detect(CheckDetectionSettings checkDetectionSettings, byte[] bArr, int i, int i2) {
        return m3731a(checkDetectionSettings, (C0985f) new C8460e(bArr, 17, i, i2));
    }

    public void destroy() {
        this.f3363bA.dispose();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC, Splitter:B:30:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.kmc.ken.engines.C7869h.C7870a m3731a(com.kofax.kmc.ken.engines.data.CheckDetectionSettings r21, com.kofax.mobile.sdk.p026o.C0985f r22) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r22.getWidth()
            int r9 = r22.getHeight()
            r10 = 1
            r11 = 0
            if (r0 < r9) goto L_0x0010
            r2 = r10
            goto L_0x0011
        L_0x0010:
            r2 = r11
        L_0x0011:
            java.lang.Object[] r3 = new java.lang.Object[r11]
            if (r2 == 0) goto L_0x01b7
            double r2 = r21.getTargetFramePaddingPercent()
            double r4 = r21.getTargetFrameAspectRatio()
            android.graphics.Point r6 = r21.getCenterPoint()
            r7 = r0
            r8 = r9
            android.graphics.Rect r13 = com.kofax.kmc.kut.utilities.RectUtil.createTargetRect(r2, r4, r6, r7, r8)
            com.kofax.android.abc.machine_vision.DocumentTracker r2 = r1.f3363bA
            monitor-enter(r2)
            r3 = r21
            r1.m3733a(r0, r9, r3)     // Catch:{ all -> 0x01b4 }
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3363bA     // Catch:{ Exception -> 0x0043 }
            r4 = r22
            r4.mo12394a(r0)     // Catch:{ Exception -> 0x003e }
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3363bA     // Catch:{ Exception -> 0x003e }
            r0.processFrame()     // Catch:{ Exception -> 0x003e }
        L_0x003b:
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3363bA     // Catch:{ all -> 0x01b4 }
            goto L_0x004e
        L_0x003e:
            r0 = move-exception
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            goto L_0x01ae
        L_0x0043:
            r0 = move-exception
            r4 = r22
        L_0x0046:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = " Exception while native tracker processing"
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r5, (java.lang.String) r6, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0040 }
            goto L_0x003b
        L_0x004e:
            r0.releaseFrame()     // Catch:{ all -> 0x01b4 }
            com.kofax.android.abc.machine_vision.DocumentTracker r0 = r1.f3363bA     // Catch:{ all -> 0x01b4 }
            java.util.Vector r0 = r0.Documents()     // Catch:{ all -> 0x01b4 }
            int r5 = r0.size()     // Catch:{ all -> 0x01b4 }
            r6 = 0
            if (r5 > 0) goto L_0x0067
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = "docs.size() < 1, returning null detection"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x0067:
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x01b4 }
            com.kofax.android.abc.machine_vision.TrackedDocument r0 = (com.kofax.android.abc.machine_vision.TrackedDocument) r0     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r5 = r21.getSide()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r7 = com.kofax.kmc.ken.engines.data.CheckSide.FRONT     // Catch:{ all -> 0x01b4 }
            if (r5 != r7) goto L_0x0081
            java.lang.String r5 = r0.DetectorName()     // Catch:{ all -> 0x01b4 }
            java.lang.String r7 = "CheckFrontDetector"
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x01b4 }
            if (r5 == 0) goto L_0x0095
        L_0x0081:
            com.kofax.kmc.ken.engines.data.CheckSide r5 = r21.getSide()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r7 = com.kofax.kmc.ken.engines.data.CheckSide.BACK     // Catch:{ all -> 0x01b4 }
            if (r5 != r7) goto L_0x009e
            java.lang.String r5 = r0.DetectorName()     // Catch:{ all -> 0x01b4 }
            java.lang.String r7 = "CheckBackDetector"
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x01b4 }
            if (r5 != 0) goto L_0x009e
        L_0x0095:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = "detector name doesn't correspond to checkside, returning null detection"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x009e:
            com.kofax.android.abc.machine_vision.CaptureGuidance r5 = new com.kofax.android.abc.machine_vision.CaptureGuidance     // Catch:{ all -> 0x01b4 }
            com.kofax.android.abc.machine_vision.CaptureGuidance$GuidanceSource r7 = com.kofax.android.abc.machine_vision.CaptureGuidance.GuidanceSource.BEST_RECTANGLE     // Catch:{ all -> 0x01b4 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x01b4 }
            com.kofax.android.abc.machine_vision.DetectedReferenceFeature r7 = r0.ReferenceFeature()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r8 = r21.getSide()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r9 = com.kofax.kmc.ken.engines.data.CheckSide.FRONT     // Catch:{ all -> 0x01b4 }
            if (r8 != r9) goto L_0x00c0
            int r7 = r7.DPI()     // Catch:{ all -> 0x01b4 }
            if (r7 != 0) goto L_0x00c0
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = "dpi == 0"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x00c0:
            com.kofax.kmc.ken.engines.data.CheckSide r7 = r21.getSide()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r8 = com.kofax.kmc.ken.engines.data.CheckSide.BACK     // Catch:{ all -> 0x01b4 }
            if (r7 != r8) goto L_0x0100
            boolean r7 = r5.isEdgeSupportStrongerThanThreshold()     // Catch:{ all -> 0x01b4 }
            if (r7 != 0) goto L_0x00d7
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = "!edgeSupportGood"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x00d7:
            double r7 = r21.getTargetFrameAspectRatio()     // Catch:{ all -> 0x01b4 }
            r14 = 0
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0100
            double r7 = r21.getAspectRatioFraction()     // Catch:{ all -> 0x01b4 }
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0100
            double r7 = r21.getTargetFrameAspectRatio()     // Catch:{ all -> 0x01b4 }
            double r14 = r21.getAspectRatioFraction()     // Catch:{ all -> 0x01b4 }
            boolean r7 = r5.isAspectRatioWithinLimits(r7, r14)     // Catch:{ all -> 0x01b4 }
            if (r7 != 0) goto L_0x0100
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = "aspectRatio is exceeded"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x0100:
            com.kofax.kmc.ken.engines.h$a r7 = new com.kofax.kmc.ken.engines.h$a     // Catch:{ all -> 0x01b4 }
            java.util.Vector r14 = r5.getDocumentRectangle()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.CheckSide r16 = r21.getSide()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.IOrientationGuidanceCalculator r8 = r1.f3362ae     // Catch:{ all -> 0x01b4 }
            r12 = r7
            r15 = r22
            r17 = r5
            r18 = r21
            r19 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r4.<init>()     // Catch:{ all -> 0x01b4 }
            java.lang.String r5 = "Guidence: HOR = "
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.HorizontalGuidance r5 = r7.getHorizontalMovementGuidance()     // Catch:{ all -> 0x01b4 }
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            java.lang.String r5 = ", VER = "
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.VerticalGuidance r5 = r7.getVerticalMovementGuidance()     // Catch:{ all -> 0x01b4 }
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            java.lang.String r5 = ", TURN = "
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.TurnGuidance r5 = r7.getTurnGuidance()     // Catch:{ all -> 0x01b4 }
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            java.lang.String r5 = ", ZOOM = "
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.ZoomGuidance r5 = r7.getZoomGuidance()     // Catch:{ all -> 0x01b4 }
            r4.append(r5)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01b4 }
            com.kofax.mobile.sdk._internal.C0767k.m1796a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.ZoomGuidance r3 = r7.getZoomGuidance()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.ZoomGuidance r4 = com.kofax.kmc.ken.engines.data.ZoomGuidance.ZOOM_OK     // Catch:{ all -> 0x01b4 }
            if (r3 != r4) goto L_0x01aa
            com.kofax.kmc.ken.engines.data.VerticalGuidance r3 = r7.getVerticalMovementGuidance()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.VerticalGuidance r4 = com.kofax.kmc.ken.engines.data.VerticalGuidance.VERTICAL_MOVE_OK     // Catch:{ all -> 0x01b4 }
            if (r3 != r4) goto L_0x01aa
            com.kofax.kmc.ken.engines.data.HorizontalGuidance r3 = r7.getHorizontalMovementGuidance()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.HorizontalGuidance r4 = com.kofax.kmc.ken.engines.data.HorizontalGuidance.HORIZONTAL_MOVE_OK     // Catch:{ all -> 0x01b4 }
            if (r3 != r4) goto L_0x01aa
            com.kofax.kmc.ken.engines.data.TurnGuidance r3 = r7.getTurnGuidance()     // Catch:{ all -> 0x01b4 }
            com.kofax.kmc.ken.engines.data.TurnGuidance r4 = com.kofax.kmc.ken.engines.data.TurnGuidance.TURN_OK     // Catch:{ all -> 0x01b4 }
            if (r3 != r4) goto L_0x01aa
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary r0 = r0.Boundary()     // Catch:{ all -> 0x01b4 }
            boolean[] r0 = r0.IsEdgeConfident()     // Catch:{ all -> 0x01b4 }
            r3 = r11
            r4 = r3
        L_0x0180:
            int r5 = r0.length     // Catch:{ all -> 0x01b4 }
            if (r3 >= r5) goto L_0x0189
            boolean r5 = r0[r3]     // Catch:{ all -> 0x01b4 }
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L_0x0180
        L_0x0189:
            r0 = 2
            if (r4 < r0) goto L_0x018e
            r0 = r10
            goto L_0x018f
        L_0x018e:
            r0 = r11
        L_0x018f:
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = " All guidences OK, but atLeastTwoEdgesGood"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x019a:
            int r0 = f3359bE     // Catch:{ all -> 0x01b4 }
            int r0 = r0 + r10
            f3359bE = r0     // Catch:{ all -> 0x01b4 }
            if (r0 > 0) goto L_0x01aa
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b4 }
            java.lang.String r3 = " All OK, but DOCUMENT_DETECTION_COUNT_THRESHOLD"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r6
        L_0x01aa:
            f3359bE = r11     // Catch:{ all -> 0x01b4 }
            monitor-exit(r2)
            return r7
        L_0x01ae:
            com.kofax.android.abc.machine_vision.DocumentTracker r3 = r1.f3363bA     // Catch:{ all -> 0x01b4 }
            r3.releaseFrame()     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "image must be landscape orientation"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.C7869h.m3731a(com.kofax.kmc.ken.engines.data.CheckDetectionSettings, com.kofax.mobile.sdk.o.f):com.kofax.kmc.ken.engines.h$a");
    }

    /* renamed from: a */
    private void m3733a(int i, int i2, CheckDetectionSettings checkDetectionSettings) {
        Rect rect = new Rect(0, 0, i, i2);
        CheckSide side = checkDetectionSettings.getSide();
        if (!rect.equals(this.f3364bB) || side != this.f3365bC) {
            float f = -1.0f;
            if (side.equals(CheckSide.BACK)) {
                f = (float) checkDetectionSettings.getTargetFrameAspectRatio();
            }
            this.f3363bA.initializeString(m3732a(side, f), "DocumentTracker");
            m3734r();
            this.f3364bB = rect;
            this.f3365bC = side;
        }
    }

    /* renamed from: r */
    private void m3734r() {
        this.f3363bA.reset();
        this.f3363bA.startup();
        this.f3363bA.RunDetection = true;
        this.f3363bA.RunLocalSearch = false;
        this.f3363bA.RunBoundaryDetection = true;
        this.f3363bA.RunDirectionDetection = true;
    }

    /* renamed from: a */
    private static String m3732a(CheckSide checkSide, float f) {
        return String.format(Locale.US, "<?xml version='1.0' encoding='iso-8859-1'?><Configuration name='Cadence'>   <Section name='DocumentTracker'>     <Parm name='DetectorConfig' type='string' value='%s' />     <Parm name='FrameHistorySize' type='int' value='50' />      <Parm name='MaxTrackedDocuments' type='int' value='1' />    </Section>   <Section name='CheckConfig'>     <Parm name='DetectorType' type='string' value='CheckDetector' />     <Parm name='FrontConfig' type='string' value='CheckFrontConfig' />     <Parm name='BackConfig' type='string' value='CheckBackConfig' />     <Parm name='IsFrontExpected' type='bool' value='yes' />   </Section>   <Section name='CheckFrontConfig'>     <Parm name='DetectorType' type='string' value='CheckFrontDetector' />     <Parm name='SideConfig' type='string' value='CheckSideConfig' />    </Section>   <Section name='CheckBackConfig'>     <Parm name='DetectorType' type='string' value='CheckBackDetector' />     <Parm name='SideConfig' type='string' value='CheckSideConfig' />   </Section>   <Section name='CheckSideConfig'>     <Parm name='AspectRatio' type='float' value='%f'/>     <Parm name='ContrastThreshold' type='int' value='%d'/>     <Parm name='ToleranceRatio' type='float' value='0.02'/>     <Parm name='TotalSegmentSupportRatio' type='float' value='2.6'/>     <Parm name='MaxTopBottomSegmentSupportRatio' type='float' value='0.65'/>     <Parm name='MaxLeftRightSegmentSupportRatio' type='float' value='0.65'/>   </Section></Configuration>", new Object[]{checkSide.equals(CheckSide.BACK) ? "CheckBackConfig" : "CheckConfig", Float.valueOf(f), 30});
    }

    /* renamed from: com.kofax.kmc.ken.engines.h$a */
    static class C7870a extends CheckDetectionResult {

        /* renamed from: U */
        private final OrientationGuidance f3366U;

        /* renamed from: bG */
        private final C0434b f3367bG;

        public C7870a(Rect rect, List<Point> list, C0985f fVar, CheckSide checkSide, CaptureGuidance captureGuidance, CheckDetectionSettings checkDetectionSettings, IOrientationGuidanceCalculator iOrientationGuidanceCalculator) {
            super(rect, list, fVar, checkSide);
            this.f3367bG = new C0434b(new C0465k(captureGuidance), checkDetectionSettings, rect, fVar.getWidth(), fVar.getHeight(), getBounds(), true);
            this.f3366U = iOrientationGuidanceCalculator.calculate(rect, this.bounds);
        }

        public ZoomGuidance getZoomGuidance() {
            return this.f3367bG.mo10105e();
        }

        public TurnGuidance getTurnGuidance() {
            return this.f3367bG.getTurnGuidance();
        }

        public HorizontalGuidance getHorizontalMovementGuidance() {
            return this.f3367bG.getHorizontalMovementGuidance();
        }

        public VerticalGuidance getVerticalMovementGuidance() {
            return this.f3367bG.getVerticalMovementGuidance();
        }

        public OrientationGuidance getOrientationGuidance() {
            return this.f3366U;
        }
    }
}
