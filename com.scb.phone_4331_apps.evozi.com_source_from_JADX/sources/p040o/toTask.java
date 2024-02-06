package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.TouchPointInstructionActivity;

/* renamed from: o.toTask */
public final /* synthetic */ class toTask implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setTax MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ toTask(setTax settax) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settax;
    }

    public final Object write(Object obj) {
        setTax settax = this.MediaBrowserCompat$CustomActionResultReceiver;
        encodedFragment encodedfragment = (encodedFragment) obj;
        TouchPointInstructionActivity.write write = new TouchPointInstructionActivity.write();
        write.MediaBrowserCompat$CustomActionResultReceiver = encodedfragment.read;
        write.MediaBrowserCompat$ItemReceiver = settax.MediaBrowserCompat$ItemReceiver(encodedfragment.MediaBrowserCompat$CustomActionResultReceiver);
        write.read = settax.MediaBrowserCompat$ItemReceiver(encodedfragment.MediaBrowserCompat$ItemReceiver);
        write.IconCompatParcelizer = settax.MediaBrowserCompat$ItemReceiver(encodedfragment.IconCompatParcelizer);
        write.write = encodedfragment.write;
        write.MediaDescriptionCompat = encodedfragment.MediaBrowserCompat$MediaItem;
        write.RatingCompat = encodedfragment.MediaBrowserCompat$SearchResultReceiver;
        write.MediaMetadataCompat = FragmentBuilder_BindSummaryFragment.write(encodedfragment.MediaDescriptionCompat, (OffsetDateTime) null);
        write.MediaBrowserCompat$SearchResultReceiver = encodedfragment.RatingCompat;
        return write;
    }
}
