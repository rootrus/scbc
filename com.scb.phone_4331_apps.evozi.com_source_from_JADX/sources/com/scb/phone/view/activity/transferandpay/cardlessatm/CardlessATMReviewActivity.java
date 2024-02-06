package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessReviewFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.parseEvent;
import p040o.setTapText;

public class CardlessATMReviewActivity extends BaseActivity {
    private String MediaBrowserCompat$MediaItem;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, parseEvent parseevent, String str, String str2) {
        Intent intent = new Intent(context, CardlessATMReviewActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_CARDLESS_REVIEW", parseevent);
        intent.putExtra("CONDITION", str2);
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
        this.MediaBrowserCompat$MediaItem = read("source", "");
        setContentView(R.layout.f76972131492922);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.cardless_atm_review_title));
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.fragment_container, CardlessReviewFragment.write((parseEvent) getIntent().getParcelableExtra("com.scb.phone.EXTRA_CARDLESS_REVIEW"), this.MediaBrowserCompat$MediaItem, getIntent().getStringExtra("CONDITION")), getString(R.string.cardless_review_tag));
        read.write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.cardless_atm_review_title));
    }
}
