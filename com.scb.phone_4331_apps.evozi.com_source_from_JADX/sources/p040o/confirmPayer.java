package p040o;

import com.scb.phone.view.fragment.cardmanagement.StatementChannelChooseAddressFragment;

/* renamed from: o.confirmPayer */
public final class confirmPayer implements MileageQuantitySelectionActivity<StatementChannelChooseAddressFragment> {
    public static void read(StatementChannelChooseAddressFragment statementChannelChooseAddressFragment, FirebaseVisionFace firebaseVisionFace) {
        statementChannelChooseAddressFragment.presenter = firebaseVisionFace;
    }
}
