package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import java.io.IOException;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.ETBCheckIdentityCase$ErrorCode3013Exception */
public final class ETBCheckIdentityCase$ErrorCode3013Exception extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse read;

    public ETBCheckIdentityCase$ErrorCode3013Exception(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Captures captures = (Captures) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (captures != captures.attribute) {
            validatedagrecurse.read(jsonWriter, 573);
            String str = captures.attribute;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(captures.captureDelay);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (captures != captures.capturePhase) {
            validatedagrecurse.read(jsonWriter, 294);
            String str2 = captures.capturePhase;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (captures != captures.captureType) {
            validatedagrecurse.read(jsonWriter, 606);
            String str3 = captures.captureType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (captures != captures.dataAdapterAttribute) {
            validatedagrecurse.read(jsonWriter, 381);
            AttributeData attributeData = captures.dataAdapterAttribute;
            findNode.MediaBrowserCompat$ItemReceiver(gson, AttributeData.class, (Object) attributeData).write(jsonWriter, attributeData);
        }
        if (captures != captures.dataAdapterAttributeId) {
            validatedagrecurse.read(jsonWriter, 540);
            String str4 = captures.dataAdapterAttributeId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (captures != captures.domainName) {
            validatedagrecurse.read(jsonWriter, 58);
            String str5 = captures.domainName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (captures != captures.elementName) {
            validatedagrecurse.read(jsonWriter, 48);
            String str6 = captures.elementName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (captures != captures.elementType) {
            validatedagrecurse.read(jsonWriter, 519);
            String str7 = captures.elementType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        Class cls2 = Boolean.TYPE;
        Boolean valueOf2 = Boolean.valueOf(captures.enabled);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (captures != captures.f3110id) {
            validatedagrecurse.read(jsonWriter, 438);
            String str8 = captures.f3110id;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (captures != captures.interactionId) {
            validatedagrecurse.read(jsonWriter, 70);
            String str9 = captures.interactionId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        validatedagrecurse.read(jsonWriter, 433);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(captures.isRepeating);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        if (captures != captures.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str10 = captures.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (captures != captures.pageRef) {
            validatedagrecurse.read(jsonWriter, 565);
            String str11 = captures.pageRef;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        if (captures != captures.path) {
            validatedagrecurse.read(jsonWriter, 232);
            String str12 = captures.path;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        if (captures != captures.pathPattern) {
            validatedagrecurse.read(jsonWriter, 493);
            Pattern pattern = captures.pathPattern;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Pattern.class, (Object) pattern).write(jsonWriter, pattern);
        }
        if (captures != captures.propositionId) {
            validatedagrecurse.read(jsonWriter, 522);
            String str13 = captures.propositionId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str13).write(jsonWriter, str13);
        }
        if (captures != captures.propositionRef) {
            validatedagrecurse.read(jsonWriter, 86);
            String str14 = captures.propositionRef;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str14).write(jsonWriter, str14);
        }
        if (captures != captures.typeName) {
            validatedagrecurse.read(jsonWriter, 83);
            String str15 = captures.typeName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str15).write(jsonWriter, str15);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e2, code lost:
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
            com.thunderhead.android.infrastructure.server.entitys.Captures r0 = new com.thunderhead.android.infrastructure.server.entitys.Captures
            r0.<init>()
            com.google.gson.Gson r1 = r7.IconCompatParcelizer
            o.validateCycle r3 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x01e7
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
                case 39: goto L_0x01ce;
                case 53: goto L_0x01b9;
                case 100: goto L_0x01a4;
                case 127: goto L_0x018f;
                case 142: goto L_0x017a;
                case 154: goto L_0x0165;
                case 158: goto L_0x014f;
                case 284: goto L_0x0139;
                case 317: goto L_0x0123;
                case 342: goto L_0x010d;
                case 348: goto L_0x00f7;
                case 360: goto L_0x00e1;
                case 380: goto L_0x00cb;
                case 423: goto L_0x00b5;
                case 466: goto L_0x009f;
                case 486: goto L_0x0089;
                case 564: goto L_0x0074;
                case 565: goto L_0x005f;
                case 589: goto L_0x004a;
                case 627: goto L_0x0035;
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
            r0.domainName = r4
            goto L_0x0019
        L_0x0046:
            r0.domainName = r2
            goto L_0x01e2
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.elementType = r4
            goto L_0x0019
        L_0x005b:
            r0.elementType = r2
            goto L_0x01e2
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.captureType = r4
            goto L_0x0019
        L_0x0070:
            r0.captureType = r2
            goto L_0x01e2
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.AttributeData> r4 = com.thunderhead.android.infrastructure.server.entitys.AttributeData.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.thunderhead.android.infrastructure.server.entitys.AttributeData r4 = (com.thunderhead.android.infrastructure.server.entitys.AttributeData) r4
            r0.dataAdapterAttribute = r4
            goto L_0x0019
        L_0x0085:
            r0.dataAdapterAttribute = r2
            goto L_0x01e2
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.path = r4
            goto L_0x0019
        L_0x009b:
            r0.path = r2
            goto L_0x01e2
        L_0x009f:
            if (r5 == 0) goto L_0x01e2
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.captureDelay = r4
            goto L_0x0019
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.elementName = r4
            goto L_0x0019
        L_0x00c7:
            r0.elementName = r2
            goto L_0x01e2
        L_0x00cb:
            if (r5 == 0) goto L_0x01e2
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.enabled = r4
            goto L_0x0019
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.capturePhase = r4
            goto L_0x0019
        L_0x00f3:
            r0.capturePhase = r2
            goto L_0x01e2
        L_0x00f7:
            if (r5 == 0) goto L_0x01e2
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.isRepeating = r4
            goto L_0x0019
        L_0x010d:
            if (r5 == 0) goto L_0x011f
            java.lang.Class<java.util.regex.Pattern> r4 = java.util.regex.Pattern.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4
            r0.pathPattern = r4
            goto L_0x0019
        L_0x011f:
            r0.pathPattern = r2
            goto L_0x01e2
        L_0x0123:
            if (r5 == 0) goto L_0x0135
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.name = r4
            goto L_0x0019
        L_0x0135:
            r0.name = r2
            goto L_0x01e2
        L_0x0139:
            if (r5 == 0) goto L_0x014b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.typeName = r4
            goto L_0x0019
        L_0x014b:
            r0.typeName = r2
            goto L_0x01e2
        L_0x014f:
            if (r5 == 0) goto L_0x0161
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.attribute = r4
            goto L_0x0019
        L_0x0161:
            r0.attribute = r2
            goto L_0x01e2
        L_0x0165:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.interactionId = r4
            goto L_0x0019
        L_0x0177:
            r0.interactionId = r2
            goto L_0x01e2
        L_0x017a:
            if (r5 == 0) goto L_0x018c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f3110id = r4
            goto L_0x0019
        L_0x018c:
            r0.f3110id = r2
            goto L_0x01e2
        L_0x018f:
            if (r5 == 0) goto L_0x01a1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.propositionRef = r4
            goto L_0x0019
        L_0x01a1:
            r0.propositionRef = r2
            goto L_0x01e2
        L_0x01a4:
            if (r5 == 0) goto L_0x01b6
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.pageRef = r4
            goto L_0x0019
        L_0x01b6:
            r0.pageRef = r2
            goto L_0x01e2
        L_0x01b9:
            if (r5 == 0) goto L_0x01cb
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.propositionId = r4
            goto L_0x0019
        L_0x01cb:
            r0.propositionId = r2
            goto L_0x01e2
        L_0x01ce:
            if (r5 == 0) goto L_0x01e0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.dataAdapterAttributeId = r4
            goto L_0x0019
        L_0x01e0:
            r0.dataAdapterAttributeId = r2
        L_0x01e2:
            r8.nextNull()
            goto L_0x0019
        L_0x01e7:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBCheckIdentityCase$ErrorCode3013Exception.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
