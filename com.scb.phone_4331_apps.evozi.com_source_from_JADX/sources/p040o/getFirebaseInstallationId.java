package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFirebaseInstallationId */
public final /* synthetic */ class getFirebaseInstallationId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_InstallationResponse MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ UncaughtExceptionHandlers write;

    public /* synthetic */ getFirebaseInstallationId(AutoValue_InstallationResponse autoValue_InstallationResponse, UncaughtExceptionHandlers uncaughtExceptionHandlers) {
        this.MediaBrowserCompat$ItemReceiver = autoValue_InstallationResponse;
        this.write = uncaughtExceptionHandlers;
    }

    public final void IconCompatParcelizer(Object obj) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.MediaBrowserCompat$ItemReceiver;
        UncaughtExceptionHandlers uncaughtExceptionHandlers = this.write;
        proxyGetICheckDeserializerRtti.MediaDescriptionCompat mediaDescriptionCompat = (proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj;
        String str = autoValue_InstallationResponse.read;
        if (str == null) {
            str = "";
        }
        mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(uncaughtExceptionHandlers, str);
    }
}
