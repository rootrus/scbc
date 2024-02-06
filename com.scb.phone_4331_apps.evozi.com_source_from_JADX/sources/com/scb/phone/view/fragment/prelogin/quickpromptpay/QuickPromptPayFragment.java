package com.scb.phone.view.fragment.prelogin.quickpromptpay;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.ModifyQuickPromptPayActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.QuickPromptPayReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToPromptPayStep1Fragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.eac.EACTags;
import p040o.ActivityBuilder_ContributeHmlNTBReviewDocumentActivity;
import p040o.ActivityBuilder_ContributeHmlNTBSummaryActivity;
import p040o.ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity;
import p040o.C4438fs;
import p040o.C4442fy;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HistoryAdapter$GroupFooterViewHolder_ViewBinding;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.Interner;
import p040o.MyECouponActivity_ViewBinding;
import p040o.animateCameraWithCallback;
import p040o.eventFromJson;
import p040o.fy$MediaBrowserCompat$ItemReceiver;
import p040o.getCompressedFrontImageSize;
import p040o.getCores;
import p040o.getICheckDeserializerRtti;
import p040o.getKernelIDSrcIn;
import p040o.getOversizeImage;
import p040o.getShortName;
import p040o.immediateCheckedFuture;
import p040o.isSupportFragmentClass;
import p040o.removeIfFromRandomAccessList;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.show;

public class QuickPromptPayFragment extends TransferToPromptPayStep1Fragment implements getCompressedFrontImageSize.write {
    private double IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private getKernelIDSrcIn MediaBrowserCompat$MediaItem;
    private eventFromJson MediaBrowserCompat$SearchResultReceiver;
    private Drawable RatingCompat;
    @BindView
    DefaultButton buttonReview;
    @BindView
    TextView mAccountName;
    @BindView
    TextView mAmountValue;
    @BindView
    AmountEditText mEditAmount;
    @BindView
    ImageView mImageIcon;
    @HmlPinActivity
    public C4442fy quickPromptPayPresenter;
    @BindView
    TextView remainingLimit;
    @BindView
    TextView remainingLimitError;
    @BindView
    LinearLayout remainingLimitLinearLayout;
    @BindView
    TextView textRemainingLimit;

