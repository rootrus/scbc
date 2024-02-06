package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getParameters */
public final class getParameters extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public getParameters(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getUriTemplate geturitemplate = (getUriTemplate) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (geturitemplate != geturitemplate.read) {
            validatedagrecurse.read(jsonWriter, 518);
            Double d = geturitemplate.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d).write(jsonWriter, d);
        }
        if (geturitemplate != geturitemplate.write) {
            validatedagrecurse.read(jsonWriter, 293);
            String str = geturitemplate.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (geturitemplate != geturitemplate.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 44);
            String str2 = geturitemplate.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (geturitemplate != geturitemplate.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 271);
            String str3 = geturitemplate.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (geturitemplate != geturitemplate.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 34);
            String str4 = geturitemplate.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (geturitemplate != geturitemplate.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 227);
            String str5 = geturitemplate.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (geturitemplate != geturitemplate.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 467);
            String str6 = geturitemplate.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (geturitemplate != geturitemplate.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 109);
            String str7 = geturitemplate.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (geturitemplate != geturitemplate.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 406);
            String str8 = geturitemplate.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (geturitemplate != geturitemplate.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 402);
            String str9 = geturitemplate.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (geturitemplate != geturitemplate.f2599x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, 250);
            String str10 = geturitemplate.f2599x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (geturitemplate != geturitemplate.MediaSessionCompat$QueueItem) {
            validatedagrecurse.read(jsonWriter, 478);
            String str11 = geturitemplate.MediaSessionCompat$QueueItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        if (geturitemplate != geturitemplate.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 2);
            String str12 = geturitemplate.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0148, code lost:
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
            o.getUriTemplate r0 = new o.getUriTemplate
            r0.<init>()
            com.google.gson.Gson r1 = r7.MediaBrowserCompat$ItemReceiver
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x014d
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
                case 16: goto L_0x0134;
                case 35: goto L_0x011f;
                case 66: goto L_0x010a;
                case 88: goto L_0x00f5;
                case 187: goto L_0x00e0;
                case 242: goto L_0x00cb;
                case 304: goto L_0x00b5;
                case 383: goto L_0x009f;
                case 386: goto L_0x0089;
                case 387: goto L_0x0074;
                case 392: goto L_0x005f;
                case 438: goto L_0x004a;
                case 496: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0046
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x0046:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x0148
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x005b:
            r0.RatingCompat = r2
            goto L_0x0148
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$QueueItem = r4
            goto L_0x0019
        L_0x0070:
            r0.MediaSessionCompat$QueueItem = r2
            goto L_0x0148
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Double r4 = (java.lang.Double) r4
            r0.read = r4
            goto L_0x0019
        L_0x0085:
            r0.read = r2
            goto L_0x0148
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x009b:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x0148
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x00b1:
            r0.IconCompatParcelizer = r2
            goto L_0x0148
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
            goto L_0x0148
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x00dd:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x0148
        L_0x00e0:
            if (r5 == 0) goto L_0x00f2
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x00f2:
            r0.MediaBrowserCompat$MediaItem = r2
            goto L_0x0148
        L_0x00f5:
            if (r5 == 0) goto L_0x0107
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x0107:
            r0.MediaMetadataCompat = r2
            goto L_0x0148
        L_0x010a:
            if (r5 == 0) goto L_0x011c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x011c:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x0148
        L_0x011f:
            if (r5 == 0) goto L_0x0131
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.write = r4
            goto L_0x0019
        L_0x0131:
            r0.write = r2
            goto L_0x0148
        L_0x0134:
            if (r5 == 0) goto L_0x0146
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f2599x50fd9e4a = r4
            goto L_0x0019
        L_0x0146:
            r0.f2599x50fd9e4a = r2
        L_0x0148:
            r8.nextNull()
            goto L_0x0019
        L_0x014d:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getParameters.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
