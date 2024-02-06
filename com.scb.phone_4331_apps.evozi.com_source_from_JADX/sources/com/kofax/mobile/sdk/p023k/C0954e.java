package com.kofax.mobile.sdk.p023k;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk._internal.view.C0773f;
import com.kofax.mobile.sdk.p015ak.C0860e;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.k.e */
public class C0954e implements C0516e {

    /* renamed from: FF */
    private boolean f2300FF;

    /* renamed from: FG */
    private int f2301FG;

    /* renamed from: FH */
    private int f2302FH;

    /* renamed from: FI */
    private BoundingTetragon f2303FI;

    /* renamed from: FJ */
    private int f2304FJ;

    /* renamed from: FK */
    private int f2305FK;

    /* renamed from: FL */
    private int f2306FL;

    /* renamed from: FM */
    private int f2307FM;

    /* renamed from: FN */
    private Rect f2308FN;

    /* renamed from: FO */
    private boolean f2309FO;

    /* renamed from: FP */
    private int f2310FP;

    /* renamed from: FQ */
    private boolean f2311FQ;

    /* renamed from: FR */
    private int f2312FR;

    /* renamed from: FS */
    private int f2313FS;

    /* renamed from: kD */
    private List<Rect> f2314kD;

    /* renamed from: lU */
    private int f2315lU;

    /* renamed from: lV */
    private int f2316lV;

    /* renamed from: ms */
    private int f2317ms;

    /* renamed from: d */
    public void mo11320d(int i, int i2) {
        this.f2301FG = i;
        this.f2302FH = i2;
    }

    /* renamed from: m */
    public void mo11321m(boolean z) {
        this.f2300FF = z;
    }

    /* renamed from: b */
    public void mo11319b(List<Rect> list, int i, int i2) {
        this.f2314kD = list;
        this.f2306FL = i;
        this.f2307FM = i2;
    }

    /* renamed from: a */
    public void mo11317a(boolean z, int i, int i2) {
        this.f2309FO = z;
        this.f2310FP = i;
        this.f2317ms = i2;
    }

    /* renamed from: a */
    public void mo11318a(boolean z, int i, int i2, int i3, int i4) {
        this.f2311FQ = z;
        this.f2315lU = i;
        this.f2316lV = i2;
        this.f2312FR = i3;
        this.f2313FS = i4;
    }

    /* renamed from: a */
    public void mo11315a(BoundingTetragon boundingTetragon, int i, int i2) {
        this.f2303FI = boundingTetragon;
        this.f2304FJ = i;
        this.f2305FK = i2;
    }

    /* renamed from: a */
    public void mo11316a(C0773f fVar, boolean z) {
        fVar.setVisible(z);
        if (z) {
            Context context = fVar.getView().getContext();
            fVar.setBoundsData(this.f2303FI, this.f2304FJ, this.f2305FK);
            fVar.showFocusAreas(this.f2314kD, this.f2306FL, this.f2307FM, this.f2300FF);
            fVar.showRect(this.f2308FN);
            StringBuilder sb = new StringBuilder();
            sb.append(C0860e.m2232b(context, "selected_camera_resolution"));
            sb.append(this.f2301FG);
            sb.append(" x ");
            sb.append(this.f2302FH);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C0860e.m2232b(context, "level"));
            sb2.append(this.f2311FQ);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C0860e.m2232b(context, "pitch"));
            sb3.append(this.f2315lU);
            sb3.append(C0860e.m2232b(context, "threshold_pitch"));
            sb3.append(this.f2313FS);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C0860e.m2232b(context, "roll"));
            sb4.append(this.f2316lV);
            sb4.append(C0860e.m2232b(context, "threshold_roll"));
            sb4.append(this.f2312FR);
            fVar.showDebugData(sb.toString(), sb2.toString(), sb3.toString(), sb4.toString());
            boolean z2 = this.f2300FF;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(C0860e.m2232b(context, "focused"));
            sb5.append(this.f2300FF);
            String obj = sb5.toString();
            boolean z3 = this.f2309FO;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(C0860e.m2232b(context, "stability"));
            sb6.append(this.f2309FO);
            sb6.append(C0860e.m2232b(context, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            sb6.append(this.f2310FP);
            sb6.append(C0860e.m2232b(context, "threshold"));
            sb6.append(this.f2317ms);
            fVar.showIndicators(z2, obj, z3, sb6.toString());
        }
    }

    /* renamed from: a */
    public void mo11314a(Rect rect) {
        this.f2308FN = rect;
    }
}
