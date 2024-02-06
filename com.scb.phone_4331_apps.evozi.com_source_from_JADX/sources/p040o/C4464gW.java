package p040o;

import java.util.List;
import p040o.C7513tX;
import p040o.withKeyValueSeparator;
import p040o.writeUInt64NoTag;

/* renamed from: o.gW */
public final /* synthetic */ class C4464gW implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4746he read;

    public /* synthetic */ C4464gW(C4746he heVar, List list, Throwable th) {
        this.read = heVar;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.read;
        List list = this.IconCompatParcelizer;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver = (tX$MediaBrowserCompat$CustomActionResultReceiver) obj;
        tx_mediabrowsercompat_customactionresultreceiver.read((List<C7513tX.IconCompatParcelizer>) list);
        isSimulator issimulator = heVar.MediaBrowserCompat$ItemReceiver;
        String str = issimulator.RatingCompat;
        withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer = new withKeyValueSeparator.IconCompatParcelizer();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str;
        iconCompatParcelizer.IconCompatParcelizer = th;
        tx_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(issimulator, iconCompatParcelizer);
    }
}
