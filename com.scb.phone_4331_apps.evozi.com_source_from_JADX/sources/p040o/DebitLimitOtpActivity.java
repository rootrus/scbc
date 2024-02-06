package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.DebitLimitOtpActivity */
public final class DebitLimitOtpActivity<T> extends TypeAdapter<T> {
    private final TypeAdapter<T> IconCompatParcelizer;

    public DebitLimitOtpActivity(TypeAdapter<T> typeAdapter) {
        this.IconCompatParcelizer = typeAdapter;
    }

    public final void write(JsonWriter jsonWriter, T t) throws IOException {
        if (t == null) {
            jsonWriter.nullValue();
        } else {
            this.IconCompatParcelizer.write(jsonWriter, t);
        }
    }

    public final T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return this.IconCompatParcelizer.read(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }
}
