package com.pingan.p031ai;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pingan.p031ai.face.common.FixedLinkedList;
import com.pingan.p031ai.face.common.PaFaceConstants;
import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.entity.PaFaceDetectFrame;
import com.pingan.p031ai.face.entity.PreviewFrame;
import com.pingan.p031ai.face.manager.impl.OnPaFaceDetectorListener;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import com.pingan.p031ai.face.view.AuroraView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import pingan.p063ai.paverify.vertify.PFaceDetector;

/* renamed from: com.pingan.ai.d */
public class C1022d {

    /* renamed from: f0 */
    public static float[] f2436f0 = {0.03f, 0.07f, 0.93f, 0.97f};

    /* renamed from: A */
    public boolean f2437A = false;

    /* renamed from: B */
    public C1018a f2438B;

    /* renamed from: C */
    public StringBuilder f2439C;

    /* renamed from: D */
    public boolean f2440D;

    /* renamed from: E */
    public int f2441E;

    /* renamed from: F */
    public int f2442F;

    /* renamed from: G */
    public int f2443G;

    /* renamed from: H */
    public int f2444H;

    /* renamed from: I */
    public int f2445I;

    /* renamed from: J */
    public int f2446J;

    /* renamed from: K */
    public int f2447K;

    /* renamed from: L */
    public boolean f2448L = true;

    /* renamed from: M */
    public boolean f2449M;

    /* renamed from: N */
    public boolean f2450N;

    /* renamed from: O */
    public AuroraView f2451O;

    /* renamed from: P */
    public boolean f2452P = false;

    /* renamed from: Q */
    public int f2453Q = -1;

    /* renamed from: R */
    public int f2454R = 0;

    /* renamed from: S */
    public float f2455S = 0.3f;

    /* renamed from: T */
    public float f2456T = 0.55f;

    /* renamed from: U */
    public List<Integer> f2457U = new ArrayList(5);

    /* renamed from: V */
    public long f2458V;

    /* renamed from: W */
    public int f2459W = 0;

    /* renamed from: X */
    public boolean f2460X = false;

    /* renamed from: Y */
    public float f2461Y = -1.0f;

    /* renamed from: Z */
    public float f2462Z = -1.0f;

    /* renamed from: a */
    public Context f2463a;

    /* renamed from: a0 */
    public int f2464a0 = 0;

    /* renamed from: b */
    public OnPaFaceDetectorListener f2465b;

    /* renamed from: b0 */
    public C8669h f2466b0;

    /* renamed from: c */
    public LiveFaceConfig f2467c;

    /* renamed from: c0 */
    public C8672j f2468c0;

    /* renamed from: d */
    public boolean f2469d = true;

    /* renamed from: d0 */
    public C1028e f2470d0 = new C1028e();

    /* renamed from: e */
    public Activity f2471e;

    /* renamed from: e0 */
    public C1026e f2472e0 = new C1026e(this, (C1023a) null);

    /* renamed from: f */
    public BlockingDeque<PreviewFrame> f2473f = null;

    /* renamed from: g */
    public C1024c f2474g = null;

    /* renamed from: h */
    public C1025d f2475h = null;

    /* renamed from: i */
    public long f2476i = 0;

    /* renamed from: j */
    public AtomicBoolean f2477j = new AtomicBoolean(false);

    /* renamed from: k */
    public C8670i f2478k;

    /* renamed from: l */
    public C8676o f2479l;

    /* renamed from: m */
    public C8665f f2480m;

    /* renamed from: n */
    public C8674k f2481n;

    /* renamed from: o */
    public C8675m f2482o;

    /* renamed from: p */
    public C1032n f2483p;

    /* renamed from: q */
    public C1031l f2484q;

    /* renamed from: r */
    public boolean f2485r;

    /* renamed from: s */
    public boolean f2486s;

    /* renamed from: t */
    public PaFaceDetectFrame f2487t;

    /* renamed from: u */
    public PaFaceDetectFrame f2488u;

    /* renamed from: v */
    public PaFaceDetectFrame f2489v;

    /* renamed from: w */
    public PaFaceDetectFrame f2490w;

    /* renamed from: x */
    public PaFaceDetectFrame f2491x;

    /* renamed from: y */
    public PaFaceDetectFrame f2492y;

    /* renamed from: z */
    public List<PaFaceDetectFrame> f2493z = new FixedLinkedList(20);

    /* renamed from: com.pingan.ai.d$a */
    public class C1023a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f2494a;

        /* renamed from: b */
        public final /* synthetic */ float f2495b;

        public C1023a(C1022d dVar, Activity activity, float f) {
            this.f2494a = activity;
            this.f2495b = f;
        }

