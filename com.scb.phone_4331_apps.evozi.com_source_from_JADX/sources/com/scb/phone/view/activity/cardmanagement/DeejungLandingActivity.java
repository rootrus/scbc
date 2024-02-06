package com.scb.phone.view.activity.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UncheckedTimeoutException;
import p040o.ZSYR2K;
import p040o.setTapText;

public class DeejungLandingActivity extends CCRBaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77292131492954);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.deejung_installment_plan);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        this.scbAnalytics.write("deejung_installment_landing", new ZSYR2K("source", "services_tab"));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.deejung_installment_plan);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    @OnClick
    public void onAboutClick() {
        Intent IconCompatParcelizer = CCAboutActivity.IconCompatParcelizer(this, UncheckedTimeoutException.DEEJUNG_INSTALLMENT);
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
    }
}
