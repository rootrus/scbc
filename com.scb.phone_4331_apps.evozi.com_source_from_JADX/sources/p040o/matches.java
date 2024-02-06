package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.matches */
public final class matches extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public matches(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        createResultAndNotify createresultandnotify = (createResultAndNotify) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (createresultandnotify != createresultandnotify.read) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
            String str = createresultandnotify.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (createresultandnotify != createresultandnotify.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 222);
            String str2 = createresultandnotify.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (createresultandnotify != createresultandnotify.write) {
            validatedagrecurse.read(jsonWriter, 453);
            String str3 = createresultandnotify.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (createresultandnotify != createresultandnotify.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 310);
            String str4 = createresultandnotify.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (createresultandnotify != createresultandnotify.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 285);
            String str5 = createresultandnotify.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (createresultandnotify != createresultandnotify.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 445);
            String str6 = createresultandnotify.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (createresultandnotify != createresultandnotify.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 257);
            String str7 = createresultandnotify.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (createresultandnotify != createresultandnotify.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 531);
            String str8 = createresultandnotify.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        createResultAndNotify createresultandnotify = new createResultAndNotify();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 115) {
                if (write2 != 238) {
                    if (write2 != 303) {
                        if (write2 != 324) {
                            if (write2 != 366) {
                                if (write2 != 403) {
                                    if (write2 != 456) {
                                        if (write2 != 518) {
                                            jsonReader.skipValue();
                                        } else if (z) {
                                            createresultandnotify.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            createresultandnotify.MediaBrowserCompat$SearchResultReceiver = null;
                                        }
                                    } else if (z) {
                                        createresultandnotify.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        createresultandnotify.MediaBrowserCompat$CustomActionResultReceiver = null;
                                    }
                                } else if (z) {
                                    createresultandnotify.MediaBrowserCompat$MediaItem = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    createresultandnotify.MediaBrowserCompat$MediaItem = null;
                                }
                            } else if (z) {
                                createresultandnotify.write = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                createresultandnotify.write = null;
                            }
                        } else if (z) {
                            createresultandnotify.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            createresultandnotify.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        createresultandnotify.read = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        createresultandnotify.read = null;
                    }
                } else if (z) {
                    createresultandnotify.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    createresultandnotify.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                createresultandnotify.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
            } else {
                createresultandnotify.RatingCompat = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return createresultandnotify;
    }
}
