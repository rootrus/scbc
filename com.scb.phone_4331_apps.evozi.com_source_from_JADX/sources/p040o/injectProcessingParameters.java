package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.injectProcessingParameters */
public final /* synthetic */ class injectProcessingParameters implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ inject_jsonExactionHelper write;

    public /* synthetic */ injectProcessingParameters(inject_jsonExactionHelper inject_jsonexactionhelper) {
        this.write = inject_jsonexactionhelper;
    }

    public final void IconCompatParcelizer(Object obj) {
        inject_jsonExactionHelper inject_jsonexactionhelper = this.write;
        reportFromJson reportfromjson = new reportFromJson();
        reportfromjson.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.IconCompatParcelizer(false, true, inject_jsonexactionhelper.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        ((getTopLeftCornerWidth.setContentHeight) obj).mo40040a_(reportfromjson);
    }
}
