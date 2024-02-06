package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.writeUInt64NoTag;

/* renamed from: o.availableFirebaseOptions */
public final /* synthetic */ class availableFirebaseOptions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Device.Builder IconCompatParcelizer;
    private final /* synthetic */ getJsonBytes write;

    public /* synthetic */ availableFirebaseOptions(getJsonBytes getjsonbytes, AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder) {
        this.write = getjsonbytes;
        this.IconCompatParcelizer = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        getJsonBytes getjsonbytes = this.write;
        ((C6381x4d1a9e14) obj).MediaBrowserCompat$CustomActionResultReceiver(getjsonbytes.IconCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, getjsonbytes.MediaDescriptionCompat.IconCompatParcelizer.setItemInvoker(), getjsonbytes.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.AppCompatActivity()));
    }
}
