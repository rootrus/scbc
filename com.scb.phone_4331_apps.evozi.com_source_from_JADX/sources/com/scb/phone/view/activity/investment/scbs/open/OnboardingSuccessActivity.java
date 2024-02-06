package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.persistEvent;
import p040o.setTapText;

public class OnboardingSuccessActivity extends BaseActivityWithFragment {
    public final String au_() {
        return "";
    }

    public void onBackPressed() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, persistEvent persistevent) {
        Intent intent = new Intent(context, OnboardingSuccessActivity.class);
        intent.putExtra("SUCCESS_DISPLAY", persistevent);
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79822131493207);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return OnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver((persistEvent) getIntent().getParcelableExtra("SUCCESS_DISPLAY"));
    }
}
