package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.PerformanceTracker;
import p040o.zzdy;

/* renamed from: o.writeStringSparseArray */
public final /* synthetic */ class writeStringSparseArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ isEmailAddressIdentifierSupported MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ writeStringSparseArray(isEmailAddressIdentifierSupported isemailaddressidentifiersupported) {
        this.MediaBrowserCompat$CustomActionResultReceiver = isemailaddressidentifiersupported;
    }

    public final Object write(Object obj) {
        PerformanceTracker.FrameListener frameListener = (PerformanceTracker.FrameListener) ((SingleDataEntity) obj).getData();
        zzdy.zzb zzb = new zzdy.zzb();
        zzb.IconCompatParcelizer = frameListener.IconCompatParcelizer;
        zzb.write = frameListener.read;
        if (frameListener.write != null) {
            FragmentBuilder_BindSummaryFragment.write(frameListener.write, (OffsetDateTime) null);
        }
        return zzb;
    }
}
