package p040o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kony.sdk.client.KonyLogger;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.FragmentBuilder_BindMyInsuranceFragment */
public final class FragmentBuilder_BindMyInsuranceFragment {
    private static String write = "KonyUtil";
    public int IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public final View MediaBrowserCompat$ItemReceiver;
    public int read;

    FragmentBuilder_BindMyInsuranceFragment() {
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver() {
        String obj = UUID.randomUUID().toString();
        if (KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", 3)) {
            String str = write;
            StringBuilder sb = new StringBuilder();
            sb.append("UUID String: ");
            sb.append(obj);
            KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
        }
        return obj;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(JSONObject jSONObject) {
        String str = null;
        if (jSONObject.isNull("mfcode")) {
            return null;
        }
        try {
            str = jSONObject.getString("mfcode");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mfCode from the srver = ");
        sb.append(str);
        KonyLogger.MediaBrowserCompat$ItemReceiver("KonySdk", sb.toString());
        if ("AUTH-4".equals(str)) {
            return "101";
        }
        if ("AUTH-9".equals(str)) {
            return "102";
        }
        if ("AUTH-3".equals(str)) {
            return "103";
        }
        if ("AUTH-5".equals(str) || "AUTH-6".equals(str) || str.equals("Gateway-31") || "Gateway-33".equals(str) || "Gateway-35".equals(str) || "Gateway-36".equals(str) || "AUTH-46".equals(str) || "AUTH-55".equals(str)) {
            return "104";
        }
        return ("AUTH-7".equals(str) || "AUTH-27".equals(str)) ? "105" : "100";
    }

    public static String read(String str) {
        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
        }
        JSONObject jSONObject = (JSONObject) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get(str);
        if (jSONObject != null) {
            try {
                return jSONObject.getJSONObject("claims_token").getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } catch (JSONException e) {
                String str2 = write;
                StringBuilder sb = new StringBuilder();
                sb.append("While Reading the ClaimsToken: ");
                sb.append(e.getMessage());
                KonyLogger.MediaBrowserCompat$ItemReceiver(str2, sb.toString());
            }
        }
        return null;
    }

    public static long IconCompatParcelizer(String str) {
        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
        }
        try {
            return ((JSONObject) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get(str)).getJSONObject("claims_token").getLong("exp");
        } catch (JSONException e) {
            String str2 = write;
            StringBuilder sb = new StringBuilder();
            sb.append("While Reading the ClaimsToken: ");
            sb.append(e.getMessage());
            KonyLogger.MediaBrowserCompat$ItemReceiver(str2, sb.toString());
            return Long.MAX_VALUE;
        }
    }

    public static JSONObject write(String str) {
        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
        }
        JSONObject jSONObject = (JSONObject) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get(str);
        if (jSONObject != null) {
            try {
                return jSONObject.getJSONObject(Scopes.PROFILE);
            } catch (JSONException e) {
                String str2 = write;
                StringBuilder sb = new StringBuilder();
                sb.append("While Reading the Profile: ");
                sb.append(e.getMessage());
                KonyLogger.MediaBrowserCompat$ItemReceiver(str2, sb.toString());
            }
        }
        return null;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (FragmentBuilder_BindMwEditCreateQrFragment.read == null) {
            FragmentBuilder_BindMwEditCreateQrFragment.read = new FragmentBuilder_BindMwEditCreateQrFragment();
        }
        JSONObject jSONObject = (JSONObject) FragmentBuilder_BindMwEditCreateQrFragment.read.IconCompatParcelizer.get(str);
        if (jSONObject != null) {
            try {
                return jSONObject.getString("refresh_token");
            } catch (JSONException e) {
                KonyLogger.read(e);
            }
        }
        return null;
    }

    public static boolean read() {
        ConnectivityManager connectivityManager = (ConnectivityManager) CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo.State state = null;
        NetworkInfo.State state2 = networkInfo != null ? networkInfo.getState() : null;
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 != null) {
            state = networkInfo2.getState();
        }
        if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING || state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING) {
            return true;
        }
        return false;
    }

    public FragmentBuilder_BindMyInsuranceFragment(View view) {
        this.MediaBrowserCompat$ItemReceiver = view;
    }

    public void IconCompatParcelizer() {
        View view = this.MediaBrowserCompat$ItemReceiver;
        SwitchCompat.MediaBrowserCompat$ItemReceiver(view, this.MediaBrowserCompat$CustomActionResultReceiver - (view.getTop() - this.IconCompatParcelizer));
        View view2 = this.MediaBrowserCompat$ItemReceiver;
        SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view2, 0 - (view2.getLeft() - this.read));
    }
}
