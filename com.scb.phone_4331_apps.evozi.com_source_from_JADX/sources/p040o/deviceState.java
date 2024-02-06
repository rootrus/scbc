package p040o;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.picasso.Picasso;

/* renamed from: o.deviceState */
public final class deviceState implements FragmentBuilder_BindEkycFragment {
    private final zaz MediaBrowserCompat$ItemReceiver;
    private final String read;

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    public deviceState(zaz zaz, String str) {
        onGetStartedClick.write((Object) zaz, "picassoFactory");
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        this.MediaBrowserCompat$ItemReceiver = zaz;
        this.read = str;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
        Uri parse;
        zaz zaz = this.MediaBrowserCompat$ItemReceiver;
        String str = this.read;
        Picasso picasso = zaz.read;
        if (str != null && (parse = Uri.parse(str)) != null) {
            picasso.read.MediaBrowserCompat$ItemReceiver(parse.toString());
        }
    }
}
