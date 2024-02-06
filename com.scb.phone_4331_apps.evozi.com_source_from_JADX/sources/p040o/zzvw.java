package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.zzag;
import p040o.zzvm;

/* renamed from: o.zzvw */
public final class zzvw extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;
    private validateDAGRecurse write;

    public zzvw(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzvm zzvm = (zzvm) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (zzvm != zzvm.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 289);
            String str = zzvm.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzvm != zzvm.write) {
            validatedagrecurse.read(jsonWriter, 92);
            String str2 = zzvm.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzvm != zzvm.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 207);
            zzag.zza zza = zzvm.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzag.zza.class, (Object) zza).write(jsonWriter, zza);
        }
        if (zzvm != zzvm.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 444);
            zzag.zza zza2 = zzvm.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzag.zza.class, (Object) zza2).write(jsonWriter, zza2);
        }
        if (zzvm != zzvm.read) {
            validatedagrecurse.read(jsonWriter, 421);
            zzag.zza zza3 = zzvm.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzag.zza.class, (Object) zza3).write(jsonWriter, zza3);
        }
        if (zzvm != zzvm.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 103);
            zzvm.write write2 = zzvm.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzvm.write.class, (Object) write2).write(jsonWriter, write2);
        }
        if (zzvm != zzvm.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 351);
            zzvm$MediaBrowserCompat$CustomActionResultReceiver zzvm_mediabrowsercompat_customactionresultreceiver = zzvm.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzvm$MediaBrowserCompat$CustomActionResultReceiver.class, (Object) zzvm_mediabrowsercompat_customactionresultreceiver).write(jsonWriter, zzvm_mediabrowsercompat_customactionresultreceiver);
        }
        if (zzvm != zzvm.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 407);
            zzag.zza zza4 = zzvm.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzag.zza.class, (Object) zza4).write(jsonWriter, zza4);
        }
        if (zzvm != zzvm.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 558);
            zzag.zza zza5 = zzvm.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzag.zza.class, (Object) zza5).write(jsonWriter, zza5);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzvm zzvm = new zzvm();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 23) {
                if (write2 != 224) {
                    if (write2 != 301) {
                        if (write2 != 326) {
                            if (write2 != 353) {
                                if (write2 != 491) {
                                    if (write2 != 555) {
                                        if (write2 != 594) {
                                            if (write2 != 606) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                zzvm.MediaBrowserCompat$MediaItem = gson.getAdapter(zzvm$MediaBrowserCompat$CustomActionResultReceiver.class).read(jsonReader);
                                            } else {
                                                zzvm.MediaBrowserCompat$MediaItem = null;
                                            }
                                        } else if (z) {
                                            zzvm.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(zzag.zza.class).read(jsonReader);
                                        } else {
                                            zzvm.MediaBrowserCompat$CustomActionResultReceiver = null;
                                        }
                                    } else if (z) {
                                        zzvm.RatingCompat = gson.getAdapter(zzvm.write.class).read(jsonReader);
                                    } else {
                                        zzvm.RatingCompat = null;
                                    }
                                } else if (z) {
                                    zzvm.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    zzvm.MediaBrowserCompat$ItemReceiver = null;
                                }
                            } else if (z) {
                                zzvm.MediaMetadataCompat = gson.getAdapter(zzag.zza.class).read(jsonReader);
                            } else {
                                zzvm.MediaMetadataCompat = null;
                            }
                        } else if (z) {
                            zzvm.read = gson.getAdapter(zzag.zza.class).read(jsonReader);
                        } else {
                            zzvm.read = null;
                        }
                    } else if (z) {
                        zzvm.IconCompatParcelizer = gson.getAdapter(zzag.zza.class).read(jsonReader);
                    } else {
                        zzvm.IconCompatParcelizer = null;
                    }
                } else if (z) {
                    zzvm.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzvm.write = null;
                }
            } else if (z) {
                zzvm.MediaDescriptionCompat = gson.getAdapter(zzag.zza.class).read(jsonReader);
            } else {
                zzvm.MediaDescriptionCompat = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzvm;
    }
}
