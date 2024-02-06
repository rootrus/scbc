package p040o;

import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;
import p040o.ImageProcessor;

/* renamed from: o.PrivacyManagementService */
public final class PrivacyManagementService implements MileageQuantitySelectionActivity<EasycashOccupationInfoFragment> {
    public static void MediaBrowserCompat$ItemReceiver(EasycashOccupationInfoFragment easycashOccupationInfoFragment, ImageProcessor.ProcessProgressEvent processProgressEvent) {
        easycashOccupationInfoFragment.presenter = processProgressEvent;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(EasycashOccupationInfoFragment easycashOccupationInfoFragment, forEachClear foreachclear) {
        easycashOccupationInfoFragment.tracker = foreachclear;
    }
}
