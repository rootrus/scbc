package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.NetworkService */
public final class NetworkService extends UserProfile {

    /* renamed from: o.NetworkService$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
        private /* synthetic */ NetworkService read;

        IconCompatParcelizer(NetworkService networkService) {
            this.read = networkService;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportCaptureModule_GetIExtractionServerRttiFactory passportCaptureModule_GetIExtractionServerRttiFactory = (PassportCaptureModule_GetIExtractionServerRttiFactory) obj;
            String str = this.read.MediaMetadataCompat;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
            }
            String str2 = this.read.MediaBrowserCompat$MediaItem;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("principalAmount");
            }
            passportCaptureModule_GetIExtractionServerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(str, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public NetworkService(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray, setCollapsedTitleTextAppearance setcollapsedtitletextappearance, loadRawResourceStyle loadrawresourcestyle, setCollapsedTitleTextColor setcollapsedtitletextcolor, newEnumSet newenumset, setExpandedTitleTypeface setexpandedtitletypeface, getEulerY geteulery, setItemIconTintList setitemicontintlist, BottomAppBar bottomAppBar, width width) {
        super(regularImmutableBiMap, tolongarray, setcollapsedtitletextappearance, loadrawresourcestyle, setcollapsedtitletextcolor, newenumset, setexpandedtitletypeface, geteulery, setitemicontintlist, bottomAppBar, width);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "termsAndConsMapper");
        onGetStartedClick.write((Object) setcollapsedtitletextappearance, "hmlGetApplicationsCase");
        onGetStartedClick.write((Object) loadrawresourcestyle, "countriesCase");
        onGetStartedClick.write((Object) setcollapsedtitletextcolor, "hmlGetApplicationUuid");
        onGetStartedClick.write((Object) newenumset, "hmlReviewDisplayMapper");
        onGetStartedClick.write((Object) setexpandedtitletypeface, "hmlGetProductTypeCase");
        onGetStartedClick.write((Object) geteulery, "getUserProfileUseCase");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
        onGetStartedClick.write((Object) bottomAppBar, "getStoredUtmContentCase");
        onGetStartedClick.write((Object) width, "getCachedCrmIDCase");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        boolean z = true;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        write().write(write().MediaBrowserCompat$ItemReceiver(), new write(this));
    }

    /* renamed from: o.NetworkService$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
        final /* synthetic */ NetworkService IconCompatParcelizer;

        /* renamed from: o.NetworkService$write$read */
        static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
            private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ write MediaBrowserCompat$ItemReceiver;

            read(write write, String str) {
                this.MediaBrowserCompat$ItemReceiver = write;
                this.MediaBrowserCompat$CustomActionResultReceiver = str;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((PassportCaptureModule_GetIExtractionServerRttiFactory) obj).read(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        write(NetworkService networkService) {
            this.IconCompatParcelizer = networkService;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "applicationUuid");
            super.onNext(str);
            NetworkService networkService = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this, str);
            if (networkService.RatingCompat != null) {
                read2.IconCompatParcelizer(networkService.RatingCompat);
            }
            NetworkService.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(NetworkService networkService) {
        if (networkService.RatingCompat != null) {
            networkService.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(NetworkService networkService) {
        writeUInt64NoTag.IconCompatParcelizer networkService$MediaBrowserCompat$CustomActionResultReceiver = new NetworkService$MediaBrowserCompat$CustomActionResultReceiver(networkService);
        if (networkService.RatingCompat != null) {
            networkService$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(networkService.RatingCompat);
        }
    }
}
