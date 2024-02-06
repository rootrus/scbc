package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration;
import com.thunderhead.android.infrastructure.server.entitys.InteractionData;
import com.thunderhead.android.infrastructure.server.entitys.Optimizations;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.NsipPartnerPaymentConfirmCase$NsipConfirmException */
public final class NsipPartnerPaymentConfirmCase$NsipConfirmException extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle read;

    public NsipPartnerPaymentConfirmCase$NsipConfirmException(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        InteractionData interactionData = (InteractionData) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (interactionData != interactionData.capturePoints) {
            validatedagrecurse.read(jsonWriter, 420);
            Captures[] capturesArr = interactionData.capturePoints;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Captures[].class, (Object) capturesArr).write(jsonWriter, capturesArr);
        }
        if (interactionData != interactionData.customerKeyConfiguration) {
            validatedagrecurse.read(jsonWriter, 481);
            CustomerKeyConfiguration customerKeyConfiguration = interactionData.customerKeyConfiguration;
            findNode.MediaBrowserCompat$ItemReceiver(gson, CustomerKeyConfiguration.class, (Object) customerKeyConfiguration).write(jsonWriter, customerKeyConfiguration);
        }
        if (interactionData != interactionData.eventTypeId) {
            validatedagrecurse.read(jsonWriter, 490);
            String str = interactionData.eventTypeId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (interactionData != interactionData.eventTypeName) {
            validatedagrecurse.read(jsonWriter, 39);
            String str2 = interactionData.eventTypeName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (interactionData != interactionData.f3111id) {
            validatedagrecurse.read(jsonWriter, 438);
            String str3 = interactionData.f3111id;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        validatedagrecurse.read(jsonWriter, 340);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(interactionData.injectionEnabled);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (interactionData != interactionData.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str4 = interactionData.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (interactionData != interactionData.optimizationPoints) {
            validatedagrecurse.read(jsonWriter, 592);
            Optimizations[] optimizationsArr = interactionData.optimizationPoints;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Optimizations[].class, (Object) optimizationsArr).write(jsonWriter, optimizationsArr);
        }
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(interactionData.optimizationPointsCount);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (interactionData != interactionData.path) {
            validatedagrecurse.read(jsonWriter, 232);
            String str5 = interactionData.path;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        validatedagrecurse.read(jsonWriter, 506);
        Class cls3 = Boolean.TYPE;
        Boolean valueOf3 = Boolean.valueOf(interactionData.propositionCompleted);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        if (interactionData != interactionData.propositionId) {
            validatedagrecurse.read(jsonWriter, 522);
            String str6 = interactionData.propositionId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (interactionData != interactionData.propositionName) {
            validatedagrecurse.read(jsonWriter, 288);
            String str7 = interactionData.propositionName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (interactionData != interactionData.pullActionPoints) {
            validatedagrecurse.read(jsonWriter, 16);
            Object[] objArr = interactionData.pullActionPoints;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Object[].class, (Object) objArr).write(jsonWriter, objArr);
        }
        if (interactionData != interactionData.pushActionPoints) {
            validatedagrecurse.read(jsonWriter, 601);
            Object[] objArr2 = interactionData.pushActionPoints;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Object[].class, (Object) objArr2).write(jsonWriter, objArr2);
        }
        if (interactionData != interactionData.touchpointId) {
            validatedagrecurse.read(jsonWriter, 256);
            String str8 = interactionData.touchpointId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        validatedagrecurse.read(jsonWriter, 436);
        Class cls4 = Boolean.TYPE;
        Boolean valueOf4 = Boolean.valueOf(interactionData.trackingEnabled);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls4, (Object) valueOf4).write(jsonWriter, valueOf4);
        if (interactionData != interactionData.trackingPoints) {
            validatedagrecurse.read(jsonWriter, 213);
            TrackingPointData[] trackingPointDataArr = interactionData.trackingPoints;
            findNode.MediaBrowserCompat$ItemReceiver(gson, TrackingPointData[].class, (Object) trackingPointDataArr).write(jsonWriter, trackingPointDataArr);
        }
        validatedagrecurse.read(jsonWriter, 198);
        Class cls5 = Integer.TYPE;
        Integer valueOf5 = Integer.valueOf(interactionData.trackingPointsCount);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls5, (Object) valueOf5).write(jsonWriter, valueOf5);
        validatedagrecurse.read(jsonWriter, 135);
        Class cls6 = Boolean.TYPE;
        Boolean valueOf6 = Boolean.valueOf(interactionData.verifiedIfVisited);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls6, (Object) valueOf6).write(jsonWriter, valueOf6);
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e5, code lost:
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
            com.thunderhead.android.infrastructure.server.entitys.InteractionData r0 = new com.thunderhead.android.infrastructure.server.entitys.InteractionData
            r0.<init>()
            com.google.gson.Gson r1 = r7.IconCompatParcelizer
            o.validateCycle r3 = r7.read
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x01ea
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
                case 25: goto L_0x01cf;
                case 53: goto L_0x01ba;
                case 76: goto L_0x01a5;
                case 139: goto L_0x0190;
                case 142: goto L_0x017b;
                case 144: goto L_0x0165;
                case 156: goto L_0x014f;
                case 164: goto L_0x0139;
                case 197: goto L_0x0123;
                case 302: goto L_0x010d;
                case 317: goto L_0x00f7;
                case 337: goto L_0x00e1;
                case 355: goto L_0x00cb;
                case 393: goto L_0x00b5;
                case 396: goto L_0x009f;
                case 429: goto L_0x0089;
                case 452: goto L_0x0074;
                case 486: goto L_0x005f;
                case 604: goto L_0x004a;
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
            goto L_0x01e5
        L_0x004a:
            if (r5 == 0) goto L_0x01e5
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.injectionEnabled = r4
            goto L_0x0019
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
            goto L_0x01e5
        L_0x0074:
            if (r5 == 0) goto L_0x01e5
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.trackingEnabled = r4
            goto L_0x0019
        L_0x0089:
            if (r5 == 0) goto L_0x01e5
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.trackingPointsCount = r4
            goto L_0x0019
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Captures[]> r4 = com.thunderhead.android.infrastructure.server.entitys.Captures[].class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.thunderhead.android.infrastructure.server.entitys.Captures[] r4 = (com.thunderhead.android.infrastructure.server.entitys.Captures[]) r4
            r0.capturePoints = r4
            goto L_0x0019
        L_0x00b1:
            r0.capturePoints = r2
            goto L_0x01e5
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.propositionName = r4
            goto L_0x0019
        L_0x00c7:
            r0.propositionName = r2
            goto L_0x01e5
        L_0x00cb:
            if (r5 == 0) goto L_0x01e5
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.propositionCompleted = r4
            goto L_0x0019
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.eventTypeId = r4
            goto L_0x0019
        L_0x00f3:
            r0.eventTypeId = r2
            goto L_0x01e5
        L_0x00f7:
            if (r5 == 0) goto L_0x0109
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.name = r4
            goto L_0x0019
        L_0x0109:
            r0.name = r2
            goto L_0x01e5
        L_0x010d:
            if (r5 == 0) goto L_0x011f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.touchpointId = r4
            goto L_0x0019
        L_0x011f:
            r0.touchpointId = r2
            goto L_0x01e5
        L_0x0123:
            if (r5 == 0) goto L_0x0135
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0.pushActionPoints = r4
            goto L_0x0019
        L_0x0135:
            r0.pushActionPoints = r2
            goto L_0x01e5
        L_0x0139:
            if (r5 == 0) goto L_0x014b
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0.pullActionPoints = r4
            goto L_0x0019
        L_0x014b:
            r0.pullActionPoints = r2
            goto L_0x01e5
        L_0x014f:
            if (r5 == 0) goto L_0x0161
            java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.TrackingPointData[]> r4 = com.thunderhead.android.infrastructure.server.entitys.TrackingPointData[].class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.thunderhead.android.infrastructure.server.entitys.TrackingPointData[] r4 = (com.thunderhead.android.infrastructure.server.entitys.TrackingPointData[]) r4
            r0.trackingPoints = r4
            goto L_0x0019
        L_0x0161:
            r0.trackingPoints = r2
            goto L_0x01e5
        L_0x0165:
            if (r5 == 0) goto L_0x01e5
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.verifiedIfVisited = r4
            goto L_0x0019
        L_0x017b:
            if (r5 == 0) goto L_0x018d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f3111id = r4
            goto L_0x0019
        L_0x018d:
            r0.f3111id = r2
            goto L_0x01e5
        L_0x0190:
            if (r5 == 0) goto L_0x01a2
            java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration> r4 = com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration r4 = (com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration) r4
            r0.customerKeyConfiguration = r4
            goto L_0x0019
        L_0x01a2:
            r0.customerKeyConfiguration = r2
            goto L_0x01e5
        L_0x01a5:
            if (r5 == 0) goto L_0x01b7
            java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Optimizations[]> r4 = com.thunderhead.android.infrastructure.server.entitys.Optimizations[].class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.thunderhead.android.infrastructure.server.entitys.Optimizations[] r4 = (com.thunderhead.android.infrastructure.server.entitys.Optimizations[]) r4
            r0.optimizationPoints = r4
            goto L_0x0019
        L_0x01b7:
            r0.optimizationPoints = r2
            goto L_0x01e5
        L_0x01ba:
            if (r5 == 0) goto L_0x01cc
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.propositionId = r4
            goto L_0x0019
        L_0x01cc:
            r0.propositionId = r2
            goto L_0x01e5
        L_0x01cf:
            if (r5 == 0) goto L_0x01e5
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.optimizationPointsCount = r4
            goto L_0x0019
        L_0x01e5:
            r8.nextNull()
            goto L_0x0019
        L_0x01ea:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.NsipPartnerPaymentConfirmCase$NsipConfirmException.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
