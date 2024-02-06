package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Optimizations;
import com.thunderhead.android.infrastructure.server.entitys.Viewpoint;
import java.io.IOException;

/* renamed from: o.BaseActivity */
public final class BaseActivity extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public BaseActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Optimizations optimizations = (Optimizations) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (optimizations != optimizations.data) {
            validatedagrecurse.read(jsonWriter, 315);
            String str = optimizations.data;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (optimizations != optimizations.dataMimeType) {
            validatedagrecurse.read(jsonWriter, 119);
            String str2 = optimizations.dataMimeType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (optimizations != optimizations.directives) {
            validatedagrecurse.read(jsonWriter, 264);
            String str3 = optimizations.directives;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (optimizations != optimizations.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str4 = optimizations.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (optimizations != optimizations.path) {
            validatedagrecurse.read(jsonWriter, 232);
            String str5 = optimizations.path;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (optimizations != optimizations.responseId) {
            validatedagrecurse.read(jsonWriter, 283);
            String str6 = optimizations.responseId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (optimizations != optimizations.viewpoint) {
            validatedagrecurse.read(jsonWriter, 568);
            Viewpoint viewpoint = optimizations.viewpoint;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Viewpoint.class, (Object) viewpoint).write(jsonWriter, viewpoint);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Optimizations optimizations = new Optimizations();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 120) {
                if (write2 != 273) {
                    if (write2 != 317) {
                        if (write2 != 415) {
                            if (write2 != 425) {
                                if (write2 != 486) {
                                    if (write2 != 616) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        optimizations.directives = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        optimizations.directives = null;
                                    }
                                } else if (z) {
                                    optimizations.path = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    optimizations.path = null;
                                }
                            } else if (z) {
                                optimizations.responseId = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                optimizations.responseId = null;
                            }
                        } else if (z) {
                            optimizations.data = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            optimizations.data = null;
                        }
                    } else if (z) {
                        optimizations.name = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        optimizations.name = null;
                    }
                } else if (z) {
                    optimizations.dataMimeType = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    optimizations.dataMimeType = null;
                }
            } else if (z) {
                optimizations.viewpoint = gson.getAdapter(Viewpoint.class).read(jsonReader);
            } else {
                optimizations.viewpoint = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return optimizations;
    }
}
