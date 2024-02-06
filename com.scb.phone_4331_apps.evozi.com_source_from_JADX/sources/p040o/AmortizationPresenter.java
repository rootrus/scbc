package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Content;
import com.thunderhead.android.infrastructure.server.entitys.ContentImage;
import com.thunderhead.android.infrastructure.server.entitys.ContentMessage;
import java.io.IOException;

/* renamed from: o.AmortizationPresenter */
public final class AmortizationPresenter extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public AmortizationPresenter(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Content content = (Content) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (content != content.backgroundColor) {
            validatedagrecurse.read(jsonWriter, 27);
            String str = content.backgroundColor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (content != content.image) {
            validatedagrecurse.read(jsonWriter, 263);
            ContentImage contentImage = content.image;
            findNode.MediaBrowserCompat$ItemReceiver(gson, ContentImage.class, (Object) contentImage).write(jsonWriter, contentImage);
        }
        if (content != content.message) {
            validatedagrecurse.read(jsonWriter, 499);
            ContentMessage contentMessage = content.message;
            findNode.MediaBrowserCompat$ItemReceiver(gson, ContentMessage.class, (Object) contentMessage).write(jsonWriter, contentMessage);
        }
        validatedagrecurse.read(jsonWriter, 514);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(content.presentationTime);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (content != content.type) {
            validatedagrecurse.read(jsonWriter, 489);
            String str2 = content.type;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (content != content.webOneTagUrl) {
            validatedagrecurse.read(jsonWriter, 54);
            String str3 = content.webOneTagUrl;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Content content = new Content();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 104) {
                if (write != 150) {
                    if (write != 296) {
                        if (write != 361) {
                            if (write != 477) {
                                if (write != 508) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    content.image = gson.getAdapter(ContentImage.class).read(jsonReader);
                                } else {
                                    content.image = null;
                                }
                            } else if (z) {
                                content.type = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                content.type = null;
                            }
                        } else if (z) {
                            content.message = gson.getAdapter(ContentMessage.class).read(jsonReader);
                        } else {
                            content.message = null;
                        }
                    } else if (z) {
                        content.presentationTime = gson.getAdapter(Long.class).read(jsonReader).longValue();
                    }
                } else if (z) {
                    content.backgroundColor = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    content.backgroundColor = null;
                }
            } else if (z) {
                content.webOneTagUrl = gson.getAdapter(String.class).read(jsonReader);
            } else {
                content.webOneTagUrl = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return content;
    }
}
