package p040o;

import com.scb.phone.view.activity.bond.BondSelectionActivity;
import p040o.HeartBeatInfo;

/* renamed from: o.iD */
public final class C7148iD implements MileageQuantitySelectionActivity<BondSelectionActivity> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(BondSelectionActivity bondSelectionActivity, HeartBeatInfo.HeartBeat heartBeat) {
        bondSelectionActivity.presenter = heartBeat;
    }
}
