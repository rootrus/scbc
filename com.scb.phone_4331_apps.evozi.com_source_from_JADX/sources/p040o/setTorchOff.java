package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setTorchOff */
public final /* synthetic */ class setTorchOff implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ setBoolValue MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setTorchOff(setBoolValue setboolvalue, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setboolvalue;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setBoolValue setboolvalue = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getLar$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(setboolvalue.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
