package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachSrcAtop$MediaBrowserCompat$ItemReceiver */
public final class forEachSrcAtop$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<forEachSrcAtop> {

    /* renamed from: o.forEachSrcAtop$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public final String IconCompatParcelizer = "asset_type";
        public final String MediaBrowserCompat$CustomActionResultReceiver = "asset_code";
        public final String MediaBrowserCompat$ItemReceiver = "banner_header";
        public final String MediaBrowserCompat$MediaItem = "keyword";
        public final String MediaBrowserCompat$SearchResultReceiver = "fund";
        public final String RatingCompat = "filter_usage";
        public final String read = "event";
        public final String write = "banner_sequence";
    }

    /* renamed from: o.forEachSrcAtop$MediaBrowserCompat$ItemReceiver$write */
    public static final class write {
        public final String IconCompatParcelizer = "mfdiscovery_disclaimer";
        public final String MediaBrowserCompat$CustomActionResultReceiver = "mfdiscovery_bannerclicked";
        public final String MediaBrowserCompat$ItemReceiver = "mfdiscovery_highlightbanner";
        public final String MediaBrowserCompat$MediaItem = "mfdiscovery_search";
        public final String MediaBrowserCompat$SearchResultReceiver = "mfdiscovery_recommendedfund";

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f2582x50fd9e4a = "mfdiscovery_toppickbycategory";
        public final String MediaDescriptionCompat = "mfdiscovery_search_filter";
        public final String MediaMetadataCompat = "mfdiscovery_search_amc";
        public final String MediaSessionCompat$QueueItem = "mfdiscovery_searchfundclicked";
        public final String MediaSessionCompat$ResultReceiverWrapper = "mfdiscovery_search_typeoffund";
        public final String RatingCompat = "mfdiscovery_minifundfact_ipo";
        public final String read = "mfdiscovery_minifundfact";
        public final String write = "mfdiscovery_mainpage";
    }

    private forEachSrcAtop$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ forEachSrcAtop$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new forEachSrcAtop(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new forEachSrcAtop[i];
    }
}
