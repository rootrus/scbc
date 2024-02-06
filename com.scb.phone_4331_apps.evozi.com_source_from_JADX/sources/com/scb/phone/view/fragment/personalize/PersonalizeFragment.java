package com.scb.phone.view.fragment.personalize;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.FavouriteTargetAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlNTBLaserIdAboutActivity;
import p040o.C4355eW;
import p040o.C4356eX;
import p040o.C4381eq;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.access$2200;
import p040o.getGeoDataClient;
import p040o.getICheckDeserializerRtti;
import p040o.getTopLeftCornerWidth;
import p040o.setLastBaselineToBottomHeight;
import p040o.zzmd;

public class PersonalizeFragment extends BaseFragment implements getTopLeftCornerWidth.setBackgroundResource {
    @BindView
    RelativeLayout addPromptPay;
    @BindView
    RelativeLayout addQuickBalance;
    @BindView
    ImageView avatarPromtPay;
    @BindView
    ImageView avatarQuickBalance;
    @BindView
    TextView billPaymentTitle;
    @BindView
    RecyclerView favouriteBillPaymentRecyclerView;
    @BindView
    RecyclerView favouriteRemittanceRecyclerView;
    @BindView
    RecyclerView favouriteTopUpRecyclerView;
    @BindView
    RecyclerView favouriteTransferRecyclerView;
    @BindView
    protected LinearLayout mFavouriteBillPaymentEmpty;
    @BindView
    protected LinearLayout mFavouriteRemittanceEmpty;
    @BindView
    protected LinearLayout mFavouriteTopUpEmpty;
    @BindView
    protected LinearLayout mFavouriteTransferEmpty;
    @HmlPinActivity
    public C4381eq presenter;
    @BindView
    LinearLayout remittanceContainer;
    @BindView
    TextView remittanceTitle;
    @BindView
    TextView topUpTitle;
    @BindView
    TextView transferTitle;

