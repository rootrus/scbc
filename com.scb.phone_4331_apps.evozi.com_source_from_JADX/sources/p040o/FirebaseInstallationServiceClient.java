package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallationServiceClient */
public final /* synthetic */ class FirebaseInstallationServiceClient implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getJsonBytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Device.Builder read;

    public /* synthetic */ FirebaseInstallationServiceClient(getJsonBytes getjsonbytes, AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder) {
        this.MediaBrowserCompat$ItemReceiver = getjsonbytes;
        this.read = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        getJsonBytes getjsonbytes = this.MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder = this.read;
        ((C6381x4d1a9e14) obj).MediaBrowserCompat$CustomActionResultReceiver(getjsonbytes.IconCompatParcelizer.write(builder, getjsonbytes.MediaDescriptionCompat.IconCompatParcelizer.setItemInvoker(), getjsonbytes.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.AppCompatActivity(), builder.MediaBrowserCompat$SearchResultReceiver, builder.MediaDescriptionCompat));
    }
}
