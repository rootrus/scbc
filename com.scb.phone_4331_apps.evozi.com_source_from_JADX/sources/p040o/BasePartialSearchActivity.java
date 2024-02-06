package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.InteractionData;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionErrorResponse;
import java.io.IOException;

/* renamed from: o.BasePartialSearchActivity */
public final class BasePartialSearchActivity extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;
    private validateDAGRecurse write;

    public BasePartialSearchActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        InteractionRegionErrorResponse interactionRegionErrorResponse = (InteractionRegionErrorResponse) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (interactionRegionErrorResponse != interactionRegionErrorResponse.data) {
            validatedagrecurse.read(jsonWriter, 315);
            InteractionData interactionData = interactionRegionErrorResponse.data;
            findNode.MediaBrowserCompat$ItemReceiver(gson, InteractionData.class, (Object) interactionData).write(jsonWriter, interactionData);
        }
        if (interactionRegionErrorResponse != interactionRegionErrorResponse.message) {
            validatedagrecurse.read(jsonWriter, 499);
            String str = interactionRegionErrorResponse.message;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (interactionRegionErrorResponse != interactionRegionErrorResponse.messageI18nKey) {
            validatedagrecurse.read(jsonWriter, 277);
            String str2 = interactionRegionErrorResponse.messageI18nKey;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (interactionRegionErrorResponse != interactionRegionErrorResponse.messageI18nKeyParams) {
            validatedagrecurse.read(jsonWriter, 428);
            Object[] objArr = interactionRegionErrorResponse.messageI18nKeyParams;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Object[].class, (Object) objArr).write(jsonWriter, objArr);
        }
        validatedagrecurse.read(jsonWriter, 529);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(interactionRegionErrorResponse.status);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, 272);
        Class cls2 = Boolean.TYPE;
        Boolean valueOf2 = Boolean.valueOf(interactionRegionErrorResponse.success);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (interactionRegionErrorResponse != interactionRegionErrorResponse.uuid) {
            validatedagrecurse.read(jsonWriter, 416);
            String str3 = interactionRegionErrorResponse.uuid;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        InteractionRegionErrorResponse interactionRegionErrorResponse = new InteractionRegionErrorResponse();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 48) {
                if (write2 != 63) {
                    if (write2 != 207) {
                        if (write2 != 248) {
                            if (write2 != 361) {
                                if (write2 != 415) {
                                    if (write2 != 480) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        interactionRegionErrorResponse.success = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                                    }
                                } else if (z) {
                                    interactionRegionErrorResponse.data = gson.getAdapter(InteractionData.class).read(jsonReader);
                                } else {
                                    interactionRegionErrorResponse.data = null;
                                }
                            } else if (z) {
                                interactionRegionErrorResponse.message = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                interactionRegionErrorResponse.message = null;
                            }
                        } else if (z) {
                            interactionRegionErrorResponse.uuid = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            interactionRegionErrorResponse.uuid = null;
                        }
                    } else if (z) {
                        interactionRegionErrorResponse.messageI18nKeyParams = gson.getAdapter(Object[].class).read(jsonReader);
                    } else {
                        interactionRegionErrorResponse.messageI18nKeyParams = null;
                    }
                } else if (z) {
                    interactionRegionErrorResponse.status = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                }
            } else if (z) {
                interactionRegionErrorResponse.messageI18nKey = gson.getAdapter(String.class).read(jsonReader);
            } else {
                interactionRegionErrorResponse.messageI18nKey = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return interactionRegionErrorResponse;
    }
}
