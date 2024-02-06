package p040o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzuy */
public final class zzuy extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public zzuy(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzur zzur = (zzur) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (zzur != zzur.write) {
            validatedagrecurse.read(jsonWriter, 517);
            String str = zzur.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzur != zzur.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 524);
            String str2 = zzur.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzur != zzur.read) {
            validatedagrecurse.read(jsonWriter, 101);
            String str3 = zzur.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (zzur != zzur.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 401);
            String str4 = zzur.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (zzur != zzur.RatingCompat) {
            validatedagrecurse.read(jsonWriter, ModuleDescriptor.MODULE_VERSION);
            String str5 = zzur.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        zzur.write(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzur zzur = new zzur();
        Gson gson = this.write;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 51) {
                if (write2 != 409) {
                    if (write2 != 490) {
                        if (write2 != 602) {
                            if (write2 != 607) {
                                zzur.IconCompatParcelizer(gson, jsonReader, write2);
                            } else if (z) {
                                zzur.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                zzur.MediaBrowserCompat$SearchResultReceiver = null;
                            }
                        } else if (z) {
                            zzur.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            zzur.RatingCompat = null;
                        }
                    } else if (z) {
                        zzur.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zzur.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                } else if (z) {
                    zzur.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzur.write = null;
                }
            } else if (z) {
                zzur.read = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzur.read = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzur;
    }
}
