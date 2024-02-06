package p040o;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* renamed from: o.FragmentBuilder_BindFundInvestmentExperienceFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6534x586e8bf0 {
    final Picasso.read IconCompatParcelizer;
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final HowToAddAccountStep2Activity MediaBrowserCompat$ItemReceiver;
    final Bitmap read;

    public C6534x586e8bf0(Bitmap bitmap, Picasso.read read2) {
        this((Bitmap) FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver(bitmap, "bitmap == null"), (HowToAddAccountStep2Activity) null, read2, 0);
    }

    public C6534x586e8bf0(HowToAddAccountStep2Activity howToAddAccountStep2Activity, Picasso.read read2) {
        this((Bitmap) null, (HowToAddAccountStep2Activity) FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver(howToAddAccountStep2Activity, "source == null"), read2, 0);
    }

    C6534x586e8bf0(Bitmap bitmap, HowToAddAccountStep2Activity howToAddAccountStep2Activity, Picasso.read read2, int i) {
        if ((bitmap != null) != (howToAddAccountStep2Activity != null)) {
            this.read = bitmap;
            this.MediaBrowserCompat$ItemReceiver = howToAddAccountStep2Activity;
            this.IconCompatParcelizer = (Picasso.read) FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver(read2, "loadedFrom == null");
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            return;
        }
        throw new AssertionError();
    }
}
