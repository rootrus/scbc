package com.scb.phone.view.activity.hml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.hml.HmlAddressFragment;
import com.scb.phone.view.fragment.hml.HmlAddressFragment$MediaBrowserCompat$ItemReceiver;
import p040o.AlertController$RecycleListView;
import p040o.AppBarLayout;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.NetworkService;
import p040o.PassportCaptureActivity_MembersInjector;
import p040o.onGetStartedClick;
import p040o.setContentDescription;

public abstract class HmlBaseAddressActivity extends BaseActivity implements PassportCaptureActivity_MembersInjector, HmlAddressFragment$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindChangeChannelStatementReviewFragment.write {
    @HmlPinActivity
    public NetworkService.C36941 presenter;

    /* access modifiers changed from: protected */
    public abstract int MediaSessionCompat$QueueItem();

    public final void am_() {
    }

    public final void write(Fragment fragment) {
    }

    public final void write(String str) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(MediaSessionCompat$QueueItem()));
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        NetworkService.C36941 r5 = this.presenter;
        setContentDescription.write write = (setContentDescription.write) getIntent().getSerializableExtra("com.scb.phone.EXTRA_ADDRESS_TYPE");
        onGetStartedClick.write((Object) write, "addressType");
        if (r5.RatingCompat != null) {
            r5.RatingCompat.AlertController$RecycleListView();
        }
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior = r5.read;
        scrollingViewBehavior.write(scrollingViewBehavior.IconCompatParcelizer(write), new NetworkService.C36941.IconCompatParcelizer(r5, write));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(MediaSessionCompat$QueueItem()));
        setTabContainer();
    }

    public void IconCompatParcelizer(String str) {
        setResult(-1, new Intent().putExtra("com.scb.phone.EXTRA_RESULT_ADDRESS", str));
        finish();
    }

    public void IconCompatParcelizer(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute, setContentDescription.write write) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(autoValue_CrashlyticsReport_CustomAttribute, write)).write();
    }
}
