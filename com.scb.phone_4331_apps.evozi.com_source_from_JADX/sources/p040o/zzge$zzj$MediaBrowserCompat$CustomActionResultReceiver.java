package p040o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p040o.zzge;

/* renamed from: o.zzge$zzj$MediaBrowserCompat$CustomActionResultReceiver */
final class zzge$zzj$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zzj IconCompatParcelizer;

    zzge$zzj$MediaBrowserCompat$CustomActionResultReceiver(zzge.zzj zzj) {
        this.IconCompatParcelizer = zzj;
    }

    public final /* synthetic */ Object write(Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        onGetStartedClick.write((Object) jsonObject, "it");
        return this.IconCompatParcelizer.read.toJson((JsonElement) jsonObject);
    }
}