    public static PersonalizeFragment read(long j) {
        PersonalizeFragment personalizeFragment = new PersonalizeFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("com.scb.phone.EXTRA_PARENT_ID", j);
        personalizeFragment.setArguments(bundle);
        return personalizeFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88872131494114, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.write(this);
        this.transferTitle.setText(getString(R.string.personalize_favorite_transfer_empty));
        this.topUpTitle.setText(getString(R.string.favorite_top_up_empty));
        this.billPaymentTitle.setText(getString(R.string.favorite_bill_payment_empty));
        String obj = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.ic_promp_pay_lg).toString();
        String obj2 = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.ic_portfolio).toString();
        Drawable write = setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_place_holder);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), write, this.avatarPromtPay, obj, getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), write, this.avatarQuickBalance, obj2, getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        ((TextView) this.mFavouriteTopUpEmpty.findViewById(R.id.tv_favourite_add_suggestion)).setText(R.string.favorite_add_suggestion_top_up);
        ((TextView) this.mFavouriteTransferEmpty.findViewById(R.id.tv_favourite_add_suggestion)).setText(R.string.favorite_add_favorite_personalized_tile);
        ((TextView) this.mFavouriteBillPaymentEmpty.findViewById(R.id.tv_favourite_add_suggestion)).setText(R.string.favorite_add_suggestion_bill_payment);
        C4381eq eqVar = this.presenter;
        boolean z = true;
        if (zzmd.zzm.zzb.zza.INDIVIDUAL.equals(eqVar.IconCompatParcelizer.IconCompatParcelizer())) {
            C4355eW eWVar = C4355eW.IconCompatParcelizer;
            if (eqVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eWVar.IconCompatParcelizer(eqVar.RatingCompat);
            }
        } else {
            C4356eX eXVar = C4356eX.write;
            if (eqVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eXVar.IconCompatParcelizer(eqVar.RatingCompat);
            }
        }
        C4381eq eqVar2 = this.presenter;
        eqVar2.write.read();
        eqVar2.write.IconCompatParcelizer(new C4381eq.write(eqVar2, (byte) 0));
        return inflate;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write(access$2200 access_2200) {
        super.write(access_2200);
        this.favouriteTransferRecyclerView.setClickable(true);
        this.favouriteTopUpRecyclerView.setClickable(true);
        this.favouriteBillPaymentRecyclerView.setClickable(true);
        this.favouriteRemittanceRecyclerView.setClickable(true);
    }

    public final void write(List<CrashlyticsReport.Session.Event.Application.Builder> list) {
        if (list == null || list.size() <= 0) {
            this.transferTitle.setText(getString(R.string.personalize_favorite_transfer_empty));
            return;
        }
        this.mFavouriteTransferEmpty.setVisibility(8);
        IconCompatParcelizer(list, this.favouriteTransferRecyclerView);
        this.transferTitle.setText(getString(R.string.favorite_transfer, Integer.valueOf(list.size())));
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.Session.Event.Application.Builder> list) {
        if (list == null || list.isEmpty()) {
            this.topUpTitle.setText(getString(R.string.favorite_top_up_empty));
            return;
        }
        this.mFavouriteTopUpEmpty.setVisibility(8);
        IconCompatParcelizer(list, this.favouriteTopUpRecyclerView);
        this.topUpTitle.setText(getString(R.string.favorite_top_up, Integer.valueOf(list.size())));
    }

    public final void read(List<CrashlyticsReport.Session.Event.Application.Builder> list) {
        if (list == null || list.isEmpty()) {
            this.billPaymentTitle.setText(getString(R.string.favorite_bill_payment_empty));
            return;
        }
        this.mFavouriteBillPaymentEmpty.setVisibility(8);
        IconCompatParcelizer(list, this.favouriteBillPaymentRecyclerView);
        this.billPaymentTitle.setText(getString(R.string.favorite_bill_payment, Integer.valueOf(list.size())));
    }

    public final void IconCompatParcelizer(List<CrashlyticsReport.Session.Event.Application.Builder> list) {
        if (list == null || list.isEmpty()) {
            this.remittanceTitle.setText(getString(R.string.favorite_remittance_empty));
            return;
        }
        this.mFavouriteRemittanceEmpty.setVisibility(8);
        IconCompatParcelizer(list, this.favouriteRemittanceRecyclerView);
        this.remittanceTitle.setText(getString(R.string.favorite_remittance, Integer.valueOf(list.size())));
    }

    private void IconCompatParcelizer(List<CrashlyticsReport.Session.Event.Application.Builder> list, RecyclerView recyclerView) {
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(new FavouriteTargetAdapter(getContext(), list, new ActivityBuilder_ContributeHmlNTBLaserIdAboutActivity(this, recyclerView, list)));
    }

    @OnClick
    public void addQuickPromptPay() {
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(getArguments().getLong("com.scb.phone.EXTRA_PARENT_ID"), getGeoDataClient.QUICKPROMPTPAY);
        this.addPromptPay.setClickable(false);
    }

    @OnClick
    public void addQuickBalance() {
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(getArguments().getLong("com.scb.phone.EXTRA_PARENT_ID"), getGeoDataClient.QUICKBALANCE);
        this.addQuickBalance.setClickable(false);
    }

    public final void read(String str) {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction(str);
            getActivity().sendBroadcast(intent);
            getActivity().finish();
        }
    }

    public final void read() {
        this.favouriteBillPaymentRecyclerView.setClickable(true);
        this.favouriteTopUpRecyclerView.setClickable(true);
        this.favouriteTransferRecyclerView.setClickable(true);
    }

    public final void write() {
        this.remittanceContainer.setVisibility(0);
        ((TextView) this.mFavouriteRemittanceEmpty.findViewById(R.id.tv_favourite_add_suggestion)).setText(R.string.favorite_add_suggestion_remittance);
        this.favouriteRemittanceRecyclerView.setClickable(true);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.remittanceContainer.setVisibility(8);
    }
}
