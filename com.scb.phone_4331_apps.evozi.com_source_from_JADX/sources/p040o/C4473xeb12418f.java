package p040o;

import p040o.generatePropertyInfo;
import p040o.writeUInt64NoTag;

/* renamed from: o.generatePropertyInfo$read$MediaBrowserCompat$CustomActionResultReceiver */
final class C4473xeb12418f implements Runnable {
    private /* synthetic */ generatePropertyInfo.read read;

    C4473xeb12418f(generatePropertyInfo.read read2) {
        this.read = read2;
    }

    public final void run() {
        generatePropertyInfo generatepropertyinfo = this.read.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C44745.IconCompatParcelizer;
        if (generatepropertyinfo.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(generatepropertyinfo.RatingCompat);
        }
    }
}
