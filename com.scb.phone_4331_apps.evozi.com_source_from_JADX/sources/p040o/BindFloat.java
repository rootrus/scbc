package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.BindFloat */
public final class BindFloat extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public BindFloat(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BindColor bindColor = (BindColor) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (bindColor != bindColor.read) {
            validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            String str = bindColor.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (bindColor != bindColor.write) {
            validatedagrecurse.read(jsonWriter, 296);
            String str2 = bindColor.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (bindColor != bindColor.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
            String str3 = bindColor.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BindColor bindColor = new BindColor();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 123) {
                if (write != 194) {
                    if (write != 201) {
                        jsonReader.skipValue();
                    } else if (z) {
                        bindColor.read = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        bindColor.read = null;
                    }
                } else if (z) {
                    bindColor.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    bindColor.write = null;
                }
            } else if (z) {
                bindColor.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                bindColor.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return bindColor;
    }
}
