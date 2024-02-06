package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzrs */
public final class zzrs extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse read;
    private validateCycle write;

    public zzrs(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.write = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((zzuj) obj).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, jsonWriter, this.read);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzuj zzuj = new zzuj();
        zzuj.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, jsonReader, this.write);
        return zzuj;
    }
}
