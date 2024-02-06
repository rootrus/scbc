package p040o;

import com.scb.phone.view.fragment.creditcard.CreditCardDetailFragment;
import p040o.TypeAdapters;

/* renamed from: o.postBusinessAndMaritalInfo */
public final class postBusinessAndMaritalInfo implements MileageQuantitySelectionActivity<CreditCardDetailFragment> {
    public static void write(CreditCardDetailFragment creditCardDetailFragment, TypeAdapters.EnumTypeAdapter enumTypeAdapter) {
        creditCardDetailFragment.creditCardDetailPresenter = enumTypeAdapter;
    }
}
