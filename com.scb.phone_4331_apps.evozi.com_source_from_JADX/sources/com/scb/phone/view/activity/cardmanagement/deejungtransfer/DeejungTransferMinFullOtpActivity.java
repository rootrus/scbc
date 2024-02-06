package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AnalyticsConnectorImpl;
import p040o.C9880x49974ce;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.checkContentProviderAuthority;
import p040o.getExpirationDate;
import p040o.getLeftEyeOpenProbability;
import p040o.getOversizeImage;
import p040o.getProjectId;
import p040o.setTapText;

public class DeejungTransferMinFullOtpActivity extends BaseOtpActivity implements getExpirationDate {
    private AnalyticsConnectorImpl MediaDescriptionCompat;
    @HmlPinActivity
    public checkContentProviderAuthority presenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, AnalyticsConnectorImpl analyticsConnectorImpl) {
        return new Intent(context, DeejungTransferMinFullOtpActivity.class).putExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL", analyticsConnectorImpl);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        AnalyticsConnectorImpl analyticsConnectorImpl = (AnalyticsConnectorImpl) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL");
        this.MediaDescriptionCompat = analyticsConnectorImpl;
        checkContentProviderAuthority checkcontentproviderauthority = this.presenter;
        String str3 = analyticsConnectorImpl.MediaDescriptionCompat;
        getLeftEyeOpenProbability getlefteyeopenprobability = getLeftEyeOpenProbability.MediaBrowserCompat$CustomActionResultReceiver;
        if (checkcontentproviderauthority.RatingCompat != null) {
            getlefteyeopenprobability.IconCompatParcelizer(checkcontentproviderauthority.RatingCompat);
        }
        checkcontentproviderauthority.read.MediaBrowserCompat$ItemReceiver(str3, str, str2);
        checkcontentproviderauthority.read.IconCompatParcelizer(new C9880x49974ce(checkcontentproviderauthority, (byte) 0));
    }

    public final AnalyticsConnectorImpl MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final void read(getProjectId getprojectid, AnalyticsConnectorImpl analyticsConnectorImpl) {
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
        Intent read2 = DeejungTransferMinFullConfirmationActivity.read(this, getprojectid, analyticsConnectorImpl);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb2.append(read3.getData());
            sb2.append("\n with context ");
            sb2.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
            startActivity(read3);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        finish();
    }

    public final void IconCompatParcelizer() {
        setResult(-1);
        finish();
    }

    public final void IconCompatParcelizer(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
