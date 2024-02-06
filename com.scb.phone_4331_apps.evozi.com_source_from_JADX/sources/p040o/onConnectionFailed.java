package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.onConnectionFailed */
public final class onConnectionFailed extends FragmentBuilder_BindSummaryFragment {
    public final onEnterAmbient MediaBrowserCompat$ItemReceiver(SingleDataEntity<CctBackendFactory> singleDataEntity) {
        CctBackendFactory data = singleDataEntity.getData();
        onEnterAmbient MediaBrowserCompat$ItemReceiver = onEnterAmbient.MediaBrowserCompat$ItemReceiver();
        String str = data.MediaSessionCompat$Token;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        MediaBrowserCompat$ItemReceiver.f2905x50fd9e4a = str;
        String str3 = data.MediaMetadataCompat;
        if (str3 == null) {
            str3 = str2;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = str3;
        String str4 = data.ParcelableVolumeInfo;
        if (str4 == null) {
            str4 = str2;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = str4;
        String str5 = data.f2687x50fd9e4a;
        if (str5 == null) {
            str5 = str2;
        }
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = str5;
        String str6 = data.MediaSessionCompat$ResultReceiverWrapper;
        if (str6 == null) {
            str6 = str2;
        }
        MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = str6;
        String str7 = data.RatingCompat;
        if (str7 == null) {
            str7 = str2;
        }
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = str7;
        String str8 = data.MediaSessionCompat$QueueItem;
        if (str8 == null) {
            str8 = str2;
        }
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = str8;
        String str9 = data.MediaBrowserCompat$ItemReceiver;
        String str10 = "0.0";
        if (str9 == null) {
            str9 = str10;
        }
        MediaBrowserCompat$ItemReceiver.write = Double.valueOf(str9).doubleValue();
        String str11 = data.MediaBrowserCompat$MediaItem;
        if (str11 == null) {
            str11 = str2;
        }
        MediaBrowserCompat$ItemReceiver.RatingCompat = str11;
        String str12 = data.read;
        if (str12 != null) {
            str2 = str12;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindSummaryFragment.write(str2, (OffsetDateTime) null);
        String str13 = data.MediaBrowserCompat$SearchResultReceiver;
        if (str13 == null) {
            str13 = str10;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = Double.valueOf(str13).doubleValue();
        String str14 = data.write;
        if (str14 != null) {
            str10 = str14;
        }
        MediaBrowserCompat$ItemReceiver.read = Double.valueOf(str10).doubleValue();
        return MediaBrowserCompat$ItemReceiver;
    }
}
