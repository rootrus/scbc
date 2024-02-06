package com.scb.phone.view.fragment.merchant;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AlertController$RecycleListView;
import p040o.ICheckExtractorListener;
import p040o.addInput;
import p040o.doWriteToLog;
import p040o.getCustomerContact;
import p040o.validateGER;
import p040o.validateGER$MediaBrowserCompat$ItemReceiver;
import p040o.validateHERK;

public abstract class BaseMerchantWalletItemTransactionFragment extends BaseFragment implements ICheckExtractorListener.write, validateGER.write, validateGER$MediaBrowserCompat$ItemReceiver {
    protected validateGER IconCompatParcelizer;
    protected Handler MediaBrowserCompat$CustomActionResultReceiver;
    private RecyclerView.IconCompatParcelizer MediaDescriptionCompat;
    protected ICheckExtractorListener.read RatingCompat;
    @BindView
    protected RelativeLayout mEmptyCard;
    @BindView
    protected TextView mEmptyDescription;
    @BindView
    protected ImageView mEmptyImage;
    @BindView
    protected TextView mEmptyTitle;
    @BindView
    protected RecyclerView mRecyclerView;
    @BindView
    protected TextView mTextMessage;

    public abstract getCustomerContact MediaBrowserCompat$MediaItem();

    public abstract void write(String str, String str2, String str3);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaBrowserCompat$CustomActionResultReceiver = new Handler();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88362131494063, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        validateGER validateger = new validateGER(bundle != null ? bundle.getParcelable("RecyclerViewExpandableItemManager") : null);
        this.IconCompatParcelizer = validateger;
        validateHERK validateherk = validateger.MediaDescriptionCompat;
        if (validateherk != null) {
            validateherk.MediaMetadataCompat = this;
        } else {
            validateger.MediaBrowserCompat$CustomActionResultReceiver = this;
        }
        validateGER validateger2 = this.IconCompatParcelizer;
        validateHERK validateherk2 = validateger2.MediaDescriptionCompat;
        if (validateherk2 != null) {
            validateherk2.RatingCompat = this;
        } else {
            validateger2.MediaBrowserCompat$ItemReceiver = this;
        }
        this.MediaDescriptionCompat = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) MediaBrowserCompat$MediaItem());
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.MediaDescriptionCompat);
        this.mRecyclerView.setItemAnimator(addinput);
        this.mRecyclerView.setHasFixedSize(false);
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.IconCompatParcelizer.IconCompatParcelizer(this.mRecyclerView);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.mTextMessage.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyCard.setVisibility(8);
        if (arguments != null) {
            doWriteToLog dowritetolog = (doWriteToLog) arguments.getParcelable("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_WALLET_DETAIL");
            if (dowritetolog != null) {
                str = dowritetolog.MediaBrowserCompat$SearchResultReceiver;
            } else {
                str = "";
            }
            write(str, arguments.getString("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_START_DATE"), arguments.getString("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_END_DATE"));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        validateGER validateger = this.IconCompatParcelizer;
        if (validateger != null) {
            bundle.putParcelable("RecyclerViewExpandableItemManager", validateger.read());
        }
    }

    public void onDestroyView() {
        validateGER validateger = this.IconCompatParcelizer;
        if (validateger != null) {
            validateger.write();
            this.IconCompatParcelizer = null;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.mRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.mRecyclerView = null;
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaDescriptionCompat;
        if (iconCompatParcelizer != null) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
            this.MediaDescriptionCompat = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        super.onDestroyView();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ICheckExtractorListener.read) {
            this.RatingCompat = (ICheckExtractorListener.read) parentFragment;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mTextMessage.setVisibility(8);
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
        this.mEmptyTitle.setGravity(3);
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
        this.mEmptyCard.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
    }

    public final void IconCompatParcelizer() {
        this.mTextMessage.setVisibility(0);
        this.mEmptyCard.setVisibility(8);
    }
}
