package p040o;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: o.zzuh */
public class zzuh {
    public zzrm IconCompatParcelizer;

    public /* synthetic */ zzuh() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void read(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 541) {
            jsonReader.skipValue();
        } else if (z) {
            this.IconCompatParcelizer = gson.getAdapter(zzrm.class).read(jsonReader);
        } else {
            this.IconCompatParcelizer = null;
            jsonReader.nextNull();
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void read(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 538);
            zzrm zzrm = this.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzrm.class, (Object) zzrm).write(jsonWriter, zzrm);
        }
    }

    public final /* synthetic */ void write(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            read(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }

    public zzuh(zzrm zzrm) {
        this.IconCompatParcelizer = zzrm;
    }
}
