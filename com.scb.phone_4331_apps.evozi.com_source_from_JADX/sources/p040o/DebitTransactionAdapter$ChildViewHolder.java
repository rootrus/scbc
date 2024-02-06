package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* renamed from: o.DebitTransactionAdapter$ChildViewHolder */
public final class DebitTransactionAdapter$ChildViewHolder<T> implements TypeAdapterFactory {
    private final Map<Class<T>, DebitTransactionAdapter$ChildViewHolder_ViewBinding<T, String>> MediaBrowserCompat$CustomActionResultReceiver;

    public DebitTransactionAdapter$ChildViewHolder(Map<Class<T>, DebitTransactionAdapter$ChildViewHolder_ViewBinding<T, String>> map) {
        this.MediaBrowserCompat$CustomActionResultReceiver = map;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.gson.reflect.TypeToken<T>, com.google.gson.reflect.TypeToken] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r4, com.google.gson.reflect.TypeToken<T> r5) {
        /*
            r3 = this;
            com.google.gson.TypeAdapter r0 = r4.getDelegateAdapter(r3, r5)
            java.lang.Class r5 = r5.getRawType()
        L_0x0008:
            if (r5 == 0) goto L_0x001a
            java.util.Map<java.lang.Class<T>, o.DebitTransactionAdapter$ChildViewHolder_ViewBinding<T, java.lang.String>> r1 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r1.get(r5)
            o.DebitTransactionAdapter$ChildViewHolder_ViewBinding r1 = (p040o.DebitTransactionAdapter$ChildViewHolder_ViewBinding) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            java.lang.Class r5 = r5.getSuperclass()
            goto L_0x0008
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            o.DebitLimitOtpActivity r5 = new o.DebitLimitOtpActivity
            o.DebitTransactionAdapter$ChildViewHolder$read r2 = new o.DebitTransactionAdapter$ChildViewHolder$read
            r2.<init>(r1, r4, r0)
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DebitTransactionAdapter$ChildViewHolder.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    /* renamed from: o.DebitTransactionAdapter$ChildViewHolder$read */
    class read<T> extends TypeAdapter<T> {
        private final DebitTransactionAdapter$ChildViewHolder_ViewBinding<T, String> IconCompatParcelizer;
        private final TypeAdapter<T> MediaBrowserCompat$ItemReceiver;
        private final Gson write;

        public read(DebitTransactionAdapter$ChildViewHolder_ViewBinding<T, String> debitTransactionAdapter$ChildViewHolder_ViewBinding, Gson gson, TypeAdapter<T> typeAdapter) {
            this.IconCompatParcelizer = debitTransactionAdapter$ChildViewHolder_ViewBinding;
            this.write = gson;
            this.MediaBrowserCompat$ItemReceiver = typeAdapter;
        }

        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                this.MediaBrowserCompat$ItemReceiver.write(jsonWriter, t);
                return;
            }
            JsonElement jsonTree = this.MediaBrowserCompat$ItemReceiver.toJsonTree(t);
            JsonObject jsonObject = new JsonObject();
            jsonObject.add(this.IconCompatParcelizer.IconCompatParcelizer(), jsonTree);
            this.write.toJson((JsonElement) jsonObject, jsonWriter);
        }

        public final T read(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            jsonReader.nextName();
            T read = this.MediaBrowserCompat$ItemReceiver.read(jsonReader);
            jsonReader.endObject();
            return read;
        }
    }
}
