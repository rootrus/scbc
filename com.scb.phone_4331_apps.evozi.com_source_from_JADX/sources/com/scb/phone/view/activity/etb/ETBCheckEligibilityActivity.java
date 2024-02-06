package com.scb.phone.view.activity.etb;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CheckUsabilityData;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBlend;
import p040o.access$2200;
import p040o.setTapText;

public class ETBCheckEligibilityActivity extends BaseEligibilityActivity implements CheckUsabilityData {
    private ScriptIntrinsicBlend MediaDescriptionCompat = new ScriptIntrinsicBlend();

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo14154x50fd9e4a() {
        return R.string.etb_check_eligibility;
    }

    /* access modifiers changed from: protected */
    public final String MediaSessionCompat$Token() {
        return "ETB";
    }

    public static Intent read(Context context) {
        Intent intent = new Intent(context, ETBCheckEligibilityActivity.class);
        intent.putExtra("EXTRA_CALLER", 0);
        return intent;
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, EtbActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        write(access_2200);
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("EXTRA_CALLER", 0);
            if (intExtra == 0) {
                this.MediaDescriptionCompat.read("lifestyle");
            } else if (intExtra == 1) {
                this.MediaDescriptionCompat.read("banking_services");
            }
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "etb_eligibility");
        }
    }
}
