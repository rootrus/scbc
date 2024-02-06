package p040o;

import com.scb.phone.view.fragment.cardmanagement.CardActivationFragment;
import p040o.FirebaseVisionBarcodeDetectorOptions;

/* renamed from: o.getQRCode */
public final class getQRCode implements MileageQuantitySelectionActivity<CardActivationFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(CardActivationFragment cardActivationFragment, FirebaseVisionBarcodeDetectorOptions.Builder builder) {
        cardActivationFragment.presenter = builder;
    }
}