        public void run() {
            C1036z.m2782a(this.f2494a, this.f2495b);
        }
    }

    /* renamed from: com.pingan.ai.d$c */
    public final class C1024c extends Thread {

        /* renamed from: a */
        public volatile boolean f2496a;

        /* renamed from: b */
        public PFaceDetector.AceFaceInfo[] f2497b;

        public C1024c() {
            this.f2496a = true;
        }

        public /* synthetic */ C1024c(C1022d dVar, C1023a aVar) {
            this();
        }

        /* renamed from: a */
        public final native PaFaceDetectFrame mo12515a(PreviewFrame previewFrame, String str);

        /* renamed from: a */
        public final void mo12516a(int i) {
            if (i != 5 && i == 2022) {
                C1022d.this.f2472e0.mo12549c(PaFaceConstants.EnvironmentalTips.RETURN_TO_CENTER);
            }
            C1022d.this.f2472e0.mo12548b(i);
        }

        /* renamed from: a */
        public final void mo12517a(int i, float f) {
            if (C1022d.this.f2484q != null) {
                C1022d.this.f2484q.mo12642a(i, f, C1022d.this.f2482o);
            }
        }

        /* renamed from: a */
        public final native void mo12518a(PreviewFrame previewFrame);

        /* renamed from: a */
        public final void mo12519a(boolean z) {
            C1022d.this.f2466b0.mo55550b();
            if (z) {
                C1022d.this.f2487t.yaw = C1022d.this.f2466b0.mo55551c()[0];
                C1022d.this.f2487t.roll = C1022d.this.f2466b0.mo55551c()[1];
                C1022d.this.f2487t.pitch = C1022d.this.f2466b0.mo55551c()[2];
            }
        }

        /* renamed from: a */
        public final boolean mo12520a(float f, float f2) {
            if (C1022d.this.f2466b0.mo55551c()[4] > C8682x.m5711p(C1022d.this.f2467c) || C1022d.this.f2466b0.mo55551c()[5] > C8682x.m5711p(C1022d.this.f2467c)) {
                C1022d.this.f2466b0.f5387m = true;
                C1022d dVar = C1022d.this;
                StringBuilder sb = new StringBuilder();
                sb.append(C1021c.m2615a());
                sb.append(" eyes:activeEyeAction");
                dVar.mo12507c(sb.toString());
            }
            if (!C1022d.this.f2466b0.f5387m) {
                C1022d.this.f2466b0.f5395u = false;
            } else if (f > C8682x.m5699d(C1022d.this.f2467c) && f2 > C8682x.m5699d(C1022d.this.f2467c)) {
                C1022d.this.f2466b0.f5395u = true;
                C1022d dVar2 = C1022d.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C1021c.m2615a());
                sb2.append(" model blink eyesInfo:left eyeScore:");
                sb2.append(f);
                sb2.append(" ; right eyeScore:");
                sb2.append(f2);
                dVar2.mo12507c(sb2.toString());
                PaFaceLogger.error(" model blink eyesInfo: EyeClose");
                C1022d.this.f2466b0.mo55553e();
            }
            if (C1022d.this.f2466b0.f5395u && f < C8682x.m5712q(C1022d.this.f2467c) && f2 < C8682x.m5712q(C1022d.this.f2467c)) {
                C1022d.this.f2466b0.f5396v = true;
            }
            if (C1022d.this.f2466b0.f5396v && C1022d.this.f2466b0.f5395u) {
                return true;
            }
            PaFaceLogger.error(PaFaceLogger.TAG, "model blink eye not pass.");
            return false;
        }

        /* renamed from: a */
        public final boolean mo12521a(String str) {
            if (C8682x.m5720y(C1022d.this.f2467c)) {
                return true;
            }
            boolean z = C1022d.this.f2486s || (C1022d.this.f2482o != null && C1022d.this.f2482o.mo55579c());
            int i = C1022d.this.f2487t.trackingId;
            if (C1022d.this.f2453Q == -1 || C1022d.this.f2453Q == i || !z) {
                int unused = C1022d.this.f2453Q = i;
                int unused2 = C1022d.this.f2454R = 0;
            } else if (C1022d.m2624I(C1022d.this) < 3) {
                int unused3 = C1022d.this.f2453Q = -1;
                int unused4 = C1022d.this.f2454R = 0;
                C1022d dVar = C1022d.this;
                StringBuilder sb = new StringBuilder();
                sb.append("TrackingError:");
                sb.append(C1021c.m2615a());
                sb.append(" TRACKING_ERROR:TrackId change.trackId : ");
                sb.append(C1022d.this.f2453Q);
                sb.append("faceInfo.trackingId");
                sb.append(C1022d.this.f2487t.trackingId);
                dVar.mo12496a(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TRACK_CHANGE featureAttack ");
                sb2.append(str);
                sb2.append(" TRACKING_ERROR:TrackId change.trackId : ");
                sb2.append(C1022d.this.f2453Q);
                sb2.append("faceInfo.trackingId");
                sb2.append(C1022d.this.f2487t.trackingId);
                PaFaceLogger.error(sb2.toString());
                C1022d.this.mo12500b(3003);
                C1022d.this.mo12498a(true);
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo12522a(float[] fArr, String str) {
            long j;
            if (C1022d.this.f2459W == 0) {
                long unused = C1022d.this.f2458V = System.currentTimeMillis();
                boolean unused2 = C1022d.this.f2460X = false;
                j = 0;
            } else {
                j = System.currentTimeMillis() - C1022d.this.f2458V;
            }
            if (C1022d.this.f2459W >= C8682x.m5718w(C1022d.this.f2467c) || (C1022d.this.f2459W > 1 && j > ((long) C8682x.m5702g(C1022d.this.f2467c)))) {
                if (!C1022d.this.f2460X) {
                    boolean unused3 = C1022d.this.f2460X = true;
                    C1022d dVar = C1022d.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C1021c.m2615a());
                    sb.append(" isPreMotionStable end.");
                    dVar.mo12507c(sb.toString());
                    PaFaceLogger.m2758i("isPreMotionStable end.");
                    C1022d.this.f2466b0.mo55562h();
                }
                return true;
            }
            C1022d dVar2 = C1022d.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1021c.m2615a());
            sb2.append(" Stable:motionStableFrameCount=");
            sb2.append(C1022d.this.f2459W);
            sb2.append(" ; stableContinueTime=");
            sb2.append(j);
            dVar2.mo12507c(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("STABLE_LEGAL Stable:motionStableFrameCount=");
            sb3.append(C1022d.this.f2459W);
            sb3.append(" ; stableContinueTime=");
            sb3.append(j);
            PaFaceLogger.error(sb3.toString());
            if (!C1022d.this.f2466b0.mo55556b(str)) {
                int unused4 = C1022d.this.f2459W = 0;
                return false;
            }
            C1022d.m2679r(C1022d.this);
            mo12526b();
            return false;
        }

        /* renamed from: a */
        public final boolean mo12523a(PFaceDetector.AceFaceInfo[] aceFaceInfoArr, String str) {
            String str2;
            StringBuilder sb;
            String str3;
            float f;
            StringBuilder sb2;
            String str4;
            String str5 = str;
            int E = C1022d.this.f2446J % 90 == 0 ? C1022d.this.f2445I : C1022d.this.f2444H;
            int F = C1022d.this.f2446J % 90 == 0 ? C1022d.this.f2444H : C1022d.this.f2445I;
            float F2 = ((float) C1022d.this.f2487t.rectW) / ((float) (C1022d.this.f2444H < C1022d.this.f2445I ? C1022d.this.f2444H : C1022d.this.f2445I));
            if (F2 < C1022d.this.f2467c.getFaceFarThr()) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.TOO_FAR));
                C1022d dVar = C1022d.this;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TooFar:");
                sb3.append(C1021c.m2615a());
                sb3.append(" errorFace:tooFar,scale=");
                sb3.append(F2);
                sb3.append(",frameWidth=");
                sb3.append(C1022d.this.f2487t.frameWidth);
                sb3.append(",frameHeight=");
                sb3.append(C1022d.this.f2487t.frameHeight);
                dVar.mo12496a(sb3.toString());
                sb = new StringBuilder();
                str3 = "TOO_FAR ";
            } else if (F2 > C1022d.this.f2467c.getFaceCloseThr()) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.TOO_CLOSE));
                C1022d dVar2 = C1022d.this;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("TooClose:");
                sb4.append(C1021c.m2615a());
                sb4.append(" errorFace:tooClose,scale=");
                sb4.append(F2);
                sb4.append(",frameWidth=");
                sb4.append(C1022d.this.f2487t.frameWidth);
                sb4.append(",frameHeight=");
                sb4.append(C1022d.this.f2487t.frameHeight);
                dVar2.mo12496a(sb4.toString());
                sb = new StringBuilder();
                str3 = "TOO_CLOSE ";
            } else {
                if (!"detect head".equalsIgnoreCase(str5) && !"detect nod head".equalsIgnoreCase(str5)) {
                    float abs = (((float) Math.abs(aceFaceInfoArr[0].left + aceFaceInfoArr[0].right)) / 2.0f) - ((float) (E / 2));
                    float abs2 = (((float) Math.abs(aceFaceInfoArr[0].top + aceFaceInfoArr[0].bottom)) / 2.0f) - ((float) (F / 2));
                    int sqrt = (int) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
                    if (sqrt > C1022d.this.f2467c.getFaceCenterThr()) {
                        C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_NO_CENTER));
                        C1022d dVar3 = C1022d.this;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("FaceNoCenter:");
                        sb5.append(C1021c.m2615a());
                        sb5.append(" errorFace:noFace distance shake : ");
                        sb5.append(sqrt);
                        dVar3.mo12496a(sb5.toString());
                        C1022d dVar4 = C1022d.this;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(C1021c.m2615a());
                        sb6.append(" errorFace:noFace : ");
                        sb6.append(aceFaceInfoArr[0].left);
                        sb6.append(" ; ");
                        sb6.append(aceFaceInfoArr[0].top);
                        sb6.append(" ; ");
                        sb6.append(aceFaceInfoArr[0].right);
                        sb6.append(";");
                        sb6.append(aceFaceInfoArr[0].bottom);
                        dVar4.mo12507c(sb6.toString());
                        sb = new StringBuilder();
                        sb.append("CENTER NO_FACE lower threshold,faceNum=");
                        sb.append(C1022d.this.f2487t.faceNum);
                        sb.append(", distance=");
                        sb.append(sqrt);
                        str2 = sb.toString();
                        PaFaceLogger.error(str2);
                        return false;
                    }
                }
                float f2 = (float) E;
                if (((float) aceFaceInfoArr[0].left) >= C1022d.f2436f0[0] * f2) {
                    float f3 = (float) F;
                    if (((float) aceFaceInfoArr[0].top) >= C1022d.f2436f0[1] * f3 && ((float) aceFaceInfoArr[0].right) <= f2 * C1022d.f2436f0[2] && ((float) aceFaceInfoArr[0].bottom) <= f3 * C1022d.f2436f0[3]) {
                        if (!"detect aurora face".equalsIgnoreCase(str5)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            C1022d.this.f2487t.brightness = PFaceDetector.nativeGetIllumination();
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            C1022d dVar5 = C1022d.this;
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Illumination: ");
                            sb7.append(currentTimeMillis2);
                            dVar5.mo12510d(sb7.toString());
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("atomic get illumination use time: ");
                            sb8.append(currentTimeMillis2);
                            PaFaceLogger.m2758i(sb8.toString());
                            if (C1022d.this.f2487t.brightness < C1022d.this.f2467c.getDarkThr()) {
                                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.TOO_DARK));
                                C1022d dVar6 = C1022d.this;
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("TooDark:");
                                sb9.append(C1021c.m2615a());
                                sb9.append(" errorFace:tooDark,brightness=");
                                sb9.append(C1022d.this.f2487t.brightness);
                                dVar6.mo12496a(sb9.toString());
                                sb2 = new StringBuilder();
                                str4 = "TOO_DARK ";
                            } else if (C1022d.this.f2487t.brightness > C1022d.this.f2467c.getBrightnessThr()) {
                                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.TOO_BRIGHT));
                                C1022d dVar7 = C1022d.this;
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("TooBright:");
                                sb10.append(C1021c.m2615a());
                                sb10.append(" errorFace:tooBright,brightness=");
                                sb10.append(C1022d.this.f2487t.brightness);
                                dVar7.mo12496a(sb10.toString());
                                sb2 = new StringBuilder();
                                str4 = "TOO_BRIGHT ";
                            }
                            sb2.append(str4);
                            sb2.append(str5);
                            sb2.append(" brightness=");
                            f = C1022d.this.f2487t.brightness;
                            sb.append(f);
                            str2 = sb.toString();
                            PaFaceLogger.error(str2);
                            return false;
                        }
                        long currentTimeMillis3 = System.currentTimeMillis();
                        C1022d.this.f2487t.blurness = PFaceDetector.nativeGetBlur();
                        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                        C1022d dVar8 = C1022d.this;
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Blur: ");
                        sb11.append(currentTimeMillis4);
                        dVar8.mo12510d(sb11.toString());
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("atomic get blur use time: ");
                        sb12.append(currentTimeMillis4);
                        PaFaceLogger.m2758i(sb12.toString());
                        if (C1022d.this.f2487t.blurness <= C1022d.this.f2467c.getBlurThr()) {
                            return true;
                        }
                        C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.TOO_FUZZY));
                        C1022d dVar9 = C1022d.this;
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("TooFuzzy:");
                        sb13.append(C1021c.m2615a());
                        sb13.append(" errorFace:tooFuzzy,blurness=");
                        sb13.append(C1022d.this.f2487t.blurness);
                        dVar9.mo12496a(sb13.toString());
                        sb2 = new StringBuilder();
                        sb2.append("TOO_FUZZY ");
                        sb2.append(str5);
                        sb2.append(" blurness=");
                        f = C1022d.this.f2487t.blurness;
                        sb.append(f);
                        str2 = sb.toString();
                        PaFaceLogger.error(str2);
                        return false;
                    }
                }
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_NO_CENTER));
                C1022d dVar10 = C1022d.this;
                StringBuilder sb14 = new StringBuilder();
                sb14.append("FaceNoCenter:");
                sb14.append(C1021c.m2615a());
                sb14.append(" errorFace:noFace : ");
                sb14.append(aceFaceInfoArr[0].left);
                sb14.append(" ; ");
                sb14.append(aceFaceInfoArr[0].top);
                sb14.append(" ; ");
                sb14.append(aceFaceInfoArr[0].right);
                sb14.append(";");
                sb14.append(aceFaceInfoArr[0].bottom);
                dVar10.mo12496a(sb14.toString());
                str2 = "CENTER NO_FACE face is too close border.";
                PaFaceLogger.error(str2);
                return false;
            }
            sb.append(str3);
            sb.append(str5);
            sb.append(" scale= ");
            sb.append(F2);
            sb.append(",frameWidth=");
            sb.append(C1022d.this.f2487t.frameWidth);
            sb.append(",frameHeight=");
            sb.append(C1022d.this.f2487t.frameHeight);
            str2 = sb.toString();
            PaFaceLogger.error(str2);
            return false;
        }

        /* renamed from: a */
        public final float[] mo12524a() {
            float[] nativeOcc = PFaceDetector.nativeOcc();
            if (!(nativeOcc[0] == BitmapDescriptorFactory.HUE_RED && nativeOcc[1] == BitmapDescriptorFactory.HUE_RED && nativeOcc[2] == BitmapDescriptorFactory.HUE_RED && nativeOcc[3] == BitmapDescriptorFactory.HUE_RED && nativeOcc[4] == BitmapDescriptorFactory.HUE_RED && nativeOcc[5] == BitmapDescriptorFactory.HUE_RED)) {
                nativeOcc[0] = 1.0f - nativeOcc[0];
                nativeOcc[5] = 1.0f - nativeOcc[5];
            }
            return nativeOcc;
        }

        /* renamed from: b */
        public final void mo12525b(boolean z) {
            this.f2496a = z;
        }

        /* renamed from: b */
        public final boolean mo12526b() {
            if (C1022d.this.f2482o == null || C1022d.this.f2482o.mo55580d()) {
                return false;
            }
            if (mo12533e()) {
                return true;
            }
            return C1022d.this.f2482o.mo55581e();
        }

        /* renamed from: b */
        public final boolean mo12527b(String str) {
            boolean z;
            if (C1022d.this.f2464a0 > 0) {
                C1022d.m2618C(C1022d.this);
                C1022d dVar = C1022d.this;
                StringBuilder sb = new StringBuilder();
                sb.append("MultiFace:");
                sb.append(C1021c.m2615a());
                sb.append(" errorFace:multiFace,faceLastNum:");
                sb.append(C1022d.this.f2464a0);
                dVar.mo12496a(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MULTI_FACE ");
                sb2.append(str);
                sb2.append(" faceLastNum = ");
                sb2.append(C1022d.this.f2464a0);
                PaFaceLogger.error(sb2.toString());
                if (C1022d.this.f2464a0 < 6) {
                    return false;
                }
                int unused = C1022d.this.f2464a0 = 0;
            }
            if (C1022d.this.f2487t.faceNum <= 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("NO_FACE featureAttack ");
                sb3.append(str);
                sb3.append(" faceNum=");
                sb3.append(C1022d.this.f2487t.faceNum);
                sb3.append("; pre hasNormalFace = ");
                sb3.append(C1022d.this.f2486s);
                PaFaceLogger.error(sb3.toString());
                boolean z2 = C1022d.this.f2486s || (C1022d.this.f2482o != null && C1022d.this.f2482o.mo55579c());
                if (C8682x.m5720y(C1022d.this.f2467c) || !z2) {
                    C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.NO_FACE));
                    C1022d dVar2 = C1022d.this;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("NoFace:");
                    sb4.append(C1021c.m2615a());
                    sb4.append(" noFace faceInfo.faceNum : ");
                    sb4.append(C1022d.this.f2487t.faceNum);
                    dVar2.mo12496a(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("NO_FACE ");
                    sb5.append(str);
                    sb5.append(" faceNum=");
                    sb5.append(C1022d.this.f2487t.faceNum);
                    PaFaceLogger.error(sb5.toString());
                } else {
                    C1022d.this.mo12500b(3003);
                    C1022d dVar3 = C1022d.this;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("TrackingError:");
                    sb6.append(C1021c.m2615a());
                    sb6.append("errorLoseFace:noFace faceInfo.faceNum : ");
                    sb6.append(C1022d.this.f2487t.faceNum);
                    dVar3.mo12496a(sb6.toString());
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("NO_FACE featureAttack ");
                    sb7.append(str);
                    sb7.append(",faceNum=");
                    sb7.append(C1022d.this.f2487t.faceNum);
                    PaFaceLogger.error(sb7.toString());
                    C1022d.this.mo12498a(true);
                }
                boolean unused2 = C1022d.this.f2440D = false;
                return false;
            }
            if (C1022d.this.f2487t.faceNum > 1) {
                String str2 = "";
                int i = 1;
                while (true) {
                    try {
                        if (i >= C1022d.this.f2487t.faceNum) {
                            break;
                        }
                        int i2 = this.f2497b[i].right - this.f2497b[i].left;
                        int i3 = this.f2497b[i].bottom - this.f2497b[i].top;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(" faceInfo[");
                        sb8.append(i);
                        sb8.append("] width : ");
                        sb8.append(i2);
                        sb8.append(" ; faceInfo[");
                        sb8.append(i);
                        sb8.append("] height : ");
                        sb8.append(i3);
                        str2 = sb8.toString();
                        C1022d dVar4 = C1022d.this;
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(C1021c.m2615a());
                        sb9.append(str2);
                        dVar4.mo12507c(sb9.toString());
                        if (((float) (i2 * i3)) > C1022d.this.f2467c.getMinFaceThr()) {
                            z = true;
                            break;
                        }
                        i++;
                    } catch (Exception e) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("MULTI_FACE throws exception,");
                        sb10.append(e.getMessage());
                        PaFaceLogger.error(PaFaceLogger.TAG, sb10.toString());
                        C1022d dVar5 = C1022d.this;
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Exception:");
                        sb11.append(C1021c.m2615a());
                        sb11.append("MULTI_FACE throws exception,");
                        sb11.append(e.getMessage());
                        dVar5.mo12496a(sb11.toString());
                    }
                }
                z = false;
                StringBuilder sb12 = new StringBuilder();
                sb12.append("MULTI_FACE ");
                sb12.append(str);
                sb12.append(" multiInfo = ");
                sb12.append(str2);
                PaFaceLogger.m2758i(sb12.toString());
                if (z) {
                    int unused3 = C1022d.this.f2464a0 = 1;
                    C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.MULTI_FACE));
                    C1022d dVar6 = C1022d.this;
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("MultiFace:");
                    sb13.append(C1021c.m2615a());
                    sb13.append(" errorFace:multiFace,faceNum:");
                    sb13.append(C1022d.this.f2487t.faceNum);
                    dVar6.mo12496a(sb13.toString());
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append("MULTI_FACE ");
                    sb14.append(str);
                    sb14.append(" faceNum = ");
                    sb14.append(C1022d.this.f2487t.faceNum);
                    PaFaceLogger.error(sb14.toString());
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final native PFaceDetector.AceFaceInfo[] mo12528b(PreviewFrame previewFrame);

        /* renamed from: c */
        public final void mo12529c() {
            mo12519a(true);
        }

        /* renamed from: c */
        public final native boolean mo12530c(PreviewFrame previewFrame);

        /* renamed from: d */
        public final boolean mo12531d() {
            float[] nativeActionEyes = PFaceDetector.nativeActionEyes();
            return mo12520a(nativeActionEyes[0], nativeActionEyes[1]) || mo12537g();
        }

        /* renamed from: d */
        public final native boolean mo12532d(PreviewFrame previewFrame);

        /* renamed from: e */
        public final boolean mo12533e() {
            long currentTimeMillis = System.currentTimeMillis();
            float[] nativeActionEyes = PFaceDetector.nativeActionEyes();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C1022d dVar = C1022d.this;
            StringBuilder sb = new StringBuilder();
            sb.append("NativeDetectEye:");
            sb.append(currentTimeMillis2);
            dVar.mo12510d(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("atomic nativeActionEyes use time:");
            sb2.append(currentTimeMillis2);
            PaFaceLogger.m2758i(sb2.toString());
            if (nativeActionEyes[0] <= C8682x.m5697b(C1022d.this.f2467c) && nativeActionEyes[1] <= C8682x.m5697b(C1022d.this.f2467c)) {
                return false;
            }
            C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.EYE_CLOSE_ERROR));
            PaFaceLogger.error(PaFaceLogger.TAG, "detect normal face,EYE_CLOSE_ERROR");
            C1022d dVar2 = C1022d.this;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("EyeCloseError:");
            sb3.append(C1021c.m2615a());
            sb3.append(" detect normal face wrong.");
            dVar2.mo12496a(sb3.toString());
            return true;
        }

        /* renamed from: e */
        public final native boolean mo12534e(PreviewFrame previewFrame);

        /* renamed from: f */
        public final boolean mo12535f() {
            float f;
            StringBuilder sb;
            String str;
            String str2;
            String str3;
            StringBuilder sb2;
            StringBuilder sb3;
            long currentTimeMillis = System.currentTimeMillis();
            float[] nativeGetPose = PFaceDetector.nativeGetPose();
            C1022d.this.f2487t.yaw = nativeGetPose[0];
            C1022d.this.f2487t.roll = nativeGetPose[1];
            C1022d.this.f2487t.pitch = nativeGetPose[2];
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C1022d dVar = C1022d.this;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Pose: ");
            sb4.append(currentTimeMillis2);
            dVar.mo12510d(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("atomic get pose use time: ");
            sb5.append(currentTimeMillis2);
            PaFaceLogger.m2758i(sb5.toString());
            if (C1022d.this.f2487t.yaw < ((float) (-C1022d.this.f2467c.getYawThr()))) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_YAW_RIGHT));
                C1022d dVar2 = C1022d.this;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("FaceYawRight:");
                sb6.append(C1021c.m2615a());
                sb6.append(" errorFace:yawRight,yaw=");
                sb6.append(C1022d.this.f2487t.yaw);
                dVar2.mo12496a(sb6.toString());
                sb = new StringBuilder();
                str = "FACE_YAW_RIGHT detect normal face yaw=";
            } else if (C1022d.this.f2487t.yaw > ((float) C1022d.this.f2467c.getYawThr())) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_YAW_LEFT));
                C1022d dVar3 = C1022d.this;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("FaceYawLeft:");
                sb7.append(C1021c.m2615a());
                sb7.append(" errorFace:yawLeft,yaw=");
                sb7.append(C1022d.this.f2487t.yaw);
                dVar3.mo12496a(sb7.toString());
                sb = new StringBuilder();
                str = "FACE_YAW_LEFT detect normal face yaw=";
            } else {
                if (C1022d.this.f2487t.roll < ((float) (-C1022d.this.f2467c.getRollThr()))) {
                    C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_ROLL_RIGHT));
                    C1022d dVar4 = C1022d.this;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("FaceRollRight:");
                    sb8.append(C1021c.m2615a());
                    sb8.append(" errorFace:rollLeft,roll=");
                    sb8.append(C1022d.this.f2487t.roll);
                    dVar4.mo12496a(sb8.toString());
                    sb3 = new StringBuilder();
                    str2 = "FACE_ROLL_RIGHT detect normal face roll=";
                } else if (C1022d.this.f2487t.roll > ((float) C1022d.this.f2467c.getRollThr())) {
                    C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_ROLL_LEFT));
                    C1022d dVar5 = C1022d.this;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("FaceRollLeft:");
                    sb9.append(C1021c.m2615a());
                    sb9.append(" errorFace:rollRight,roll=");
                    sb9.append(C1022d.this.f2487t.roll);
                    dVar5.mo12496a(sb9.toString());
                    sb3 = new StringBuilder();
                    str2 = "FACE_ROLL_LEFT detect normal face roll=";
                } else {
                    if (C1022d.this.f2487t.pitch < ((float) (-C1022d.this.f2467c.getPitchThr()))) {
                        C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_PITCH_UP));
                        C1022d dVar6 = C1022d.this;
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("FacePitchUp:");
                        sb10.append(C1021c.m2615a());
                        sb10.append(" errorFace:pitchUp,pitch=");
                        sb10.append(C1022d.this.f2487t.pitch);
                        dVar6.mo12496a(sb10.toString());
                        sb2 = new StringBuilder();
                        str3 = "FACE_PITCH_UP detect normal face pitch=";
                    } else if (C1022d.this.f2487t.pitch <= ((float) C1022d.this.f2467c.getPitchThr())) {
                        return true;
                    } else {
                        C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_PITCH_DOWN));
                        C1022d dVar7 = C1022d.this;
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("FacePitchDown:");
                        sb11.append(C1021c.m2615a());
                        sb11.append(" errorFace:pitchDown,pitch=");
                        sb11.append(C1022d.this.f2487t.pitch);
                        dVar7.mo12496a(sb11.toString());
                        sb2 = new StringBuilder();
                        str3 = "FACE_PITCH_DOWN detect normal face pitch=";
                    }
                    sb.append(str3);
                    f = C1022d.this.f2487t.pitch;
                    sb.append(f);
                    PaFaceLogger.error(sb.toString());
                    return false;
                }
                sb.append(str2);
                f = C1022d.this.f2487t.roll;
                sb.append(f);
                PaFaceLogger.error(sb.toString());
                return false;
            }
            sb.append(str);
            f = C1022d.this.f2487t.yaw;
            sb.append(f);
            PaFaceLogger.error(sb.toString());
            return false;
        }

        /* renamed from: f */
        public final native boolean mo12536f(PreviewFrame previewFrame);

        /* renamed from: g */
        public final boolean mo12537g() {
            if (C1022d.this.f2466b0.mo55551c()[4] > C8682x.m5711p(C1022d.this.f2467c) || C1022d.this.f2466b0.mo55551c()[5] > C8682x.m5711p(C1022d.this.f2467c)) {
                C1022d.this.f2466b0.f5386l = true;
                C1022d dVar = C1022d.this;
                StringBuilder sb = new StringBuilder();
                sb.append(C1021c.m2615a());
                sb.append(" eyes:activeEyeAction");
                dVar.mo12507c(sb.toString());
            }
            if (!C1022d.this.f2466b0.f5386l) {
                C1022d.this.f2466b0.f5393s = false;
                C1022d.this.f2466b0.f5382i.clear();
                C1022d.this.f2466b0.f5383j.clear();
            } else {
                float a = C8679u.m5675a(C1022d.this.f2466b0.f5382i);
                float b = C8679u.m5676b(C1022d.this.f2466b0.f5382i);
                float a2 = C8679u.m5675a(C1022d.this.f2466b0.f5383j);
                float b2 = C8679u.m5676b(C1022d.this.f2466b0.f5383j);
                C1022d dVar2 = C1022d.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C1021c.m2615a());
                sb2.append(" eyesInfoTrends:left eyeScore:");
                sb2.append(C1022d.this.f2466b0.mo55551c()[4]);
                sb2.append(" ; right eyeScore:");
                sb2.append(C1022d.this.f2466b0.mo55551c()[5]);
                dVar2.mo12507c(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("eyesInfoTrends:left eyeScore:");
                sb3.append(C1022d.this.f2466b0.mo55551c()[4]);
                sb3.append(" ; right eyeScore:");
                sb3.append(C1022d.this.f2466b0.mo55551c()[5]);
                sb3.append(", leftD=");
                sb3.append(a - b);
                sb3.append(",rightD=");
                sb3.append(a2 - b2);
                PaFaceLogger.m2759i(PaFaceLogger.TAG, sb3.toString());
                if ((C1022d.this.f2466b0.mo55551c()[4] < C8682x.m5698c(C1022d.this.f2467c) && C1022d.this.f2466b0.mo55551c()[5] < C8682x.m5698c(C1022d.this.f2467c)) && !C1022d.this.f2466b0.f5393s) {
                    C1022d.this.f2466b0.f5393s = true;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("eyesInfoTrends:mIsCloseEye:");
                    sb4.append(C1022d.this.f2466b0.f5393s);
                    PaFaceLogger.m2759i(PaFaceLogger.TAG, sb4.toString());
                }
            }
            if (C1022d.this.f2466b0.f5393s) {
                float a3 = C8679u.m5675a(C1022d.this.f2466b0.f5382i);
                float b3 = C8679u.m5676b(C1022d.this.f2466b0.f5382i);
                float a4 = C8679u.m5675a(C1022d.this.f2466b0.f5383j);
                float b4 = C8679u.m5676b(C1022d.this.f2466b0.f5383j);
                if (a3 - b3 > C8682x.m5710o(C1022d.this.f2467c) && a4 - b4 > C8682x.m5710o(C1022d.this.f2467c) && !C1022d.this.f2466b0.f5393s) {
                    C1022d.this.f2466b0.f5394t = true;
                    C1022d dVar3 = C1022d.this;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(C1021c.m2615a());
                    sb5.append(" eyesInfoTrends:mIsCloseEye:");
                    sb5.append(C1022d.this.f2466b0.f5394t);
                    dVar3.mo12507c(sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("eyesInfoTrends:mIsOpenEye:");
                    sb6.append(C1022d.this.f2466b0.f5394t);
                    PaFaceLogger.m2759i(PaFaceLogger.TAG, sb6.toString());
                    C1022d.this.f2466b0.mo55553e();
                }
            }
            if (C1022d.this.f2466b0.f5394t && C1022d.this.f2466b0.f5393s) {
                return true;
            }
            PaFaceLogger.error(PaFaceLogger.TAG, "lmk blink eye not pass.");
            return false;
        }

        /* renamed from: g */
        public final native boolean mo12538g(PreviewFrame previewFrame);

        /* renamed from: h */
        public final boolean mo12539h() {
            if (!(C1022d.this.f2461Y == -1.0f || C1022d.this.f2462Z == -1.0f)) {
                float f = C1022d.this.f2487t.landmarkPosition[222];
                float f2 = C1022d.this.f2487t.landmarkPosition[223];
                float a = C8679u.m5674a(C1022d.this.f2461Y, C1022d.this.f2462Z, f, f2);
                float f3 = ((float) C1022d.this.f2487t.frameWidth) * 0.04f;
                if (a > f3) {
                    C1022d dVar = C1022d.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C1021c.m2615a());
                    sb.append(" d=");
                    sb.append(a);
                    sb.append(" ; maxRange=");
                    sb.append(f3);
                    dVar.mo12507c(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("NOSE_SHAKE  d=");
                    sb2.append(a);
                    sb2.append(" ; maxRange=");
                    sb2.append(f3);
                    PaFaceLogger.error(sb2.toString());
                    float unused = C1022d.this.f2461Y = f;
                    float unused2 = C1022d.this.f2462Z = f2;
                    return true;
                }
            }
            C1022d dVar2 = C1022d.this;
            float unused3 = dVar2.f2461Y = dVar2.f2487t.landmarkPosition[222];
            C1022d dVar3 = C1022d.this;
            float unused4 = dVar3.f2462Z = dVar3.f2487t.landmarkPosition[223];
            return false;
        }

        /* renamed from: h */
        public final native boolean mo12540h(PreviewFrame previewFrame);

        /* renamed from: i */
        public final boolean mo12541i() {
            long currentTimeMillis = System.currentTimeMillis();
            float[] a = mo12524a();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C1022d dVar = C1022d.this;
            StringBuilder sb = new StringBuilder();
            sb.append("Occ: ");
            sb.append(currentTimeMillis2);
            dVar.mo12510d(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("atomic checkOcc use time: ");
            sb2.append(currentTimeMillis2);
            PaFaceLogger.m2758i(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("check Occ,");
            sb3.append(a[1]);
            sb3.append(";");
            sb3.append(a[2]);
            sb3.append(";");
            sb3.append(a[3]);
            sb3.append(";");
            sb3.append(a[7]);
            sb3.append(";");
            sb3.append(a[8]);
            PaFaceLogger.m2758i(sb3.toString());
            if (a[1] > C8682x.m5705j(C1022d.this.f2467c)) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.COVER_MOUTH));
                PaFaceLogger.error(PaFaceLogger.TAG, "COVER_MOUTH");
                return true;
            } else if (a[2] > C8682x.m5700e(C1022d.this.f2467c) || a[3] > C8682x.m5700e(C1022d.this.f2467c)) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.COVER_EYE));
                PaFaceLogger.error(PaFaceLogger.TAG, "COVER_EYE");
                return true;
            } else if (a[7] > C8682x.m5701f(C1022d.this.f2467c)) {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.COVER_FACE));
                PaFaceLogger.error(PaFaceLogger.TAG, "COVER_FACE");
                return true;
            } else if (a[8] <= C8682x.m5701f(C1022d.this.f2467c)) {
                return false;
            } else {
                C1022d.this.mo12506c(C1022d.this.mo12487a((int) PaFaceConstants.EnvironmentalTips.COVER_FACE));
                PaFaceLogger.error(PaFaceLogger.TAG, "COVER_FACE");
                return true;
            }
        }

        /* renamed from: j */
        public final void mo12542j() {
            PaFaceDetectFrame paFaceDetectFrame;
            try {
                paFaceDetectFrame = (PaFaceDetectFrame) C1022d.this.f2487t.clone();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("clone another frame failed:");
                sb.append(e.getMessage());
                PaFaceLogger.error(sb.toString());
                paFaceDetectFrame = null;
            }
            if (C1022d.this.f2478k != null) {
                C1022d.this.f2478k.mo55564a(paFaceDetectFrame);
            }
            if (C1022d.this.f2480m != null && C1022d.this.f2466b0.mo55560f()) {
                C1022d.this.f2480m.mo55539a(paFaceDetectFrame);
            }
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x004a=Splitter:B:9:0x004a, B:20:0x008d=Splitter:B:20:0x008d, B:29:0x009d=Splitter:B:29:0x009d} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                r0 = 0
                r1 = 0
                com.pingan.ai.d r2 = com.pingan.p031ai.C1022d.this     // Catch:{ Exception -> 0x0058 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058 }
                r3.<init>()     // Catch:{ Exception -> 0x0058 }
                java.lang.String r4 = com.pingan.p031ai.C1021c.m2615a()     // Catch:{ Exception -> 0x0058 }
                r3.append(r4)     // Catch:{ Exception -> 0x0058 }
                java.lang.String r4 = " DETECT CONSUMER"
                r3.append(r4)     // Catch:{ Exception -> 0x0058 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0058 }
                r2.mo12507c((java.lang.String) r3)     // Catch:{ Exception -> 0x0058 }
                java.lang.String r2 = "PaFace Detector"
                java.lang.String r3 = "detect thread is running."
                com.pingan.p031ai.face.utils.PaFaceLogger.m2759i(r2, r3)     // Catch:{ Exception -> 0x0058 }
            L_0x0024:
                boolean r2 = r6.f2496a     // Catch:{ Exception -> 0x0058 }
                if (r2 == 0) goto L_0x004a
                com.pingan.ai.d r2 = com.pingan.p031ai.C1022d.this     // Catch:{ Exception -> 0x0058 }
                java.util.concurrent.BlockingDeque r2 = r2.f2473f     // Catch:{ Exception -> 0x0058 }
                r3 = 200(0xc8, double:9.9E-322)
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0058 }
                java.lang.Object r2 = r2.poll(r3, r5)     // Catch:{ Exception -> 0x0058 }
                com.pingan.ai.face.entity.PreviewFrame r2 = (com.pingan.p031ai.face.entity.PreviewFrame) r2     // Catch:{ Exception -> 0x0058 }
                if (r2 == 0) goto L_0x0024
                r6.mo12518a((com.pingan.p031ai.face.entity.PreviewFrame) r2)     // Catch:{ Exception -> 0x0058 }
                com.pingan.ai.d r3 = com.pingan.p031ai.C1022d.this     // Catch:{ Exception -> 0x0058 }
                com.pingan.ai.d$e r3 = r3.f2472e0     // Catch:{ Exception -> 0x0058 }
                r3.mo12547a((com.pingan.p031ai.face.entity.PreviewFrame) r2)     // Catch:{ Exception -> 0x0058 }
                r2.recycle()     // Catch:{ Exception -> 0x0058 }
                goto L_0x0024
            L_0x004a:
                pingan.ai.paverify.vertify.PFaceDetector$AceFaceInfo[] r2 = r6.f2497b     // Catch:{ all -> 0x00ac }
                if (r2 == 0) goto L_0x0099
                int r3 = r2.length     // Catch:{ all -> 0x00ac }
                if (r0 >= r3) goto L_0x0099
                r2[r0] = r1     // Catch:{ all -> 0x00ac }
                int r0 = r0 + 1
                goto L_0x004a
            L_0x0056:
                r2 = move-exception
                goto L_0x009d
            L_0x0058:
                r2 = move-exception
                com.pingan.ai.d r3 = com.pingan.p031ai.C1022d.this     // Catch:{ all -> 0x0056 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
                r4.<init>()     // Catch:{ all -> 0x0056 }
                java.lang.String r5 = "DetectException:"
                r4.append(r5)     // Catch:{ all -> 0x0056 }
                java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0056 }
                r4.append(r5)     // Catch:{ all -> 0x0056 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0056 }
                r3.mo12496a((java.lang.String) r4)     // Catch:{ all -> 0x0056 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
                r3.<init>()     // Catch:{ all -> 0x0056 }
                java.lang.String r4 = "detect thread throw exception,"
                r3.append(r4)     // Catch:{ all -> 0x0056 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0056 }
                r3.append(r2)     // Catch:{ all -> 0x0056 }
                java.lang.String r2 = "PaFace Detector"
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0056 }
                com.pingan.p031ai.face.utils.PaFaceLogger.error(r2, r3)     // Catch:{ all -> 0x0056 }
            L_0x008d:
                pingan.ai.paverify.vertify.PFaceDetector$AceFaceInfo[] r2 = r6.f2497b     // Catch:{ all -> 0x00ac }
                if (r2 == 0) goto L_0x0099
                int r3 = r2.length     // Catch:{ all -> 0x00ac }
                if (r0 >= r3) goto L_0x0099
                r2[r0] = r1     // Catch:{ all -> 0x00ac }
                int r0 = r0 + 1
                goto L_0x008d
            L_0x0099:
                r6.f2497b = r1     // Catch:{ all -> 0x00ac }
                monitor-exit(r6)
                return
            L_0x009d:
                pingan.ai.paverify.vertify.PFaceDetector$AceFaceInfo[] r3 = r6.f2497b     // Catch:{ all -> 0x00ac }
                if (r3 == 0) goto L_0x00a9
                int r4 = r3.length     // Catch:{ all -> 0x00ac }
                if (r0 >= r4) goto L_0x00a9
                r3[r0] = r1     // Catch:{ all -> 0x00ac }
                int r0 = r0 + 1
                goto L_0x009d
            L_0x00a9:
                r6.f2497b = r1     // Catch:{ all -> 0x00ac }
                throw r2     // Catch:{ all -> 0x00ac }
            L_0x00ac:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pingan.p031ai.C1022d.C1024c.run():void");
        }
    }

    /* renamed from: com.pingan.ai.d$d */
    public final class C1025d extends Handler {
        public C1025d(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (C1022d.this.f2465b != null) {
                int i = message.what;
                if (i > 1000 && i < 2000) {
                    C1022d.this.f2465b.onDetectMotionTips(i);
                    C1022d.this.f2465b.onDetectProgress(i, C1022d.this.f2484q != null ? C1022d.this.f2484q.mo12641a() : BitmapDescriptorFactory.HUE_RED);
                } else if (i > 2000 && i < 3000) {
                    C1022d.this.f2465b.onDetectTips(i);
                    C1022d.this.f2465b.onDetectTips(i, C1022d.this.f2487t);
                } else if (i > 3000 && i < 4000) {
                    if (C1022d.this.f2474g != null) {
                        C1022d.this.f2474g.mo12525b(false);
                    }
                    if (C1022d.this.f2475h != null) {
                        C1022d.this.f2475h.removeCallbacksAndMessages((Object) null);
                        C1025d unused = C1022d.this.f2475h = null;
                    }
                    C1022d.this.f2465b.onInterruptError(i);
                    C1022d.this.f2465b.onInterruptError(i, C1022d.this.f2493z);
                } else if (i <= 4000 || i >= 5000) {
                    if (i == 6) {
                        C1022d.this.f2465b.onDetectFaceInfo(C1022d.this.f2447K, C1022d.this.f2487t, message.arg1, message.arg2);
                    } else if (i == 5) {
                        C1022d.this.f2465b.onDetectMotionDone(C1022d.this.f2443G);
                    }
                } else if (i == 4001) {
                    if (C1022d.this.f2474g != null) {
                        C1022d.this.f2474g.mo12525b(false);
                    }
                    PaFaceDetectFrame[] paFaceDetectFrameArr = {C1022d.this.f2488u, C1022d.this.f2491x, C1022d.this.f2490w, C1022d.this.f2489v, C1022d.this.f2492y};
                    if (C1022d.this.f2475h != null) {
                        C1022d.this.f2475h.removeCallbacksAndMessages((Object) null);
                        C1025d unused2 = C1022d.this.f2475h = null;
                    }
                    C1022d.this.f2465b.onDetectProgress(i, C1022d.this.f2484q != null ? C1022d.this.f2484q.mo12641a() : 1.0f);
                    C1022d.this.f2465b.onDetectComplete(i, paFaceDetectFrameArr);
                    if (C1022d.this.f2483p != null) {
                        C1022d.this.f2483p.mo12651e();
                    }
                }
            }
        }
    }

    /* renamed from: com.pingan.ai.d$e */
    public class C1026e {

        /* renamed from: a */
        public int f2500a;

        /* renamed from: b */
        public int f2501b;

        /* renamed from: c */
        public int f2502c;

        /* renamed from: d */
        public int f2503d;

        /* renamed from: e */
        public List<Integer> f2504e;

        public C1026e() {
            this.f2503d = 0;
            this.f2504e = new ArrayList();
        }

        public /* synthetic */ C1026e(C1022d dVar, C1023a aVar) {
            this();
        }

        /* renamed from: a */
        public int mo12545a(int i) {
            boolean z = false;
            if (this.f2504e.size() == 5) {
                this.f2504e.remove(0);
            }
            this.f2504e.add(Integer.valueOf(i));
            if (this.f2504e.size() == 5) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        z = true;
                        break;
                    }
                    i2++;
                    if (!this.f2504e.get(i2).equals(this.f2504e.get(i2))) {
                        break;
                    }
                }
                if (z) {
                    return this.f2504e.get(4).intValue();
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo12546a() {
            List<Integer> list = this.f2504e;
            if (list != null) {
                list.clear();
                mo12549c(PaFaceConstants.EnvironmentalTips.NORMAL);
            }
            this.f2501b = 0;
            this.f2502c = 0;
        }

        /* renamed from: a */
        public native void mo12547a(PreviewFrame previewFrame);

        /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo12548b(int r3) {
            /*
                r2 = this;
                com.pingan.ai.d r0 = com.pingan.p031ai.C1022d.this
                com.pingan.ai.d$d r0 = r0.f2475h
                if (r0 == 0) goto L_0x005a
                r0 = 1000(0x3e8, float:1.401E-42)
                if (r3 < r0) goto L_0x0051
                if (r3 <= r0) goto L_0x0012
                r0 = 2000(0x7d0, float:2.803E-42)
                if (r3 < r0) goto L_0x0051
            L_0x0012:
                r0 = 3000(0xbb8, float:4.204E-42)
                if (r3 > r0) goto L_0x0051
                r0 = 2001(0x7d1, float:2.804E-42)
                if (r3 != r0) goto L_0x0027
                int r1 = r2.f2501b
                if (r1 == r0) goto L_0x0027
                com.pingan.ai.d r0 = com.pingan.p031ai.C1022d.this
                com.pingan.ai.d$d r0 = r0.f2475h
                int r1 = r2.f2501b
                goto L_0x0035
            L_0x0027:
                if (r3 != r0) goto L_0x0039
                int r1 = r2.f2502c
                if (r1 == r0) goto L_0x0039
                com.pingan.ai.d r0 = com.pingan.p031ai.C1022d.this
                com.pingan.ai.d$d r0 = r0.f2475h
                int r1 = r2.f2502c
            L_0x0035:
                r0.sendEmptyMessage(r1)
                goto L_0x0042
            L_0x0039:
                com.pingan.ai.d r0 = com.pingan.p031ai.C1022d.this
                com.pingan.ai.d$d r0 = r0.f2475h
                r0.sendEmptyMessage(r3)
            L_0x0042:
                int r0 = r2.f2503d
                r1 = 1
                int r0 = r0 + r1
                r2.f2503d = r0
                if (r0 <= r1) goto L_0x004e
                int r0 = r2.f2501b
                r2.f2502c = r0
            L_0x004e:
                r2.f2501b = r3
                return
            L_0x0051:
                com.pingan.ai.d r0 = com.pingan.p031ai.C1022d.this
                com.pingan.ai.d$d r0 = r0.f2475h
                r0.sendEmptyMessage(r3)
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pingan.p031ai.C1022d.C1026e.mo12548b(int):void");
        }

        /* renamed from: c */
        public void mo12549c(int i) {
            List<Integer> list = this.f2504e;
            if (list != null) {
                int size = list.size();
                this.f2504e.clear();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2504e.add(Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: com.pingan.ai.d$b */
    public class C1027b implements Runnable {
        public C1027b() {
        }

        public void run() {
            C1022d.this.f2451O.setAuroraViewColor(0);
        }
    }

    /* renamed from: C */
    public static /* synthetic */ int m2618C(C1022d dVar) {
        int i = dVar.f2464a0;
        dVar.f2464a0 = i + 1;
        return i;
    }

    /* renamed from: I */
    public static /* synthetic */ int m2624I(C1022d dVar) {
        int i = dVar.f2454R + 1;
        dVar.f2454R = i;
        return i;
    }

    /* renamed from: r */
    public static /* synthetic */ int m2679r(C1022d dVar) {
        int i = dVar.f2459W;
        dVar.f2459W = i + 1;
        return i;
    }

    /* renamed from: a */
    public int mo12487a(int i) {
        int a = this.f2472e0.mo12545a(i);
        if (a != -1) {
            int unused = this.f2472e0.f2500a = a;
        }
        return a;
    }

    /* renamed from: a */
    public void mo12488a() {
        if (this.f2465b != null) {
            this.f2465b = null;
        }
        C8672j jVar = this.f2468c0;
        if (jVar != null) {
            jVar.mo55570b();
            this.f2468c0 = null;
        }
        C1032n nVar = this.f2483p;
        if (nVar != null) {
            nVar.mo12651e();
            this.f2483p = null;
        }
        this.f2484q = null;
        this.f2466b0 = null;
        if (this.f2485r) {
            PFaceDetector.nativeDestroy();
        }
        this.f2485r = false;
        this.f2451O = null;
        this.f2463a = null;
        this.f2471e = null;
        this.f2457U.clear();
        this.f2493z.clear();
        C8670i iVar = this.f2478k;
        if (iVar != null) {
            iVar.mo55565a(true);
            this.f2478k = null;
        }
        C8665f fVar = this.f2480m;
        if (fVar != null) {
            fVar.mo55540a(true);
            this.f2480m = null;
        }
        this.f2481n = null;
        this.f2482o = null;
        this.f2448L = true;
        this.f2449M = false;
        this.f2450N = false;
        PaFaceLogger.m2758i("deInit");
    }

    /* renamed from: a */
    public final void mo12489a(float f) {
        if (this.f2469d) {
            if (this.f2471e != null || (this.f2463a instanceof Activity)) {
                Activity activity = this.f2471e;
                if (activity == null) {
                    activity = (Activity) this.f2463a;
                }
                activity.runOnUiThread(new C1023a(this, activity, f));
            }
        }
    }

    /* renamed from: a */
    public void mo12490a(int i, byte[] bArr, int i2, int i3, int i4, int i5) {
        this.f2444H = i5;
        this.f2445I = i4;
        this.f2446J = i3;
        PreviewFrame obtain = PreviewFrame.obtain(i, bArr, i2, i3, i4, i5);
        if (this.f2473f != null && !this.f2477j.get()) {
            this.f2473f.offer(obtain);
        }
    }

    /* renamed from: a */
    public void mo12491a(Activity activity, boolean z) {
        this.f2471e = activity;
        this.f2469d = z;
    }

    /* renamed from: a */
    public final void mo12492a(Context context, boolean z) {
        this.f2437A = z;
        if (z) {
            C1018a c = C1018a.m2608c();
            this.f2438B = c;
            c.mo12482a(context);
            if (this.f2439C == null) {
                this.f2439C = this.f2438B.mo12484b();
            }
        }
    }

    /* renamed from: a */
    public final native void mo12493a(LiveFaceConfig liveFaceConfig);

    /* renamed from: a */
    public native void mo12494a(OnPaFaceDetectorListener onPaFaceDetectorListener);

    /* renamed from: a */
    public native void mo12495a(AuroraView auroraView);

    /* renamed from: a */
    public void mo12496a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAFaceSDK-Error-");
        sb.append(str);
        sb.append("\r\n");
        mo12502b(sb.toString());
    }

    /* renamed from: a */
    public void mo12497a(List<Integer> list) {
        this.f2457U.clear();
        this.f2448L = true;
        int i = 0;
        this.f2449M = false;
        this.f2450N = false;
        if (list != null && !list.isEmpty()) {
            for (Integer next : list) {
                if (1002 == next.intValue() || 1003 == next.intValue() || 1004 == next.intValue() || 1005 == next.intValue()) {
                    this.f2457U.add(next);
                } else if (1006 == next.intValue() && !this.f2457U.contains(1006)) {
                    this.f2457U.add(next);
                    this.f2450N = true;
                }
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C1021c.m2615a());
        sb.append(" setMotions,size:");
        sb.append(this.f2457U.size());
        sb.append(",elements:");
        sb.append(this.f2457U.toString());
        mo12507c(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setMotions,size:");
        sb2.append(this.f2457U.size());
        sb2.append(",elements:");
        sb2.append(this.f2457U.toString());
        PaFaceLogger.m2759i(PaFaceLogger.TAG, sb2.toString());
        C1032n nVar = this.f2483p;
        if (nVar != null) {
            nVar.mo12646a(this.f2457U);
        }
        C8675m mVar = this.f2482o;
        if (mVar != null) {
            mVar.mo55576a(i);
        }
    }

    /* renamed from: a */
    public void mo12498a(boolean z) {
        C8669h hVar = this.f2466b0;
        if (hVar != null) {
            hVar.mo55562h();
            this.f2472e0.mo12546a();
        }
        mo12503b(z);
        C1031l lVar = this.f2484q;
        if (lVar != null) {
            lVar.mo12643a(this.f2483p);
        }
        this.f2486s = false;
        C8676o oVar = this.f2479l;
        if (oVar != null) {
            oVar.mo55596m();
        }
        this.f2488u = null;
        this.f2491x = null;
        this.f2490w = null;
        this.f2489v = null;
        this.f2492y = null;
        C8675m mVar = this.f2482o;
        if (mVar != null) {
            mVar.mo55583g();
        }
        this.f2441E = 0;
        this.f2459W = 0;
        this.f2453Q = -1;
        this.f2454R = 0;
    }

    /* renamed from: a */
    public native boolean mo12499a(Context context, LiveFaceConfig liveFaceConfig);

    /* renamed from: b */
    public void mo12500b(int i) {
        C1032n nVar = this.f2483p;
        if (nVar != null) {
            nVar.mo12645a(i);
        }
        if (this.f2475h != null) {
            int unused = this.f2472e0.f2500a = i;
            this.f2475h.sendEmptyMessage(i);
        }
    }

    /* renamed from: b */
    public native void mo12501b(LiveFaceConfig liveFaceConfig);

    /* renamed from: b */
    public final void mo12502b(String str) {
        StringBuilder sb;
        if (this.f2437A && this.f2438B != null && (sb = this.f2439C) != null) {
            sb.append(str);
        }
    }

    /* renamed from: b */
    public final void mo12503b(boolean z) {
        this.f2477j.set(z);
        this.f2470d0.mo12556c();
    }

    /* renamed from: b */
    public boolean mo12504b() {
        return this.f2452P;
    }

    /* renamed from: c */
    public final void mo12505c() {
        StringBuilder sb;
        if (this.f2437A && (sb = this.f2439C) != null && !sb.toString().equals("")) {
            C1018a aVar = this.f2438B;
            aVar.mo12483a(aVar.mo12481a(), this.f2439C.toString(), this.f2467c);
            StringBuilder sb2 = this.f2439C;
            sb2.delete(0, sb2.length());
        }
    }

    /* renamed from: c */
    public void mo12506c(int i) {
        if (i != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f2476i > 750) {
                C1032n nVar = this.f2483p;
                if (nVar != null) {
                    nVar.mo12645a(i);
                }
                this.f2472e0.mo12548b(i);
                this.f2476i = currentTimeMillis;
            }
        }
    }

    /* renamed from: c */
    public void mo12507c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAFaceSDK-Log-");
        sb.append(str);
        sb.append("\r\n");
        mo12502b(sb.toString());
    }

    /* renamed from: c */
    public void mo12508c(boolean z) {
        this.f2467c.setGravitySwitch(z);
    }

    /* renamed from: d */
    public final void mo12509d() {
        AuroraView auroraView = this.f2451O;
        if (auroraView != null) {
            auroraView.post(new C1027b());
        }
    }

    /* renamed from: d */
    public void mo12510d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAFaceSDK-Time-");
        sb.append(str);
        sb.append("\r\n");
        mo12502b(sb.toString());
    }

    /* renamed from: e */
    public final void mo12511e() {
        PFaceDetector.FaceConfig faceConfig = new PFaceDetector.FaceConfig();
        faceConfig.liveThreshold100 = 0.17527d;
        faceConfig.liveThreshold1000 = 0.77133d;
        faceConfig.liveThreshold10000 = 0.93352d;
        faceConfig.trackingMode = true;
        faceConfig.detectFaceMinScale = 0.10000000149011612d;
        faceConfig.detectFaceMaxScale = 0.30000001192092896d;
        faceConfig.usePyramid = true;
        PFaceDetector.setConfig(faceConfig);
    }

    /* renamed from: f */
    public void mo12512f() {
        float f;
        LiveFaceConfig liveFaceConfig;
        mo12489a(0.8f);
        boolean z = this.f2450N && this.f2451O != null;
        this.f2449M = z;
        if (z) {
            this.f2467c.setFaceFarThr(this.f2455S + 0.15f);
            liveFaceConfig = this.f2467c;
            f = this.f2456T + 0.3f;
        } else {
            this.f2467c.setFaceFarThr(this.f2455S);
            liveFaceConfig = this.f2467c;
            f = this.f2456T;
        }
        liveFaceConfig.setFaceCloseThr(f);
        C1032n nVar = this.f2483p;
        if (nVar != null) {
            nVar.mo12647a(this.f2449M);
        }
        this.f2464a0 = 0;
        this.f2452P = false;
        this.f2493z.clear();
        mo12498a(false);
        if (this.f2474g == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1021c.m2615a());
            sb.append(" new DetectionThread");
            mo12507c(sb.toString());
            this.f2474g = new C1024c(this, (C1023a) null);
        }
        if (this.f2473f == null) {
            this.f2473f = new LinkedBlockingDeque(1);
        }
        if (this.f2475h == null) {
            this.f2475h = new C1025d(Looper.getMainLooper());
        }
        this.f2474g.mo12525b(true);
        this.f2474g.start();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1021c.m2615a());
        sb2.append(" startFaceDetect");
        mo12507c(sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r5.f2474g != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        if (r5.f2474g == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        mo12505c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r5.f2452P = false;
        r5.f2474g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12513g() {
        /*
            r5 = this;
            java.lang.String r0 = "stopDetect"
            com.pingan.p031ai.face.utils.PaFaceLogger.m2758i(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.pingan.p031ai.C1021c.m2615a()
            r0.append(r1)
            java.lang.String r1 = " stopDetect"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.mo12507c((java.lang.String) r0)
            r0 = 1
            r1 = 0
            r2 = 0
            r5.mo12498a((boolean) r0)     // Catch:{ Exception -> 0x0070 }
            com.pingan.ai.d$c r0 = r5.f2474g     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0039
            com.pingan.ai.d$c r0 = r5.f2474g     // Catch:{ Exception -> 0x0070 }
            r0.mo12525b((boolean) r2)     // Catch:{ Exception -> 0x0070 }
            com.pingan.ai.d$c r0 = r5.f2474g     // Catch:{ Exception -> 0x0070 }
            boolean r0 = r0.isAlive()     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0039
            com.pingan.ai.d$c r0 = r5.f2474g     // Catch:{ Exception -> 0x0070 }
            r0.interrupt()     // Catch:{ Exception -> 0x0070 }
        L_0x0039:
            com.pingan.ai.i r0 = r5.f2478k     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0042
            com.pingan.ai.i r0 = r5.f2478k     // Catch:{ Exception -> 0x0070 }
            r0.mo55565a((boolean) r2)     // Catch:{ Exception -> 0x0070 }
        L_0x0042:
            com.pingan.ai.f r0 = r5.f2480m     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x004b
            com.pingan.ai.f r0 = r5.f2480m     // Catch:{ Exception -> 0x0070 }
            r0.mo55540a((boolean) r2)     // Catch:{ Exception -> 0x0070 }
        L_0x004b:
            com.pingan.ai.d$d r0 = r5.f2475h     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0056
            com.pingan.ai.d$d r0 = r5.f2475h     // Catch:{ Exception -> 0x0070 }
            r0.removeCallbacksAndMessages(r1)     // Catch:{ Exception -> 0x0070 }
            r5.f2475h = r1     // Catch:{ Exception -> 0x0070 }
        L_0x0056:
            java.util.concurrent.BlockingDeque<com.pingan.ai.face.entity.PreviewFrame> r0 = r5.f2473f     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0061
            java.util.concurrent.BlockingDeque<com.pingan.ai.face.entity.PreviewFrame> r0 = r5.f2473f     // Catch:{ Exception -> 0x0070 }
            r0.clear()     // Catch:{ Exception -> 0x0070 }
            r5.f2473f = r1     // Catch:{ Exception -> 0x0070 }
        L_0x0061:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.mo12489a((float) r0)     // Catch:{ Exception -> 0x0070 }
            r5.mo12509d()     // Catch:{ Exception -> 0x0070 }
            com.pingan.ai.d$c r0 = r5.f2474g
            if (r0 == 0) goto L_0x0092
            goto L_0x008f
        L_0x006e:
            r0 = move-exception
            goto L_0x0097
        L_0x0070:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r3.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "stopDetect throws exception，"
            r3.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x006e }
            r3.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "PaFace Detector"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x006e }
            com.pingan.p031ai.face.utils.PaFaceLogger.error(r0, r3)     // Catch:{ all -> 0x006e }
            com.pingan.ai.d$c r0 = r5.f2474g
            if (r0 == 0) goto L_0x0092
        L_0x008f:
            r5.mo12505c()
        L_0x0092:
            r5.f2452P = r2
            r5.f2474g = r1
            return
        L_0x0097:
            com.pingan.ai.d$c r3 = r5.f2474g
            if (r3 == 0) goto L_0x009e
            r5.mo12505c()
        L_0x009e:
            r5.f2452P = r2
            r5.f2474g = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pingan.p031ai.C1022d.mo12513g():void");
    }
}
