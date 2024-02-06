package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.EnterVerificationCodeUseCase$EmailMeVerificationCodeNeededException */
public final class C6463xf6ca510b extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public C6463xf6ca510b(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AttributeData attributeData = (AttributeData) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (attributeData != attributeData.absoluteName) {
            validatedagrecurse.read(jsonWriter, 546);
            String str = attributeData.absoluteName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (attributeData != attributeData.alias) {
            validatedagrecurse.read(jsonWriter, 361);
            String str2 = attributeData.alias;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (attributeData != attributeData.attributes) {
            validatedagrecurse.read(jsonWriter, 12);
            AttributeData[] attributeDataArr = attributeData.attributes;
            findNode.MediaBrowserCompat$ItemReceiver(gson, AttributeData[].class, (Object) attributeDataArr).write(jsonWriter, attributeDataArr);
        }
        if (attributeData != attributeData.dataType) {
            validatedagrecurse.read(jsonWriter, 463);
            String str3 = attributeData.dataType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (attributeData != attributeData.defaultValue) {
            validatedagrecurse.read(jsonWriter, 612);
            String str4 = attributeData.defaultValue;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (attributeData != attributeData.description) {
            validatedagrecurse.read(jsonWriter, 421);
            String str5 = attributeData.description;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        validatedagrecurse.read(jsonWriter, 476);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(attributeData.dynamic);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        Class cls2 = Boolean.TYPE;
        Boolean valueOf2 = Boolean.valueOf(attributeData.enabled);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (attributeData != attributeData.f3107id) {
            validatedagrecurse.read(jsonWriter, 438);
            String str6 = attributeData.f3107id;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (attributeData != attributeData.index) {
            validatedagrecurse.read(jsonWriter, 85);
            String str7 = attributeData.index;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (attributeData != attributeData.keyApiName) {
            validatedagrecurse.read(jsonWriter, 370);
            String str8 = attributeData.keyApiName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (attributeData != attributeData.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str9 = attributeData.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (attributeData != attributeData.possibleValues) {
            validatedagrecurse.read(jsonWriter, 447);
            String str10 = attributeData.possibleValues;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (attributeData != attributeData.template) {
            validatedagrecurse.read(jsonWriter, 473);
            String str11 = attributeData.template;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        if (attributeData != attributeData.type) {
            validatedagrecurse.read(jsonWriter, 489);
            String str12 = attributeData.type;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0175, code lost:
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
            com.thunderhead.android.infrastructure.server.entitys.AttributeData r0 = new com.thunderhead.android.infrastructure.server.entitys.AttributeData
            r0.<init>()
            com.google.gson.Gson r1 = r7.write
            o.validateCycle r3 = r7.MediaBrowserCompat$ItemReceiver
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x017a
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
                case 28: goto L_0x0161;
                case 38: goto L_0x014b;
                case 59: goto L_0x0136;
                case 107: goto L_0x0121;
                case 142: goto L_0x010c;
                case 202: goto L_0x00f7;
                case 295: goto L_0x00e1;
                case 317: goto L_0x00cb;
                case 326: goto L_0x00b5;
                case 380: goto L_0x009f;
                case 467: goto L_0x0089;
                case 477: goto L_0x0074;
                case 478: goto L_0x005f;
                case 569: goto L_0x004a;
                case 581: goto L_0x0035;
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
            r0.defaultValue = r4
            goto L_0x0019
        L_0x0046:
            r0.defaultValue = r2
            goto L_0x0175
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.possibleValues = r4
            goto L_0x0019
        L_0x005b:
            r0.possibleValues = r2
            goto L_0x0175
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.dataType = r4
            goto L_0x0019
        L_0x0070:
            r0.dataType = r2
            goto L_0x0175
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.type = r4
            goto L_0x0019
        L_0x0085:
            r0.type = r2
            goto L_0x0175
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.template = r4
            goto L_0x0019
        L_0x009b:
            r0.template = r2
            goto L_0x0175
        L_0x009f:
            if (r5 == 0) goto L_0x0175
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.enabled = r4
            goto L_0x0019
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.description = r4
            goto L_0x0019
        L_0x00c7:
            r0.description = r2
            goto L_0x0175
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.name = r4
            goto L_0x0019
        L_0x00dd:
            r0.name = r2
            goto L_0x0175
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.keyApiName = r4
            goto L_0x0019
        L_0x00f3:
            r0.keyApiName = r2
            goto L_0x0175
        L_0x00f7:
            if (r5 == 0) goto L_0x0109
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.index = r4
            goto L_0x0019
        L_0x0109:
            r0.index = r2
            goto L_0x0175
        L_0x010c:
            if (r5 == 0) goto L_0x011e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f3107id = r4
            goto L_0x0019
        L_0x011e:
            r0.f3107id = r2
            goto L_0x0175
        L_0x0121:
            if (r5 == 0) goto L_0x0133
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.absoluteName = r4
            goto L_0x0019
        L_0x0133:
            r0.absoluteName = r2
            goto L_0x0175
        L_0x0136:
            if (r5 == 0) goto L_0x0148
            java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.AttributeData[]> r4 = com.thunderhead.android.infrastructure.server.entitys.AttributeData[].class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            com.thunderhead.android.infrastructure.server.entitys.AttributeData[] r4 = (com.thunderhead.android.infrastructure.server.entitys.AttributeData[]) r4
            r0.attributes = r4
            goto L_0x0019
        L_0x0148:
            r0.attributes = r2
            goto L_0x0175
        L_0x014b:
            if (r5 == 0) goto L_0x0175
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.dynamic = r4
            goto L_0x0019
        L_0x0161:
            if (r5 == 0) goto L_0x0173
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.alias = r4
            goto L_0x0019
        L_0x0173:
            r0.alias = r2
        L_0x0175:
            r8.nextNull()
            goto L_0x0019
        L_0x017a:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6463xf6ca510b.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
