package p040o;

import com.scb.phone.view.custom.common.MwAmountEditText;
import com.scb.phone.view.fragment.mwpartner.MwEditCreateQrFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashMHMCIntroductionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashMHMCIntroductionActivity implements MwAmountEditText.read {
    private final /* synthetic */ MwEditCreateQrFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeEasycashMHMCIntroductionActivity(MwEditCreateQrFragment mwEditCreateQrFragment) {
        this.IconCompatParcelizer = mwEditCreateQrFragment;
    }

    public final void read() {
        MwEditCreateQrFragment mwEditCreateQrFragment = this.IconCompatParcelizer;
        if (!mwEditCreateQrFragment.amountEditText.getText().toString().isEmpty()) {
            mwEditCreateQrFragment.presenter.read(mwEditCreateQrFragment.amountEditText.read);
        }
    }
}
