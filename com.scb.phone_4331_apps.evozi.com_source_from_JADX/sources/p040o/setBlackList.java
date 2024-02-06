package p040o;

import android.content.Context;

/* renamed from: o.setBlackList */
public final class setBlackList extends getErrorHandler {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final Context MediaBrowserCompat$ItemReceiver;
    private final CreditCardCaptureModule_GetIParametersFactory read;
    private final CreditCardCaptureModule_GetIParametersFactory write;

    public setBlackList(Context context, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory2, String str) {
        if (context != null) {
            this.MediaBrowserCompat$ItemReceiver = context;
            if (creditCardCaptureModule_GetIParametersFactory != null) {
                this.read = creditCardCaptureModule_GetIParametersFactory;
                if (creditCardCaptureModule_GetIParametersFactory2 != null) {
                    this.write = creditCardCaptureModule_GetIParametersFactory2;
                    if (str != null) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final Context MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final CreditCardCaptureModule_GetIParametersFactory IconCompatParcelizer() {
        return this.read;
    }

    public final CreditCardCaptureModule_GetIParametersFactory MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final String read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreationContext{applicationContext=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", wallClock=");
        sb.append(this.read);
        sb.append(", monotonicClock=");
        sb.append(this.write);
        sb.append(", backendName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getErrorHandler)) {
            return false;
        }
        getErrorHandler geterrorhandler = (getErrorHandler) obj;
        if (!this.MediaBrowserCompat$ItemReceiver.equals(geterrorhandler.MediaBrowserCompat$ItemReceiver()) || !this.read.equals(geterrorhandler.IconCompatParcelizer()) || !this.write.equals(geterrorhandler.MediaBrowserCompat$CustomActionResultReceiver()) || !this.MediaBrowserCompat$CustomActionResultReceiver.equals(geterrorhandler.read())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.MediaBrowserCompat$ItemReceiver.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.read.hashCode()) * 1000003) ^ this.write.hashCode()) * 1000003) ^ this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }
}
