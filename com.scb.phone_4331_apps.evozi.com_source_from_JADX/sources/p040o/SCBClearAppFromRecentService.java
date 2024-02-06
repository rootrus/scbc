package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import java.io.IOException;

/* renamed from: o.SCBClearAppFromRecentService */
public final class SCBClearAppFromRecentService extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse write;

    public SCBClearAppFromRecentService(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OptimizationActions.Action action = (OptimizationActions.Action) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (action != action.asset) {
            validatedagrecurse.read(jsonWriter, 577);
            OptimizationActions.Action.Asset asset = action.asset;
            findNode.MediaBrowserCompat$ItemReceiver(gson, OptimizationActions.Action.Asset.class, (Object) asset).write(jsonWriter, asset);
        }
        if (action != action.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str = action.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (action != action.proposition) {
            validatedagrecurse.read(jsonWriter, 72);
            OptimizationActions.Action.Proposition proposition = action.proposition;
            findNode.MediaBrowserCompat$ItemReceiver(gson, OptimizationActions.Action.Proposition.class, (Object) proposition).write(jsonWriter, proposition);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        OptimizationActions.Action action = new OptimizationActions.Action();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 109) {
                if (write2 != 317) {
                    if (write2 != 362) {
                        jsonReader.skipValue();
                    } else if (z) {
                        action.proposition = gson.getAdapter(OptimizationActions.Action.Proposition.class).read(jsonReader);
                    } else {
                        action.proposition = null;
                    }
                } else if (z) {
                    action.name = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    action.name = null;
                }
            } else if (z) {
                action.asset = gson.getAdapter(OptimizationActions.Action.Asset.class).read(jsonReader);
            } else {
                action.asset = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return action;
    }
}
