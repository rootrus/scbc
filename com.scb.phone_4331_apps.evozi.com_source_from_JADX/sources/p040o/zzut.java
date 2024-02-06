package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.zzut */
public final class zzut extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;

    public zzut(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzun zzun = (zzun) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (zzun != zzun.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
            String str = zzun.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzun != zzun.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 413);
            String str2 = zzun.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzun != zzun.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 223);
            String str3 = zzun.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (zzun != zzun.read) {
            validatedagrecurse.read(jsonWriter, 336);
            Integer num = zzun.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num).write(jsonWriter, num);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzun zzun = new zzun();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 128) {
                if (write != 431) {
                    if (write != 443) {
                        if (write != 525) {
                            jsonReader.skipValue();
                        } else if (z) {
                            zzun.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            zzun.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        zzun.read = gson.getAdapter(Integer.class).read(jsonReader);
                    } else {
                        zzun.read = null;
                    }
                } else if (z) {
                    zzun.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzun.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                zzun.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzun.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzun;
    }
}
