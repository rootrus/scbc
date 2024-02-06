package com.kofax.mobile.sdk.p019f;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk.p020g.C0894c;
import com.kofax.mobile.sdk.p020g.C8391g;
import com.kofax.mobile.sdk.p028s.C0992a;
import com.kofax.mobile.sdk.p028s.C0993b;
import com.kofax.mobile.sdk.p028s.C0994c;
import com.kofax.mobile.sdk.p028s.C8467d;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.f.l */
public class C0891l {
    private IBus _bus;

    /* renamed from: xr */
    private C8391g f2111xr;

    /* renamed from: xs */
    private C0894c f2112xs = null;

    @HmlPinActivity
    public C0891l(IBus iBus) {
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12265a(C0994c cVar) {
        this.f2111xr = new C8391g(AppStatsInstanceType.INST_TYPE_IMAGE_PROCESSOR);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12266a(C8467d dVar) {
        this.f2111xr.mo12276iw();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12264a(C0993b bVar) {
        C0894c cVar = new C0894c();
        this.f2112xs = cVar;
        cVar.mo12283V(bVar.image.getImageID());
        this.f2111xr.mo55287a(AppStatsEventIDType.APP_STATS_IMG_PROCESSING_START_EVENT, this.f2112xs);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12263a(C0992a aVar) {
        C0894c cVar = this.f2112xs;
        if (cVar != null) {
            cVar.mo12282U(aVar.f2386iC);
            this.f2112xs.setResultCode(aVar.f2385be.getErr());
            Image image = aVar.image;
            if (image != null) {
                this.f2112xs.mo12281T(image.getImageID());
                this.f2112xs.mo12284f((int) image.getImageSize());
            }
            this.f2111xr.mo55287a(AppStatsEventIDType.APP_STATS_IMG_PROCESSING_STOP_EVENT, this.f2112xs);
            this.f2112xs = null;
        }
    }
}
