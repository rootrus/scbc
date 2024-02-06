package p040o;

import com.scb.phone.view.fragment.cardmanagement.ChangeChannelStatementApplyAllFragment;

/* renamed from: o.purchasePaymentConfirmation */
public final class purchasePaymentConfirmation implements MileageQuantitySelectionActivity<ChangeChannelStatementApplyAllFragment> {
    public static void write(ChangeChannelStatementApplyAllFragment changeChannelStatementApplyAllFragment, FirebaseVisionImage firebaseVisionImage) {
        changeChannelStatementApplyAllFragment.presenter = firebaseVisionImage;
    }
}
