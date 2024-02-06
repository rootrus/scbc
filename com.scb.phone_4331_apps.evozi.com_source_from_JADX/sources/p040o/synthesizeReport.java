package p040o;

import p040o.LogFileManager;
import p040o.writeUInt64NoTag;

/* renamed from: o.synthesizeReport */
public final /* synthetic */ class synthesizeReport implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;
    private final /* synthetic */ LogFileManager.DirectoryProvider write;

    public /* synthetic */ synthesizeReport(LogFileManager.DirectoryProvider directoryProvider, boolean z) {
        this.write = directoryProvider;
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBelowMinRearImageSize) obj).IconCompatParcelizer(this.write, this.read);
    }
}
