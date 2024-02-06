package scb.yek;

import java.security.SecureRandom;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.onGetStartedClick;

public final class GetKey {
    public String MediaBrowserCompat$ItemReceiver;

    public final native String keyFromJNI(String str);

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Byte, CharSequence> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String format = String.format("%02x", new Object[]{Byte.valueOf(((Number) obj).byteValue())});
            onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) format, "java.lang.String.format(\"%02x\", it)");
            return format;
        }
    }

    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<String, CharSequence> {
        private /* synthetic */ GetKey write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(GetKey getKey) {
            super(1);
            this.write = getKey;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.MediaBrowserCompat$CustomActionResultReceiver(str, "it");
            byte[] bArr = new byte[1];
            new SecureRandom().nextBytes(bArr);
            String read = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$CustomActionResultReceiver(bArr, "", read.MediaBrowserCompat$CustomActionResultReceiver);
            StringBuilder sb = new StringBuilder();
            sb.append(read);
            sb.append(str);
            return sb.toString();
        }
    }

    static {
        System.loadLibrary("native-lib");
    }

    public static byte[] write() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        return HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$CustomActionResultReceiver(bArr, "", read.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
