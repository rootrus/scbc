package com.scb.phone.view.activity.creditcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.creditcard.CreditCardDetailFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C7232ll;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.setTapText;

public class CreditCardDetailActivity extends BaseActivity {
    private static String MediaMetadataCompat = "SELECTED_TAB_TAG";
    public boolean MediaBrowserCompat$SearchResultReceiver;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, int i, List<chain> list) {
        Intent intent = new Intent(context, CreditCardDetailActivity.class);
        intent.putExtra(MediaMetadataCompat, 2);
        intent.putParcelableArrayListExtra("CREDIT_CARD_DISPLAY_LIST", (ArrayList) list);
        return intent;
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, List<chain> list, int i) {
        Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, 2, list);
        MediaBrowserCompat$ItemReceiver.putExtra("SELECTED_CARD_POSITION", i);
        return MediaBrowserCompat$ItemReceiver;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77202131492945);
        mo13676d_("accountsummary_carddetails");
        CreditCardDetailFragment creditCardDetailFragment = new CreditCardDetailFragment();
        creditCardDetailFragment.IconCompatParcelizer = new C7232ll(this);
        creditCardDetailFragment.MediaBrowserCompat$CustomActionResultReceiver = getIntent().getIntExtra(MediaMetadataCompat, 0);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_credit_card_detail, creditCardDetailFragment).IconCompatParcelizer();
    }

    public void finish() {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.finish();
    }
}
