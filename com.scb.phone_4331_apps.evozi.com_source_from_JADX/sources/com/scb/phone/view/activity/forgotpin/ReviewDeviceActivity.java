package com.scb.phone.view.activity.forgotpin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.registration.RegistrationSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C6901Id;
import p040o.FragmentBuilder_BindBaseInvestmentSuccessFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OcrCompleteStatus;
import p040o.forEachDstOver;
import p040o.getFileSHA;
import p040o.isQuickAnalysisBitmapNeeded;
import p040o.ocrFailed;
import p040o.performOCR;
import p040o.setTapText;

public class ReviewDeviceActivity extends BaseActivity implements FragmentBuilder_BindBaseInvestmentSuccessFragment.read, C6901Id {
    private forEachDstOver MediaBrowserCompat$MediaItem = new forEachDstOver();
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    @HmlPinActivity
    public ocrFailed reviewDevicePresenter;

    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, boolean z) {
        Intent intent = new Intent(context, ReviewDeviceActivity.class);
        intent.putExtra("EXTRA_ALLOW_DELETE_THIS_DEVICE", false);
        intent.putExtra("EXTRA_IS_CC_ACTIVATION", z);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79682131493193);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_pin_manage_device");
        boolean z = false;
        if (getIntent() != null) {
            this.MediaBrowserCompat$SearchResultReceiver = getIntent().getBooleanExtra("EXTRA_IS_CC_ACTIVATION", false);
        }
        this.reviewDevicePresenter.MediaBrowserCompat$ItemReceiver(this);
        ocrFailed ocrfailed = this.reviewDevicePresenter;
        if (ocrfailed.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ocrfailed.RatingCompat.AlertController$RecycleListView();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
        this.mActionBarTitle.setText(getString(R.string.review_device_page));
    }

    @OnClick
    public void onButtonNextClick() {
        read();
    }

    public final void write(int i) {
        ocrFailed ocrfailed = this.reviewDevicePresenter;
        boolean z = false;
        if (ocrfailed.RatingCompat != null) {
            ocrfailed.RatingCompat.aj_();
        }
        if (i <= 1) {
            performOCR performocr = performOCR.read;
            if (ocrfailed.RatingCompat != null) {
                z = true;
            }
            if (z) {
                performocr.IconCompatParcelizer(ocrfailed.RatingCompat);
            }
        }
    }

    public final void read() {
        ocrFailed ocrfailed = this.reviewDevicePresenter;
        boolean z = true;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            isQuickAnalysisBitmapNeeded isquickanalysisbitmapneeded = isQuickAnalysisBitmapNeeded.MediaBrowserCompat$ItemReceiver;
            if (ocrfailed.RatingCompat == null) {
                z = false;
            }
            if (z) {
                isquickanalysisbitmapneeded.IconCompatParcelizer(ocrfailed.RatingCompat);
                return;
            }
            return;
        }
        OcrCompleteStatus ocrCompleteStatus = OcrCompleteStatus.MediaBrowserCompat$ItemReceiver;
        if (ocrfailed.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ocrCompleteStatus.IconCompatParcelizer(ocrfailed.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getFileSHA getfilesha) {
        Intent read = RegistrationSuccessActivity.read(this, getfilesha);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }
}
