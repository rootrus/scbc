package p040o;

import com.scb.phone.view.fragment.landingpage.LandingFragment;
import java.io.File;
import p040o.C10829Sizeof;

/* renamed from: o.ActivityBuilder_ContributeDirectDebitSuccessActivity */
public final class ActivityBuilder_ContributeDirectDebitSuccessActivity implements MileageQuantitySelectionActivity<LandingFragment> {
    public static void IconCompatParcelizer(LandingFragment landingFragment, C10829Sizeof.C37931 r1) {
        landingFragment.landingPagePresenter = r1;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(LandingFragment landingFragment, File file) {
        landingFragment.fileDir = file;
    }
}
