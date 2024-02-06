package okhttp3.repackaged.internal.framed;

import p040o.ModifyQuickTopUpActivity;
import p040o.PinLoginActivity_ViewBinding;

public final class Header {
    public static final PinLoginActivity_ViewBinding RESPONSE_STATUS = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);
    public static final PinLoginActivity_ViewBinding TARGET_AUTHORITY = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    public static final PinLoginActivity_ViewBinding TARGET_HOST = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(":host");
    public static final PinLoginActivity_ViewBinding TARGET_METHOD = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);
    public static final PinLoginActivity_ViewBinding TARGET_PATH = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);
    public static final PinLoginActivity_ViewBinding TARGET_SCHEME = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);
    public static final PinLoginActivity_ViewBinding VERSION = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(":version");
    final int hpackSize;
    public final PinLoginActivity_ViewBinding name;
    public final PinLoginActivity_ViewBinding value;

    public Header(String str, String str2) {
        this(PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str), PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str2));
    }

    public Header(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding, String str) {
        this(pinLoginActivity_ViewBinding, PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str));
    }

    public Header(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding, PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding2) {
        this.name = pinLoginActivity_ViewBinding;
        this.value = pinLoginActivity_ViewBinding2;
        this.hpackSize = pinLoginActivity_ViewBinding.write.length + 32 + pinLoginActivity_ViewBinding2.write.length;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (!this.name.equals(header.name) || !this.value.equals(header.value)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.name.hashCode() + 527) * 31) + this.value.hashCode();
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = this.name;
        String str = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null) {
            str = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
            pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
        objArr[0] = str;
        PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding2 = this.value;
        String str2 = pinLoginActivity_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null) {
            str2 = new String(pinLoginActivity_ViewBinding2.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
            pinLoginActivity_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
        objArr[1] = str2;
        return String.format("%s: %s", objArr);
    }
}
