package com.pingan.p031ai;

import com.pingan.p031ai.face.utils.PaFaceLogger;

/* renamed from: com.pingan.ai.o */
public class C8676o {

    /* renamed from: a */
    public long f5425a = 0;

    /* renamed from: b */
    public int f5426b = 0;

    /* renamed from: c */
    public long f5427c = 0;

    /* renamed from: d */
    public int f5428d = 0;

    /* renamed from: e */
    public long f5429e = 0;

    /* renamed from: f */
    public int f5430f = 0;

    /* renamed from: g */
    public long f5431g = 0;

    /* renamed from: h */
    public int f5432h = 0;

    /* renamed from: i */
    public long f5433i = 0;

    /* renamed from: j */
    public int f5434j = 0;

    /* renamed from: k */
    public long f5435k = 0;

    /* renamed from: l */
    public int f5436l = 0;

    /* renamed from: m */
    public C1022d f5437m;

    public C8676o(C1022d dVar) {
        this.f5437m = dVar;
    }

    /* renamed from: a */
    public void mo55584a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5429e;
        C1022d dVar = this.f5437m;
        StringBuilder sb = new StringBuilder();
        sb.append("BlinkEye:");
        sb.append(currentTimeMillis);
        dVar.mo12510d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("detectEye use time:");
        sb2.append(currentTimeMillis);
        PaFaceLogger.m2758i(sb2.toString());
    }

    /* renamed from: b */
    public void mo55585b() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5435k;
        C1022d dVar = this.f5437m;
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLightLive:");
        sb.append(currentTimeMillis);
        dVar.mo12510d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("detectAurora use time:");
        sb2.append(currentTimeMillis);
        PaFaceLogger.m2758i(sb2.toString());
    }

    /* renamed from: c */
    public void mo55586c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5433i;
        C1022d dVar = this.f5437m;
        StringBuilder sb = new StringBuilder();
        sb.append("NodHead:");
        sb.append(currentTimeMillis);
        dVar.mo12510d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("detectNodHead use time:");
        sb2.append(currentTimeMillis);
        PaFaceLogger.m2758i(sb2.toString());
    }

    /* renamed from: d */
    public void mo55587d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5427c;
        C1022d dVar = this.f5437m;
        StringBuilder sb = new StringBuilder();
        sb.append("OpenMouth:");
        sb.append(currentTimeMillis);
        dVar.mo12510d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("detectMouth use time:");
        sb2.append(currentTimeMillis);
        PaFaceLogger.m2758i(sb2.toString());
    }

    /* renamed from: e */
    public void mo55588e() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5431g;
        C1022d dVar = this.f5437m;
        StringBuilder sb = new StringBuilder();
        sb.append("ShakeHead:");
        sb.append(currentTimeMillis);
        dVar.mo12510d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("detect shake head use time:");
        sb2.append(currentTimeMillis);
        PaFaceLogger.m2758i(sb2.toString());
    }

    /* renamed from: f */
    public void mo55589f() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5425a;
        C1022d dVar = this.f5437m;
        StringBuilder sb = new StringBuilder();
        sb.append("AllDetect:");
        sb.append(currentTimeMillis);
        dVar.mo12510d(sb.toString());
        C1022d dVar2 = this.f5437m;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1021c.m2615a());
        sb2.append(" all detect complete.");
        dVar2.mo12507c(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("all detect complete use time:");
        sb3.append(currentTimeMillis);
        PaFaceLogger.m2758i(sb3.toString());
    }

    /* renamed from: g */
    public void mo55590g() {
        int i = this.f5430f;
        this.f5430f = i + 1;
        if (i == 0) {
            this.f5429e = System.currentTimeMillis();
        }
    }

    /* renamed from: h */
    public void mo55591h() {
        int i = this.f5436l;
        this.f5436l = i + 1;
        if (i == 0) {
            this.f5435k = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public void mo55592i() {
        int i = this.f5434j;
        this.f5434j = i + 1;
        if (i == 0) {
            this.f5433i = System.currentTimeMillis();
        }
    }

    /* renamed from: j */
    public void mo55593j() {
        int i = this.f5428d;
        this.f5428d = i + 1;
        if (i == 0) {
            this.f5427c = System.currentTimeMillis();
        }
    }

    /* renamed from: k */
    public void mo55594k() {
        int i = this.f5432h;
        this.f5432h = i + 1;
        if (i == 0) {
            this.f5431g = System.currentTimeMillis();
        }
    }

    /* renamed from: l */
    public void mo55595l() {
        int i = this.f5426b;
        this.f5426b = i + 1;
        if (i == 0) {
            this.f5425a = System.currentTimeMillis();
        }
    }

    /* renamed from: m */
    public void mo55596m() {
        this.f5426b = 0;
        this.f5425a = 0;
        this.f5428d = 0;
        this.f5427c = 0;
        this.f5430f = 0;
        this.f5429e = 0;
        this.f5432h = 0;
        this.f5431g = 0;
        this.f5434j = 0;
        this.f5433i = 0;
        this.f5436l = 0;
        this.f5435k = 0;
    }
}
