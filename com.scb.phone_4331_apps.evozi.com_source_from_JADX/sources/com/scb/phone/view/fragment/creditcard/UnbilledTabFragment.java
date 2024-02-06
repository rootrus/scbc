package com.scb.phone.view.fragment.creditcard;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.creditcard.CreditCardDetailUnbilledAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.EasycashCardService;
import p040o.HmlPinActivity;
import p040o.ISO8601Utils;
import p040o.findUser;
import p040o.required;
import p040o.setChildDrawingOrderCallback;
import p040o.validateGER;

public class UnbilledTabFragment extends BaseFragment implements CheckCaptureModule_GetIJsonExactionHelperRttiFactory.IconCompatParcelizer {
    private CreditCardDetailUnbilledAdapter IconCompatParcelizer;
    @BindView
    RelativeLayout mContainerRelativeLayout;
    @BindView
    TextView mEmptyCenterTitle;
    @BindView
    TextView mEmptyDescription;
    @BindView
    ImageView mEmptyImage;
    @BindView
    TextView mEmptyTitle;
    @BindView
    RecyclerView mRecyclerView;
    @BindView
    TextView mShowMessages;
    @HmlPinActivity
    public ISO8601Utils unbilledTabPresenter;

    public static UnbilledTabFragment read(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("CREDIT_CARD_NUMBER", str);
        UnbilledTabFragment unbilledTabFragment = new UnbilledTabFragment();
        unbilledTabFragment.setArguments(bundle);
        return unbilledTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86382131493865, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.unbilledTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.unbilledTabPresenter.read(getArguments().getString("CREDIT_CARD_NUMBER"));
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_UPDATE_LIST")).subscribe(new findUser(this), EasycashCardService.IconCompatParcelizer);
        return inflate;
    }

    public void onDestroy() {
        this.unbilledTabPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(required required) {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
        CreditCardDetailUnbilledAdapter creditCardDetailUnbilledAdapter = this.IconCompatParcelizer;
        if (creditCardDetailUnbilledAdapter == null) {
            getContext();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.mRecyclerView.setNestedScrollingEnabled(false);
            validateGER validateger = new validateGER((Parcelable) null);
            CreditCardDetailUnbilledAdapter creditCardDetailUnbilledAdapter2 = new CreditCardDetailUnbilledAdapter(getContext(), required);
            this.IconCompatParcelizer = creditCardDetailUnbilledAdapter2;
            this.mRecyclerView.setAdapter(validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) creditCardDetailUnbilledAdapter2));
            validateger.IconCompatParcelizer(this.mRecyclerView);
            return;
        }
        creditCardDetailUnbilledAdapter.read = null;
        creditCardDetailUnbilledAdapter.read = required;
        creditCardDetailUnbilledAdapter.IconCompatParcelizer.write();
    }

    public final void read() {
        this.mEmptyTitle.setVisibility(8);
        this.mEmptyCenterTitle.setVisibility(0);
        this.mEmptyCenterTitle.setText(getResources().getString(R.string.custom_empty_no_transactions));
        this.mEmptyDescription.setVisibility(8);
        this.mContainerRelativeLayout.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
    }

    public final void write() {
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
        this.mContainerRelativeLayout.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
    }

    @OnClick
    public void onClick() {
        this.unbilledTabPresenter.read(getArguments().getString("CREDIT_CARD_NUMBER"));
    }

    public final void Keep() {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }
}
