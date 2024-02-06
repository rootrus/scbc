package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isRetryOk */
public final class isRetryOk extends UserProfile {

    /* renamed from: o.isRetryOk$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
        private /* synthetic */ isRetryOk read;

        IconCompatParcelizer(isRetryOk isretryok) {
            this.read = isretryok;
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
    public isRetryOk(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray, setCollapsedTitleTextAppearance setcollapsedtitletextappearance, loadRawResourceStyle loadrawresourcestyle, setCollapsedTitleTextColor setcollapsedtitletextcolor, newEnumSet newenumset, setExpandedTitleTypeface setexpandedtitletypeface, getEulerY geteulery, setItemIconTintList setitemicontintlist, BottomAppBar bottomAppBar, width width) {
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
        onGetStartedClick.write((Object) bottomAppBar, "hmlGetStoredFormattedCampaingIntentCase");
        onGetStartedClick.write((Object) width, "getCachedCrmIDCase");
    }

    /* renamed from: o.isRetryOk$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
        final /* synthetic */ isRetryOk write;

        /* renamed from: o.isRetryOk$read$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
            private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ read read;

            write(read read2, String str) {
                this.read = read2;
                this.MediaBrowserCompat$CustomActionResultReceiver = str;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((PassportCaptureModule_GetIExtractionServerRttiFactory) obj).read(this.read.write.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        read(isRetryOk isretryok) {
            this.write = isretryok;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "applicationUuid");
            super.onNext(str);
            isRetryOk.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            isRetryOk isretryok = this.write;
            writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, str);
            if (isretryok.RatingCompat != null) {
                write2.IconCompatParcelizer(isretryok.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(isRetryOk isretryok) {
        if (isretryok.RatingCompat != null) {
            isretryok.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        write().write(write().MediaBrowserCompat$ItemReceiver(), new read(this));
    }
}
