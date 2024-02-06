package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bulktransfer.SelectRecipientFromFavouriteFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class SelectRecipientFromFavouriteActivity extends BaseActivity {
    public static void write(Context context, String str, int i) {
        Intent intent = new Intent(context, SelectRecipientFromFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_GROUP_ID", str);
        intent.putExtra("com.scb.phone.EXTRA_NUM_RECIPIENTS", i);
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
        setContentView(R.layout.f79872131493212);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, SelectRecipientFromFavouriteFragment.MediaBrowserCompat$ItemReceiver(getIntent().getStringExtra("com.scb.phone.EXTRA_GROUP_ID"), getIntent().getIntExtra("com.scb.phone.EXTRA_NUM_RECIPIENTS", 0))).write();
        super.setStackedBackground();
        setTitle(R.string.add_from_favourite);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.add_from_favourite);
        setTabContainer();
    }
}
