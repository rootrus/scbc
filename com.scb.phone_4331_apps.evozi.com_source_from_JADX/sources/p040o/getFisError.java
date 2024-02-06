package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFisError */
public final /* synthetic */ class getFisError implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_InstallationResponse IconCompatParcelizer;

    public /* synthetic */ getFisError(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        this.IconCompatParcelizer = autoValue_InstallationResponse;
    }

    public final void IconCompatParcelizer(Object obj) {
        proxyGetICheckDeserializerRtti.MediaDescriptionCompat mediaDescriptionCompat = (proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj;
        String str = this.IconCompatParcelizer.read;
        if (str == null) {
            str = "";
        }
        mediaDescriptionCompat.read(str);
    }
}
