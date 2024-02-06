package com.scb.phone.view.fragment.debitatm;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.debitatm.DebitTransactionAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.EasycashFeatureAccountService;
import p040o.IdCaptureModule_GetIIdDeserializerKtaFactory;
import p040o.addInput;
import p040o.getOperativeAccount;
import p040o.loanCalculation;
import p040o.postLoanInfo;
import p040o.postOperativeAccount;
import p040o.setBaselineAligned;
import p040o.setCores;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSimulator;
import p040o.validateGER;
import p040o.validateHERK;

public class DebitCardTransactionTabFragment extends BaseFragment implements IdCaptureModule_GetIIdDeserializerKtaFactory.read {
    public DebitTransactionAdapter IconCompatParcelizer;
    public IdCaptureModule_GetIIdDeserializerKtaFactory.write MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    @BindView
    RelativeLayout mEmptyCard;
    @BindView
    TextView mEmptyDescriptionDebit;
    @BindView
    ImageView mEmptyImageDebit;
    @BindView
    TextView mEmptyTitleDebit;
    @BindView
    RecyclerView mRecyclerViewDebit;
    @BindView
    TextView mTextMessageDebit;
    @BindView
    TextView mTextTxnDebit;
    @BindView
    public TextView mTextTxnMonthDebit;
    @BindView
    Toolbar mToolbarTxnDebit;

    public interface read {
        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo14174x50fd9e4a();
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static Fragment MediaMetadataCompat() {
        return new DebitCardTransactionTabFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86512131493878, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver.read((IdCaptureModule_GetIIdDeserializerKtaFactory.read) this);
        Drawable mutate = setLastBaselineToBottomHeight.write(getContext(), R.drawable.ic_filter_list_black_24dp).mutate();
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(mutate, setLastBaselineToBottomHeight.read(getContext(), R.color.f67252131099881));
        this.mToolbarTxnDebit.setOverflowIcon(mutate);
        Menu MediaBrowserCompat$CustomActionResultReceiver2 = this.mToolbarTxnDebit.MediaBrowserCompat$CustomActionResultReceiver();
        for (String add : this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()) {
            MediaBrowserCompat$CustomActionResultReceiver2.add(add);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver2.size(); i++) {
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2.getItem(i));
        }
        this.mToolbarTxnDebit.setOnMenuItemClickListener(new postOperativeAccount(this, arrayList));
        this.mTextTxnDebit.setText(getString(R.string.debit_transaction_label));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        validateGER validateger = new validateGER((Parcelable) null);
        loanCalculation loancalculation = loanCalculation.read;
        validateHERK validateherk = validateger.MediaDescriptionCompat;
        if (validateherk != null) {
            validateherk.RatingCompat = loancalculation;
        } else {
            validateger.MediaBrowserCompat$ItemReceiver = loancalculation;
        }
        postLoanInfo postloaninfo = new postLoanInfo(validateger);
        validateHERK validateherk2 = validateger.MediaDescriptionCompat;
        if (validateherk2 != null) {
            validateherk2.MediaMetadataCompat = postloaninfo;
        } else {
            validateger.MediaBrowserCompat$CustomActionResultReceiver = postloaninfo;
        }
        DebitTransactionAdapter debitTransactionAdapter = new DebitTransactionAdapter(getContext());
        this.IconCompatParcelizer = debitTransactionAdapter;
        RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) debitTransactionAdapter);
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        this.mRecyclerViewDebit.setLayoutManager(linearLayoutManager);
        this.mRecyclerViewDebit.setAdapter(MediaBrowserCompat$ItemReceiver);
        this.mRecyclerViewDebit.setItemAnimator(addinput);
        this.mRecyclerViewDebit.setHasFixedSize(false);
        this.mRecyclerViewDebit.setNestedScrollingEnabled(false);
        validateger.IconCompatParcelizer(this.mRecyclerViewDebit);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((read) getActivity()).mo14174x50fd9e4a();
    }

    private void IconCompatParcelizer(String str) {
        this.mTextMessageDebit.setText(str);
        this.mToolbarTxnDebit.setVisibility(0);
        this.mTextMessageDebit.setVisibility(0);
        this.mRecyclerViewDebit.setVisibility(8);
    }

    public final void IconCompatParcelizer() {
        this.mTextTxnMonthDebit.setText(getString(R.string.deposit_detail_filter_this_month));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        IconCompatParcelizer(getString(R.string.debit_atm_transaction));
        this.mToolbarTxnDebit.setVisibility(8);
    }

    public final void write() {
        IconCompatParcelizer(getString(R.string.debit_no_transaction));
    }

    public final void write(String str) {
        IconCompatParcelizer(str);
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$CustomActionResultReceiver.onDestroy();
    }

    public static /* synthetic */ void read(validateGER validateger, int i) {
        validateHERK validateherk;
        for (int i2 = 0; i2 < validateger.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(); i2++) {
            if (!(i2 == i || (validateherk = validateger.MediaDescriptionCompat) == null)) {
                boolean MediaBrowserCompat$ItemReceiver = validateherk.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
            }
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(validateGER validateger, int i) {
        validateHERK validateherk;
        for (int i2 = 0; i2 < validateger.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(); i2++) {
            if (!(i2 == i || (validateherk = validateger.MediaDescriptionCompat) == null)) {
                boolean MediaBrowserCompat$ItemReceiver = validateherk.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setCores setcores, boolean z) {
        if (z) {
            List<setSimulator> list = setcores.MediaBrowserCompat$CustomActionResultReceiver;
            validateGER validateger = new validateGER((Parcelable) null);
            EasycashFeatureAccountService easycashFeatureAccountService = EasycashFeatureAccountService.write;
            validateHERK validateherk = validateger.MediaDescriptionCompat;
            if (validateherk != null) {
                validateherk.RatingCompat = easycashFeatureAccountService;
            } else {
                validateger.MediaBrowserCompat$ItemReceiver = easycashFeatureAccountService;
            }
            getOperativeAccount getoperativeaccount = new getOperativeAccount(validateger);
            validateHERK validateherk2 = validateger.MediaDescriptionCompat;
            if (validateherk2 != null) {
                validateherk2.MediaMetadataCompat = getoperativeaccount;
            } else {
                validateger.MediaBrowserCompat$CustomActionResultReceiver = getoperativeaccount;
            }
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) this.IconCompatParcelizer);
            new addInput().MediaSessionCompat$ResultReceiverWrapper = false;
            this.mRecyclerViewDebit.setLayoutManager(linearLayoutManager);
            this.mRecyclerViewDebit.setAdapter(MediaBrowserCompat$ItemReceiver);
            this.mToolbarTxnDebit.setVisibility(0);
            this.mTextMessageDebit.setVisibility(8);
            this.mRecyclerViewDebit.setVisibility(0);
            validateger.IconCompatParcelizer(this.mRecyclerViewDebit);
            DebitTransactionAdapter debitTransactionAdapter = this.IconCompatParcelizer;
            debitTransactionAdapter.read.clear();
            if (list != null) {
                debitTransactionAdapter.read.addAll(list);
            }
            debitTransactionAdapter.IconCompatParcelizer.write();
            return;
        }
        DebitTransactionAdapter debitTransactionAdapter2 = this.IconCompatParcelizer;
        List<setSimulator> list2 = setcores.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            debitTransactionAdapter2.read.addAll(list2);
        }
        debitTransactionAdapter2.IconCompatParcelizer.write();
    }
}
