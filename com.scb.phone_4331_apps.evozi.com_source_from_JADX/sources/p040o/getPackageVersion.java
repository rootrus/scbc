package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPackageVersion */
public final /* synthetic */ class getPackageVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ double read;

    public /* synthetic */ getPackageVersion(double d) {
        this.read = d;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.C6976c) obj).write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.read));
    }
}
