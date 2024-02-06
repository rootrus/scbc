package p040o;

import java.io.Serializable;

/* renamed from: o.HmlCaptureDocumentActivity */
public enum HmlCaptureDocumentActivity {
    ;

    public static <T> T MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return obj;
    }

    public static <T> Object MediaBrowserCompat$ItemReceiver(T t) {
        return t;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    private HmlCaptureDocumentActivity(String str) {
    }

    /* renamed from: o.HmlCaptureDocumentActivity$write */
    static final class write implements Serializable {
        final Throwable IconCompatParcelizer;

        write(Throwable th) {
            this.IconCompatParcelizer = th;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Error[");
            sb.append(this.IconCompatParcelizer);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof write) {
                return HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((write) obj).IconCompatParcelizer);
            }
            return false;
        }
    }

    /* renamed from: o.HmlCaptureDocumentActivity$read */
    static final class read implements Serializable {
        final BulkTransferDeepLinkActivity write;

        read(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.write = bulkTransferDeepLinkActivity;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Disposable[");
            sb.append(this.write);
            sb.append("]");
            return sb.toString();
        }
    }

    public static Object MediaBrowserCompat$CustomActionResultReceiver() {
        return COMPLETE;
    }

    public static Object MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        return new write(th);
    }

    public static Object write(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        return new read(bulkTransferDeepLinkActivity);
    }

    public static boolean read(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean write(Object obj) {
        return obj instanceof write;
    }

    public static Throwable IconCompatParcelizer(Object obj) {
        return ((write) obj).IconCompatParcelizer;
    }

    public static <T> boolean read(Object obj, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        if (obj == COMPLETE) {
            bankingAgentTransactionsDeepLinkActivity.onComplete();
            return true;
        } else if (obj instanceof write) {
            bankingAgentTransactionsDeepLinkActivity.onError(((write) obj).IconCompatParcelizer);
            return true;
        } else {
            bankingAgentTransactionsDeepLinkActivity.onNext(obj);
            return false;
        }
    }

    public static <T> boolean MediaBrowserCompat$ItemReceiver(Object obj, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        if (obj == COMPLETE) {
            bankingAgentTransactionsDeepLinkActivity.onComplete();
            return true;
        } else if (obj instanceof write) {
            bankingAgentTransactionsDeepLinkActivity.onError(((write) obj).IconCompatParcelizer);
            return true;
        } else if (obj instanceof read) {
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(((read) obj).write);
            return false;
        } else {
            bankingAgentTransactionsDeepLinkActivity.onNext(obj);
            return false;
        }
    }
}
