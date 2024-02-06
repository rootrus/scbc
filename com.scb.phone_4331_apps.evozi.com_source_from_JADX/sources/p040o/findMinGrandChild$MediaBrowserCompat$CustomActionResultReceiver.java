package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.findMinGrandChild$MediaBrowserCompat$CustomActionResultReceiver */
public final class findMinGrandChild$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ clearToken MediaBrowserCompat$ItemReceiver;

    private findMinGrandChild$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ findMinGrandChild$MediaBrowserCompat$CustomActionResultReceiver(clearToken cleartoken) {
        this.MediaBrowserCompat$ItemReceiver = cleartoken;
    }

    public final Object IconCompatParcelizer(Object obj) {
        OffsetDateTime offsetDateTime;
        reverseAnimationSpeed reverseanimationspeed = (reverseAnimationSpeed) obj;
        setColor MediaBrowserCompat$CustomActionResultReceiver = setColor.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.read = reverseanimationspeed.write;
        String str = null;
        if (reverseanimationspeed.MediaBrowserCompat$CustomActionResultReceiver != null) {
            offsetDateTime = FragmentBuilder_BindSummaryFragment.write(reverseanimationspeed.MediaBrowserCompat$CustomActionResultReceiver, (OffsetDateTime) null);
        } else {
            offsetDateTime = null;
        }
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = offsetDateTime;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = reverseanimationspeed.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = reverseanimationspeed.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.write = reverseanimationspeed.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = FragmentBuilder_BindSummaryFragment.write(reverseanimationspeed.MediaBrowserCompat$MediaItem, (OffsetDateTime) null);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = reverseanimationspeed.MediaBrowserCompat$SearchResultReceiver;
        if (reverseanimationspeed.MediaBrowserCompat$ItemReceiver != null) {
            str = reverseanimationspeed.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
