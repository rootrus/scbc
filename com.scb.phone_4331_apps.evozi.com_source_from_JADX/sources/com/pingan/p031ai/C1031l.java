package com.pingan.p031ai;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pingan.p031ai.face.utils.PaFaceLogger;

/* renamed from: com.pingan.ai.l */
public class C1031l {

    /* renamed from: a */
    public float f2515a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    public int f2516b = 0;

    /* renamed from: a */
    public void mo12642a(int i, float f, C8675m mVar) {
        int i2 = 8;
        int b = mVar != null ? mVar.mo55578b() : 8;
        if (f != -1.0f) {
            this.f2515a = f / ((float) ((this.f2516b == 0 || i != 1001) ? 1 : 2));
            StringBuilder sb = new StringBuilder();
            sb.append("fixProcess=");
            sb.append(f);
            sb.append(", tips=");
            sb.append(i);
            sb.append(", process=");
            sb.append(this.f2515a);
            sb.append("，processNum=");
            sb.append(this.f2516b);
            PaFaceLogger.m2759i(PaFaceLogger.TAG, sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fixProcess=-1，processNum=");
        sb2.append(this.f2516b);
        sb2.append(", tips=");
        sb2.append(i);
        sb2.append(", process=");
        sb2.append(this.f2515a);
        PaFaceLogger.m2759i(PaFaceLogger.TAG, sb2.toString());
        int i3 = this.f2516b;
        if (i3 == 0) {
            double d = (double) this.f2515a;
            if (b > 0) {
                i2 = b;
            }
            float f2 = (float) (d + (1.0d / ((double) i2)));
            this.f2515a = f2;
            if (((double) f2) > 0.98d) {
                f2 = 0.98f;
            }
            this.f2515a = f2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("calProcess，current process=");
            sb3.append(this.f2515a);
            PaFaceLogger.m2759i(PaFaceLogger.TAG, sb3.toString());
            return;
        }
        if (i == 1001) {
            double d2 = (double) this.f2515a;
            if (b > 0) {
                i2 = b;
            }
            float f3 = (float) (d2 + (0.5d / ((double) i2)));
            this.f2515a = f3;
            if (((double) f3) > 0.48d) {
                f3 = 0.48f;
            }
            this.f2515a = f3;
        } else if (i == 1006) {
            this.f2515a = (float) (((double) this.f2515a) + ((0.5d / ((double) i3)) / 5.0d));
        } else {
            this.f2515a = (float) (((double) this.f2515a) + (0.5d / ((double) i3)));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("calProcess--");
        sb4.append(this.f2516b);
        sb4.append("，process=");
        sb4.append(this.f2515a);
        PaFaceLogger.m2759i(PaFaceLogger.TAG, sb4.toString());
    }

    /* renamed from: a */
    public float mo12641a() {
        return this.f2515a;
    }

    /* renamed from: a */
    public void mo12643a(C1032n nVar) {
        this.f2515a = BitmapDescriptorFactory.HUE_RED;
        this.f2516b = nVar != null ? nVar.mo12644a() : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("processNum=");
        sb.append(this.f2516b);
        PaFaceLogger.m2759i(PaFaceLogger.TAG, sb.toString());
    }
}
