package com.scb.phone.view.activity.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.transferandpay.FixedTransferSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CrashlyticsReport;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FixedTransferSuccessActivity extends BaseActivityWithFragment {
    public final String au_() {
        return null;
    }

    public void onBackPressed() {
    }

    public static void write(Context context, CrashlyticsReport.Session.Event.Application application) {
        Intent intent = new Intent(context, FixedTransferSuccessActivity.class);
        intent.putExtra("com.scb.phone.view.activity.transferandpay.FixedTransferSuccessActivity.EXTRA_SUCCESS_DISPLAY", application);
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
        return FixedTransferSuccessFragment.write((CrashlyticsReport.Session.Event.Application) getIntent().getParcelableExtra("com.scb.phone.view.activity.transferandpay.FixedTransferSuccessActivity.EXTRA_SUCCESS_DISPLAY"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.RatingCompat();
        }
    }
}
