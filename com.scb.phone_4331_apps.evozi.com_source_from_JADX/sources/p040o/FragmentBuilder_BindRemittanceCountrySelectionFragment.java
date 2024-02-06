package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.FragmentBuilder_BindRemittanceCountrySelectionFragment */
public final class FragmentBuilder_BindRemittanceCountrySelectionFragment extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;
    private validateDAGRecurse write;

    public FragmentBuilder_BindRemittanceCountrySelectionFragment(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment = (FragmentBuilder_BindPurchaseProfileManagementFragment) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (fragmentBuilder_BindPurchaseProfileManagementFragment != fragmentBuilder_BindPurchaseProfileManagementFragment.read) {
            validatedagrecurse.read(jsonWriter, 96);
            FragmentBuilder_BindRegistrationManageDevicesFragment fragmentBuilder_BindRegistrationManageDevicesFragment = new FragmentBuilder_BindRegistrationManageDevicesFragment();
            List<FragmentBuilder_BindHmlOutcomeRejectFragment> list = fragmentBuilder_BindPurchaseProfileManagementFragment.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) fragmentBuilder_BindRegistrationManageDevicesFragment, (Object) list).write(jsonWriter, list);
        }
        if (fragmentBuilder_BindPurchaseProfileManagementFragment != fragmentBuilder_BindPurchaseProfileManagementFragment.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
            FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment = fragmentBuilder_BindPurchaseProfileManagementFragment.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, FragmentBuilder_BindRegistrationLandingFragment.class, (Object) fragmentBuilder_BindRegistrationLandingFragment).write(jsonWriter, fragmentBuilder_BindRegistrationLandingFragment);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment = new FragmentBuilder_BindPurchaseProfileManagementFragment();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 200) {
                if (write2 != 548) {
                    jsonReader.skipValue();
                } else if (z) {
                    fragmentBuilder_BindPurchaseProfileManagementFragment.MediaBrowserCompat$ItemReceiver = gson.getAdapter(FragmentBuilder_BindRegistrationLandingFragment.class).read(jsonReader);
                } else {
                    fragmentBuilder_BindPurchaseProfileManagementFragment.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                fragmentBuilder_BindPurchaseProfileManagementFragment.read = (List) gson.getAdapter(new FragmentBuilder_BindRegistrationManageDevicesFragment()).read(jsonReader);
            } else {
                fragmentBuilder_BindPurchaseProfileManagementFragment.read = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return fragmentBuilder_BindPurchaseProfileManagementFragment;
    }
}
