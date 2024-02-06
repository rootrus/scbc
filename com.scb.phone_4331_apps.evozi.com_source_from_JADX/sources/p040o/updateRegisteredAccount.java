package p040o;

import com.scb.phone.view.fragment.cardmanagement.ActivationSuccessfulFragment;

/* renamed from: o.updateRegisteredAccount */
public final class updateRegisteredAccount implements MileageQuantitySelectionActivity<ActivationSuccessfulFragment> {
    public static void write(ActivationSuccessfulFragment activationSuccessfulFragment, FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        activationSuccessfulFragment.presenter = firebaseVisionBarcodeDetectorOptions;
    }
}
