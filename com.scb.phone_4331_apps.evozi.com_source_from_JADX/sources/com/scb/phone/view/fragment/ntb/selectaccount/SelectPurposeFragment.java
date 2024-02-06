package com.scb.phone.view.fragment.ntb.selectaccount;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.C4232dA;
import p040o.C4249dG;
import p040o.C6930xffe1298e;
import p040o.C9883cz;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.blend;

public class SelectPurposeFragment extends BaseFragment implements C6930xffe1298e {
    private KtaJsonCheck.MediaDescriptionCompat IconCompatParcelizer;
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Spinner purposeSpinner;
    @BindView
    protected Button selectButton;
    @HmlPinActivity
    public C4249dG selectPurposePresenter;

    @OnClick
    public void onSelectClick() {
        C4249dG dGVar = this.selectPurposePresenter;
        C9883cz czVar = new C9883cz(dGVar);
        if (dGVar.RatingCompat != null) {
            czVar.IconCompatParcelizer(dGVar.RatingCompat);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.MediaDescriptionCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindChangeChannelStatementReviewFragment.MediaDescriptionCompat) getParentFragment();
        } else if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.MediaDescriptionCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindChangeChannelStatementReviewFragment.MediaDescriptionCompat) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.IconCompatParcelizer = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89842131494211, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.selectPurposePresenter.MediaBrowserCompat$ItemReceiver(this);
        C4249dG dGVar = this.selectPurposePresenter;
        C4232dA dAVar = C4232dA.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (dGVar.RatingCompat != null) {
            dAVar.IconCompatParcelizer(dGVar.RatingCompat);
        }
        if (dGVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            dGVar.RatingCompat.AlertController$RecycleListView();
        }
        dGVar.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        dGVar.IconCompatParcelizer.IconCompatParcelizer(new C4249dG.read(dGVar, (byte) 0));
        blend blend = new blend();
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.IconCompatParcelizer;
        if (mediaDescriptionCompat != null) {
            blend.read(mediaDescriptionCompat.read());
        }
        if (getActivity() != null) {
            blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "purpose_account_opening_screen");
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.selectPurposePresenter.onDestroy();
    }

    public final void write() {
        this.selectButton.setEnabled(false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.selectButton.setEnabled(true);
    }

    public final void write(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(str);
    }

    public final void write(List<String> list) {
        this.purposeSpinner.setAdapter(new ArrayAdapter(getContext(), R.layout.f84812131493708, list));
        this.purposeSpinner.setSelection(0);
        this.purposeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C4249dG dGVar = SelectPurposeFragment.this.selectPurposePresenter;
                if (i >= 0 && i < dGVar.write.size()) {
                    dGVar.MediaBrowserCompat$ItemReceiver = dGVar.write.get(i);
                }
            }
        });
    }
}
