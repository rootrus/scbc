package p040o;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindEkycTermsAndConditionsFragment */
public class FragmentBuilder_BindEkycTermsAndConditionsFragment extends FragmentBuilder_BindFundInvestmentExperienceFragment {
    final Context IconCompatParcelizer;

    public FragmentBuilder_BindEkycTermsAndConditionsFragment(Context context) {
        this.IconCompatParcelizer = context;
    }

    public boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        return "content".equals(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getScheme());
    }

    public C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        return new C6534x586e8bf0(onSubmit.IconCompatParcelizer(this.IconCompatParcelizer.getContentResolver().openInputStream(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView)), Picasso.read.DISK);
    }
}
