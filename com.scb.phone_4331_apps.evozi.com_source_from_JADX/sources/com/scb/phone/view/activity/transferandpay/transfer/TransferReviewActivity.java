package com.scb.phone.view.activity.transferandpay.transfer;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseReviewActivity;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import p040o.CrashlyticsReport;
import p040o.getKernelIDSrcIn;
import p040o.getUuidUtf8Bytes;
import p040o.setTitleMarginStart;
import p040o.setUuidFromUtf8Bytes;

public class TransferReviewActivity extends BaseReviewActivity {
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaMetadataCompat;
    private getKernelIDSrcIn MediaSessionCompat$Token;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaSessionCompat$Token = new getKernelIDSrcIn();
        String str = "";
        this.MediaBrowserCompat$SearchResultReceiver = read("source", str);
        this.MediaMetadataCompat = read("subtype", str);
        if (!TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver)) {
            str = this.MediaMetadataCompat;
        } else if (this.MediaDescriptionCompat != null) {
            str = this.MediaDescriptionCompat.toString();
        }
        this.MediaSessionCompat$Token.read(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(str);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, read("com.scb.phone.analytics.KEY_EVENT_START", "transfer_review"));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final String MediaSessionCompat$QueueItem() {
        String string = getIntent().getExtras().getString("com.scb.phone.TransferTabFragment.REVIEW_TITLE");
        if (string != null && !string.isEmpty()) {
            return string;
        }
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        return getString((setuuidfromutf8bytes == null || setuuidfromutf8bytes.setShowingForActionMode == null) ? R.string.transfer_review_title : R.string.transfer_review_001);
    }

    public void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        AlertController$RecycleListView();
        this.MediaBrowserCompat$MediaItem = setuuidfromutf8bytes;
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes, this.MediaDescriptionCompat, (String) null, (String) null);
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS");
        sendBroadcast(intent);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application application) {
        String name = !TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) ? this.MediaMetadataCompat : this.MediaDescriptionCompat.name();
        this.MediaSessionCompat$Token.read(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(name);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, read("com.scb.phone.analytics.KEY_EVENT_START", "transfer_slip"));
        super.MediaBrowserCompat$CustomActionResultReceiver(application);
    }

    public void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        String name = !TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) ? this.MediaMetadataCompat : this.MediaDescriptionCompat.name();
        this.MediaSessionCompat$Token.read(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(name);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, read("com.scb.phone.analytics.KEY_EVENT_START", "transfer_slip"));
        super.IconCompatParcelizer(getuuidutf8bytes);
    }

    public void onDestroy() {
        this.MediaSessionCompat$Token = null;
        super.onDestroy();
    }

    public void onBackPressed() {
        Fragment fragment;
        setTitleMarginStart.write MediaBrowserCompat$ItemReceiver;
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        boolean z = true;
        if (supportFragmentManager.write() <= 0 || (MediaBrowserCompat$ItemReceiver = supportFragmentManager.MediaBrowserCompat$ItemReceiver(supportFragmentManager.write() - 1)) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager.findFragmentByTag(MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat());
        }
        if (fragment == null || !(fragment instanceof MobileListFragment)) {
            z = false;
        }
        if (z) {
            finish();
        } else {
            super.onBackPressed();
        }
    }
}
