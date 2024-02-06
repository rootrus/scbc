package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bulktransfer.ManageRecipientGroupFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class ManageRecipientGroupActivity extends BaseActivity {
    public static void MediaBrowserCompat$ItemReceiver(Context context, String str, String str2) {
        Intent intent = new Intent(context, ManageRecipientGroupActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_GROUP_ID", str);
        intent.putExtra("com.scb.phone.EXTRA_PARENT_BROADCAST", str2);
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
        setContentView(R.layout.f78692131493094);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (!(getIntent().getStringExtra("com.scb.phone.EXTRA_GROUP_ID") == null || getIntent().getStringExtra("com.scb.phone.EXTRA_PARENT_BROADCAST") == null)) {
            getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_manage_recipient_group_container, ManageRecipientGroupFragment.read(getIntent().getStringExtra("com.scb.phone.EXTRA_GROUP_ID"), getIntent().getStringExtra("com.scb.phone.EXTRA_PARENT_BROADCAST"))).write();
        }
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.manage_recipient_group));
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.manage_recipient_group));
        setTabContainer();
    }
}
