package com.scb.phone.view.fragment.parntner.nsip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.partner.nsip.C5685xaae390fe;
import com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.AlertController$RecycleListView;
import p040o.C4323eA;
import p040o.C9902xf205a622;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Functions;
import p040o.Functions$FunctionComposition$MediaBrowserCompat$ItemReceiver;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HashBiMap;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.ZTBSV;
import p040o.computeArrayListCapacity;
import p040o.eA$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.eA$MediaBrowserCompat$ItemReceiver;
import p040o.eA$MediaBrowserCompat$SearchResultReceiver;
import p040o.eA$MediaSessionCompat$ResultReceiverWrapper;
import p040o.eA$MediaSessionCompat$Token;
import p040o.forEachSrcOver;
import p040o.getProjectAsync;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setOs;
import p040o.setStartedAt;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class NsipPaymentInputFragment extends BaseFragment implements getProjectAsync.write, AccountSourceSelectFragment.write, NoteEditText.IconCompatParcelizer {
    public static final C6115xe712d44d IconCompatParcelizer = new C6115xe712d44d((byte) 0);
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;
    private setOs MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat = "";
    @HmlPinActivity
    public C4323eA presenter;

    private View read(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public NsipPaymentInputFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = NsipPaymentInputFragment$MediaBrowserCompat$ItemReceiver.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88692131494096, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        C4323eA eAVar = this.presenter;
        if (eAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eAVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$MediaItem = (setOs) arguments.getParcelable("KEY_NSIP_PARTNER_PAYMENT_DISPLAY");
            this.MediaDescriptionCompat = AlertController$RecycleListView.write(arguments, "KEY_DEEPLINK_ID");
        }
        boolean z = false;
        ((NoteEditText) read(ZHER2K.write.edtNote)).setOnNoteInputListener(this, "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$", false);
        setOs setos = this.MediaBrowserCompat$MediaItem;
        if (setos != null) {
            C4323eA eAVar2 = this.presenter;
            if (eAVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setos, "nsipPaymentInputDisplay");
            eAVar2.MediaBrowserCompat$MediaItem = setos;
            eAVar2.MediaBrowserCompat$ItemReceiver = setos.RatingCompat;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4323eA.read.MediaBrowserCompat$CustomActionResultReceiver;
            if (eAVar2.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(eAVar2.RatingCompat);
            }
            computeArrayListCapacity computearraylistcapacity = eAVar2.write;
            FundFactSheetActivity ea_mediabrowsercompat_customactionresultreceiver = new eA$MediaBrowserCompat$CustomActionResultReceiver(eAVar2);
            FundFactSheetActivity iconCompatParcelizer2 = new C4323eA.IconCompatParcelizer(eAVar2);
            onGetStartedClick.write((Object) ea_mediabrowsercompat_customactionresultreceiver, "onSuccess");
            onGetStartedClick.write((Object) iconCompatParcelizer2, "onError");
            onGetStartedClick.write((Object) "TRANSFER", "function");
            onGetStartedClick.write((Object) "SCB", "subFunction");
            computearraylistcapacity.IconCompatParcelizer(computearraylistcapacity.write, ea_mediabrowsercompat_customactionresultreceiver, iconCompatParcelizer2, new Functions$FunctionComposition$MediaBrowserCompat$ItemReceiver("TRANSFER", "SCB"));
            writeUInt64NoTag.IconCompatParcelizer ea_mediasessioncompat_token = new eA$MediaSessionCompat$Token(setos);
            if (eAVar2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                ea_mediasessioncompat_token.IconCompatParcelizer(eAVar2.RatingCompat);
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("NSIP_TRACKER_FROM", forEachSrcOver.read.IconCompatParcelizer);
        } else {
            str = null;
        }
        ((forEachSrcOver) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).read(str);
        ZTBSV ztbsv = (forEachSrcOver) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        String str2 = forEachSrcOver.IconCompatParcelizer.read;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str2);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File file) {
        onGetStartedClick.write((Object) file, "accountSourceSelectDisplay");
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(file)).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        onGetStartedClick.write((Object) builder, "accountSourceDisplay");
        C4323eA eAVar = this.presenter;
        if (eAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eAVar.MediaBrowserCompat$CustomActionResultReceiver(builder);
    }

    public final void MediaBrowserCompat$ItemReceiver(setOs setos) {
        onGetStartedClick.write((Object) setos, "nsipPaymentInputDisplay");
        Context context = getContext();
        if (context != null) {
            FragmentBuilder_BindDepositSelectorFragment.write(context, setLastBaselineToBottomHeight.write(context, R.drawable.ic_biller_default), (ImageView) read(ZHER2K.write.imgMerchantLogo), setos.MediaBrowserCompat$SearchResultReceiver.read, getResources().getDimensionPixelOffset(R.dimen.f72082131165285), setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) read(ZHER2K.write.tvMerchantName);
        onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView, "tvMerchantName");
        appCompatTextView.setText(setos.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView = (TextView) read(ZHER2K.write.tvMerchantAccountNo);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvMerchantAccountNo");
        textView.setText(setos.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView2 = (TextView) read(ZHER2K.write.tvRef1Label);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvRef1Label");
        textView2.setText(setos.MediaDescriptionCompat);
        TextView textView3 = (TextView) read(ZHER2K.write.tvRef1Value);
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "tvRef1Value");
        textView3.setText(setos.MediaMetadataCompat);
        TextView textView4 = (TextView) read(ZHER2K.write.tvRef2Label);
        onGetStartedClick.IconCompatParcelizer((Object) textView4, "tvRef2Label");
        textView4.setText(setos.MediaSessionCompat$ResultReceiverWrapper);
        TextView textView5 = (TextView) read(ZHER2K.write.tvRef2Value);
        onGetStartedClick.IconCompatParcelizer((Object) textView5, "tvRef2Value");
        textView5.setText(setos.MediaSessionCompat$QueueItem);
        TextView textView6 = (TextView) read(ZHER2K.write.tvRef3Label);
        onGetStartedClick.IconCompatParcelizer((Object) textView6, "tvRef3Label");
        textView6.setText(setos.MediaSessionCompat$Token);
        TextView textView7 = (TextView) read(ZHER2K.write.tvRef3Value);
        onGetStartedClick.IconCompatParcelizer((Object) textView7, "tvRef3Value");
        textView7.setText(setos.f2955x50fd9e4a);
    }

    public final void write() {
        LinearLayout linearLayout = (LinearLayout) read(ZHER2K.write.layoutRef2);
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "layoutRef2");
        linearLayout.setVisibility(8);
    }

    public final void read() {
        LinearLayout linearLayout = (LinearLayout) read(ZHER2K.write.layoutRef3);
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "layoutRef3");
        linearLayout.setVisibility(8);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "amount");
        ((AmountEditText) read(ZHER2K.write.edtAmount)).setText(str);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "limit");
        LinearLayout linearLayout = (LinearLayout) read(ZHER2K.write.remaining_limit_linear_layout);
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "remaining_limit_linear_layout");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) read(ZHER2K.write.text_remaining_limit_text_view);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "text_remaining_limit_text_view");
        textView.setVisibility(0);
        TextView textView2 = (TextView) read(ZHER2K.write.remaining_limit_text_view);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "remaining_limit_text_view");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) read(ZHER2K.write.remaining_limit_text_view);
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "remaining_limit_text_view");
        textView3.setText(str);
        TextView textView4 = (TextView) read(ZHER2K.write.remaining_limit_error_text_view);
        onGetStartedClick.IconCompatParcelizer((Object) textView4, "remaining_limit_error_text_view");
        textView4.setVisibility(8);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        LinearLayout linearLayout = (LinearLayout) read(ZHER2K.write.remaining_limit_linear_layout);
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "remaining_limit_linear_layout");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) read(ZHER2K.write.remaining_limit_error_text_view);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "remaining_limit_error_text_view");
        textView.setText(getString(R.string.nsip_limit_not_available));
        TextView textView2 = (TextView) read(ZHER2K.write.remaining_limit_error_text_view);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "remaining_limit_error_text_view");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) read(ZHER2K.write.tvAmountError);
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "tvAmountError");
        textView3.setVisibility(8);
        Button button = (Button) read(ZHER2K.write.btnReview);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnReview");
        button.setEnabled(true);
    }

    public final void MediaMetadataCompat() {
        TextView textView = (TextView) read(ZHER2K.write.tvAmountError);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvAmountError");
        textView.setText(getString(R.string.nsip_insufficient_balance_error));
    }

    public final void RatingCompat() {
        TextView textView = (TextView) read(ZHER2K.write.tvAmountError);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvAmountError");
        textView.setText(getString(R.string.nsip_amount_exceed_limit_error));
    }

    public final void MediaDescriptionCompat() {
        ((AmountEditText) read(ZHER2K.write.edtAmount)).setInvalidAmount(true);
        TextView textView = (TextView) read(ZHER2K.write.tvAmountError);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvAmountError");
        textView.setVisibility(0);
    }

    public final void IconCompatParcelizer() {
        ((AmountEditText) read(ZHER2K.write.edtAmount)).setInvalidAmount(false);
        TextView textView = (TextView) read(ZHER2K.write.tvAmountError);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvAmountError");
        textView.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Button button = (Button) read(ZHER2K.write.btnReview);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnReview");
        button.setEnabled(true);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Button button = (Button) read(ZHER2K.write.btnReview);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnReview");
        button.setEnabled(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        C4323eA eAVar = this.presenter;
        if (eAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        NoteEditText noteEditText = (NoteEditText) read(ZHER2K.write.edtNote);
        onGetStartedClick.IconCompatParcelizer((Object) noteEditText, "edtNote");
        String obj = noteEditText.mNoteEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "edtNote.note");
        onGetStartedClick.write((Object) obj, "note");
        boolean z2 = false;
        boolean z3 = (obj.length() == 0) || z;
        boolean MediaBrowserCompat$ItemReceiver = eAVar.MediaBrowserCompat$ItemReceiver(eAVar.MediaBrowserCompat$ItemReceiver, eAVar.read);
        boolean read = eAVar.read(eAVar.MediaBrowserCompat$ItemReceiver, eAVar.IconCompatParcelizer);
        if (!z3 || MediaBrowserCompat$ItemReceiver || read) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = eA$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer;
            if (eAVar.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(eAVar.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C9902xf205a622.IconCompatParcelizer;
        if (eAVar.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            iconCompatParcelizer2.IconCompatParcelizer(eAVar.RatingCompat);
        }
    }

    @OnClick
    public final void onClickBtnReview() {
        C4323eA eAVar = this.presenter;
        if (eAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        NoteEditText noteEditText = (NoteEditText) read(ZHER2K.write.edtNote);
        onGetStartedClick.IconCompatParcelizer((Object) noteEditText, "edtNote");
        String obj = noteEditText.mNoteEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "edtNote.note");
        String str = this.MediaDescriptionCompat;
        onGetStartedClick.write((Object) obj, "note");
        onGetStartedClick.write((Object) str, "deepLinkId");
        boolean z = true;
        if (obj.length() == 0) {
            obj = null;
        }
        writeUInt64NoTag.IconCompatParcelizer ea_mediabrowsercompat_itemreceiver = new eA$MediaBrowserCompat$ItemReceiver(eAVar);
        if (eAVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ea_mediabrowsercompat_itemreceiver.IconCompatParcelizer(eAVar.RatingCompat);
        }
        computeArrayListCapacity computearraylistcapacity = eAVar.write;
        FundFactSheetActivity mediaMetadataCompat = new C4323eA.MediaMetadataCompat(eAVar, obj);
        FundFactSheetActivity ea_mediabrowsercompat_searchresultreceiver = new eA$MediaBrowserCompat$SearchResultReceiver(eAVar);
        setOs setos = eAVar.MediaBrowserCompat$MediaItem;
        if (setos == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsipPaymentInputDisplay");
        }
        HashBiMap hashBiMap = new HashBiMap(setos.read, obj, str);
        onGetStartedClick.write((Object) mediaMetadataCompat, "onSuccess");
        onGetStartedClick.write((Object) ea_mediabrowsercompat_searchresultreceiver, "onError");
        onGetStartedClick.write((Object) hashBiMap, "request");
        computearraylistcapacity.IconCompatParcelizer(computearraylistcapacity.read, mediaMetadataCompat, ea_mediabrowsercompat_searchresultreceiver, new Functions.FunctionForMapNoDefault.IconCompatParcelizer(hashBiMap));
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(setStartedAt setstartedat) {
        onGetStartedClick.write((Object) setstartedat, "nsipPaymentReviewDisplay");
        Context context = getContext();
        if (context != null) {
            C5685xaae390fe nsipPartnerPaymentReviewActivity$MediaBrowserCompat$CustomActionResultReceiver = NsipPartnerPaymentReviewActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) setstartedat, "verificationDisplay");
            Intent intent = new Intent(context, NsipPartnerPaymentReviewActivity.class);
            intent.putExtra("EXTRA_NSIP_VERIFICATION", setstartedat);
            Bundle arguments = getArguments();
            if (arguments != null) {
                intent.putExtras(arguments);
            }
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C4323eA eAVar = this.presenter;
        if (eAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eAVar.onDestroy();
    }
}
