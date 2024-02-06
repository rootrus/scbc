package p040o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: o.setOnPageChangeListener */
public class setOnPageChangeListener implements HmlNTBCaptureDocumentActivity, HmlNTBDocumentUploadGuidelineActivity {
    @SerializedName(alternate = {"statusdesc"}, value = "description")
    private String IconCompatParcelizer;
    @SerializedName("message")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("header")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName(alternate = {"statuscode"}, value = "code")
    private String write;

    public String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void IconCompatParcelizer(String str) {
        this.write = str;
    }

    public String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public String read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final /* synthetic */ void read(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 201) {
            if (i == 314 || i == 326) {
                if (z) {
                    this.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    return;
                }
                this.IconCompatParcelizer = null;
                jsonReader.nextNull();
                return;
            } else if (i != 353) {
                if (i != 361) {
                    if (i != 620) {
                        jsonReader.skipValue();
                        return;
                    }
                } else if (z) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                    return;
                } else {
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    jsonReader.nextNull();
                    return;
                }
            } else if (z) {
                this.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                return;
            } else {
                this.MediaBrowserCompat$ItemReceiver = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (z) {
            this.write = gson.getAdapter(String.class).read(jsonReader);
            return;
        }
        this.write = null;
        jsonReader.nextNull();
    }

    public final /* synthetic */ void read(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.write) {
            validatedagrecurse.read(jsonWriter, 590);
            String str = this.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (this != this.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 372);
            String str2 = this.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (this != this.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 407);
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (this != this.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 499);
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
    }

    public String write() {
        return this.write;
    }

    public setOnPageChangeListener() {
        if (this instanceof HmlNTBReviewActivity) {
            ((HmlNTBReviewActivity) this).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
