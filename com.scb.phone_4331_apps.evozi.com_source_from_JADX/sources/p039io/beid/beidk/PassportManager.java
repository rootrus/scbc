package p039io.beid.beidk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;
import java.util.UUID;
import p039io.beid.beidk.BEIDConfigurationFactory;
import p039io.beid.beidk.activity.ScanPassportActivity;
import p039io.beid.beidk.definitions.SCBHeader;
import p040o.AppCompatRatingBar;

/* renamed from: io.beid.beidk.PassportManager */
public class PassportManager {
    public static final int EXIT_FAIL = 2;
    public static final int EXIT_UPLOAD_THROW_EXCEPTION = 1;
    public static final String KEY_PASSPORT_DATA = "passportData";
    public static final String KEY_PASSPORT_EXCEPTION_MESSAGE = "scanPassportErrorMessage";
    public static final String KEY_PASSPORT_EXIT_CODE = "scanPassportStatusCode";
    public static final int SCAN_PASSPORT_OK = 0;

    public static void startPassportScanner(Activity activity, int i, Map<String, String> map) {
        Intent intent = new Intent(activity, ScanPassportActivity.class);
        intent.putExtra(SCBHeader.SCB_REQ_HEADER_REQUEST_ID, UUID.randomUUID().toString());
        for (String next : map.keySet()) {
            intent.putExtra(next, map.get(next));
        }
        AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(activity, intent, i, (Bundle) null);
    }

    public static void startPassportScanner(Activity activity, int i, Map<String, String> map, BEIDConfigurationFactory.Builder builder) {
        startPassportScanner(activity, i, map, builder.Build());
    }

    public static void startPassportScanner(Activity activity, int i, Map<String, String> map, BEIDConfigurationFactory bEIDConfigurationFactory) {
        Intent intent = new Intent(activity, ScanPassportActivity.class);
        intent.putExtra(SCBHeader.SCB_REQ_HEADER_REQUEST_ID, UUID.randomUUID().toString());
        for (String next : map.keySet()) {
            intent.putExtra(next, map.get(next));
        }
        intent.putExtra("_config", bEIDConfigurationFactory);
        AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(activity, intent, i, (Bundle) null);
    }
}
