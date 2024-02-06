package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.getOs */
public final class getOs extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse read;
    private validateCycle write;

    public getOs(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.write = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        setGeneratorType setgeneratortype = (setGeneratorType) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (setgeneratortype != setgeneratortype.read) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA);
            Boolean bool = setgeneratortype.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Boolean.class, (Object) bool).write(jsonWriter, bool);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        setGeneratorType setgeneratortype = new setGeneratorType();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 255) {
                jsonReader.skipValue();
            } else if (z) {
                setgeneratortype.read = gson.getAdapter(Boolean.class).read(jsonReader);
            } else {
                setgeneratortype.read = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return setgeneratortype;
    }
}
