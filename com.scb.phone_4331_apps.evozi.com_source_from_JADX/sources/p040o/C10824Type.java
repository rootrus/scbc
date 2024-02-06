package p040o;

import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.Type  reason: case insensitive filesystem */
public final class C10824Type implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindSlipFragment> {
    private static final C10824Type read = new C10824Type();

    /* renamed from: o.Type$Builder */
    public final class Builder implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindPrepaidTravelServicesTabFragment> {
        private final DataModule write;

        private Builder(DataModule dataModule) {
            this.write = dataModule;
        }

        public static Builder write(DataModule dataModule) {
            return new Builder(dataModule);
        }

        public final /* synthetic */ Object get() {
            FragmentBuilder_BindPrepaidTravelServicesTabFragment read = this.write.read();
            if (read != null) {
                return read;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.Type$CubemapFace */
    public final class CubemapFace implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindProductCatalogFragment> {
        private final DataModule write;

        private CubemapFace(DataModule dataModule) {
            this.write = dataModule;
        }

        public static CubemapFace MediaBrowserCompat$ItemReceiver(DataModule dataModule) {
            return new CubemapFace(dataModule);
        }

        public final /* synthetic */ Object get() {
            FragmentBuilder_BindProductCatalogFragment MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver != null) {
                return MediaBrowserCompat$ItemReceiver;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static C10824Type MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }

    public final /* synthetic */ Object get() {
        return new FragmentBuilder_BindSlipFragment();
    }
}
