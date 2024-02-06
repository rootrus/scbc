package com.scb.phone.view.activity.registration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import p040o.AlertController$RecycleListView;
import p040o.getKernelIDDstOver;
import p040o.onGetStartedClick;

public final class RegistrationNoDataActivity extends BaseActivity {
    /* access modifiers changed from: private */
    public static final String MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public static final String MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public static final String MediaDescriptionCompat = MediaDescriptionCompat;
    public static final RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private getKernelIDDstOver MediaSessionCompat$ResultReceiverWrapper = new getKernelIDDstOver();
    @BindView
    public TextView description;
    @BindView
    public ImageView imageInfo;
    @BindView
    public TextView textTitle;

    public static final Intent IconCompatParcelizer(Context context, String str, String str2) {
        return RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(context, R.drawable.ic_notice, str, str2);
    }

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f79592131493184);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        setStackedBackground();
        Intent intent = getIntent();
        if (intent != null) {
            ImageView imageView = this.imageInfo;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInfo");
            }
            imageView.setImageResource(intent.getIntExtra(MediaDescriptionCompat, 0));
            TextView textView = this.textTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textTitle");
            }
            textView.setText(intent.getStringExtra(MediaBrowserCompat$SearchResultReceiver));
            TextView textView2 = this.description;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("description");
            }
            textView2.setText(intent.getStringExtra(MediaBrowserCompat$MediaItem));
        }
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_none_information");
    }

    @OnClick
    public final void returnHome() {
        mo13803Z_();
    }

    @OnClick
    public final void gotoFindUs() {
        FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_find_us");
    }
}
