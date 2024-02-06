package p040o;

import com.scb.phone.view.fragment.sme.gifting.GiftingFragment;
import java.util.List;

/* renamed from: o.ActivityBuilder_ContributeRemittanceCoachmarkActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRemittanceCoachmarkActivity implements Runnable {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ GiftingFragment write;

    public /* synthetic */ ActivityBuilder_ContributeRemittanceCoachmarkActivity(GiftingFragment giftingFragment, List list) {
        this.write = giftingFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void run() {
        GiftingFragment giftingFragment = this.write;
        List list = this.MediaBrowserCompat$ItemReceiver;
        giftingFragment.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(list.size() - 1, 1);
    }
}
