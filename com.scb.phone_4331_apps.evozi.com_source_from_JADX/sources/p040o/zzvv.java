package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.zzvm;

/* renamed from: o.zzvv */
public final class zzvv extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;

    public zzvv(validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.IconCompatParcelizer.write(jsonWriter, obj == zzvm.write.FakeWhite ? 76 : obj == zzvm.write.FakeBlack ? 57 : -1);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        int IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(jsonReader);
        if (IconCompatParcelizer2 == 105) {
            return zzvm.write.FakeBlack;
        }
        if (IconCompatParcelizer2 != 298) {
            return null;
        }
        return zzvm.write.FakeWhite;
    }
}
