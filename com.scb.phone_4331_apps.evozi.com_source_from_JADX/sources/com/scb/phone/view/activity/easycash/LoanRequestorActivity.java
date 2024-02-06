package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.easycash.LoanRequestorFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;
import p040o.submitTask;

public class LoanRequestorActivity extends BaseActivityWithFragment {
    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, submitTask submittask) {
        Intent intent = new Intent(context, LoanRequestorActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_DISPLAY", submittask);
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
        return LoanRequestorFragment.write((submitTask) getIntent().getParcelableExtra("com.scb.phone.EXTRA_DISPLAY"));
    }

    public final String au_() {
        return getString(R.string.easycash_loan_requestor_title);
    }
}
