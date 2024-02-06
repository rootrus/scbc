package com.kofax.mobile.sdk._internal.impl.camera.focus;

import android.os.Build;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0678ae;
import com.kofax.mobile.sdk._internal.impl.event.C0695i;
import com.kofax.mobile.sdk._internal.impl.event.C7952ac;
import com.kofax.mobile.sdk._internal.impl.event.C7961at;
import com.kofax.mobile.sdk._internal.impl.event.C7974m;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import java.util.List;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.m */
public class C0598m {

    /* renamed from: EI */
    public static final String f1413EI = "Focus_Auto";

    /* renamed from: EJ */
    public static final String f1414EJ = "Delayed_Focus_Mode";

    /* renamed from: EK */
    public static final String f1415EK = "Default_Focus_Mode";
    @HmlPinActivity

    /* renamed from: AB */
    C0499e f1416AB;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "Focus_Auto")
    @HmlPinActivity

    /* renamed from: EL */
    C0503i f1417EL;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "Delayed_Focus_Mode")
    @HmlPinActivity

    /* renamed from: EM */
    C0503i f1418EM;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "Default_Focus_Mode")
    @HmlPinActivity

    /* renamed from: EN */
    C0503i f1419EN;

    /* renamed from: EO */
    private C0503i f1420EO = null;

    /* renamed from: EP */
    private C0496b f1421EP = null;

    /* renamed from: Eo */
    private final C0597k f1422Eo;
    private final IBus _bus;

    /* renamed from: zU */
    private C0498d f1423zU = null;

    @HmlPinActivity
    public C0598m(IBus iBus, C0597k kVar) {
        if (iBus != null) {
            this._bus = iBus;
            this.f1422Eo = kVar;
            iBus.register(this);
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11509a(C0695i iVar) {
        this._bus.post(new C7961at(0));
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onCameraParametersProduced(C7974m mVar) {
        C0498d dVar = mVar.f3725Iv;
        this.f1423zU = dVar;
        if (dVar != null) {
            m1297kE();
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11507a(C7952ac acVar) {
        this.f1421EP = acVar.f3702IK;
        m1297kE();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11508a(C0678ae aeVar) {
        C0503i iVar = this.f1420EO;
        if (iVar != null) {
            iVar.mo11192b(aeVar.f1613IN);
        }
    }

    /* renamed from: kE */
    private void m1297kE() {
        if (this.f1423zU != null && this.f1416AB.mo11171bl()) {
            C0503i iVar = this.f1420EO;
            if (iVar != null) {
                try {
                    iVar.stop();
                } catch (Exception e) {
                    C0767k.m1821e("FOCUS_LOGGER", "Failed to remove focus strategy", (Throwable) e);
                }
                this.f1420EO = null;
            }
            this._bus.post(new C0676aa(false));
            List<C0496b> supportedFocusModes = this.f1423zU.getSupportedFocusModes();
            String str = Build.MODEL;
            String str2 = Build.MANUFACTURER;
            C0496b bVar = this.f1421EP;
            if (bVar != null) {
                if (supportedFocusModes.contains(bVar)) {
                    this.f1420EO = m1296b(this.f1421EP);
                } else {
                    ErrorInfo errorInfo = ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Focus mode '");
                    sb.append(this.f1421EP);
                    sb.append("' not supported");
                    throw new KmcRuntimeException(errorInfo, new Exception(sb.toString()));
                }
            } else if (supportedFocusModes.isEmpty()) {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE, new Exception("The focus mode of this device is not supported"));
            } else if (this.f1422Eo.containsKey(str) && !this.f1416AB.mo11172bm()) {
                this.f1420EO = m1296b((C0496b) this.f1422Eo.get(str));
            } else if (this.f1422Eo.containsKey(str2) && supportedFocusModes.contains(this.f1422Eo.get(str2)) && !this.f1416AB.mo11172bm()) {
                this.f1420EO = m1296b((C0496b) this.f1422Eo.get(str2));
            } else if (supportedFocusModes.contains(C0496b.AUTO)) {
                this.f1420EO = this.f1417EL;
            } else {
                if (supportedFocusModes.contains(C0496b.EDOF)) {
                    this.f1416AB.mo11149a(C0496b.EDOF);
                } else if (supportedFocusModes.contains(C0496b.FIXED)) {
                    this.f1416AB.mo11149a(C0496b.FIXED);
                } else if (supportedFocusModes.contains(C0496b.INFINITY)) {
                    this.f1416AB.mo11149a(C0496b.INFINITY);
                }
                this.f1420EO = this.f1419EN;
            }
            this.f1420EO.mo11191a(this.f1416AB);
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.m$1 */
    static /* synthetic */ class C05991 {

        /* renamed from: By */
        static final /* synthetic */ int[] f1424By;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.kofax.mobile.sdk._internal.camera.b[] r0 = com.kofax.mobile.sdk._internal.camera.C0496b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1424By = r0
                com.kofax.mobile.sdk._internal.camera.b r1 = com.kofax.mobile.sdk._internal.camera.C0496b.DELAYED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1424By     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.camera.b r1 = com.kofax.mobile.sdk._internal.camera.C0496b.INFINITY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1424By     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk._internal.camera.b r1 = com.kofax.mobile.sdk._internal.camera.C0496b.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1424By     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.mobile.sdk._internal.camera.b r1 = com.kofax.mobile.sdk._internal.camera.C0496b.EDOF     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1424By     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.mobile.sdk._internal.camera.b r1 = com.kofax.mobile.sdk._internal.camera.C0496b.AUTO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.focus.C0598m.C05991.<clinit>():void");
        }
    }

    /* renamed from: b */
    private C0503i m1296b(C0496b bVar) {
        int i = C05991.f1424By[bVar.ordinal()];
        if (i == 1) {
            return this.f1418EM;
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.f1419EN;
        }
        return this.f1417EL;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onSurfaceChanged(SurfaceChangedEvent surfaceChangedEvent) {
        if (!surfaceChangedEvent.hasSurface) {
            this.f1423zU = null;
            this.f1421EP = null;
            C0503i iVar = this.f1420EO;
            if (iVar != null) {
                iVar.stop();
                this.f1420EO = null;
            }
        }
    }
}
