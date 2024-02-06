package com.scb.phone.view.activity.profilemanagement.accounts;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.profilemanagement.accounts.AddAccountsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class AddAccountsActivity extends BaseActivityWithFragment {
    public static void MediaBrowserCompat$ItemReceiver(Context context, boolean z, boolean z2, int i, AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder) {
        Intent intent = new Intent(context, AddAccountsActivity.class);
        intent.putExtra("isOnBoarding", z);
        intent.putExtra("consentFlag", z2);
        intent.putExtra("com.scb.phone.EXTRA_CONSENT_VERSION", i);
        intent.putExtra("com.scb.phone.EXTRA_UNREGISTERACCOUNT", builder);
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
        return AddAccountsFragment.write(getIntent().getBooleanExtra("isOnBoarding", false), getIntent().getBooleanExtra("consentFlag", false), getIntent().getIntExtra("com.scb.phone.EXTRA_CONSENT_VERSION", 0), (AutoValue_CrashlyticsReport_Session_Event_Application.Builder) getIntent().getParcelableExtra("com.scb.phone.EXTRA_UNREGISTERACCOUNT"));
    }

    public final String au_() {
        return getString(R.string.add_account_title);
    }
}
