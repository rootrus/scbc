package p040o;

/* renamed from: o.EasycashCommercialInfoCaseModule */
public abstract class EasycashCommercialInfoCaseModule {
    private EasycashCommercialInfoCaseModule() {
    }

    public /* synthetic */ EasycashCommercialInfoCaseModule(byte b) {
        this();
    }

    /* renamed from: o.EasycashCommercialInfoCaseModule$read */
    public static final class read extends EasycashCommercialInfoCaseModule {
        final EasycashFeatureAccountCaseModule write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((read) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule = this.write;
            if (easycashFeatureAccountCaseModule != null) {
                return easycashFeatureAccountCaseModule.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateOrientation(orientation=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule) {
            super((byte) 0);
            onGetStartedClick.write((Object) easycashFeatureAccountCaseModule, "orientation");
            this.write = easycashFeatureAccountCaseModule;
        }
    }
}
