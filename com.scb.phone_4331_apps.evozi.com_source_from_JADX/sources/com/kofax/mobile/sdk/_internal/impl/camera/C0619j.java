package com.kofax.mobile.sdk._internal.impl.camera;

import android.content.Context;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import p040o.HmlPinActivity;
import p040o.HmlReviewDocumentActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.j */
public class C0619j implements HmlReviewDocumentActivity<C0499e> {

    /* renamed from: Bf */
    protected C0499e f1494Bf;

    /* renamed from: Bg */
    private C0499e f1495Bg;

    /* renamed from: V */
    private Context f1496V;

    @HmlPinActivity
    public C0619j(Context context) {
        this.f1496V = context.getApplicationContext();
    }

    /* renamed from: jM */
    public C0499e get() {
        if (this.f1494Bf == null) {
            this.f1495Bg = Injector.getInjector(this.f1496V).getDeviceCamera();
            this.f1494Bf = new C0637z(this.f1495Bg);
        }
        return this.f1494Bf;
    }
}
