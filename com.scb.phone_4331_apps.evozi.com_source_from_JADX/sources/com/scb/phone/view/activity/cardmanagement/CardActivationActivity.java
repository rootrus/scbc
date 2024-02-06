package com.scb.phone.view.activity.cardmanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.fragment.cardmanagement.CardActivationFragment;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.AlertController$RecycleListView;
import p040o.C7163iS;
import p040o.C9736x97ce62ae;
import p040o.CardView;
import p040o.ComputingConcurrentHashMap;
import p040o.FirebaseVisionCloudDetectorOptions;
import p040o.HmlPinActivity;
import p040o.InstallationResponse;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ThreadFactoryBuilder;
import p040o.beginTransaction;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getOversizeImage;
import p040o.newCreditCardParameters;
import p040o.notifyBackgroundStateChangeListeners;
import p040o.setTapText;
import p040o.setTitleMarginStart;

public class CardActivationActivity extends CCRBaseActivity implements newCreditCardParameters, getAdditionalBottomScanLinesHeight, OtpPinFragment.write, CardActivationFragment.write {
    private CardActivationFragment MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private String[] MediaMetadataCompat = {"CREDIT_CARD_ACTIVATION_FRAGMENT_TAG", "OTP_MOBILE_LIST_FRAGMENT_TAG", "OTP_PIN_FRAGMENT_TAG"};
    private notifyBackgroundStateChangeListeners MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    @HmlPinActivity
    public FirebaseVisionCloudDetectorOptions cardActivationPresenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners) {
        Intent intent = new Intent(context, CardActivationActivity.class);
        intent.putExtra("EXTRA_INACTIVE_CARD", notifybackgroundstatechangelisteners);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76942131492919);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.cardActivationPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getParcelableExtra("EXTRA_INACTIVE_CARD") != null) {
            this.MediaBrowserCompat$MediaItem = CardActivationFragment.IconCompatParcelizer((notifyBackgroundStateChangeListeners) getIntent().getParcelableExtra("EXTRA_INACTIVE_CARD"));
        }
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.container, this.MediaBrowserCompat$MediaItem, "CREDIT_CARD_ACTIVATION_FRAGMENT_TAG");
        read.write();
        getSupportFragmentManager().MediaBrowserCompat$ItemReceiver((setTitleMarginStart.IconCompatParcelizer) new C7163iS(this));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.card_activation);
        setTabContainer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        MediaBrowserCompat$CustomActionResultReceiver(str, str2, str3, false);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, boolean z) {
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        CardView read = supportFragmentManager.read();
        for (String str4 : this.MediaMetadataCompat) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str4);
            if (findFragmentByTag != null) {
                if (!z || str4.equals("CREDIT_CARD_ACTIVATION_FRAGMENT_TAG")) {
                    read.MediaBrowserCompat$ItemReceiver(findFragmentByTag);
                } else {
                    supportFragmentManager.RatingCompat();
                    read.write(findFragmentByTag);
                }
            }
        }
        Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(str);
        String str5 = mo3026D_().equalsIgnoreCase("en") ? "FastEasyDefault_EN" : "FastEasyDefault_TH";
        if (findFragmentByTag2 != null) {
            read.IconCompatParcelizer(findFragmentByTag2);
            if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
                OtpPinFragment otpPinFragment = (OtpPinFragment) findFragmentByTag2;
                otpPinFragment.MediaMetadataCompat = str2;
                otpPinFragment.IconCompatParcelizer = str3;
                otpPinFragment.MediaBrowserCompat$CustomActionResultReceiver = str5;
            }
        } else if ("OTP_MOBILE_LIST_FRAGMENT_TAG".equals(str)) {
            read.write(R.id.container, new MobileListFragment(), "OTP_MOBILE_LIST_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG");
        } else if ("OTP_PIN_FRAGMENT_TAG".equals(str)) {
            OtpPinFragment otpPinFragment2 = new OtpPinFragment();
            otpPinFragment2.MediaMetadataCompat = str2;
            otpPinFragment2.IconCompatParcelizer = str3;
            otpPinFragment2.MediaBrowserCompat$CustomActionResultReceiver = str5;
            read.write(R.id.container, otpPinFragment2, "OTP_PIN_FRAGMENT_TAG");
            read.MediaBrowserCompat$CustomActionResultReceiver("OTP_PIN_FRAGMENT_TAG");
        }
        read.write();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ThreadFactoryBuilder.C38611 r4) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = ActivationSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver(this, r4);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 5001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver("CREDIT_CARD_ACTIVATION_FRAGMENT_TAG", (String) null, (String) null, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5001 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaDescriptionCompat = str;
    }

    public final void write(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    public final void RatingCompat(String str) {
        this.MediaSessionCompat$Token = str;
    }

    public final void read(notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners) {
        this.MediaSessionCompat$ResultReceiverWrapper = notifybackgroundstatechangelisteners;
    }

    public final void write(String str, String str2) {
        this.cardActivationPresenter.MediaMetadataCompat = this.MediaSessionCompat$ResultReceiverWrapper;
        this.cardActivationPresenter.write = this.MediaDescriptionCompat;
        this.cardActivationPresenter.IconCompatParcelizer = this.MediaBrowserCompat$SearchResultReceiver;
        this.cardActivationPresenter.read = this.MediaSessionCompat$Token;
        FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = this.cardActivationPresenter;
        InstallationResponse.ResponseCode responseCode = new InstallationResponse.ResponseCode(firebaseVisionCloudDetectorOptions);
        if (firebaseVisionCloudDetectorOptions.RatingCompat != null) {
            responseCode.IconCompatParcelizer(firebaseVisionCloudDetectorOptions.RatingCompat);
        }
        firebaseVisionCloudDetectorOptions.MediaBrowserCompat$ItemReceiver.write(str, str2, firebaseVisionCloudDetectorOptions.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver, new ComputingConcurrentHashMap.ComputingValueReference(firebaseVisionCloudDetectorOptions.write, firebaseVisionCloudDetectorOptions.IconCompatParcelizer, new beginTransaction(firebaseVisionCloudDetectorOptions.MediaMetadataCompat.write, firebaseVisionCloudDetectorOptions.MediaMetadataCompat.IconCompatParcelizer)));
        firebaseVisionCloudDetectorOptions.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C9736x97ce62ae(firebaseVisionCloudDetectorOptions, (byte) 0));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.SUCCESS);
    }

    public final void read(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }
}
