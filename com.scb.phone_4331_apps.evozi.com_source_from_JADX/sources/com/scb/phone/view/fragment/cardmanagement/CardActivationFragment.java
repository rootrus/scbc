package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import p040o.C3380xf378811a;
import p040o.C7270xd74a7180;
import p040o.FirebaseApp;
import p040o.FirebaseVisionBarcodeDetectorOptions;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.notifyBackgroundStateChangeListeners;
import p040o.sendOta;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeFIDCreateRequestBodyToOutputStream;
import p040o.zzxr;
import p040o.zzxr$MediaBrowserCompat$CustomActionResultReceiver;

public class CardActivationFragment extends BaseFragment implements C7270xd74a7180 {
    private getAdditionalBottomScanLinesHeight IconCompatParcelizer;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public write MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public String MediaMetadataCompat;
    @BindView
    DefaultButton btnActivate;
    @BindView
    TextView cardFirstFourDigit;
    @BindView
    TextView cardLastFourDigit;
    @BindView
    TextView cardSecondTwoDigit;
    @BindView
    ImageView imvCreditCard;
    @HmlPinActivity
    public FirebaseVisionBarcodeDetectorOptions.Builder presenter;
    @BindView
    ViewGroup vgMonth;
    @BindView
    ViewGroup vgYear;

    public interface write {
        void IconCompatParcelizer(String str);

        void RatingCompat(String str);

        void read(notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners);

        void write(String str);
    }

    enum read {
        YEAR,
        MONTH
    }

