package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRefreshToken */
public final /* synthetic */ class getRefreshToken implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_InstallationResponse write;

    public /* synthetic */ getRefreshToken(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        this.write = autoValue_InstallationResponse;
    }

    public final void IconCompatParcelizer(Object obj) {
        proxyGetICheckDeserializerRtti.MediaDescriptionCompat mediaDescriptionCompat = (proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj;
        String str = this.write.IconCompatParcelizer;
        if (str == null) {
            str = "";
        }
        mediaDescriptionCompat.IconCompatParcelizer(str);
    }
}
