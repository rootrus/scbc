package p040o;

import java.util.ArrayList;
import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getProcessedTempFilenames */
public final /* synthetic */ class getProcessedTempFilenames implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ didCrashOnPreviousExecution write;

    public /* synthetic */ getProcessedTempFilenames(didCrashOnPreviousExecution didcrashonpreviousexecution) {
        this.write = didcrashonpreviousexecution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.write.write.IconCompatParcelizer.get(this.write.write.read), new ArrayList(this.write.write.IconCompatParcelizer.values()), getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL);
    }
}
