package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dg */
public final /* synthetic */ class C9889dg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4336eE read;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C9889dg(C4336eE eEVar, Throwable th) {
        this.read = eEVar;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4336eE eEVar = this.read;
        Throwable th = this.write;
        printStackTrace printstacktrace = (printStackTrace) obj;
        printstacktrace.aj_();
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (!(retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null)) {
                String str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                if ("1036".equals(str)) {
                    printstacktrace.RatingCompat();
                    return;
                } else if ("3036".equals(str)) {
                    printstacktrace.MediaBrowserCompat$MediaItem();
                    return;
                }
            }
            printstacktrace.MediaBrowserCompat$ItemReceiver(eEVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return;
        }
        printstacktrace.MediaBrowserCompat$ItemReceiver((access$2200) null);
    }
}
