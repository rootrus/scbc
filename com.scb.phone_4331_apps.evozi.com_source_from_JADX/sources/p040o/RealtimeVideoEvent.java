package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.writeUInt64NoTag;

/* renamed from: o.RealtimeVideoEvent */
public final /* synthetic */ class RealtimeVideoEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ RealtimeVideoEvent(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7535ub) obj).write(((RetrofitException) this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer.write.read);
    }
}
