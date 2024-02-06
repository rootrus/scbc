package p040o;

import android.view.View;
import com.scb.phone.view.fragment.mwpartner.MwEditCreateQrFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashSpeedyLoanTopupIntroductionActivity */
public final /* synthetic */ class C6310x64b32f42 implements View.OnFocusChangeListener {
    private final /* synthetic */ MwEditCreateQrFragment IconCompatParcelizer;

    public /* synthetic */ C6310x64b32f42(MwEditCreateQrFragment mwEditCreateQrFragment) {
        this.IconCompatParcelizer = mwEditCreateQrFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        MwEditCreateQrFragment mwEditCreateQrFragment = this.IconCompatParcelizer;
        if (!z) {
            mwEditCreateQrFragment.presenter.read(mwEditCreateQrFragment.amountEditText.read);
        }
    }
}
