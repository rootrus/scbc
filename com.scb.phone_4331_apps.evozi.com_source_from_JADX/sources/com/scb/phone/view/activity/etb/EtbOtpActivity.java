package com.scb.phone.view.activity.etb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.GPUStrategyFocusFactorDetection;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1900;
import p040o.cacheUserData;
import p040o.defaultReportUploader;
import p040o.getSecondPassProgram;
import p040o.newGPUStrategyCombinedEdgeDetection;
import p040o.postWriteCleanup;
import p040o.remainingCapacity;
import p040o.setClassificationType;
import p040o.setCvv;
import p040o.setTapText;

public class EtbOtpActivity extends BaseOtpActivity implements setCvv.IconCompatParcelizer {
    @HmlPinActivity
    public getSecondPassProgram presenter;

    public static Intent IconCompatParcelizer(Activity activity) {
        return new Intent(activity, EtbOtpActivity.class).putExtra("EXTRA_OTP_POLICY_ID", (String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        defaultReportUploader defaultreportuploader = (defaultReportUploader) getIntent().getParcelableExtra("ARG_ETB_REVIEW");
        getSecondPassProgram getsecondpassprogram = this.presenter;
        getsecondpassprogram.MediaBrowserCompat$ItemReceiver = defaultreportuploader;
        if (getsecondpassprogram.RatingCompat != null) {
            getsecondpassprogram.RatingCompat.AlertController$RecycleListView();
        }
        postWriteCleanup postwritecleanup = new postWriteCleanup(defaultreportuploader.MediaBrowserCompat$ItemReceiver, getsecondpassprogram.read);
        setClassificationType setclassificationtype = getsecondpassprogram.IconCompatParcelizer;
        setclassificationtype.read(setclassificationtype.write.read(str, str2, postwritecleanup), new GPUStrategyFocusFactorDetection(getsecondpassprogram), new newGPUStrategyCombinedEdgeDetection(getsecondpassprogram));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(remainingCapacity remainingcapacity) {
        Intent read = EtbSuccessActivity.read(this, (access$1900) getIntent().getExtras().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT"), (cacheUserData) remainingcapacity, (defaultReportUploader) getIntent().getParcelableExtra("ARG_ETB_REVIEW"));
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

    public final void MediaDescriptionCompat() {
        setResult(-1, new Intent());
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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
        setResult(-1);
        finish();
    }

    public final void read() {
        Intent write = ETBOtp9100ErrorActivity.write(this);
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
        setResult(-1);
        finish();
    }
}
