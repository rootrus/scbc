package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.GeofencingRequest;

/* renamed from: o.closeLogFile$MediaBrowserCompat$CustomActionResultReceiver */
public final class closeLogFile$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ isSuccess write;

    private closeLogFile$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ closeLogFile$MediaBrowserCompat$CustomActionResultReceiver(isSuccess issuccess) {
        this.write = issuccess;
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        isSuccess issuccess = this.write;
        MergePaths mergePaths = (MergePaths) obj;
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.MediaBrowserCompat$ItemReceiver = mergePaths.MediaBrowserCompat$CustomActionResultReceiver;
        if (mergePaths.MediaBrowserCompat$ItemReceiver != null) {
            str = mergePaths.MediaBrowserCompat$ItemReceiver;
        } else {
            str = "";
        }
        builder.read = str;
        builder.MediaSessionCompat$ResultReceiverWrapper = mergePaths.MediaSessionCompat$ResultReceiverWrapper;
        builder.MediaSessionCompat$Token = mergePaths.MediaMetadataCompat;
        builder.MediaBrowserCompat$CustomActionResultReceiver = mergePaths.read;
        builder.MediaMetadataCompat = mergePaths.MediaBrowserCompat$MediaItem;
        String str6 = null;
        if (mergePaths.RatingCompat != null) {
            str2 = mergePaths.RatingCompat.write();
        } else {
            str2 = null;
        }
        builder.MediaBrowserCompat$MediaItem = str2;
        if (mergePaths.RatingCompat != null) {
            str3 = mergePaths.RatingCompat.IconCompatParcelizer();
        } else {
            str3 = null;
        }
        builder.RatingCompat = str3;
        if (mergePaths.MediaDescriptionCompat != null) {
            str4 = mergePaths.MediaDescriptionCompat.write();
        } else {
            str4 = null;
        }
        builder.f2715x50fd9e4a = str4;
        if (mergePaths.MediaDescriptionCompat != null) {
            str5 = mergePaths.MediaDescriptionCompat.IconCompatParcelizer();
        } else {
            str5 = null;
        }
        builder.MediaDescriptionCompat = str5;
        builder.MediaSessionCompat$QueueItem = FragmentBuilder_BindSummaryFragment.write(mergePaths.MediaBrowserCompat$SearchResultReceiver, (OffsetDateTime) null);
        builder.ParcelableVolumeInfo = mergePaths.MediaSessionCompat$Token.IconCompatParcelizer();
        builder.AlertController$RecycleListView = mergePaths.MediaSessionCompat$QueueItem.IconCompatParcelizer();
        builder.Keep = mergePaths.MediaSessionCompat$QueueItem.write();
        if (!issuccess.MediaBrowserCompat$ItemReceiver) {
            str6 = mergePaths.IconCompatParcelizer;
        }
        builder.IconCompatParcelizer = str6;
        builder.MediaBrowserCompat$SearchResultReceiver = issuccess.MediaBrowserCompat$ItemReceiver;
        builder.write = mergePaths.write;
        return builder;
    }
}
