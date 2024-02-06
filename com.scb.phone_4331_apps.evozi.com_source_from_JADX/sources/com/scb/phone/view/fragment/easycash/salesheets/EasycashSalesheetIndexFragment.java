package com.scb.phone.view.fragment.easycash.salesheets;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.speedycash.LoanTermsConditionsActivity;
import com.scb.phone.view.adapter.easycash.EasycashSalesheetAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.DeepLinkModule_ContributeExternalDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getIpOperationsFilePath;
import p040o.immediateFailedFuture;
import p040o.setTapText;
import p040o.submit;

public class EasycashSalesheetIndexFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.setExpandedFormat {
    @HmlPinActivity
    public Image.C3462b easycashSalesheetProductsPresenter;
    @BindView
    RecyclerView easycashSalesheetsRecyclerView;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static EasycashSalesheetIndexFragment IconCompatParcelizer(List<submit> list) {
        EasycashSalesheetIndexFragment easycashSalesheetIndexFragment = new EasycashSalesheetIndexFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.scb.phone.SALESHEET_LIST_DISPLAY", (ArrayList) list);
        easycashSalesheetIndexFragment.setArguments(bundle);
        return easycashSalesheetIndexFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87112131493938, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.easycashSalesheetProductsPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getArguments() == null || getArguments().getParcelableArrayList("com.scb.phone.SALESHEET_LIST_DISPLAY") == null)) {
            Image.C3462b bVar = this.easycashSalesheetProductsPresenter;
            ArrayList parcelableArrayList = getArguments().getParcelableArrayList("com.scb.phone.SALESHEET_LIST_DISPLAY");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                getIpOperationsFilePath getipoperationsfilepath = new getIpOperationsFilePath(parcelableArrayList);
                if (bVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getipoperationsfilepath.IconCompatParcelizer(bVar.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ArrayList<submit> arrayList) {
        EasycashSalesheetAdapter easycashSalesheetAdapter = new EasycashSalesheetAdapter(arrayList, new DeepLinkModule_ContributeExternalDeepLinkActivity(this));
        RecyclerView recyclerView = this.easycashSalesheetsRecyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.easycashSalesheetsRecyclerView.setHasFixedSize(true);
        this.easycashSalesheetsRecyclerView.setAdapter(easycashSalesheetAdapter);
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        Intent IconCompatParcelizer = LoanTermsConditionsActivity.IconCompatParcelizer(getContext(), immediatefailedfuture);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.easycashSalesheetProductsPresenter.onDestroy();
    }
}
