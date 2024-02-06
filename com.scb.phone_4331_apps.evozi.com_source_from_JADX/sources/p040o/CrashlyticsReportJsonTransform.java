package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.BinaryImagesConverter;
import p040o.CrashlyticsReport;

/* renamed from: o.CrashlyticsReportJsonTransform */
public final class CrashlyticsReportJsonTransform extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.CrashlyticsReportJsonTransform$ObjectParser */
    public final class ObjectParser {
        public static final write MediaBrowserCompat$ItemReceiver = new write((byte) 0);

        /* renamed from: o.CrashlyticsReportJsonTransform$ObjectParser$write */
        public static final class write {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public static BinaryImagesConverter.FileIdStrategy MediaBrowserCompat$CustomActionResultReceiver(String str) {
                onGetStartedClick.write((Object) str, "strPadding");
                String upperCase = str.toUpperCase();
                onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                int hashCode = upperCase.hashCode();
                if (hashCode != -1986416409) {
                    if (hashCode == 79011047 && upperCase.equals("SMALL")) {
                        return BinaryImagesConverter.FileIdStrategy.SMALL;
                    }
                } else if (upperCase.equals("NORMAL")) {
                    return BinaryImagesConverter.FileIdStrategy.NORMAL;
                }
                return BinaryImagesConverter.FileIdStrategy.UNKNOWN;
            }
        }
    }

    public CrashlyticsReportJsonTransform(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CrashlyticsReport.Session.Event.Log.Builder builder = (CrashlyticsReport.Session.Event.Log.Builder) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (builder != builder.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 71);
            String str = builder.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (builder != builder.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 515);
            String str2 = builder.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CrashlyticsReport.Session.Event.Log.Builder builder = new CrashlyticsReport.Session.Event.Log.Builder();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 346) {
                if (write != 608) {
                    jsonReader.skipValue();
                } else if (z) {
                    builder.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    builder.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                builder.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                builder.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return builder;
    }
}
