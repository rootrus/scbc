package p040o;

import com.scb.phone.view.adapter.cardmanagement.DeejungInstallmentsReviewAdapter;
import com.scb.phone.view.fragment.cardmanagement.DeejungInstallmentsReviewFragment;
import p040o.FirebaseVisionCloudDetectorOptions;

/* renamed from: o.PromptPayService */
public final class PromptPayService implements MileageQuantitySelectionActivity<DeejungInstallmentsReviewFragment> {
    public static void IconCompatParcelizer(DeejungInstallmentsReviewFragment deejungInstallmentsReviewFragment, DeejungInstallmentsReviewAdapter deejungInstallmentsReviewAdapter) {
        deejungInstallmentsReviewFragment.deejungInstallmentsReviewAdapter = deejungInstallmentsReviewAdapter;
    }

    public static void IconCompatParcelizer(DeejungInstallmentsReviewFragment deejungInstallmentsReviewFragment, FirebaseVisionCloudDetectorOptions.Builder builder) {
        deejungInstallmentsReviewFragment.presenter = builder;
    }
}
