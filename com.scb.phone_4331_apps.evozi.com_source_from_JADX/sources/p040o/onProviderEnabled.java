package p040o;

import android.text.TextUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.onProviderEnabled */
public final /* synthetic */ class onProviderEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7475st MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ onProviderEnabled(C7475st stVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = stVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        boolean z;
        C7475st stVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver = (getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver) obj;
        if (position.OFFUS_BILLER.equals(stVar.write.MediaSessionCompat$ResultReceiverWrapper) || position.ONUS_BILLER.equals(stVar.write.MediaSessionCompat$ResultReceiverWrapper)) {
            if ("01".equalsIgnoreCase(stVar.write.RatingCompat) || "02".equalsIgnoreCase(stVar.write.RatingCompat)) {
                z = true;
                gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver.read(z);
            } else if ("05".equalsIgnoreCase(stVar.write.RatingCompat) && (TextUtils.isEmpty(stVar.write.MediaBrowserCompat$MediaItem) || getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(stVar.write.MediaBrowserCompat$MediaItem).doubleValue() == 0.0d)) {
                z = getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(stVar.write.MediaBrowserCompat$MediaItem);
                gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver.read(z);
            }
        } else if ("01".equalsIgnoreCase(stVar.write.RatingCompat) || "02".equalsIgnoreCase(stVar.write.RatingCompat)) {
            z = getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(stVar.write.MediaBrowserCompat$MediaItem);
            gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver.read(z);
        }
        z = false;
        gettopleftcornerwidth_mediabrowsercompat_searchresultreceiver.read(z);
    }
}
