package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.FontParser */
public final class FontParser extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;

    public FontParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getOpacityAtPosition getopacityatposition = (getOpacityAtPosition) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 449);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(getopacityatposition.IconCompatParcelizer);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (getopacityatposition != getopacityatposition.write) {
            validatedagrecurse.read(jsonWriter, 357);
            String str = getopacityatposition.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        validatedagrecurse.read(jsonWriter, 37);
        Class cls2 = Long.TYPE;
        Long valueOf2 = Long.valueOf(getopacityatposition.read);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        validatedagrecurse.read(jsonWriter, 336);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(getopacityatposition.MediaBrowserCompat$ItemReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        validatedagrecurse.read(jsonWriter, 91);
        Class cls4 = Integer.TYPE;
        Integer valueOf4 = Integer.valueOf(getopacityatposition.MediaBrowserCompat$CustomActionResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls4, (Object) valueOf4).write(jsonWriter, valueOf4);
        validatedagrecurse.read(jsonWriter, 35);
        Class cls5 = Integer.TYPE;
        Integer valueOf5 = Integer.valueOf(getopacityatposition.MediaMetadataCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls5, (Object) valueOf5).write(jsonWriter, valueOf5);
        validatedagrecurse.read(jsonWriter, 236);
        Class cls6 = Long.TYPE;
        Long valueOf6 = Long.valueOf(getopacityatposition.RatingCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls6, (Object) valueOf6).write(jsonWriter, valueOf6);
        if (getopacityatposition != getopacityatposition.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 21);
            String str2 = getopacityatposition.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (getopacityatposition != getopacityatposition.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 26);
            String str3 = getopacityatposition.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (getopacityatposition != getopacityatposition.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 599);
            String str4 = getopacityatposition.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (getopacityatposition != getopacityatposition.ParcelableVolumeInfo) {
            validatedagrecurse.read(jsonWriter, 212);
            String str5 = getopacityatposition.ParcelableVolumeInfo;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (getopacityatposition != getopacityatposition.MediaSessionCompat$QueueItem) {
            validatedagrecurse.read(jsonWriter, 455);
            String str6 = getopacityatposition.MediaSessionCompat$QueueItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (getopacityatposition != getopacityatposition.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 315);
            setEndFrames setendframes = getopacityatposition.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, setEndFrames.class, (Object) setendframes).write(jsonWriter, setendframes);
        }
        if (getopacityatposition != getopacityatposition.MediaSessionCompat$Token) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            getGeoDataClient getgeodataclient = getopacityatposition.MediaSessionCompat$Token;
            findNode.MediaBrowserCompat$ItemReceiver(gson, getGeoDataClient.class, (Object) getgeodataclient).write(jsonWriter, getgeodataclient);
        }
        if (getopacityatposition != getopacityatposition.f2844x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, 42);
            parseChars parsechars = getopacityatposition.f2844x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, parseChars.class, (Object) parsechars).write(jsonWriter, parsechars);
        }
        getopacityatposition.read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0177, code lost:
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
            o.getOpacityAtPosition r0 = new o.getOpacityAtPosition
            r0.<init>()
            com.google.gson.Gson r1 = r7.IconCompatParcelizer
            o.validateCycle r3 = r7.MediaBrowserCompat$ItemReceiver
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x017c
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
                case 13: goto L_0x0163;
                case 49: goto L_0x014e;
                case 146: goto L_0x0138;
                case 184: goto L_0x0123;
                case 252: goto L_0x010d;
                case 259: goto L_0x00f7;
                case 262: goto L_0x00e1;
                case 279: goto L_0x00cb;
                case 283: goto L_0x00b5;
                case 287: goto L_0x009f;
                case 408: goto L_0x0089;
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
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x004a:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x005f:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<o.setEndFrames> r4 = p040o.setEndFrames.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.setEndFrames r4 = (p040o.setEndFrames) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x0085:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x0177
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<o.getGeoDataClient> r4 = p040o.getGeoDataClient.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.getGeoDataClient r4 = (p040o.getGeoDataClient) r4
            r0.MediaSessionCompat$Token = r4
            goto L_0x0019
        L_0x009b:
            r0.MediaSessionCompat$Token = r2
            goto L_0x0177
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.ParcelableVolumeInfo = r4
            goto L_0x0019
        L_0x00b1:
            r0.ParcelableVolumeInfo = r2
            goto L_0x0177
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x00c7:
            r0.MediaDescriptionCompat = r2
            goto L_0x0177
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$QueueItem = r4
            goto L_0x0019
        L_0x00dd:
            r0.MediaSessionCompat$QueueItem = r2
            goto L_0x0177
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<o.parseChars> r4 = p040o.parseChars.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.parseChars r4 = (p040o.parseChars) r4
            r0.f2844x50fd9e4a = r4
            goto L_0x0019
        L_0x00f3:
            r0.f2844x50fd9e4a = r2
            goto L_0x0177
        L_0x00f7:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x010d:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x0123:
            if (r5 == 0) goto L_0x0135
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.write = r4
            goto L_0x0019
        L_0x0135:
            r0.write = r2
            goto L_0x0177
        L_0x0138:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.read = r4
            goto L_0x0019
        L_0x014e:
            if (r5 == 0) goto L_0x0160
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x0160:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x0177
        L_0x0163:
            if (r5 == 0) goto L_0x0175
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x0175:
            r0.MediaBrowserCompat$MediaItem = r2
        L_0x0177:
            r8.nextNull()
            goto L_0x0019
        L_0x017c:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FontParser.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
