package com.scb.phone.view.fragment.demo.ntb;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.demontb.BankingServiceAdapter;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ntb.NtbUserInfoFragment;
import java.util.ArrayList;
import p040o.FragmentBuilder_BindBaseRequestToPayFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.IdParameters;
import p040o.TextLineCorners;
import p040o.ZSYR2K;
import p040o.averageLightness;
import p040o.deleteDocument;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getGeoDataClient;
import p040o.nativeInitializeFromFile;
import p040o.setLocale;

public class NTBBankingServiceFragment extends BaseFragment implements IdParameters.IdState.IconCompatParcelizer, FragmentBuilder_BindBaseRequestToPayFragment {
    private IdParameters.IdState.write IconCompatParcelizer;
    @HmlPinActivity
    public averageLightness bankingServicePresenter;
    @BindView
    CustomProfileImageView cusIvProfile;
    @BindView
    RecyclerView rvBankingActions;
    @BindView
    TextView tvHomeWelcomeHeadline;
    @BindView
    TextView tvHomeWelcomeUserName;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85702131493797, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.bankingServicePresenter.MediaBrowserCompat$ItemReceiver(this);
        ArrayList parcelableArrayListExtra = getActivity().getIntent().getParcelableArrayListExtra("BANKING_SERVICE_TILE");
        if (parcelableArrayListExtra != null) {
            this.rvBankingActions.setAdapter(new BankingServiceAdapter(getContext(), this, parcelableArrayListExtra));
            this.rvBankingActions.setNestedScrollingEnabled(true);
        }
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        averageLightness averagelightness = this.bankingServicePresenter;
        nativeInitializeFromFile nativeinitializefromfile = new nativeInitializeFromFile(averagelightness.read.read(averagelightness.MediaBrowserCompat$ItemReceiver.read.read()));
        if (averagelightness.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativeinitializefromfile.IconCompatParcelizer(averagelightness.RatingCompat);
        }
        inflate.post(new deleteDocument(this));
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IdParameters.IdState.write) {
            this.IconCompatParcelizer = (IdParameters.IdState.write) context;
        }
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34104 r3) {
        this.tvHomeWelcomeUserName.setVisibility(r3.RatingCompat.isEmpty() ? 8 : 0);
        this.tvHomeWelcomeUserName.setText(r3.RatingCompat);
        this.tvHomeWelcomeHeadline.setText(r3.read);
        this.cusIvProfile.setImageResource(NtbUserInfoFragment.MediaSessionCompat$Token().get(r3.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final void IconCompatParcelizer(int i) {
        ArrayList parcelableArrayListExtra = getActivity().getIntent().getParcelableArrayListExtra("BANKING_SERVICE_TILE");
        if (parcelableArrayListExtra.get(i) != null) {
            averageLightness averagelightness = this.bankingServicePresenter;
            discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i);
            if (discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView == setLocale.SPLASH && discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle == getGeoDataClient.IMAGE) {
                TextLineCorners textLineCorners = new TextLineCorners(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                if (averagelightness.RatingCompat != null) {
                    textLineCorners.IconCompatParcelizer(averagelightness.RatingCompat);
                }
            }
            ZSYR2K[] zsyr2kArr = new ZSYR2K[4];
            String str = "";
            zsyr2kArr[0] = new ZSYR2K("type", ((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i)).ExpandedMenuView != null ? ((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i)).ExpandedMenuView.toString().toLowerCase() : str);
            if (((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i)).setTitle != null) {
                str = ((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i)).setTitle.toString().toLowerCase();
            }
            zsyr2kArr[1] = new ZSYR2K("sub_type", str);
            zsyr2kArr[2] = new ZSYR2K(Name.MARK, String.valueOf(((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i)).setBackgroundResource));
            zsyr2kArr[3] = new ZSYR2K("sort_sequence", String.valueOf(((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) parcelableArrayListExtra.get(i)).setIcon));
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("ntb_banking_tile", zsyr2kArr);
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer.IconCompatParcelizer(str);
    }

    public final void write(String str) {
        IdParameters.IdState.write write = this.IconCompatParcelizer;
        if (write != null) {
            write.write(str);
        }
    }
}
