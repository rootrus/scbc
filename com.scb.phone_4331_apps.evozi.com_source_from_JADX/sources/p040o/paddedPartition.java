package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;

/* renamed from: o.paddedPartition */
public class paddedPartition<V> {
    public V MediaBrowserCompat$ItemReceiver;

    public paddedPartition() {
    }

    public paddedPartition(V v) {
        this.MediaBrowserCompat$ItemReceiver = v;
    }

    /* renamed from: o.paddedPartition$IconCompatParcelizer */
    public static class IconCompatParcelizer implements TypeAdapterFactory {
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != paddedPartition.class) {
                return null;
            }
            final TypeAdapter<?> delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get(((ParameterizedType) typeToken.getType()).getActualTypeArguments()[0]));
            return new TypeAdapter<paddedPartition<V>>() {
                public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    paddedPartition paddedpartition = (paddedPartition) obj;
                    Object write = paddedpartition == null ? null : paddedpartition.MediaBrowserCompat$ItemReceiver;
                    if (write != null || jsonWriter.getSerializeNulls()) {
                        TypeAdapter.this.write(jsonWriter, write);
                        return;
                    }
                    jsonWriter.setSerializeNulls(true);
                    jsonWriter.nullValue();
                    jsonWriter.setSerializeNulls(false);
                }

                public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
                    return new paddedPartition(TypeAdapter.this.read(jsonReader));
                }
            };
        }
    }
}
