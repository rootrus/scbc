package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeFrame */
public final /* synthetic */ class writeFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSettingsFile IconCompatParcelizer;

    public /* synthetic */ writeFrame(getSettingsFile getsettingsfile) {
        this.IconCompatParcelizer = getsettingsfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSettingsFile getsettingsfile = this.IconCompatParcelizer;
        ((CheckCaptureModule.C6375a.write) obj).read(getsettingsfile.read.MediaBrowserCompat$ItemReceiver(getsettingsfile.write.MediaBrowserCompat$ItemReceiver.AppCompatActivity()));
    }
}
