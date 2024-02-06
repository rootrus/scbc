package p040o;

import p040o.CharMatcher;
import p040o.ICheckExtractorListener;
import p040o.TransformedImmutableList;

/* renamed from: o.AppStatsSqLiteDs */
public class AppStatsSqLiteDs extends writeUInt64NoTag<ICheckExtractorListener.IconCompatParcelizer> {
    public int IconCompatParcelizer = 1;
    public int MediaBrowserCompat$ItemReceiver = 1;
    /* access modifiers changed from: private */
    public final columnComparator MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String read;
    public final CharMatcher.C31531 write;

    /* renamed from: o.AppStatsSqLiteDs$b */
    public class C3043b extends writeUInt64NoTag<ICheckExtractorListener.read> {
        public GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder IconCompatParcelizer = GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd");
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public doWriteToLog write;

        @HmlPinActivity
        public C3043b(RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
        }
    }

    /* renamed from: o.AppStatsSqLiteDs$a */
    public class C3040a extends writeUInt64NoTag<ICheckExtractorListener$MediaBrowserCompat$ItemReceiver> {
        public String IconCompatParcelizer;
        public final CharMatcher.C315511 MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        /* access modifiers changed from: private */
        public final TransformedImmutableList.C38711 MediaBrowserCompat$SearchResultReceiver;
        public String MediaMetadataCompat;
        public int read = 1;
        public int write = 1;

        @HmlPinActivity
        public C3040a(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.C315511 r2, TransformedImmutableList.C38711 r3) {
            super(regularImmutableBiMap);
            this.MediaBrowserCompat$ItemReceiver = r2;
            this.MediaBrowserCompat$SearchResultReceiver = r3;
        }

        public void onDestroy() {
            CharMatcher.C315511 r0 = this.MediaBrowserCompat$ItemReceiver;
            if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
                r0.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }

        static /* synthetic */ void write(C3040a aVar) {
            if (aVar.RatingCompat != null) {
                aVar.RatingCompat.ay_();
            }
        }

        static /* synthetic */ void read(C3040a aVar) {
            if (aVar.RatingCompat != null) {
                aVar.RatingCompat.ay_();
            }
        }
    }

    @HmlPinActivity
    public AppStatsSqLiteDs(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.C31531 r2, columnComparator columncomparator) {
        super(regularImmutableBiMap);
        this.write = r2;
        this.MediaBrowserCompat$MediaItem = columncomparator;
    }

    public void onDestroy() {
        CharMatcher.C31531 r0 = this.write;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(AppStatsSqLiteDs appStatsSqLiteDs) {
        if (appStatsSqLiteDs.RatingCompat != null) {
            appStatsSqLiteDs.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(AppStatsSqLiteDs appStatsSqLiteDs) {
        if (appStatsSqLiteDs.RatingCompat != null) {
            appStatsSqLiteDs.RatingCompat.ay_();
        }
    }
}
