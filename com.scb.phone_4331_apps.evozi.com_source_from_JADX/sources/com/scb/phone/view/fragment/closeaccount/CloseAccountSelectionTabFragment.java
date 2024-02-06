package com.scb.phone.view.fragment.closeaccount;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.DateTypeAdapter;
import p040o.FragmentBuilder_BindBaseTakePhotoFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule;
import p040o.newTypeHierarchyFactory;
import p040o.transactions;

public class CloseAccountSelectionTabFragment extends BaseFragment implements IdCaptureModule.C6907c, FragmentBuilder_BindBaseTakePhotoFragment {
    private FragmentBuilder_BindBaseTakePhotoFragment MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public newTypeHierarchyFactory presenter;
    @BindView
    TabLayout tabLayout;
    @BindView
    ViewPager viewPager;

    public static CloseAccountSelectionTabFragment IconCompatParcelizer() {
        return new CloseAccountSelectionTabFragment();
    }

    public void onAttach(Context context) {
        if (getParentFragment() instanceof FragmentBuilder_BindBaseTakePhotoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindBaseTakePhotoFragment) getParentFragment();
        } else if (context instanceof FragmentBuilder_BindBaseTakePhotoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindBaseTakePhotoFragment) context;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement AccountTargetSelectionListener");
            throw new ClassCastException(sb.toString());
        }
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90182131494245, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        newTypeHierarchyFactory newtypehierarchyfactory = this.presenter;
        DateTypeAdapter.C33151 r0 = DateTypeAdapter.C33151.IconCompatParcelizer;
        if (newtypehierarchyfactory.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r0.IconCompatParcelizer(newtypehierarchyfactory.RatingCompat);
        }
        return inflate;
    }

    public final void read() {
        this.viewPager.setAdapter(new transactions(getChildFragmentManager(), getResources()));
        this.viewPager.setOffscreenPageLimit(2);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.viewPager.setCurrentItem(0);
    }

    public final void write() {
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