    public static CardActivationFragment IconCompatParcelizer(notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners) {
        CardActivationFragment cardActivationFragment = new CardActivationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_INACTIVE_CARD", notifybackgroundstatechangelisteners);
        cardActivationFragment.setArguments(bundle);
        return cardActivationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f85952131493822, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setTransitioning();
        notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners = (notifyBackgroundStateChangeListeners) getActivity().getIntent().getParcelableExtra("EXTRA_INACTIVE_CARD");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        FirebaseVisionBarcodeDetectorOptions.Builder builder = this.presenter;
        if (notifybackgroundstatechangelisteners.IconCompatParcelizer != null) {
            str = notifybackgroundstatechangelisteners.IconCompatParcelizer;
        } else {
            str = notifybackgroundstatechangelisteners.MediaBrowserCompat$ItemReceiver;
        }
        String replaceAll = str.replaceAll(" ", "");
        FirebaseApp.C33701 r2 = new Object() {
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public String read;
        };
        r2.read = replaceAll.substring(0, 4);
        r2.MediaBrowserCompat$CustomActionResultReceiver = replaceAll.substring(4, 6);
        r2.MediaBrowserCompat$ItemReceiver = replaceAll.substring(replaceAll.length() - 4);
        writeFIDCreateRequestBodyToOutputStream writefidcreaterequestbodytooutputstream = new writeFIDCreateRequestBodyToOutputStream(r2);
        boolean z = true;
        if (builder.RatingCompat != null) {
            writefidcreaterequestbodytooutputstream.IconCompatParcelizer(builder.RatingCompat);
        }
        this.IconCompatParcelizer = (getAdditionalBottomScanLinesHeight) getActivity();
        write write2 = (write) getActivity();
        this.MediaDescriptionCompat = write2;
        write2.read(notifybackgroundstatechangelisteners);
        this.presenter.read = notifybackgroundstatechangelisteners;
        FirebaseVisionBarcodeDetectorOptions.Builder builder2 = this.presenter;
        if (builder2.RatingCompat != null) {
            builder2.RatingCompat.AlertController$RecycleListView();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzxr(builder2.read.MediaBrowserCompat$ItemReceiver, new zzxr$MediaBrowserCompat$CustomActionResultReceiver(builder2.read.write)));
        builder2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new Object(arrayList) {
            private List<zzxr> read;
        });
        builder2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C3380xf378811a(builder2, (byte) 0));
        FirebaseVisionBarcodeDetectorOptions.Builder builder3 = this.presenter;
        if (builder3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            builder3.RatingCompat.AlertController$RecycleListView();
        }
        builder3.MediaBrowserCompat$ItemReceiver.read(builder3.read.MediaBrowserCompat$ItemReceiver);
        builder3.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new FirebaseVisionBarcodeDetectorOptions.Builder.write(builder3, (byte) 0));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(FirebaseApp.C33701 r5) {
        this.cardFirstFourDigit.setText(r5.read);
        this.cardSecondTwoDigit.setText(r5.MediaBrowserCompat$CustomActionResultReceiver);
        this.cardLastFourDigit.setText(r5.MediaBrowserCompat$ItemReceiver);
        this.btnActivate.setButtonEnabled(false);
        Spinner spinner = (Spinner) this.vgYear.findViewById(R.id.spinner);
        spinner.setAdapter(new sendOta((Context) getActivity(), FirebaseVisionBarcodeDetectorOptions.Builder.IconCompatParcelizer()));
        final read read2 = read.YEAR;
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                String str;
                boolean z = false;
                if (i == 0) {
                    ((TextView) adapterView.getChildAt(0)).setTextColor(setLastBaselineToBottomHeight.read(CardActivationFragment.this.getActivity(), R.color.f66402131099796));
                    return;
                }
                int i2 = C58685.MediaBrowserCompat$ItemReceiver[r0.ordinal()];
                if (i2 == 1) {
                    String unused = CardActivationFragment.this.MediaMetadataCompat = adapterView.getSelectedItem().toString();
                    CardActivationFragment.this.presenter.write = CardActivationFragment.this.MediaMetadataCompat;
                    CardActivationFragment.this.MediaDescriptionCompat.IconCompatParcelizer(CardActivationFragment.this.MediaMetadataCompat);
                } else if (i2 == 2) {
                    String unused2 = CardActivationFragment.this.MediaBrowserCompat$CustomActionResultReceiver = adapterView.getSelectedItem().toString();
                    CardActivationFragment.this.presenter.IconCompatParcelizer = CardActivationFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                    CardActivationFragment.this.MediaDescriptionCompat.write(CardActivationFragment.this.MediaBrowserCompat$CustomActionResultReceiver);
                }
                DefaultButton defaultButton = CardActivationFragment.this.btnActivate;
                FirebaseVisionBarcodeDetectorOptions.Builder builder = CardActivationFragment.this.presenter;
                int i3 = GregorianCalendar.getInstance().get(1);
                int i4 = GregorianCalendar.getInstance().get(2);
                if (!(builder.IconCompatParcelizer == null || (str = builder.write) == null || (Integer.parseInt(str) == i3 && Integer.parseInt(builder.IconCompatParcelizer) < i4 + 1))) {
                    z = true;
                }
                defaultButton.setButtonEnabled(z);
            }
        });
        Spinner spinner2 = (Spinner) this.vgMonth.findViewById(R.id.spinner);
        spinner2.setAdapter(new sendOta((Context) getActivity(), (T[]) getResources().getStringArray(R.array.f64822130903061)));
        final read read3 = read.MONTH;
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                String str;
                boolean z = false;
                if (i == 0) {
                    ((TextView) adapterView.getChildAt(0)).setTextColor(setLastBaselineToBottomHeight.read(CardActivationFragment.this.getActivity(), R.color.f66402131099796));
                    return;
                }
                int i2 = C58685.MediaBrowserCompat$ItemReceiver[read3.ordinal()];
                if (i2 == 1) {
                    String unused = CardActivationFragment.this.MediaMetadataCompat = adapterView.getSelectedItem().toString();
                    CardActivationFragment.this.presenter.write = CardActivationFragment.this.MediaMetadataCompat;
                    CardActivationFragment.this.MediaDescriptionCompat.IconCompatParcelizer(CardActivationFragment.this.MediaMetadataCompat);
                } else if (i2 == 2) {
                    String unused2 = CardActivationFragment.this.MediaBrowserCompat$CustomActionResultReceiver = adapterView.getSelectedItem().toString();
                    CardActivationFragment.this.presenter.IconCompatParcelizer = CardActivationFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                    CardActivationFragment.this.MediaDescriptionCompat.write(CardActivationFragment.this.MediaBrowserCompat$CustomActionResultReceiver);
                }
                DefaultButton defaultButton = CardActivationFragment.this.btnActivate;
                FirebaseVisionBarcodeDetectorOptions.Builder builder = CardActivationFragment.this.presenter;
                int i3 = GregorianCalendar.getInstance().get(1);
                int i4 = GregorianCalendar.getInstance().get(2);
                if (!(builder.IconCompatParcelizer == null || (str = builder.write) == null || (Integer.parseInt(str) == i3 && Integer.parseInt(builder.IconCompatParcelizer) < i4 + 1))) {
                    z = true;
                }
                defaultButton.setButtonEnabled(z);
            }
        });
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onActivateClick() {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG", (String) null, (String) null);
    }

    /* renamed from: com.scb.phone.view.fragment.cardmanagement.CardActivationFragment$5 */
    static /* synthetic */ class C58685 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.scb.phone.view.fragment.cardmanagement.CardActivationFragment$read[] r0 = com.scb.phone.view.fragment.cardmanagement.CardActivationFragment.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                com.scb.phone.view.fragment.cardmanagement.CardActivationFragment$read r1 = com.scb.phone.view.fragment.cardmanagement.CardActivationFragment.read.YEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scb.phone.view.fragment.cardmanagement.CardActivationFragment$read r1 = com.scb.phone.view.fragment.cardmanagement.CardActivationFragment.read.MONTH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.cardmanagement.CardActivationFragment.C58685.<clinit>():void");
        }
    }

    public final void read() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.already_activated_title);
        access_2200.IconCompatParcelizer = getString(R.string.already_activated_message);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.NAVIGATE_BACK;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void read(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.MediaDescriptionCompat.RatingCompat(str);
            FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer2 = Picasso.read().write(str).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card);
            IconCompatParcelizer2.write = true;
            IconCompatParcelizer2.read(this.imvCreditCard, (FragmentBuilder_BindEkycFragment) null);
        }
    }
}
