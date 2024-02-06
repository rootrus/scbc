package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.MergePaths;

/* renamed from: o.requestServerAuthCode */
public final class requestServerAuthCode extends FragmentBuilder_BindSummaryFragment {
    public final getInitialTrigger MediaBrowserCompat$ItemReceiver(MergePaths.MergePathsMode mergePathsMode) {
        OffsetDateTime offsetDateTime;
        String str;
        getInitialTrigger MediaBrowserCompat$ItemReceiver = getInitialTrigger.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = mergePathsMode.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = mergePathsMode.IconCompatParcelizer;
        String str2 = null;
        if (mergePathsMode.MediaBrowserCompat$MediaItem != null) {
            offsetDateTime = FragmentBuilder_BindSummaryFragment.write(mergePathsMode.MediaBrowserCompat$MediaItem, (OffsetDateTime) null);
        } else {
            offsetDateTime = null;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = offsetDateTime;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = mergePathsMode.RatingCompat;
        MediaBrowserCompat$ItemReceiver.write = mergePathsMode.read;
        MediaBrowserCompat$ItemReceiver.read = mergePathsMode.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = mergePathsMode.write;
        if (mergePathsMode.MediaBrowserCompat$SearchResultReceiver != null) {
            str = mergePathsMode.MediaBrowserCompat$SearchResultReceiver.write();
        } else {
            str = null;
        }
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = str;
        if (mergePathsMode.MediaBrowserCompat$SearchResultReceiver != null) {
            str2 = mergePathsMode.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
        }
        MediaBrowserCompat$ItemReceiver.RatingCompat = str2;
        return MediaBrowserCompat$ItemReceiver;
    }
}
