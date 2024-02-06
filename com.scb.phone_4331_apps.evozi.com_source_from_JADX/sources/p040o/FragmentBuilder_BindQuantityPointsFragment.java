package p040o;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindQuantityPointsFragment */
public final class FragmentBuilder_BindQuantityPointsFragment implements JsonDeserializer<FragmentBuilder_BindQuickPromptPayFragment> {
    public final /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return IconCompatParcelizer(jsonElement);
    }

    private static FragmentBuilder_BindQuickPromptPayFragment IconCompatParcelizer(JsonElement jsonElement) {
        List list;
        if (jsonElement == null) {
            return null;
        }
        try {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = asJsonObject.get("statusCode");
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement2, "jsonObject.get(\"statusCode\")");
            String asString = jsonElement2.getAsString();
            JsonElement jsonElement3 = asJsonObject.get("interactions");
            if (jsonElement3 != null) {
                if (!jsonElement3.isJsonNull()) {
                    if (jsonElement3.isJsonArray()) {
                        JsonArray<JsonElement> asJsonArray = jsonElement3.getAsJsonArray();
                        onGetStartedClick.IconCompatParcelizer((Object) asJsonArray, "interactionsElement.asJsonArray");
                        Collection arrayList = new ArrayList();
                        for (JsonElement jsonElement4 : asJsonArray) {
                            onGetStartedClick.IconCompatParcelizer((Object) jsonElement4, "it");
                            String asString2 = jsonElement4.getAsString();
                            if (asString2 != null) {
                                arrayList.add(asString2);
                            }
                        }
                        list = (List) arrayList;
                    } else if (jsonElement3.isJsonPrimitive()) {
                        list = Collections.singletonList(jsonElement3.getAsString());
                        onGetStartedClick.IconCompatParcelizer((Object) list, "java.util.Collections.singletonList(element)");
                    } else {
                        throw new UnsupportedOperationException("Unknown type for allowed interactions response list.");
                    }
                    return new FragmentBuilder_BindQuickPromptPayFragment(list, asString);
                }
            }
            list = null;
            return new FragmentBuilder_BindQuickPromptPayFragment(list, asString);
        } catch (UnsupportedOperationException e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindLoanFragment.SERVER_JSON_PARSE_ERROR);
            return null;
        }
    }
}
