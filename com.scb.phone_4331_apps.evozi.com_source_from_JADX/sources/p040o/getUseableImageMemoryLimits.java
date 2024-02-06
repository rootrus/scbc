package p040o;

import java.util.ArrayList;
import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUseableImageMemoryLimits */
public final /* synthetic */ class getUseableImageMemoryLimits implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ didCrashOnPreviousExecution read;

    public /* synthetic */ getUseableImageMemoryLimits(didCrashOnPreviousExecution didcrashonpreviousexecution) {
        this.read = didcrashonpreviousexecution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.read.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction, new ArrayList(this.read.MediaBrowserCompat$CustomActionResultReceiver), getPageID$MediaBrowserCompat$ItemReceiver.TITLE);
    }
}
