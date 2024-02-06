package p040o;

import p040o.NetworkService;
import p040o.writeUInt64NoTag;

/* renamed from: o.NetworkService$1$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
final class C3695x510c4a2e<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureActivity_MembersInjector> {
    private /* synthetic */ NetworkService.C36941.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute read;

    C3695x510c4a2e(NetworkService.C36941.IconCompatParcelizer iconCompatParcelizer, AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.read = autoValue_CrashlyticsReport_CustomAttribute;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureActivity_MembersInjector) obj).IconCompatParcelizer(this.read, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }
}
