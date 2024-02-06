package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Content;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import java.io.IOException;

/* renamed from: o.EmailOtpPresenter */
public final class EmailOtpPresenter extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle read;
    private Gson write;

    public EmailOtpPresenter(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OptimizationActions.Action.Asset asset = (OptimizationActions.Action.Asset) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (asset != asset.content) {
            validatedagrecurse.read(jsonWriter, 584);
            String str = asset.content;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (asset != asset.contentObject) {
            validatedagrecurse.read(jsonWriter, 431);
            Content content = asset.contentObject;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Content.class, (Object) content).write(jsonWriter, content);
        }
        if (asset != asset.contentUrl) {
            validatedagrecurse.read(jsonWriter, 535);
            String str2 = asset.contentUrl;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (asset != asset.mimeType) {
            validatedagrecurse.read(jsonWriter, 575);
            String str3 = asset.mimeType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (asset != asset.responses) {
            validatedagrecurse.read(jsonWriter, 326);
            OptimizationActions.Action.Asset.Response[] responseArr = asset.responses;
            findNode.MediaBrowserCompat$ItemReceiver(gson, OptimizationActions.Action.Asset.Response[].class, (Object) responseArr).write(jsonWriter, responseArr);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        OptimizationActions.Action.Asset asset = new OptimizationActions.Action.Asset();
        Gson gson = this.write;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 6) {
                if (write2 != 191) {
                    if (write2 != 400) {
                        if (write2 != 437) {
                            if (write2 != 487) {
                                jsonReader.skipValue();
                            } else if (z) {
                                asset.mimeType = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                asset.mimeType = null;
                            }
                        } else if (z) {
                            asset.content = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            asset.content = null;
                        }
                    } else if (z) {
                        asset.contentObject = gson.getAdapter(Content.class).read(jsonReader);
                    } else {
                        asset.contentObject = null;
                    }
                } else if (z) {
                    asset.responses = gson.getAdapter(OptimizationActions.Action.Asset.Response[].class).read(jsonReader);
                } else {
                    asset.responses = null;
                }
            } else if (z) {
                asset.contentUrl = gson.getAdapter(String.class).read(jsonReader);
            } else {
                asset.contentUrl = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return asset;
    }
}
