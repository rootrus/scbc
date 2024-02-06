package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.fragment.cardmanagement.SelectPurchaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UncheckedTimeoutException;
import p040o.chain;
import p040o.setTapText;

public class SelectPurchasesActivity extends CCRBaseActivity {
    public static Intent read(Context context, chain chain) {
        Intent intent = new Intent(context, SelectPurchasesActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY", chain);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79862131493211);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        SelectPurchaseFragment selectPurchaseFragment = new SelectPurchaseFragment();
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.container, selectPurchaseFragment, "SELECT_PURCHASES_FRAGMENT_TAG");
        read.write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        if (this.mToolbar != null) {
            this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        }
        if (this.mActionBarTitle != null) {
            this.mActionBarTitle.setTextColor(-9031231);
        }
        setTitle(R.string.select_purchases_deejung);
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
