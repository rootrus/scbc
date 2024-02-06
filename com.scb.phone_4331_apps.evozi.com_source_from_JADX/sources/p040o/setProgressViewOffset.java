package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setProgressViewOffset */
public final class setProgressViewOffset implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindSCBSproductDetailFragment> {
    private final DataModule IconCompatParcelizer;

    private setProgressViewOffset(DataModule dataModule) {
        this.IconCompatParcelizer = dataModule;
    }

    public static setProgressViewOffset write(DataModule dataModule) {
        return new setProgressViewOffset(dataModule);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindSCBSproductDetailFragment MediaSessionCompat$ResultReceiverWrapper = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
        if (MediaSessionCompat$ResultReceiverWrapper != null) {
            return MediaSessionCompat$ResultReceiverWrapper;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
