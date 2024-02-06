package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getPathFromData */
public final class getPathFromData extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle read;
    private Gson write;

    public getPathFromData(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Utils utils = (Utils) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (utils != utils.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 117);
            String str = utils.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (utils != utils.read) {
            validatedagrecurse.read(jsonWriter, 421);
            String str2 = utils.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (utils != utils.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 407);
            String str3 = utils.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (utils != utils.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 357);
            String str4 = utils.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (utils != utils.write) {
            validatedagrecurse.read(jsonWriter, 403);
            String str5 = utils.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (utils != utils.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 489);
            String str6 = utils.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Utils utils = new Utils();
        Gson gson = this.write;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 184) {
                if (write2 != 326) {
                    if (write2 != 353) {
                        if (write2 != 398) {
                            if (write2 != 405) {
                                if (write2 != 477) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    utils.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    utils.RatingCompat = null;
                                }
                            } else if (z) {
                                utils.write = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                utils.write = null;
                            }
                        } else if (z) {
                            utils.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            utils.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                    } else if (z) {
                        utils.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        utils.MediaBrowserCompat$ItemReceiver = null;
                    }
                } else if (z) {
                    utils.read = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    utils.read = null;
                }
            } else if (z) {
                utils.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                utils.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return utils;
    }
}
