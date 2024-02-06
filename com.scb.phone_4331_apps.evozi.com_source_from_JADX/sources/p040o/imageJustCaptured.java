package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.imageJustCaptured */
public final /* synthetic */ class imageJustCaptured implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4011x6406d919 IconCompatParcelizer;
    private final /* synthetic */ setOnStreetViewPanoramaChangeListener write;

    public /* synthetic */ imageJustCaptured(C4011x6406d919 addlicensefoundeventlistener_mediabrowsercompat_customactionresultreceiver, setOnStreetViewPanoramaChangeListener setonstreetviewpanoramachangelistener) {
        this.IconCompatParcelizer = addlicensefoundeventlistener_mediabrowsercompat_customactionresultreceiver;
        this.write = setonstreetviewpanoramachangelistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4011x6406d919 addlicensefoundeventlistener_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        ((PassportParameters_Factory) obj).read(addlicensefoundeventlistener_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.write(this.write));
    }
}
