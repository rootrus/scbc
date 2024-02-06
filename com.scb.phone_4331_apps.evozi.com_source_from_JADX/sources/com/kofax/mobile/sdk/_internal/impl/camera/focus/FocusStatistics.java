package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C7952ac;
import com.kofax.mobile.sdk._internal.impl.event.C7974m;
import com.kofax.mobile.sdk._internal.impl.event.C7981z;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import java.util.List;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

public class FocusStatistics {

    /* renamed from: EA */
    private static final float f1346EA = 0.95f;

    /* renamed from: Ey */
    private static final float f1347Ey = 0.85f;

    /* renamed from: Ez */
    private static final float f1348Ez = 0.9f;

    /* renamed from: EB */
    private C0578a f1349EB = C0578a.defaultState;

    /* renamed from: EC */
    private float f1350EC = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: ED */
    private float f1351ED = BitmapDescriptorFactory.HUE_RED;
    private IBus _bus;

    /* renamed from: zU */
    private C0498d f1352zU;

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.FocusStatistics$a */
    enum C0578a {
        defaultState,
        areasEnabled,
        modeChanged
    }

    @HmlPinActivity
    public FocusStatistics(IBus iBus) {
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onCameraParametersProduced(C7974m mVar) {
        this.f1352zU = mVar.f3725Iv;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onFocusChangedEvent(C0676aa aaVar) {
        if (aaVar.f1610II) {
            this.f1350EC += 1.0f;
        } else {
            this.f1351ED += 1.0f;
        }
        float kC = m1224kC();
        if (kC > f1346EA && this.f1349EB.equals(C0578a.areasEnabled)) {
            C0496b kB = m1223kB();
            if (kB != null) {
                this._bus.post(new C7952ac(kB));
                this.f1349EB = C0578a.modeChanged;
            }
        } else if (kC > f1348Ez && this.f1349EB.equals(C0578a.defaultState)) {
            this._bus.post(new C7981z(true));
            this.f1349EB = C0578a.areasEnabled;
        }
    }

    /* renamed from: kB */
    private C0496b m1223kB() {
        C0498d dVar = this.f1352zU;
        if (dVar == null) {
            return null;
        }
        List<C0496b> supportedFocusModes = dVar.getSupportedFocusModes();
        C0496b[] bVarArr = {C0496b.DELAYED, C0496b.EDOF, C0496b.FIXED, C0496b.INFINITY};
        for (int i = 0; i < 4; i++) {
            C0496b bVar = bVarArr[i];
            if (supportedFocusModes.contains(bVar)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: kC */
    private float m1224kC() {
        float f = this.f1351ED;
        float f2 = this.f1350EC + f;
        return (float) (((double) (f / f2)) / (Math.pow(0.8500000238418579d, (double) f2) + 1.0d));
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onSurfaceChanged(SurfaceChangedEvent surfaceChangedEvent) {
        if (!surfaceChangedEvent.hasSurface) {
            this.f1349EB = C0578a.defaultState;
            this.f1352zU = null;
            this.f1350EC = BitmapDescriptorFactory.HUE_RED;
            this.f1351ED = BitmapDescriptorFactory.HUE_RED;
        }
    }
}
