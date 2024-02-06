package p040o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p040o.writeUInt64NoTag;

/* renamed from: o.TreeTypeAdapter$SingleTypeFactory$MediaBrowserCompat$ItemReceiver */
final class C3877x5ba521b7<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetExtractionParametersFactory> {
    private /* synthetic */ JsonObject MediaBrowserCompat$ItemReceiver;

    C3877x5ba521b7(JsonObject jsonObject) {
        this.MediaBrowserCompat$ItemReceiver = jsonObject;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        JsonElement jsonElement = this.MediaBrowserCompat$ItemReceiver.get("refid");
        onGetStartedClick.IconCompatParcelizer((Object) jsonElement, "objData.get(SLIP_RENDER_FIELD_NAME)");
        String asString = jsonElement.getAsString();
        onGetStartedClick.IconCompatParcelizer((Object) asString, "objData.get(SLIP_RENDER_FIELD_NAME).asString");
        ((IdCaptureModule_GetExtractionParametersFactory) obj).mo15014p_(asString);
    }
}
