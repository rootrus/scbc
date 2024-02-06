package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: o.resetOverride$MediaBrowserCompat$ItemReceiver */
public class resetOverride$MediaBrowserCompat$ItemReceiver<T> implements JsonDeserializer {
    private Gson IconCompatParcelizer;

    public resetOverride$MediaBrowserCompat$ItemReceiver(Gson gson) {
        this.IconCompatParcelizer = gson;
    }

    public final T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return this.IconCompatParcelizer.fromJson(jsonElement, type);
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("data") && !(asJsonObject.get("data") instanceof JsonNull)) {
            JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("data");
            asJsonObject.remove("data");
            for (Map.Entry next : asJsonObject2.entrySet()) {
                asJsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
            }
        }
        return this.IconCompatParcelizer.fromJson((JsonElement) asJsonObject, type);
    }
}
