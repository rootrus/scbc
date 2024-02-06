package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.activity.transferandpay.CardlessATMActivity;
import com.scb.phone.view.activity.transferandpay.CardlessATMTermsConditionsActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMReviewActivity;
import com.scb.phone.view.adapter.transferandpay.DenominatorAmountAdapter;
import com.scb.phone.view.custom.ScbTextInputLayout;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import p040o.ActivityBuilder_QrPaymentActivity;
import p040o.ActivityBuilder_ScbsFormActivity;
import p040o.ActivityBuilder_SourceOfFundsActivity;
import p040o.C7495tB;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.getICheckDeserializerRtti;
import p040o.getImageStorage;
import p040o.getTopLeftCornerWidth$MediaSessionCompat$Token;
import p040o.inject_imageParamsStore;
import p040o.inject_stringIdGenerator;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.parseEvent;
import p040o.parseEventDevice;
import p040o.setImageStorage;
import p040o.setTapText;
import p040o.startActivityForResult_aroundBody1$advice;

public class CardlessWithdrawAmountFragment extends BaseFragment implements getTopLeftCornerWidth$MediaSessionCompat$Token, AccountSourceSelectFragment.write, ActivityBuilder_SourceOfFundsActivity {
    private CardlessATMActivity.IconCompatParcelizer IconCompatParcelizer = CardlessATMActivity.IconCompatParcelizer.DEPOSITS;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private DenominatorAmountAdapter MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public boolean MediaMetadataCompat = false;
    @BindView
    protected AmountEditText amountEditText;
    @BindView
    protected ScbTextInputLayout amountInputLayout;
    @HmlPinActivity
    public inject_stringIdGenerator cardlessWithdrawPresenter;
    @BindView
    protected TabLayout mAccountSourceTab;
    @BindView
    protected Button mButton;
    @BindView
    protected Button mButtonAddAccount;
    @BindView
    protected TextView mFootnoteTextView;
    @BindView
    protected RelativeLayout mLayoutError;
    @BindView
    protected LinearLayout mLayoutWithdrawAmount;
    @BindView
    protected RecyclerView mRecyclerView;
    @BindView
    protected TextView mRemainingLimit;
    @BindView
    protected TextView mTextEmptyState;
    @BindView
    protected FragmentWrapContentViewPager mViewPagerSourceOfFund;

