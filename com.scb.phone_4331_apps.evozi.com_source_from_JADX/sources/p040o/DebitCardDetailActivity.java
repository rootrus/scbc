package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;

/* renamed from: o.DebitCardDetailActivity */
public final class DebitCardDetailActivity<T extends Enum> implements TypeAdapterFactory {
    private final Class<T> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final T write;

    public DebitCardDetailActivity(Class<T> cls, T t) {
        this.MediaBrowserCompat$ItemReceiver = cls;
        this.write = t;
    }

    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!this.MediaBrowserCompat$ItemReceiver.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, typeToken);
        return new DebitLimitOtpActivity(new TypeAdapter<T>() {
            public final void write(JsonWriter jsonWriter, T t) throws IOException {
                delegateAdapter.write(jsonWriter, t);
            }

            public final T read(JsonReader jsonReader) throws IOException {
                T read = delegateAdapter.read(jsonReader);
                return read == null ? DebitCardDetailActivity.this.write : read;
            }
        });
    }
}
