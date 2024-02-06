package p040o;

import com.scb.phone.view.fragment.investment.onboarding.C6038x535d976b;
import com.scb.phone.view.fragment.investment.onboarding.FundMaritalStatusFragment;

/* renamed from: o.ActivityBuilder_BindPartnerWebViewActivity */
public final /* synthetic */ class ActivityBuilder_BindPartnerWebViewActivity implements C6038x535d976b {
    private final /* synthetic */ FundMaritalStatusFragment read;

    public /* synthetic */ ActivityBuilder_BindPartnerWebViewActivity(FundMaritalStatusFragment fundMaritalStatusFragment) {
        this.read = fundMaritalStatusFragment;
    }

    public final void write(CharSequence charSequence, int i) {
        this.read.fundMaritalPresenter.MediaBrowserCompat$CustomActionResultReceiver(charSequence.toString(), i, true);
    }
}
