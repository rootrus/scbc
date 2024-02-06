package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.debitcard.DebitCardLandingFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class DebitCardLandingActivity extends BaseActivityWithFragment {
    public static void IconCompatParcelizer(Context context) {
        Intent intent = new Intent(context, DebitCardLandingActivity.class);
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

    public static Intent write(Context context) {
        return new Intent(context, DebitCardLandingActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("atm_debit_card_landing");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return DebitCardLandingFragment.MediaBrowserCompat$ItemReceiver();
    }

    public final String au_() {
        return getString(R.string.debit_card_landing_title);
    }
}
