package com.pingan.p031ai;

import com.pingan.p031ai.face.common.PaFaceConstants;
import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import java.util.ArrayList;

/* renamed from: com.pingan.ai.h */
public class C8669h extends C8668g {

    /* renamed from: A */
    public LiveFaceConfig f5385A;

    /* renamed from: l */
    public boolean f5386l = false;

    /* renamed from: m */
    public boolean f5387m = false;

    /* renamed from: n */
    public boolean f5388n = false;

    /* renamed from: o */
    public boolean f5389o = false;

    /* renamed from: p */
    public boolean f5390p = false;

    /* renamed from: q */
    public boolean f5391q = false;

    /* renamed from: r */
    public boolean f5392r = false;

    /* renamed from: s */
    public boolean f5393s = false;

    /* renamed from: t */
    public boolean f5394t = false;

    /* renamed from: u */
    public boolean f5395u = false;

    /* renamed from: v */
    public boolean f5396v = false;

    /* renamed from: w */
    public boolean f5397w = false;

    /* renamed from: x */
    public boolean f5398x = false;

    /* renamed from: y */
    public boolean f5399y = false;

    /* renamed from: z */
    public C1022d f5400z;

    public C8669h(C1022d dVar, LiveFaceConfig liveFaceConfig) {
        super(dVar);
        this.f5400z = dVar;
        this.f5385A = liveFaceConfig;
    }

    /* renamed from: a */
    public native void mo55554a(LiveFaceConfig liveFaceConfig);

