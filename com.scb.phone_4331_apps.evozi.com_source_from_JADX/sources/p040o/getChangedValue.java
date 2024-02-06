package p040o;

import p040o.TaskRunner;
import p040o.writeUInt64NoTag;

/* renamed from: o.getChangedValue */
public final /* synthetic */ class getChangedValue implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getChangedValue(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        TaskRunner.C3843b.C38441.read(this.MediaBrowserCompat$ItemReceiver, (IdExtractionParameters) obj);
    }
}
