package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.PlaceLikelihoodBufferResponse */
public final class PlaceLikelihoodBufferResponse extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse read;

    public PlaceLikelihoodBufferResponse(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        PlacePhotoMetadataResult placePhotoMetadataResult = (PlacePhotoMetadataResult) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (placePhotoMetadataResult != placePhotoMetadataResult.write) {
            validatedagrecurse.read(jsonWriter, 289);
            String str = placePhotoMetadataResult.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 605);
            PlaceTypes placeTypes = new PlaceTypes();
            List<zzvm> list = placePhotoMetadataResult.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) placeTypes, (Object) list).write(jsonWriter, list);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 92);
            String str2 = placePhotoMetadataResult.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 55);
            String str3 = placePhotoMetadataResult.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.read) {
            validatedagrecurse.read(jsonWriter, 220);
            String str4 = placePhotoMetadataResult.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        validatedagrecurse.read(jsonWriter, 10);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(placePhotoMetadataResult.MediaBrowserCompat$SearchResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, 344);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(placePhotoMetadataResult.MediaBrowserCompat$MediaItem);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (placePhotoMetadataResult != placePhotoMetadataResult.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 238);
            String str5 = placePhotoMetadataResult.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
            String str6 = placePhotoMetadataResult.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 352);
            Places places = new Places();
            List<PlaceDetectionClient> list2 = placePhotoMetadataResult.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) places, (Object) list2).write(jsonWriter, list2);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 291);
            String str7 = placePhotoMetadataResult.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.f2771x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, 357);
            String str8 = placePhotoMetadataResult.f2771x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        validatedagrecurse.read(jsonWriter, 552);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(placePhotoMetadataResult.ParcelableVolumeInfo);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        Class cls4 = Integer.TYPE;
        Integer valueOf4 = Integer.valueOf(placePhotoMetadataResult.MediaSessionCompat$Token);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls4, (Object) valueOf4).write(jsonWriter, valueOf4);
        validatedagrecurse.read(jsonWriter, 240);
        Class cls5 = Integer.TYPE;
        Integer valueOf5 = Integer.valueOf(placePhotoMetadataResult.MediaSessionCompat$QueueItem);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls5, (Object) valueOf5).write(jsonWriter, valueOf5);
        validatedagrecurse.read(jsonWriter, 247);
        Class cls6 = Boolean.TYPE;
        Boolean valueOf6 = Boolean.valueOf(placePhotoMetadataResult.Keep);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls6, (Object) valueOf6).write(jsonWriter, valueOf6);
        validatedagrecurse.read(jsonWriter, 336);
        Class cls7 = Integer.TYPE;
        Integer valueOf7 = Integer.valueOf(placePhotoMetadataResult.AlertController$RecycleListView);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls7, (Object) valueOf7).write(jsonWriter, valueOf7);
        validatedagrecurse.read(jsonWriter, 91);
        Class cls8 = Integer.TYPE;
        Integer valueOf8 = Integer.valueOf(placePhotoMetadataResult.PlaybackStateCompat$CustomAction);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls8, (Object) valueOf8).write(jsonWriter, valueOf8);
        if (placePhotoMetadataResult != placePhotoMetadataResult.PlaybackStateCompat) {
            validatedagrecurse.read(jsonWriter, 286);
            String str9 = placePhotoMetadataResult.PlaybackStateCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setHasDecor) {
            validatedagrecurse.read(jsonWriter, 121);
            String str10 = placePhotoMetadataResult.setHasDecor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.AppCompatDelegateImpl$ListMenuDecorView) {
            validatedagrecurse.read(jsonWriter, 228);
            String str11 = placePhotoMetadataResult.AppCompatDelegateImpl$ListMenuDecorView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
        }
        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
        Class cls9 = Integer.TYPE;
        Integer valueOf9 = Integer.valueOf(placePhotoMetadataResult.setBackgroundResource);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls9, (Object) valueOf9).write(jsonWriter, valueOf9);
        validatedagrecurse.read(jsonWriter, 588);
        Class cls10 = Integer.TYPE;
        Integer valueOf10 = Integer.valueOf(placePhotoMetadataResult.setContentView);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls10, (Object) valueOf10).write(jsonWriter, valueOf10);
        if (placePhotoMetadataResult != placePhotoMetadataResult.AppCompatActivity) {
            validatedagrecurse.read(jsonWriter, 472);
            String str12 = placePhotoMetadataResult.AppCompatActivity;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
        }
        validatedagrecurse.read(jsonWriter, 35);
        Class cls11 = Integer.TYPE;
        Integer valueOf11 = Integer.valueOf(placePhotoMetadataResult.AppCompatDialogFragment);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls11, (Object) valueOf11).write(jsonWriter, valueOf11);
        if (placePhotoMetadataResult != placePhotoMetadataResult.setChecked) {
            validatedagrecurse.read(jsonWriter, 504);
            String str13 = placePhotoMetadataResult.setChecked;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str13).write(jsonWriter, str13);
        }
        validatedagrecurse.read(jsonWriter, 236);
        Class cls12 = Long.TYPE;
        Long valueOf12 = Long.valueOf(placePhotoMetadataResult.AppCompatViewInflater);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls12, (Object) valueOf12).write(jsonWriter, valueOf12);
        if (placePhotoMetadataResult != placePhotoMetadataResult.setExpandedFormat) {
            validatedagrecurse.read(jsonWriter, 311);
            String str14 = placePhotoMetadataResult.setExpandedFormat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str14).write(jsonWriter, str14);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setCheckable) {
            validatedagrecurse.read(jsonWriter, 309);
            String str15 = placePhotoMetadataResult.setCheckable;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str15).write(jsonWriter, str15);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.ActionMenuItemView) {
            validatedagrecurse.read(jsonWriter, 252);
            String str16 = placePhotoMetadataResult.ActionMenuItemView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str16).write(jsonWriter, str16);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setIcon) {
            validatedagrecurse.read(jsonWriter, 501);
            String str17 = placePhotoMetadataResult.setIcon;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str17).write(jsonWriter, str17);
        }
        validatedagrecurse.read(jsonWriter, 106);
        Class cls13 = Integer.TYPE;
        Integer valueOf13 = Integer.valueOf(placePhotoMetadataResult.setPopupCallback);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls13, (Object) valueOf13).write(jsonWriter, valueOf13);
        if (placePhotoMetadataResult != placePhotoMetadataResult.setPadding) {
            validatedagrecurse.read(jsonWriter, 543);
            String str18 = placePhotoMetadataResult.setPadding;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str18).write(jsonWriter, str18);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setShortcut) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            String str19 = placePhotoMetadataResult.setShortcut;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str19).write(jsonWriter, str19);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setItemInvoker) {
            validatedagrecurse.read(jsonWriter, 42);
            String str20 = placePhotoMetadataResult.setItemInvoker;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str20).write(jsonWriter, str20);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setGroupDividerEnabled) {
            validatedagrecurse.read(jsonWriter, 299);
            getPlaceDetectionClient getplacedetectionclient = new getPlaceDetectionClient();
            List<PlacePhotoMetadataResult> list3 = placePhotoMetadataResult.setGroupDividerEnabled;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) getplacedetectionclient, (Object) list3).write(jsonWriter, list3);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.ExpandedMenuView) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
            String str21 = placePhotoMetadataResult.ExpandedMenuView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str21).write(jsonWriter, str21);
        }
        if (placePhotoMetadataResult != placePhotoMetadataResult.setForceShowIcon) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384);
            String str22 = placePhotoMetadataResult.setForceShowIcon;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str22).write(jsonWriter, str22);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x037a, code lost:
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
            o.PlacePhotoMetadataResult r0 = new o.PlacePhotoMetadataResult
            r0.<init>()
            com.google.gson.Gson r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.validateCycle r3 = r7.IconCompatParcelizer
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x037f
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
                case 20: goto L_0x0364;
                case 47: goto L_0x034e;
                case 57: goto L_0x0339;
                case 93: goto L_0x0324;
                case 94: goto L_0x030f;
                case 125: goto L_0x02fa;
                case 152: goto L_0x02e1;
                case 160: goto L_0x02cb;
                case 184: goto L_0x02b5;
                case 190: goto L_0x029f;
                case 209: goto L_0x0289;
                case 224: goto L_0x0273;
                case 228: goto L_0x025d;
                case 241: goto L_0x0247;
                case 252: goto L_0x0231;
                case 261: goto L_0x021b;
                case 262: goto L_0x0205;
                case 291: goto L_0x01ef;
                case 322: goto L_0x01d9;
                case 333: goto L_0x01c3;
                case 334: goto L_0x01ad;
                case 358: goto L_0x0197;
                case 404: goto L_0x0181;
                case 408: goto L_0x016b;
                case 443: goto L_0x0155;
                case 464: goto L_0x013c;
                case 481: goto L_0x0126;
                case 491: goto L_0x0110;
                case 528: goto L_0x00fa;
                case 533: goto L_0x00e4;
                case 544: goto L_0x00ce;
                case 547: goto L_0x00b8;
                case 552: goto L_0x009f;
                case 592: goto L_0x0089;
                case 595: goto L_0x0074;
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
            r0.setIcon = r4
            goto L_0x0019
        L_0x0046:
            r0.setIcon = r2
            goto L_0x037a
        L_0x004a:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaSessionCompat$Token = r4
            goto L_0x0019
        L_0x005f:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaSessionCompat$QueueItem = r4
            goto L_0x0019
        L_0x0074:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.ActionMenuItemView = r4
            goto L_0x0019
        L_0x009b:
            r0.ActionMenuItemView = r2
            goto L_0x037a
        L_0x009f:
            if (r5 == 0) goto L_0x00b4
            o.PlaceTypes r4 = new o.PlaceTypes
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x00b4:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x037a
        L_0x00b8:
            if (r5 == 0) goto L_0x00ca
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x00ca:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x037a
        L_0x00ce:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.PlaybackStateCompat$CustomAction = r4
            goto L_0x0019
        L_0x00e4:
            if (r5 == 0) goto L_0x00f6
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.ExpandedMenuView = r4
            goto L_0x0019
        L_0x00f6:
            r0.ExpandedMenuView = r2
            goto L_0x037a
        L_0x00fa:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.AppCompatViewInflater = r4
            goto L_0x0019
        L_0x0110:
            if (r5 == 0) goto L_0x0122
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.write = r4
            goto L_0x0019
        L_0x0122:
            r0.write = r2
            goto L_0x037a
        L_0x0126:
            if (r5 == 0) goto L_0x0138
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setForceShowIcon = r4
            goto L_0x0019
        L_0x0138:
            r0.setForceShowIcon = r2
            goto L_0x037a
        L_0x013c:
            if (r5 == 0) goto L_0x0151
            o.Places r4 = new o.Places
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x0151:
            r0.RatingCompat = r2
            goto L_0x037a
        L_0x0155:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.AlertController$RecycleListView = r4
            goto L_0x0019
        L_0x016b:
            if (r5 == 0) goto L_0x017d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setShortcut = r4
            goto L_0x0019
        L_0x017d:
            r0.setShortcut = r2
            goto L_0x037a
        L_0x0181:
            if (r5 == 0) goto L_0x0193
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.AppCompatDelegateImpl$ListMenuDecorView = r4
            goto L_0x0019
        L_0x0193:
            r0.AppCompatDelegateImpl$ListMenuDecorView = r2
            goto L_0x037a
        L_0x0197:
            if (r5 == 0) goto L_0x01a9
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setChecked = r4
            goto L_0x0019
        L_0x01a9:
            r0.setChecked = r2
            goto L_0x037a
        L_0x01ad:
            if (r5 == 0) goto L_0x01bf
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x01bf:
            r0.MediaMetadataCompat = r2
            goto L_0x037a
        L_0x01c3:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setPopupCallback = r4
            goto L_0x0019
        L_0x01d9:
            if (r5 == 0) goto L_0x01eb
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.read = r4
            goto L_0x0019
        L_0x01eb:
            r0.read = r2
            goto L_0x037a
        L_0x01ef:
            if (r5 == 0) goto L_0x0201
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setCheckable = r4
            goto L_0x0019
        L_0x0201:
            r0.setCheckable = r2
            goto L_0x037a
        L_0x0205:
            if (r5 == 0) goto L_0x0217
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setItemInvoker = r4
            goto L_0x0019
        L_0x0217:
            r0.setItemInvoker = r2
            goto L_0x037a
        L_0x021b:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setBackgroundResource = r4
            goto L_0x0019
        L_0x0231:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.AppCompatDialogFragment = r4
            goto L_0x0019
        L_0x0247:
            if (r5 == 0) goto L_0x0259
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x0259:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x037a
        L_0x025d:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x0273:
            if (r5 == 0) goto L_0x0285
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x0285:
            r0.IconCompatParcelizer = r2
            goto L_0x037a
        L_0x0289:
            if (r5 == 0) goto L_0x029b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x029b:
            r0.MediaDescriptionCompat = r2
            goto L_0x037a
        L_0x029f:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.ParcelableVolumeInfo = r4
            goto L_0x0019
        L_0x02b5:
            if (r5 == 0) goto L_0x02c7
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.f2771x50fd9e4a = r4
            goto L_0x0019
        L_0x02c7:
            r0.f2771x50fd9e4a = r2
            goto L_0x037a
        L_0x02cb:
            if (r5 == 0) goto L_0x02dd
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.PlaybackStateCompat = r4
            goto L_0x0019
        L_0x02dd:
            r0.PlaybackStateCompat = r2
            goto L_0x037a
        L_0x02e1:
            if (r5 == 0) goto L_0x02f6
            o.getPlaceDetectionClient r4 = new o.getPlaceDetectionClient
            r4.<init>()
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.util.List r4 = (java.util.List) r4
            r0.setGroupDividerEnabled = r4
            goto L_0x0019
        L_0x02f6:
            r0.setGroupDividerEnabled = r2
            goto L_0x037a
        L_0x02fa:
            if (r5 == 0) goto L_0x030c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setHasDecor = r4
            goto L_0x0019
        L_0x030c:
            r0.setHasDecor = r2
            goto L_0x037a
        L_0x030f:
            if (r5 == 0) goto L_0x0321
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setExpandedFormat = r4
            goto L_0x0019
        L_0x0321:
            r0.setExpandedFormat = r2
            goto L_0x037a
        L_0x0324:
            if (r5 == 0) goto L_0x0336
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.AppCompatActivity = r4
            goto L_0x0019
        L_0x0336:
            r0.AppCompatActivity = r2
            goto L_0x037a
        L_0x0339:
            if (r5 == 0) goto L_0x034b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.setPadding = r4
            goto L_0x0019
        L_0x034b:
            r0.setPadding = r2
            goto L_0x037a
        L_0x034e:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setContentView = r4
            goto L_0x0019
        L_0x0364:
            if (r5 == 0) goto L_0x037a
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.Keep = r4
            goto L_0x0019
        L_0x037a:
            r8.nextNull()
            goto L_0x0019
        L_0x037f:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PlaceLikelihoodBufferResponse.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
