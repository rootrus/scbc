package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.HmlNTBLoanReviewActivity;

/* renamed from: o.HmlNTBPersonalInfoActivity */
public final class HmlNTBPersonalInfoActivity extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public HmlNTBPersonalInfoActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        HmlNTBLoanReviewActivity.read read = (HmlNTBLoanReviewActivity.read) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 329);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(read.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (read != read.read) {
            validatedagrecurse.read(jsonWriter, 576);
            HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding = read.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, HmlNTBAdditionalDocumentActivity_ViewBinding.class, (Object) hmlNTBAdditionalDocumentActivity_ViewBinding).write(jsonWriter, hmlNTBAdditionalDocumentActivity_ViewBinding);
        }
        if (read != read.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 617);
            String str = read.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        HmlNTBLoanReviewActivity.read read = new HmlNTBLoanReviewActivity.read();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 180) {
                if (write2 != 562) {
                    if (write2 != 574) {
                        jsonReader.skipValue();
                    } else if (z) {
                        read.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        read.IconCompatParcelizer = null;
                    }
                } else if (z) {
                    read.write = gson.getAdapter(Long.class).read(jsonReader).longValue();
                }
            } else if (z) {
                read.read = gson.getAdapter(HmlNTBAdditionalDocumentActivity_ViewBinding.class).read(jsonReader);
            } else {
                read.read = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return read;
    }
}
