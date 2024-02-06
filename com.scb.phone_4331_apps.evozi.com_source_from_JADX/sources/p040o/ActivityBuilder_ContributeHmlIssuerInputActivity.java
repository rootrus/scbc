package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlIssuerInputActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlIssuerInputActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ OccupationSearchFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlIssuerInputActivity(OccupationSearchFragment occupationSearchFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = occupationSearchFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OccupationSearchFragment occupationSearchFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (String.valueOf(occupationSearchFragment.IconCompatParcelizer.mEditTextView.getText()).isEmpty()) {
            occupationSearchFragment.IconCompatParcelizer.dismiss();
            return;
        }
        String valueOf = String.valueOf(occupationSearchFragment.IconCompatParcelizer.mEditTextView.getText());
        Intent intent = new Intent();
        intent.putExtra("EXTRA_RESULT_OCCUPATION_CODE", "93");
        intent.putExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION", valueOf);
        intent.putExtra("EXTRA_RESULT_OCCUPATION_ISIC_CODE", "");
        occupationSearchFragment.getActivity().setResult(-1, intent);
        occupationSearchFragment.getActivity().finish();
    }
}
