package p040o;

import com.scb.phone.p035di.C1930x1492c096;
import com.scb.phone.view.activity.sme.gifting.GiftingOpenedActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$000 */
final class zzmd$zzl$access$000 extends C1930x1492c096.read {
    private /* synthetic */ zzmd.zzl IconCompatParcelizer;
    private GiftingOpenedActivity MediaBrowserCompat$CustomActionResultReceiver;

    private zzmd$zzl$access$000(zzmd.zzl zzl) {
        this.IconCompatParcelizer = zzl;
    }

    /* synthetic */ zzmd$zzl$access$000(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        GiftingOpenedActivity giftingOpenedActivity = (GiftingOpenedActivity) obj;
        if (giftingOpenedActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = giftingOpenedActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return new zzmd.zzl.C10876Script.KernelID(this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(GiftingOpenedActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
