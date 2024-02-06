package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;

/* renamed from: o.setWscClientType */
public final class setWscClientType implements MileageQuantitySelectionActivity<ScbsAccountDetailPresenter> {
    public static void write(ScbsAccountDetailPresenter scbsAccountDetailPresenter, include include) {
        scbsAccountDetailPresenter.billPaymentCase = include;
    }
}
