package p040o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindEditRecipientFragment */
public final class FragmentBuilder_BindEditRecipientFragment extends FragmentBuilder_BindFundInvestmentExperienceFragment {
    private final Object IconCompatParcelizer = new Object();
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    private AssetManager MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindEditRecipientFragment(Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
    }

    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        Uri uri = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    this.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getAssets();
                }
            }
        }
        return new C6534x586e8bf0(onSubmit.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.open(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.toString().substring(22))), Picasso.read.DISK);
    }
}
