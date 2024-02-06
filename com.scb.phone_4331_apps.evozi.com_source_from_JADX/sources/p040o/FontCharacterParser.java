package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.FontCharacterParser */
public final class FontCharacterParser extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle read;
    private Gson write;

    public FontCharacterParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonObjectToPoint jsonobjecttopoint = (jsonObjectToPoint) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (jsonobjecttopoint != jsonobjecttopoint.write) {
            validatedagrecurse.read(jsonWriter, 55);
            String str = jsonobjecttopoint.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 315);
            getInterpolator getinterpolator = jsonobjecttopoint.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, getInterpolator.class, (Object) getinterpolator).write(jsonWriter, getinterpolator);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.read) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
            String str2 = jsonobjecttopoint.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 352);
            jsonNumbersToPoint jsonnumberstopoint = new jsonNumbersToPoint();
            List<isRotationIdentity> list = jsonobjecttopoint.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) jsonnumberstopoint, (Object) list).write(jsonWriter, list);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 357);
            String str3 = jsonobjecttopoint.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        validatedagrecurse.read(jsonWriter, 552);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(jsonobjecttopoint.MediaMetadataCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(jsonobjecttopoint.MediaBrowserCompat$MediaItem);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        validatedagrecurse.read(jsonWriter, 240);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(jsonobjecttopoint.MediaDescriptionCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        validatedagrecurse.read(jsonWriter, 336);
        Class cls4 = Integer.TYPE;
        Integer valueOf4 = Integer.valueOf(jsonobjecttopoint.RatingCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls4, (Object) valueOf4).write(jsonWriter, valueOf4);
        validatedagrecurse.read(jsonWriter, 91);
        Class cls5 = Integer.TYPE;
        Integer valueOf5 = Integer.valueOf(jsonobjecttopoint.MediaBrowserCompat$SearchResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls5, (Object) valueOf5).write(jsonWriter, valueOf5);
        if (jsonobjecttopoint != jsonobjecttopoint.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 286);
            String str4 = jsonobjecttopoint.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.ParcelableVolumeInfo) {
            validatedagrecurse.read(jsonWriter, 121);
            String str5 = jsonobjecttopoint.ParcelableVolumeInfo;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.f2881x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, 228);
            String str6 = jsonobjecttopoint.f2881x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
        Class cls6 = Integer.TYPE;
        Integer valueOf6 = Integer.valueOf(jsonobjecttopoint.MediaSessionCompat$Token);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls6, (Object) valueOf6).write(jsonWriter, valueOf6);
        validatedagrecurse.read(jsonWriter, 588);
        Class cls7 = Integer.TYPE;
        Integer valueOf7 = Integer.valueOf(jsonobjecttopoint.MediaSessionCompat$QueueItem);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls7, (Object) valueOf7).write(jsonWriter, valueOf7);
        if (jsonobjecttopoint != jsonobjecttopoint.AlertController$RecycleListView) {
            validatedagrecurse.read(jsonWriter, 472);
            String str7 = jsonobjecttopoint.AlertController$RecycleListView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        validatedagrecurse.read(jsonWriter, 35);
        Class cls8 = Integer.TYPE;
        Integer valueOf8 = Integer.valueOf(jsonobjecttopoint.PlaybackStateCompat$CustomAction);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls8, (Object) valueOf8).write(jsonWriter, valueOf8);
        if (jsonobjecttopoint != jsonobjecttopoint.setHasDecor) {
            validatedagrecurse.read(jsonWriter, 504);
            String str8 = jsonobjecttopoint.setHasDecor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        validatedagrecurse.read(jsonWriter, 236);
        Class cls9 = Long.TYPE;
        Long valueOf9 = Long.valueOf(jsonobjecttopoint.PlaybackStateCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls9, (Object) valueOf9).write(jsonWriter, valueOf9);
        if (jsonobjecttopoint != jsonobjecttopoint.Keep) {
            validatedagrecurse.read(jsonWriter, 252);
            String str9 = jsonobjecttopoint.Keep;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.setContentView) {
            validatedagrecurse.read(jsonWriter, 507);
            String str10 = jsonobjecttopoint.setContentView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.AppCompatActivity) {
            validatedagrecurse.read(jsonWriter, 501);
            String str11 = jsonobjecttopoint.AppCompatActivity;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.setBackgroundResource) {
            validatedagrecurse.read(jsonWriter, 346);
            String str12 = jsonobjecttopoint.setBackgroundResource;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.AppCompatDelegateImpl$ListMenuDecorView) {
            validatedagrecurse.read(jsonWriter, 455);
            String str13 = jsonobjecttopoint.AppCompatDelegateImpl$ListMenuDecorView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str13).write(jsonWriter, str13);
        }
        validatedagrecurse.read(jsonWriter, 106);
        Class cls10 = Integer.TYPE;
        Integer valueOf10 = Integer.valueOf(jsonobjecttopoint.AppCompatDialogFragment);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls10, (Object) valueOf10).write(jsonWriter, valueOf10);
        validatedagrecurse.read(jsonWriter, 511);
        Class cls11 = Integer.TYPE;
        Integer valueOf11 = Integer.valueOf(jsonobjecttopoint.setChecked);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls11, (Object) valueOf11).write(jsonWriter, valueOf11);
        if (jsonobjecttopoint != jsonobjecttopoint.setCheckable) {
            validatedagrecurse.read(jsonWriter, 543);
            String str14 = jsonobjecttopoint.setCheckable;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str14).write(jsonWriter, str14);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.setExpandedFormat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            String str15 = jsonobjecttopoint.setExpandedFormat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str15).write(jsonWriter, str15);
        }
        if (jsonobjecttopoint != jsonobjecttopoint.AppCompatViewInflater) {
            validatedagrecurse.read(jsonWriter, 42);
            String str16 = jsonobjecttopoint.AppCompatViewInflater;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str16).write(jsonWriter, str16);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02ae, code lost:
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
            o.jsonObjectToPoint r0 = new o.jsonObjectToPoint
            r0.<init>()
            com.google.gson.Gson r1 = r7.write
            o.validateCycle r3 = r7.read
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x02b3
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
                case 47: goto L_0x0298;
                case 57: goto L_0x0283;
                case 80: goto L_0x026d;
                case 93: goto L_0x0258;
                case 125: goto L_0x0243;
                case 160: goto L_0x022e;
                case 184: goto L_0x0218;
                case 190: goto L_0x0202;
                case 209: goto L_0x01ec;
                case 241: goto L_0x01d6;
                case 252: goto L_0x01c0;
                case 261: goto L_0x01aa;
                case 262: goto L_0x0194;
                case 279: goto L_0x017e;
                case 282: goto L_0x0168;
                case 333: goto L_0x0152;
                case 358: goto L_0x013c;
                case 404: goto L_0x0126;
                case 408: goto L_0x0110;
                case 411: goto L_0x00fa;
                case 415: goto L_0x00e4;
                case 443: goto L_0x00ce;
                case 464: goto L_0x00b5;
                case 528: goto L_0x009f;
                case 544: goto L_0x0089;
                case 592: goto L_0x0074;
                case 609: goto L_0x005f;
                case 610: goto L_0x004a;
                case 624: goto L_0x0035;
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
            r0.AppCompatActivity = r4
            goto L_0x0019
        L_0x0046:
            r0.AppCompatActivity = r2
            goto L_0x02ae
        L_0x004a:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x005f:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.Keep = r4
            goto L_0x0019
        L_0x0085:
            r0.Keep = r2
            goto L_0x02ae
        L_0x0089:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x009f:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.PlaybackStateCompat = r4
            goto L_0x0019
        L_0x00b5:
            if (r5 == 0) goto L_0x00ca
            o.jsonNumbersToPoint r4 = new o.jsonNumbersToPoint
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x00ca:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x02ae
        L_0x00ce:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x00e4:
            if (r5 == 0) goto L_0x00f6
            java.lang.Class<o.getInterpolator> r4 = p040o.getInterpolator.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.getInterpolator r4 = (p040o.getInterpolator) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x00f6:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x02ae
        L_0x00fa:
            if (r5 == 0) goto L_0x010c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setContentView = r4
            goto L_0x0019
        L_0x010c:
            r0.setContentView = r2
            goto L_0x02ae
        L_0x0110:
            if (r5 == 0) goto L_0x0122
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setExpandedFormat = r4
            goto L_0x0019
        L_0x0122:
            r0.setExpandedFormat = r2
            goto L_0x02ae
        L_0x0126:
            if (r5 == 0) goto L_0x0138
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f2881x50fd9e4a = r4
            goto L_0x0019
        L_0x0138:
            r0.f2881x50fd9e4a = r2
            goto L_0x02ae
        L_0x013c:
            if (r5 == 0) goto L_0x014e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setHasDecor = r4
            goto L_0x0019
        L_0x014e:
            r0.setHasDecor = r2
            goto L_0x02ae
        L_0x0152:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.AppCompatDialogFragment = r4
            goto L_0x0019
        L_0x0168:
            if (r5 == 0) goto L_0x017a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setBackgroundResource = r4
            goto L_0x0019
        L_0x017a:
            r0.setBackgroundResource = r2
            goto L_0x02ae
        L_0x017e:
            if (r5 == 0) goto L_0x0190
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.AppCompatDelegateImpl$ListMenuDecorView = r4
            goto L_0x0019
        L_0x0190:
            r0.AppCompatDelegateImpl$ListMenuDecorView = r2
            goto L_0x02ae
        L_0x0194:
            if (r5 == 0) goto L_0x01a6
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.AppCompatViewInflater = r4
            goto L_0x0019
        L_0x01a6:
            r0.AppCompatViewInflater = r2
            goto L_0x02ae
        L_0x01aa:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaSessionCompat$Token = r4
            goto L_0x0019
        L_0x01c0:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.PlaybackStateCompat$CustomAction = r4
            goto L_0x0019
        L_0x01d6:
            if (r5 == 0) goto L_0x01e8
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.write = r4
            goto L_0x0019
        L_0x01e8:
            r0.write = r2
            goto L_0x02ae
        L_0x01ec:
            if (r5 == 0) goto L_0x01fe
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.read = r4
            goto L_0x0019
        L_0x01fe:
            r0.read = r2
            goto L_0x02ae
        L_0x0202:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x0218:
            if (r5 == 0) goto L_0x022a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x022a:
            r0.IconCompatParcelizer = r2
            goto L_0x02ae
        L_0x022e:
            if (r5 == 0) goto L_0x0240
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x0240:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x02ae
        L_0x0243:
            if (r5 == 0) goto L_0x0255
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.ParcelableVolumeInfo = r4
            goto L_0x0019
        L_0x0255:
            r0.ParcelableVolumeInfo = r2
            goto L_0x02ae
        L_0x0258:
            if (r5 == 0) goto L_0x026a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.AlertController$RecycleListView = r4
            goto L_0x0019
        L_0x026a:
            r0.AlertController$RecycleListView = r2
            goto L_0x02ae
        L_0x026d:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setChecked = r4
            goto L_0x0019
        L_0x0283:
            if (r5 == 0) goto L_0x0295
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setCheckable = r4
            goto L_0x0019
        L_0x0295:
            r0.setCheckable = r2
            goto L_0x02ae
        L_0x0298:
            if (r5 == 0) goto L_0x02ae
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaSessionCompat$QueueItem = r4
            goto L_0x0019
        L_0x02ae:
            r8.nextNull()
            goto L_0x0019
        L_0x02b3:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FontCharacterParser.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
