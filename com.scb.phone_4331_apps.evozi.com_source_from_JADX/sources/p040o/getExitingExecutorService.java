package p040o;

/* renamed from: o.getExitingExecutorService */
public final class getExitingExecutorService {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExitingExecutorService)) {
            return false;
        }
        getExitingExecutorService getexitingexecutorservice = (getExitingExecutorService) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getexitingexecutorservice.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getexitingexecutorservice.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public getExitingExecutorService(String str, String str2) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "name");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final String toString() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
