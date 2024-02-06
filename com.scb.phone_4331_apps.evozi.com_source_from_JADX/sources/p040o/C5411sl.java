package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.LogFileManager;
import p040o.ServerProjectProvider;

/* renamed from: o.sl */
public class C5411sl extends writeUInt64NoTag<ServerProjectProvider.C128911> {
    public final AbstractMapEntry IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    final toLongArray MediaBrowserCompat$MediaItem;
    public LogFileManager.DirectoryProvider MediaBrowserCompat$SearchResultReceiver;
    public final onStopJob MediaDescriptionCompat;
    private final getEulerY MediaMetadataCompat;
    public boolean read;
    public String write = "EASYAPP";

    @HmlPinActivity
    public C5411sl(AbstractMapEntry abstractMapEntry, toLongArray tolongarray, RegularImmutableBiMap regularImmutableBiMap, getEulerY geteulery, onStopJob onstopjob) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = abstractMapEntry;
        this.MediaBrowserCompat$MediaItem = tolongarray;
        this.MediaMetadataCompat = geteulery;
        this.MediaDescriptionCompat = onstopjob;
    }

    public void onDestroy() {
        super.onDestroy();
        AbstractMapEntry abstractMapEntry = this.IconCompatParcelizer;
        if (!abstractMapEntry.MediaBrowserCompat$MediaItem.isDisposed()) {
            abstractMapEntry.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void write(C5411sl slVar) {
        if (slVar.RatingCompat != null) {
            slVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ generateBinaryImagesJsonString MediaBrowserCompat$CustomActionResultReceiver(C5411sl slVar) {
        String str = slVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaSessionCompat$Token;
        String str2 = slVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaMetadataCompat;
        if (str != null && str.equals(DiskLruCache.VERSION_1)) {
            return generateBinaryImagesJsonString.MARKETING_CONSENT;
        }
        if (str2 == null || !str2.equals(DiskLruCache.VERSION_1)) {
            return null;
        }
        return generateBinaryImagesJsonString.CROSS_SELL_CONSENT;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5411sl slVar) {
        getGuidancePaint getguidancepaint = new getGuidancePaint(slVar);
        if (slVar.RatingCompat != null) {
            getguidancepaint.IconCompatParcelizer(slVar.RatingCompat);
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C5411sl slVar, generateBinaryImagesJsonString generatebinaryimagesjsonstring) {
        C5407si siVar = new C5407si(slVar, generatebinaryimagesjsonstring);
        if (slVar.RatingCompat != null) {
            siVar.IconCompatParcelizer(slVar.RatingCompat);
        }
    }
}
