package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzuq */
public final class zzuq extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse read;

    public zzuq(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((zzuk) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, jsonWriter, this.read);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzuk zzuk = new zzuk();
        zzuk.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, jsonReader, this.IconCompatParcelizer);
        return zzuk;
    }
}
