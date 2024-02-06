package p040o;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;

/* renamed from: o.nAllocationCubeCreateFromBitmap */
public final class nAllocationCubeCreateFromBitmap implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    public static final nAllocationCubeCreateFromBitmap write = new nAllocationCubeCreateFromBitmap();

    public final /* synthetic */ Object get() {
        String IconCompatParcelizer = EventStoreModule.IconCompatParcelizer();
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
