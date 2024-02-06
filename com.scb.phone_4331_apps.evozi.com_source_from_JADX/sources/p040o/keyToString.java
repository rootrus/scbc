package p040o;

import p040o.Analytics;
import p040o.IdCaptureModule;

/* renamed from: o.keyToString */
public class keyToString extends writeUInt64NoTag<IdCaptureModule.OnDeviceExceptionResponseDeserializer.C69031> {
    public final Analytics.Event MediaBrowserCompat$ItemReceiver;
    public final removeAt write;

    @HmlPinActivity
    keyToString(RegularImmutableBiMap regularImmutableBiMap, removeAt removeat, Analytics.Event event) {
        super(regularImmutableBiMap);
        this.write = removeat;
        this.MediaBrowserCompat$ItemReceiver = event;
    }
}
