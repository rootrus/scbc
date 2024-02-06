package com.kofax.mobile.sdk.p025n;

import com.google.android.gms.common.api.Api;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p025n.C0971c;
import com.kofax.mobile.sdk.p026o.C0981a;
import com.kofax.mobile.sdk.p026o.C0983c;
import com.kofax.mobile.sdk.p026o.C0985f;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.n.a */
public class C0968a implements C0983c {
    private static final String TAG = C0968a.class.getSimpleName();

    /* renamed from: HP */
    private final C0981a f2348HP;

    /* renamed from: HQ */
    private final C0971c f2349HQ;

    /* renamed from: HR */
    private C0971c.C0972a f2350HR;

    /* renamed from: HS */
    private final C0969a f2351HS = C0969a.m2522lW();

    @HmlPinActivity
    C0968a(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DOCUMENT") C0981a aVar) {
        C0971c cVar = new C0971c();
        this.f2349HQ = cVar;
        this.f2350HR = cVar.mo12381ma();
        this.f2348HP = aVar;
    }

    /* renamed from: a */
    public TrackedDocument mo12371a(C0985f fVar) {
        if (this.f2351HS.mo12374lY()) {
            m2519lU();
            this.f2351HS.reset();
        }
        TrackedDocument a = this.f2348HP.mo12371a(fVar);
        if (a == null) {
            this.f2351HS.mo12373lX();
        } else {
            this.f2351HS.onSuccess();
        }
        return a;
    }

    public void destroy() {
        this.f2348HP.destroy();
    }

    /* renamed from: lU */
    private void m2519lU() {
        m2520lV();
        this.f2348HP.mo12392a(this.f2349HQ);
    }

    /* renamed from: lV */
    private void m2520lV() {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Changing edge type to ");
        sb.append(this.f2350HR);
        C0767k.m1801b(str, sb.toString());
        this.f2349HQ.mo12378a(this.f2350HR);
        this.f2350HR = this.f2350HR.mo12384md();
    }

    /* renamed from: com.kofax.mobile.sdk.n.a$a */
    static class C0969a {

        /* renamed from: HU */
        static final int f2352HU = 5;

        /* renamed from: HV */
        private int f2353HV;

        private C0969a(int i) {
            this.f2353HV = i;
        }

        /* renamed from: lW */
        public static C0969a m2522lW() {
            return new C0969a(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        /* renamed from: lX */
        public void mo12373lX() {
            this.f2353HV++;
        }

        public void onSuccess() {
            reset();
        }

        public void reset() {
            this.f2353HV = 0;
        }

        /* renamed from: lY */
        public boolean mo12374lY() {
            return this.f2353HV >= 5;
        }
    }
}
