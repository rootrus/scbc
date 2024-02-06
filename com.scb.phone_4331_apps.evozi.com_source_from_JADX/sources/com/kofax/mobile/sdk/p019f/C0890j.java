package com.kofax.mobile.sdk.p019f;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0677ad;
import com.kofax.mobile.sdk._internal.impl.event.C7959ap;
import com.kofax.mobile.sdk._internal.impl.event.C7962av;
import com.kofax.mobile.sdk._internal.impl.event.C7963aw;
import com.kofax.mobile.sdk._internal.impl.event.ImageCapturedBusEvent;
import com.kofax.mobile.sdk.p020g.C0892a;
import com.kofax.mobile.sdk.p020g.C0904h;
import com.kofax.mobile.sdk.p020g.C0908i;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.f.j */
public class C0890j {
    private IBus _bus;

    /* renamed from: xj */
    private final String f2103xj;

    /* renamed from: xk */
    private C0904h f2104xk;

    /* renamed from: xl */
    private C0908i f2105xl = new C0908i(this.f2103xj, AppStatsInstanceType.INST_TYPE_IMAGE_CAPTURE, false);

    /* renamed from: xm */
    private boolean f2106xm = false;

    /* renamed from: xn */
    private boolean f2107xn;

    /* renamed from: xo */
    private boolean f2108xo = false;

    /* renamed from: xp */
    private AppStatsEventIDType f2109xp;

    /* renamed from: xq */
    private boolean f2110xq;

    @HmlPinActivity
    public C0890j(IBus iBus) {
        String iu = C0892a.m2308iu();
        this.f2103xj = iu;
        this.f2104xk = new C0904h(iu, AppStatsInstanceType.INST_TYPE_IMAGE_CAPTURE, false);
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12259a(C7962av avVar) {
        if (!this.f2106xm) {
            this.f2104xk.mo12275iv();
            this.f2105xl.mo12267R(this.f2104xk.getInstanceId());
            this.f2106xm = true;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_SESSION_CREATE_ERROR);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12260a(C7963aw awVar) {
        if (this.f2106xm) {
            this.f2104xk.mo12276iw();
            this.f2106xm = false;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_SESSION_DISMISS_ERROR);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12258a(C0677ad adVar) {
        AppStatsEventIDType appStatsEventIDType = adVar.f1611IL ? AppStatsEventIDType.APP_STATS_IMG_EXP_CAPTURE_EVENT : AppStatsEventIDType.APP_STATS_IMG_FORCE_CAPTURE_EVENT;
        this.f2104xk.mo12304g(1);
        this.f2104xk.mo12303b(appStatsEventIDType);
        this.f2109xp = appStatsEventIDType;
        this.f2110xq = true;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12257a(ImageCapturedBusEvent imageCapturedBusEvent) {
        this.f2104xk.mo12304g(1);
        if (this.f2110xq) {
            this.f2104xk.mo12302a(this.f2109xp, imageCapturedBusEvent.image.getImageID());
            return;
        }
        AppStatsEventIDType appStatsEventIDType = AppStatsEventIDType.APP_STATS_IMG_CAPTURE_EVENT;
        this.f2109xp = appStatsEventIDType;
        this.f2104xk.mo12302a(appStatsEventIDType, imageCapturedBusEvent.image.getImageID());
        this.f2110xq = false;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo12261b(C7959ap apVar) {
        boolean z = this.f2108xo;
        boolean z2 = apVar.f3715Jf;
        if (z != z2) {
            try {
                this.f2104xk.mo12304g(z2 ? 1 : 0);
                this.f2104xk.mo12303b(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT);
            } catch (Throwable th) {
                this.f2108xo = z2;
                throw th;
            }
        }
        this.f2108xo = z2;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onFocusChangedEvent(C0676aa aaVar) {
        boolean z = this.f2107xn;
        boolean z2 = aaVar.f1610II;
        if (z != z2) {
            try {
                this.f2104xk.mo12304g(z2 ? 1 : 0);
                this.f2104xk.mo12303b(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS);
            } catch (Throwable th) {
                this.f2107xn = z2;
                throw th;
            }
        }
        this.f2107xn = z2;
    }
}
