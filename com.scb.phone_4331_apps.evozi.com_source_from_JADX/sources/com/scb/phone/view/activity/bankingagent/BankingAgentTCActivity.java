package com.scb.phone.view.activity.bankingagent;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.bankingagent.BankingAgentTCFragment$MediaBrowserCompat$ItemReceiver;
import p040o.C1388iy;
import p040o.onGetStartedClick;

public final class BankingAgentTCActivity extends BaseActivityWithFragment implements C1388iy {
    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        setResult(-1);
        finish();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        BankingAgentTCFragment$MediaBrowserCompat$ItemReceiver bankingAgentTCFragment$MediaBrowserCompat$ItemReceiver = BankingAgentTCFragment$MediaBrowserCompat$ItemReceiver.write;
        return BankingAgentTCFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    public final String au_() {
        String string = getString(R.string.mf_onboarding_page_terms_and_condition);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.mf_on…page_terms_and_condition)");
        return string;
    }

    public final void setContentView() {
        setResult(0);
        finish();
    }
}
