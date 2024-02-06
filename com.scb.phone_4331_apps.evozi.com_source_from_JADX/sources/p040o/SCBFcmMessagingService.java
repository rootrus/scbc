package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import java.io.IOException;

/* renamed from: o.SCBFcmMessagingService */
public final class SCBFcmMessagingService extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public SCBFcmMessagingService(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OptimizationActions optimizationActions = (OptimizationActions) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (optimizationActions != optimizationActions.actions) {
            validatedagrecurse.read(jsonWriter, 8);
            OptimizationActions.Action[] actionArr = optimizationActions.actions;
            findNode.MediaBrowserCompat$ItemReceiver(gson, OptimizationActions.Action[].class, (Object) actionArr).write(jsonWriter, actionArr);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        OptimizationActions optimizationActions = new OptimizationActions();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 341) {
                jsonReader.skipValue();
            } else if (z) {
                optimizationActions.actions = gson.getAdapter(OptimizationActions.Action[].class).read(jsonReader);
            } else {
                optimizationActions.actions = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return optimizationActions;
    }
}
