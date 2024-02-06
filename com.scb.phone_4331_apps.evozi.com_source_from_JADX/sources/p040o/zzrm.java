package p040o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: o.zzrm */
public class zzrm {
    @SerializedName("message")
    public String IconCompatParcelizer;
    @SerializedName("code")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("description")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("header")
    public String read;

    public /* synthetic */ zzrm() {
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (this != this.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 421);
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (this != this.read) {
            validatedagrecurse.read(jsonWriter, 407);
            String str3 = this.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (this != this.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 499);
            String str4 = this.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
    }

    public final /* synthetic */ void read(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 201) {
            if (i != 326) {
                if (i != 353) {
                    if (i != 361) {
                        jsonReader.skipValue();
                    } else if (z) {
                        this.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        this.IconCompatParcelizer = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    this.read = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    this.read = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                this.MediaBrowserCompat$ItemReceiver = null;
                jsonReader.nextNull();
            }
        } else if (z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            jsonReader.nextNull();
        }
    }

    public zzrm(String str, String str2, String str3) {
        this((String) null, str, str2, str3);
    }

    public zzrm(String str, String str2, String str3, String str4) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.IconCompatParcelizer = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzrm zzrm = (zzrm) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? zzrm.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(zzrm.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? zzrm.MediaBrowserCompat$ItemReceiver != null : !str2.equals(zzrm.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = zzrm.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
