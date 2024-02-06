package p040o;

import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.kony.sdk.client.KonyLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.TimeZone;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.CTBSV */
final class CTBSV {
    public static Vector<Hashtable> IconCompatParcelizer = new Vector<>();
    public static Vector<Hashtable> MediaBrowserCompat$CustomActionResultReceiver = new Vector<>();
    private static String read = "MetricsUtility";
    public static int write;

    CTBSV() {
    }

    static {
        write = 0;
        try {
            write = ((Integer) CSYR2K.MediaBrowserCompat$ItemReceiver.read("customeventscount")).intValue();
            String str = read;
            StringBuilder sb = new StringBuilder();
            sb.append("EventsInStorage: ");
            sb.append(write);
            KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
        } catch (Exception unused) {
            KonyLogger.write("No events in the Storage");
        }
    }

    protected static JSONObject MediaBrowserCompat$ItemReceiver(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            write(jSONObject);
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver());
                CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyUUID", jSONArray.toString());
                String str = (String) CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyOfflineAccessData");
                JSONArray jSONArray2 = null;
                if (str != null) {
                    jSONArray2 = new JSONArray(str);
                }
                if (jSONArray2 == null) {
                    jSONArray2 = new JSONArray();
                }
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(jSONArray.get(0));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                jSONArray3.put(simpleDateFormat.format(new Date()));
                jSONArray2.put(jSONArray3);
                CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyOfflineAccessData", jSONArray2.toString());
                new JSONArray();
                jSONObject.accumulate("launchDates", jSONArray2);
                jSONObject.accumulate("events", MediaBrowserCompat$ItemReceiver());
                jSONObject.accumulate("metrics", "");
                jSONObject.accumulate("svcid", "RegisterKonySession");
                jSONObject.accumulate("rsid", MediaBrowserCompat$SearchResultReceiver());
            } catch (JSONException e) {
                KonyLogger.read(e);
            }
        } catch (Exception e2) {
            String str2 = read;
            StringBuilder sb = new StringBuilder();
            sb.append("In konyReportingParams");
            sb.append(e2.getMessage());
            KonyLogger.MediaBrowserCompat$ItemReceiver(str2, sb.toString());
        }
        return jSONObject;
    }

    protected static JSONObject write(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            write(jSONObject);
            jSONObject.accumulate("svcid", str);
            jSONObject.accumulate("rsid", MediaBrowserCompat$SearchResultReceiver());
            jSONObject.accumulate("events", MediaBrowserCompat$ItemReceiver());
        } catch (JSONException e) {
            KonyLogger.read(e);
        }
        return jSONObject;
    }

    private static String MediaBrowserCompat$MediaItem() {
        try {
            return CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getPackageManager().getPackageInfo(CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            KonyLogger.read(e);
            return null;
        }
    }

    protected static void read() {
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            CSYR2K.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("customevents");
            CSYR2K.MediaBrowserCompat$ItemReceiver.read("customevents", MediaBrowserCompat$CustomActionResultReceiver);
            write = MediaBrowserCompat$CustomActionResultReceiver.size();
            CSYR2K.MediaBrowserCompat$ItemReceiver.read("customeventscount", Integer.valueOf(write));
            MediaBrowserCompat$CustomActionResultReceiver.clear();
        }
    }

    protected static void IconCompatParcelizer() {
        write = 0;
        MediaBrowserCompat$CustomActionResultReceiver.clear();
        CSYR2K.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("customevents");
        CSYR2K.MediaBrowserCompat$ItemReceiver.read("customeventscount", 0);
    }

    private static JSONArray MediaBrowserCompat$ItemReceiver() {
        MediaMetadataCompat();
        Vector<Hashtable> vector = MediaBrowserCompat$CustomActionResultReceiver;
        if (vector == null || vector.size() == 0) {
            return null;
        }
        new Hashtable();
        Vector vector2 = new Vector();
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver.size(); i++) {
            vector2.add(new JSONObject(MediaBrowserCompat$CustomActionResultReceiver.elementAt(i)));
        }
        return new JSONArray(vector2);
    }

    private static void write(JSONObject jSONObject) {
        try {
            String str = FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("aname");
            if (str == null) {
                str = FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("mfaname");
            }
            jSONObject.accumulate("aname", str);
            String str2 = FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("aid");
            if (str2 == null) {
                str2 = FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("mfbaseid");
            }
            jSONObject.accumulate("aid", str2);
            jSONObject.accumulate("mfaid", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("mfaid"));
            jSONObject.accumulate("mfbaseid", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("mfbaseid"));
            jSONObject.accumulate("mfaname", FragmentBuilder_BindInvestmentFundDetailFragment.IconCompatParcelizer.get("mfaname"));
            jSONObject.accumulate("sdkversion", "SDK-GA-7.2.1.8");
            jSONObject.accumulate("sdktype", "android-native");
            jSONObject.accumulate("aver", MediaBrowserCompat$MediaItem());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f = displayMetrics.density;
            float min = Math.min(((float) i) / f, ((float) i2) / f);
            String str3 = read;
            StringBuilder sb = new StringBuilder();
            sb.append("Channel Value is:");
            sb.append(min);
            KonyLogger.MediaBrowserCompat$ItemReceiver(str3, sb.toString());
            jSONObject.accumulate("chnl", min >= 600.0f ? "tablet" : "mobile");
            String deviceId = ((TelephonyManager) CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("phone")).getDeviceId();
            if (deviceId == null && (deviceId = Build.SERIAL) == null) {
                deviceId = Settings.Secure.getString(CSYR2K.MediaBrowserCompat$CustomActionResultReceiver.getContentResolver(), "android_id");
            }
            jSONObject.accumulate("did", deviceId);
            jSONObject.accumulate("os", Build.VERSION.RELEASE);
            jSONObject.accumulate("stype", "b2c");
            jSONObject.accumulate("dm", Build.MODEL);
            String str4 = Build.MODEL;
            if (str4 == null) {
                str4 = "android";
            }
            jSONObject.accumulate("ua", str4);
            jSONObject.accumulate("plat", "android");
            jSONObject.accumulate("atype", "native");
            String str5 = (String) CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyUserID");
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.accumulate("kuid", str5);
        } catch (JSONException e) {
            KonyLogger.read(e);
        }
    }

    protected static void write() {
        CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyLastAccessTime", Long.valueOf(new Date().getTime()));
    }

    protected static void MediaBrowserCompat$CustomActionResultReceiver() {
        CSYR2K.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("konyLastAccessTime");
    }

    private static void MediaMetadataCompat() {
        Vector<Hashtable> vector = (Vector) CSYR2K.MediaBrowserCompat$ItemReceiver.read("customevents");
        if (vector != null) {
            write = vector.size();
        }
        MediaBrowserCompat$CustomActionResultReceiver = vector;
        if (vector == null) {
            MediaBrowserCompat$CustomActionResultReceiver = new Vector<>();
        }
        for (int i = 0; i < IconCompatParcelizer.size(); i++) {
            MediaBrowserCompat$CustomActionResultReceiver.add(IconCompatParcelizer.elementAt(i));
        }
        IconCompatParcelizer.clear();
    }

    private static String MediaBrowserCompat$SearchResultReceiver() {
        String str = (String) CSYR2K.MediaBrowserCompat$ItemReceiver.read("konyUUID");
        try {
            return (String) new JSONArray(str).get(0);
        } catch (JSONException e) {
            KonyLogger.read(e);
            if (str == null) {
                return FragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver();
            }
            return null;
        }
    }
}
