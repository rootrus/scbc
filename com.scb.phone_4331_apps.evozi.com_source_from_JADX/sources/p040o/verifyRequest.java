package p040o;

import com.scb.phone.view.fragment.accountsummary.InvestmentFragment;

/* renamed from: o.verifyRequest */
public final class verifyRequest implements MileageQuantitySelectionActivity<InvestmentFragment> {
    public static void write(InvestmentFragment investmentFragment, buildAppDataFrom buildappdatafrom) {
        investmentFragment.investmentPresenter = buildappdatafrom;
    }
}
