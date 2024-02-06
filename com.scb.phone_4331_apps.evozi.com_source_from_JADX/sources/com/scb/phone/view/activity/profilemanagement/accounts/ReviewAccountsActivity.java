package com.scb.phone.view.activity.profilemanagement.accounts;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.profilemanagement.accounts.ReviewAccountsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class ReviewAccountsActivity extends BaseActivityWithFragment {
    public static void write(Context context, List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list, boolean z, boolean z2, int i) {
        Intent intent = new Intent(context, ReviewAccountsActivity.class);
        intent.putParcelableArrayListExtra("extra_review_accounts", new ArrayList(list));
        intent.putExtra("isOnBoarding", z);
        intent.putExtra("com.scb.phone.EXTRA_CONSENT_FLAG", z2);
        intent.putExtra("com.scb.phone.EXTRA_CONSENT_VERSION", i);
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
        Intent intent = getIntent();
        return ReviewAccountsFragment.MediaBrowserCompat$ItemReceiver(intent.getParcelableArrayListExtra("extra_review_accounts"), intent.getBooleanExtra("isOnBoarding", false), intent.getBooleanExtra("com.scb.phone.EXTRA_CONSENT_FLAG", false), intent.getIntExtra("com.scb.phone.EXTRA_CONSENT_VERSION", 0));
    }

    public final String au_() {
        return getString(R.string.add_account_title);
    }
}
