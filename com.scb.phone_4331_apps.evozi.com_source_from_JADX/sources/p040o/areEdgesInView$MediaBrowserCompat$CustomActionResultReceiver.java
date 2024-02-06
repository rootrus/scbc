package p040o;

import android.net.Uri;
import p040o.IdExtractActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.areEdgesInView$MediaBrowserCompat$CustomActionResultReceiver */
final class areEdgesInView$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractActivity.IconCompatParcelizer> {
    private /* synthetic */ Uri.Builder IconCompatParcelizer;

    areEdgesInView$MediaBrowserCompat$CustomActionResultReceiver(Uri.Builder builder) {
        this.IconCompatParcelizer = builder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Uri build = this.IconCompatParcelizer.build();
        onGetStartedClick.IconCompatParcelizer((Object) build, "justForYouUriBuilder.build()");
        ((IdExtractActivity.IconCompatParcelizer) obj).IconCompatParcelizer(build);
    }
}
