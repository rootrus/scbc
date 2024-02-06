package p040o;

import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.sme.deals.DealsBuySuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeRegistrationTermsAndConsActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRegistrationTermsAndConsActivity implements View.OnClickListener {
    private final /* synthetic */ DealsBuySuccessFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeRegistrationTermsAndConsActivity(DealsBuySuccessFragment dealsBuySuccessFragment) {
        this.IconCompatParcelizer = dealsBuySuccessFragment;
    }

    public final void onClick(View view) {
        DealsBuySuccessFragment dealsBuySuccessFragment = this.IconCompatParcelizer;
        C5166qL qLVar = dealsBuySuccessFragment.dealsBuySuccessPresenter;
        C5163qH qHVar = new C5163qH(qLVar);
        if (qLVar.RatingCompat != null) {
            qHVar.IconCompatParcelizer(qLVar.RatingCompat);
        }
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "sme_deal"), new ZSYR2K("subtype", "deals"), new ZSYR2K("button", "smedeal_purchase_history")};
        if (dealsBuySuccessFragment.getActivity() != null) {
            ((BaseActivity) dealsBuySuccessFragment.getActivity()).scbAnalytics.write("billpay_slip", zsyr2kArr);
        }
    }
}
