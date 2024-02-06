package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.GradientColorParser */
public final class GradientColorParser extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse write;

    public GradientColorParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        parseScale parsescale = (parseScale) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (parsescale != parsescale.read) {
            validatedagrecurse.read(jsonWriter, 6);
            String str = parsescale.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (parsescale != parsescale.write) {
            validatedagrecurse.read(jsonWriter, 276);
            String str2 = parsescale.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (parsescale != parsescale.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 518);
            String str3 = parsescale.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (parsescale != parsescale.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 40);
            String str4 = parsescale.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (parsescale != parsescale.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 100);
            String str5 = parsescale.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (parsescale != parsescale.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 574);
            String str6 = parsescale.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (parsescale != parsescale.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 423);
            String str7 = parsescale.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (parsescale != parsescale.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 600);
            String str8 = parsescale.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (parsescale != parsescale.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 318);
            String str9 = parsescale.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (parsescale != parsescale.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 563);
            String str10 = parsescale.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (parsescale != parsescale.ParcelableVolumeInfo) {
            validatedagrecurse.read(jsonWriter, 626);
            String str11 = parsescale.ParcelableVolumeInfo;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        parsescale.read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011c, code lost:
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
            o.parseScale r0 = new o.parseScale
            r0.<init>()
            com.google.gson.Gson r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0121
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
                case 0: goto L_0x0108;
                case 10: goto L_0x00f3;
                case 21: goto L_0x00de;
                case 30: goto L_0x00c9;
                case 274: goto L_0x00b4;
                case 328: goto L_0x009f;
                case 369: goto L_0x0089;
                case 387: goto L_0x0074;
                case 435: goto L_0x005f;
                case 542: goto L_0x004a;
                case 614: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0.read((com.google.gson.Gson) r1, (com.google.gson.stream.JsonReader) r8, (int) r4)
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0046
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x0046:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x011c
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x005b:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x011c
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x0070:
            r0.MediaMetadataCompat = r2
            goto L_0x011c
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x0085:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x011c
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x009b:
            r0.RatingCompat = r2
            goto L_0x011c
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
            goto L_0x011c
        L_0x00b4:
            if (r5 == 0) goto L_0x00c6
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.write = r4
            goto L_0x0019
        L_0x00c6:
            r0.write = r2
            goto L_0x011c
        L_0x00c9:
            if (r5 == 0) goto L_0x00db
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x00db:
            r0.MediaDescriptionCompat = r2
            goto L_0x011c
        L_0x00de:
            if (r5 == 0) goto L_0x00f0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.read = r4
            goto L_0x0019
        L_0x00f0:
            r0.read = r2
            goto L_0x011c
        L_0x00f3:
            if (r5 == 0) goto L_0x0105
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x0105:
            r0.IconCompatParcelizer = r2
            goto L_0x011c
        L_0x0108:
            if (r5 == 0) goto L_0x011a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x011a:
            r0.MediaBrowserCompat$MediaItem = r2
        L_0x011c:
            r8.nextNull()
            goto L_0x0019
        L_0x0121:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.GradientColorParser.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
