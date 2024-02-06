package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.JsonUtils;

/* renamed from: o.addOpacityStopsToGradientIfNeeded */
public final class addOpacityStopsToGradientIfNeeded extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public addOpacityStopsToGradientIfNeeded(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getInterpolator getinterpolator = (getInterpolator) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (getinterpolator != getinterpolator.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 289);
            String str = getinterpolator.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (getinterpolator != getinterpolator.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 605);
            JsonUtils.C35591 r2 = new TypeToken<List<getLayers>>() {
            };
            List<getLayers> list = getinterpolator.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) r2, (Object) list).write(jsonWriter, list);
        }
        if (getinterpolator != getinterpolator.read) {
            validatedagrecurse.read(jsonWriter, 92);
            String str2 = getinterpolator.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (getinterpolator != getinterpolator.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 220);
            String str3 = getinterpolator.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (getinterpolator != getinterpolator.write) {
            validatedagrecurse.read(jsonWriter, 449);
            Integer num = getinterpolator.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num).write(jsonWriter, num);
        }
        if (getinterpolator != getinterpolator.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 344);
            Integer num2 = getinterpolator.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num2).write(jsonWriter, num2);
        }
        if (getinterpolator != getinterpolator.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 238);
            String str4 = getinterpolator.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (getinterpolator != getinterpolator.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 291);
            String str5 = getinterpolator.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (getinterpolator != getinterpolator.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 299);
            jsonToPoints jsontopoints = new jsonToPoints();
            List<jsonObjectToPoint> list2 = getinterpolator.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) jsontopoints, (Object) list2).write(jsonWriter, list2);
        }
        if (getinterpolator != getinterpolator.RatingCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
            String str6 = getinterpolator.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (getinterpolator != getinterpolator.ParcelableVolumeInfo) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384);
            String str7 = getinterpolator.ParcelableVolumeInfo;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0123, code lost:
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
            o.getInterpolator r0 = new o.getInterpolator
            r0.<init>()
            com.google.gson.Gson r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.validateCycle r3 = r7.MediaBrowserCompat$ItemReceiver
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0128
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
                case 152: goto L_0x010c;
                case 224: goto L_0x00f7;
                case 228: goto L_0x00e2;
                case 259: goto L_0x00cd;
                case 322: goto L_0x00b8;
                case 334: goto L_0x00a2;
                case 481: goto L_0x008c;
                case 491: goto L_0x0077;
                case 533: goto L_0x0062;
                case 547: goto L_0x004d;
                case 552: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            r8.skipValue()
            goto L_0x0019
        L_0x0035:
            if (r5 == 0) goto L_0x0049
            o.JsonUtils$1 r4 = new o.JsonUtils$1
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x0049:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x0123
        L_0x004d:
            if (r5 == 0) goto L_0x005e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x005e:
            r0.MediaMetadataCompat = r2
            goto L_0x0123
        L_0x0062:
            if (r5 == 0) goto L_0x0073
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x0073:
            r0.RatingCompat = r2
            goto L_0x0123
        L_0x0077:
            if (r5 == 0) goto L_0x0088
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x0088:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x0123
        L_0x008c:
            if (r5 == 0) goto L_0x009e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.ParcelableVolumeInfo = r4
            goto L_0x0019
        L_0x009e:
            r0.ParcelableVolumeInfo = r2
            goto L_0x0123
        L_0x00a2:
            if (r5 == 0) goto L_0x00b4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x00b4:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x0123
        L_0x00b8:
            if (r5 == 0) goto L_0x00ca
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x00ca:
            r0.IconCompatParcelizer = r2
            goto L_0x0123
        L_0x00cd:
            if (r5 == 0) goto L_0x00df
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0.write = r4
            goto L_0x0019
        L_0x00df:
            r0.write = r2
            goto L_0x0123
        L_0x00e2:
            if (r5 == 0) goto L_0x00f4
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x00f4:
            r0.MediaDescriptionCompat = r2
            goto L_0x0123
        L_0x00f7:
            if (r5 == 0) goto L_0x0109
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.read = r4
            goto L_0x0019
        L_0x0109:
            r0.read = r2
            goto L_0x0123
        L_0x010c:
            if (r5 == 0) goto L_0x0121
            o.jsonToPoints r4 = new o.jsonToPoints
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x0121:
            r0.MediaBrowserCompat$MediaItem = r2
        L_0x0123:
            r8.nextNull()
            goto L_0x0019
        L_0x0128:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.addOpacityStopsToGradientIfNeeded.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
