package p040o;

import java.util.concurrent.Executor;

/* renamed from: o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver */
final class performConfigurationChanged$MediaBrowserCompat$ItemReceiver {
    final Executor read;
    final KtaJsonCheck write;

    performConfigurationChanged$MediaBrowserCompat$ItemReceiver(KtaJsonCheck ktaJsonCheck, Executor executor) {
        this.write = ktaJsonCheck;
        this.read = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof performConfigurationChanged$MediaBrowserCompat$ItemReceiver) {
            return this.write.equals(((performConfigurationChanged$MediaBrowserCompat$ItemReceiver) obj).write);
        }
        return false;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }
}
