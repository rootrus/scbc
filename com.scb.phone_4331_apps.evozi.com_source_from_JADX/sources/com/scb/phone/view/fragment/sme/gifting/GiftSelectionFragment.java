package com.scb.phone.view.fragment.sme.gifting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.sme.gifting.GiftingTransferLandingActivity;
import com.scb.phone.view.adapter.sme.gifting.MoneyPresentAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C5200rR;
import p040o.CheckParameters_MembersInjector$MediaSessionCompat$Token;
import p040o.HmlPinActivity;
import p040o.getTutorialDismissMsg;
import p040o.showEdgesGuidance;

public class GiftSelectionFragment extends BaseFragment implements CheckParameters_MembersInjector$MediaSessionCompat$Token, MoneyPresentAdapter.write {
    private MoneyPresentAdapter IconCompatParcelizer;
    @BindView
    LinearLayout errorLayout;
    @BindView
    RecyclerView moneyPresentRecyclerView;
    @BindView
    TextView moneyPresentText;
    @HmlPinActivity
    public C5200rR moneyPresentsPresenter;

    public static GiftSelectionFragment write(List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("GIFTS_LIST_DISPLAY", (ArrayList) list);
        bundle.putString("GIFTS_CHOOSE_TEXT", str);
        GiftSelectionFragment giftSelectionFragment = new GiftSelectionFragment();
        giftSelectionFragment.setArguments(bundle);
        return giftSelectionFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87682131493995, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.moneyPresentsPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5200rR rRVar = this.moneyPresentsPresenter;
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("GIFTS_LIST_DISPLAY");
        String string = getArguments().getString("GIFTS_CHOOSE_TEXT");
        if (!(!(rRVar.RatingCompat != null) || parcelableArrayList == null || string == null)) {
            if (parcelableArrayList.isEmpty()) {
                showEdgesGuidance showedgesguidance = showEdgesGuidance.MediaBrowserCompat$ItemReceiver;
                if (rRVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    showedgesguidance.IconCompatParcelizer(rRVar.RatingCompat);
                }
            } else {
                getTutorialDismissMsg gettutorialdismissmsg = new getTutorialDismissMsg(parcelableArrayList, string);
                if (rRVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    gettutorialdismissmsg.IconCompatParcelizer(rRVar.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list, String str) {
        this.moneyPresentText.setText(str);
        this.IconCompatParcelizer = new MoneyPresentAdapter(list, this);
        getContext();
        this.moneyPresentRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.moneyPresentRecyclerView.setAdapter(this.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.errorLayout.setVisibility(0);
        this.moneyPresentRecyclerView.setVisibility(8);
    }

    public final void read(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r2) {
        GiftingTransferLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), r2);
    }
}
