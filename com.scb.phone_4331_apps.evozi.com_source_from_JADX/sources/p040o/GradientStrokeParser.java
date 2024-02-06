package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.AdvertisingIdClient;
import p040o.C1251R;

/* renamed from: o.GradientStrokeParser */
public final class GradientStrokeParser extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public GradientStrokeParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        setEndFrames setendframes = (setEndFrames) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (setendframes != setendframes.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 307);
            C1251R.color color = setendframes.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, C1251R.color.class, (Object) color).write(jsonWriter, color);
        }
        if (setendframes != setendframes.write) {
            validatedagrecurse.read(jsonWriter, 487);
            AdvertisingIdClient.Info info = setendframes.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, AdvertisingIdClient.Info.class, (Object) info).write(jsonWriter, info);
        }
        if (setendframes != setendframes.read) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256);
            String str = setendframes.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (setendframes != setendframes.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 444);
            String str2 = setendframes.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (setendframes != setendframes.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 378);
            String str3 = setendframes.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (setendframes != setendframes.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 209);
            GlideException glideException = setendframes.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, GlideException.class, (Object) glideException).write(jsonWriter, glideException);
        }
        if (setendframes != setendframes.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 291);
            String str4 = setendframes.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (setendframes != setendframes.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 550);
            parseScale parsescale = setendframes.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, parseScale.class, (Object) parsescale).write(jsonWriter, parsescale);
        }
        if (setendframes != setendframes.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 188);
            String str5 = setendframes.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (setendframes != setendframes.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 451);
            GlideException glideException2 = setendframes.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, GlideException.class, (Object) glideException2).write(jsonWriter, glideException2);
        }
        if (setendframes != setendframes.MediaSessionCompat$QueueItem) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
            String str6 = setendframes.MediaSessionCompat$QueueItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (setendframes != setendframes.MediaSessionCompat$Token) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384);
            String str7 = setendframes.MediaSessionCompat$Token;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
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
            o.setEndFrames r0 = new o.setEndFrames
            r0.<init>()
            com.google.gson.Gson r1 = r7.read
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0137
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
                case 14: goto L_0x011e;
                case 34: goto L_0x0109;
                case 52: goto L_0x00f4;
                case 56: goto L_0x00df;
                case 212: goto L_0x00ca;
                case 301: goto L_0x00b5;
                case 365: goto L_0x009f;
                case 481: goto L_0x0089;
                case 484: goto L_0x0074;
                case 533: goto L_0x005f;
                case 547: goto L_0x004a;
                case 572: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0046
            java.lang.Class<o.AdvertisingIdClient$Info> r4 = p040o.AdvertisingIdClient.Info.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.AdvertisingIdClient$Info r4 = (p040o.AdvertisingIdClient.Info) r4
            r0.write = r4
            goto L_0x0019
        L_0x0046:
            r0.write = r2
            goto L_0x0132
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x005b:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x0132
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
            goto L_0x0132
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<o.GlideException> r4 = p040o.GlideException.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.GlideException r4 = (p040o.GlideException) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x0085:
            r0.MediaDescriptionCompat = r2
            goto L_0x0132
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$Token = r4
            goto L_0x0019
        L_0x009b:
            r0.MediaSessionCompat$Token = r2
            goto L_0x0132
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.read = r4
            goto L_0x0019
        L_0x00b1:
            r0.read = r2
            goto L_0x0132
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x00c7:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x0132
        L_0x00ca:
            if (r5 == 0) goto L_0x00dc
            java.lang.Class<o.GlideException> r4 = p040o.GlideException.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.GlideException r4 = (p040o.GlideException) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x00dc:
            r0.RatingCompat = r2
            goto L_0x0132
        L_0x00df:
            if (r5 == 0) goto L_0x00f1
            java.lang.Class<o.R$color> r4 = p040o.C1251R.color.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.R$color r4 = (p040o.C1251R.color) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x00f1:
            r0.IconCompatParcelizer = r2
            goto L_0x0132
        L_0x00f4:
            if (r5 == 0) goto L_0x0106
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x0106:
            r0.MediaMetadataCompat = r2
            goto L_0x0132
        L_0x0109:
            if (r5 == 0) goto L_0x011b
            java.lang.Class<o.parseScale> r4 = p040o.parseScale.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.parseScale r4 = (p040o.parseScale) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x011b:
            r0.MediaBrowserCompat$MediaItem = r2
            goto L_0x0132
        L_0x011e:
            if (r5 == 0) goto L_0x0130
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x0130:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
        L_0x0132:
            r8.nextNull()
            goto L_0x0019
        L_0x0137:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.GradientStrokeParser.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
