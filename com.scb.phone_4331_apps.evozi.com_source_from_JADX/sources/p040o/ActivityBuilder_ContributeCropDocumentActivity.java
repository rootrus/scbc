package p040o;

import com.scb.phone.view.fragment.juristic.JuristicRequestFormFragment;

/* renamed from: o.ActivityBuilder_ContributeCropDocumentActivity */
public final class ActivityBuilder_ContributeCropDocumentActivity implements MileageQuantitySelectionActivity<JuristicRequestFormFragment> {
    public static void write(JuristicRequestFormFragment juristicRequestFormFragment, DocumentCaptureExperience documentCaptureExperience) {
        juristicRequestFormFragment.presenter = documentCaptureExperience;
    }
}
