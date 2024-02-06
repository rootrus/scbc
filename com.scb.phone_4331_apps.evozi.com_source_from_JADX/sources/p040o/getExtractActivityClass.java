package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getExtractActivityClass */
public final /* synthetic */ class getExtractActivityClass implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getIExtractionServerKta MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ parseEventSignal write;

    public /* synthetic */ getExtractActivityClass(getIExtractionServerKta getiextractionserverkta, parseEventSignal parseeventsignal) {
        this.MediaBrowserCompat$ItemReceiver = getiextractionserverkta;
        this.write = parseeventsignal;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setCheckable) obj).write(this.MediaBrowserCompat$ItemReceiver.write.MediaDescriptionCompat(this.write.MediaSessionCompat$QueueItem));
    }
}
