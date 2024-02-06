package com.scb.phone.view.fragment.sme.deals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.view.fragment.ReviewCommonFragment;
import java.util.ArrayList;

public class DealsBuyReviewFragment extends ReviewCommonFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("DEALS_BUY_PURCHASE_REVIEW_DISPLAY");
        if (parcelableArrayList != null) {
            IconCompatParcelizer(parcelableArrayList);
        }
        return onCreateView;
    }
}
