package p040o;

/* renamed from: o.DebitCardResetPinActivity */
public final class DebitCardResetPinActivity<T> {
    private static DebitCardResetPinActivity<Object> write = new DebitCardResetPinActivity<>((Object) null);
    public final Object MediaBrowserCompat$ItemReceiver;

    private DebitCardResetPinActivity(Object obj) {
        this.MediaBrowserCompat$ItemReceiver = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DebitCardResetPinActivity) {
            return HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, ((DebitCardResetPinActivity) obj).MediaBrowserCompat$ItemReceiver);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.MediaBrowserCompat$ItemReceiver;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.MediaBrowserCompat$ItemReceiver;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (HmlCaptureDocumentActivity.write(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnErrorNotification[");
            sb.append(HmlCaptureDocumentActivity.IconCompatParcelizer(obj));
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnNextNotification[");
        sb2.append(this.MediaBrowserCompat$ItemReceiver);
        sb2.append("]");
        return sb2.toString();
    }

    public static <T> DebitCardResetPinActivity<T> MediaBrowserCompat$ItemReceiver(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "value is null");
        return new DebitCardResetPinActivity<>(t);
    }

    public static <T> DebitCardResetPinActivity<T> MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        HmlLatestPersonalInformationDeepLinkActivity.write(th, "error is null");
        return new DebitCardResetPinActivity<>(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(th));
    }

    public static <T> DebitCardResetPinActivity<T> write() {
        return write;
    }
}
