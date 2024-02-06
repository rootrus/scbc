package p040o;

import com.scb.phone.view.fragment.cardmanagement.SelectPurchaseFragment;
import p040o.FirebaseVisionImageMetadata;

/* renamed from: o.getLanding */
public final class getLanding implements MileageQuantitySelectionActivity<SelectPurchaseFragment> {
    public static void IconCompatParcelizer(SelectPurchaseFragment selectPurchaseFragment, FirebaseVisionImageMetadata.Builder builder) {
        selectPurchaseFragment.presenter = builder;
    }
}
