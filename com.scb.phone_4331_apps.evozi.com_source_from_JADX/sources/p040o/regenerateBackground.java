package p040o;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

@HmlSetNTBPinActivity
/* renamed from: o.regenerateBackground */
public final class regenerateBackground implements getIdType {
    private Boolean MediaBrowserCompat$CustomActionResultReceiver;
    private Context write;

    @HmlPinActivity
    public regenerateBackground(Context context) {
        this.write = context;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        NfcAdapter nfcAdapter;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            Object systemService = this.write.getSystemService("nfc");
            if (systemService != null) {
                nfcAdapter = ((NfcManager) systemService).getDefaultAdapter();
            } else {
                nfcAdapter = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = Boolean.valueOf(nfcAdapter != null);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.booleanValue();
    }

    public final boolean read() {
        List asList = Arrays.asList(Build.SUPPORTED_ABIS);
        return asList.contains("armeabi") || asList.contains("armeabi-v7a") || asList.contains("arm64-v8a");
    }
}
