package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.requests.ElementDataRequest;
import java.io.IOException;

/* renamed from: o.onNextClick */
public final class onNextClick extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle read;
    private validateDAGRecurse write;

    public onNextClick(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.read = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((ElementDataRequest) obj).write(this.IconCompatParcelizer, jsonWriter, this.write);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ElementDataRequest elementDataRequest = new ElementDataRequest();
        elementDataRequest.IconCompatParcelizer(this.IconCompatParcelizer, jsonReader, this.read);
        return elementDataRequest;
    }
}
