package com.scb.phone.view.activity.partner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4336eE;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.printStackTrace;
import p040o.setTapText;
import p040o.zzmd;

public class PartnerLoginActivity extends AbstractPartnerLoginActivity {
    @HmlPinActivity
    public C4336eE partnerLoginPresenter;
    @HmlPinActivity
    public zzmd pidAppKillChecker;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final printStackTrace.write mo34189x50fd9e4a() {
        return this.partnerLoginPresenter;
    }

    public final void read() {
        this.pidAppKillChecker.read.edit().putInt("PROCESS_ID", 0).apply();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Intent IconCompatParcelizer = PartnerConsentActivity.IconCompatParcelizer(this, extras.getString("com.scb.phone.view.activity.partner.EXTRA_UUID", (String) null), false, (String) null);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, IconCompatParcelizer).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        finish();
    }

    public final void IconCompatParcelizer(Intent intent, int i, boolean z) {
        intent.addFlags(268435456);
        Context baseContext = getBaseContext();
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(baseContext, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(baseContext.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            baseContext.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
