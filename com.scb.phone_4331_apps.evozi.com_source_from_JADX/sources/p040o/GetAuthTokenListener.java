package p040o;

import java.util.List;
import p040o.SimpleTimeLimiter;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.GetAuthTokenListener */
public final /* synthetic */ class GetAuthTokenListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ SimpleTimeLimiter.C37891.C37901 write;

    public /* synthetic */ GetAuthTokenListener(SimpleTimeLimiter.C37891.C37901 r1, List list) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.RatingCompat) obj).write(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
