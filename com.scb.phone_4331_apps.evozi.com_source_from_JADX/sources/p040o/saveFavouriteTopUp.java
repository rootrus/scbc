package p040o;

import com.scb.phone.view.fragment.bulktransfer.SelectBankFragment;
import p040o.PersistedInstallationEntry;

/* renamed from: o.saveFavouriteTopUp */
public final class saveFavouriteTopUp implements MileageQuantitySelectionActivity<SelectBankFragment> {
    public static void IconCompatParcelizer(SelectBankFragment selectBankFragment, PersistedInstallationEntry.Builder builder) {
        selectBankFragment.selectBankPresenter = builder;
    }
}
