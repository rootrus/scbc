package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTokenCreationEpochInSecs */
public final /* synthetic */ class getTokenCreationEpochInSecs implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ getTokenCreationEpochInSecs(AutoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver autoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver) {
        this.read = autoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj).write(AutoValue_InstallationResponse.write(this.read.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
