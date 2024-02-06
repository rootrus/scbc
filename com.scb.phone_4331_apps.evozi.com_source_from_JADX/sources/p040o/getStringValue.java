package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;

/* renamed from: o.getStringValue */
public class getStringValue extends writeUInt64NoTag<IdCaptureModule_GetIIdDeserializerOnDeviceFactory.IconCompatParcelizer> {
    public final equalTo MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final LineReader read;

    @HmlPinActivity
    public getStringValue(RegularImmutableBiMap regularImmutableBiMap, equalTo equalto, LineReader lineReader) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = equalto;
        this.read = lineReader;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getStringValue getstringvalue) {
        if (getstringvalue.RatingCompat != null) {
            getstringvalue.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getStringValue getstringvalue) {
        if (getstringvalue.RatingCompat != null) {
            getstringvalue.RatingCompat.aj_();
        }
    }
}
