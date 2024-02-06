package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.FloatParser */
public final class FloatParser extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;

    public FloatParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        parseFloat parsefloat = (parseFloat) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (parsefloat != parsefloat.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 357);
            String str = parsefloat.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        validatedagrecurse.read(jsonWriter, 249);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(parsefloat.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (parsefloat != parsefloat.read) {
            validatedagrecurse.read(jsonWriter, 315);
            parseGradientColor parsegradientcolor = new parseGradientColor();
            List<getOpacityAtPosition> list = parsefloat.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) parsegradientcolor, (Object) list).write(jsonWriter, list);
        }
        validatedagrecurse.read(jsonWriter, 336);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(parsefloat.MediaBrowserCompat$CustomActionResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        validatedagrecurse.read(jsonWriter, 91);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(parsefloat.IconCompatParcelizer);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        validatedagrecurse.read(jsonWriter, 35);
        Class cls4 = Integer.TYPE;
        Integer valueOf4 = Integer.valueOf(parsefloat.MediaMetadataCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls4, (Object) valueOf4).write(jsonWriter, valueOf4);
        validatedagrecurse.read(jsonWriter, 236);
        Class cls5 = Long.TYPE;
        Long valueOf5 = Long.valueOf(parsefloat.MediaBrowserCompat$SearchResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls5, (Object) valueOf5).write(jsonWriter, valueOf5);
        if (parsefloat != parsefloat.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 21);
            String str2 = parsefloat.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (parsefloat != parsefloat.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 599);
            String str3 = parsefloat.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (parsefloat != parsefloat.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 455);
            String str4 = parsefloat.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (parsefloat != parsefloat.f2916x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            getGeoDataClient getgeodataclient = parsefloat.f2916x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, getGeoDataClient.class, (Object) getgeodataclient).write(jsonWriter, getgeodataclient);
        }
        if (parsefloat != parsefloat.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 42);
            parseChars parsechars = parsefloat.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, parseChars.class, (Object) parsechars).write(jsonWriter, parsechars);
        }
        parsefloat.read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0136, code lost:
        r8.nextNull();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
        /*
            r7 = this;
            com.google.gson.stream.JsonToken r0 = r8.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r8.skipValue()
            return r2
        L_0x000d:
            o.parseFloat r0 = new o.parseFloat
            r0.<init>()
            com.google.gson.Gson r1 = r7.MediaBrowserCompat$ItemReceiver
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x013b
            int r4 = r3.write(r8)
            com.google.gson.stream.JsonToken r5 = r8.peek()
            com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
            if (r5 == r6) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            switch(r4) {
                case 13: goto L_0x0122;
                case 49: goto L_0x010d;
                case 184: goto L_0x00f8;
                case 252: goto L_0x00e2;
                case 262: goto L_0x00cd;
                case 279: goto L_0x00b8;
                case 313: goto L_0x00a2;
                case 408: goto L_0x008c;
                case 415: goto L_0x0074;
                case 443: goto L_0x005f;
                case 528: goto L_0x004a;
                case 544: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0.read((com.google.gson.Gson) r1, (com.google.gson.stream.JsonReader) r8, (int) r4)
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0136
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x004a:
            if (r5 == 0) goto L_0x0136
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x005f:
            if (r5 == 0) goto L_0x0136
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x0074:
            if (r5 == 0) goto L_0x0088
            o.parseGradientColor r4 = new o.parseGradientColor
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.read = r4
            goto L_0x0019
        L_0x0088:
            r0.read = r2
            goto L_0x0136
        L_0x008c:
            if (r5 == 0) goto L_0x009e
            java.lang.Class<o.getGeoDataClient> r4 = p040o.getGeoDataClient.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.getGeoDataClient r4 = (p040o.getGeoDataClient) r4
            r0.f2916x50fd9e4a = r4
            goto L_0x0019
        L_0x009e:
            r0.f2916x50fd9e4a = r2
            goto L_0x0136
        L_0x00a2:
            if (r5 == 0) goto L_0x0136
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.write = r4
            goto L_0x0019
        L_0x00b8:
            if (r5 == 0) goto L_0x00ca
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x00ca:
            r0.MediaBrowserCompat$MediaItem = r2
            goto L_0x0136
        L_0x00cd:
            if (r5 == 0) goto L_0x00df
            java.lang.Class<o.parseChars> r4 = p040o.parseChars.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.parseChars r4 = (p040o.parseChars) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x00df:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x0136
        L_0x00e2:
            if (r5 == 0) goto L_0x0136
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x00f8:
            if (r5 == 0) goto L_0x010a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x010a:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x0136
        L_0x010d:
            if (r5 == 0) goto L_0x011f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x011f:
            r0.MediaDescriptionCompat = r2
            goto L_0x0136
        L_0x0122:
            if (r5 == 0) goto L_0x0134
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x0134:
            r0.RatingCompat = r2
        L_0x0136:
            r8.nextNull()
            goto L_0x0019
        L_0x013b:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FloatParser.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
