package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.HmlMailingAddressActivity */
public final class HmlMailingAddressActivity extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle write;

    public HmlMailingAddressActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        HmlNTBConsentActivity hmlNTBConsentActivity = (HmlNTBConsentActivity) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (hmlNTBConsentActivity != hmlNTBConsentActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 525);
            C6890x2027e421 hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = hmlNTBConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, C6890x2027e421.class, (Object) hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver).write(jsonWriter, hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (hmlNTBConsentActivity != hmlNTBConsentActivity.read) {
            validatedagrecurse.read(jsonWriter, 610);
            HmlNTBDocumentInstructionsActivity hmlNTBDocumentInstructionsActivity = new HmlNTBDocumentInstructionsActivity();
            HmlIssuerInputActivity<setOnPageChangeListener> hmlIssuerInputActivity = hmlNTBConsentActivity.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) hmlNTBDocumentInstructionsActivity, (Object) hmlIssuerInputActivity).write(jsonWriter, hmlIssuerInputActivity);
        }
        hmlNTBConsentActivity.read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        HmlNTBConsentActivity hmlNTBConsentActivity = new HmlNTBConsentActivity();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 40) {
                if (write2 != 168) {
                    hmlNTBConsentActivity.read(gson, jsonReader, write2);
                } else if (z) {
                    hmlNTBConsentActivity.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(C6890x2027e421.class).read(jsonReader);
                } else {
                    hmlNTBConsentActivity.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                hmlNTBConsentActivity.read = (HmlIssuerInputActivity) gson.getAdapter(new HmlNTBDocumentInstructionsActivity()).read(jsonReader);
            } else {
                hmlNTBConsentActivity.read = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return hmlNTBConsentActivity;
    }
}
