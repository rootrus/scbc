package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: o.DocumentDataParser */
public final class DocumentDataParser extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson write;

    public DocumentDataParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AnimatableValueParser animatableValueParser = (AnimatableValueParser) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 129);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(animatableValueParser.MediaBrowserCompat$ItemReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (animatableValueParser != animatableValueParser.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 274);
            parseDocumentData parsedocumentdata = new parseDocumentData();
            List<parseFloat> list = animatableValueParser.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) parsedocumentdata, (Object) list).write(jsonWriter, list);
        }
        validatedagrecurse.read(jsonWriter, 269);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(animatableValueParser.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (animatableValueParser != animatableValueParser.read) {
            validatedagrecurse.read(jsonWriter, 82);
            parseColor parsecolor = new parseColor();
            List<getOpacityAtPosition> list2 = animatableValueParser.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) parsecolor, (Object) list2).write(jsonWriter, list2);
        }
        validatedagrecurse.read(jsonWriter, 462);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(animatableValueParser.IconCompatParcelizer);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        if (animatableValueParser != animatableValueParser.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 393);
            isSkewAngleIdentity isskewangleidentity = new isSkewAngleIdentity();
            List<getOpacityAtPosition> list3 = animatableValueParser.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) isskewangleidentity, (Object) list3).write(jsonWriter, list3);
        }
        animatableValueParser.read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AnimatableValueParser animatableValueParser = new AnimatableValueParser();
        Gson gson = this.write;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 3) {
                if (write2 != 103) {
                    if (write2 != 247) {
                        if (write2 != 532) {
                            if (write2 != 543) {
                                if (write2 != 600) {
                                    animatableValueParser.read(gson, jsonReader, write2);
                                } else if (z) {
                                    animatableValueParser.read = (List) gson.getAdapter(new parseColor()).read(jsonReader);
                                } else {
                                    animatableValueParser.read = null;
                                }
                            } else if (z) {
                                animatableValueParser.MediaMetadataCompat = (List) gson.getAdapter(new isSkewAngleIdentity()).read(jsonReader);
                            } else {
                                animatableValueParser.MediaMetadataCompat = null;
                            }
                        } else if (z) {
                            animatableValueParser.MediaBrowserCompat$CustomActionResultReceiver = (List) gson.getAdapter(new parseDocumentData()).read(jsonReader);
                        } else {
                            animatableValueParser.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                    } else if (z) {
                        animatableValueParser.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                    }
                } else if (z) {
                    animatableValueParser.IconCompatParcelizer = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                }
            } else if (z) {
                animatableValueParser.write = gson.getAdapter(Integer.class).read(jsonReader).intValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return animatableValueParser;
    }
}
