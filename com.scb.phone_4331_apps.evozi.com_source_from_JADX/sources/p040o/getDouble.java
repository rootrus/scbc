package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.getDouble */
public final class getDouble implements Interceptor {
    private static final Gson MediaBrowserCompat$CustomActionResultReceiver = new Gson();
    private static final MediaType read = MediaType.parse("application/json; charset=utf-8");

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        JsonObject jsonObject;
        String str = "";
        Response proceed = chain.proceed(chain.request());
        ResponseBody body = proceed.body();
        JsonObject jsonObject2 = (JsonObject) new Gson().fromJson(body.string(), JsonObject.class);
        JsonObject asJsonObject = jsonObject2.getAsJsonObject("status");
        try {
            jsonObject = jsonObject2.getAsJsonObject("data");
            if (jsonObject.has("demo")) {
                jsonObject.addProperty("rawData", jsonObject.getAsJsonObject("demo").toString());
            } else {
                jsonObject.addProperty("rawData", jsonObject.toString());
            }
        } catch (Exception unused) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("rawData", str);
        }
        jsonObject.addProperty("apiAuth", proceed.headers().get("Api-Auth"));
        jsonObject.addProperty("code", (Number) Integer.valueOf(asJsonObject.get("code") == null ? 0 : asJsonObject.get("code").getAsInt()));
        if (jsonObject.get("header") == null || jsonObject.get("header").isJsonNull()) {
            jsonObject.addProperty("header", asJsonObject.get("header") instanceof JsonNull ? str : asJsonObject.get("header").getAsString());
            if (!(asJsonObject.get("description") instanceof JsonNull)) {
                str = asJsonObject.get("description").getAsString();
            }
            jsonObject.addProperty("description", str);
        }
        String json = MediaBrowserCompat$CustomActionResultReceiver.toJson((JsonElement) jsonObject);
        body.close();
        return proceed.newBuilder().body(ResponseBody.create(read, json)).build();
    }
}
