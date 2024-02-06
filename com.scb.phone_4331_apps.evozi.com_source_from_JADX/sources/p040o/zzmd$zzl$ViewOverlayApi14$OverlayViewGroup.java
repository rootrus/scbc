package p040o;

import com.scb.phone.p035di.FragmentBuilder_BindHmlNTBDocumentListFragment;
import com.scb.phone.view.fragment.hml.HmlNTBDocumentListFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$ViewOverlayApi14$OverlayViewGroup */
final class zzmd$zzl$ViewOverlayApi14$OverlayViewGroup extends FragmentBuilder_BindHmlNTBDocumentListFragment.write.IconCompatParcelizer {
    private HmlNTBDocumentListFragment IconCompatParcelizer;
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$CustomActionResultReceiver;

    private zzmd$zzl$ViewOverlayApi14$OverlayViewGroup(zzmd.zzl zzl) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$ViewOverlayApi14$OverlayViewGroup(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.IconCompatParcelizer != null) {
            return new zzmd.zzl.setSize(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(HmlNTBDocumentListFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        HmlNTBDocumentListFragment hmlNTBDocumentListFragment = (HmlNTBDocumentListFragment) obj;
        if (hmlNTBDocumentListFragment != null) {
            this.IconCompatParcelizer = hmlNTBDocumentListFragment;
            return;
        }
        throw null;
    }
}
