package p040o;

/* renamed from: o.PrepaidRequestCaseModule */
public abstract class PrepaidRequestCaseModule {
    public abstract PrepaidResetCaseModule read();

    public abstract E2EEEncryptionException write();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n        DimensionData(\n            bounds = ");
        sb.append(read());
        sb.append(",\n            rectangle = ");
        sb.append(write());
        sb.append("\n        )\n    ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrepaidRequestCaseModule) {
            PrepaidRequestCaseModule prepaidRequestCaseModule = (PrepaidRequestCaseModule) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) prepaidRequestCaseModule.write(), (Object) write()) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) prepaidRequestCaseModule.read(), (Object) read());
        }
    }

    public int hashCode() {
        PrepaidResetCaseModule read = read();
        int i = 0;
        int hashCode = read != null ? read.hashCode() : 0;
        E2EEEncryptionException write = write();
        if (write != null) {
            i = write.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
