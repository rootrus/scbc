package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.BindFont */
public final class BindFont extends TypeToken<List<BindColor>> {

    /* renamed from: o.BindFont$TypefaceStyle */
    public final class TypefaceStyle extends TypeAdapter implements addKernel {
        private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
        private validateDAGRecurse read;
        private Gson write;

        public TypefaceStyle(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.write = gson;
            this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
            this.read = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            BindDimen bindDimen = (BindDimen) obj;
            Gson gson = this.write;
            validateDAGRecurse validatedagrecurse = this.read;
            jsonWriter.beginObject();
            if (bindDimen != bindDimen.IconCompatParcelizer) {
                validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
                String str = bindDimen.IconCompatParcelizer;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (bindDimen != bindDimen.MediaBrowserCompat$CustomActionResultReceiver) {
                validatedagrecurse.read(jsonWriter, 296);
                String str2 = bindDimen.MediaBrowserCompat$CustomActionResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            if (bindDimen != bindDimen.MediaBrowserCompat$ItemReceiver) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
                String str3 = bindDimen.MediaBrowserCompat$ItemReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
            }
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            BindDimen bindDimen = new BindDimen();
            Gson gson = this.write;
            validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int write2 = validatecycle.write(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (write2 != 123) {
                    if (write2 != 194) {
                        if (write2 != 201) {
                            jsonReader.skipValue();
                        } else if (z) {
                            bindDimen.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            bindDimen.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        bindDimen.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        bindDimen.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                } else if (z) {
                    bindDimen.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    bindDimen.MediaBrowserCompat$ItemReceiver = null;
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return bindDimen;
        }
    }
}
