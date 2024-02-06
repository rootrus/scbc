package p040o;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.validateDAGRecurse */
public interface validateDAGRecurse {
    void read(JsonWriter jsonWriter, int i) throws IOException;

    void write(JsonWriter jsonWriter, int i) throws IOException;
}
