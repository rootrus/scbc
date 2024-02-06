package com.scb.phone.view.activity.closeaccount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Phenotype;
import p040o.getFieldNames;
import p040o.getFieldNames$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setEnableSessionCreation;
import p040o.setNeedClientAuth;
import p040o.setReceiveBufferSize;
import p040o.setTapText;
import p040o.setUseClientMode;

public class CloseAccountConfirmationOtpActivity extends BaseOtpActivity implements IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory {
    @HmlPinActivity
    public getFieldNames presenter;

    public static Intent read(Activity activity) {
        return new Intent(activity, CloseAccountConfirmationOtpActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("close_acct_otp");
    }

    public final void write(String str, String str2) {
        getFieldNames getfieldnames = this.presenter;
        if (!getfieldnames.IconCompatParcelizer) {
            boolean z = true;
            getfieldnames.IconCompatParcelizer = true;
            if (getfieldnames.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getfieldnames.RatingCompat.AlertController$RecycleListView();
            }
            Phenotype phenotype = getfieldnames.write;
            phenotype.write(phenotype.write.read().map(setEnableSessionCreation.IconCompatParcelizer).map(setUseClientMode.MediaBrowserCompat$CustomActionResultReceiver).flatMap(new setReceiveBufferSize(phenotype, str2, str)).flatMap(setNeedClientAuth.write), new getFieldNames$MediaBrowserCompat$CustomActionResultReceiver(getfieldnames, (byte) 0));
        }
    }

    public final void read() {
        Intent intent = new Intent(this, DepositDetailActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
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
    }

    /* renamed from: K_ */
    public final void mo13720K_() {
        Intent write = CloseAccountSuccessActivity.write(this);
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
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RatingCompat(false);
    }
}
