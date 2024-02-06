package p040o;

import com.scb.phone.p035di.FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferConfirmationHeaderFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$LiveData$LifecycleBoundObserver */
final class zzmd$zzl$LiveData$LifecycleBoundObserver extends FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment.read.C10701read {
    private DeejungTransferConfirmationHeaderFragment IconCompatParcelizer;
    private /* synthetic */ zzmd.zzl write;

    private zzmd$zzl$LiveData$LifecycleBoundObserver(zzmd.zzl zzl) {
        this.write = zzl;
    }

    /* synthetic */ zzmd$zzl$LiveData$LifecycleBoundObserver(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        DeejungTransferConfirmationHeaderFragment deejungTransferConfirmationHeaderFragment = (DeejungTransferConfirmationHeaderFragment) obj;
        if (deejungTransferConfirmationHeaderFragment != null) {
            this.IconCompatParcelizer = deejungTransferConfirmationHeaderFragment;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.IconCompatParcelizer != null) {
            return new zzmd.zzl.ReflectiveGenericLifecycleObserver(this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(DeejungTransferConfirmationHeaderFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
