package com.scb.phone.view.activity.profilemanagement.manageaccounts;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.profilemanagement.manageaccounts.AccountManagementSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class AccountManagementSuccessActivity extends BaseActivityWithFragment {
    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public void onBackPressed() {
    }

    public static void IconCompatParcelizer(Context context, List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        Intent intent = new Intent(context, AccountManagementSuccessActivity.class);
        intent.putParcelableArrayListExtra("EXTRA_DISPLAY", new ArrayList(list));
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
        return AccountManagementSuccessFragment.read(getIntent().getParcelableArrayListExtra("EXTRA_DISPLAY"));
    }

    public final String au_() {
        return getString(R.string.manage_account_title);
    }
}
