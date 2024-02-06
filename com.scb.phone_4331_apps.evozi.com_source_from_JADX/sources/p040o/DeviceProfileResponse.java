package p040o;

import p040o.ByteStreams;
import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.DeviceProfileResponse */
public final class DeviceProfileResponse extends C4199cn {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DeviceProfileResponse(RegularImmutableBiMap regularImmutableBiMap, ByteStreams.ByteArrayDataOutputStream byteArrayDataOutputStream, logEventInternalNoInterceptor logeventinternalnointerceptor, Iterables.C352212 r5) {
        super(regularImmutableBiMap, byteArrayDataOutputStream, logeventinternalnointerceptor, r5);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) byteArrayDataOutputStream, "productTermConditionDisplayMapper");
        onGetStartedClick.write((Object) logeventinternalnointerceptor, "productTermConditionCase");
        onGetStartedClick.write((Object) r5, "ekycEntryPointCase");
    }

    public final void read(getFiles getfiles) {
        onGetStartedClick.write((Object) getfiles, "display");
        writeUInt64NoTag.IconCompatParcelizer deviceProfileResponse$MediaBrowserCompat$ItemReceiver = new DeviceProfileResponse$MediaBrowserCompat$ItemReceiver(getfiles);
        if (this.RatingCompat != null) {
            deviceProfileResponse$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
