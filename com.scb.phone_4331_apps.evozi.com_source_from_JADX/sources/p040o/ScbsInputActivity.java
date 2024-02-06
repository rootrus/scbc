package p040o;

import p040o.OffshoreCurrencyActivity;

/* renamed from: o.ScbsInputActivity */
public final class ScbsInputActivity extends OffshoreCurrencyActivity_ViewBinding {
    public static final OffshoreCurrencyActivity write(OffshoreCurrencyActivity offshoreCurrencyActivity, int i) {
        onGetStartedClick.write((Object) offshoreCurrencyActivity, "$this$step");
        boolean z = i > 0;
        Number valueOf = Integer.valueOf(i);
        onGetStartedClick.write((Object) valueOf, "step");
        if (z) {
            OffshoreCurrencyActivity.IconCompatParcelizer iconCompatParcelizer = OffshoreCurrencyActivity.MediaBrowserCompat$ItemReceiver;
            int i2 = offshoreCurrencyActivity.IconCompatParcelizer;
            int i3 = offshoreCurrencyActivity.write;
            if (offshoreCurrencyActivity.read <= 0) {
                i = -i;
            }
            return new OffshoreCurrencyActivity(i2, i3, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(valueOf);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }
}
