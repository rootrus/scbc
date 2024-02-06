package p040o;

import com.scb.phone.p035di.FragmentBuilder_BindGiftingPresentTransferInputFragment;
import com.scb.phone.view.fragment.sme.gifting.GiftingPresentTransferInputFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$300 */
final class zzmd$zzl$access$300 extends FragmentBuilder_BindGiftingPresentTransferInputFragment.write.IconCompatParcelizer {
    private /* synthetic */ zzmd.zzl IconCompatParcelizer;
    private GiftingPresentTransferInputFragment MediaBrowserCompat$ItemReceiver;

    private zzmd$zzl$access$300(zzmd.zzl zzl) {
        this.IconCompatParcelizer = zzl;
    }

    /* synthetic */ zzmd$zzl$access$300(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        GiftingPresentTransferInputFragment giftingPresentTransferInputFragment = (GiftingPresentTransferInputFragment) obj;
        if (giftingPresentTransferInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = giftingPresentTransferInputFragment;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            return new zzmd.zzl.getXEnd(this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(GiftingPresentTransferInputFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
