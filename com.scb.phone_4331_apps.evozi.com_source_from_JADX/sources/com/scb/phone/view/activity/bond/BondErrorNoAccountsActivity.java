package com.scb.phone.view.activity.bond;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.ErrorGenericActivity;
import com.scb.phone.view.fragment.bond.BondNoAccountsErrorFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.ForwardingCheckedFuture;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class BondErrorNoAccountsActivity extends ErrorGenericActivity {
    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, ForwardingCheckedFuture forwardingCheckedFuture, String str) {
        Intent intent = new Intent(context, BondErrorNoAccountsActivity.class);
        intent.putExtra("EXTRA_ERROR_DISPLAY", forwardingCheckedFuture);
        intent.putExtra("BOND_ERROR_DISPLAY_PROSPECTUS", str);
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
        return BondNoAccountsErrorFragment.read((ForwardingCheckedFuture) getIntent().getParcelableExtra("EXTRA_ERROR_DISPLAY"), getIntent().getStringExtra("BOND_ERROR_DISPLAY_PROSPECTUS"));
    }
}
