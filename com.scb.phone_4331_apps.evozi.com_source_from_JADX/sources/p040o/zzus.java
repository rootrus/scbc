package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzus */
public final class zzus extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle read;
    private validateDAGRecurse write;

    public zzus(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.read = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((zzuh) obj).IconCompatParcelizer(this.IconCompatParcelizer, jsonWriter, this.write);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzuh zzuh = new zzuh();
        zzuh.write(this.IconCompatParcelizer, jsonReader, this.read);
        return zzuh;
    }
}