    /* renamed from: a */
    public boolean mo55555a(String str) {
        float f;
        StringBuilder sb;
        if (((double) this.f5374a[1]) < 0.5d - ((double) C8682x.m5715t(this.f5385A))) {
            this.f5400z.mo12506c(this.f5400z.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_ROLL_RIGHT));
            C1022d dVar = this.f5400z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FaceRollRight:");
            sb2.append(C1021c.m2615a());
            sb2.append(" errorFace:rollLeft,roll=");
            sb2.append(this.f5374a[1]);
            dVar.mo12496a(sb2.toString());
            sb = new StringBuilder();
            sb.append("FACE_ROLL_RIGHT ");
            sb.append(str);
            sb.append(" roll=");
            f = this.f5374a[1];
        } else if (((double) this.f5374a[1]) <= ((double) C8682x.m5715t(this.f5385A)) + 0.5d) {
            return false;
        } else {
            this.f5400z.mo12506c(this.f5400z.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_ROLL_LEFT));
            C1022d dVar2 = this.f5400z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("FaceRollLeft:");
            sb3.append(C1021c.m2615a());
            sb3.append(" errorFace:rollRight,roll=");
            sb3.append(this.f5374a[1]);
            dVar2.mo12496a(sb3.toString());
            sb = new StringBuilder();
            sb.append("FACE_ROLL_LEFT ");
            sb.append(str);
            sb.append(" roll=");
            f = this.f5374a[1];
        }
        sb.append(f);
        PaFaceLogger.error(sb.toString());
        return true;
    }

    /* renamed from: b */
    public boolean mo55556b(String str) {
        C1022d dVar;
        int i;
        if (((double) mo55551c()[2]) < 0.5d - ((double) C8682x.m5713r(this.f5385A))) {
            C1022d dVar2 = this.f5400z;
            StringBuilder sb = new StringBuilder();
            sb.append("FacePitchUp:");
            sb.append(C1021c.m2615a());
            sb.append(" Stable:pitchUp,reset stableFrame，pitch=");
            sb.append(mo55551c()[2]);
            dVar2.mo12496a(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STABLE_FACE_PITCH_UP，reset stableFrame. ");
            sb2.append(str);
            sb2.append(" pitch=");
            sb2.append(mo55551c()[2]);
            PaFaceLogger.error(sb2.toString());
            dVar = this.f5400z;
            i = PaFaceConstants.EnvironmentalTips.FACE_PITCH_UP;
        } else if (((double) mo55551c()[2]) > ((double) C8682x.m5713r(this.f5385A)) + 0.5d) {
            C1022d dVar3 = this.f5400z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("FacePitchDown:");
            sb3.append(C1021c.m2615a());
            sb3.append(" Stable:pitchDown,reset stableFrame，pitch=");
            sb3.append(mo55551c()[2]);
            dVar3.mo12496a(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("STABLE_FACE_PITCH_DOWN，reset stableFrame. ");
            sb4.append(str);
            sb4.append(" pitch=");
            sb4.append(mo55551c()[2]);
            PaFaceLogger.error(sb4.toString());
            dVar = this.f5400z;
            i = PaFaceConstants.EnvironmentalTips.FACE_PITCH_DOWN;
        } else if (((double) mo55551c()[1]) < 0.5d - ((double) C8682x.m5715t(this.f5385A))) {
            C1022d dVar4 = this.f5400z;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("FaceRollLeft:");
            sb5.append(C1021c.m2615a());
            sb5.append(" Stable:rollLeft,reset stableFrame，roll=");
            sb5.append(mo55551c()[1]);
            dVar4.mo12496a(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("STABLE_FACE_ROLL_RIGHT，reset stableFrame. ");
            sb6.append(str);
            sb6.append(" roll=");
            sb6.append(mo55551c()[1]);
            PaFaceLogger.error(sb6.toString());
            dVar = this.f5400z;
            i = PaFaceConstants.EnvironmentalTips.FACE_ROLL_LEFT;
        } else if (((double) mo55551c()[1]) > ((double) C8682x.m5715t(this.f5385A)) + 0.5d) {
            C1022d dVar5 = this.f5400z;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("FaceRollRight:");
            sb7.append(C1021c.m2615a());
            sb7.append(" Stable:rollRight,reset stableFrame，roll=");
            sb7.append(mo55551c()[1]);
            dVar5.mo12496a(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("STABLE_FACE_ROLL_LEFT，reset stableFrame. ");
            sb8.append(str);
            sb8.append(" roll=");
            sb8.append(mo55551c()[1]);
            PaFaceLogger.error(sb8.toString());
            dVar = this.f5400z;
            i = PaFaceConstants.EnvironmentalTips.FACE_ROLL_RIGHT;
        } else if (((double) mo55551c()[0]) > ((double) C8682x.m5719x(this.f5385A)) + 0.5d) {
            C1022d dVar6 = this.f5400z;
            StringBuilder sb9 = new StringBuilder();
            sb9.append("FaceYawRight:");
            sb9.append(C1021c.m2615a());
            sb9.append(" Stable:yawRight,reset stableFrame，yaw=");
            sb9.append(mo55551c()[0]);
            dVar6.mo12496a(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("STABLE_FACE_YAW_RIGHT，reset stableFrame. ");
            sb10.append(str);
            sb10.append(" yaw=");
            sb10.append(mo55551c()[0]);
            PaFaceLogger.error(sb10.toString());
            dVar = this.f5400z;
            i = PaFaceConstants.EnvironmentalTips.FACE_YAW_RIGHT;
        } else if (((double) mo55551c()[0]) >= 0.5d - ((double) C8682x.m5719x(this.f5385A))) {
            return true;
        } else {
            C1022d dVar7 = this.f5400z;
            StringBuilder sb11 = new StringBuilder();
            sb11.append("FaceYawLeft:");
            sb11.append(C1021c.m2615a());
            sb11.append(" Stable:yawLeft,reset stableFrame，yaw=");
            sb11.append(mo55551c()[0]);
            dVar7.mo12496a(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append("STABLE_FACE_YAW_LEFT，reset stableFrame. ");
            sb12.append(str);
            sb12.append(" yaw=");
            sb12.append(mo55551c()[0]);
            PaFaceLogger.error(sb12.toString());
            dVar = this.f5400z;
            i = PaFaceConstants.EnvironmentalTips.FACE_YAW_LEFT;
        }
        this.f5400z.mo12506c(dVar.mo12487a(i));
        return false;
    }

    /* renamed from: c */
    public boolean mo55557c(String str) {
        float f;
        StringBuilder sb;
        if (C8682x.m5690A(this.f5385A)) {
            return false;
        }
        if (((double) this.f5374a[2]) < 0.5d - ((double) C8682x.m5707l(this.f5385A))) {
            this.f5400z.mo12500b(3004);
            C1022d dVar = this.f5400z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ActionError:");
            sb2.append(C1021c.m2615a());
            sb2.append(" nod head attack,pitchUp,pitch=");
            sb2.append(this.f5374a[2]);
            dVar.mo12496a(sb2.toString());
            sb = new StringBuilder();
            sb.append("ACTION_ERROR,FACE_PITCH_UP ");
            sb.append(str);
            sb.append(" pitch=");
            f = this.f5374a[2];
        } else if (((double) this.f5374a[2]) <= ((double) C8682x.m5707l(this.f5385A)) + 0.5d) {
            return false;
        } else {
            this.f5400z.mo12500b(3004);
            C1022d dVar2 = this.f5400z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ActionError:");
            sb3.append(C1021c.m2615a());
            sb3.append(" nod head attack,pitchDown,pitch=");
            sb3.append(this.f5374a[2]);
            dVar2.mo12496a(sb3.toString());
            sb = new StringBuilder();
            sb.append("ACTION_ERROR,FACE_PITCH_DOWN ");
            sb.append(str);
            sb.append(" pitch=");
            f = this.f5374a[2];
        }
        sb.append(f);
        PaFaceLogger.error(sb.toString());
        this.f5400z.mo12498a(true);
        return true;
    }

    /* renamed from: d */
    public boolean mo55558d(String str) {
        float f;
        StringBuilder sb;
        if (((double) this.f5374a[2]) < 0.5d - ((double) C8682x.m5713r(this.f5385A))) {
            this.f5400z.mo12506c(this.f5400z.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_PITCH_UP));
            C1022d dVar = this.f5400z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FacePitchUp:");
            sb2.append(C1021c.m2615a());
            sb2.append(" errorFace:pitchUp,pitch=");
            sb2.append(this.f5374a[2]);
            dVar.mo12496a(sb2.toString());
            sb = new StringBuilder();
            sb.append("ACTION_ERROR,FACE_PITCH_UP ");
            sb.append(str);
            sb.append(" pitch=");
            f = this.f5374a[2];
        } else if (((double) this.f5374a[2]) <= ((double) C8682x.m5713r(this.f5385A)) + 0.5d) {
            return false;
        } else {
            this.f5400z.mo12506c(this.f5400z.mo12487a((int) PaFaceConstants.EnvironmentalTips.FACE_PITCH_DOWN));
            C1022d dVar2 = this.f5400z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("FacePitchDown:");
            sb3.append(C1021c.m2615a());
            sb3.append(" errorFace:pitchDown,pitch=");
            sb3.append(this.f5374a[2]);
            dVar2.mo12496a(sb3.toString());
            sb = new StringBuilder();
            sb.append("ACTION_ERROR,FACE_PITCH_DOWN ");
            sb.append(str);
            sb.append(" pitch=");
            f = this.f5374a[2];
        }
        sb.append(f);
        PaFaceLogger.error(sb.toString());
        return true;
    }

    /* renamed from: e */
    public boolean mo55559e(String str) {
        float f;
        StringBuilder sb;
        if (str.equals("detect eye") || str.equals("detect mouth")) {
            if (C8682x.m5691B(this.f5385A)) {
                return false;
            }
        } else if (C8682x.m5695F(this.f5385A)) {
            return false;
        }
        if (((double) this.f5374a[0]) > ((double) C8682x.m5716u(this.f5385A)) + 0.5d) {
            this.f5400z.mo12500b(3004);
            C1022d dVar = this.f5400z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ActionError:");
            sb2.append(C1021c.m2615a());
            sb2.append(" shake head attack,yawRight,yaw=");
            sb2.append(this.f5374a[0]);
            dVar.mo12496a(sb2.toString());
            sb = new StringBuilder();
            sb.append("ACTION_ERROR,FACE_YAW_RIGHT ");
            sb.append(str);
            sb.append(" yaw=");
            f = this.f5374a[0];
        } else if (((double) this.f5374a[0]) >= 0.5d - ((double) C8682x.m5716u(this.f5385A))) {
            return false;
        } else {
            this.f5400z.mo12500b(3004);
            C1022d dVar2 = this.f5400z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ActionError:");
            sb3.append(C1021c.m2615a());
            sb3.append(" shake head attack,yawLeft,yaw=");
            sb3.append(this.f5374a[0]);
            dVar2.mo12496a(sb3.toString());
            sb = new StringBuilder();
            sb.append("ACTION_ERROR,FACE_YAW_LEFT ");
            sb.append(str);
            sb.append(" yaw=");
            f = this.f5374a[0];
        }
        sb.append(f);
        PaFaceLogger.error(sb.toString());
        this.f5400z.mo12498a(true);
        return true;
    }

    /* renamed from: f */
    public boolean mo55560f() {
        return Math.abs(((double) mo55551c()[2]) - 0.5d) <= ((double) C8682x.m5713r(this.f5385A)) && Math.abs(((double) mo55551c()[1]) - 0.5d) <= ((double) C8682x.m5715t(this.f5385A)) && Math.abs(((double) mo55551c()[0]) - 0.5d) <= ((double) C8682x.m5719x(this.f5385A));
    }

    /* renamed from: g */
    public boolean mo55561g() {
        String str;
        StringBuilder sb;
        if (this.f5399y) {
            return true;
        }
        ArrayList<Float> arrayList = this.f5380g;
        if (((double) arrayList.get(arrayList.size() - 1).floatValue()) > ((double) C8682x.m5713r(this.f5385A)) + 0.5d) {
            C1022d dVar = this.f5400z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1021c.m2615a());
            sb2.append(" errorFace:pitch,pitch=");
            ArrayList<Float> arrayList2 = this.f5380g;
            sb2.append(arrayList2.get(arrayList2.size() - 1));
            dVar.mo12496a(sb2.toString());
            sb = new StringBuilder();
            str = "FACE_PITCH_UP nodHeadForward pitch=";
        } else {
            ArrayList<Float> arrayList3 = this.f5380g;
            if (((double) arrayList3.get(arrayList3.size() - 1).floatValue()) < 0.5d - ((double) C8682x.m5713r(this.f5385A))) {
                C1022d dVar2 = this.f5400z;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C1021c.m2615a());
                sb3.append(" errorFace:pitch,pitch=");
                ArrayList<Float> arrayList4 = this.f5380g;
                sb3.append(arrayList4.get(arrayList4.size() - 1));
                dVar2.mo12496a(sb3.toString());
                sb = new StringBuilder();
                str = "FACE_PITCH_DOWN nodHeadForward pitch=";
            } else {
                this.f5399y = true;
                return false;
            }
        }
        sb.append(str);
        ArrayList<Float> arrayList5 = this.f5380g;
        sb.append(arrayList5.get(arrayList5.size() - 1));
        PaFaceLogger.error(sb.toString());
        return false;
    }

    /* renamed from: h */
    public void mo55562h() {
        this.f5386l = false;
        this.f5387m = false;
        this.f5388n = false;
        this.f5389o = false;
        this.f5390p = false;
        this.f5391q = false;
        this.f5392r = false;
        this.f5393s = false;
        this.f5394t = false;
        this.f5395u = false;
        this.f5396v = false;
        this.f5397w = false;
        this.f5398x = false;
        this.f5399y = false;
        mo55552d();
    }

    /* renamed from: i */
    public boolean mo55563i() {
        String str;
        StringBuilder sb;
        if (this.f5399y) {
            return true;
        }
        ArrayList<Float> arrayList = this.f5378e;
        if (((double) arrayList.get(arrayList.size() - 1).floatValue()) > ((double) C8682x.m5719x(this.f5385A)) + 0.5d) {
            C1022d dVar = this.f5400z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1021c.m2615a());
            sb2.append(" errorFace:yaw,yaw=");
            ArrayList<Float> arrayList2 = this.f5378e;
            sb2.append(arrayList2.get(arrayList2.size() - 1));
            dVar.mo12496a(sb2.toString());
            sb = new StringBuilder();
            str = "FACE_YAW_RIGHT shakeHeadForward yaw=";
        } else {
            ArrayList<Float> arrayList3 = this.f5378e;
            if (((double) arrayList3.get(arrayList3.size() - 1).floatValue()) < 0.5d - ((double) C8682x.m5719x(this.f5385A))) {
                C1022d dVar2 = this.f5400z;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C1021c.m2615a());
                sb3.append(" errorFace:yaw,yaw=");
                ArrayList<Float> arrayList4 = this.f5378e;
                sb3.append(arrayList4.get(arrayList4.size() - 1));
                dVar2.mo12496a(sb3.toString());
                sb = new StringBuilder();
                str = "FACE_YAW_LEFT shakeHeadForward yaw=";
            } else {
                this.f5399y = true;
                return false;
            }
        }
        sb.append(str);
        ArrayList<Float> arrayList5 = this.f5378e;
        sb.append(arrayList5.get(arrayList5.size() - 1));
        PaFaceLogger.error(sb.toString());
        return false;
    }
}
