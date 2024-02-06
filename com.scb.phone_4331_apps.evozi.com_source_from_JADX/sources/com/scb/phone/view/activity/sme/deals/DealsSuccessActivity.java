package com.scb.phone.view.activity.sme.deals;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.sme.deals.DealsBuySuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.setTapText;
import p040o.standardStartAndWait;

public class DealsSuccessActivity extends ReviewSuccessfulActivity {
    public static void IconCompatParcelizer(Context context, standardStartAndWait standardstartandwait) {
        Intent intent = new Intent(context, DealsSuccessActivity.class);
        intent.putExtra("com.scb.phone.DEALS_SUCCESS_DISPLAY", standardstartandwait);
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
        this.scbAnalytics.write("billpay_slip", new ZSYR2K("source", "sme_deal"), new ZSYR2K("subtype", "deals"));
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, DealsBuySuccessFragment.write((standardStartAndWait) getIntent().getParcelableExtra("com.scb.phone.DEALS_SUCCESS_DISPLAY"))).write();
    }
}
