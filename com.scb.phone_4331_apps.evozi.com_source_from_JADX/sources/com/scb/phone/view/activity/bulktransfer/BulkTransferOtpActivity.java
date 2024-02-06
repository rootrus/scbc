package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferOtpActivity;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C1422x86f1bdff;
import p040o.CardView;
import p040o.ComputingConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SimpleTimeLimiter;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getOversizeImage;
import p040o.setDaemon;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.withUnregisteredFid;

public class BulkTransferOtpActivity extends BaseActivity implements getAdditionalBottomScanLinesHeight, OtpPinFragment.write, C1422x86f1bdff {
    private String[] MediaMetadataCompat = {"OTP_MOBILE_LIST_FRAGMENT_TAG", "OTP_PIN_FRAGMENT_TAG"};
    @HmlPinActivity
    public withUnregisteredFid bulkTransferReviewPresenter;

    public final void MediaBrowserCompat$ItemReceiver(SimpleTimeLimiter simpleTimeLimiter) {
    }

    public final void read(String str) {
    }

    public final void write(SimpleTimeLimiter simpleTimeLimiter) {
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, SimpleTimeLimiter simpleTimeLimiter) {
        Intent intent = new Intent(context, BulkTransferOtpActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW_DISPLAY", simpleTimeLimiter);
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
        setContentView(R.layout.f76892131492914);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.bulkTransferReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.bulkTransferReviewPresenter.MediaBrowserCompat$CustomActionResultReceiver((SimpleTimeLimiter) getIntent().getExtras().getParcelable("com.scb.phone.EXTRA_REVIEW_DISPLAY"));
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.otp_title));
        MediaBrowserCompat$ItemReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG", (String) null, (String) null);
        getSupportFragmentManager().MediaBrowserCompat$ItemReceiver((setTitleMarginStart.IconCompatParcelizer) new setTitleMarginStart.IconCompatParcelizer() {
            public final void write() {
                BulkTransferOtpActivity bulkTransferOtpActivity = BulkTransferOtpActivity.this;
                if (bulkTransferOtpActivity.getSupportFragmentManager().write() > 0) {
                    bulkTransferOtpActivity.mo11B_();
                    bulkTransferOtpActivity.mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
                    return;
                }
                bulkTransferOtpActivity.setStackedBackground();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.otp_title));
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
            if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
                OtpPinFragment otpPinFragment = (OtpPinFragment) findFragmentByTag3;
                otpPinFragment.MediaMetadataCompat = str2;
                otpPinFragment.IconCompatParcelizer = str3;
                otpPinFragment.MediaBrowserCompat$CustomActionResultReceiver = str4;
            }
        } else if ("OTP_MOBILE_LIST_FRAGMENT_TAG".equals(str)) {
            read.write(R.id.fragment_bulk_transfer_review_container, new MobileListFragment(), "OTP_MOBILE_LIST_FRAGMENT_TAG");
        } else if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
            OtpPinFragment otpPinFragment2 = new OtpPinFragment();
            otpPinFragment2.MediaMetadataCompat = str2;
            otpPinFragment2.IconCompatParcelizer = str3;
            otpPinFragment2.MediaBrowserCompat$CustomActionResultReceiver = str4;
            read.write(R.id.fragment_bulk_transfer_review_container, otpPinFragment2, "OTP_PIN_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_PIN_FRAGMENT_TAG");
        }
        read.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        MediaBrowserCompat$ItemReceiver(str, str2, str3);
    }

    public final void write(String str, String str2) {
        withUnregisteredFid withunregisteredfid = this.bulkTransferReviewPresenter;
        if (withunregisteredfid.RatingCompat != null) {
            withunregisteredfid.RatingCompat.AlertController$RecycleListView();
        }
        ComputingConcurrentHashMap.C31941 read = ComputingConcurrentHashMap.C31941.read();
        read.MediaBrowserCompat$ItemReceiver = withunregisteredfid.IconCompatParcelizer.f2784x50fd9e4a;
        withunregisteredfid.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(read, str, str2);
        withunregisteredfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new withUnregisteredFid.IconCompatParcelizer(withunregisteredfid, (byte) 0));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.SUCCESS);
    }

    public final void IconCompatParcelizer(setDaemon setdaemon) {
        BulkTransferSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(this, setdaemon);
    }

    public final void write(String str) {
        aj_();
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }
}
