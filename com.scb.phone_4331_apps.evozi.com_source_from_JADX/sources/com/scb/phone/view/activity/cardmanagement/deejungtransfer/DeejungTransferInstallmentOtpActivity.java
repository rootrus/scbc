package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.detectVersion;
import p040o.detectVersion$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getAddress4;
import p040o.getOversizeImage;
import p040o.getProjectId;
import p040o.getUserAgent;
import p040o.registerAnalyticsConnectorListener;
import p040o.setTapText;

public class DeejungTransferInstallmentOtpActivity extends BaseOtpActivity implements getAddress4 {
    private registerAnalyticsConnectorListener MediaMetadataCompat;
    @HmlPinActivity
    public detectVersion presenter;

    public static Intent read(Context context, registerAnalyticsConnectorListener registeranalyticsconnectorlistener) {
        return new Intent(context, DeejungTransferInstallmentOtpActivity.class).putExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL", registeranalyticsconnectorlistener);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        registerAnalyticsConnectorListener registeranalyticsconnectorlistener = (registerAnalyticsConnectorListener) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL");
        this.MediaMetadataCompat = registeranalyticsconnectorlistener;
        detectVersion detectversion = this.presenter;
        String str3 = registeranalyticsconnectorlistener.ParcelableVolumeInfo;
        getUserAgent getuseragent = getUserAgent.IconCompatParcelizer;
        if (detectversion.RatingCompat != null) {
            getuseragent.IconCompatParcelizer(detectversion.RatingCompat);
        }
        detectversion.write.IconCompatParcelizer(str3, str, str2);
        detectversion.write.IconCompatParcelizer(new detectVersion$MediaBrowserCompat$CustomActionResultReceiver(detectversion, (byte) 0));
    }

    public final registerAnalyticsConnectorListener read() {
        return this.MediaMetadataCompat;
    }

    public final void write(getProjectId getprojectid, registerAnalyticsConnectorListener registeranalyticsconnectorlistener) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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
        Intent write2 = DeejungTransferInstallmentsConfirmationActivity.write(this, getprojectid, registeranalyticsconnectorlistener);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, write2).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb2.append(read2.getData());
            sb2.append("\n with context ");
            sb2.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
            startActivity(read2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        finish();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    /* renamed from: K_ */
    public final void mo13720K_() {
        setResult(-1);
        finish();
    }

    /* renamed from: b_ */
    public final void mo13729b_(access$2200 access_2200) {
        write(this, R.id.root_activity, access_2200.IconCompatParcelizer, getOversizeImage.ERROR);
    }
}
