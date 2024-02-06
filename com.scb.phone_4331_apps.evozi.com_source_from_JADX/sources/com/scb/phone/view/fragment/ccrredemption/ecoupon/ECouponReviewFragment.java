package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.CreditCardTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponSuccessfulActivity;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.AnalyticsConnectorRegistrar;
import p040o.C5441xc0b16631;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.Component;
import p040o.Component$$Lambda$3;
import p040o.HmlPinActivity;
import p040o.IdCaptureBackActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.getFirstName;
import p040o.getObjectives;
import p040o.intoSet;
import p040o.lambda$intoSet$2;
import p040o.newParameterizedTypeWithOwner;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.upperCaseFirstLetter;
import p040o.verifyPurposefulFeatures;
import p040o.writeUInt64NoTag;

public final class ECouponReviewFragment extends BaseFragment implements verifyPurposefulFeatures, getObjectives, getFirstName.read, IdCaptureBackActivity {
    public static final ECouponReviewFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new ECouponReviewFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    private chain MediaBrowserCompat$CustomActionResultReceiver;
    private intoSet MediaBrowserCompat$SearchResultReceiver;
    private Component$$Lambda$3 MediaMetadataCompat;
    @BindView
    public Button btnConfirm;
    @BindView
    public CustomTransferAndPaySource cardView;
    @BindView
    public CustomTransferAndPaySource itemView;
    @HmlPinActivity
    public upperCaseFirstLetter reviewPresenter;
    @HmlPinActivity
    public newParameterizedTypeWithOwner reviewRedemptionPresenter;
    @BindView
    public TermsAndConditionsView tcView;
    @BindView
    public TextView tvPoint;
    @BindView
    public TextView txtRemark;

    public final void MediaDescriptionCompat() {
    }

    public final void MediaMetadataCompat() {
    }

