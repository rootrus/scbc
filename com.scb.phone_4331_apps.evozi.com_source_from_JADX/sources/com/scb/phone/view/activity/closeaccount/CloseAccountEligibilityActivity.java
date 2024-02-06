package com.scb.phone.view.activity.closeaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;
import com.scb.phone.view.activity.etb.BaseEligibilityActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import p040o.CheckUsabilityData;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlCalculatorDeepLinkActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.getFirstPassTexelWidthUniform;
import p040o.setTapText;

public class CloseAccountEligibilityActivity extends BaseEligibilityActivity implements CheckUsabilityData.write {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo14154x50fd9e4a() {
        return R.string.close_account_eligibility_title;
    }

    public final String MediaSessionCompat$Token() {
        return "CLOSE_ACCOUNT";
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, CloseAccountEligibilityActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.add("3002");
        getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform = this.eligibilityPresenter;
        getfirstpasstexelwidthuniform.write = arrayList;
        getfirstpasstexelwidthuniform.read = this;
        getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform2 = this.eligibilityPresenter;
        getfirstpasstexelwidthuniform2.MediaDescriptionCompat.read().write(new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                getFirstPassTexelWidthUniform.this.MediaBrowserCompat$ItemReceiver = (String) obj;
            }
        }, HmlCalculatorDeepLinkActivity.write);
    }

    public final void IconCompatParcelizer() {
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

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = CloseAccountSelectMainAccountActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        CloseAccountSelectionActivity.IconCompatParcelizer(this);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        mo13676d_("close_acct_eligibility");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TransferActivity.write(this, "input", this.eligibilityPresenter.MediaBrowserCompat$ItemReceiver);
        finish();
    }
}
