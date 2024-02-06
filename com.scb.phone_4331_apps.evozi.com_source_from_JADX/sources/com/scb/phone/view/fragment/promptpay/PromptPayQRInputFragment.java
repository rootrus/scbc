package com.scb.phone.view.fragment.promptpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.promptpay.PromptPayQRActivity;
import com.scb.phone.view.adapter.promptpay.PromptPayMobileListAdapter;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C3077xfe724d07;
import p040o.C4879jt;
import p040o.C9924f;
import p040o.HmlPinActivity;
import p040o.ImmutableMultiset;
import p040o.getBottomEdgeTearHeight;
import p040o.getOverflowCount;
import p040o.removeIfFromRandomAccessList;

public class PromptPayQRInputFragment extends BaseFragment implements getBottomEdgeTearHeight.IconCompatParcelizer, PromptPayMobileListAdapter.write {
    /* access modifiers changed from: private */
    public double IconCompatParcelizer = 0.0d;
    private PromptPayMobileListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    @BindView
    DefaultButton createQRCodeButton;
    @BindView
    AmountEditText editAmount;
    @BindView
    RecyclerView mobileListRecyclerView;
    @HmlPinActivity
    public C4879jt promptPayQRInputPresenter;

    public static PromptPayQRInputFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new PromptPayQRInputFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89072131494134, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.promptPayQRInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4879jt jtVar = this.promptPayQRInputPresenter;
        if (!jtVar.write) {
            boolean z = true;
            jtVar.write = true;
            C9924f.C4396a aVar = C9924f.C4396a.MediaBrowserCompat$CustomActionResultReceiver;
            if (jtVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                aVar.IconCompatParcelizer(jtVar.RatingCompat);
            }
            jtVar.IconCompatParcelizer.IconCompatParcelizer();
            jtVar.IconCompatParcelizer.IconCompatParcelizer(new C4879jt.IconCompatParcelizer(jtVar, (byte) 0));
        }
        this.createQRCodeButton.setButtonEnabled(false);
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                PromptPayQRInputFragment.this.IconCompatParcelizer = d;
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                PromptPayQRInputFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.editAmount.setMaximumDecimalDigit(9);
        return inflate;
    }

    public final void write() {
        if (getActivity() != null) {
            ((PromptPayQRActivity) getActivity()).MediaSessionCompat$QueueItem();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getOverflowCount getoverflowcount, boolean z) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$SearchResultReceiver = getoverflowcount.MediaDescriptionCompat;
            this.MediaBrowserCompat$MediaItem = getoverflowcount.MediaMetadataCompat;
            if (!z) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.write();
            }
            if (!this.createQRCodeButton.isEnabled()) {
                this.createQRCodeButton.setButtonEnabled(true);
            }
        }
    }

    @OnClick
    public void createQRCodeButton() {
        this.createQRCodeButton.setButtonEnabled(false);
        C4879jt jtVar = this.promptPayQRInputPresenter;
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        String str2 = this.MediaBrowserCompat$MediaItem;
        Double valueOf = Double.valueOf(this.IconCompatParcelizer);
        if (jtVar.RatingCompat != null) {
            jtVar.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableMultiset.FieldSettersHolder IconCompatParcelizer2 = ImmutableMultiset.FieldSettersHolder.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = str;
        IconCompatParcelizer2.read = str2;
        IconCompatParcelizer2.write = removeIfFromRandomAccessList.read(valueOf.doubleValue());
        jtVar.IconCompatParcelizer.write(IconCompatParcelizer2);
        jtVar.IconCompatParcelizer.IconCompatParcelizer(new C4879jt.read(jtVar, (byte) 0));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.createQRCodeButton.setButtonEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C3077xfe724d07.Builder builder) {
        if (builder != null) {
            if (builder.MediaBrowserCompat$ItemReceiver != null) {
                this.editAmount.setFormattedAmount(builder.MediaBrowserCompat$ItemReceiver.read);
            }
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            PromptPayMobileListAdapter promptPayMobileListAdapter = new PromptPayMobileListAdapter(builder.read);
            this.MediaBrowserCompat$CustomActionResultReceiver = promptPayMobileListAdapter;
            promptPayMobileListAdapter.write = this;
            this.mobileListRecyclerView.setLayoutManager(linearLayoutManager);
            this.mobileListRecyclerView.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).aj_();
            }
        }
    }
}