    public final void RatingCompat() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86882131493915, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            chain chain = (chain) arguments.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaBrowserCompat$CustomActionResultReceiver = chain;
            }
            intoSet intoset = (intoSet) arguments.getParcelable("EXTRA_PRODUCT_DISPLAY_MODEL_KEY");
            if (intoset != null) {
                onGetStartedClick.IconCompatParcelizer((Object) intoset, "product");
                this.MediaBrowserCompat$SearchResultReceiver = intoset;
            }
            Component.C31841 r0 = (Component.C31841) arguments.getParcelable("EXTRA_E_COUPON_QUOTA_LIMIT_KEY");
            if (r0 != null) {
                onGetStartedClick.IconCompatParcelizer((Object) r0, "quotaLimit");
            }
            Component$$Lambda$3 component$$Lambda$3 = (Component$$Lambda$3) arguments.getParcelable("EXTRA_E_COUPON_QUANTITY_KEY");
            if (component$$Lambda$3 != null) {
                onGetStartedClick.IconCompatParcelizer((Object) component$$Lambda$3, "quantity");
                this.MediaMetadataCompat = component$$Lambda$3;
            }
            chain chain2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            onGetStartedClick.IconCompatParcelizer((Object) chain2.setGroupDividerEnabled, "creditCardDisplay.rewardPoints");
        }
    }

    public final void onStart() {
        super.onStart();
        upperCaseFirstLetter uppercasefirstletter = this.reviewPresenter;
        if (uppercasefirstletter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewPresenter");
        }
        CheckCaptureModule_GetICheckDeserializerRttiFactory checkCaptureModule_GetICheckDeserializerRttiFactory = this;
        uppercasefirstletter.MediaBrowserCompat$ItemReceiver(checkCaptureModule_GetICheckDeserializerRttiFactory);
        upperCaseFirstLetter uppercasefirstletter2 = this.reviewPresenter;
        if (uppercasefirstletter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewPresenter");
        }
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        String str = chain.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
        chain chain2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        String str2 = chain2.MediaSessionCompat$Token;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "creditCardDisplay.creditCardFormat");
        chain chain3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        String str3 = chain3.setItemInvoker;
        onGetStartedClick.IconCompatParcelizer((Object) str3, "creditCardDisplay.productTypeDescription");
        intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        Component$$Lambda$3 component$$Lambda$3 = this.MediaMetadataCompat;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        onGetStartedClick.write((Object) str, "cardNo");
        onGetStartedClick.write((Object) str2, "maskedCardNo");
        onGetStartedClick.write((Object) str3, "productTypeDescription");
        onGetStartedClick.write((Object) intoset, "productDisplayModel");
        onGetStartedClick.write((Object) component$$Lambda$3, "quantityDisplay");
        uppercasefirstletter2.read = intoset;
        uppercasefirstletter2.MediaMetadataCompat = component$$Lambda$3;
        uppercasefirstletter2.IconCompatParcelizer = str;
        uppercasefirstletter2.write = str2;
        uppercasefirstletter2.MediaBrowserCompat$ItemReceiver = str3;
        upperCaseFirstLetter uppercasefirstletter3 = this.reviewPresenter;
        if (uppercasefirstletter3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer uppercasefirstletter_mediabrowsercompat_customactionresultreceiver = new C5441xc0b16631(uppercasefirstletter3);
        if (uppercasefirstletter3.RatingCompat != null) {
            uppercasefirstletter_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(uppercasefirstletter3.RatingCompat);
        }
        newParameterizedTypeWithOwner newparameterizedtypewithowner = this.reviewRedemptionPresenter;
        if (newparameterizedtypewithowner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewRedemptionPresenter");
        }
        newparameterizedtypewithowner.MediaBrowserCompat$ItemReceiver(checkCaptureModule_GetICheckDeserializerRttiFactory);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Context context = getContext();
        if (context != null) {
            CreditCardTermsAndConditionsActivity.write write = CreditCardTermsAndConditionsActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            Intent MediaBrowserCompat$ItemReceiver = CreditCardTermsAndConditionsActivity.write.MediaBrowserCompat$ItemReceiver(context, "CREDITCARDREWARDS");
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        upperCaseFirstLetter uppercasefirstletter = this.reviewPresenter;
        if (uppercasefirstletter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write = new upperCaseFirstLetter.write(z);
        if (uppercasefirstletter.RatingCompat != null) {
            write.IconCompatParcelizer(uppercasefirstletter.RatingCompat);
        }
    }

    public final void write() {
        CustomTransferAndPaySource customTransferAndPaySource = this.cardView;
        if (customTransferAndPaySource == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardView");
        }
        customTransferAndPaySource.setText(getString(R.string.e_coupon_review_card_title));
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        customTransferAndPaySource.setSourceName(chain.AppCompatViewInflater);
        chain chain2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        customTransferAndPaySource.setAccountNumber(chain2.MediaSessionCompat$Token);
        customTransferAndPaySource.MediaBrowserCompat$CustomActionResultReceiver();
        customTransferAndPaySource.setDivider(true);
        customTransferAndPaySource.setDividerLeftPadding((int) getResources().getDimension(R.dimen.f72472131165407));
    }

    public final void read() {
        CustomTransferAndPaySource customTransferAndPaySource = this.itemView;
        if (customTransferAndPaySource == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemView");
        }
        customTransferAndPaySource.setText(getString(R.string.e_coupon_review_item_title));
        intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        customTransferAndPaySource.setSourceName(intoset.MediaSessionCompat$QueueItem);
        Object[] objArr = new Object[2];
        intoSet intoset2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (intoset2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        objArr[0] = intoset2.MediaSessionCompat$Token;
        Component$$Lambda$3 component$$Lambda$3 = this.MediaMetadataCompat;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setGroupingSeparator(',');
        String format = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols).format(bigDecimal);
        onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.amountBigDecim…imalsAndSeparator(number)");
        objArr[1] = format;
        customTransferAndPaySource.setAccountNumber(getString(R.string.e_coupon_review_item_code_qty, objArr));
        customTransferAndPaySource.MediaBrowserCompat$CustomActionResultReceiver();
        customTransferAndPaySource.setDivider(true);
        customTransferAndPaySource.setDividerLeftPadding((int) getResources().getDimension(R.dimen.f72472131165407));
    }

    public final void IconCompatParcelizer() {
        TextView textView = this.tvPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPoint");
        }
        intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        Integer num = intoset.PlaybackStateCompat$CustomAction;
        onGetStartedClick.IconCompatParcelizer((Object) num, "productDisplayModel.redeemPoints");
        int intValue = num.intValue();
        Component$$Lambda$3 component$$Lambda$3 = this.MediaMetadataCompat;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        BigDecimal valueOf = BigDecimal.valueOf((long) (intValue * ((int) component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver)));
        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setGroupingSeparator(',');
        String format = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols).format(valueOf);
        onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.amountBigDecim…* amount).toBigDecimal())");
        textView.setText(format);
    }

    public final void MediaBrowserCompat$MediaItem() {
        TermsAndConditionsView termsAndConditionsView = this.tcView;
        if (termsAndConditionsView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tcView");
        }
        termsAndConditionsView.setTermsAndConditionsListener(this);
        TermsAndConditionsView termsAndConditionsView2 = this.tcView;
        if (termsAndConditionsView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tcView");
        }
        termsAndConditionsView2.setTermsCheckboxListener(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String str;
        TextView textView = this.txtRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txtRemark");
        }
        Object[] objArr = new Object[1];
        intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        if (intoset.MediaBrowserCompat$ItemReceiver == null) {
            str = "";
        } else {
            str = NumberFormat.getInstance(Locale.getDefault()).format(intoset.MediaBrowserCompat$ItemReceiver);
        }
        objArr[0] = str;
        String string = getString(R.string.e_coupon_detail_time_warning, objArr);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.e_cou…formattedCouponTimeLimit)");
        textView.setText(string);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.btnConfirm;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnConfirm");
        }
        button.setEnabled(z);
    }

    public final void IconCompatParcelizer(lambda$intoSet$2 lambda_intoset_2) {
        onGetStartedClick.write((Object) lambda_intoset_2, "reviewRedemptionDto");
        newParameterizedTypeWithOwner newparameterizedtypewithowner = this.reviewRedemptionPresenter;
        if (newparameterizedtypewithowner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewRedemptionPresenter");
        }
        newparameterizedtypewithowner.IconCompatParcelizer = lambda_intoset_2;
        newparameterizedtypewithowner.IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$ItemReceiver(AnalyticsConnectorRegistrar analyticsConnectorRegistrar) {
        Context context = getContext();
        if (context != null && analyticsConnectorRegistrar != null) {
            ECouponSuccessfulActivity.IconCompatParcelizer iconCompatParcelizer = ECouponSuccessfulActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            String str = chain.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
            String str2 = analyticsConnectorRegistrar.AlertController$RecycleListView;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "it.refId");
            String str3 = analyticsConnectorRegistrar.setContentView;
            onGetStartedClick.IconCompatParcelizer((Object) str3, "it.slipRefId");
            intoSet intoset = this.MediaBrowserCompat$SearchResultReceiver;
            if (intoset == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) str2, "refId");
            onGetStartedClick.write((Object) str3, "slipRefId");
            onGetStartedClick.write((Object) intoset, "productDisplayModel");
            Intent intent = new Intent(context, ECouponSuccessfulActivity.class);
            intent.putExtra("EXTRA_PRODUCT_DISPLAY_MODEL_KEY", intoset);
            intent.putExtra("EXTRA_CARD_REF_NO_KEY", str);
            intent.putExtra("EXTRA_REF_ID_KEY", str2);
            intent.putExtra("EXTRA_SLIP_REF_ID_KEY", str3);
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

    @OnClick
    public final void onNextClick() {
        upperCaseFirstLetter uppercasefirstletter = this.reviewPresenter;
        if (uppercasefirstletter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new upperCaseFirstLetter.read(uppercasefirstletter);
        if (uppercasefirstletter.RatingCompat != null) {
            read.IconCompatParcelizer(uppercasefirstletter.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ecoupon_review");
        }
    }
}
