package p040o;

import com.scb.phone.p035di.C2664x294420fd;
import com.scb.phone.view.fragment.sme.gifting.GiftingMoneyTransferInputFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$100 */
final class zzmd$zzl$access$100 extends C2664x294420fd.read {
    private GiftingMoneyTransferInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ zzmd.zzl read;

    private zzmd$zzl$access$100(zzmd.zzl zzl) {
        this.read = zzl;
    }

    /* synthetic */ zzmd$zzl$access$100(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        GiftingMoneyTransferInputFragment giftingMoneyTransferInputFragment = (GiftingMoneyTransferInputFragment) obj;
        if (giftingMoneyTransferInputFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = giftingMoneyTransferInputFragment;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return new zzmd.zzl.C10876Script.InvokeID(this.read);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(GiftingMoneyTransferInputFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
