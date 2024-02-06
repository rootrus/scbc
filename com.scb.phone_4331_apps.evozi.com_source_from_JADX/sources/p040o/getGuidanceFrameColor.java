package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.getImageWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGuidanceFrameColor */
public final /* synthetic */ class getGuidanceFrameColor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ OffsetDateTime IconCompatParcelizer;
    private final /* synthetic */ OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ OffsetDateTime read;

    public /* synthetic */ getGuidanceFrameColor(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3) {
        this.IconCompatParcelizer = offsetDateTime;
        this.read = offsetDateTime2;
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getImageWidth.IconCompatParcelizer.read) obj).read(this.IconCompatParcelizer, this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
