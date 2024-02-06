package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.quicktopup.HowToAddFavouriteTopUpActivity;
import com.scb.phone.view.activity.prelogin.quicktopup.SetupQuickTopUpReviewActivity;
import com.scb.phone.view.adapter.transferandpay.FavouriteTargetAdapter;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_ContributeHmlNTBWorkAddressActivity;
import p040o.ActivityBuilder_ContributeHmlNdidSelectIdpActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlETBLandingActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getDocumentSkew;
import p040o.getEasycashIntroductions;
import p040o.getICheckDeserializerRtti;
import p040o.parseEventLog;
import p040o.setOnMyLocationChangeListener;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class QuickTopUpFragment extends BaseFragment implements getDocumentSkew.write, FragmentBuilder_BindCcSofBillPaymentOnlyFragment, AccountSourceSelectFragment.write {
    protected double IconCompatParcelizer;
    protected String MediaBrowserCompat$CustomActionResultReceiver;
    protected getEasycashIntroductions MediaBrowserCompat$MediaItem;
    protected setOnMyLocationChangeListener MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private AccountSourceSelectFragment f3096x50fd9e4a;
    private Double MediaDescriptionCompat = Double.valueOf(-1.0d);
    protected int MediaMetadataCompat = 0;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
    protected FavouriteTargetAdapter RatingCompat;
    @BindView
    protected ViewGroup mAmountProgress;
    @BindView
    protected RecyclerView mAmountRecyclerView;
    @BindView
    protected TextInputLayout mAmountTextInputLayout;
    @BindView
    protected AmountEditText mAmountValueEditText;
    @BindView
    protected RecyclerView mFavouriteRecyclerView;
    @BindView
    protected ScrollView mFavouritesScrollView;
    @BindView
    protected LinearLayout mNoFavouritesLinearLayout;
    @BindView
    protected TextView mReferenceLabelTextView;
    @BindView
    protected TextView mReferenceTextView;
    @BindView
    protected TextView mRemainingLimitTextView;
    @BindView
    protected DefaultButton mReviewSetupButton;

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = setOnMyLocationChangeListener.read(getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_QUICK_TOP_UP_STATUS"));
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaSessionCompat$Token;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaSessionCompat$Token.dispose();
        }
        super.onDestroy();
    }

    public void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
    }

    public final void IconCompatParcelizer() {
        this.mAmountProgress.setVisibility(0);
        this.mAmountRecyclerView.setVisibility(8);
        this.mAmountTextInputLayout.setVisibility(8);
        this.mAmountValueEditText.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mNoFavouritesLinearLayout.setVisibility(0);
    }

    public void read(List<CrashlyticsReport.Session.Builder> list) {
        getContext();
        this.mFavouriteRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        FavouriteTargetAdapter favouriteTargetAdapter = new FavouriteTargetAdapter(getContext(), list, this, (byte) 0);
        this.RatingCompat = favouriteTargetAdapter;
        this.mFavouriteRecyclerView.setAdapter(favouriteTargetAdapter);
    }

    public final void read(String str) {
        this.mRemainingLimitTextView.setText(str);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(parseEventLog parseeventlog) {
        this.mAmountProgress.setVisibility(8);
        this.mAmountTextInputLayout.setVisibility(0);
        this.mAmountValueEditText.setVisibility(0);
        this.mAmountTextInputLayout.setHint(parseeventlog.IconCompatParcelizer);
        AmountEditText amountEditText = this.mAmountValueEditText;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.mAmountTextInputLayout, parseeventlog.MediaBrowserCompat$ItemReceiver.doubleValue(), parseeventlog.read.doubleValue(), getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.invalid_amount_transfer_input)));
    }

    public void MediaBrowserCompat$ItemReceiver(List<Integer> list) {
        this.mAmountProgress.setVisibility(8);
        this.mAmountRecyclerView.setVisibility(0);
        getContext();
        this.mAmountRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        getEasycashIntroductions geteasycashintroductions = new getEasycashIntroductions(list, this.MediaDescriptionCompat);
        this.MediaBrowserCompat$MediaItem = geteasycashintroductions;
        this.mAmountRecyclerView.setAdapter(geteasycashintroductions);
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str != null) {
            this.MediaBrowserCompat$MediaItem.write(str);
        }
    }

    public final void read(String str, String str2, String str3) {
        this.mReferenceTextView.setText(str2);
        this.mReferenceLabelTextView.setText(str);
        this.mFavouritesScrollView.setVisibility(0);
        this.f3096x50fd9e4a.read(str3);
    }

    /* access modifiers changed from: protected */
    @OnClick
    public void onHowToClick() {
        Intent intent = new Intent(getContext(), HowToAddFavouriteTopUpActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void read(int i) {
        getEasycashIntroductions geteasycashintroductions = this.MediaBrowserCompat$MediaItem;
        if (geteasycashintroductions != null && geteasycashintroductions.MediaBrowserCompat$ItemReceiver().doubleValue() > 0.0d) {
            this.MediaSessionCompat$ResultReceiverWrapper = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver());
        }
        this.mReviewSetupButton.setEnabled(false);
        FavouriteTargetAdapter favouriteTargetAdapter = this.RatingCompat;
        favouriteTargetAdapter.MediaBrowserCompat$ItemReceiver = i;
        favouriteTargetAdapter.IconCompatParcelizer.write();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.MediaSessionCompat$Token = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_ContributeHmlNdidSelectIdpActivity(this), ActivityBuilder_ContributeHmlNTBWorkAddressActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r2.MediaBrowserCompat$CustomActionResultReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write() {
        /*
            r2 = this;
            com.scb.phone.view.custom.common.DefaultButton r0 = r2.mReviewSetupButton
            boolean r1 = r2.MediaMetadataCompat()
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r0.setButtonEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.prelogin.quicktopup.QuickTopUpFragment.write():void");
    }

    /* access modifiers changed from: protected */
    public final boolean MediaMetadataCompat() {
        if (this.mAmountRecyclerView.getVisibility() == 0) {
            getEasycashIntroductions geteasycashintroductions = this.MediaBrowserCompat$MediaItem;
            if (geteasycashintroductions == null || geteasycashintroductions.write() < 0) {
                return false;
            }
            return true;
        } else if (this.mAmountValueEditText.getVisibility() != 0) {
            return false;
        } else {
            if (this.mAmountValueEditText.getText() == null || this.mAmountValueEditText.getText().toString().isEmpty()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void RatingCompat() {
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TOP_UP_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaBrowserCompat$ItemReceiver = true;
        write.MediaDescriptionCompat = false;
        this.f3096x50fd9e4a = AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0));
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, this.f3096x50fd9e4a).write();
    }

    public void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z) {
        setuuidfromutf8bytes.setPadding = false;
        setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, z));
        MediaBrowserCompat$ItemReceiver.ListMenuItemView = this.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.setGroupDividerEnabled = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb);
        MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView = this.mReferenceTextView.getText().toString();
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        Intent intent = new Intent(getActivity(), SetupQuickTopUpReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aj_();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaSessionCompat$Token;
            Double d = builder.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaDescriptionCompat = d;
            getEasycashIntroductions geteasycashintroductions = this.MediaBrowserCompat$MediaItem;
            if (geteasycashintroductions != null) {
                geteasycashintroductions.IconCompatParcelizer(d, false);
            }
        }
    }
}
