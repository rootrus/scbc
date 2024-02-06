package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: o.zzuz */
public final class zzuz extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle read;
    private Gson write;

    public zzuz(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzvj zzvj = (zzvj) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (zzvj != zzvj.write) {
            validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            String str = zzvj.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzvj != zzvj.read) {
            validatedagrecurse.read(jsonWriter, 421);
            String str2 = zzvj.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzvj != zzvj.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 407);
            String str3 = zzvj.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (zzvj != zzvj.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 255);
            String str4 = zzvj.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzvj zzvj = new zzvj();
        Gson gson = this.write;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 155) {
                if (write2 != 201) {
                    if (write2 != 326) {
                        if (write2 != 353) {
                            jsonReader.skipValue();
                        } else if (z) {
                            zzvj.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            zzvj.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        zzvj.read = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zzvj.read = null;
                    }
                } else if (z) {
                    zzvj.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzvj.write = null;
                }
            } else if (z) {
                zzvj.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzvj.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzvj;
    }
}
