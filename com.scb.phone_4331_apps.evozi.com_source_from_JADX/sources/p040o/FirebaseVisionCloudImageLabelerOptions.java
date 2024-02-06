package p040o;

import p040o.KotlinDetector;
import p040o.Maps;
import p040o.writeUInt64NoTag;
import p040o.zzfy;

/* renamed from: o.FirebaseVisionCloudImageLabelerOptions */
public final /* synthetic */ class FirebaseVisionCloudImageLabelerOptions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ double IconCompatParcelizer;
    private final /* synthetic */ double MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ double write;

    public /* synthetic */ FirebaseVisionCloudImageLabelerOptions(String str, double d, double d2, double d3) {
        this.read = str;
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$ItemReceiver = d2;
        this.write = d3;
    }

    public final void IconCompatParcelizer(Object obj) {
        KotlinDetector.write(this.read, this.MediaBrowserCompat$ItemReceiver, (getAddress5) obj);
    }

    /* renamed from: o.FirebaseVisionCloudImageLabelerOptions$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ KotlinDetector.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
        private final /* synthetic */ constrainedSet read;

        public /* synthetic */ Builder(KotlinDetector.IconCompatParcelizer iconCompatParcelizer, constrainedSet constrainedset) {
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
            this.read = constrainedset;
        }

        public final void IconCompatParcelizer(Object obj) {
            KotlinDetector.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
            constrainedSet constrainedset = this.read;
            getAddress5 getaddress5 = (getAddress5) obj;
            Maps.FilteredEntryMap.EntrySet.C36451.C36461 IconCompatParcelizer = KotlinDetector.this.MediaSessionCompat$ResultReceiverWrapper;
            String str = constrainedset.MediaBrowserCompat$ItemReceiver;
            zzfy.zza MediaMetadataCompat = getaddress5.MediaMetadataCompat();
            chain RatingCompat = getaddress5.RatingCompat();
            String MediaBrowserCompat$SearchResultReceiver = getaddress5.MediaBrowserCompat$SearchResultReceiver();
            String IconCompatParcelizer2 = KotlinDetector.IconCompatParcelizer(constrainedset, getaddress5);
            String str2 = constrainedset.IconCompatParcelizer;
            AnalyticsConnectorImpl analyticsConnectorImpl = new AnalyticsConnectorImpl();
            analyticsConnectorImpl.write = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.up_to_interest_rate, new Object[]{Integer.valueOf((int) MediaMetadataCompat.MediaBrowserCompat$ItemReceiver)}).concat("%");
            analyticsConnectorImpl.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
            analyticsConnectorImpl.read = String.valueOf((int) MediaMetadataCompat.IconCompatParcelizer).concat("%");
            analyticsConnectorImpl.ParcelableVolumeInfo = String.valueOf((int) MediaMetadataCompat.write).concat("%");
            analyticsConnectorImpl.MediaSessionCompat$ResultReceiverWrapper = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(MediaMetadataCompat.read);
            analyticsConnectorImpl.MediaDescriptionCompat = str;
            analyticsConnectorImpl.MediaBrowserCompat$CustomActionResultReceiver = RatingCompat.AppCompatViewInflater;
            analyticsConnectorImpl.MediaBrowserCompat$ItemReceiver = RatingCompat.MediaSessionCompat$Token;
            analyticsConnectorImpl.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer2;
            analyticsConnectorImpl.MediaBrowserCompat$MediaItem = MediaBrowserCompat$SearchResultReceiver;
            analyticsConnectorImpl.RatingCompat = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$SearchResultReceiver, false);
            analyticsConnectorImpl.MediaSessionCompat$QueueItem = str2;
            analyticsConnectorImpl.MediaMetadataCompat = RatingCompat.setShortcut;
            getaddress5.MediaBrowserCompat$CustomActionResultReceiver(analyticsConnectorImpl);
        }
    }
}
