package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import java.text.NumberFormat;
import java.util.Locale;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CreditCardCaptureModule_GetLookAndFeelParametersFactory;
import p040o.FirebaseVisionBarcodeDetectorOptions;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.ThreadFactoryBuilder;
import p040o.TimeLimiter;
import p040o.UncaughtExceptionHandlers;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getICheckDeserializerRtti;
import p040o.getUpdatesDownloadConditions;
import p040o.logEventNoInterceptor;
import p040o.logFisCommunicationError;
import p040o.newTreeMap;
import p040o.parseTokenExpirationTimestamp;
import p040o.readCreateResponse;
import p040o.readErrorResponse;
import p040o.setUncaughtExceptionHandler;

public class ActivationSuccessfulFragment extends BaseFragment implements CreditCardCaptureModule_GetLookAndFeelParametersFactory {
    @BindView
    ImageView imvCreditCard;
    @HmlPinActivity
    public FirebaseVisionBarcodeDetectorOptions presenter;
    @BindView
    TextView txvActivationDate;
    @BindView
    TextView txvCardAdded;
    @BindView
    TextView txvCardLimit;
    @BindView
    TextView txvFirst4DNo;
    @BindView
    TextView txvLast4DNo;
    @BindView
    TextView txvMaskedCardNo;
    @BindView
    TextView txvSecond2DNo;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85582131493785, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        ThreadFactoryBuilder.C38611 r10 = (ThreadFactoryBuilder.C38611) getActivity().getIntent().getParcelableExtra("ActivationSuccessfulActivity.KEY_ACTIVATION_DTO");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions = this.presenter;
        newTreeMap newtreemap = firebaseVisionBarcodeDetectorOptions.MediaBrowserCompat$ItemReceiver;
        UncaughtExceptionHandlers.Exiter exiter = new UncaughtExceptionHandlers.Exiter();
        exiter.write = getICheckDeserializerRtti.IconCompatParcelizer(r10.MediaBrowserCompat$CustomActionResultReceiver, r10.MediaDescriptionCompat);
        if (r10.MediaDescriptionCompat != null) {
            str = r10.MediaDescriptionCompat.substring(0, 4);
        } else {
            str = r10.MediaBrowserCompat$CustomActionResultReceiver.substring(0, 4);
        }
        exiter.read = str;
        if (r10.MediaDescriptionCompat != null) {
            str2 = r10.MediaDescriptionCompat.replace(" ", "").substring(4, 6);
        } else {
            str2 = r10.MediaBrowserCompat$CustomActionResultReceiver.replace(" ", "").substring(4, 6);
        }
        exiter.MediaBrowserCompat$ItemReceiver = str2;
        if (r10.MediaDescriptionCompat != null) {
            str3 = r10.MediaDescriptionCompat.substring(r10.MediaDescriptionCompat.length() - 4);
        } else {
            str3 = r10.MediaBrowserCompat$CustomActionResultReceiver.substring(r10.MediaBrowserCompat$CustomActionResultReceiver.length() - 4);
        }
        exiter.IconCompatParcelizer = str3;
        String IconCompatParcelizer = newtreemap.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(r10.write));
        setUncaughtExceptionHandler setuncaughtexceptionhandler = new setUncaughtExceptionHandler();
        setuncaughtexceptionhandler.IconCompatParcelizer = IconCompatParcelizer;
        double d = r10.MediaMetadataCompat;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        setuncaughtexceptionhandler.MediaMetadataCompat = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(d);
        setuncaughtexceptionhandler.write = exiter;
        setuncaughtexceptionhandler.MediaBrowserCompat$CustomActionResultReceiver = r10.IconCompatParcelizer;
        setuncaughtexceptionhandler.MediaBrowserCompat$ItemReceiver = r10.MediaBrowserCompat$ItemReceiver;
        setuncaughtexceptionhandler.read = r10.read;
        logFisCommunicationError logfiscommunicationerror = new logFisCommunicationError(setuncaughtexceptionhandler);
        if (firebaseVisionBarcodeDetectorOptions.RatingCompat != null) {
            logfiscommunicationerror.IconCompatParcelizer(firebaseVisionBarcodeDetectorOptions.RatingCompat);
        }
        if (!setuncaughtexceptionhandler.MediaBrowserCompat$ItemReceiver) {
            getUpdatesDownloadConditions getupdatesdownloadconditions = getUpdatesDownloadConditions.IconCompatParcelizer;
            if (firebaseVisionBarcodeDetectorOptions.RatingCompat != null) {
                getupdatesdownloadconditions.IconCompatParcelizer(firebaseVisionBarcodeDetectorOptions.RatingCompat);
            }
            readCreateResponse readcreateresponse = new readCreateResponse(setuncaughtexceptionhandler.read);
            if (firebaseVisionBarcodeDetectorOptions.RatingCompat != null) {
                z = true;
            }
            if (z) {
                readcreateresponse.IconCompatParcelizer(firebaseVisionBarcodeDetectorOptions.RatingCompat);
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(setUncaughtExceptionHandler setuncaughtexceptionhandler) {
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(setuncaughtexceptionhandler.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card);
        IconCompatParcelizer.write = true;
        IconCompatParcelizer.read(this.imvCreditCard, (FragmentBuilder_BindEkycFragment) null);
        this.txvActivationDate.setText(setuncaughtexceptionhandler.IconCompatParcelizer);
        this.txvMaskedCardNo.setText(setuncaughtexceptionhandler.write.write);
        this.txvCardLimit.setText(setuncaughtexceptionhandler.MediaMetadataCompat);
        this.txvFirst4DNo.setText(setuncaughtexceptionhandler.write.read);
        this.txvSecond2DNo.setText(setuncaughtexceptionhandler.write.MediaBrowserCompat$ItemReceiver);
        this.txvLast4DNo.setText(setuncaughtexceptionhandler.write.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.txvCardAdded.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(TimeLimiter timeLimiter) {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = timeLimiter.MediaBrowserCompat$ItemReceiver;
        access_2200.IconCompatParcelizer = timeLimiter.read;
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void read() {
        HomeActivity.write(getContext(), true);
    }

    @OnClick
    public void onAccountsClick() {
        FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions = this.presenter;
        logEventNoInterceptor logeventnointerceptor = firebaseVisionBarcodeDetectorOptions.IconCompatParcelizer;
        logeventnointerceptor.read(logeventnointerceptor.read(), new parseTokenExpirationTimestamp(firebaseVisionBarcodeDetectorOptions), new readErrorResponse(firebaseVisionBarcodeDetectorOptions));
    }
}
