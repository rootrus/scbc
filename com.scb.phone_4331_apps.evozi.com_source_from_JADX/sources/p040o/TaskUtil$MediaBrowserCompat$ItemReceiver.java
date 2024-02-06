package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* renamed from: o.TaskUtil$MediaBrowserCompat$ItemReceiver */
public final class TaskUtil$MediaBrowserCompat$ItemReceiver implements JsonDeserializer {
    private Gson IconCompatParcelizer;

    public TaskUtil$MediaBrowserCompat$ItemReceiver(Gson gson) {
        this.IconCompatParcelizer = gson;
    }

    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return this.IconCompatParcelizer.fromJson(jsonElement, type);
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("creditCardCategories") && !(asJsonObject.get("creditCardCategories") instanceof JsonNull)) {
            JsonArray asJsonArray = asJsonObject.getAsJsonArray("creditCardCategories");
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            for (int i = 0; i < asJsonArray.size(); i++) {
                jsonObject.addProperty("creditCardCategory", asJsonArray.get(i).getAsString());
            }
            asJsonObject.add("creditCardCategoryList", jsonArray);
            asJsonObject.remove("creditCardCategories");
        }
        return this.IconCompatParcelizer.fromJson((JsonElement) asJsonObject, type);
    }
}
