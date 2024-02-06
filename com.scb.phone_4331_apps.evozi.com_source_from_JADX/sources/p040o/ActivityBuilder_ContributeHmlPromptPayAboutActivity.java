package p040o;

import com.scb.phone.view.fragment.prepaid.request.PrepaidRequestInputFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlPromptPayAboutActivity */
public final class ActivityBuilder_ContributeHmlPromptPayAboutActivity implements MileageQuantitySelectionActivity<PrepaidRequestInputFragment> {
    public static void read(PrepaidRequestInputFragment prepaidRequestInputFragment, IFaceDetector iFaceDetector) {
        prepaidRequestInputFragment.presenter = iFaceDetector;
    }
}
