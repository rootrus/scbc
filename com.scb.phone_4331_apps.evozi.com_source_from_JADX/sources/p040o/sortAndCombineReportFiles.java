package p040o;

import p040o.LogFileManager;
import p040o.writeUInt64NoTag;

/* renamed from: o.sortAndCombineReportFiles */
public final /* synthetic */ class sortAndCombineReportFiles implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LogFileManager.DirectoryProvider write;

    public /* synthetic */ sortAndCombineReportFiles(LogFileManager.DirectoryProvider directoryProvider) {
        this.write = directoryProvider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBelowMinRearImageSize) obj).ParcelableVolumeInfo(this.write);
    }
}
