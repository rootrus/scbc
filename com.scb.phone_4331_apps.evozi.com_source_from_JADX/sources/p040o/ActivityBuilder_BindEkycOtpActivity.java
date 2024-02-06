package p040o;

import com.scb.phone.view.fragment.hml.HmlOutcomeApproveFragment;
import p040o.Iterables;

/* renamed from: o.ActivityBuilder_BindEkycOtpActivity */
public final class ActivityBuilder_BindEkycOtpActivity implements MileageQuantitySelectionActivity<HmlOutcomeApproveFragment> {
    public static void write(HmlOutcomeApproveFragment hmlOutcomeApproveFragment, KofaxWebServiceObjectBase kofaxWebServiceObjectBase) {
        hmlOutcomeApproveFragment.presenter = kofaxWebServiceObjectBase;
    }

    public static void MediaBrowserCompat$ItemReceiver(HmlOutcomeApproveFragment hmlOutcomeApproveFragment, Iterables.C351911.C35201 r1) {
        hmlOutcomeApproveFragment.itemFactory = r1;
    }
}
