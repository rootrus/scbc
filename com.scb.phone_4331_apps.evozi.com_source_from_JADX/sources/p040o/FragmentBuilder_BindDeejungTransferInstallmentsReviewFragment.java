package p040o;

import android.graphics.BitmapFactory;
import android.util.Base64;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindDeejungTransferInstallmentsReviewFragment */
public final class FragmentBuilder_BindDeejungTransferInstallmentsReviewFragment extends FragmentBuilder_BindFundInvestmentExperienceFragment {
    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        return fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getScheme().equals("base64");
    }

    public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        byte[] decode = Base64.decode(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getSchemeSpecificPart(), 0);
        return new C6534x586e8bf0(BitmapFactory.decodeByteArray(decode, 0, decode.length), Picasso.read.MEMORY);
    }
}
