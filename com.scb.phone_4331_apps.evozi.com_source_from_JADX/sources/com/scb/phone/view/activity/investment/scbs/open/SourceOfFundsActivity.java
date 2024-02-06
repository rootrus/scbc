package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInvestmentInformationSourceOfFundFragment;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;

public class SourceOfFundsActivity extends BaseActivityWithFragment implements FragmentBuilder_BindBaseGiftTransferInputFragment {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return OnboardingInvestmentInformationSourceOfFundFragment.MediaBrowserCompat$ItemReceiver();
    }

    public final String au_() {
        return getString(R.string.investment_information_fund_source_title);
    }

    public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        setResult(0, new Intent());
        finish();
    }
}
