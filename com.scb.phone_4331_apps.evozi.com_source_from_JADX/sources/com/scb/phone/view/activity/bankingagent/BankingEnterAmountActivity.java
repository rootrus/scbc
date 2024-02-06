package com.scb.phone.view.activity.bankingagent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bankingagent.BankingEnterAmountFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.GoodToKnowActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYMM;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class BankingEnterAmountActivity extends BaseActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final void IconCompatParcelizer(Context context, String str, ZSYMM zsymm) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "postingType");
            onGetStartedClick.write((Object) zsymm, "tracker");
            Intent intent = new Intent(context, BankingEnterAmountActivity.class);
            intent.putExtra("com.scb.phone.EXTRA_POSTING_TYPE", str);
            intent.putExtra("banking_agent_bundle", zsymm);
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
    }

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f76752131492900);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        setStackedBackground();
        CardView read = getSupportFragmentManager().read();
        BankingEnterAmountFragment.IconCompatParcelizer iconCompatParcelizer = BankingEnterAmountFragment.IconCompatParcelizer;
        String stringExtra = getIntent().getStringExtra("com.scb.phone.EXTRA_POSTING_TYPE");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(EXTRA_POSTING_TYPE)");
        Parcelable parcelableExtra = getIntent().getParcelableExtra("banking_agent_bundle");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…nts.BANKING_AGENT_BUNDLE)");
        ZSYMM zsymm = (ZSYMM) parcelableExtra;
        onGetStartedClick.write((Object) stringExtra, "postingType");
        onGetStartedClick.write((Object) zsymm, "tracker");
        BankingEnterAmountFragment bankingEnterAmountFragment = new BankingEnterAmountFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.scb.phone.EXTRA_POSTING_TYPE", stringExtra);
        bundle2.putParcelable("banking_agent_bundle", zsymm);
        bankingEnterAmountFragment.setArguments(bundle2);
        read.MediaBrowserCompat$ItemReceiver(R.id.banking_enter_frame, bankingEnterAmountFragment).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(getIntent().getStringExtra("com.scb.phone.EXTRA_POSTING_TYPE"), "D", true) ? R.string.banking_deposits_generate_qr_title : R.string.banking_withdrawal_generate_qr_title));
        setTabContainer();
    }
}
