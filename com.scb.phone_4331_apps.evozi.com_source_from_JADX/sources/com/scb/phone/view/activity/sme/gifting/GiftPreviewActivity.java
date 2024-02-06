package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.CheckParameters_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.WeekView;
import p040o.ZSYR2K;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.showRect;

public class GiftPreviewActivity extends GiftingStatusBaseActivity implements CheckParameters_MembersInjector.write {
    @BindView
    TextView giftMsg;
    @BindView
    TextView giftName;
    @BindView
    TextView giftSenderName;
    @BindView
    View layout;
    @BindView
    DefaultButton openButton;
    @HmlPinActivity
    public showRect presenter;

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return R.layout.f79422131493167;
    }

    public void onCreate(Bundle bundle) {
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User;
        String str;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        MediaSessionCompat$Token();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
        if (getIntent().getExtras() != null && (autoValue_CrashlyticsReport_Session_User = (AutoValue_CrashlyticsReport_Session_User) getIntent().getExtras().getParcelable("EXTRA_GIFT_STATUS_SELECTED")) != null && autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a != null) {
            if (autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a.equals("M")) {
                str = "money";
            } else {
                str = autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a.equals("P") ? "present" : "";
            }
            this.scbAnalytics.write("gift_sent_preview", new ZSYR2K("gift_type", str), new ZSYR2K("gift_id", autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$MediaItem));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93002131558402, menu);
        Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_close).getIcon().mutate());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, setLastBaselineToBottomHeight.read(this, R.color.f67252131099881));
        menu.findItem(R.id.menu_close).setIcon(MediaBrowserCompat$MediaItem);
        return true;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.gift_preview_title));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        String str;
        showRect showrect = this.presenter;
        if (autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat.equals(CrashlyticsReport.FilesPayload.SENT)) {
            str = autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver;
        } else {
            str = autoValue_CrashlyticsReport_Session_User.MediaMetadataCompat;
        }
        showrect.read(str);
        this.giftSenderName.setText(autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$Token);
        this.giftName.setText(getString(R.string.open_now_gift_msg, new Object[]{autoValue_CrashlyticsReport_Session_User.MediaDescriptionCompat}));
        this.giftMsg.setText(autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$ResultReceiverWrapper);
        if (autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat.equals(CrashlyticsReport.FilesPayload.SENT)) {
            this.openButton.setVisibility(8);
            this.layout.setBackgroundColor(setLastBaselineToBottomHeight.read(this, R.color.f71012131100257));
            return;
        }
        this.layout.setBackgroundColor(setLastBaselineToBottomHeight.read(this, R.color.f66132131099768));
        this.openButton.setVisibility(0);
        this.openButton.setOnClickListener(new WeekView(this, autoValue_CrashlyticsReport_Session_User));
    }

    public final void read(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        Intent intent = new Intent(this, GiftingOpenedActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_GIFT_STATUS_SELECTED", autoValue_CrashlyticsReport_Session_User);
        bundle.putBoolean("EXTRA_GIFT_FROM_PREVIEW", true);
        intent.setFlags(1073741824);
        intent.putExtras(bundle);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }
}
