package com.scb.phone.view.fragment.creditcard;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.creditcard.CreditCardBilledDetailAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.getInterface;
import p040o.validateGER;

public class BilledDetailFragment extends BaseFragment {
    @BindView
    RecyclerView mRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86332131493860, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getInterface getinterface = (getActivity() == null || getActivity().getIntent() == null) ? null : (getInterface) getActivity().getIntent().getParcelableExtra("BILLED_DETAIL");
        setTransitioning();
        if (getinterface != null) {
            setTransitioning();
            ParcelableVolumeInfo(getinterface.MediaBrowserCompat$CustomActionResultReceiver);
            setActionBarVisibilityCallback();
            getContext();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.mRecyclerView.setNestedScrollingEnabled(false);
            validateGER validateger = new validateGER((Parcelable) null);
            this.mRecyclerView.setAdapter(validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) new CreditCardBilledDetailAdapter(getContext(), getinterface)));
            validateger.IconCompatParcelizer(this.mRecyclerView);
        }
        return inflate;
    }
}
