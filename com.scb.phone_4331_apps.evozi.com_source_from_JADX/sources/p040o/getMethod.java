package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.asn1.x509.DisplayText;
import org.jmrtd.cbeff.ISO781611;
import p040o.C1251R;

/* renamed from: o.getMethod */
public final class getMethod extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public getMethod(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        C1251R.color color = (C1251R.color) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (color != color.write) {
            validatedagrecurse.read(jsonWriter, 46);
            String str = color.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (color != color.read) {
            validatedagrecurse.read(jsonWriter, 551);
            addPoints addpoints = color.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, addPoints.class, (Object) addpoints).write(jsonWriter, addpoints);
        }
        if (color != color.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 233);
            String str2 = color.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (color != color.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 73);
            String str3 = color.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (color != color.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 395);
            String str4 = color.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (color != color.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 409);
            createResultAndNotify createresultandnotify = color.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, createResultAndNotify.class, (Object) createresultandnotify).write(jsonWriter, createresultandnotify);
        }
        if (color != color.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, ISO781611.BIOMETRIC_SUBTYPE_TAG);
            String str5 = color.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (color != color.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 438);
            Integer num = color.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num).write(jsonWriter, num);
        }
        if (color != color.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 188);
            String str6 = color.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (color != color.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 397);
            String str7 = color.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (color != color.MediaSessionCompat$QueueItem) {
            validatedagrecurse.read(jsonWriter, 523);
            String str8 = color.MediaSessionCompat$QueueItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (color != color.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 59);
            String str9 = color.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (color != color.ParcelableVolumeInfo) {
            validatedagrecurse.read(jsonWriter, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            String str10 = color.ParcelableVolumeInfo;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (color != color.f2554x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, 313);
            canonicalize canonicalize = color.f2554x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, canonicalize.class, (Object) canonicalize).write(jsonWriter, canonicalize);
        }
        if (color != color.MediaSessionCompat$Token) {
            validatedagrecurse.read(jsonWriter, 203);
            String str11 = color.MediaSessionCompat$Token;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        if (color != color.AlertController$RecycleListView) {
            validatedagrecurse.read(jsonWriter, 466);
            String str12 = color.AlertController$RecycleListView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        if (color != color.setHasDecor) {
            validatedagrecurse.read(jsonWriter, 116);
            createResultAndNotify createresultandnotify2 = color.setHasDecor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, createResultAndNotify.class, (Object) createresultandnotify2).write(jsonWriter, createresultandnotify2);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a0, code lost:
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
            o.R$color r0 = new o.R$color
            r0.<init>()
            com.google.gson.Gson r1 = r7.MediaBrowserCompat$ItemReceiver
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x01a5
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
                case 9: goto L_0x018c;
                case 52: goto L_0x0177;
                case 101: goto L_0x0162;
                case 110: goto L_0x014d;
                case 142: goto L_0x0138;
                case 157: goto L_0x0123;
                case 267: goto L_0x010d;
                case 293: goto L_0x00f7;
                case 329: goto L_0x00e1;
                case 356: goto L_0x00cb;
                case 373: goto L_0x00b5;
                case 378: goto L_0x009f;
                case 401: goto L_0x0089;
                case 406: goto L_0x0074;
                case 432: goto L_0x005f;
                case 442: goto L_0x004a;
                case 591: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0046
            java.lang.Class<o.canonicalize> r4 = p040o.canonicalize.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.canonicalize r4 = (p040o.canonicalize) r4
            r0.f2554x50fd9e4a = r4
            goto L_0x0019
        L_0x0046:
            r0.f2554x50fd9e4a = r2
            goto L_0x01a0
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x005b:
            r0.MediaDescriptionCompat = r2
            goto L_0x01a0
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.write = r4
            goto L_0x0019
        L_0x0070:
            r0.write = r2
            goto L_0x01a0
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<o.addPoints> r4 = p040o.addPoints.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.addPoints r4 = (p040o.addPoints) r4
            r0.read = r4
            goto L_0x0019
        L_0x0085:
            r0.read = r2
            goto L_0x01a0
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x009b:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x01a0
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$QueueItem = r4
            goto L_0x0019
        L_0x00b1:
            r0.MediaSessionCompat$QueueItem = r2
            goto L_0x01a0
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x00c7:
            r0.IconCompatParcelizer = r2
            goto L_0x01a0
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x00dd:
            r0.MediaBrowserCompat$MediaItem = r2
            goto L_0x01a0
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.AlertController$RecycleListView = r4
            goto L_0x0019
        L_0x00f3:
            r0.AlertController$RecycleListView = r2
            goto L_0x01a0
        L_0x00f7:
            if (r5 == 0) goto L_0x0109
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x0109:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x01a0
        L_0x010d:
            if (r5 == 0) goto L_0x011f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$Token = r4
            goto L_0x0019
        L_0x011f:
            r0.MediaSessionCompat$Token = r2
            goto L_0x01a0
        L_0x0123:
            if (r5 == 0) goto L_0x0135
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.ParcelableVolumeInfo = r4
            goto L_0x0019
        L_0x0135:
            r0.ParcelableVolumeInfo = r2
            goto L_0x01a0
        L_0x0138:
            if (r5 == 0) goto L_0x014a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x014a:
            r0.RatingCompat = r2
            goto L_0x01a0
        L_0x014d:
            if (r5 == 0) goto L_0x015f
            java.lang.Class<o.createResultAndNotify> r4 = p040o.createResultAndNotify.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.createResultAndNotify r4 = (p040o.createResultAndNotify) r4
            r0.setHasDecor = r4
            goto L_0x0019
        L_0x015f:
            r0.setHasDecor = r2
            goto L_0x01a0
        L_0x0162:
            if (r5 == 0) goto L_0x0174
            java.lang.Class<o.createResultAndNotify> r4 = p040o.createResultAndNotify.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.createResultAndNotify r4 = (p040o.createResultAndNotify) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x0174:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x01a0
        L_0x0177:
            if (r5 == 0) goto L_0x0189
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x0189:
            r0.MediaMetadataCompat = r2
            goto L_0x01a0
        L_0x018c:
            if (r5 == 0) goto L_0x019e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x019e:
            r0.MediaBrowserCompat$ItemReceiver = r2
        L_0x01a0:
            r8.nextNull()
            goto L_0x0019
        L_0x01a5:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getMethod.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
