package com.pingan.p031ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.entity.PaFaceDetectFrame;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import pingan.p063ai.paverify.vertify.PFaceDetector;

/* renamed from: com.pingan.ai.f */
public class C8665f {

    /* renamed from: a */
    public C8666a f5366a;

    /* renamed from: b */
    public HandlerThread f5367b;

    /* renamed from: com.pingan.ai.f$a */
    public final class C8666a extends Handler {

        /* renamed from: a */
        public C1022d f5368a;

        /* renamed from: b */
        public LiveFaceConfig f5369b;

        /* renamed from: c */
        public float[] f5370c;

        /* renamed from: d */
        public int f5371d;

        public C8666a(C8665f fVar, Looper looper, C1022d dVar, LiveFaceConfig liveFaceConfig) {
            super(looper);
            this.f5368a = dVar;
            this.f5369b = liveFaceConfig;
        }

        /* renamed from: a */
        public final void mo55541a() {
            this.f5370c = null;
            this.f5371d = 0;
            removeCallbacksAndMessages((Object) null);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (10 == message.what) {
                if (this.f5370c != null) {
                    int i = this.f5371d;
                    this.f5371d = i + 1;
                    if (i < 3) {
                        return;
                    }
                }
                this.f5371d = 0;
                long currentTimeMillis = System.currentTimeMillis();
                float[] nativeGetFeature = PFaceDetector.nativeGetFeature();
                float[] fArr = this.f5370c;
                if (fArr != null) {
                    float nativeCompareFeature = PFaceDetector.nativeCompareFeature(fArr, nativeGetFeature);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb = new StringBuilder();
                    sb.append("native get and compareFeature feature use time:");
                    sb.append(currentTimeMillis2);
                    sb.append(",compareScore=");
                    sb.append(nativeCompareFeature);
                    PaFaceLogger.m2758i(sb.toString());
                    C1022d dVar = this.f5368a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GetAndCompareFeature:");
                    sb2.append(currentTimeMillis2);
                    dVar.mo12510d(sb2.toString());
                    if (this.f5368a.mo12504b()) {
                        C1022d dVar2 = this.f5368a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(C1021c.m2615a());
                        sb3.append(" is detecting all done，reset it.");
                        dVar2.mo12507c(sb3.toString());
                        PaFaceLogger.m2758i("is detecting all done，reset it.");
                        mo55541a();
                    } else if (nativeCompareFeature < this.f5369b.getFeatureCompareThr()) {
                        C1022d dVar3 = this.f5368a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("TrackingError:");
                        sb4.append(C1021c.m2615a());
                        sb4.append(" feature compare failed, compareScore : ");
                        sb4.append(nativeCompareFeature);
                        dVar3.mo12496a(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("TrackingError: feature compare failed, compareScore : ");
                        sb5.append(nativeCompareFeature);
                        PaFaceLogger.error(sb5.toString());
                        this.f5368a.mo12500b(3003);
                        this.f5368a.mo12498a(true);
                        mo55541a();
                        return;
                    }
                }
                this.f5370c = nativeGetFeature;
            }
        }
    }

    public C8665f(C1022d dVar, LiveFaceConfig liveFaceConfig) {
        HandlerThread handlerThread = this.f5367b;
        if (handlerThread == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("compareThread");
            this.f5367b = handlerThread2;
            handlerThread2.start();
        }
        if (this.f5366a == null) {
            this.f5366a = new C8666a(this, this.f5367b.getLooper(), dVar, liveFaceConfig);
        }
    }

    /* renamed from: a */
    public native void mo55539a(PaFaceDetectFrame paFaceDetectFrame);

    /* renamed from: a */
    public void mo55540a(boolean z) {
        C8666a aVar = this.f5366a;
        if (aVar != null) {
            aVar.mo55541a();
        }
        if (z) {
            HandlerThread handlerThread = this.f5367b;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f5367b = null;
            this.f5366a = null;
            PaFaceLogger.m2758i("quit compare thread");
        }
    }
}
