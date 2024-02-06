package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzwa */
public final class zzwa extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle write;

    public zzwa(validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.IconCompatParcelizer.write(jsonWriter, obj == zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE ? 107 : obj == zzvm$MediaBrowserCompat$CustomActionResultReceiver.TEXT ? 367 : -1);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        int IconCompatParcelizer2 = this.write.IconCompatParcelizer(jsonReader);
        if (IconCompatParcelizer2 == 339) {
            return zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE;
        }
        if (IconCompatParcelizer2 != 381) {
            return null;
        }
        return zzvm$MediaBrowserCompat$CustomActionResultReceiver.TEXT;
    }
}
