package p040o;

/* renamed from: o.EasycashCommercialInfoCaseModule$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6448x408baf36 extends EasycashCommercialInfoCaseModule {
    final PrepaidActivationCaseModule read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6448x408baf36) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((C6448x408baf36) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        PrepaidActivationCaseModule prepaidActivationCaseModule = this.read;
        if (prepaidActivationCaseModule != null) {
            return prepaidActivationCaseModule.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateDimensions(dimensions=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public C6448x408baf36(PrepaidActivationCaseModule prepaidActivationCaseModule) {
        super((byte) 0);
        this.read = prepaidActivationCaseModule;
    }
}
