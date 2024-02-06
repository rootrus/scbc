package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: o.zzrv */
public final class zzrv extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle read;
    private validateDAGRecurse write;

    public zzrv(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.read = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzrz zzrz = (zzrz) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (zzrz != zzrz.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            String str = zzrz.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzrz != zzrz.read) {
            validatedagrecurse.read(jsonWriter, 421);
            String str2 = zzrz.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzrz zzrz = new zzrz();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 201) {
                if (write2 != 326) {
                    jsonReader.skipValue();
                } else if (z) {
                    zzrz.read = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzrz.read = null;
                }
            } else if (z) {
                zzrz.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzrz.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzrz;
    }
}
