package p040o;

import com.google.gson.Gson;
import okhttp3.Interceptor;
import okhttp3.MediaType;

/* renamed from: o.DataBufferRef */
public final class DataBufferRef implements Interceptor {
    private static final Gson IconCompatParcelizer = new Gson();
    private static final MediaType write = MediaType.parse("application/json; charset=utf-8");

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "data"
            o.AnimatableValueParser r1 = p040o.AnimatableValueParser.IconCompatParcelizer()
            okhttp3.Request r2 = r9.request()
            okhttp3.Response r9 = r9.proceed(r2)
            okhttp3.ResponseBody r3 = r9.body()
            java.lang.String r4 = r3.string()
            okhttp3.HttpUrl r5 = r2.url()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "profiles/tiles"
            boolean r5 = r5.contains(r6)
            r6 = 0
            if (r5 == 0) goto L_0x0039
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "profiles/tiles/static"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0039
            r2 = 1
            goto L_0x003a
        L_0x0039:
            r2 = r6
        L_0x003a:
            if (r2 != 0) goto L_0x0052
            r3.close()
            okhttp3.Response$Builder r9 = r9.newBuilder()
            okhttp3.MediaType r0 = write
            okhttp3.ResponseBody r0 = okhttp3.ResponseBody.create((okhttp3.MediaType) r0, (java.lang.String) r4)
            okhttp3.Response$Builder r9 = r9.body(r0)
            okhttp3.Response r9 = r9.build()
            return r9
        L_0x0052:
            com.google.gson.Gson r2 = IconCompatParcelizer     // Catch:{ Exception -> 0x0060 }
            java.lang.Class<o.setCurrentItemInternal> r5 = p040o.setCurrentItemInternal.class
            java.lang.Object r2 = r2.fromJson((java.lang.String) r4, r5)     // Catch:{ Exception -> 0x0060 }
            o.setCurrentItemInternal r2 = (p040o.setCurrentItemInternal) r2     // Catch:{ Exception -> 0x0060 }
            r1.MediaBrowserCompat$CustomActionResultReceiver(r2)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r2 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r2)
        L_0x0064:
            com.google.gson.Gson r2 = new com.google.gson.Gson
            r2.<init>()
            java.lang.Class<com.google.gson.JsonObject> r5 = com.google.gson.JsonObject.class
            java.lang.Object r2 = r2.fromJson((java.lang.String) r4, r5)
            com.google.gson.JsonObject r2 = (com.google.gson.JsonObject) r2
            r5 = 0
            com.google.gson.JsonElement r7 = r2.get(r0)     // Catch:{ Exception -> 0x0081 }
            boolean r7 = r7.isJsonObject()     // Catch:{ Exception -> 0x0081 }
            if (r7 == 0) goto L_0x0085
            com.google.gson.JsonObject r0 = r2.getAsJsonObject(r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0086
        L_0x0081:
            r0 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r0)
        L_0x0085:
            r0 = r5
        L_0x0086:
            if (r0 == 0) goto L_0x011a
            java.lang.String r2 = "groupMaxNumberOfTiles"
            com.google.gson.JsonElement r2 = r0.get(r2)     // Catch:{ Exception -> 0x00a1 }
            int r2 = r2.getAsInt()     // Catch:{ Exception -> 0x00a1 }
            r1.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "rootMaxNumberOfTiles"
            com.google.gson.JsonElement r2 = r0.get(r2)     // Catch:{ Exception -> 0x00a1 }
            int r2 = r2.getAsInt()     // Catch:{ Exception -> 0x00a1 }
            r1.IconCompatParcelizer = r2     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00a9
        L_0x00a1:
            r2 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r2)
            r1.MediaBrowserCompat$ItemReceiver = r6
            r1.IconCompatParcelizer = r6
        L_0x00a9:
            java.lang.String r2 = "predictiveMaxNumberOfTiles"
            com.google.gson.JsonElement r2 = r0.get(r2)     // Catch:{ Exception -> 0x00b6 }
            int r2 = r2.getAsInt()     // Catch:{ Exception -> 0x00b6 }
            r1.write = r2     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00bc
        L_0x00b6:
            r2 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r2)
            r1.write = r6
        L_0x00bc:
            java.lang.String r2 = "tiles"
            com.google.gson.JsonArray r2 = r0.getAsJsonArray(r2)
            o.DataBufferRef$5 r6 = new o.DataBufferRef$5     // Catch:{ Exception -> 0x00d6 }
            r6.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ Exception -> 0x00d6 }
            com.google.gson.Gson r7 = IconCompatParcelizer     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r6 = r7.fromJson((com.google.gson.JsonElement) r2, (java.lang.reflect.Type) r6)     // Catch:{ Exception -> 0x00d6 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x00d6 }
            r1.MediaMetadataCompat = r6     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00dc
        L_0x00d6:
            r6 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r6)
            r1.MediaMetadataCompat = r5
        L_0x00dc:
            java.util.List<o.getOpacityAtPosition> r6 = r1.MediaMetadataCompat
            if (r6 != 0) goto L_0x00fa
            o.DataBufferRef$2 r6 = new o.DataBufferRef$2     // Catch:{ Exception -> 0x00f4 }
            r6.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ Exception -> 0x00f4 }
            com.google.gson.Gson r7 = IconCompatParcelizer     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r2 = r7.fromJson((com.google.gson.JsonElement) r2, (java.lang.reflect.Type) r6)     // Catch:{ Exception -> 0x00f4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x00f4 }
            r1.MediaBrowserCompat$CustomActionResultReceiver = r2     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00fa
        L_0x00f4:
            r2 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r2)
            r1.MediaBrowserCompat$CustomActionResultReceiver = r5
        L_0x00fa:
            java.lang.String r2 = "predictives"
            com.google.gson.JsonArray r0 = r0.getAsJsonArray(r2)
            o.DataBufferRef$3 r2 = new o.DataBufferRef$3     // Catch:{ Exception -> 0x0114 }
            r2.<init>()     // Catch:{ Exception -> 0x0114 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x0114 }
            com.google.gson.Gson r6 = IconCompatParcelizer     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r0 = r6.fromJson((com.google.gson.JsonElement) r0, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x0114 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0114 }
            r1.read = r0     // Catch:{ Exception -> 0x0114 }
            goto L_0x011a
        L_0x0114:
            r0 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r0)
            r1.read = r5
        L_0x011a:
            java.util.List<o.parseFloat> r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 != 0) goto L_0x0138
            java.util.List<o.getOpacityAtPosition> r0 = r1.MediaMetadataCompat
            if (r0 != 0) goto L_0x0138
            r3.close()
            okhttp3.Response$Builder r9 = r9.newBuilder()
            okhttp3.MediaType r0 = write
            okhttp3.ResponseBody r0 = okhttp3.ResponseBody.create((okhttp3.MediaType) r0, (java.lang.String) r4)
            okhttp3.Response$Builder r9 = r9.body(r0)
            okhttp3.Response r9 = r9.build()
            return r9
        L_0x0138:
            com.google.gson.Gson r0 = IconCompatParcelizer
            java.lang.String r0 = r0.toJson((java.lang.Object) r1)
            r3.close()
            okhttp3.Response$Builder r9 = r9.newBuilder()
            okhttp3.MediaType r1 = write
            okhttp3.ResponseBody r0 = okhttp3.ResponseBody.create((okhttp3.MediaType) r1, (java.lang.String) r0)
            okhttp3.Response$Builder r9 = r9.body(r0)
            okhttp3.Response r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DataBufferRef.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
