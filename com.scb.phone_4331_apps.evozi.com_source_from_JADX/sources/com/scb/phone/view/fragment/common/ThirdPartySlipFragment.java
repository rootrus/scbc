package com.scb.phone.view.fragment.common;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.scb.phone.view.fragment.PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import java.util.List;
import p040o.BankingServicesDeepLinkActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingCheckedFuture;
import p040o.FragmentBuilder_BindDirectDebitSuccessFragment;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindDiscoverFundFilterFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProcMapEntry;
import p040o.TransferService;
import p040o.TypeAdapters;
import p040o.TypeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getTopEdgeTearHeight;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class ThirdPartySlipFragment extends PurchaseSuccessFragment implements getTopEdgeTearHeight {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    /* access modifiers changed from: private */
    public Bitmap MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public standardStartAndWait MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public Throwable RatingCompat;
    @HmlPinActivity
    public TypeAdapters.C388010 successPresenter;

    static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ ThirdPartySlipFragment MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(ThirdPartySlipFragment thirdPartySlipFragment, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = thirdPartySlipFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$CustomActionResultReceiver);
            Bitmap IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            if (IconCompatParcelizer != null) {
                IconCompatParcelizer.recycle();
            }
            TypeAdapters.C388010 r3 = this.MediaBrowserCompat$ItemReceiver.successPresenter;
            if (r3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
            }
            r3.read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    static final class MediaDescriptionCompat<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ ThirdPartySlipFragment MediaBrowserCompat$CustomActionResultReceiver;

        MediaDescriptionCompat(ThirdPartySlipFragment thirdPartySlipFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = thirdPartySlipFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write((Throwable) obj);
        }
    }

    static final class RatingCompat<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ boolean read;
        private /* synthetic */ ThirdPartySlipFragment write;

        RatingCompat(ThirdPartySlipFragment thirdPartySlipFragment, boolean z) {
            this.write = thirdPartySlipFragment;
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.IconCompatParcelizer(((Uri) obj).toString(), this.read);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ ThirdPartySlipFragment read;

        write(ThirdPartySlipFragment thirdPartySlipFragment) {
            this.read = thirdPartySlipFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.read.RatingCompat = (Throwable) obj;
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        standardStartAndWait standardstartandwait = (standardStartAndWait) simpleForwardingCheckedFuture;
        TypeAdapters.C388010 r0 = this.successPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new TypeAdapters.C388010.write(r0, z, standardstartandwait, z2);
        if (r0.RatingCompat != null) {
            write2.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        TypeAdapters.C388010 r0 = this.successPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        r0.MediaBrowserCompat$ItemReceiver(this);
        MediaSessionCompat$ResultReceiverWrapper();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [o.TypeAdapters$11] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            super.onViewCreated(r13, r14)
            android.os.Bundle r13 = r12.getArguments()
            if (r13 == 0) goto L_0x00de
            java.lang.String r14 = "KEY_THIRD_PARTY_SLIP_DISPLAY_ID"
            boolean r13 = r13.containsKey(r14)
            r0 = 1
            if (r13 != r0) goto L_0x00de
            o.TypeAdapters$10 r13 = r12.successPresenter
            if (r13 != 0) goto L_0x0020
            java.lang.String r1 = "successPresenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0020:
            android.os.Bundle r1 = r12.getArguments()
            if (r1 == 0) goto L_0x002d
            android.os.Parcelable r14 = r1.getParcelable(r14)
            o.CycleDetector$Dep r14 = (p040o.CycleDetector.Dep) r14
            goto L_0x002e
        L_0x002d:
            r14 = 0
        L_0x002e:
            r1 = 0
            if (r14 == 0) goto L_0x00c3
            o.TypeAdapters$10$read r2 = p040o.TypeAdapters.C388010.read.read
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r3 = r13.RatingCompat
            if (r3 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = r1
        L_0x003b:
            if (r0 == 0) goto L_0x0042
            T r0 = r13.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x0042:
            o.requestLocationUpdates r0 = r14.IconCompatParcelizer
            o.requestLocationUpdates r1 = p040o.requestLocationUpdates.DISPLAY
            java.lang.String r2 = "onError"
            java.lang.String r3 = "onSuccess"
            java.lang.String r4 = "id"
            if (r0 != r1) goto L_0x0085
            o.unmodifiableIterator r0 = r13.IconCompatParcelizer
            java.lang.String r14 = r14.write
            o.TypeAdapters$10 r13 = (p040o.TypeAdapters.C388010) r13
            o.TypeAdapters$10$MediaBrowserCompat$MediaItem r1 = new o.TypeAdapters$10$MediaBrowserCompat$MediaItem
            r1.<init>(r13)
            r6 = r1
            o.FundFactSheetActivity r6 = (p040o.FundFactSheetActivity) r6
            o.TypeAdapters$10$RatingCompat r1 = new o.TypeAdapters$10$RatingCompat
            r1.<init>(r13)
            r7 = r1
            o.FundFactSheetActivity r7 = (p040o.FundFactSheetActivity) r7
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r4)
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r3)
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r2)
            o.installIfNeededAsync r5 = r0.read
            o.installIfNeededAsync$MediaBrowserCompat$ItemReceiver r13 = new o.installIfNeededAsync$MediaBrowserCompat$ItemReceiver
            r13.<init>(r14)
            r8 = r13
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r8 = (p040o.C4602xca7af99c) r8
            o.unmodifiableIterator$IconCompatParcelizer r13 = new o.unmodifiableIterator$IconCompatParcelizer
            r13.<init>(r0)
            r9 = r13
            o.FundFactSheetActivity r9 = (p040o.FundFactSheetActivity) r9
            o.ChequeInquiryDeepLinkActivity r10 = r0.MediaBrowserCompat$ItemReceiver
            r5.read(r6, r7, r8, r9, r10)
            return
        L_0x0085:
            o.Iterators$11 r0 = r13.read
            java.lang.String r1 = r14.write
            o.requestLocationUpdates r14 = r14.IconCompatParcelizer
            o.TypeAdapters$10 r13 = (p040o.TypeAdapters.C388010) r13
            o.TypeAdapters$10$MediaMetadataCompat r5 = new o.TypeAdapters$10$MediaMetadataCompat
            r5.<init>(r13)
            r7 = r5
            o.FundFactSheetActivity r7 = (p040o.FundFactSheetActivity) r7
            o.TypeAdapters$10$MediaBrowserCompat$SearchResultReceiver r5 = new o.TypeAdapters$10$MediaBrowserCompat$SearchResultReceiver
            r5.<init>(r13)
            r8 = r5
            o.FundFactSheetActivity r8 = (p040o.FundFactSheetActivity) r8
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            java.lang.String r13 = "function"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r13)
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r3)
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r2)
            o.ProviderInstaller r6 = r0.read
            o.ProviderInstaller$read r13 = new o.ProviderInstaller$read
            r13.<init>(r1, r14)
            r9 = r13
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r9 = (p040o.C4602xca7af99c) r9
            o.Iterators$11$write r13 = new o.Iterators$11$write
            r13.<init>(r0)
            r10 = r13
            o.FundFactSheetActivity r10 = (p040o.FundFactSheetActivity) r10
            o.ChequeInquiryDeepLinkActivity r11 = r0.MediaBrowserCompat$ItemReceiver
            r6.read(r7, r8, r9, r10, r11)
            return
        L_0x00c3:
            o.TypeAdapters$10$MediaDescriptionCompat r14 = p040o.TypeAdapters.C388010.MediaDescriptionCompat.IconCompatParcelizer
            o.FundFactSheetActivity r14 = (p040o.FundFactSheetActivity) r14
            if (r14 == 0) goto L_0x00cf
            o.TypeAdapters$11 r2 = new o.TypeAdapters$11
            r2.<init>()
            r14 = r2
        L_0x00cf:
            o.writeUInt64NoTag$IconCompatParcelizer r14 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r14
            T r2 = r13.RatingCompat
            if (r2 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00de
            T r13 = r13.RatingCompat
            r14.IconCompatParcelizer(r13)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.common.ThirdPartySlipFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        this.MediaBrowserCompat$SearchResultReceiver = standardstartandwait;
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
        String string = getString(R.string.return_to_account_summary);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.return_to_account_summary)");
        onGetStartedClick.write((Object) string, "returnButton");
        TextView textView = this.buttonReturn;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "buttonReturn");
        textView.setText(string);
        TypeAdapters.C388010 r0 = this.successPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        r0.read(standardstartandwait);
    }

    public final void IconCompatParcelizer(standardStartAndWait standardstartandwait, int i) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver = new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter);
        PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = new PurchaseSuccessFragment.PurchaseScreenshotDisplay(i, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, false, this.componentFactory, true);
        purchaseScreenshotDisplay.IconCompatParcelizer = true;
        this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitSuccessFragment(purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver, purchaseScreenshotDisplay, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new C5898x9ee8ad7c(this), new write(this));
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        TypeAdapters.C388010 r0 = this.successPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new TypeAdapters.C388010.write(r0, z, standardstartandwait, z2);
        if (r0.RatingCompat != null) {
            write2.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void write(Bitmap bitmap, standardStartAndWait standardstartandwait, boolean z) {
        onGetStartedClick.write((Object) bitmap, "bitmapCache");
        new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter);
        PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = new PurchaseSuccessFragment.PurchaseScreenshotDisplay(MediaSessionCompat$QueueItem(), standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, false, this.componentFactory, true);
        purchaseScreenshotDisplay.IconCompatParcelizer = true;
        this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDiscoverFundFilterFragment(bitmap, purchaseScreenshotDisplay, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new IconCompatParcelizer(this, z), new ThirdPartySlipFragment$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void IconCompatParcelizer(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        write(this.RatingCompat);
    }

    public final void IconCompatParcelizer(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        TypeAdapters.C388010 r0 = this.successPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        Bitmap bitmap = this.MediaBrowserCompat$MediaItem;
        Throwable th = this.RatingCompat;
        boolean z3 = true;
        if (bitmap != null) {
            writeUInt64NoTag.IconCompatParcelizer typeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver = new TypeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver(bitmap, standardstartandwait, z, z2);
            if (r0.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                typeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(r0.RatingCompat);
            }
        } else if (th != null) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new TypeAdapters.C388010.IconCompatParcelizer(th);
            if (r0.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                iconCompatParcelizer.IconCompatParcelizer(r0.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, HomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            activity.finish();
        }
    }

    @OnClick
    public final void onClickReturnButton() {
        HomeActivity.write(getContext(), true);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, "returnButton");
        TextView textView = this.buttonReturn;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "buttonReturn");
        textView.setText(str);
    }

    public final void onDestroyView() {
        TypeAdapters.C388010 r0 = this.successPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        r0.onDestroy();
        super.onDestroyView();
    }

    public final void read(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        if (standardstartandwait != null) {
            ProcMapEntry procMapEntry = standardstartandwait.ParcelableVolumeInfo;
            if (procMapEntry == null) {
                procMapEntry = ProcMapEntry.DEFAULT;
            }
            int i = TransferService.MediaBrowserCompat$CustomActionResultReceiver[procMapEntry.ordinal()] != 1 ? R.layout.f91692131494396 : R.layout.f91732131494400;
            PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver = new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter);
            PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = new PurchaseSuccessFragment.PurchaseScreenshotDisplay(i, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, z, this.componentFactory, z2);
            purchaseScreenshotDisplay.IconCompatParcelizer = true;
            this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver, purchaseScreenshotDisplay, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new RatingCompat(this, z), new MediaDescriptionCompat(this));
        }
    }
}
