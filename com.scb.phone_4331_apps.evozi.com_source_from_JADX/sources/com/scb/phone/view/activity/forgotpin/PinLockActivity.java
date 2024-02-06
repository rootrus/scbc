package com.scb.phone.view.activity.forgotpin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.juristic.JuristicResetPinLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Passport;
import p040o.forEachDstIn;
import p040o.forEachDstOver;
import p040o.getKernelIDDstOver;
import p040o.ocrSucceeded;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class PinLockActivity extends BaseActivity implements Passport {
    private getKernelIDDstOver MediaBrowserCompat$MediaItem = new getKernelIDDstOver();
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private forEachDstOver MediaDescriptionCompat = new forEachDstOver();
    private forEachDstIn MediaMetadataCompat = new forEachDstIn();
    @BindView
    Button buttonGoToPersonalProfile;
    @BindView
    TextView pinLockDescription;
    @BindView
    TextView pinLockTitle;
    @HmlPinActivity
    public ocrSucceeded presenter;
    @BindView
    Button unlockPinButton;

    public static void write(Context context) {
        Intent intent = new Intent(context, PinLockActivity.class);
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

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, PinLockActivity.class);
        intent.putExtra("FROM_REGISTRATION", true);
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

    public static void read(Context context) {
        Intent intent = new Intent(context, PinLockActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("JURISTIC_MODE_KEY", true);
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
        setContentView(R.layout.f79282131493153);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        boolean booleanExtra = getIntent().getBooleanExtra("FROM_REGISTRATION", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("JURISTIC_MODE_KEY", false);
        this.MediaBrowserCompat$SearchResultReceiver = booleanExtra2;
        if (booleanExtra2) {
            this.pinLockTitle.setText(getString(R.string.juristic_pin_lock_error_title));
            this.pinLockDescription.setText(getString(R.string.juristic_pin_lock_error_msg));
            this.unlockPinButton.setText(getString(R.string.juristic_unlock_business_pin));
            this.buttonGoToPersonalProfile.setVisibility(0);
            this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "juristic_pinlock");
        } else if (booleanExtra) {
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_pinlock");
        } else {
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "lock_pin_landing");
        }
    }

    public void onBackPressed() {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            super.onBackPressed();
        }
    }

    @OnClick
    public void onUnlockPinClick() {
        ocrSucceeded ocrsucceeded = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = ocrSucceeded.read.read;
        if (ocrsucceeded.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(ocrsucceeded.RatingCompat);
        }
    }

    public final void write() {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            Intent write = JuristicResetPinLandingActivity.write(this);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, write).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            ForgotPinPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    @OnClick
    public void onPersonalProfileClick() {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            setShowingForActionMode();
        }
    }
}
