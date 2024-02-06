package p040o;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;

/* renamed from: o.nAllocationGetType */
public final class nAllocationGetType implements OPRStatusRewardsLandingActivity_ViewBinding<nAllocationData3D> {
    public static final nAllocationGetType read = new nAllocationGetType();

    public final /* synthetic */ Object get() {
        nAllocationData3D MediaBrowserCompat$CustomActionResultReceiver = EventStoreModule.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
