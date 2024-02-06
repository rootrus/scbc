package p040o;

import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindFundInvestmentExperienceFragment */
public abstract class FragmentBuilder_BindFundInvestmentExperienceFragment {
    /* access modifiers changed from: package-private */
    public boolean MediaBrowserCompat$ItemReceiver() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean MediaBrowserCompat$ItemReceiver(NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int write() {
        return 0;
    }

    public abstract C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException;

    public abstract boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment);

    static void IconCompatParcelizer(int i, int i2, int i3, int i4, BitmapFactory.Options options, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                d = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                if (fragmentBuilder_BindFixedTransferInputFormFragment.read) {
                    i5 = Math.max(floor, floor2);
                } else {
                    i5 = Math.min(floor, floor2);
                }
            }
            i5 = (int) d;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    static BitmapFactory.Options read(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        boolean z = false;
        boolean z2 = (fragmentBuilder_BindFixedTransferInputFormFragment.PlaybackStateCompat$CustomAction == 0 && fragmentBuilder_BindFixedTransferInputFormFragment.setHasDecor == 0) ? false : true;
        if (fragmentBuilder_BindFixedTransferInputFormFragment.IconCompatParcelizer != null) {
            z = true;
        }
        BitmapFactory.Options options = null;
        if (z2 || z || fragmentBuilder_BindFixedTransferInputFormFragment.MediaDescriptionCompat) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = z2;
            options.inInputShareable = fragmentBuilder_BindFixedTransferInputFormFragment.MediaDescriptionCompat;
            options.inPurgeable = fragmentBuilder_BindFixedTransferInputFormFragment.MediaDescriptionCompat;
            if (z) {
                options.inPreferredConfig = fragmentBuilder_BindFixedTransferInputFormFragment.IconCompatParcelizer;
            }
        }
        return options;
    }
}
