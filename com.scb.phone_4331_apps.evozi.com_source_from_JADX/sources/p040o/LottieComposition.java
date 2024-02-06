package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.writeToParcel;

/* renamed from: o.LottieComposition */
public final class LottieComposition extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse read;
    private validateCycle write;

    /* renamed from: o.LottieComposition$Factory */
    public class Factory extends setCurrentItemInternal {
        @SerializedName("depositAmount")
        public double IconCompatParcelizer;
        @SerializedName("interestAmount")
        public double MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("depositNumber")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("maturityDate")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("sortSequence")
        public int MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("tenor")
        public int MediaDescriptionCompat;
        @SerializedName("tenorUnit")
        public setOnPageChangeListener MediaMetadataCompat;
        @SerializedName("tax")
        public String RatingCompat;
        @SerializedName("depositDate")
        public String read;
        @SerializedName("interestRate")
        public double write;

        /* renamed from: o.LottieComposition$Factory$ListenerAdapter */
        public class ListenerAdapter {
            @SerializedName("key")
            public String IconCompatParcelizer;
            @SerializedName("help")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("question")
            public String MediaBrowserCompat$ItemReceiver;
            @SerializedName("sortSequence")
            public String read;
            @SerializedName("imageURL")
            public String write;
        }
    }

    public LottieComposition(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.write = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        writeToParcel.write write2 = (writeToParcel.write) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (write2 != write2.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 243);
            String str = write2.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (write2 != write2.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 492);
            String str2 = write2.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        writeToParcel.write write2 = new writeToParcel.write();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write3 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write3 != 318) {
                if (write3 != 447) {
                    jsonReader.skipValue();
                } else if (z) {
                    write2.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    write2.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                write2.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                write2.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return write2;
    }
}
