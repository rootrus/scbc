package p040o;

import org.json.JSONObject;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCapturedMsg */
public final /* synthetic */ class getCapturedMsg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ HmlVerifyEmailSuccessfulActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCapturedMsg(HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlVerifyEmailSuccessfulActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1163x1ce8468d) obj).MediaBrowserCompat$ItemReceiver((JSONObject) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, (JSONObject) this.MediaBrowserCompat$ItemReceiver.write);
    }
}
