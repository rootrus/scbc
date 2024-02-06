package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.lambda$showInAppDownloaded$0$BaseActivity */
public final class lambda$showInAppDownloaded$0$BaseActivity extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public lambda$showInAppDownloaded$0$BaseActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TrackingPointData trackingPointData = (TrackingPointData) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (trackingPointData != trackingPointData.createdDate) {
            validatedagrecurse.read(jsonWriter, 375);
            String str = trackingPointData.createdDate;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (trackingPointData != trackingPointData.dataAdapterAttributeId) {
            validatedagrecurse.read(jsonWriter, 540);
            String str2 = trackingPointData.dataAdapterAttributeId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (trackingPointData != trackingPointData.dataAdapterAttributeName) {
            validatedagrecurse.read(jsonWriter, 390);
            String str3 = trackingPointData.dataAdapterAttributeName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(trackingPointData.enabled);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (trackingPointData != trackingPointData.eventTypeId) {
            validatedagrecurse.read(jsonWriter, 490);
            String str4 = trackingPointData.eventTypeId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (trackingPointData != trackingPointData.eventTypeName) {
            validatedagrecurse.read(jsonWriter, 39);
            String str5 = trackingPointData.eventTypeName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        validatedagrecurse.read(jsonWriter, 282);
        Class cls2 = Boolean.TYPE;
        Boolean valueOf2 = Boolean.valueOf(trackingPointData.goalCompletion);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (trackingPointData != trackingPointData.f3116id) {
            validatedagrecurse.read(jsonWriter, 438);
            String str6 = trackingPointData.f3116id;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (trackingPointData != trackingPointData.interactionId) {
            validatedagrecurse.read(jsonWriter, 70);
            String str7 = trackingPointData.interactionId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (trackingPointData != trackingPointData.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str8 = trackingPointData.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (trackingPointData != trackingPointData.path) {
            validatedagrecurse.read(jsonWriter, 232);
            String str9 = trackingPointData.path;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (trackingPointData != trackingPointData.propositionId) {
            validatedagrecurse.read(jsonWriter, 522);
            String str10 = trackingPointData.propositionId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (trackingPointData != trackingPointData.propositionName) {
            validatedagrecurse.read(jsonWriter, 288);
            String str11 = trackingPointData.propositionName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        if (trackingPointData != trackingPointData.trackingPointType) {
            validatedagrecurse.read(jsonWriter, 572);
            String str12 = trackingPointData.trackingPointType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015f, code lost:
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
            com.thunderhead.android.infrastructure.server.entitys.TrackingPointData r0 = new com.thunderhead.android.infrastructure.server.entitys.TrackingPointData
            r0.<init>()
            com.google.gson.Gson r1 = r7.read
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0164
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
                case 39: goto L_0x014b;
                case 53: goto L_0x0136;
                case 96: goto L_0x0121;
                case 142: goto L_0x010c;
                case 154: goto L_0x00f7;
                case 234: goto L_0x00e1;
                case 272: goto L_0x00cb;
                case 317: goto L_0x00b5;
                case 337: goto L_0x009f;
                case 380: goto L_0x0089;
                case 393: goto L_0x0074;
                case 486: goto L_0x005f;
                case 570: goto L_0x004a;
                case 611: goto L_0x0035;
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
            r0.eventTypeName = r4
            goto L_0x0019
        L_0x0046:
            r0.eventTypeName = r2
            goto L_0x015f
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.dataAdapterAttributeName = r4
            goto L_0x0019
        L_0x005b:
            r0.dataAdapterAttributeName = r2
            goto L_0x015f
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.path = r4
            goto L_0x0019
        L_0x0070:
            r0.path = r2
            goto L_0x015f
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.propositionName = r4
            goto L_0x0019
        L_0x0085:
            r0.propositionName = r2
            goto L_0x015f
        L_0x0089:
            if (r5 == 0) goto L_0x015f
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.enabled = r4
            goto L_0x0019
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.eventTypeId = r4
            goto L_0x0019
        L_0x00b1:
            r0.eventTypeId = r2
            goto L_0x015f
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.name = r4
            goto L_0x0019
        L_0x00c7:
            r0.name = r2
            goto L_0x015f
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.createdDate = r4
            goto L_0x0019
        L_0x00dd:
            r0.createdDate = r2
            goto L_0x015f
        L_0x00e1:
            if (r5 == 0) goto L_0x015f
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.goalCompletion = r4
            goto L_0x0019
        L_0x00f7:
            if (r5 == 0) goto L_0x0109
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.interactionId = r4
            goto L_0x0019
        L_0x0109:
            r0.interactionId = r2
            goto L_0x015f
        L_0x010c:
            if (r5 == 0) goto L_0x011e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f3116id = r4
            goto L_0x0019
        L_0x011e:
            r0.f3116id = r2
            goto L_0x015f
        L_0x0121:
            if (r5 == 0) goto L_0x0133
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.trackingPointType = r4
            goto L_0x0019
        L_0x0133:
            r0.trackingPointType = r2
            goto L_0x015f
        L_0x0136:
            if (r5 == 0) goto L_0x0148
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.propositionId = r4
            goto L_0x0019
        L_0x0148:
            r0.propositionId = r2
            goto L_0x015f
        L_0x014b:
            if (r5 == 0) goto L_0x015d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.dataAdapterAttributeId = r4
            goto L_0x0019
        L_0x015d:
            r0.dataAdapterAttributeId = r2
        L_0x015f:
            r8.nextNull()
            goto L_0x0019
        L_0x0164:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.lambda$showInAppDownloaded$0$BaseActivity.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
