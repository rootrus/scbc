package p040o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: o.zzuk */
public class zzuk {
    @SerializedName("status")
    public zzvj IconCompatParcelizer;

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 63) {
            jsonReader.skipValue();
        } else if (z) {
            this.IconCompatParcelizer = gson.getAdapter(zzvj.class).read(jsonReader);
        } else {
            this.IconCompatParcelizer = null;
            jsonReader.nextNull();
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IconCompatParcelizer(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        MediaBrowserCompat$CustomActionResultReceiver(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 529);
            zzvj zzvj = this.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzvj.class, (Object) zzvj).write(jsonWriter, zzvj);
        }
    }

    public final zzvj IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public zzuk read(zzvj zzvj) {
        this.IconCompatParcelizer = zzvj;
        return this;
    }
}
