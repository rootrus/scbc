package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.DependencyCycleException */
public final class DependencyCycleException extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle read;
    private Gson write;

    public DependencyCycleException(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        DependencyException dependencyException = (DependencyException) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (dependencyException != dependencyException.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 1);
            isSet isset = dependencyException.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, isSet.class, (Object) isset).write(jsonWriter, isset);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DependencyException dependencyException = new DependencyException();
        Gson gson = this.write;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 68) {
                jsonReader.skipValue();
            } else if (z) {
                dependencyException.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(isSet.class).read(jsonReader);
            } else {
                dependencyException.MediaBrowserCompat$CustomActionResultReceiver = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return dependencyException;
    }
}
