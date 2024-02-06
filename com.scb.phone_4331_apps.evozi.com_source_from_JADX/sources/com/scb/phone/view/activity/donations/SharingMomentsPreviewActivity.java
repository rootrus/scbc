package com.scb.phone.view.activity.donations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.donations.SharingMomentsPreviewFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getDeviceFile;
import p040o.setTapText;

public class SharingMomentsPreviewActivity extends BaseActivity {
    @BindView
    FrameLayout fragmentContainer;

    public static void read(Context context, getDeviceFile getdevicefile) {
        Intent intent = new Intent(context, SharingMomentsPreviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SHARING_PREVIEW_DISPLAY", getdevicefile);
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
        setContentView(R.layout.f79942131493219);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.share_moment);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, SharingMomentsPreviewFragment.read((getDeviceFile) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SHARING_PREVIEW_DISPLAY"))).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.share_moment);
    }
}
