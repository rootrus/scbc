package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: o.ScbsAccountDetailPresenter */
public final class ScbsAccountDetailPresenter extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public ScbsAccountDetailPresenter(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OptimizationActions.Action.Proposition proposition = (OptimizationActions.Action.Proposition) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (proposition != proposition.code) {
            validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            String str = proposition.code;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        OptimizationActions.Action.Proposition proposition = new OptimizationActions.Action.Proposition();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 201) {
                jsonReader.skipValue();
            } else if (z) {
                proposition.code = gson.getAdapter(String.class).read(jsonReader);
            } else {
                proposition.code = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return proposition;
    }
}
