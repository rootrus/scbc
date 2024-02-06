package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: o.ManageEmailInputPresenter */
public final class ManageEmailInputPresenter extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson read;
    private validateCycle write;

    public ManageEmailInputPresenter(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.write = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OptimizationActions.Action.Asset.Response response = (OptimizationActions.Action.Asset.Response) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (response != response.code) {
            validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            String str = response.code;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (response != response.imageUrl) {
            validatedagrecurse.read(jsonWriter, 558);
            String str2 = response.imageUrl;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (response != response.label) {
            validatedagrecurse.read(jsonWriter, 492);
            String str3 = response.label;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (response != response.sentiment) {
            validatedagrecurse.read(jsonWriter, 432);
            String str4 = response.sentiment;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (response != response.target) {
            validatedagrecurse.read(jsonWriter, 118);
            String str5 = response.target;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (response != response.targetUrl) {
            validatedagrecurse.read(jsonWriter, 386);
            String str6 = response.targetUrl;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        OptimizationActions.Action.Asset.Response response = new OptimizationActions.Action.Asset.Response();
        Gson gson = this.read;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 23) {
                if (write2 != 70) {
                    if (write2 != 193) {
                        if (write2 != 201) {
                            if (write2 != 318) {
                                if (write2 != 623) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    response.sentiment = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    response.sentiment = null;
                                }
                            } else if (z) {
                                response.label = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                response.label = null;
                            }
                        } else if (z) {
                            response.code = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            response.code = null;
                        }
                    } else if (z) {
                        response.target = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        response.target = null;
                    }
                } else if (z) {
                    response.targetUrl = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    response.targetUrl = null;
                }
            } else if (z) {
                response.imageUrl = gson.getAdapter(String.class).read(jsonReader);
            } else {
                response.imageUrl = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return response;
    }
}
