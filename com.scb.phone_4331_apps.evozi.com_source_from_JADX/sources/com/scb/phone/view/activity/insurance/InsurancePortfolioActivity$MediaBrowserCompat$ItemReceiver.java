package com.scb.phone.view.activity.insurance;

import com.scb.phone.view.adapter.insurance.InsurersAdapter;
import java.util.ArrayList;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

final class InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<InsurersAdapter> {
    private /* synthetic */ InsurancePortfolioActivity IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver(InsurancePortfolioActivity insurancePortfolioActivity) {
        super(0);
        this.IconCompatParcelizer = insurancePortfolioActivity;
    }

    public final /* synthetic */ Object invoke() {
        return new InsurersAdapter(new ArrayList(), this.IconCompatParcelizer);
    }
}
