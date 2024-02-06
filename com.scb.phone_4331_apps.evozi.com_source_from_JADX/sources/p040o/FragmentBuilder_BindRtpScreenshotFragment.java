package p040o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindRtpScreenshotFragment */
public final class FragmentBuilder_BindRtpScreenshotFragment {
    private static final List<String> IconCompatParcelizer;
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"_id", "request", "request_type", "site_key", "host_uri", "timestamp", "touchpoint_uri"};

    static {
        new String[]{"_id", "request"};
        String[] strArr = {"DROP TABLE IF EXISTS offline_requests;", "CREATE TABLE offline_requests (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    request TEXT COLLATE LOCALIZED NOT NULL DEFAULT '',\n    request_type COLLATE LOCALIZED NOT NULL DEFAULT '',\n    site_key COLLATE LOCALIZED NOT NULL DEFAULT '',\n    timestamp COLLATE LOCALIZED NOT NULL DEFAULT '',\n    host_uri COLLATE LOCALIZED NOT NULL DEFAULT '',\n    touchpoint_uri COLLATE LOCALIZED NOT NULL DEFAULT ''\n);"};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List<String> asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        IconCompatParcelizer = asList;
        String[] strArr2 = {"DROP TABLE IF EXISTS offline_requests;", "CREATE TABLE offline_requests (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    request TEXT COLLATE LOCALIZED NOT NULL DEFAULT '',\n    request_type TEXT COLLATE LOCALIZED NOT NULL DEFAULT '',\n    site_key TEXT COLLATE LOCALIZED NOT NULL DEFAULT '',\n    timestamp TEXT COLLATE LOCALIZED NOT NULL DEFAULT '',\n    host_uri TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''\n);"};
        onGetStartedClick.write((Object) strArr2, "elements");
        onGetStartedClick.write((Object) strArr2, "$this$asList");
        onGetStartedClick.IconCompatParcelizer((Object) Arrays.asList(strArr2), "ArraysUtilJVM.asList(this)");
        String[] strArr3 = {"DROP TABLE IF EXISTS offline_requests;", "CREATE TABLE offline_requests (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    request TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''\n);"};
        onGetStartedClick.write((Object) strArr3, "elements");
        onGetStartedClick.write((Object) strArr3, "$this$asList");
        onGetStartedClick.IconCompatParcelizer((Object) Arrays.asList(strArr3), "ArraysUtilJVM.asList(this)");
    }

    public static final String[] MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static final List<String> write() {
        return IconCompatParcelizer;
    }
}
