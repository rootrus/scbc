package com.pingan.p031ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pingan.p031ai.face.common.FixedLinkedList;
import com.pingan.p031ai.face.entity.PaFaceDetectFrame;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import java.util.Iterator;
import java.util.LinkedList;
import pingan.p063ai.paverify.vertify.PFaceDetector;

/* renamed from: com.pingan.ai.i */
public class C8670i {

    /* renamed from: a */
    public C8671a f5401a;

    /* renamed from: b */
    public HandlerThread f5402b;

    /* renamed from: com.pingan.ai.i$a */
    public final class C8671a extends Handler {

        /* renamed from: a */
        public LinkedList<Float> f5403a = new FixedLinkedList(5);

        /* renamed from: b */
        public C1022d f5404b;

        /* renamed from: c */
        public int f5405c = 0;

        public C8671a(C8670i iVar, Looper looper, C1022d dVar) {
            super(looper);
            this.f5404b = dVar;
        }

        /* renamed from: a */
        public final void mo55566a() {
            this.f5405c = 0;
            this.f5403a.clear();
            removeCallbacksAndMessages((Object) null);
        }

        public final void handleMessage(Message message) {
            PaFaceDetectFrame paFaceDetectFrame;
            super.handleMessage(message);
            if (10 == message.what && (paFaceDetectFrame = (PaFaceDetectFrame) message.obj) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                float nativeImageOptLive = PFaceDetector.nativeImageOptLive(paFaceDetectFrame.frame, paFaceDetectFrame.frameOri, paFaceDetectFrame.frameWidth, paFaceDetectFrame.frameHeight, paFaceDetectFrame.landmarkPosition);
                StringBuilder sb = new StringBuilder();
                sb.append("nativeImageOptLive live score : ");
                sb.append(nativeImageOptLive);
                sb.append(",noLivingNum:");
                sb.append(this.f5405c);
                sb.append(",scoreListSize=");
                sb.append(this.f5403a.size());
                sb.append(", atomic optLive use time:");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                PaFaceLogger.m2758i(sb.toString());
                C1022d dVar = this.f5404b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C1021c.m2615a());
                sb2.append(" nativeImageOptLive live score : ");
                sb2.append(nativeImageOptLive);
                sb2.append(",noLivingNum:");
                sb2.append(this.f5405c);
                sb2.append(",scoreListSize=");
                sb2.append(this.f5403a.size());
                sb2.append(", atomic optLive use time:");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                dVar.mo12507c(sb2.toString());
                if (nativeImageOptLive > 0.0045f) {
                    this.f5403a.add(Float.valueOf(nativeImageOptLive));
                    if (this.f5403a.size() == 5) {
                        float f = BitmapDescriptorFactory.HUE_RED;
                        Iterator<Float> it = this.f5403a.iterator();
                        while (it.hasNext()) {
                            f += it.next().floatValue();
                        }
                        float f2 = f / 5.0f;
                        if (f2 > 0.5f) {
                            this.f5403a.clear();
                            this.f5405c = 0;
                        } else {
                            this.f5405c++;
                        }
                        C1022d dVar2 = this.f5404b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(C1021c.m2615a());
                        sb3.append(" detect live vote,average live score : ");
                        sb3.append(f2);
                        sb3.append(", noLivingNum:");
                        sb3.append(this.f5405c);
                        dVar2.mo12507c(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("detect live vote,average live score : ");
                        sb4.append(f2);
                        PaFaceLogger.m2758i(sb4.toString());
                    }
                } else {
                    this.f5405c++;
                    C1022d dVar3 = this.f5404b;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(C1021c.m2615a());
                    sb5.append(" noLivingNum : ");
                    sb5.append(this.f5405c);
                    dVar3.mo12507c(sb5.toString());
                }
                if (this.f5404b.mo12504b()) {
                    C1022d dVar4 = this.f5404b;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(C1021c.m2615a());
                    sb6.append(" is detecting all done，reset it.");
                    dVar4.mo12507c(sb6.toString());
                    PaFaceLogger.m2758i("is detecting all done，reset it.");
                    mo55566a();
                } else if (this.f5405c >= 3) {
                    C1022d dVar5 = this.f5404b;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(C1021c.m2615a());
                    sb7.append(" SILENT_ERROR，live vote failed");
                    dVar5.mo12496a(sb7.toString());
                    PaFaceLogger.error("SILENT_ERROR，live vote failed");
                    this.f5404b.mo12500b(3001);
                    this.f5404b.mo12498a(true);
                    mo55566a();
                }
            }
        }
    }

    public C8670i(C1022d dVar) {
        HandlerThread handlerThread = this.f5402b;
        if (handlerThread == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("silentLiveThread");
            this.f5402b = handlerThread2;
            handlerThread2.start();
        }
        if (this.f5401a == null) {
            this.f5401a = new C8671a(this, this.f5402b.getLooper(), dVar);
        }
    }

    /* renamed from: a */
    public native void mo55564a(PaFaceDetectFrame paFaceDetectFrame);

    /* renamed from: a */
    public void mo55565a(boolean z) {
        C8671a aVar = this.f5401a;
        if (aVar != null) {
            aVar.mo55566a();
        }
        if (z) {
            HandlerThread handlerThread = this.f5402b;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f5402b = null;
            this.f5401a = null;
            PaFaceLogger.m2758i("quit multi live thread");
        }
    }
}