    public static QuickPromptPayFragment MediaBrowserCompat$MediaItem(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("source", str);
        QuickPromptPayFragment quickPromptPayFragment = new QuickPromptPayFragment();
        quickPromptPayFragment.setArguments(bundle);
        return quickPromptPayFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        isSupportFragmentClass issupportfragmentclass;
        immediateCheckedFuture immediatecheckedfuture;
        View inflate = layoutInflater.inflate(R.layout.f89232131494150, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.quickPromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = new getKernelIDSrcIn();
        String AbsActionBarView = AbsActionBarView();
        this.MediaBrowserCompat$CustomActionResultReceiver = AbsActionBarView;
        this.MediaBrowserCompat$MediaItem.read(AbsActionBarView);
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver("promptpay");
        getKernelIDSrcIn getkernelidsrcin = this.MediaBrowserCompat$MediaItem;
        if (getActivity() != null) {
            getkernelidsrcin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "transfer_input");
        }
        this.RatingCompat = setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_place_holder);
        C4442fy fyVar = this.quickPromptPayPresenter;
        boolean z = true;
        if (fyVar.RatingCompat != null) {
            fyVar.RatingCompat.Keep();
        }
        fyVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver("TRANSFER", "PROMPTPAY");
        fyVar.IconCompatParcelizer.IconCompatParcelizer(new fy$MediaBrowserCompat$ItemReceiver(fyVar, (byte) 0));
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            C4442fy fyVar2 = this.quickPromptPayPresenter;
            getCores getcores = (getCores) getActivity().getIntent().getParcelableExtra("com.scb.phone.EXTRA_QUICK_PROMPT_PAY_DISPLAY");
            C4438fs fsVar = new C4438fs(getcores);
            if (fyVar2.RatingCompat != null) {
                fsVar.IconCompatParcelizer(fyVar2.RatingCompat);
            }
            if (!(getcores == null || getcores.MediaBrowserCompat$ItemReceiver() == null)) {
                show show = new show(getcores.MediaBrowserCompat$ItemReceiver());
                if (show.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                if (issupportfragmentclass.IconCompatParcelizer == null) {
                    z = false;
                }
                if (z) {
                    T t = issupportfragmentclass.IconCompatParcelizer;
                    if (t != null) {
                        immediatecheckedfuture = (immediateCheckedFuture) t;
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                } else {
                    immediatecheckedfuture = null;
                }
                fyVar2.MediaBrowserCompat$ItemReceiver = immediatecheckedfuture;
            }
        }
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.prompt_pay));
        Context context = getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, this.RatingCompat, this.mImageIcon, getICheckDeserializerRtti.write(context, (int) R.drawable.bankicon_scb).toString(), context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
        this.textRemainingLimit.setText(R.string.quick_prompt_pay_remaining_limit);
        this.mEditAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                QuickPromptPayFragment.write(QuickPromptPayFragment.this, d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                QuickPromptPayFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.buttonReview.setButtonEnabled(false);
        this.mCustomProxyNumber.setProxyLabel(getString(R.string.transfer_prompt_pay_input_text));
        this.mCustomProxyNumber.setProxyHint(getString(R.string.transfer_prompt_pay_input_hint));
        this.mCustomProxyNumber.setOnProxyNumberListener(this);
        ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity.IconCompatParcelizer(this);
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.prompt_pay));
    }

    public final void ay_() {
        super.ay_();
        this.remainingLimitLinearLayout.setVisibility(0);
    }

    public final void read(String str) {
        this.remainingLimitError.setVisibility(8);
        this.textRemainingLimit.setVisibility(0);
        this.remainingLimit.setVisibility(0);
        this.remainingLimit.setText(str);
    }

    public final void write() {
        this.textRemainingLimit.setVisibility(8);
        this.remainingLimit.setVisibility(8);
        this.remainingLimitError.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver(getCores getcores) {
        if (getcores != null) {
            this.mAccountName.setText(getcores.MediaBrowserCompat$CustomActionResultReceiver);
            this.mAmountValue.setText(getcores.IconCompatParcelizer());
        }
    }

    public void onDestroy() {
        this.quickPromptPayPresenter.onDestroy();
        this.MediaBrowserCompat$MediaItem = null;
        super.onDestroy();
    }

    @OnClick
    public void onReviewButtonClick() {
        AlertController$RecycleListView();
        String obj = this.mCustomProxyNumber.proxyNumberField.getText().toString();
        if (removeIfFromRandomAccessList.read(obj)) {
            String str = "";
            String replaceAll = obj.replaceAll("[()+\\-\\s]", str);
            if (replaceAll.length() < 13) {
                eventFromJson eventfromjson = new eventFromJson();
                eventfromjson.MediaBrowserCompat$ItemReceiver = replaceAll;
                eventfromjson.MediaBrowserCompat$MediaItem = animateCameraWithCallback.MOB;
                eventfromjson.RatingCompat = IGoogleMapDelegate.PROMPTPAY;
                this.MediaBrowserCompat$SearchResultReceiver = eventfromjson;
            } else {
                eventFromJson eventfromjson2 = new eventFromJson();
                eventfromjson2.MediaBrowserCompat$ItemReceiver = replaceAll;
                eventfromjson2.MediaBrowserCompat$MediaItem = animateCameraWithCallback.CID;
                eventfromjson2.RatingCompat = IGoogleMapDelegate.PROMPTPAY;
                this.MediaBrowserCompat$SearchResultReceiver = eventfromjson2;
            }
            C4442fy fyVar = this.quickPromptPayPresenter;
            double d = this.IconCompatParcelizer;
            eventFromJson eventfromjson3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (fyVar.MediaBrowserCompat$ItemReceiver != null) {
                IGoogleMapDelegate iGoogleMapDelegate = eventfromjson3.RatingCompat;
                String str2 = fyVar.MediaBrowserCompat$ItemReceiver.AppCompatViewInflater;
                getShortName getshortname = fyVar.MediaBrowserCompat$ItemReceiver.setBackgroundResource;
                animateCameraWithCallback animatecamerawithcallback = eventfromjson3.MediaBrowserCompat$MediaItem;
                String str3 = eventfromjson3.MediaBrowserCompat$ItemReceiver;
                String str4 = eventfromjson3.IconCompatParcelizer;
                Interner interner = new Interner();
                interner.MediaDescriptionCompat = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate.PROMPTPAY);
                interner.MediaBrowserCompat$ItemReceiver = str2;
                interner.IconCompatParcelizer = getshortname.value;
                int i = getICheckDeserializerRtti.C13363.MediaBrowserCompat$CustomActionResultReceiver[animatecamerawithcallback.ordinal()];
                if (i == 1) {
                    str = "CID";
                } else if (i == 2) {
                    str = "MOB";
                }
                interner.RatingCompat = str;
                interner.MediaBrowserCompat$CustomActionResultReceiver = str3;
                interner.read = removeIfFromRandomAccessList.read(d);
                fyVar.IconCompatParcelizer.write(fyVar.IconCompatParcelizer.read.write(interner), new C4442fy.write(animatecamerawithcallback, interner, str4, iGoogleMapDelegate));
                return;
            }
            return;
        }
        aj_();
        this.mCustomProxyNumber.setErrorValidationVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate) {
        PlaybackStateCompat$CustomAction();
        aj_();
        Intent intent = new Intent(getContext(), QuickPromptPayReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TYPE", iGoogleMapDelegate);
        intent.putExtra("source", this.MediaBrowserCompat$CustomActionResultReceiver);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(activity, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                activity.startActivityForResult(read, 0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onModifyClicked() {
        String str;
        Intent intent = new Intent(getContext(), ModifyQuickPromptPayActivity.class);
        C4442fy fyVar = this.quickPromptPayPresenter;
        immediateCheckedFuture immediatecheckedfuture = fyVar.MediaBrowserCompat$ItemReceiver;
        if (immediatecheckedfuture == null || immediatecheckedfuture.AppCompatViewInflater == null) {
            str = "";
        } else {
            str = fyVar.MediaBrowserCompat$ItemReceiver.AppCompatViewInflater;
        }
        intent.putExtra("com.scb.phone.EXTRA_QUICK_PROMPT_PAY_DISPLAY", str);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(activity, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                activity.startActivityForResult(read, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaDescriptionCompat(String str) {
        this.buttonReview.setButtonEnabled(removeIfFromRandomAccessList.read(str) && this.IconCompatParcelizer > 0.0d);
    }

    public final void aO_() {
        this.mCustomProxyNumber.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void read(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        if (getUserVisibleHint()) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_read_contacts_title).IconCompatParcelizer((int) R.string.permission_read_contacts);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new ActivityBuilder_ContributeHmlNTBSummaryActivity(historyAdapter$GroupFooterViewHolder_ViewBinding));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new ActivityBuilder_ContributeHmlNTBReviewDocumentActivity(historyAdapter$GroupFooterViewHolder_ViewBinding)).show();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (getUserVisibleHint()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.permission_read_contacts_denied);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
                }
            }
        }
    }

    public final void RatingCompat() {
        if (getUserVisibleHint()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.permission_read_contacts_never_ask_again);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity.read(this, i, iArr);
    }

    static /* synthetic */ void write(QuickPromptPayFragment quickPromptPayFragment, double d) {
        quickPromptPayFragment.IconCompatParcelizer = d;
        quickPromptPayFragment.buttonReview.setButtonEnabled(d > 0.0d && !TextUtils.isEmpty(quickPromptPayFragment.mCustomProxyNumber.proxyNumberField.getText().toString()));
    }
}
