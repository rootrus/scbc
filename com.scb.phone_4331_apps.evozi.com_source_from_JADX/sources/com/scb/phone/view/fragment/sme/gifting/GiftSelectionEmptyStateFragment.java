package com.scb.phone.view.fragment.sme.gifting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;

public class GiftSelectionEmptyStateFragment extends BaseFragment {
    public static GiftSelectionEmptyStateFragment IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        GiftSelectionEmptyStateFragment giftSelectionEmptyStateFragment = new GiftSelectionEmptyStateFragment();
        giftSelectionEmptyStateFragment.setArguments(bundle);
        return giftSelectionEmptyStateFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.f87692131493996, viewGroup, false);
    }
}
