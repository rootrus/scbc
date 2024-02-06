package p040o;

import p040o.IdParameters;
import p040o.access$2300;
import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeProcessFrame */
public final /* synthetic */ class nativeProcessFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ nativeConfigureFromFile.write write;

    public /* synthetic */ nativeProcessFrame(nativeConfigureFromFile.write write2, Throwable th) {
        this.write = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile.write write2 = this.write;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        IdParameters.C6915a aVar = (IdParameters.C6915a) obj;
        aVar.aj_();
        aVar.write(nativeConfigureFromFile.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
