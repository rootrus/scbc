package p040o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* renamed from: o.pathInterpolatorCache */
public final class pathInterpolatorCache implements JsonDeserializer<KeyframeParser> {
    public final /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return write(jsonElement, jsonDeserializationContext);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r0.write = null;
        r0.MediaBrowserCompat$CustomActionResultReceiver = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.KeyframeParser write(com.google.gson.JsonElement r6, com.google.gson.JsonDeserializationContext r7) throws com.google.gson.JsonParseException {
        /*
            r5 = this;
            o.KeyframeParser r0 = new o.KeyframeParser
            r0.<init>()
            boolean r1 = r6.isJsonObject()
            if (r1 == 0) goto L_0x00fd
            com.google.gson.JsonObject r6 = r6.getAsJsonObject()
            java.lang.String r1 = "rootMaxNumberOfTiles"
            boolean r2 = r6.has(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0021
            com.google.gson.JsonElement r1 = r6.get(r1)
            int r1 = r1.getAsInt()
            goto L_0x0022
        L_0x0021:
            r1 = r3
        L_0x0022:
            r0.MediaBrowserCompat$SearchResultReceiver = r1
            java.lang.String r1 = "groupMaxNumberOfTiles"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L_0x0035
            com.google.gson.JsonElement r1 = r6.get(r1)
            int r1 = r1.getAsInt()
            goto L_0x0036
        L_0x0035:
            r1 = r3
        L_0x0036:
            r0.IconCompatParcelizer = r1
            java.lang.String r1 = "predictiveMaxNumberOfTiles"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L_0x0048
            com.google.gson.JsonElement r1 = r6.get(r1)
            int r3 = r1.getAsInt()
        L_0x0048:
            r0.RatingCompat = r3
            java.lang.String r1 = "predictiveTiles"
            boolean r2 = r6.has(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0067
            o.pathInterpolatorCache$2 r2 = new o.pathInterpolatorCache$2
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            com.google.gson.JsonElement r1 = r6.get(r1)
            java.lang.Object r1 = r7.deserialize(r1, r2)
            java.util.List r1 = (java.util.List) r1
            goto L_0x0068
        L_0x0067:
            r1 = r3
        L_0x0068:
            r0.MediaMetadataCompat = r1
            java.lang.String r1 = "staticTiles"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L_0x0086
            o.pathInterpolatorCache$1 r2 = new o.pathInterpolatorCache$1
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            com.google.gson.JsonElement r1 = r6.get(r1)
            java.lang.Object r1 = r7.deserialize(r1, r2)
            java.util.List r1 = (java.util.List) r1
            goto L_0x0087
        L_0x0086:
            r1 = r3
        L_0x0087:
            r0.MediaBrowserCompat$MediaItem = r1
            java.lang.String r1 = "adsTiles"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L_0x00a5
            o.pathInterpolatorCache$10 r2 = new o.pathInterpolatorCache$10
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            com.google.gson.JsonElement r1 = r6.get(r1)
            java.lang.Object r1 = r7.deserialize(r1, r2)
            java.util.List r1 = (java.util.List) r1
            goto L_0x00a6
        L_0x00a5:
            r1 = r3
        L_0x00a6:
            r0.MediaBrowserCompat$ItemReceiver = r1
            java.lang.String r1 = "dynamicTiles"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L_0x00e0
            o.pathInterpolatorCache$3 r2 = new o.pathInterpolatorCache$3     // Catch:{ Exception -> 0x00c6 }
            r2.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x00c6 }
            com.google.gson.JsonElement r4 = r6.get(r1)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r2 = r7.deserialize(r4, r2)     // Catch:{ Exception -> 0x00c6 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x00c6 }
            r0.write = r2     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00e0
        L_0x00c6:
            o.pathInterpolatorCache$5 r2 = new o.pathInterpolatorCache$5     // Catch:{ Exception -> 0x00dc }
            r2.<init>()     // Catch:{ Exception -> 0x00dc }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x00dc }
            com.google.gson.JsonElement r1 = r6.get(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.Object r1 = r7.deserialize(r1, r2)     // Catch:{ Exception -> 0x00dc }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x00dc }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ Exception -> 0x00dc }
            goto L_0x00e0
        L_0x00dc:
            r0.write = r3
            r0.MediaBrowserCompat$CustomActionResultReceiver = r3
        L_0x00e0:
            java.lang.String r1 = "bankingServiceTiles"
            boolean r2 = r6.has(r1)
            if (r2 == 0) goto L_0x00fd
            o.pathInterpolatorCache$4 r2 = new o.pathInterpolatorCache$4
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            com.google.gson.JsonElement r6 = r6.get(r1)
            java.lang.Object r6 = r7.deserialize(r6, r2)
            java.util.List r6 = (java.util.List) r6
            r0.read = r6
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.pathInterpolatorCache.write(com.google.gson.JsonElement, com.google.gson.JsonDeserializationContext):o.KeyframeParser");
    }
}
