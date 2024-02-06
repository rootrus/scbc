package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.C1389kI;
import p040o.getAddress2;
import p040o.normalize;
import p040o.resetPin;
import p040o.updateFavourite;
import p040o.updateProfile;

public class DeejungPlansFragment extends BaseFragment {
    private ViewPager.MediaMetadataCompat IconCompatParcelizer = new ViewPager.MediaMetadataCompat() {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            DeejungPlansFragment.this.MediaBrowserCompat$ItemReceiver();
            DeejungPlansFragment.this.read(i, 0);
        }
    };
    public getAddress2 MediaBrowserCompat$CustomActionResultReceiver;
    private C1389kI MediaBrowserCompat$MediaItem;
    @BindView
    public HorizontalScrollView plansHorizontalScrollView;
    @BindView
    LinearLayout plansView;
    @BindView
    public FragmentWrapContentViewPager viewPager;

    public static DeejungPlansFragment MediaBrowserCompat$CustomActionResultReceiver(List<normalize> list) {
        DeejungPlansFragment deejungPlansFragment = new DeejungPlansFragment();
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        bundle.putParcelableArrayList("com.scb.phone.view.fragment.card_management.KEY_DEEJUNG_PLAN_DISPLAY_MODELS", arrayList);
        deejungPlansFragment.setArguments(bundle);
        return deejungPlansFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86562131493883, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        ArrayList<normalize> parcelableArrayList = getArguments().getParcelableArrayList("com.scb.phone.view.fragment.card_management.KEY_DEEJUNG_PLAN_DISPLAY_MODELS");
        this.plansHorizontalScrollView.setFillViewport(true);
        this.plansHorizontalScrollView.setSmoothScrollingEnabled(true);
        int i = 0;
        for (normalize normalize : parcelableArrayList) {
            Button button = (Button) getLayoutInflater().inflate(R.layout.f92322131494459, this.plansView, false);
            button.setText(normalize.MediaSessionCompat$QueueItem);
            button.setTag(Integer.valueOf(i));
            button.setOnClickListener(new updateProfile(this, button));
            this.plansView.addView(button);
            i++;
        }
        this.viewPager.setEnableDrawDynamicViewHeight(true);
        read(0, -1);
        this.viewPager.setAdapter(new resetPin(getActivity().getSupportFragmentManager(), parcelableArrayList, this.MediaBrowserCompat$CustomActionResultReceiver));
        this.viewPager.addOnPageChangeListener(this.IconCompatParcelizer);
        return inflate;
    }

    /* access modifiers changed from: private */
    public void read(int i, int i2) {
        if (this.plansView.getChildCount() > 0) {
            Button button = (Button) this.plansView.getChildAt(i);
            button.setSelected(true);
            this.plansHorizontalScrollView.post(new updateFavourite(this, button));
        }
        C1389kI kIVar = this.MediaBrowserCompat$MediaItem;
        if (kIVar != null && -1 != i2) {
            kIVar.write(i2);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        int childCount = this.plansView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((Button) this.plansView.getChildAt(i)).setSelected(false);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1389kI) {
            this.MediaBrowserCompat$MediaItem = (C1389kI) context;
        }
    }
}
