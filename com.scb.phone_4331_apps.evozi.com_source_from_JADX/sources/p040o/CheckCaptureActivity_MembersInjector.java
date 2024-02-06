package p040o;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: o.CheckCaptureActivity_MembersInjector */
public final /* synthetic */ class CheckCaptureActivity_MembersInjector implements Callable {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;
    private final /* synthetic */ Map write;

    public /* synthetic */ CheckCaptureActivity_MembersInjector(String str, int i, int i2, Map map) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.write = map;
    }

    public final Object call() {
        return getICheckDeserializerRtti.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.read, this.write);
    }
}
