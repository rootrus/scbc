package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.hml.HmlAboutAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.getCreateReportSpiCall;

public class HmlAboutFragment extends BaseFragment {
    @BindView
    RecyclerView recycler;

    public static HmlAboutFragment write(List<getCreateReportSpiCall> list) {
        HmlAboutFragment hmlAboutFragment = new HmlAboutFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("HML_ABOUT_EXTRA", new ArrayList(list));
        hmlAboutFragment.setArguments(bundle);
        return hmlAboutFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList parcelableArrayList;
        View inflate = layoutInflater.inflate(R.layout.f87742131494001, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getArguments() == null || (parcelableArrayList = getArguments().getParcelableArrayList("HML_ABOUT_EXTRA")) == null)) {
            RecyclerView recyclerView = this.recycler;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.recycler.setAdapter(new HmlAboutAdapter(parcelableArrayList));
        }
        return inflate;
    }
}
