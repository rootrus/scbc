package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponCommonActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.custom.common.CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.TypeCastException;
import p040o.Component;
import p040o.Component$$Lambda$3;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.getFirstName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getICheckDeserializerRtti;
import p040o.intoSet;
import p040o.onGetStartedClick;
import p040o.onNotNowClick$MediaBrowserCompat$ItemReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.translateName;
import p040o.translateName$MediaBrowserCompat$MediaItem;
import p040o.translateName$MediaBrowserCompat$SearchResultReceiver;
import p040o.writeUInt64NoTag;

public final class ECouponQuantityFragment extends BaseFragment implements getFirstName$MediaBrowserCompat$CustomActionResultReceiver, CustomDeltaInput.read, CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver, AmountEditText$MediaBrowserCompat$CustomActionResultReceiver, TextView.OnEditorActionListener, View.OnFocusChangeListener, CustomDeltaInput.write, CustomDeltaInput.IconCompatParcelizer, View.OnClickListener {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private chain MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private Component$$Lambda$3 MediaBrowserCompat$SearchResultReceiver;
    private intoSet MediaMetadataCompat;
    private Component.C31841 RatingCompat;
    @BindView
    public AmountEditText customInputValue;
    @BindView
    public CustomDeltaInput inputQuantity;
    @HmlPinActivity
    public translateName presenter;
    @BindView
    public Button redeemButton;
    @BindView
    public TextView tvPoint;
    @BindView
    public TextView txtMaximumQuota;
    @BindView
    public TextView txtPointAndUnit;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86872131493914, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        translatename.MediaBrowserCompat$ItemReceiver(this);
        translateName translatename2 = this.presenter;
        if (translatename2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaBrowserCompat$MediaItem;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("myRewardPoint");
        }
        intoSet intoset = this.MediaMetadataCompat;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        Component.C31841 r3 = this.RatingCompat;
        if (r3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        Component$$Lambda$3 component$$Lambda$3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        onGetStartedClick.write((Object) str, "myRewardPoints");
        onGetStartedClick.write((Object) intoset, "productDisplayModel");
        onGetStartedClick.write((Object) r3, "quotaLimitDisplayModel");
        onGetStartedClick.write((Object) component$$Lambda$3, "quantityDisplay");
        translatename2.IconCompatParcelizer = str;
        translatename2.read = r3;
        translatename2.write = component$$Lambda$3;
        translatename2.MediaBrowserCompat$ItemReceiver = intoset;
        translateName translatename3 = this.presenter;
        if (translatename3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer translatename_mediabrowsercompat_searchresultreceiver = new translateName$MediaBrowserCompat$SearchResultReceiver(translatename3);
        if (translatename3.RatingCompat != null) {
            translatename_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(translatename3.RatingCompat);
        }
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
                this.MediaMetadataCompat = intoset;
            }
            Component.C31841 r0 = (Component.C31841) arguments.getParcelable("EXTRA_E_COUPON_QUOTA_LIMIT_KEY");
            if (r0 != null) {
                onGetStartedClick.IconCompatParcelizer((Object) r0, "quotaLimit");
                this.RatingCompat = r0;
            }
            Component$$Lambda$3 component$$Lambda$3 = (Component$$Lambda$3) arguments.getParcelable("EXTRA_E_COUPON_QUANTITY_KEY");
            if (component$$Lambda$3 != null) {
                onGetStartedClick.IconCompatParcelizer((Object) component$$Lambda$3, "quantity");
                this.MediaBrowserCompat$SearchResultReceiver = component$$Lambda$3;
            }
            chain chain2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            String str = chain2.setGroupDividerEnabled;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.rewardPoints");
            this.MediaBrowserCompat$MediaItem = str;
        }
    }

    public final void onDestroy() {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        translatename.onDestroy();
        super.onDestroy();
    }

    public final void write() {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.setOnValueChangedListener(this);
        customDeltaInput.setOnIncrementChangeListener(this);
        customDeltaInput.setOnKeyboardDoneListener(this);
        customDeltaInput.inputValue.setOnPasteListener(this);
        customDeltaInput.inputValue.setOnEditorActionListener(this);
        AmountEditText amountEditText = customDeltaInput.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "it.inputValue");
        amountEditText.setOnFocusChangeListener(this);
        customDeltaInput.setOnDismissKeyboardListener(this);
        customDeltaInput.setOnClickInputAmountListener(this);
        Component$$Lambda$3 component$$Lambda$3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        customDeltaInput.setDelta(component$$Lambda$3.write);
        Component$$Lambda$3 component$$Lambda$32 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$32 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        customDeltaInput.setMinValue(component$$Lambda$32.read);
        Component$$Lambda$3 component$$Lambda$33 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$33 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        customDeltaInput.setMaxValue(component$$Lambda$33.IconCompatParcelizer);
        Component$$Lambda$3 component$$Lambda$34 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$34 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        customDeltaInput.setActualValue(component$$Lambda$34.MediaBrowserCompat$CustomActionResultReceiver);
        customDeltaInput.container.setBackgroundResource(R.color.f71012131100257);
        AmountEditText amountEditText2 = customDeltaInput.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "it.inputValue");
        amountEditText2.setCursorVisible(false);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "maxQuota");
        Component.C31841 r0 = this.RatingCompat;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i = r0.read;
        int i2 = r0.write;
        if (!r0.MediaBrowserCompat$ItemReceiver || i2 <= i) {
            TextView textView = this.txtMaximumQuota;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("txtMaximumQuota");
            }
            BigDecimal valueOf = BigDecimal.valueOf((long) r0.write);
            onGetStartedClick.IconCompatParcelizer((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            decimalFormatSymbols.setGroupingSeparator(',');
            String format = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols).format(valueOf);
            onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.amountBigDecim…tor(stock.toBigDecimal())");
            String string = getString(R.string.e_coupon_quantity_maximum_quota_no_limit, format);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.e_cou…um_quota_no_limit, stock)");
            textView.setText(string);
            return;
        }
        TextView textView2 = this.txtMaximumQuota;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txtMaximumQuota");
        }
        String string2 = getString(R.string.e_coupon_quantity_maximum_quota_limit, str);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.e_cou…um_quota_limit, maxValue)");
        textView2.setText(string2);
    }

    public final void read(boolean z) {
        Button button = this.redeemButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemButton");
        }
        button.setEnabled(z);
    }

    public final void read() {
        Context context = getContext();
        if (context != null) {
            ECouponCommonActivity.IconCompatParcelizer iconCompatParcelizer = ECouponCommonActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            intoSet intoset = this.MediaMetadataCompat;
            if (intoset == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
            }
            Component.C31841 r3 = this.RatingCompat;
            if (r3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
            }
            Component$$Lambda$3 component$$Lambda$3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (component$$Lambda$3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
            }
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = ECouponCommonActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(context, chain, intoset, r3, component$$Lambda$3);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, MediaBrowserCompat$CustomActionResultReceiver2).read();
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

    public final void write(double d, boolean z) {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onNotNowClick$MediaBrowserCompat$ItemReceiver onnotnowclick_mediabrowsercompat_itemreceiver = new onNotNowClick$MediaBrowserCompat$ItemReceiver();
        onnotnowclick_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = d;
        if (String.valueOf((int) d).length() > 4) {
            String valueOf = String.valueOf(d);
            if (valueOf != null) {
                boolean z2 = false;
                String substring = valueOf.substring(0, 4);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                onnotnowclick_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = Double.parseDouble(substring);
                writeUInt64NoTag.IconCompatParcelizer read = new translateName.read(onnotnowclick_mediabrowsercompat_itemreceiver);
                if (translatename.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    read.IconCompatParcelizer(translatename.RatingCompat);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        translatename.IconCompatParcelizer(onnotnowclick_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(double d) {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.setActualValueUI(d);
        CustomDeltaInput customDeltaInput2 = this.inputQuantity;
        if (customDeltaInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput2.setActualValueOnly(d);
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        translatename.IconCompatParcelizer(d);
    }

    public final void MediaSessionCompat$Token() {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        translatename.IconCompatParcelizer(customDeltaInput.IconCompatParcelizer);
        CustomDeltaInput customDeltaInput2 = this.inputQuantity;
        if (customDeltaInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        AmountEditText amountEditText = customDeltaInput2.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "inputQuantity.inputValue");
        amountEditText.setCursorVisible(false);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13975x50fd9e4a() {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        translatename.IconCompatParcelizer(customDeltaInput.IconCompatParcelizer);
        CustomDeltaInput customDeltaInput2 = this.inputQuantity;
        if (customDeltaInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        AmountEditText amountEditText = customDeltaInput2.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "inputQuantity.inputValue");
        amountEditText.setCursorVisible(false);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i != 6) {
            return false;
        }
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = translateName.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (translatename.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(translatename.RatingCompat);
        }
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            translateName translatename = this.presenter;
            if (translatename == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = translateName.write.MediaBrowserCompat$CustomActionResultReceiver;
            if (translatename.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(translatename.RatingCompat);
            }
        }
    }

    public final void aC_() {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = translateName.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (translatename.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(translatename.RatingCompat);
        }
    }

    public final void aB_() {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = translateName.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (translatename.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(translatename.RatingCompat);
        }
    }

    public final void onClick(View view) {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        AmountEditText amountEditText = customDeltaInput.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "inputQuantity.inputValue");
        amountEditText.setCursorVisible(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        Component$$Lambda$3 component$$Lambda$3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        component$$Lambda$3.IconCompatParcelizer = d;
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.setMaxValue(d);
    }

    public final void RatingCompat() {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.setErrorMessage(getResources().getString(R.string.e_coupon_insufficient_points));
        MediaMetadataCompat();
    }

    public final void MediaBrowserCompat$MediaItem() {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.setErrorMessage(getResources().getString(R.string.e_coupon_not_enough));
        MediaMetadataCompat();
    }

    public final void MediaDescriptionCompat() {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.setErrorMessage(getResources().getString(R.string.e_coupon_over_quota));
        MediaMetadataCompat();
    }

    public final void write(int i) {
        TextView textView = this.tvPoint;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPoint");
        }
        BigDecimal valueOf = BigDecimal.valueOf((long) i);
        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setGroupingSeparator(',');
        String format = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols).format(valueOf);
        onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.amountBigDecim…imalsAndSeparator(number)");
        textView.setText(format);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        intoSet intoset = this.MediaMetadataCompat;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        Integer num = intoset.PlaybackStateCompat$CustomAction;
        onGetStartedClick.IconCompatParcelizer((Object) num, "productDisplayModel.redeemPoints");
        BigDecimal valueOf = BigDecimal.valueOf((long) num.intValue());
        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setGroupingSeparator(',');
        String format = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols).format(valueOf);
        onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.amountBigDecim…imalsAndSeparator(number)");
        Component$$Lambda$3 component$$Lambda$3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplayModel");
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver));
        DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols2.setGroupingSeparator(',');
        String format2 = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols2).format(bigDecimal);
        onGetStartedClick.IconCompatParcelizer((Object) format2, "Utilities.amountBigDecim…imalsAndSeparator(number)");
        TextView textView = this.txtPointAndUnit;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("txtPointAndUnit");
        }
        String string = getString(R.string.e_coupon_quantity_total_points_calculate, format, format2);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.e_cou…deemPoints, actualAmount)");
        textView.setText(string);
    }

    public final void IconCompatParcelizer() {
        PlaybackStateCompat$CustomAction();
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.inputValue.clearFocus();
        CustomDeltaInput customDeltaInput2 = this.inputQuantity;
        if (customDeltaInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        AmountEditText amountEditText = customDeltaInput2.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "inputQuantity.inputValue");
        amountEditText.setCursorVisible(false);
        CustomDeltaInput customDeltaInput3 = this.inputQuantity;
        if (customDeltaInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        if (TextUtils.isEmpty(customDeltaInput3.inputValue.toString())) {
            CustomDeltaInput customDeltaInput4 = this.inputQuantity;
            if (customDeltaInput4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
            }
            customDeltaInput4.setActualValue(0.0d);
        }
        CustomDeltaInput customDeltaInput5 = this.inputQuantity;
        if (customDeltaInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        CustomDeltaInput customDeltaInput6 = this.inputQuantity;
        if (customDeltaInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput5.setActualValueOnly(customDeltaInput6.IconCompatParcelizer);
        CustomDeltaInput customDeltaInput7 = this.inputQuantity;
        if (customDeltaInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        CustomDeltaInput customDeltaInput8 = this.inputQuantity;
        if (customDeltaInput8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput7.setActualValueUI(customDeltaInput8.IconCompatParcelizer);
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomDeltaInput customDeltaInput9 = this.inputQuantity;
        if (customDeltaInput9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        translatename.IconCompatParcelizer(customDeltaInput9.IconCompatParcelizer);
    }

    private final void MediaMetadataCompat() {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.errorMessage.setVisibility(0);
        Context context = getContext();
        if (context != null) {
            AmountEditText amountEditText = this.customInputValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customInputValue");
            }
            amountEditText.getBackground().mutate().setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f67152131099871), PorterDuff.Mode.SRC_ATOP);
        }
    }

    @OnClick
    public final void onNextClick() {
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = translateName$MediaBrowserCompat$MediaItem.read;
        if (translatename.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(translatename.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        customDeltaInput.errorMessage.setVisibility(8);
        if (getContext() != null) {
            AmountEditText amountEditText = this.customInputValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customInputValue");
            }
            amountEditText.getBackground().mutate().clearColorFilter();
        }
    }

    public final boolean read(AmountEditText amountEditText, String str) {
        onGetStartedClick.write((Object) amountEditText, "amountEditText");
        onGetStartedClick.write((Object) str, "text");
        String replaceAll = str.replaceAll("[^.0-9]", "");
        CustomDeltaInput customDeltaInput = this.inputQuantity;
        if (customDeltaInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        Double MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(replaceAll);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "Utilities.amountStringToDouble(amountText)");
        customDeltaInput.setActualValue(MediaBrowserCompat$ItemReceiver.doubleValue());
        translateName translatename = this.presenter;
        if (translatename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomDeltaInput customDeltaInput2 = this.inputQuantity;
        if (customDeltaInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        translatename.IconCompatParcelizer(customDeltaInput2.IconCompatParcelizer);
        CustomDeltaInput customDeltaInput3 = this.inputQuantity;
        if (customDeltaInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputQuantity");
        }
        AmountEditText amountEditText2 = customDeltaInput3.inputValue;
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "inputQuantity.inputValue");
        amountEditText2.setCursorVisible(false);
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ecoupon_quantity");
        }
    }
}
