package p040o;

import java.io.Serializable;

/* renamed from: o.ReviewAccountsActivity */
public class ReviewAccountsActivity implements Serializable, Cloneable {
    protected final int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    protected final int read;

    public ReviewAccountsActivity(String str, int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Protocol name");
        this.MediaBrowserCompat$CustomActionResultReceiver = DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Protocol minor version");
        this.read = DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i2, "Protocol minor version");
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public ReviewAccountsActivity read(int i, int i2) {
        if (i == this.MediaBrowserCompat$CustomActionResultReceiver && i2 == this.read) {
            return this;
        }
        return new ReviewAccountsActivity(this.MediaBrowserCompat$ItemReceiver, i, i2);
    }

    public final int hashCode() {
        return (this.MediaBrowserCompat$ItemReceiver.hashCode() ^ (this.MediaBrowserCompat$CustomActionResultReceiver * 100000)) ^ this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewAccountsActivity)) {
            return false;
        }
        ReviewAccountsActivity reviewAccountsActivity = (ReviewAccountsActivity) obj;
        if (this.MediaBrowserCompat$ItemReceiver.equals(reviewAccountsActivity.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == reviewAccountsActivity.MediaBrowserCompat$CustomActionResultReceiver && this.read == reviewAccountsActivity.read) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('/');
        sb.append(Integer.toString(this.MediaBrowserCompat$CustomActionResultReceiver));
        sb.append('.');
        sb.append(Integer.toString(this.read));
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(ReviewAccountsActivity reviewAccountsActivity) {
        if (reviewAccountsActivity != null && this.MediaBrowserCompat$ItemReceiver.equals(reviewAccountsActivity.MediaBrowserCompat$ItemReceiver)) {
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(reviewAccountsActivity, "Protocol version");
            Object[] objArr = {this, reviewAccountsActivity};
            if (this.MediaBrowserCompat$ItemReceiver.equals(reviewAccountsActivity.MediaBrowserCompat$ItemReceiver)) {
                int i = this.MediaBrowserCompat$CustomActionResultReceiver - reviewAccountsActivity.MediaBrowserCompat$CustomActionResultReceiver;
                if (i == 0) {
                    i = this.read - reviewAccountsActivity.read;
                }
                if (i <= 0) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException(String.format("Versions for different protocols cannot be compared: %s %s", objArr));
            }
        }
        return false;
    }
}
