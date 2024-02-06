package p040o;

import p040o.access$2300;

/* renamed from: o.getUri */
public class getUri extends writeUInt64NoTag<C7381x4108488a> {
    public int IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final newHashMap read;
    public MapStyleOptions write;

    @HmlPinActivity
    public getUri(RegularImmutableBiMap regularImmutableBiMap, newHashMap newhashmap, MapStyleOptions mapStyleOptions) {
        super(regularImmutableBiMap);
        this.read = newhashmap;
        this.write = mapStyleOptions;
    }

    /* renamed from: o.getUri$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Object> {
        private read() {
        }

        public /* synthetic */ read(getUri geturi, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            getUri geturi = getUri.this;
            geturi.MediaBrowserCompat$ItemReceiver(geturi.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onNext(Object obj) {
            getUri.read(getUri.this);
            boolean z = true;
            if (getUri.this.RatingCompat != null) {
                getUri geturi = getUri.this;
                encodeFidBase64UrlSafe encodefidbase64urlsafe = encodeFidBase64UrlSafe.MediaBrowserCompat$ItemReceiver;
                if (geturi.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    encodefidbase64urlsafe.IconCompatParcelizer(geturi.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void write(getUri geturi) {
        if (geturi.RatingCompat != null) {
            geturi.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(getUri geturi) {
        if (geturi.RatingCompat != null) {
            geturi.RatingCompat.aj_();
        }
    }

    public static /* synthetic */ setValueReference MediaBrowserCompat$CustomActionResultReceiver(setNameFormat setnameformat) {
        setValueReference MediaBrowserCompat$ItemReceiver = setValueReference.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = setnameformat.MediaDescriptionCompat;
        MediaBrowserCompat$ItemReceiver.read = setnameformat.read;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = setnameformat.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = setnameformat.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.write = setnameformat.RatingCompat;
        return MediaBrowserCompat$ItemReceiver;
    }
}
