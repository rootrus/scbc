package com.pingan.p031ai;

import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import pingan.p063ai.paverify.vertify.PFaceDetector;

/* renamed from: com.pingan.ai.m */
public class C8675m {

    /* renamed from: a */
    public int f5415a = 0;

    /* renamed from: b */
    public int f5416b = 0;

    /* renamed from: c */
    public int f5417c = 0;

    /* renamed from: d */
    public int f5418d = 8;

    /* renamed from: e */
    public int f5419e = 0;

    /* renamed from: f */
    public int f5420f = 0;

    /* renamed from: g */
    public long f5421g = 0;

    /* renamed from: h */
    public int f5422h = 0;

    /* renamed from: i */
    public C1022d f5423i;

    /* renamed from: j */
    public LiveFaceConfig f5424j;

    public C8675m(C1022d dVar, LiveFaceConfig liveFaceConfig) {
        this.f5423i = dVar;
        this.f5424j = liveFaceConfig;
    }

    /* renamed from: a */
    public int mo55575a() {
        return this.f5415a + this.f5416b;
    }

    /* renamed from: a */
    public void mo55576a(int i) {
        int i2 = 0;
        if (i == 0) {
            this.f5418d = 8;
            this.f5419e = 0;
        } else {
            this.f5418d = 0;
            if (i == 1) {
                this.f5419e = 4;
                this.f5420f = 4;
                StringBuilder sb = new StringBuilder();
                sb.append("n=");
                sb.append(this.f5418d);
                sb.append(",m=");
                sb.append(this.f5419e);
                sb.append(",s=");
                sb.append(this.f5420f);
                PaFaceLogger.m2758i(sb.toString());
            }
            this.f5419e = i << 1;
            i2 = 2;
        }
        this.f5420f = i2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("n=");
        sb2.append(this.f5418d);
        sb2.append(",m=");
        sb2.append(this.f5419e);
        sb2.append(",s=");
        sb2.append(this.f5420f);
        PaFaceLogger.m2758i(sb2.toString());
    }

    /* renamed from: a */
    public native void mo55577a(LiveFaceConfig liveFaceConfig);

    /* renamed from: b */
    public int mo55578b() {
        return this.f5418d;
    }

    /* renamed from: c */
    public boolean mo55579c() {
        return this.f5415a + this.f5416b > (this.f5418d + this.f5419e) / 2;
    }

    /* renamed from: d */
    public boolean mo55580d() {
        return this.f5416b >= this.f5419e || this.f5417c >= this.f5420f;
    }

    /* renamed from: e */
    public boolean mo55581e() {
        if (this.f5416b >= this.f5419e || this.f5417c >= this.f5420f) {
            this.f5417c = 0;
            return false;
        }
        PFaceDetector.m3590a();
        this.f5416b++;
        this.f5417c++;
        C1022d dVar = this.f5423i;
        StringBuilder sb = new StringBuilder();
        sb.append(C1021c.m2615a());
        sb.append(" motion ranking size:");
        sb.append(this.f5416b);
        dVar.mo12507c(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("motion ranking size:");
        sb2.append(this.f5416b);
        PaFaceLogger.m2758i(sb2.toString());
        return true;
    }

    /* renamed from: f */
    public boolean mo55582f() {
        boolean z = System.currentTimeMillis() - this.f5421g <= ((long) C8682x.m5714s(this.f5424j));
        if (this.f5415a >= this.f5418d || (!z && this.f5416b > 0)) {
            C1022d dVar = this.f5423i;
            StringBuilder sb = new StringBuilder();
            sb.append(C1021c.m2615a());
            sb.append(" collectedNormalFaceRankingFrameCount :ranking size:");
            sb.append(this.f5415a);
            dVar.mo12507c(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("nf ranking size:");
            sb2.append(this.f5415a);
            PaFaceLogger.m2758i(sb2.toString());
            return false;
        }
        PFaceDetector.m3590a();
        this.f5415a++;
        int i = this.f5422h;
        this.f5422h = i + 1;
        if (i == 0) {
            this.f5421g = System.currentTimeMillis();
        }
        return true;
    }

    /* renamed from: g */
    public void mo55583g() {
        this.f5415a = 0;
        this.f5416b = 0;
        this.f5417c = 0;
        PFaceDetector.nativeRanking(true);
        this.f5422h = 0;
        this.f5421g = 0;
    }
}
