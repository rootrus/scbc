package p039io.gsonfire.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import p040o.DebitWithdrawalLimitActivity;

/* renamed from: io.gsonfire.gson.SimpleIterableTypeAdapter */
public final class SimpleIterableTypeAdapter extends TypeAdapter<DebitWithdrawalLimitActivity<?>> {
    private final Gson gson;
    private final Type type;

    public SimpleIterableTypeAdapter(Gson gson2, Type type2) {
        this.gson = gson2;
        this.type = type2;
    }

    public final void write(JsonWriter jsonWriter, DebitWithdrawalLimitActivity<?> debitWithdrawalLimitActivity) throws IOException {
        if (debitWithdrawalLimitActivity != null) {
            jsonWriter.beginArray();
            Iterator<?> it = debitWithdrawalLimitActivity.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                this.gson.toJson((Object) next, (Type) next.getClass(), jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.nullValue();
    }

    public final DebitWithdrawalLimitActivity<?> read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.gson.fromJson(jsonReader, this.type));
        }
        jsonReader.endArray();
        return DebitWithdrawalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList);
    }
}
