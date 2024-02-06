package p040o;

import com.google.gson.Gson;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setMipmaps */
public final class setMipmaps implements OPRStatusRewardsLandingActivity_ViewBinding<Gson> {
    private final DataModule IconCompatParcelizer;

    private setMipmaps(DataModule dataModule) {
        this.IconCompatParcelizer = dataModule;
    }

    public static setMipmaps MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule) {
        return new setMipmaps(dataModule);
    }

    public final /* synthetic */ Object get() {
        Gson MediaBrowserCompat$MediaItem = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
