package p040o;

import com.scb.phone.view.fragment.cardmanagement.TempLimitPreApprovedBottomFragment;
import p040o.Maps;

/* renamed from: o.outgoingSummary */
public final class outgoingSummary implements MileageQuantitySelectionActivity<TempLimitPreApprovedBottomFragment> {
    public static void write(TempLimitPreApprovedBottomFragment tempLimitPreApprovedBottomFragment, getTrackingId gettrackingid) {
        tempLimitPreApprovedBottomFragment.presenter = gettrackingid;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(TempLimitPreApprovedBottomFragment tempLimitPreApprovedBottomFragment, Maps.C36423 r1) {
        tempLimitPreApprovedBottomFragment.tempLimitPreApprovedDtoMapper = r1;
    }
}
