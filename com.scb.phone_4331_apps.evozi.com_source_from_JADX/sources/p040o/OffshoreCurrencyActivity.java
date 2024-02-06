package p040o;

import java.util.Iterator;

/* renamed from: o.OffshoreCurrencyActivity */
public class OffshoreCurrencyActivity implements Iterable<Integer>, FundOnboardingSuccessActivity_ViewBinding {
    public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer((byte) 0);
    public final int IconCompatParcelizer;
    public final int read;
    public final int write;

    public OffshoreCurrencyActivity(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.IconCompatParcelizer = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= AlertController$RecycleListView.IconCompatParcelizer(i2, i, i3);
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                i2 += AlertController$RecycleListView.IconCompatParcelizer(i, i2, -i3);
            }
            this.write = i2;
            this.read = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean read() {
        return this.read <= 0 ? this.IconCompatParcelizer < this.write : this.IconCompatParcelizer > this.write;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OffshoreCurrencyActivity) {
            if (!read() || !((OffshoreCurrencyActivity) obj).read()) {
                OffshoreCurrencyActivity offshoreCurrencyActivity = (OffshoreCurrencyActivity) obj;
                if (!(this.IconCompatParcelizer == offshoreCurrencyActivity.IconCompatParcelizer && this.write == offshoreCurrencyActivity.write && this.read == offshoreCurrencyActivity.read)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (read()) {
            return -1;
        }
        return (((this.IconCompatParcelizer * 31) + this.write) * 31) + this.read;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.read > 0) {
            sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append("..");
            sb.append(this.write);
            sb.append(" step ");
            i = this.read;
        } else {
            sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(" downTo ");
            sb.append(this.write);
            sb.append(" step ");
            i = -this.read;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: o.OffshoreCurrencyActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new onGetStartClicked(this.IconCompatParcelizer, this.write, this.read);
    }
}
