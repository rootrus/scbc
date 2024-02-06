package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.setPageMarginDrawable */
public final class setPageMarginDrawable implements JsonDeserializer<removeLottieOnCompositionLoadedListener> {
    private final Gson MediaBrowserCompat$CustomActionResultReceiver;

    public setPageMarginDrawable(Gson gson) {
        onGetStartedClick.write((Object) gson, "gson");
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
    }

    private static onVisibilityChanged MediaBrowserCompat$CustomActionResultReceiver(JsonObject jsonObject, onVisibilityChanged onvisibilitychanged) throws Exception {
        onGetStartedClick.write((Object) jsonObject, "json");
        onGetStartedClick.write((Object) onvisibilitychanged, "item");
        JsonElement jsonElement = jsonObject.get("type");
        onGetStartedClick.IconCompatParcelizer((Object) jsonElement, "json.get(\"type\")");
        String asString = jsonElement.getAsString();
        onGetStartedClick.IconCompatParcelizer((Object) asString, "json.get(\"type\").asString");
        onGetStartedClick.write((Object) asString, "<set-?>");
        onvisibilitychanged.MediaBrowserCompat$SearchResultReceiver = asString;
        if (jsonObject.has("paddingTop")) {
            JsonElement jsonElement2 = jsonObject.get("paddingTop");
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement2, "json.get(\"paddingTop\")");
            String asString2 = jsonElement2.getAsString();
            onGetStartedClick.IconCompatParcelizer((Object) asString2, "json.get(\"paddingTop\").asString");
            onGetStartedClick.write((Object) asString2, "<set-?>");
            onvisibilitychanged.MediaDescriptionCompat = asString2;
        }
        if (jsonObject.has("paddingBottom")) {
            JsonElement jsonElement3 = jsonObject.get("paddingBottom");
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement3, "json.get(\"paddingBottom\")");
            String asString3 = jsonElement3.getAsString();
            onGetStartedClick.IconCompatParcelizer((Object) asString3, "json.get(\"paddingBottom\").asString");
            onGetStartedClick.write((Object) asString3, "<set-?>");
            onvisibilitychanged.RatingCompat = asString3;
        }
        if (jsonObject.has("hasSeparator")) {
            JsonElement jsonElement4 = jsonObject.get("hasSeparator");
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement4, "json.get(\"hasSeparator\")");
            onvisibilitychanged.write = jsonElement4.getAsBoolean();
        }
        if (jsonObject.has("isHiddenInSlip")) {
            JsonElement jsonElement5 = jsonObject.get("isHiddenInSlip");
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement5, "json.get(\"isHiddenInSlip\")");
            onvisibilitychanged.MediaBrowserCompat$CustomActionResultReceiver = jsonElement5.getAsBoolean();
        }
        return onvisibilitychanged;
    }

    /* renamed from: o.setPageMarginDrawable$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends TypeToken<List<? extends String>> {
        IconCompatParcelizer() {
        }
    }

    private List<removeAllUpdateListeners> MediaBrowserCompat$CustomActionResultReceiver(JsonObject jsonObject) throws Exception {
        removeAllUpdateListeners removeallupdatelisteners;
        onGetStartedClick.write((Object) jsonObject, "json");
        ArrayList arrayList = new ArrayList();
        if (!jsonObject.has("footer")) {
            return arrayList;
        }
        JsonArray asJsonArray = jsonObject.getAsJsonArray("footer");
        int i = 0;
        int size = asJsonArray.size();
        while (i < size) {
            JsonElement jsonElement = asJsonArray.get(i);
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement, "jsonArray.get(i)");
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            onGetStartedClick.IconCompatParcelizer((Object) asJsonObject, "jsonArray.get(i).asJsonObject");
            onGetStartedClick.write((Object) asJsonObject, "json");
            JsonElement jsonElement2 = asJsonObject.get("type");
            onGetStartedClick.IconCompatParcelizer((Object) jsonElement2, "json.get(\"type\")");
            String asString = jsonElement2.getAsString();
            onGetStartedClick.IconCompatParcelizer((Object) asString, "json.get(\"type\").asString");
            if (asString != null) {
                String lowerCase = asString.toLowerCase();
                onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                int hashCode = lowerCase.hashCode();
                if (hashCode == -911436124) {
                    lowerCase.equals("footer_remark");
                } else if (hashCode != -314580553) {
                    if (hashCode == 1670366677) {
                        boolean equals = lowerCase.equals("footer_content");
                    }
                } else if (lowerCase.equals("footer_image")) {
                    onGetStartedClick.write((Object) asJsonObject, "json");
                    removeallupdatelisteners = new removeAllUpdateListeners();
                    JsonElement jsonElement3 = asJsonObject.get("type");
                    onGetStartedClick.IconCompatParcelizer((Object) jsonElement3, "json.get(\"type\")");
                    String asString2 = jsonElement3.getAsString();
                    onGetStartedClick.IconCompatParcelizer((Object) asString2, "json.get(\"type\").asString");
                    onGetStartedClick.write((Object) asString2, "<set-?>");
                    removeallupdatelisteners.write = asString2;
                    if (asJsonObject.has("image")) {
                        JsonElement jsonElement4 = asJsonObject.get("image");
                        onGetStartedClick.IconCompatParcelizer((Object) jsonElement4, "json.get(\"image\")");
                        String asString3 = jsonElement4.getAsString();
                        onGetStartedClick.IconCompatParcelizer((Object) asString3, "json.get(\"image\").asString");
                        onGetStartedClick.write((Object) asString3, "<set-?>");
                        removeallupdatelisteners.IconCompatParcelizer = asString3;
                    }
                    arrayList.add(removeallupdatelisteners);
                    i++;
                }
                onGetStartedClick.write((Object) asJsonObject, "json");
                removeallupdatelisteners = new removeAllUpdateListeners();
                JsonElement jsonElement5 = asJsonObject.get("type");
                onGetStartedClick.IconCompatParcelizer((Object) jsonElement5, "json.get(\"type\")");
                String asString4 = jsonElement5.getAsString();
                onGetStartedClick.IconCompatParcelizer((Object) asString4, "json.get(\"type\").asString");
                onGetStartedClick.write((Object) asString4, "<set-?>");
                removeallupdatelisteners.write = asString4;
                if (asJsonObject.has("text")) {
                    JsonElement jsonElement6 = asJsonObject.get("text");
                    onGetStartedClick.IconCompatParcelizer((Object) jsonElement6, "json.get(\"text\")");
                    String asString5 = jsonElement6.getAsString();
                    onGetStartedClick.IconCompatParcelizer((Object) asString5, "json.get(\"text\").asString");
                    onGetStartedClick.write((Object) asString5, "<set-?>");
                    removeallupdatelisteners.MediaBrowserCompat$ItemReceiver = asString5;
                }
                arrayList.add(removeallupdatelisteners);
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object deserialize(com.google.gson.JsonElement r19, java.lang.reflect.Type r20, com.google.gson.JsonDeserializationContext r21) {
        /*
            r18 = this;
            r0 = r18
            if (r19 == 0) goto L_0x01fe
            com.google.gson.JsonObject r1 = r19.getAsJsonObject()
            java.lang.String r2 = "jsonElement.asJsonObject"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.String r3 = "json"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            java.lang.String r4 = "themeFlag"
            com.google.gson.JsonElement r1 = r1.get(r4)
            java.lang.String r4 = "json.get(\"themeFlag\")"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            java.lang.String r1 = r1.getAsString()
            java.lang.String r4 = "json.get(\"themeFlag\").asString"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            com.google.gson.JsonObject r4 = r19.getAsJsonObject()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r2)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r3)
            com.google.gson.Gson r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r6 = "header"
            com.google.gson.JsonObject r4 = r4.getAsJsonObject(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Class<o.removeUpdateListener> r6 = p040o.removeUpdateListener.class
            java.lang.Object r4 = r5.fromJson((java.lang.String) r4, r6)
            java.lang.String r5 = "gson.fromJson(json.getAs…HeaderEntity::class.java)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            o.removeUpdateListener r4 = (p040o.removeUpdateListener) r4
            com.google.gson.JsonObject r5 = r19.getAsJsonObject()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r2)
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r7 = "body"
            boolean r8 = r5.has(r7)
            if (r8 == 0) goto L_0x01e3
            com.google.gson.JsonArray r5 = r5.getAsJsonArray(r7)
            r7 = 0
            int r8 = r5.size()
        L_0x006a:
            if (r7 >= r8) goto L_0x01e3
            com.google.gson.JsonElement r9 = r5.get(r7)
            java.lang.String r10 = "jsonArray.get(i)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            com.google.gson.JsonObject r9 = r9.getAsJsonObject()
            java.lang.String r10 = "jsonArray.get(i).asJsonObject"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r3)
            java.lang.String r10 = "type"
            com.google.gson.JsonElement r10 = r9.get(r10)
            java.lang.String r11 = "json.get(\"type\")"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r11)
            java.lang.String r10 = r10.getAsString()
            java.lang.String r11 = "json.get(\"value\").asString"
            java.lang.String r12 = "json.get(\"value\")"
            java.lang.String r13 = "json.get(\"label\").asString"
            java.lang.String r14 = "json.get(\"label\")"
            java.lang.String r15 = "value"
            r20 = r5
            java.lang.String r5 = "label"
            r21 = r8
            java.lang.String r8 = "<set-?>"
            r16 = r1
            if (r10 == 0) goto L_0x0192
            int r1 = r10.hashCode()
            r17 = r4
            r4 = -1891801960(0xffffffff8f3d6498, float:-9.337793E-30)
            if (r1 == r4) goto L_0x010d
            r4 = 2571565(0x273d2d, float:3.60353E-39)
            if (r1 == r4) goto L_0x0105
            r4 = 1782537993(0x6a3f5f09, float:5.7838406E25)
            if (r1 != r4) goto L_0x0194
            java.lang.String r1 = "MINI_QR"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0194
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r3)
            o.onVisibilityChanged r1 = new o.onVisibilityChanged
            r1.<init>()
            o.onVisibilityChanged r1 = MediaBrowserCompat$CustomActionResultReceiver(r9, r1)
            java.lang.String r4 = "qrString"
            com.google.gson.JsonElement r4 = r9.get(r4)
            java.lang.String r10 = "json.get(\"qrString\")"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r10)
            java.lang.String r4 = r4.getAsString()
            java.lang.String r10 = "json.get(\"qrString\").asString"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r10)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.MediaBrowserCompat$MediaItem = r4
            boolean r4 = r9.has(r5)
            if (r4 == 0) goto L_0x01d2
            com.google.gson.JsonElement r4 = r9.get(r5)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r14)
            java.lang.String r4 = r4.getAsString()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r13)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.read = r4
            goto L_0x01d2
        L_0x0105:
            java.lang.String r1 = "TEXT"
            boolean r1 = r10.equals(r1)
            goto L_0x0194
        L_0x010d:
            java.lang.String r1 = "TEXT_TWO_COLUMNS"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0194
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r3)
            o.onVisibilityChanged r1 = new o.onVisibilityChanged
            r1.<init>()
            o.onVisibilityChanged r1 = MediaBrowserCompat$CustomActionResultReceiver(r9, r1)
            com.google.gson.JsonElement r4 = r9.get(r5)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r14)
            java.lang.String r4 = r4.getAsString()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r13)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.read = r4
            com.google.gson.JsonElement r4 = r9.get(r15)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r12)
            java.lang.String r4 = r4.getAsString()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r11)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.MediaMetadataCompat = r4
            java.lang.String r4 = "image"
            boolean r5 = r9.has(r4)
            if (r5 == 0) goto L_0x0166
            com.google.gson.JsonElement r4 = r9.get(r4)
            java.lang.String r5 = "json.get(\"image\")"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            java.lang.String r4 = r4.getAsString()
            java.lang.String r5 = "json.get(\"image\").asString"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.IconCompatParcelizer = r4
        L_0x0166:
            java.lang.String r4 = "description"
            boolean r5 = r9.has(r4)
            if (r5 == 0) goto L_0x01d2
            com.google.gson.Gson r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            com.google.gson.JsonArray r4 = r9.getAsJsonArray(r4)
            java.lang.String r4 = r4.toString()
            o.setPageMarginDrawable$IconCompatParcelizer r9 = new o.setPageMarginDrawable$IconCompatParcelizer
            r9.<init>()
            java.lang.reflect.Type r9 = r9.getType()
            java.lang.Object r4 = r5.fromJson((java.lang.String) r4, (java.lang.reflect.Type) r9)
            java.lang.String r5 = "gson.fromJson(\n         …<List<String>>() {}.type)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            java.util.List r4 = (java.util.List) r4
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x01d2
        L_0x0192:
            r17 = r4
        L_0x0194:
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r3)
            o.onVisibilityChanged r1 = new o.onVisibilityChanged
            r1.<init>()
            o.onVisibilityChanged r1 = MediaBrowserCompat$CustomActionResultReceiver(r9, r1)
            boolean r4 = r9.has(r5)
            if (r4 == 0) goto L_0x01b9
            com.google.gson.JsonElement r4 = r9.get(r5)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r14)
            java.lang.String r4 = r4.getAsString()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r13)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.read = r4
        L_0x01b9:
            boolean r4 = r9.has(r15)
            if (r4 == 0) goto L_0x01d2
            com.google.gson.JsonElement r4 = r9.get(r15)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r12)
            java.lang.String r4 = r4.getAsString()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r11)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            r1.MediaMetadataCompat = r4
        L_0x01d2:
            if (r1 == 0) goto L_0x01d7
            r6.add(r1)
        L_0x01d7:
            int r7 = r7 + 1
            r5 = r20
            r8 = r21
            r1 = r16
            r4 = r17
            goto L_0x006a
        L_0x01e3:
            r16 = r1
            r17 = r4
            java.util.List r6 = (java.util.List) r6
            com.google.gson.JsonObject r1 = r19.getAsJsonObject()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            java.util.List r1 = r0.MediaBrowserCompat$CustomActionResultReceiver(r1)
            o.removeLottieOnCompositionLoadedListener r2 = new o.removeLottieOnCompositionLoadedListener
            r3 = r16
            r4 = r17
            r2.<init>(r3, r4, r6, r1)
            return r2
        L_0x01fe:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setPageMarginDrawable.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):java.lang.Object");
    }
}
