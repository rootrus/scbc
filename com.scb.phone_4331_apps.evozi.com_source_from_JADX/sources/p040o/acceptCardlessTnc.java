package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.redeem.AmountFragment;

/* renamed from: o.acceptCardlessTnc */
public final class acceptCardlessTnc extends setCardElevation {
    public int IconCompatParcelizer = -1;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private FragmentBuilder_BindCCTermsAndConditionsFragment MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private int[] MediaMetadataCompat = {R.string.baht, R.string.units, R.string.all};
    private Context RatingCompat;
    private String read;
    private boolean write = false;

    public acceptCardlessTnc(setTitleMarginStart settitlemarginstart, Context context, FragmentBuilder_BindCCTermsAndConditionsFragment fragmentBuilder_BindCCTermsAndConditionsFragment) {
        super(settitlemarginstart);
        this.RatingCompat = context;
        this.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindCCTermsAndConditionsFragment;
    }

    public acceptCardlessTnc(setTitleMarginStart settitlemarginstart, Context context, FragmentBuilder_BindCCTermsAndConditionsFragment fragmentBuilder_BindCCTermsAndConditionsFragment, byte b) {
        super(settitlemarginstart);
        this.RatingCompat = context;
        this.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindCCTermsAndConditionsFragment;
        this.write = true;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return AmountFragment.read("AMOUNT_TAB", this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$ItemReceiver, this.read, this.write, this.MediaDescriptionCompat);
        }
        if (i == 1) {
            return AmountFragment.read("UNITS_TAB", this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$ItemReceiver, this.read, this.write, this.MediaDescriptionCompat);
        }
        if (i != 2) {
            return null;
        }
        return AmountFragment.read("ALL_TAB", this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$ItemReceiver, this.read, this.write, this.MediaDescriptionCompat);
    }

    public final int getCount() {
        return this.MediaMetadataCompat.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.RatingCompat.getString(this.MediaMetadataCompat[i]);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.MediaBrowserCompat$ItemReceiver = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.read = str4;
        if (str5 == null) {
            str5 = "";
        }
        this.MediaDescriptionCompat = str5;
    }
}
