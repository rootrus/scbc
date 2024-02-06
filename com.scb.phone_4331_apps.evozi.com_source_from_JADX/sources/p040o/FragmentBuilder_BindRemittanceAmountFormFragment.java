package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindRemittanceAmountFormFragment */
public final class FragmentBuilder_BindRemittanceAmountFormFragment extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle read;
    private Gson write;

    public FragmentBuilder_BindRemittanceAmountFormFragment(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment = (FragmentBuilder_BindRegistrationLandingFragment) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (fragmentBuilder_BindRegistrationLandingFragment != fragmentBuilder_BindRegistrationLandingFragment.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 505);
            String str = fragmentBuilder_BindRegistrationLandingFragment.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment = new FragmentBuilder_BindRegistrationLandingFragment();
        Gson gson = this.write;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 331) {
                jsonReader.skipValue();
            } else if (z) {
                fragmentBuilder_BindRegistrationLandingFragment.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                fragmentBuilder_BindRegistrationLandingFragment.IconCompatParcelizer = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return fragmentBuilder_BindRegistrationLandingFragment;
    }
}
