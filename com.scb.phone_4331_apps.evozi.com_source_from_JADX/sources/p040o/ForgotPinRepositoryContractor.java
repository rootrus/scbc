package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration;
import java.io.IOException;

/* renamed from: o.ForgotPinRepositoryContractor */
public final class ForgotPinRepositoryContractor extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public ForgotPinRepositoryContractor(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CustomerKeyConfiguration customerKeyConfiguration = (CustomerKeyConfiguration) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (customerKeyConfiguration != customerKeyConfiguration.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str = customerKeyConfiguration.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (customerKeyConfiguration != customerKeyConfiguration.type) {
            validatedagrecurse.read(jsonWriter, 489);
            String str2 = customerKeyConfiguration.type;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CustomerKeyConfiguration customerKeyConfiguration = new CustomerKeyConfiguration();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 317) {
                if (write2 != 477) {
                    jsonReader.skipValue();
                } else if (z) {
                    customerKeyConfiguration.type = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    customerKeyConfiguration.type = null;
                }
            } else if (z) {
                customerKeyConfiguration.name = gson.getAdapter(String.class).read(jsonReader);
            } else {
                customerKeyConfiguration.name = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return customerKeyConfiguration;
    }
}
