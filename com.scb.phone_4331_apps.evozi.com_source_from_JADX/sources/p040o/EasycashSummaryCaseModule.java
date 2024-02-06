package p040o;

import android.os.Build;

/* renamed from: o.EasycashSummaryCaseModule */
public final class EasycashSummaryCaseModule {
    final EasycashFeatureAccountCaseModule IconCompatParcelizer;
    final int MediaBrowserCompat$ItemReceiver;
    final PrepaidActivationCaseModule write;

    public EasycashSummaryCaseModule() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EasycashSummaryCaseModule)) {
            return false;
        }
        EasycashSummaryCaseModule easycashSummaryCaseModule = (EasycashSummaryCaseModule) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) easycashSummaryCaseModule.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) easycashSummaryCaseModule.write) && this.MediaBrowserCompat$ItemReceiver == easycashSummaryCaseModule.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = easycashFeatureAccountCaseModule != null ? easycashFeatureAccountCaseModule.hashCode() : 0;
        PrepaidActivationCaseModule prepaidActivationCaseModule = this.write;
        if (prepaidActivationCaseModule != null) {
            i = prepaidActivationCaseModule.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PhoneConfigurationState(orientation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", dimensions=");
        sb.append(this.write);
        sb.append(", androidSdkVersion=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private EasycashSummaryCaseModule(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, PrepaidActivationCaseModule prepaidActivationCaseModule, int i) {
        onGetStartedClick.write((Object) easycashFeatureAccountCaseModule, "orientation");
        this.IconCompatParcelizer = easycashFeatureAccountCaseModule;
        this.write = prepaidActivationCaseModule;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public /* synthetic */ EasycashSummaryCaseModule(byte b) {
        this(EasycashFeatureAccountCaseModule.PORTRAIT, (PrepaidActivationCaseModule) null, Build.VERSION.SDK_INT);
    }

    public static /* synthetic */ EasycashSummaryCaseModule read(EasycashSummaryCaseModule easycashSummaryCaseModule, EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, PrepaidActivationCaseModule prepaidActivationCaseModule, int i, int i2) {
        if ((i2 & 1) != 0) {
            easycashFeatureAccountCaseModule = easycashSummaryCaseModule.IconCompatParcelizer;
        }
        if ((i2 & 2) != 0) {
            prepaidActivationCaseModule = easycashSummaryCaseModule.write;
        }
        if ((i2 & 4) != 0) {
            i = easycashSummaryCaseModule.MediaBrowserCompat$ItemReceiver;
        }
        onGetStartedClick.write((Object) easycashFeatureAccountCaseModule, "orientation");
        return new EasycashSummaryCaseModule(easycashFeatureAccountCaseModule, prepaidActivationCaseModule, i);
    }
}