    public static CardlessWithdrawAmountFragment read(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.EXTRA_CARDLESS_ATM_HAS_SPEEDY_CASH", true);
        bundle.putString("source", str);
        CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment = new CardlessWithdrawAmountFragment();
        cardlessWithdrawAmountFragment.setArguments(bundle);
        return cardlessWithdrawAmountFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86012131493828, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        String AbsActionBarView = AbsActionBarView();
        this.MediaBrowserCompat$SearchResultReceiver = AbsActionBarView;
        boolean z = true;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", AbsActionBarView)};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("cardless_atm_input", zsyr2kArr);
        }
        if (getActivity() != null && getActivity().getIntent().hasExtra("CARDLESS_DEFAULT_TAB")) {
            if (CardlessATMActivity.IconCompatParcelizer.CARDS.name().equalsIgnoreCase(getActivity().getIntent().getStringExtra("CARDLESS_DEFAULT_TAB"))) {
                this.IconCompatParcelizer = CardlessATMActivity.IconCompatParcelizer.CARDS;
            } else {
                this.IconCompatParcelizer = CardlessATMActivity.IconCompatParcelizer.DEPOSITS;
            }
        }
        if (getArguments() != null) {
            this.MediaMetadataCompat = getArguments().getBoolean("com.scb.phone.EXTRA_CARDLESS_ATM_HAS_SPEEDY_CASH", false);
        }
        this.cardlessWithdrawPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.cardlessWithdrawPresenter.write = this.MediaMetadataCompat;
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        if (inject_stringidgenerator.RatingCompat == null) {
            z = false;
        }
        if (z) {
            inject_stringidgenerator.RatingCompat.AlertController$RecycleListView();
        }
        inject_stringidgenerator.IconCompatParcelizer.IconCompatParcelizer();
        inject_stringidgenerator.IconCompatParcelizer.IconCompatParcelizer(new inject_stringIdGenerator.IconCompatParcelizer(inject_stringidgenerator, (byte) 0));
        return inflate;
    }

    public final void aP_() {
        this.mButton.setEnabled(false);
        MediaBrowserCompat$SearchResultReceiver();
        if (this.IconCompatParcelizer == CardlessATMActivity.IconCompatParcelizer.CARDS) {
            this.mViewPagerSourceOfFund.setCurrentItem(1);
        } else {
            this.mViewPagerSourceOfFund.setCurrentItem(0);
        }
        AlertController$RecycleListView();
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        this.mViewPagerSourceOfFund.setAdapter(new CardlessWithdrawAmountFragment$MediaBrowserCompat$ItemReceiver(this, getChildFragmentManager()));
        this.mViewPagerSourceOfFund.setOffscreenPageLimit(2);
        this.mAccountSourceTab.setupWithViewPager(this.mViewPagerSourceOfFund);
        this.mAccountSourceTab.addOnTabSelectedListener(new TabLayout$MediaBrowserCompat$ItemReceiver() {
            public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
                boolean z = false;
                if (iconCompatParcelizer.read == 0) {
                    inject_stringIdGenerator inject_stringidgenerator = CardlessWithdrawAmountFragment.this.cardlessWithdrawPresenter;
                    inject_stringidgenerator.read = true;
                    CrashlyticsReport.FilesPayload.File.Builder builder = inject_stringidgenerator.MediaSessionCompat$Token;
                    if (builder != null) {
                        inject_stringidgenerator.MediaSessionCompat$Token = builder;
                        if (inject_stringidgenerator.read) {
                            getImageStorage getimagestorage = new getImageStorage(inject_stringidgenerator);
                            if (inject_stringidgenerator.RatingCompat != null) {
                                z = true;
                            }
                            if (z) {
                                getimagestorage.IconCompatParcelizer(inject_stringidgenerator.RatingCompat);
                            }
                        }
                    }
                    inject_stringidgenerator.MediaBrowserCompat$ItemReceiver();
                } else if (iconCompatParcelizer.read == 1) {
                    inject_stringIdGenerator inject_stringidgenerator2 = CardlessWithdrawAmountFragment.this.cardlessWithdrawPresenter;
                    inject_stringidgenerator2.read = false;
                    chain chain = inject_stringidgenerator2.MediaSessionCompat$QueueItem;
                    if (chain != null) {
                        inject_stringidgenerator2.MediaSessionCompat$QueueItem = chain;
                        if (!inject_stringidgenerator2.read) {
                            inject_stringidgenerator2.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    }
                    inject_stringidgenerator2.write();
                }
            }
        });
        this.mViewPagerSourceOfFund.setDisableSwiping(true);
    }

    public final void read(final parseEventDevice parseeventdevice) {
        if (parseeventdevice != null) {
            this.mLayoutWithdrawAmount.setVisibility(0);
            this.mButton.setVisibility(0);
            this.mButtonAddAccount.setVisibility(8);
            this.mTextEmptyState.setVisibility(8);
            this.mLayoutError.setVisibility(8);
            getContext();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            ArrayList arrayList = new ArrayList();
            Collection collection = parseeventdevice.write;
            if (!(collection == null || collection.isEmpty())) {
                arrayList.addAll(parseeventdevice.write);
            }
            DenominatorAmountAdapter denominatorAmountAdapter = new DenominatorAmountAdapter(parseeventdevice.MediaBrowserCompat$CustomActionResultReceiver, arrayList, this.cardlessWithdrawPresenter.IconCompatParcelizer());
            this.MediaBrowserCompat$MediaItem = denominatorAmountAdapter;
            C61965 r0 = new DenominatorAmountAdapter.write() {
                public final void read() {
                    CardlessWithdrawAmountFragment.this.amountEditText.post(new ActivityBuilder_ScbsFormActivity(this));
                }

                public final /* synthetic */ void write() {
                    CardlessWithdrawAmountFragment.this.amountEditText.requestFocus();
                    CardlessWithdrawAmountFragment.this.amountEditText.onKeyUp(23, new KeyEvent(1, 23));
                }

                public final void IconCompatParcelizer(double d) {
                    CardlessWithdrawAmountFragment.this.amountEditText.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d));
                    CardlessWithdrawAmountFragment.this.IconCompatParcelizer(parseeventdevice.MediaBrowserCompat$SearchResultReceiver, parseeventdevice.MediaBrowserCompat$ItemReceiver);
                }
            };
            onGetStartedClick.write((Object) r0, "onClickListener");
            denominatorAmountAdapter.MediaBrowserCompat$MediaItem = r0;
            this.mFootnoteTextView.setText(parseeventdevice.read);
            this.MediaBrowserCompat$CustomActionResultReceiver = parseeventdevice.read;
            this.mRecyclerView.setAdapter(this.MediaBrowserCompat$MediaItem);
            this.mRemainingLimit.setText(parseeventdevice.IconCompatParcelizer);
            double d = parseeventdevice.MediaBrowserCompat$SearchResultReceiver;
            double d2 = parseeventdevice.MediaBrowserCompat$ItemReceiver;
            this.amountEditText.setOnAmountChangeListener((AmountEditText.read) null);
            this.amountEditText.setText("");
            this.amountEditText.setCustomHint(String.format("%s - %s", new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d), getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d2)}));
            final double d3 = d;
            final double d4 = d2;
            this.amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
                public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                    CardlessWithdrawAmountFragment.this.IconCompatParcelizer(d3, d4);
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    onCheckBoxClick.read("onDonePress", new Object[0]);
                    CardlessWithdrawAmountFragment.this.PlaybackStateCompat$CustomAction();
                }
            });
            this.amountEditText.setHandleDismissKeyboard(new ActivityBuilder_QrPaymentActivity(this, d3, d4));
            this.amountInputLayout.setError("");
            this.amountInputLayout.setErrorEnabled(false);
            this.mButton.setEnabled(false);
        }
    }

    public final void IconCompatParcelizer(double d, double d2) {
        double d3 = this.amountEditText.write;
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(d3);
        this.mButton.setEnabled(MediaBrowserCompat$ItemReceiver(d3, d, d2));
    }

    private boolean MediaBrowserCompat$ItemReceiver(double d, double d2, double d3) {
        if (d < d2 || d > d3) {
            this.amountInputLayout.setErrorEnabled(true);
            this.amountInputLayout.setError(getString(R.string.cardless_invalid_amount));
            return false;
        } else if (d % 100.0d != 0.0d) {
            this.amountInputLayout.setErrorEnabled(true);
            this.amountInputLayout.setError(getString(R.string.cardless_invalid_divisible));
            return false;
        } else if (d > this.cardlessWithdrawPresenter.IconCompatParcelizer()) {
            this.amountInputLayout.setErrorEnabled(true);
            this.amountInputLayout.setError(getString(R.string.cardless_invalid_insufficient_balance));
            return false;
        } else {
            this.amountInputLayout.setError("");
            this.amountInputLayout.setErrorEnabled(false);
            return true;
        }
    }

    public final void write(parseEvent parseevent) {
        CardlessATMReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), parseevent, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent read = CardlessATMTermsConditionsActivity.read(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 45788);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        MediaMetadataCompat();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaMetadataCompat();
    }

    /* access modifiers changed from: protected */
    @OnClick
    public void onReviewButtonClicked() {
        double d = this.amountEditText.write;
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        setImageStorage setimagestorage = new setImageStorage(inject_stringidgenerator, d);
        if (inject_stringidgenerator.RatingCompat != null) {
            setimagestorage.IconCompatParcelizer(inject_stringidgenerator.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onAddAccountButtonClicked() {
        AddAccountConsentActivity.IconCompatParcelizer(getContext());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        int i;
        if (builder != null) {
            inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
            boolean z = true;
            if (builder != null) {
                inject_stringidgenerator.MediaSessionCompat$Token = builder;
                if (inject_stringidgenerator.read) {
                    getImageStorage getimagestorage = new getImageStorage(inject_stringidgenerator);
                    if (inject_stringidgenerator.RatingCompat != null) {
                        getimagestorage.IconCompatParcelizer(inject_stringidgenerator.RatingCompat);
                    }
                }
            }
            if (this.MediaBrowserCompat$MediaItem != null) {
                TabLayout.IconCompatParcelizer iconCompatParcelizer = this.mAccountSourceTab.MediaBrowserCompat$CustomActionResultReceiver;
                if (iconCompatParcelizer != null) {
                    i = iconCompatParcelizer.read;
                } else {
                    i = -1;
                }
                if (i == 0) {
                    inject_stringIdGenerator inject_stringidgenerator2 = this.cardlessWithdrawPresenter;
                    if (builder == null) {
                        return;
                    }
                    if (!inject_stringidgenerator2.write || builder.MediaDescriptionCompat == null) {
                        startActivityForResult_aroundBody1$advice startactivityforresult_aroundbody1_advice = new startActivityForResult_aroundBody1$advice(builder);
                        if (inject_stringidgenerator2.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            startactivityforresult_aroundbody1_advice.IconCompatParcelizer(inject_stringidgenerator2.RatingCompat);
                            return;
                        }
                        return;
                    }
                    C7495tB tBVar = new C7495tB(builder);
                    if (inject_stringidgenerator2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        tBVar.IconCompatParcelizer(inject_stringidgenerator2.RatingCompat);
                    }
                }
            }
        }
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        inject_stringidgenerator.MediaBrowserCompat$SearchResultReceiver = Boolean.valueOf(z);
        inject_stringidgenerator.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        inject_stringidgenerator.MediaMetadataCompat = Boolean.TRUE;
        if (inject_stringidgenerator.read) {
            inject_imageParamsStore inject_imageparamsstore = inject_imageParamsStore.write;
            if (inject_stringidgenerator.RatingCompat != null) {
                inject_imageparamsstore.IconCompatParcelizer(inject_stringidgenerator.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(chain chain) {
        int i;
        onCheckBoxClick.read("onCreditCardSelected", new Object[0]);
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        if (chain != null) {
            inject_stringidgenerator.MediaSessionCompat$QueueItem = chain;
            if (!inject_stringidgenerator.read) {
                inject_stringidgenerator.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
        if (this.MediaBrowserCompat$MediaItem != null) {
            TabLayout.IconCompatParcelizer iconCompatParcelizer = this.mAccountSourceTab.MediaBrowserCompat$CustomActionResultReceiver;
            if (iconCompatParcelizer != null) {
                i = iconCompatParcelizer.read;
            } else {
                i = -1;
            }
            if (i == 1) {
                DenominatorAmountAdapter denominatorAmountAdapter = this.MediaBrowserCompat$MediaItem;
                denominatorAmountAdapter.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(chain.MediaBrowserCompat$CustomActionResultReceiver).doubleValue();
                denominatorAmountAdapter.IconCompatParcelizer.write();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        inject_stringidgenerator.MediaBrowserCompat$MediaItem = Boolean.valueOf(z);
        inject_stringidgenerator.write();
    }

    public final void write() {
        inject_stringIdGenerator inject_stringidgenerator = this.cardlessWithdrawPresenter;
        inject_stringidgenerator.MediaDescriptionCompat = Boolean.TRUE;
        if (!inject_stringidgenerator.read) {
            inject_imageParamsStore inject_imageparamsstore = inject_imageParamsStore.write;
            if (inject_stringidgenerator.RatingCompat != null) {
                inject_imageparamsstore.IconCompatParcelizer(inject_stringidgenerator.RatingCompat);
            }
        }
    }

    public final void read() {
        this.mLayoutWithdrawAmount.setVisibility(8);
        this.mTextEmptyState.setVisibility(8);
        this.mButton.setVisibility(8);
        this.mButtonAddAccount.setVisibility(8);
        this.mLayoutError.setVisibility(0);
        aj_();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TabLayout.IconCompatParcelizer IconCompatParcelizer2 = this.mAccountSourceTab.IconCompatParcelizer(1);
        if (IconCompatParcelizer2 != null) {
            IconCompatParcelizer2.IconCompatParcelizer = LayoutInflater.from(IconCompatParcelizer2.MediaDescriptionCompat.getContext()).inflate(R.layout.f84972131493724, IconCompatParcelizer2.MediaDescriptionCompat, false);
            TabLayout.TabView tabView = IconCompatParcelizer2.MediaDescriptionCompat;
            if (tabView != null) {
                tabView.MediaBrowserCompat$ItemReceiver();
            }
            View view = IconCompatParcelizer2.IconCompatParcelizer;
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
                textView.setText(IconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver);
                ((TextView) view.findViewById(R.id.tv_tab_badge)).setText(R.string.cardless_new_badge);
                textView.setTextColor(this.mAccountSourceTab.AlertController$RecycleListView);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Double d) {
        DenominatorAmountAdapter denominatorAmountAdapter = this.MediaBrowserCompat$MediaItem;
        denominatorAmountAdapter.MediaBrowserCompat$ItemReceiver = d.doubleValue();
        denominatorAmountAdapter.IconCompatParcelizer.write();
    }

    private void MediaMetadataCompat() {
        this.mLayoutWithdrawAmount.setVisibility(8);
        this.mButton.setVisibility(8);
        this.mLayoutError.setVisibility(8);
        this.mTextEmptyState.setVisibility(0);
        this.mButtonAddAccount.setVisibility(0);
        aj_();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 45788) {
            return;
        }
        if (i2 == 0) {
            getActivity().finish();
        } else if (i2 == -1) {
            this.mButton.setEnabled(false);
            MediaBrowserCompat$SearchResultReceiver();
            if (this.IconCompatParcelizer == CardlessATMActivity.IconCompatParcelizer.CARDS) {
                this.mViewPagerSourceOfFund.setCurrentItem(1);
            } else {
                this.mViewPagerSourceOfFund.setCurrentItem(0);
            }
            AlertController$RecycleListView();
        }
    }

    public void onDestroy() {
        this.cardlessWithdrawPresenter.onDestroy();
        super.onDestroy();
    }
}
