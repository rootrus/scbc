package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.isOdeSupported */
public final /* synthetic */ class isOdeSupported implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onStreetViewPanoramaLongClick IconCompatParcelizer;
    private final /* synthetic */ C9980xe36c8520 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isOdeSupported(C9980xe36c8520 getprocessingparameters_mediabrowsercompat_customactionresultreceiver, onStreetViewPanoramaLongClick onstreetviewpanoramalongclick) {
        this.MediaBrowserCompat$ItemReceiver = getprocessingparameters_mediabrowsercompat_customactionresultreceiver;
        this.IconCompatParcelizer = onstreetviewpanoramalongclick;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i;
        String str;
        C9980xe36c8520 getprocessingparameters_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        onStreetViewPanoramaLongClick onstreetviewpanoramalongclick = this.IconCompatParcelizer;
        getTopLeftCornerWidth.setPopupCallback setpopupcallback = (getTopLeftCornerWidth.setPopupCallback) obj;
        Callables write = getprocessingparameters_mediabrowsercompat_customactionresultreceiver.read.write;
        setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver = getprocessingparameters_mediabrowsercompat_customactionresultreceiver.read.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver.ListMenuItemView, true));
        if (MediaBrowserCompat$CustomActionResultReceiver.setShowingForActionMode == null) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.review_success_top_up;
        } else {
            i = Iterables$3$MediaBrowserCompat$MediaItem.topup_successful_001;
        }
        String string = write.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        if ("PURCHASE_TOPUP_FUNCTION".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat())) {
            string = write.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.successful_purchase_payment);
        }
        if ("PREPAID".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction)) {
            MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = getICheckDeserializerRtti.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView, (String) null);
        }
        getUuidUtf8Bytes getuuidutf8bytes = new getUuidUtf8Bytes();
        if (onstreetviewpanoramalongclick.f5555x50fd9e4a == null) {
            str = "";
        } else {
            str = write.IconCompatParcelizer("dd MMM yyyy - HH:mm", onstreetviewpanoramalongclick.f5555x50fd9e4a);
        }
        getuuidutf8bytes.MediaDescriptionCompat = str;
        getuuidutf8bytes.ParcelableVolumeInfo = onstreetviewpanoramalongclick.MediaBrowserCompat$SearchResultReceiver;
        getuuidutf8bytes.MediaSessionCompat$Token = String.format(write.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id), new Object[]{onstreetviewpanoramalongclick.MediaBrowserCompat$SearchResultReceiver});
        getuuidutf8bytes.AlertController$RecycleListView = string;
        getuuidutf8bytes.MediaSessionCompat$QueueItem = MediaBrowserCompat$CustomActionResultReceiver.setActionBarHideOffset;
        getuuidutf8bytes.PlaybackStateCompat = MediaBrowserCompat$CustomActionResultReceiver;
        getuuidutf8bytes.RatingCompat = new AutoValue_CrashlyticsReport_Session_Application(Callables.write(onstreetviewpanoramalongclick.write));
        setpopupcallback.IconCompatParcelizer(getuuidutf8bytes);
    }
}
