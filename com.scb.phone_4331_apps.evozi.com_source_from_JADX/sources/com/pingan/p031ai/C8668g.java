package com.pingan.p031ai;

import com.pingan.p031ai.face.utils.PaFaceLogger;
import java.util.ArrayList;
import pingan.p063ai.paverify.vertify.PFaceDetector;

/* renamed from: com.pingan.ai.g */
public class C8668g {

    /* renamed from: a */
    public float[] f5374a = new float[6];

    /* renamed from: b */
    public ArrayList<Float> f5375b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<Float> f5376c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<Float> f5377d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Float> f5378e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<Float> f5379f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<Float> f5380g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<Float> f5381h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<Float> f5382i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<Float> f5383j = new ArrayList<>();

    /* renamed from: k */
    public C1022d f5384k;

    public C8668g(C1022d dVar) {
        this.f5384k = dVar;
    }

    /* renamed from: a */
    public void mo55549a() {
        float[] fArr = this.f5374a;
        if (((double) fArr[0]) < 0.5d) {
            this.f5375b.add(Float.valueOf(fArr[0]));
        } else {
            this.f5376c.add(Float.valueOf(fArr[0]));
        }
        this.f5378e.add(Float.valueOf(this.f5374a[0]));
        this.f5379f.add(Float.valueOf(this.f5374a[1]));
        this.f5380g.add(Float.valueOf(this.f5374a[2]));
        this.f5381h.add(Float.valueOf(this.f5374a[3]));
        this.f5382i.add(Float.valueOf(this.f5374a[4]));
        this.f5383j.add(Float.valueOf(this.f5374a[5]));
    }

    /* renamed from: b */
    public float[] mo55550b() {
        float[] nativeGetPoseTrends = PFaceDetector.nativeGetPoseTrends();
        float f = nativeGetPoseTrends[0];
        float f2 = nativeGetPoseTrends[1];
        float f3 = nativeGetPoseTrends[2];
        float[] nativeActionMouthTrends = PFaceDetector.nativeActionMouthTrends();
        float[] nativeActionEyesTrends = PFaceDetector.nativeActionEyesTrends();
        PaFaceLogger.m2759i("PaFace", "calMotionTrends end");
        float[] fArr = this.f5374a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = nativeActionMouthTrends[0];
        fArr[4] = nativeActionEyesTrends[0];
        fArr[5] = nativeActionEyesTrends[1];
        return fArr;
    }

    /* renamed from: c */
    public float[] mo55551c() {
        return this.f5374a;
    }

    /* renamed from: d */
    public void mo55552d() {
        this.f5375b.clear();
        this.f5376c.clear();
        this.f5377d.clear();
        this.f5378e.clear();
        this.f5380g.clear();
        this.f5379f.clear();
        this.f5381h.clear();
        this.f5382i.clear();
        this.f5383j.clear();
    }

    /* renamed from: e */
    public void mo55553e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5375b.size());
        sb.append(" : ");
        for (int i = 0; i < this.f5375b.size(); i++) {
            sb.append(this.f5375b.get(i));
            sb.append(";");
        }
        C1022d dVar = this.f5384k;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1021c.m2615a());
        sb2.append(" showCalMotionTrends poseYawLeftTrends");
        sb2.append(sb.toString());
        dVar.mo12507c(sb2.toString());
        sb.setLength(0);
        sb.append(this.f5376c.size());
        sb.append(" : ");
        for (int i2 = 0; i2 < this.f5376c.size(); i2++) {
            sb.append(this.f5376c.get(i2));
            sb.append(";");
        }
        C1022d dVar2 = this.f5384k;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C1021c.m2615a());
        sb3.append(" showCalMotionTrends poseYawRightTrends");
        sb3.append(sb.toString());
        dVar2.mo12507c(sb3.toString());
        sb.setLength(0);
        sb.append(this.f5378e.size());
        sb.append(" : ");
        for (int i3 = 0; i3 < this.f5378e.size(); i3++) {
            sb.append(this.f5378e.get(i3));
            sb.append(";");
        }
        C1022d dVar3 = this.f5384k;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C1021c.m2615a());
        sb4.append(" showCalMotionTrends poseYawTrends");
        sb4.append(sb.toString());
        dVar3.mo12507c(sb4.toString());
        sb.setLength(0);
        sb.append(this.f5380g.size());
        sb.append(" : ");
        for (int i4 = 0; i4 < this.f5380g.size(); i4++) {
            sb.append(this.f5380g.get(i4));
            sb.append(";");
        }
        C1022d dVar4 = this.f5384k;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C1021c.m2615a());
        sb5.append(" showCalMotionTrends posePitchTrends");
        sb5.append(sb.toString());
        dVar4.mo12507c(sb5.toString());
        sb.setLength(0);
        sb.append(this.f5379f.size());
        sb.append(" : ");
        for (int i5 = 0; i5 < this.f5379f.size(); i5++) {
            sb.append(this.f5379f.get(i5));
            sb.append(";");
        }
        C1022d dVar5 = this.f5384k;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(C1021c.m2615a());
        sb6.append(" showCalMotionTrends poseRollTrends");
        sb6.append(sb.toString());
        dVar5.mo12507c(sb6.toString());
        sb.setLength(0);
        sb.append(this.f5377d.size());
        sb.append(" : ");
        for (int i6 = 0; i6 < this.f5377d.size(); i6++) {
            sb.append(this.f5377d.get(i6));
            sb.append(";");
        }
        C1022d dVar6 = this.f5384k;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(C1021c.m2615a());
        sb7.append(" showCalMotionTrends nodeTrends");
        sb7.append(sb.toString());
        dVar6.mo12507c(sb7.toString());
        sb.setLength(0);
        sb.append(this.f5381h.size());
        sb.append(" : ");
        for (int i7 = 0; i7 < this.f5381h.size(); i7++) {
            sb.append(this.f5381h.get(i7));
            sb.append(";");
        }
        C1022d dVar7 = this.f5384k;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(C1021c.m2615a());
        sb8.append(" showCalMotionTrends mouthTrends");
        sb8.append(sb.toString());
        dVar7.mo12507c(sb8.toString());
        sb.setLength(0);
        sb.append(this.f5382i.size());
        sb.append(" : ");
        for (int i8 = 0; i8 < this.f5382i.size(); i8++) {
            sb.append(this.f5382i.get(i8));
            sb.append(";");
        }
        C1022d dVar8 = this.f5384k;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(C1021c.m2615a());
        sb9.append(" showCalMotionTrends eyeLeftTrends");
        sb9.append(sb.toString());
        dVar8.mo12507c(sb9.toString());
        sb.setLength(0);
        sb.append(this.f5383j.size());
        sb.append(" : ");
        for (int i9 = 0; i9 < this.f5383j.size(); i9++) {
            sb.append(this.f5383j.get(i9));
            sb.append(";");
        }
        C1022d dVar9 = this.f5384k;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(C1021c.m2615a());
        sb10.append(" showCalMotionTrends eyeRightTrends");
        sb10.append(sb.toString());
        dVar9.mo12507c(sb10.toString());
    }
}
