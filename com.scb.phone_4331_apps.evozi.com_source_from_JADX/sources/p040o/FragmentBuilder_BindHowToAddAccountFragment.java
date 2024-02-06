package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindHowToAddAccountFragment */
public final class FragmentBuilder_BindHowToAddAccountFragment extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle write;

    public FragmentBuilder_BindHowToAddAccountFragment(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        FragmentBuilder_BindHmlOutcomeRejectFragment fragmentBuilder_BindHmlOutcomeRejectFragment = (FragmentBuilder_BindHmlOutcomeRejectFragment) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (fragmentBuilder_BindHmlOutcomeRejectFragment != fragmentBuilder_BindHmlOutcomeRejectFragment.read) {
            validatedagrecurse.read(jsonWriter, 331);
            String str = fragmentBuilder_BindHmlOutcomeRejectFragment.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        FragmentBuilder_BindHmlOutcomeRejectFragment fragmentBuilder_BindHmlOutcomeRejectFragment = new FragmentBuilder_BindHmlOutcomeRejectFragment();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 24) {
                jsonReader.skipValue();
            } else if (z) {
                fragmentBuilder_BindHmlOutcomeRejectFragment.read = gson.getAdapter(String.class).read(jsonReader);
            } else {
                fragmentBuilder_BindHmlOutcomeRejectFragment.read = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return fragmentBuilder_BindHmlOutcomeRejectFragment;
    }
}
