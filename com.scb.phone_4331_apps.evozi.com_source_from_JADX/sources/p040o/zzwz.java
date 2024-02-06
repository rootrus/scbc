package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.PlaceFilter;

/* renamed from: o.zzwz */
public final class zzwz extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;
    private validateDAGRecurse write;

    public zzwz(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzwi zzwi = (zzwi) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (zzwi != zzwi.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 350);
            isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = zzwi.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, isRestrictedToPlacesOpenNow.class, (Object) isrestrictedtoplacesopennow).write(jsonWriter, isrestrictedtoplacesopennow);
        }
        if (zzwi != zzwi.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 95);
            zzwn zzwn = zzwi.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwn.class, (Object) zzwn).write(jsonWriter, zzwn);
        }
        if (zzwi != zzwi.read) {
            validatedagrecurse.read(jsonWriter, 391);
            zzwp zzwp = zzwi.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwp.class, (Object) zzwp).write(jsonWriter, zzwp);
        }
        if (zzwi != zzwi.write) {
            validatedagrecurse.read(jsonWriter, 581);
            zzwl zzwl = zzwi.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwl.class, (Object) zzwl).write(jsonWriter, zzwl);
        }
        if (zzwi != zzwi.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 385);
            zzwl zzwl2 = zzwi.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwl.class, (Object) zzwl2).write(jsonWriter, zzwl2);
        }
        if (zzwi != zzwi.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 596);
            String str = zzwi.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        validatedagrecurse.read(jsonWriter, 526);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(zzwi.MediaBrowserCompat$MediaItem);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (zzwi != zzwi.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 530);
            String str2 = zzwi.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzwi != zzwi.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 332);
            zzws zzws = zzwi.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzws.class, (Object) zzws).write(jsonWriter, zzws);
        }
        if (zzwi != zzwi.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 94);
            String str3 = zzwi.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (zzwi != zzwi.f3005x50fd9e4a) {
            validatedagrecurse.read(jsonWriter, 127);
            getLikelihood getlikelihood = zzwi.f3005x50fd9e4a;
            findNode.MediaBrowserCompat$ItemReceiver(gson, getLikelihood.class, (Object) getlikelihood).write(jsonWriter, getlikelihood);
        }
        if (zzwi != zzwi.MediaSessionCompat$ResultReceiverWrapper) {
            validatedagrecurse.read(jsonWriter, 497);
            PlaceFilter.zzb zzb = zzwi.MediaSessionCompat$ResultReceiverWrapper;
            findNode.MediaBrowserCompat$ItemReceiver(gson, PlaceFilter.zzb.class, (Object) zzb).write(jsonWriter, zzb);
        }
        if (zzwi != zzwi.MediaSessionCompat$Token) {
            validatedagrecurse.read(jsonWriter, 483);
            zzwm zzwm = zzwi.MediaSessionCompat$Token;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwm.class, (Object) zzwm).write(jsonWriter, zzwm);
        }
        if (zzwi != zzwi.MediaSessionCompat$QueueItem) {
            validatedagrecurse.read(jsonWriter, 628);
            String str4 = zzwi.MediaSessionCompat$QueueItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (zzwi != zzwi.ParcelableVolumeInfo) {
            validatedagrecurse.read(jsonWriter, 11);
            getLikelihood getlikelihood2 = zzwi.ParcelableVolumeInfo;
            findNode.MediaBrowserCompat$ItemReceiver(gson, getLikelihood.class, (Object) getlikelihood2).write(jsonWriter, getlikelihood2);
        }
        if (zzwi != zzwi.PlaybackStateCompat$CustomAction) {
            validatedagrecurse.read(jsonWriter, 337);
            String str5 = zzwi.PlaybackStateCompat$CustomAction;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (zzwi != zzwi.Keep) {
            validatedagrecurse.read(jsonWriter, 509);
            zzwo zzwo = zzwi.Keep;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwo.class, (Object) zzwo).write(jsonWriter, zzwo);
        }
        if (zzwi != zzwi.setHasDecor) {
            validatedagrecurse.read(jsonWriter, 585);
            zzwu zzwu = zzwi.setHasDecor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzwu.class, (Object) zzwu).write(jsonWriter, zzwu);
        }
        if (zzwi != zzwi.PlaybackStateCompat) {
            validatedagrecurse.read(jsonWriter, 621);
            String str6 = zzwi.PlaybackStateCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (zzwi != zzwi.AlertController$RecycleListView) {
            validatedagrecurse.read(jsonWriter, 63);
            zzxc zzxc = zzwi.AlertController$RecycleListView;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzxc.class, (Object) zzxc).write(jsonWriter, zzxc);
        }
        if (zzwi != zzwi.setBackgroundResource) {
            validatedagrecurse.read(jsonWriter, 97);
            PlaceReport placeReport = zzwi.setBackgroundResource;
            findNode.MediaBrowserCompat$ItemReceiver(gson, PlaceReport.class, (Object) placeReport).write(jsonWriter, placeReport);
        }
        jsonWriter.endObject();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f8, code lost:
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
            o.zzwi r0 = new o.zzwi
            r0.<init>()
            com.google.gson.Gson r1 = r7.read
            o.validateCycle r3 = r7.MediaBrowserCompat$ItemReceiver
            r8.beginObject()
        L_0x0019:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x01fd
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
                case 31: goto L_0x01e4;
                case 44: goto L_0x01cf;
                case 79: goto L_0x01ba;
                case 153: goto L_0x01a5;
                case 165: goto L_0x0190;
                case 173: goto L_0x017b;
                case 192: goto L_0x0165;
                case 210: goto L_0x014f;
                case 240: goto L_0x0139;
                case 260: goto L_0x0123;
                case 268: goto L_0x010d;
                case 281: goto L_0x00f7;
                case 316: goto L_0x00e1;
                case 407: goto L_0x00cb;
                case 417: goto L_0x00b5;
                case 426: goto L_0x009f;
                case 444: goto L_0x0089;
                case 497: goto L_0x0074;
                case 521: goto L_0x005f;
                case 527: goto L_0x004a;
                case 529: goto L_0x0035;
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
            r0.RatingCompat = r4
            goto L_0x0019
        L_0x0046:
            r0.RatingCompat = r2
            goto L_0x01f8
        L_0x004a:
            if (r5 == 0) goto L_0x005b
            java.lang.Class<o.zzwp> r4 = p040o.zzwp.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwp r4 = (p040o.zzwp) r4
            r0.read = r4
            goto L_0x0019
        L_0x005b:
            r0.read = r2
            goto L_0x01f8
        L_0x005f:
            if (r5 == 0) goto L_0x0070
            java.lang.Class<o.zzwm> r4 = p040o.zzwm.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwm r4 = (p040o.zzwm) r4
            r0.MediaSessionCompat$Token = r4
            goto L_0x0019
        L_0x0070:
            r0.MediaSessionCompat$Token = r2
            goto L_0x01f8
        L_0x0074:
            if (r5 == 0) goto L_0x0085
            java.lang.Class<o.zzwl> r4 = p040o.zzwl.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwl r4 = (p040o.zzwl) r4
            r0.write = r4
            goto L_0x0019
        L_0x0085:
            r0.write = r2
            goto L_0x01f8
        L_0x0089:
            if (r5 == 0) goto L_0x009b
            java.lang.Class<o.zzwu> r4 = p040o.zzwu.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwu r4 = (p040o.zzwu) r4
            r0.setHasDecor = r4
            goto L_0x0019
        L_0x009b:
            r0.setHasDecor = r2
            goto L_0x01f8
        L_0x009f:
            if (r5 == 0) goto L_0x00b1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaDescriptionCompat = r4
            goto L_0x0019
        L_0x00b1:
            r0.MediaDescriptionCompat = r2
            goto L_0x01f8
        L_0x00b5:
            if (r5 == 0) goto L_0x01f8
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.MediaBrowserCompat$MediaItem = r4
            goto L_0x0019
        L_0x00cb:
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<o.isRestrictedToPlacesOpenNow> r4 = p040o.isRestrictedToPlacesOpenNow.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.isRestrictedToPlacesOpenNow r4 = (p040o.isRestrictedToPlacesOpenNow) r4
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0019
        L_0x00dd:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x01f8
        L_0x00e1:
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.PlaybackStateCompat$CustomAction = r4
            goto L_0x0019
        L_0x00f3:
            r0.PlaybackStateCompat$CustomAction = r2
            goto L_0x01f8
        L_0x00f7:
            if (r5 == 0) goto L_0x0109
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaSessionCompat$QueueItem = r4
            goto L_0x0019
        L_0x0109:
            r0.MediaSessionCompat$QueueItem = r2
            goto L_0x01f8
        L_0x010d:
            if (r5 == 0) goto L_0x011f
            java.lang.Class<o.PlaceFilter$zzb> r4 = p040o.PlaceFilter.zzb.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.PlaceFilter$zzb r4 = (p040o.PlaceFilter.zzb) r4
            r0.MediaSessionCompat$ResultReceiverWrapper = r4
            goto L_0x0019
        L_0x011f:
            r0.MediaSessionCompat$ResultReceiverWrapper = r2
            goto L_0x01f8
        L_0x0123:
            if (r5 == 0) goto L_0x0135
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0019
        L_0x0135:
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            goto L_0x01f8
        L_0x0139:
            if (r5 == 0) goto L_0x014b
            java.lang.Class<o.PlaceReport> r4 = p040o.PlaceReport.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.PlaceReport r4 = (p040o.PlaceReport) r4
            r0.setBackgroundResource = r4
            goto L_0x0019
        L_0x014b:
            r0.setBackgroundResource = r2
            goto L_0x01f8
        L_0x014f:
            if (r5 == 0) goto L_0x0161
            java.lang.Class<o.zzwn> r4 = p040o.zzwn.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwn r4 = (p040o.zzwn) r4
            r0.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x0019
        L_0x0161:
            r0.MediaBrowserCompat$ItemReceiver = r2
            goto L_0x01f8
        L_0x0165:
            if (r5 == 0) goto L_0x0177
            java.lang.Class<o.zzwl> r4 = p040o.zzwl.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwl r4 = (p040o.zzwl) r4
            r0.IconCompatParcelizer = r4
            goto L_0x0019
        L_0x0177:
            r0.IconCompatParcelizer = r2
            goto L_0x01f8
        L_0x017b:
            if (r5 == 0) goto L_0x018d
            java.lang.Class<o.getLikelihood> r4 = p040o.getLikelihood.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.getLikelihood r4 = (p040o.getLikelihood) r4
            r0.ParcelableVolumeInfo = r4
            goto L_0x0019
        L_0x018d:
            r0.ParcelableVolumeInfo = r2
            goto L_0x01f8
        L_0x0190:
            if (r5 == 0) goto L_0x01a2
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            java.lang.String r4 = (java.lang.String) r4
            r0.PlaybackStateCompat = r4
            goto L_0x0019
        L_0x01a2:
            r0.PlaybackStateCompat = r2
            goto L_0x01f8
        L_0x01a5:
            if (r5 == 0) goto L_0x01b7
            java.lang.Class<o.zzws> r4 = p040o.zzws.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzws r4 = (p040o.zzws) r4
            r0.MediaMetadataCompat = r4
            goto L_0x0019
        L_0x01b7:
            r0.MediaMetadataCompat = r2
            goto L_0x01f8
        L_0x01ba:
            if (r5 == 0) goto L_0x01cc
            java.lang.Class<o.zzxc> r4 = p040o.zzxc.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzxc r4 = (p040o.zzxc) r4
            r0.AlertController$RecycleListView = r4
            goto L_0x0019
        L_0x01cc:
            r0.AlertController$RecycleListView = r2
            goto L_0x01f8
        L_0x01cf:
            if (r5 == 0) goto L_0x01e1
            java.lang.Class<o.zzwo> r4 = p040o.zzwo.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.zzwo r4 = (p040o.zzwo) r4
            r0.Keep = r4
            goto L_0x0019
        L_0x01e1:
            r0.Keep = r2
            goto L_0x01f8
        L_0x01e4:
            if (r5 == 0) goto L_0x01f6
            java.lang.Class<o.getLikelihood> r4 = p040o.getLikelihood.class
            com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
            java.lang.Object r4 = r4.read(r8)
            o.getLikelihood r4 = (p040o.getLikelihood) r4
            r0.f3005x50fd9e4a = r4
            goto L_0x0019
        L_0x01f6:
            r0.f3005x50fd9e4a = r2
        L_0x01f8:
            r8.nextNull()
            goto L_0x0019
        L_0x01fd:
            r8.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.zzwz.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
