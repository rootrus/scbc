package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.zzwy */
public final class zzwy extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public zzwy(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzwl zzwl = (zzwl) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (zzwl != zzwl.read) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
            String str = zzwl.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzwl != zzwl.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384);
            String str2 = zzwl.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzwl zzwl = new zzwl();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 481) {
                if (write != 533) {
                    jsonReader.skipValue();
                } else if (z) {
                    zzwl.read = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzwl.read = null;
                }
            } else if (z) {
                zzwl.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzwl.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzwl;
    }
}
