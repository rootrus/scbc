package p040o;

import java.util.List;
import p040o.ByteStreams;
import p040o.C4249dG;
import p040o.writeUInt64NoTag;

/* renamed from: o.cx */
public final /* synthetic */ class C4222cx implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ C4249dG.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4222cx(C4249dG.read read, List list) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4249dG.read read = this.MediaBrowserCompat$ItemReceiver;
        List list = this.IconCompatParcelizer;
        C6930xffe1298e ktaJsonCheck$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = (C6930xffe1298e) obj;
        ByteStreams.C31364 unused = C4249dG.this.read;
        ktaJsonCheck$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.write((List<String>) ByteStreams.C31364.MediaBrowserCompat$ItemReceiver(list, new C4233dB(C4249dG.this.read)));
        ktaJsonCheck$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaBrowserCompat$ItemReceiver();
    }
}
