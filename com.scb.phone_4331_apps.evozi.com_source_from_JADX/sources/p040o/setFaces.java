package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setFaces */
public final class setFaces implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindPurchaseFromTabSelectionFragment> {
    private final DataModule MediaBrowserCompat$CustomActionResultReceiver;

    private setFaces(DataModule dataModule) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dataModule;
    }

    public static setFaces MediaBrowserCompat$ItemReceiver(DataModule dataModule) {
        return new setFaces(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindPurchaseFromTabSelectionFragment write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
