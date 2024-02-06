package p040o;

import java.util.List;
import p040o.CrashlyticsBackgroundWorker;

/* renamed from: o.getOverridenSpiEndpoint */
public final class getOverridenSpiEndpoint extends remainingCapacity {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<CrashlyticsBackgroundWorker.C32142> MediaBrowserCompat$ItemReceiver;
    public AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public String RatingCompat;
    public String read;

    /* renamed from: o.getOverridenSpiEndpoint$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public List<CrashlyticsBackgroundWorker.C32142> MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public int MediaMetadataCompat;
        public String RatingCompat;
        public String read;
        public AutoValue_CrashlyticsReport_CustomAttribute write;
    }

    public /* synthetic */ getOverridenSpiEndpoint(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private getOverridenSpiEndpoint(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        this.MediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat;
        this.IconCompatParcelizer = iconCompatParcelizer.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.IconCompatParcelizer;
        this.RatingCompat = iconCompatParcelizer.RatingCompat;
        this.read = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.write;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
