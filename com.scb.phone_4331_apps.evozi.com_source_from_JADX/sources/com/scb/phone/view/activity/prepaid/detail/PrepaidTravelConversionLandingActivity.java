package com.scb.phone.view.activity.prepaid.detail;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.C5695xef24dc42;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelConversionReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.C1243xf34efb9f;
import p040o.C3071x65de3bd5;
import p040o.C9952xddd5679e;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableList;
import p040o.Lists;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.badElementIndex;
import p040o.badPositionIndexes;
import p040o.construct;
import p040o.exportDepositStatement;
import p040o.getAddress2FieldName;
import p040o.getAddress2FieldName$MediaBrowserCompat$ItemReceiver;
import p040o.getKernelIDDstAtop;
import p040o.getViewModelStore;
import p040o.onGetStartedClick;
import p040o.setDiskSpace;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelConversionLandingActivity extends BaseActivity implements C1243xf34efb9f {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private HashMap MediaBrowserCompat$SearchResultReceiver;
    private getKernelIDDstAtop MediaDescriptionCompat;
    private exportDepositStatement MediaMetadataCompat;
    private AutoValue_CrashlyticsReport_Session_Event.Builder MediaSessionCompat$ResultReceiverWrapper;
    private construct MediaSessionCompat$Token;
    @HmlPinActivity
    public getAddress2FieldName presenter;

    public final View read(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$SearchResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$SearchResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final /* synthetic */ AutoValue_CrashlyticsReport_Session_Event.Builder MediaBrowserCompat$ItemReceiver(PrepaidTravelConversionLandingActivity prepaidTravelConversionLandingActivity) {
        AutoValue_CrashlyticsReport_Session_Event.Builder builder = prepaidTravelConversionLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingDisplay");
        }
        return builder;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent IconCompatParcelizer(Context context, construct construct) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) construct, "prepaidTravelConversionLandingRequest");
            Intent intent = new Intent(context, PrepaidTravelConversionLandingActivity.class);
            intent.putExtra("PREPAID_TRAVEL_CONVERSION_LANDING_REQUEST", construct);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79392131493164);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("PREPAID_TRAVEL_CONVERSION_LANDING_REQUEST");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…NVERSION_LANDING_REQUEST)");
        this.MediaSessionCompat$Token = (construct) parcelableExtra;
        setStackedBackground();
        setTabContainer();
        getAddress2FieldName getaddress2fieldname = this.presenter;
        if (getaddress2fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress2fieldname.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = new getKernelIDDstAtop();
        getAddress2FieldName getaddress2fieldname2 = this.presenter;
        if (getaddress2fieldname2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        construct construct = this.MediaSessionCompat$Token;
        if (construct == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingRequest");
        }
        String str = construct.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "conversionType");
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new getAddress2FieldName.RatingCompat(getaddress2fieldname2, str);
        boolean z = true;
        if (getaddress2fieldname2.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(getaddress2fieldname2.RatingCompat);
        }
        getAddress2FieldName getaddress2fieldname3 = this.presenter;
        if (getaddress2fieldname3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        construct construct2 = this.MediaSessionCompat$Token;
        if (construct2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingRequest");
        }
        onGetStartedClick.write((Object) construct2, "prepaidTravelConversionLandingRequest");
        if (getaddress2fieldname3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getaddress2fieldname3.RatingCompat.AlertController$RecycleListView();
        }
        Lists.AbstractListWrapper abstractListWrapper = getaddress2fieldname3.read;
        FundFactSheetActivity write2 = new getAddress2FieldName.write(getaddress2fieldname3, construct2);
        FundFactSheetActivity iconCompatParcelizer = new getAddress2FieldName.IconCompatParcelizer(getaddress2fieldname3);
        onGetStartedClick.write((Object) write2, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) construct2, "request");
        abstractListWrapper.IconCompatParcelizer(abstractListWrapper.write, write2, iconCompatParcelizer, new badPositionIndexes.IconCompatParcelizer(construct2));
        this.MediaMetadataCompat = new exportDepositStatement(this);
        View read2 = read(ZHER2K.write.layoutFromWallet);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutFromWallet");
        NoSwipeViewPager noSwipeViewPager = (NoSwipeViewPager) read2.findViewById(ZHER2K.write.vpWallet);
        onGetStartedClick.IconCompatParcelizer((Object) noSwipeViewPager, "layoutFromWallet.vpWallet");
        exportDepositStatement exportdepositstatement = this.MediaMetadataCompat;
        if (exportdepositstatement == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        noSwipeViewPager.setAdapter(exportdepositstatement);
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        construct construct3 = this.MediaSessionCompat$Token;
        if (construct3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingRequest");
        }
        if (getAddress2FieldName.MediaBrowserCompat$CustomActionResultReceiver(construct3.IconCompatParcelizer)) {
            getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
            if (getkerneliddstatop == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_buy_input_screen");
            return;
        }
        getKernelIDDstAtop getkerneliddstatop2 = this.MediaDescriptionCompat;
        if (getkerneliddstatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_sell_input_screen");
    }

    public final void IconCompatParcelizer(int i) {
        setTitle(i);
        View read2 = read(ZHER2K.write.layoutFromAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutFromAmount");
        ImageView imageView = (ImageView) read2.findViewById(ZHER2K.write.icTransferAmountWallet);
        onGetStartedClick.IconCompatParcelizer((Object) imageView, "layoutFromAmount.icTransferAmountWallet");
        imageView.setVisibility(8);
        View read3 = read(ZHER2K.write.layoutFromAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read3, "layoutFromAmount");
        ((AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue)).setMaximumDecimalDigit(13);
        View read4 = read(ZHER2K.write.layoutToAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read4, "layoutToAmount");
        ((AmountEditText) read4.findViewById(ZHER2K.write.edtAmountValue)).setMaximumDecimalDigit(13);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event.Builder builder) {
        onGetStartedClick.write((Object) builder, "prepaidTravelConversionLandingDisplay");
        this.MediaSessionCompat$ResultReceiverWrapper = builder;
    }

    public final void read() {
        View read2 = read(ZHER2K.write.layoutFromAmount);
        TextView textView = (TextView) read2.findViewById(ZHER2K.write.tvTitleAmount);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvTitleAmount");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = getString(R.string.prepaid_travel_conversion_landing_buy_amount_from);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…_landing_buy_amount_from)");
        Object[] objArr = new Object[1];
        AutoValue_CrashlyticsReport_Session_Event.Builder builder = this.MediaSessionCompat$ResultReceiverWrapper;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingDisplay");
        }
        objArr[0] = builder.read.get(0).IconCompatParcelizer;
        String format = String.format(string, Arrays.copyOf(objArr, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView.setText(format);
        ((AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue)).setOnAmountChangeListener(new read(read2, this));
        View read3 = read(ZHER2K.write.layoutToAmount);
        TextView textView2 = (TextView) read3.findViewById(ZHER2K.write.tvTitleAmount);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvTitleAmount");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity2 = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string2 = getString(R.string.prepaid_travel_conversion_landing_buy_amount_to);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.prepa…on_landing_buy_amount_to)");
        Object[] objArr2 = new Object[1];
        AutoValue_CrashlyticsReport_Session_Event.Builder builder2 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (builder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingDisplay");
        }
        objArr2[0] = builder2.write.get(0).IconCompatParcelizer;
        String format2 = String.format(string2, Arrays.copyOf(objArr2, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format2, "java.lang.String.format(format, *args)");
        textView2.setText(format2);
        ((AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue)).setOnAmountChangeListener(new C5696x8fc596d4(read3, this));
    }

    public static final class read implements AmountEditText.read {
        private /* synthetic */ PrepaidTravelConversionLandingActivity read;
        private /* synthetic */ View write;

        read(View view, PrepaidTravelConversionLandingActivity prepaidTravelConversionLandingActivity) {
            this.write = view;
            this.read = prepaidTravelConversionLandingActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            if (((AmountEditText) this.write.findViewById(ZHER2K.write.edtAmountValue)).hasFocus()) {
                getAddress2FieldName getaddress2fieldname = this.read.presenter;
                if (getaddress2fieldname == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                String read2 = getaddress2fieldname.read(PrepaidTravelConversionLandingActivity.MediaBrowserCompat$ItemReceiver(this.read).IconCompatParcelizer.get(0).write, d);
                View read3 = this.read.read(ZHER2K.write.layoutToAmount);
                onGetStartedClick.IconCompatParcelizer((Object) read3, "layoutToAmount");
                ((AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue)).setText(read2);
                getAddress2FieldName getaddress2fieldname2 = this.read.presenter;
                if (getaddress2fieldname2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                AmountEditText amountEditText = (AmountEditText) this.write.findViewById(ZHER2K.write.edtAmountValue);
                onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "edtAmountValue");
                String valueOf = String.valueOf(amountEditText.getText());
                View read4 = this.read.read(ZHER2K.write.layoutToAmount);
                onGetStartedClick.IconCompatParcelizer((Object) read4, "layoutToAmount");
                AmountEditText amountEditText2 = (AmountEditText) read4.findViewById(ZHER2K.write.edtAmountValue);
                onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "layoutToAmount.edtAmountValue");
                getaddress2fieldname2.IconCompatParcelizer(valueOf, String.valueOf(amountEditText2.getText()));
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.read.PlaybackStateCompat$CustomAction();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        View read2 = read(ZHER2K.write.layoutFromAmount);
        TextView textView = (TextView) read2.findViewById(ZHER2K.write.tvTitleAmount);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvTitleAmount");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = getString(R.string.prepaid_travel_conversion_landing_sell_amount_from);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…landing_sell_amount_from)");
        Object[] objArr = new Object[1];
        AutoValue_CrashlyticsReport_Session_Event.Builder builder = this.MediaSessionCompat$ResultReceiverWrapper;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingDisplay");
        }
        objArr[0] = builder.write.get(0).IconCompatParcelizer;
        String format = String.format(string, Arrays.copyOf(objArr, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView.setText(format);
        ((AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue)).setOnAmountChangeListener(new C5697xd95a18a3(read2, this));
        View read3 = read(ZHER2K.write.layoutToAmount);
        TextView textView2 = (TextView) read3.findViewById(ZHER2K.write.tvTitleAmount);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvTitleAmount");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity2 = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string2 = getString(R.string.prepaid_travel_conversion_landing_sell_amount_to);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.prepa…n_landing_sell_amount_to)");
        Object[] objArr2 = new Object[1];
        AutoValue_CrashlyticsReport_Session_Event.Builder builder2 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (builder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingDisplay");
        }
        objArr2[0] = builder2.read.get(0).IconCompatParcelizer;
        String format2 = String.format(string2, Arrays.copyOf(objArr2, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format2, "java.lang.String.format(format, *args)");
        textView2.setText(format2);
        ((AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue)).setOnAmountChangeListener(new write(read3, this));
    }

    public static final class write implements AmountEditText.read {
        private /* synthetic */ PrepaidTravelConversionLandingActivity IconCompatParcelizer;
        private /* synthetic */ View write;

        write(View view, PrepaidTravelConversionLandingActivity prepaidTravelConversionLandingActivity) {
            this.write = view;
            this.IconCompatParcelizer = prepaidTravelConversionLandingActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            if (((AmountEditText) this.write.findViewById(ZHER2K.write.edtAmountValue)).hasFocus()) {
                getAddress2FieldName getaddress2fieldname = this.IconCompatParcelizer.presenter;
                if (getaddress2fieldname == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                String IconCompatParcelizer2 = getaddress2fieldname.IconCompatParcelizer(PrepaidTravelConversionLandingActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer).IconCompatParcelizer.get(0).write, d);
                View read = this.IconCompatParcelizer.read(ZHER2K.write.layoutFromAmount);
                onGetStartedClick.IconCompatParcelizer((Object) read, "layoutFromAmount");
                ((AmountEditText) read.findViewById(ZHER2K.write.edtAmountValue)).setText(IconCompatParcelizer2);
                getAddress2FieldName getaddress2fieldname2 = this.IconCompatParcelizer.presenter;
                if (getaddress2fieldname2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                AmountEditText amountEditText = (AmountEditText) this.write.findViewById(ZHER2K.write.edtAmountValue);
                onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "edtAmountValue");
                String valueOf = String.valueOf(amountEditText.getText());
                View read2 = this.IconCompatParcelizer.read(ZHER2K.write.layoutFromAmount);
                onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutFromAmount");
                AmountEditText amountEditText2 = (AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue);
                onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "layoutFromAmount.edtAmountValue");
                getaddress2fieldname2.IconCompatParcelizer(valueOf, String.valueOf(amountEditText2.getText()));
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.IconCompatParcelizer.PlaybackStateCompat$CustomAction();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<AutoValue_CrashlyticsReport_Session_Event_Application> list) {
        onGetStartedClick.write((Object) list, "prepaidTravelWalletDisplayList");
        exportDepositStatement exportdepositstatement = this.MediaMetadataCompat;
        if (exportdepositstatement == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        onGetStartedClick.write((Object) list, "prepaidTravelWalletDisplayList");
        exportdepositstatement.write = list;
        exportdepositstatement.notifyDataSetChanged();
    }

    public final void read(List<AutoValue_CrashlyticsReport_Session_Event_Application> list, List<C3071x65de3bd5> list2) {
        onGetStartedClick.write((Object) list, "prepaidTravelWalletDisplayList");
        onGetStartedClick.write((Object) list2, "fxRateList");
        getViewModelStore<Drawable> MediaBrowserCompat$ItemReceiver = Glide.MediaBrowserCompat$CustomActionResultReceiver((FragmentActivity) this).MediaBrowserCompat$ItemReceiver(list.get(0).RatingCompat);
        View read2 = read(ZHER2K.write.layoutToWallet);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutToWallet");
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((ImageView) read2.findViewById(ZHER2K.write.icToFlag));
        View read3 = read(ZHER2K.write.layoutToWallet);
        onGetStartedClick.IconCompatParcelizer((Object) read3, "layoutToWallet");
        TextView textView = (TextView) read3.findViewById(ZHER2K.write.tvToCurrency);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "layoutToWallet.tvToCurrency");
        textView.setText(list.get(0).IconCompatParcelizer);
        View read4 = read(ZHER2K.write.layoutToWallet);
        onGetStartedClick.IconCompatParcelizer((Object) read4, "layoutToWallet");
        TextView textView2 = (TextView) read4.findViewById(ZHER2K.write.tvFullRate);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "layoutToWallet.tvFullRate");
        textView2.setText(list2.get(0).IconCompatParcelizer);
        View read5 = read(ZHER2K.write.layoutToWallet);
        onGetStartedClick.IconCompatParcelizer((Object) read5, "layoutToWallet");
        TextView textView3 = (TextView) read5.findViewById(ZHER2K.write.tvToAmount);
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "layoutToWallet.tvToAmount");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String format = String.format("%s %s %s", Arrays.copyOf(new Object[]{getString(R.string.prepaid_travel_conversion_landing_you_have), list.get(0).read, list.get(0).IconCompatParcelizer}, 3));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView3.setText(format);
    }

    public final void write() {
        View read2 = read(ZHER2K.write.layoutFromAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "this");
        read(read2);
        View read3 = read(ZHER2K.write.layoutToAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read3, "this");
        read(read3);
    }

    private static void read(View view) {
        ((AmountEditText) view.findViewById(ZHER2K.write.edtAmountValue)).clearFocus();
        ((AmountEditText) view.findViewById(ZHER2K.write.edtAmountValue)).setText("");
        AmountEditText amountEditText = (AmountEditText) view.findViewById(ZHER2K.write.edtAmountValue);
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "edtAmountValue");
        amountEditText.setHint("0.00");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        AppCompatButton appCompatButton = (AppCompatButton) read(ZHER2K.write.btnReview);
        onGetStartedClick.IconCompatParcelizer((Object) appCompatButton, "btnReview");
        appCompatButton.setEnabled(z);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "currency");
        TextView textView = (TextView) read(ZHER2K.write.tvCurrencyRemarks);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvCurrencyRemarks");
        textView.setVisibility(0);
        TextView textView2 = (TextView) read(ZHER2K.write.tvCurrencyRemarks);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvCurrencyRemarks");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = getString(R.string.prepaid_travel_conversion_landing_currency_remark);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…_landing_currency_remark)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView2.setText(format);
    }

    @OnClick
    public final void onClickButtonReview() {
        ImmutableList immutableList;
        View read2 = read(ZHER2K.write.layoutFromAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutFromAmount");
        AmountEditText amountEditText = (AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue);
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "layoutFromAmount.edtAmountValue");
        boolean z = false;
        String MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(String.valueOf(amountEditText.getText()), ",", "", false);
        View read3 = read(ZHER2K.write.layoutToAmount);
        onGetStartedClick.IconCompatParcelizer((Object) read3, "layoutToAmount");
        AmountEditText amountEditText2 = (AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue);
        onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "layoutToAmount.edtAmountValue");
        String MediaBrowserCompat$CustomActionResultReceiver2 = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(String.valueOf(amountEditText2.getText()), ",", "", false);
        getAddress2FieldName getaddress2fieldname = this.presenter;
        if (getaddress2fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        construct construct = this.MediaSessionCompat$Token;
        if (construct == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingRequest");
        }
        String str = construct.IconCompatParcelizer;
        AutoValue_CrashlyticsReport_Session_Event.Builder builder = this.MediaSessionCompat$ResultReceiverWrapper;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelConversionLandingDisplay");
        }
        onGetStartedClick.write((Object) str, "conversionType");
        onGetStartedClick.write((Object) builder, "prepaidTravelConversionLandingDisplay");
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "fromAmount");
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "toAmount");
        if (getAddress2FieldName.read(MediaBrowserCompat$CustomActionResultReceiver) && getAddress2FieldName.read(MediaBrowserCompat$CustomActionResultReceiver2)) {
            onGetStartedClick.write((Object) str, "conversionType");
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "B")) {
                immutableList = new ImmutableList(builder.MediaBrowserCompat$ItemReceiver, str, builder.write.get(0).IconCompatParcelizer, builder.read.get(0).IconCompatParcelizer, builder.IconCompatParcelizer.get(0).write, Double.parseDouble(MediaBrowserCompat$CustomActionResultReceiver2), Double.parseDouble(MediaBrowserCompat$CustomActionResultReceiver));
            } else {
                immutableList = new ImmutableList(builder.MediaBrowserCompat$ItemReceiver, str, builder.write.get(0).IconCompatParcelizer, builder.read.get(0).IconCompatParcelizer, builder.IconCompatParcelizer.get(0).write, Double.parseDouble(MediaBrowserCompat$CustomActionResultReceiver), Double.parseDouble(MediaBrowserCompat$CustomActionResultReceiver2));
            }
            onGetStartedClick.write((Object) immutableList, "prepaidTravelConversionVerificationRequest");
            if (getaddress2fieldname.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getaddress2fieldname.RatingCompat.AlertController$RecycleListView();
            }
            Lists.AbstractListWrapper abstractListWrapper = getaddress2fieldname.read;
            FundFactSheetActivity getaddress2fieldname_mediabrowsercompat_itemreceiver = new getAddress2FieldName$MediaBrowserCompat$ItemReceiver(getaddress2fieldname, immutableList);
            FundFactSheetActivity getaddress2fieldname_mediabrowsercompat_customactionresultreceiver = new C9952xddd5679e(getaddress2fieldname);
            onGetStartedClick.write((Object) getaddress2fieldname_mediabrowsercompat_itemreceiver, "onSuccess");
            onGetStartedClick.write((Object) getaddress2fieldname_mediabrowsercompat_customactionresultreceiver, "onError");
            onGetStartedClick.write((Object) immutableList, "request");
            abstractListWrapper.IconCompatParcelizer(abstractListWrapper.MediaBrowserCompat$CustomActionResultReceiver, getaddress2fieldname_mediabrowsercompat_itemreceiver, getaddress2fieldname_mediabrowsercompat_customactionresultreceiver, new badElementIndex.read(immutableList));
        }
    }

    public final void read(setDiskSpace setdiskspace, boolean z) {
        onGetStartedClick.write((Object) setdiskspace, "prepaidTravelConversionVerification");
        String str = z ? "planetscb_buy_review" : "planetscb_sell_review";
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.read("source", str);
        getKernelIDDstAtop getkerneliddstatop2 = this.MediaDescriptionCompat;
        if (getkerneliddstatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_review");
        C5695xef24dc42 prepaidTravelConversionReviewActivity$MediaBrowserCompat$ItemReceiver = PrepaidTravelConversionReviewActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) setdiskspace, "verification");
        Intent putExtra = new Intent(context, PrepaidTravelConversionReviewActivity.class).putExtra("EXTRA_IS_BUY", z).putExtra("EXTRA_CONVERSION_VERIFICATION", setdiskspace);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidT…RIFICATION, verification)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 1899);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        Intent read2 = PrepaidDetailsActivity.read((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1899 == i && i2 == -1) {
            write();
            getAddress2FieldName getaddress2fieldname = this.presenter;
            if (getaddress2fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            View read2 = read(ZHER2K.write.layoutFromAmount);
            onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutFromAmount");
            AmountEditText amountEditText = (AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue);
            onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "layoutFromAmount.edtAmountValue");
            String valueOf = String.valueOf(amountEditText.getText());
            View read3 = read(ZHER2K.write.layoutToAmount);
            onGetStartedClick.IconCompatParcelizer((Object) read3, "layoutToAmount");
            AmountEditText amountEditText2 = (AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue);
            onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "layoutToAmount.edtAmountValue");
            getaddress2fieldname.IconCompatParcelizer(valueOf, String.valueOf(amountEditText2.getText()));
        }
    }

    public final void onDestroy() {
        getAddress2FieldName getaddress2fieldname = this.presenter;
        if (getaddress2fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress2fieldname.onDestroy();
        super.onDestroy();
    }
}
