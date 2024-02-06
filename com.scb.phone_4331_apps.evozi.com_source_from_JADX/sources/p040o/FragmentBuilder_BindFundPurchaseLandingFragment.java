package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindFundPurchaseLandingFragment */
public final class FragmentBuilder_BindFundPurchaseLandingFragment extends FragmentBuilder_BindFundInvestmentExperienceFragment {
    private final Context write;

    public FragmentBuilder_BindFundPurchaseLandingFragment(Context context) {
        this.write = context;
    }

    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        if (fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$SearchResultReceiver != 0) {
            return true;
        }
        return "android.resource".equals(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getScheme());
    }

    public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        Resources MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, fragmentBuilder_BindFixedTransferInputFormFragment);
        return new C6534x586e8bf0(IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindFixedTransferInputFormFragment), fragmentBuilder_BindFixedTransferInputFormFragment), Picasso.read.DISK);
    }

    private static Bitmap IconCompatParcelizer(Resources resources, int i, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        BitmapFactory.Options read = read(fragmentBuilder_BindFixedTransferInputFormFragment);
        if (read != null && read.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i, read);
            FragmentBuilder_BindFundInvestmentExperienceFragment.IconCompatParcelizer(fragmentBuilder_BindFixedTransferInputFormFragment.PlaybackStateCompat$CustomAction, fragmentBuilder_BindFixedTransferInputFormFragment.setHasDecor, read.outWidth, read.outHeight, read, fragmentBuilder_BindFixedTransferInputFormFragment);
        }
        return BitmapFactory.decodeResource(resources, i, read);
    }
}
