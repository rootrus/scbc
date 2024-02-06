package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindEtbPersonalInformationFragment */
public final class FragmentBuilder_BindEtbPersonalInformationFragment extends FragmentBuilder_BindEkycTermsAndConditionsFragment {
    public FragmentBuilder_BindEtbPersonalInformationFragment(Context context) {
        super(context);
    }

    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        return "file".equals(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getScheme());
    }

    public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        return new C6534x586e8bf0((Bitmap) null, onSubmit.IconCompatParcelizer(this.IconCompatParcelizer.getContentResolver().openInputStream(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView)), Picasso.read.DISK, new setSubtitleTextAppearance(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getPath()).read("Orientation", 1));
    }
}
