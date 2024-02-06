package p040o;

import com.scb.phone.view.activity.cardmanagement.DeejungPlansActivity;

/* renamed from: o.iZ */
public final class C7170iZ implements MileageQuantitySelectionActivity<DeejungPlansActivity> {
    public static void read(DeejungPlansActivity deejungPlansActivity, FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        deejungPlansActivity.presenter = firebaseVisionImageMetadata;
    }
}
