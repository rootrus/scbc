package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.ErrorPagerAdapter_ViewBinding */
public final class ErrorPagerAdapter_ViewBinding {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

    private ErrorPagerAdapter_ViewBinding(PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding, String str) {
        this.MediaBrowserCompat$ItemReceiver = prepaidTravelCoachMarkActivity_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public ErrorPagerAdapter_ViewBinding(PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding) {
        this(prepaidTravelCoachMarkActivity_ViewBinding, "");
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb2.append(" ");
                sb2.append(sb.toString());
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb2.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb3.append(" ");
            sb3.append(sb.toString());
            prepaidTravelCoachMarkActivity_ViewBinding2.write(sb3.toString());
        }
    }
}
