package p040o;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/* renamed from: o.remainingCapacity */
public class remainingCapacity {
    public boolean write;

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 359) {
            jsonReader.skipValue();
        } else if (z) {
            this.write = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
        } else {
            jsonReader.nextNull();
        }
    }
}
