package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.StreetViewPanoramaView;
import p040o.SupportStreetViewPanoramaFragment;

/* renamed from: o.SupportMapFragment */
public final class SupportMapFragment extends zzuk {
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public List<StreetViewPanoramaView.zza> write;

    public static SupportMapFragment write() {
        return new SupportMapFragment();
    }

    /* renamed from: o.SupportMapFragment$zza */
    public final class zza extends TypeAdapter implements addKernel {
        private validateCycle IconCompatParcelizer;
        private Gson MediaBrowserCompat$ItemReceiver;
        private validateDAGRecurse write;

        public zza(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.MediaBrowserCompat$ItemReceiver = gson;
            this.IconCompatParcelizer = validatecycle;
            this.write = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            SupportStreetViewPanoramaFragment.zza zza = (SupportStreetViewPanoramaFragment.zza) obj;
            Gson gson = this.MediaBrowserCompat$ItemReceiver;
            validateDAGRecurse validatedagrecurse = this.write;
            jsonWriter.beginObject();
            if (zza != zza.MediaBrowserCompat$ItemReceiver) {
                validatedagrecurse.read(jsonWriter, 518);
                Double d = zza.MediaBrowserCompat$ItemReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d).write(jsonWriter, d);
            }
            if (zza != zza.IconCompatParcelizer) {
                validatedagrecurse.read(jsonWriter, 125);
                String str = zza.IconCompatParcelizer;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (zza != zza.read) {
                validatedagrecurse.read(jsonWriter, 578);
                String str2 = zza.read;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            if (zza != zza.write) {
                validatedagrecurse.read(jsonWriter, 539);
                String str3 = zza.write;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
            }
            if (zza != zza.MediaBrowserCompat$CustomActionResultReceiver) {
                validatedagrecurse.read(jsonWriter, 20);
                String str4 = zza.MediaBrowserCompat$CustomActionResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
            }
            if (zza != zza.MediaBrowserCompat$MediaItem) {
                validatedagrecurse.read(jsonWriter, 478);
                String str5 = zza.MediaBrowserCompat$MediaItem;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
            }
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            SupportStreetViewPanoramaFragment.zza zza = new SupportStreetViewPanoramaFragment.zza();
            Gson gson = this.MediaBrowserCompat$ItemReceiver;
            validateCycle validatecycle = this.IconCompatParcelizer;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int write2 = validatecycle.write(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (write2 != 42) {
                    if (write2 != 243) {
                        if (write2 != 382) {
                            if (write2 != 387) {
                                if (write2 != 392) {
                                    if (write2 != 622) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        zza.read = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        zza.read = null;
                                    }
                                } else if (z) {
                                    zza.MediaBrowserCompat$MediaItem = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    zza.MediaBrowserCompat$MediaItem = null;
                                }
                            } else if (z) {
                                zza.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Double.class).read(jsonReader);
                            } else {
                                zza.MediaBrowserCompat$ItemReceiver = null;
                            }
                        } else if (z) {
                            zza.write = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            zza.write = null;
                        }
                    } else if (z) {
                        zza.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zza.IconCompatParcelizer = null;
                    }
                } else if (z) {
                    zza.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zza.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return zza;
        }
    }

    /* renamed from: o.SupportMapFragment$zzb */
    public final class zzb extends TypeAdapter implements addKernel {
        private validateCycle IconCompatParcelizer;
        private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
        private Gson write;

