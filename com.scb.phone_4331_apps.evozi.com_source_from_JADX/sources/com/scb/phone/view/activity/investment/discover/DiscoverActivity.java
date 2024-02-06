package com.scb.phone.view.activity.investment.discover;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.investment.discover.DiscoverFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.getRequestUserName;
import p040o.getRequestUserName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;

public class DiscoverActivity extends BaseActivity implements PassportCaptureModule_RttiExceptionResponseDeserializer_Factory {
    @HmlPinActivity
    public getRequestUserName presenter;

    public static Intent read(Context context) {
        return new Intent(context, DiscoverActivity.class);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77402131492965);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String string = getString(R.string.lifestyle_mf_discoverlanding_001);
        setStackedBackground();
        MediaSessionCompat$QueueItem(string);
        setTabContainer();
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, DiscoverFragment.MediaBrowserCompat$MediaItem()).write();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getRequestUserName getrequestusername = this.presenter;
        getrequestusername.write(!getrequestusername.write.MediaBrowserCompat$CustomActionResultReceiver.write.MediaMetadataCompat(), new getRequestUserName$MediaBrowserCompat$CustomActionResultReceiver(getrequestusername));
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$ItemReceiver = DiscoverDisclaimerActivity.MediaBrowserCompat$ItemReceiver(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent IconCompatParcelizer = NtbDiscoverDisclaimerActivity.IconCompatParcelizer(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 != -1) {
            finish();
        }
    }
}
