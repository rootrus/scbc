package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.onboarding.FundPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindPayerReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindPayerReviewActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FundPersonalInfoFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindPayerReviewActivity(FundPersonalInfoFragment fundPersonalInfoFragment) {
        this.IconCompatParcelizer = fundPersonalInfoFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundPersonalInfoFragment fundPersonalInfoFragment = this.IconCompatParcelizer;
        dialogInterface.dismiss();
        fundPersonalInfoFragment.mo15340x50fd9e4a(false);
    }
}