        public zzb(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.write = gson;
            this.IconCompatParcelizer = validatecycle;
            this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            StreetViewPanoramaView.zzb zzb = (StreetViewPanoramaView.zzb) obj;
            Gson gson = this.write;
            validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonWriter.beginObject();
            if (zzb != zzb.read) {
                validatedagrecurse.read(jsonWriter, 518);
                Double d = zzb.read;
                findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d).write(jsonWriter, d);
            }
            if (zzb != zzb.write) {
                validatedagrecurse.read(jsonWriter, 293);
                String str = zzb.write;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (zzb != zzb.MediaBrowserCompat$ItemReceiver) {
                validatedagrecurse.read(jsonWriter, 44);
                String str2 = zzb.MediaBrowserCompat$ItemReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            if (zzb != zzb.IconCompatParcelizer) {
                validatedagrecurse.read(jsonWriter, 395);
                String str3 = zzb.IconCompatParcelizer;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
            }
            if (zzb != zzb.MediaBrowserCompat$CustomActionResultReceiver) {
                validatedagrecurse.read(jsonWriter, 34);
                OffsetDateTime offsetDateTime = zzb.MediaBrowserCompat$CustomActionResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, OffsetDateTime.class, (Object) offsetDateTime).write(jsonWriter, offsetDateTime);
            }
            if (zzb != zzb.MediaBrowserCompat$MediaItem) {
                validatedagrecurse.read(jsonWriter, 227);
                String str4 = zzb.MediaBrowserCompat$MediaItem;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
            }
            if (zzb != zzb.MediaBrowserCompat$SearchResultReceiver) {
                validatedagrecurse.read(jsonWriter, 467);
                OffsetDateTime offsetDateTime2 = zzb.MediaBrowserCompat$SearchResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, OffsetDateTime.class, (Object) offsetDateTime2).write(jsonWriter, offsetDateTime2);
            }
            if (zzb != zzb.MediaMetadataCompat) {
                validatedagrecurse.read(jsonWriter, 109);
                String str5 = zzb.MediaMetadataCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
            }
            if (zzb != zzb.RatingCompat) {
                validatedagrecurse.read(jsonWriter, 406);
                String str6 = zzb.RatingCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
            }
            if (zzb != zzb.MediaDescriptionCompat) {
                validatedagrecurse.read(jsonWriter, 402);
                String str7 = zzb.MediaDescriptionCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
            }
            if (zzb != zzb.ParcelableVolumeInfo) {
                validatedagrecurse.read(jsonWriter, 250);
                String str8 = zzb.ParcelableVolumeInfo;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
            }
            if (zzb != zzb.MediaSessionCompat$QueueItem) {
                validatedagrecurse.read(jsonWriter, 478);
                String str9 = zzb.MediaSessionCompat$QueueItem;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
            }
            if (zzb != zzb.MediaSessionCompat$Token) {
                validatedagrecurse.read(jsonWriter, 2);
                String str10 = zzb.MediaSessionCompat$Token;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
            }
            jsonWriter.endObject();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0148, code lost:
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
                o.StreetViewPanoramaView$zzb r0 = new o.StreetViewPanoramaView$zzb
                r0.<init>()
                com.google.gson.Gson r1 = r7.write
                o.validateCycle r3 = r7.IconCompatParcelizer
                r8.beginObject()
            L_0x0019:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L_0x014d
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
                    case 16: goto L_0x0134;
                    case 35: goto L_0x011f;
                    case 66: goto L_0x010a;
                    case 88: goto L_0x00f5;
                    case 187: goto L_0x00e0;
                    case 242: goto L_0x00cb;
                    case 293: goto L_0x00b5;
                    case 304: goto L_0x009f;
                    case 386: goto L_0x0089;
                    case 387: goto L_0x0074;
                    case 392: goto L_0x005f;
                    case 438: goto L_0x004a;
                    case 496: goto L_0x0035;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r8.skipValue()
                goto L_0x0019
            L_0x0035:
                if (r5 == 0) goto L_0x0046
                java.lang.Class<org.threeten.bp.OffsetDateTime> r4 = org.threeten.p041bp.OffsetDateTime.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                org.threeten.bp.OffsetDateTime r4 = (org.threeten.p041bp.OffsetDateTime) r4
                r0.MediaBrowserCompat$CustomActionResultReceiver = r4
                goto L_0x0019
            L_0x0046:
                r0.MediaBrowserCompat$CustomActionResultReceiver = r2
                goto L_0x0148
            L_0x004a:
                if (r5 == 0) goto L_0x005b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaBrowserCompat$MediaItem = r4
                goto L_0x0019
            L_0x005b:
                r0.MediaBrowserCompat$MediaItem = r2
                goto L_0x0148
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
                goto L_0x0148
            L_0x0074:
                if (r5 == 0) goto L_0x0085
                java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.Double r4 = (java.lang.Double) r4
                r0.read = r4
                goto L_0x0019
            L_0x0085:
                r0.read = r2
                goto L_0x0148
            L_0x0089:
                if (r5 == 0) goto L_0x009b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaDescriptionCompat = r4
                goto L_0x0019
            L_0x009b:
                r0.MediaDescriptionCompat = r2
                goto L_0x0148
            L_0x009f:
                if (r5 == 0) goto L_0x00b1
                java.lang.Class<org.threeten.bp.OffsetDateTime> r4 = org.threeten.p041bp.OffsetDateTime.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                org.threeten.bp.OffsetDateTime r4 = (org.threeten.p041bp.OffsetDateTime) r4
                r0.MediaBrowserCompat$SearchResultReceiver = r4
                goto L_0x0019
            L_0x00b1:
                r0.MediaBrowserCompat$SearchResultReceiver = r2
                goto L_0x0148
            L_0x00b5:
                if (r5 == 0) goto L_0x00c7
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.IconCompatParcelizer = r4
                goto L_0x0019
            L_0x00c7:
                r0.IconCompatParcelizer = r2
                goto L_0x0148
            L_0x00cb:
                if (r5 == 0) goto L_0x00dd
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaSessionCompat$Token = r4
                goto L_0x0019
            L_0x00dd:
                r0.MediaSessionCompat$Token = r2
                goto L_0x0148
            L_0x00e0:
                if (r5 == 0) goto L_0x00f2
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.RatingCompat = r4
                goto L_0x0019
            L_0x00f2:
                r0.RatingCompat = r2
                goto L_0x0148
            L_0x00f5:
                if (r5 == 0) goto L_0x0107
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaMetadataCompat = r4
                goto L_0x0019
            L_0x0107:
                r0.MediaMetadataCompat = r2
                goto L_0x0148
            L_0x010a:
                if (r5 == 0) goto L_0x011c
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaBrowserCompat$ItemReceiver = r4
                goto L_0x0019
            L_0x011c:
                r0.MediaBrowserCompat$ItemReceiver = r2
                goto L_0x0148
            L_0x011f:
                if (r5 == 0) goto L_0x0131
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.write = r4
                goto L_0x0019
            L_0x0131:
                r0.write = r2
                goto L_0x0148
            L_0x0134:
                if (r5 == 0) goto L_0x0146
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.ParcelableVolumeInfo = r4
                goto L_0x0019
            L_0x0146:
                r0.ParcelableVolumeInfo = r2
            L_0x0148:
                r8.nextNull()
                goto L_0x0019
            L_0x014d:
                r8.endObject()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SupportMapFragment.zzb.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }
    }
}
