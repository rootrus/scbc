package com.scb.phone.view.activity.investment.redeem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.investment.FundActionsSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CheckParameters;
import p040o.HmlPinActivity;
import p040o.MetaDataStore;
import p040o.MyECouponActivity_ViewBinding;
import p040o.checkForPreviousCrash;
import p040o.getCropLineColor;
import p040o.getCropLineColor$MediaBrowserCompat$ItemReceiver;
import p040o.reverse;
import p040o.setTapText;

public class FundRedeemOtpActivity extends BaseOtpActivity implements CheckParameters.write {
    @HmlPinActivity
    public getCropLineColor presenter;

    public static Intent write(Context context, String str, MetaDataStore metaDataStore) {
        return new Intent(context, FundRedeemOtpActivity.class).putExtra("EXTRA_REDEEM_VERIFICATION_DISPLAY", metaDataStore).putExtra("EXTRA_STATEMENT_OF_HOLDING", str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getCropLineColor getcroplinecolor = this.presenter;
        getcroplinecolor.IconCompatParcelizer = getIntent().getStringExtra("EXTRA_STATEMENT_OF_HOLDING");
        getcroplinecolor.write = (MetaDataStore) getIntent().getParcelableExtra("EXTRA_REDEEM_VERIFICATION_DISPLAY");
    }

    public final void write(String str, String str2) {
        getCropLineColor getcroplinecolor = this.presenter;
        if (getcroplinecolor.RatingCompat != null) {
            getcroplinecolor.RatingCompat.AlertController$RecycleListView();
        }
        reverse reverse = new reverse();
        reverse.MediaBrowserCompat$ItemReceiver = getcroplinecolor.IconCompatParcelizer;
        reverse.IconCompatParcelizer = getcroplinecolor.write.MediaBrowserCompat$ItemReceiver;
        getcroplinecolor.read.MediaBrowserCompat$ItemReceiver(reverse, str, str2);
        getcroplinecolor.read.IconCompatParcelizer(new getCropLineColor$MediaBrowserCompat$ItemReceiver(getcroplinecolor, (byte) 0));
    }

    public final void IconCompatParcelizer(checkForPreviousCrash checkforpreviouscrash) {
        Intent intent = new Intent(this, FundActionsSuccessActivity.class);
        intent.putExtra("com.scb.phone.ARGS_SUCCESS_DATA", checkforpreviouscrash);
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
}
