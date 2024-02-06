package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.isAuthTokenExpired */
public final /* synthetic */ class isAuthTokenExpired implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_InstallationResponse write;

    public /* synthetic */ isAuthTokenExpired(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        this.write = autoValue_InstallationResponse;
    }

    public final void IconCompatParcelizer(Object obj) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.write;
        proxyGetICheckDeserializerRtti.MediaDescriptionCompat mediaDescriptionCompat = (proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj;
        String str = autoValue_InstallationResponse.read;
        if (str == null) {
            str = "";
        }
        mediaDescriptionCompat.read(str, autoValue_InstallationResponse.MediaBrowserCompat$SearchResultReceiver);
    }
}
