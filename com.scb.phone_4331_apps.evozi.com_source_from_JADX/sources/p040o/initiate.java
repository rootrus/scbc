package p040o;

import com.scb.phone.view.fragment.deposit.DepositMoreInfoFragment;

/* renamed from: o.initiate */
public final class initiate implements MileageQuantitySelectionActivity<DepositMoreInfoFragment> {
    public static void write(DepositMoreInfoFragment depositMoreInfoFragment, getKtdxXML getktdxxml) {
        depositMoreInfoFragment.depositMoreInfoPresenter = getktdxxml;
    }
}
