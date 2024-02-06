package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferReviewFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SimpleTimeLimiter;
import p040o.setTapText;

public class BulkTransferReviewActivity extends BaseActivity {
    public static void IconCompatParcelizer(Context context, SimpleTimeLimiter simpleTimeLimiter) {
        Intent intent = new Intent(context, BulkTransferReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW_DISPLAY", simpleTimeLimiter);
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
        setContentView(R.layout.f76892131492914);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_bulk_transfer_review_container, BulkTransferReviewFragment.write(getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW_DISPLAY"))).write();
        super.setStackedBackground();
        setTitle(R.string.review_bulk_transfer);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.review_bulk_transfer);
        setTabContainer();
    }
}
