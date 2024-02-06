package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getTurnGuidance */
public final class getTurnGuidance extends writeUInt64NoTag<IdExtractor$1$MediaBrowserCompat$ItemReceiver> {
    public final getStartFinalizer IconCompatParcelizer;
    public final StreetViewPanoramaOrientation MediaBrowserCompat$ItemReceiver;
    private final getInfoWindowAnchorU read;

    /* renamed from: o.getTurnGuidance$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor$1$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ String write;

        public IconCompatParcelizer(String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor$1$MediaBrowserCompat$ItemReceiver) obj).write(this.MediaBrowserCompat$ItemReceiver, this.write);
        }
    }

    /* renamed from: o.getTurnGuidance$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor$1$MediaBrowserCompat$ItemReceiver> {
        public static final MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor$1$MediaBrowserCompat$ItemReceiver) obj).mo14210S_();
        }
    }

    /* renamed from: o.getTurnGuidance$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor$1$MediaBrowserCompat$ItemReceiver> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor$1$MediaBrowserCompat$ItemReceiver) obj).write();
        }
    }

    /* renamed from: o.getTurnGuidance$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor$1$MediaBrowserCompat$ItemReceiver> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor$1$MediaBrowserCompat$ItemReceiver) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getTurnGuidance(RegularImmutableBiMap regularImmutableBiMap, getInfoWindowAnchorU getinfowindowanchoru, getStartFinalizer getstartfinalizer, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) getinfowindowanchoru, "deepLinkCase");
        onGetStartedClick.write((Object) getstartfinalizer, "getNtbUserInfoUseCase");
        onGetStartedClick.write((Object) streetViewPanoramaOrientation, "landingCase");
        this.read = getinfowindowanchoru;
        this.IconCompatParcelizer = getstartfinalizer;
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaOrientation;
    }

    public final void onDestroy() {
        super.onDestroy();
        getInfoWindowAnchorU getinfowindowanchoru = this.read;
        if (!getinfowindowanchoru.MediaBrowserCompat$MediaItem.isDisposed()) {
            getinfowindowanchoru.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
