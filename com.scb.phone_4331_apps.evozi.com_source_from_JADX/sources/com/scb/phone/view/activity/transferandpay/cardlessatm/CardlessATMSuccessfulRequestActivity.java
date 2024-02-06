package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessSuccessfulRequestFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.parseEventExecution;
import p040o.setTapText;

public class CardlessATMSuccessfulRequestActivity extends BaseActivity {
    private CardlessSuccessfulRequestFragment MediaBrowserCompat$MediaItem;

    public void onBackPressed() {
    }

    public static void IconCompatParcelizer(Context context, parseEventExecution parseeventexecution) {
        Intent intent = new Intent(context, CardlessATMSuccessfulRequestActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_CARDLESS_ATM_SUCCESFUL_REQUEST", parseeventexecution);
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
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76982131492923);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = CardlessSuccessfulRequestFragment.MediaBrowserCompat$CustomActionResultReceiver((parseEventExecution) getIntent().getParcelableExtra("com.scb.phone.EXTRA_CARDLESS_ATM_SUCCESFUL_REQUEST"));
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.fragment_container, this.MediaBrowserCompat$MediaItem, getString(R.string.cardless_successful_request_tag));
        read.write();
    }
}
