package com.scb.phone.view.activity.demo.ntb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.NtbUserInfoFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiJsonBill_MembersInjector;
import p040o.forEachXor;
import p040o.setTapText;

public class NtbUserInfoActivity extends BaseActivity {
    private forEachXor MediaMetadataCompat;

    public static void write(Context context, RttiJsonBill_MembersInjector.read.IconCompatParcelizer iconCompatParcelizer) {
        Intent intent = new Intent(context, NtbUserInfoActivity.class);
        intent.putExtra("WELCOME_ABOARD_BUTTON_TYPE", iconCompatParcelizer);
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
        setContentView(R.layout.f79092131493134);
        this.MediaMetadataCompat = new forEachXor();
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().hasExtra("WELCOME_ABOARD_BUTTON_TYPE")) {
            RttiJsonBill_MembersInjector.read.IconCompatParcelizer iconCompatParcelizer = (RttiJsonBill_MembersInjector.read.IconCompatParcelizer) getIntent().getSerializableExtra("WELCOME_ABOARD_BUTTON_TYPE");
            if (RttiJsonBill_MembersInjector.read.IconCompatParcelizer.OPEN_ACCOUNT.equals(iconCompatParcelizer)) {
                this.MediaMetadataCompat.read("source", "open_account");
            } else if (RttiJsonBill_MembersInjector.read.IconCompatParcelizer.APPLY_FOR_LOAN.equals(iconCompatParcelizer)) {
                this.MediaMetadataCompat.read("source", "apply_loan");
            } else if (RttiJsonBill_MembersInjector.read.IconCompatParcelizer.DEMO.equals(iconCompatParcelizer)) {
                this.MediaMetadataCompat.read("source", "explore_demo");
            } else {
                this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ntb_user_info");
            }
        }
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ntb_user_info");
        if (getIntent().hasExtra("WELCOME_ABOARD_BUTTON_TYPE")) {
            getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.content_layout, NtbUserInfoFragment.MediaBrowserCompat$CustomActionResultReceiver((RttiJsonBill_MembersInjector.read.IconCompatParcelizer) getIntent().getSerializableExtra("WELCOME_ABOARD_BUTTON_TYPE"))).write();
        }
        setStackedBackground();
        MediaSessionCompat$QueueItem((String) null);
        setTabContainer();
        if (mo11B_() != null) {
            mo11B_().MediaBrowserCompat$CustomActionResultReceiver((float) BitmapDescriptorFactory.HUE_RED);
        }
    }
}
