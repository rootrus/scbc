package com.scb.phone.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.KtaBillExtractor;
import p040o.ServerProjectProvider;
import p040o.access$2200;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getOversizeImage;
import p040o.getTopLeftCornerWidth;
import p040o.setTitleMarginStart;
import p040o.setUuidFromUtf8Bytes;

public abstract class BaseReviewActivity extends ReviewActivity implements getTopLeftCornerWidth.setItemInvoker, OtpPinFragment.write, getAdditionalBottomScanLinesHeight {
    public setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem;
    public IGoogleMapDelegate MediaDescriptionCompat;
    private String[] MediaMetadataCompat = {"REVIEW_FRAGMENT_TAG", "OTP_MOBILE_LIST_FRAGMENT_TAG", "OTP_PIN_FRAGMENT_TAG"};
    @HmlPinActivity
    public KtaBillExtractor presenter;

    public abstract String MediaSessionCompat$QueueItem();

    public abstract void write(setUuidFromUtf8Bytes setuuidfromutf8bytes);

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        getSupportFragmentManager().MediaBrowserCompat$ItemReceiver((setTitleMarginStart.IconCompatParcelizer) new ServerProjectProvider.C7081e(this));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = (IGoogleMapDelegate) getIntent().getSerializableExtra("com.scb.phone.EXTRA_TRANSFER_TYPE");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public final void write(access$2200 access_2200) {
        aj_();
        super.write(access_2200);
    }

    public final void write(String str) {
        aj_();
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        aj_();
        MediaBrowserCompat$ItemReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG", (String) null, (String) null);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        MediaBrowserCompat$ItemReceiver(str, str2, str3);
    }

    public final void write(String str, String str2) {
        AlertController$RecycleListView();
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, this.MediaDescriptionCompat, str2, str);
    }

    private void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        CardView read = supportFragmentManager.read();
        for (String findFragmentByTag : this.MediaMetadataCompat) {
            Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(findFragmentByTag);
            if (findFragmentByTag2 != null) {
                read.MediaBrowserCompat$ItemReceiver(findFragmentByTag2);
            }
        }
        Fragment findFragmentByTag3 = supportFragmentManager.findFragmentByTag(str);
        String str4 = mo3026D_().equalsIgnoreCase("en") ? "FastEasyDefault_EN" : "FastEasyDefault_TH";
        if (findFragmentByTag3 != null) {
            read.IconCompatParcelizer(findFragmentByTag3);
            if ("REVIEW_FRAGMENT_TAG".equals(str)) {
                OtpPinFragment otpPinFragment = (OtpPinFragment) findFragmentByTag3;
                otpPinFragment.MediaMetadataCompat = str2;
                otpPinFragment.IconCompatParcelizer = str3;
                otpPinFragment.MediaBrowserCompat$CustomActionResultReceiver = str4;
            }
        } else if ("OTP_MOBILE_LIST_FRAGMENT_TAG".equals(str)) {
            MobileListFragment mobileListFragment = new MobileListFragment();
            mobileListFragment.MediaBrowserCompat$CustomActionResultReceiver = true;
            read.write(R.id.container, mobileListFragment, "OTP_MOBILE_LIST_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG");
        } else if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
            OtpPinFragment otpPinFragment2 = new OtpPinFragment();
            otpPinFragment2.MediaMetadataCompat = str2;
            otpPinFragment2.IconCompatParcelizer = str3;
            otpPinFragment2.MediaBrowserCompat$CustomActionResultReceiver = str4;
            read.write(R.id.container, otpPinFragment2, "OTP_PIN_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_PIN_FRAGMENT_TAG");
        }
        read.write();
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.SUCCESS);
    }
}
