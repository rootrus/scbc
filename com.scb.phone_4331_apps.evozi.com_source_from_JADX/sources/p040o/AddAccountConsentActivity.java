package p040o;

/* renamed from: o.AddAccountConsentActivity */
public final class AddAccountConsentActivity extends OffshoreCurrencyActivity {
    public static final C1132xe4073f0a MediaBrowserCompat$CustomActionResultReceiver = new C1132xe4073f0a((byte) 0);
    /* access modifiers changed from: private */
    public static final AddAccountConsentActivity MediaBrowserCompat$MediaItem = new AddAccountConsentActivity(1, 0);

    public AddAccountConsentActivity(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AddAccountConsentActivity) {
            if (this.IconCompatParcelizer > this.write) {
                AddAccountConsentActivity addAccountConsentActivity = (AddAccountConsentActivity) obj;
                if (addAccountConsentActivity.IconCompatParcelizer > addAccountConsentActivity.write) {
                    return true;
                }
            }
            AddAccountConsentActivity addAccountConsentActivity2 = (AddAccountConsentActivity) obj;
            if (this.IconCompatParcelizer == addAccountConsentActivity2.IconCompatParcelizer && this.write == addAccountConsentActivity2.write) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append("..");
        sb.append(this.write);
        return sb.toString();
    }

    public final int hashCode() {
        if (this.IconCompatParcelizer > this.write) {
            return -1;
        }
        return (this.IconCompatParcelizer * 31) + this.write;
    }

    public final boolean read() {
        return this.IconCompatParcelizer > this.write;
    }
}
