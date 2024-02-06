package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.PresenterModule */
public final class PresenterModule extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle write;

    public PresenterModule(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (deviceInfo != deviceInfo.appName) {
            validatedagrecurse.read(jsonWriter, 342);
            String str = deviceInfo.appName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (deviceInfo != deviceInfo.appVer) {
            validatedagrecurse.read(jsonWriter, 115);
            String str2 = deviceInfo.appVer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (deviceInfo != deviceInfo.devMfr) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256);
            String str3 = deviceInfo.devMfr;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (deviceInfo != deviceInfo.devModel) {
            validatedagrecurse.read(jsonWriter, 114);
            String str4 = deviceInfo.devModel;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (deviceInfo != deviceInfo.devType) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
            String str5 = deviceInfo.devType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (deviceInfo != deviceInfo.ipAddress) {
            validatedagrecurse.read(jsonWriter, 616);
            String str6 = deviceInfo.ipAddress;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (deviceInfo != deviceInfo.locHorzAccuracy) {
            validatedagrecurse.read(jsonWriter, 528);
            Double d = deviceInfo.locHorzAccuracy;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d).write(jsonWriter, d);
        }
        if (deviceInfo != deviceInfo.locLastUpdated) {
            validatedagrecurse.read(jsonWriter, 477);
            Long l = deviceInfo.locLastUpdated;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Long.class, (Object) l).write(jsonWriter, l);
        }
        if (deviceInfo != deviceInfo.locLatitude) {
            validatedagrecurse.read(jsonWriter, 133);
            Double d2 = deviceInfo.locLatitude;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d2).write(jsonWriter, d2);
        }
        if (deviceInfo != deviceInfo.locLongitude) {
            validatedagrecurse.read(jsonWriter, 510);
            Double d3 = deviceInfo.locLongitude;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d3).write(jsonWriter, d3);
        }
        if (deviceInfo != deviceInfo.locale) {
            validatedagrecurse.read(jsonWriter, 206);
            String str7 = deviceInfo.locale;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (deviceInfo != deviceInfo.osName) {
            validatedagrecurse.read(jsonWriter, 589);
            String str8 = deviceInfo.osName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (deviceInfo != deviceInfo.osVer) {
            validatedagrecurse.read(jsonWriter, 583);
            String str9 = deviceInfo.osVer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (deviceInfo != deviceInfo.pushToken) {
            validatedagrecurse.read(jsonWriter, 77);
            String str10 = deviceInfo.pushToken;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015e, code lost:
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
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r0 = new com.thunderhead.android.infrastructure.server.entitys.DeviceInfo
            r0.<init>()
            com.google.gson.Gson r1 = r7.IconCompatParcelizer
            o.validateCycle r3 = r7.write
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0163
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
                case 86: goto L_0x014a;
                case 195: goto L_0x0135;
                case 199: goto L_0x0120;
                case 204: goto L_0x010b;
                case 233: goto L_0x00f6;
                case 289: goto L_0x00e1;
                case 338: goto L_0x00cb;
                case 453: goto L_0x00b5;
                case 499: goto L_0x009f;
                case 553: goto L_0x0089;
                case 558: goto L_0x0074;
                case 575: goto L_0x005f;
                case 585: goto L_0x004a;
                case 599: goto L_0x0035;
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
            r0.ipAddress = r4
            goto L_0x0019
        L_0x0046:
            r0.ipAddress = r2
            goto L_0x015e
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Double r4 = (java.lang.Double) r4
            r0.locHorzAccuracy = r4
            goto L_0x0019
        L_0x005b:
            r0.locHorzAccuracy = r2
            goto L_0x015e
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.devType = r4
            goto L_0x0019
        L_0x0070:
            r0.devType = r2
            goto L_0x015e
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.appVer = r4
            goto L_0x0019
        L_0x0085:
            r0.appVer = r2
            goto L_0x015e
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.osVer = r4
            goto L_0x0019
        L_0x009b:
            r0.osVer = r2
            goto L_0x015e
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.devMfr = r4
            goto L_0x0019
        L_0x00b1:
            r0.devMfr = r2
            goto L_0x015e
        L_0x00b5:
            if (r5 == 0) goto L_0x00c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.devModel = r4
            goto L_0x0019
        L_0x00c7:
            r0.devModel = r2
            goto L_0x015e
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            r0.locLastUpdated = r4
            goto L_0x0019
        L_0x00dd:
            r0.locLastUpdated = r2
            goto L_0x015e
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.osName = r4
            goto L_0x0019
        L_0x00f3:
            r0.osName = r2
            goto L_0x015e
        L_0x00f6:
            if (r5 == 0) goto L_0x0108
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.appName = r4
            goto L_0x0019
        L_0x0108:
            r0.appName = r2
            goto L_0x015e
        L_0x010b:
            if (r5 == 0) goto L_0x011d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.pushToken = r4
            goto L_0x0019
        L_0x011d:
            r0.pushToken = r2
            goto L_0x015e
        L_0x0120:
            if (r5 == 0) goto L_0x0132
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.locale = r4
            goto L_0x0019
        L_0x0132:
            r0.locale = r2
            goto L_0x015e
        L_0x0135:
            if (r5 == 0) goto L_0x0147
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Double r4 = (java.lang.Double) r4
            r0.locLatitude = r4
            goto L_0x0019
        L_0x0147:
            r0.locLatitude = r2
            goto L_0x015e
        L_0x014a:
            if (r5 == 0) goto L_0x015c
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Double r4 = (java.lang.Double) r4
            r0.locLongitude = r4
            goto L_0x0019
        L_0x015c:
            r0.locLongitude = r2
        L_0x015e:
            r8.nextNull()
            goto L_0x0019
        L_0x0163:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PresenterModule.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
