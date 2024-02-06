package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.zzux */
public final class zzux extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle read;
    private validateDAGRecurse write;

    public zzux(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.read = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzry zzry = (zzry) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (zzry != zzry.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
            String str = zzry.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzry != zzry.write) {
            validatedagrecurse.read(jsonWriter, 413);
            String str2 = zzry.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzry != zzry.read) {
            validatedagrecurse.read(jsonWriter, 81);
            zzrz zzrz = zzry.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzrz.class, (Object) zzrz).write(jsonWriter, zzrz);
        }
        zzry.write(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzry zzry = new zzry();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 128) {
                if (write2 != 134) {
                    if (write2 != 431) {
                        zzry.IconCompatParcelizer(gson, jsonReader, write2);
                    } else if (z) {
                        zzry.write = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zzry.write = null;
                    }
                } else if (z) {
                    zzry.read = gson.getAdapter(zzrz.class).read(jsonReader);
                } else {
                    zzry.read = null;
                }
            } else if (z) {
                zzry.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzry.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzry;
    }
}
