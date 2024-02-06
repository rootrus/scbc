package com.scb.phone.view.activity.registration.preregistration;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.preregistration.PreregistrationLandingFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class PreregistrationLandingActivity extends BaseActivityWithFragment {
    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public final String au_() {
        return null;
    }

    public static void IconCompatParcelizer(Context context) {
        Intent intent = new Intent(context, PreregistrationLandingActivity.class);
        intent.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return PreregistrationLandingFragment.MediaBrowserCompat$ItemReceiver();
    }
}
