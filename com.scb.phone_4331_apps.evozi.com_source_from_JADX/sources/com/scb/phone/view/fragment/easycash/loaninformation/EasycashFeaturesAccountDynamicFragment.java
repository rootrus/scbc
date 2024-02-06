package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import p040o.Bill;
import p040o.BytesBackedNativeSessionFile;
import p040o.C6960x24be0e72;
import p040o.C7123xc5801eb7;
import p040o.C9965x2dc738e5;
import p040o.CrashlyticsReport;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.Iterables;
import p040o.Iterables$ConsumingQueueIterator$MediaBrowserCompat$ItemReceiver;
import p040o.NativeSessionFileProvider;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.asFilePayload;
import p040o.clearValue;
import p040o.convertLongToTwoByteBuffer;
import p040o.forEachClear;
import p040o.getBatteryLevel;
import p040o.getBatteryVelocity;
import p040o.getFileBufferLength;
import p040o.getFileBufferLength$MediaBrowserCompat$ItemReceiver;
import p040o.getFileBufferLength$MediaBrowserCompat$SearchResultReceiver;
import p040o.getReportsEndpointFilename;
import p040o.getRtpEBillPaymentReview;
import p040o.getStream;
import p040o.onGetStartedClick;
import p040o.onSharedPreferenceChanged;
import p040o.populateSequenceNumber;
import p040o.populateTime;
import p040o.setActive;
import p040o.subscribe;
import p040o.writeUInt64NoTag;
import p040o.zzcb;
import p040o.zzev;
import p040o.zzfb;

public final class EasycashFeaturesAccountDynamicFragment extends BreadcrumbFragment implements Bill {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    private IOrientationGuidanceCalculator IconCompatParcelizer;
    private getRtpEBillPaymentReview MediaBrowserCompat$MediaItem;
    private final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer(this);
    @BindView
    public Button btnNext;
    @HmlPinActivity
    public getFileBufferLength presenter;
    @BindView
    public RecyclerView recyclerView;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86962131493923, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        this.MediaBrowserCompat$MediaItem = new getRtpEBillPaymentReview(this.MediaBrowserCompat$SearchResultReceiver);
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        getRtpEBillPaymentReview getrtpebillpaymentreview = this.MediaBrowserCompat$MediaItem;
        if (getrtpebillpaymentreview == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        recyclerView2.setAdapter(getrtpebillpaymentreview);
        boolean z = false;
        recyclerView2.setNestedScrollingEnabled(false);
        getFileBufferLength getfilebufferlength = this.presenter;
        if (getfilebufferlength == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getfilebufferlength.MediaBrowserCompat$ItemReceiver(this);
        getFileBufferLength getfilebufferlength2 = this.presenter;
        if (getfilebufferlength2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("easycashInterface");
        }
        String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$SearchResultReceiver2, "easycashInterface.productType");
        onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver2, "productType");
        getfilebufferlength2.write = MediaBrowserCompat$SearchResultReceiver2;
        if (getfilebufferlength2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getfilebufferlength2.RatingCompat.AlertController$RecycleListView();
        }
        Iterables.ConsumingQueueIterator consumingQueueIterator = getfilebufferlength2.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity getfilebufferlength_mediabrowsercompat_itemreceiver = new getFileBufferLength$MediaBrowserCompat$ItemReceiver(getfilebufferlength2);
        FundFactSheetActivity iconCompatParcelizer = new getFileBufferLength.IconCompatParcelizer(getfilebufferlength2);
        onGetStartedClick.write((Object) getfilebufferlength_mediabrowsercompat_itemreceiver, "display");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver2, "productType");
        consumingQueueIterator.MediaBrowserCompat$ItemReceiver(consumingQueueIterator.MediaBrowserCompat$CustomActionResultReceiver, getfilebufferlength_mediabrowsercompat_itemreceiver, iconCompatParcelizer, new setActive.IconCompatParcelizer(MediaBrowserCompat$SearchResultReceiver2, (String) null), new Iterables$ConsumingQueueIterator$MediaBrowserCompat$ItemReceiver(consumingQueueIterator));
    }

    public final void IconCompatParcelizer(List<? extends getReportsEndpointFilename> list) {
        onGetStartedClick.write((Object) list, "listItem");
        getRtpEBillPaymentReview getrtpebillpaymentreview = this.MediaBrowserCompat$MediaItem;
        if (getrtpebillpaymentreview == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        onGetStartedClick.write((Object) list, "listItem");
        getrtpebillpaymentreview.read = list;
        getrtpebillpaymentreview.IconCompatParcelizer.write();
    }

    public final void read(int i) {
        getRtpEBillPaymentReview getrtpebillpaymentreview = this.MediaBrowserCompat$MediaItem;
        if (getrtpebillpaymentreview == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        getrtpebillpaymentreview.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
    }

    public final void IconCompatParcelizer() {
        getRtpEBillPaymentReview getrtpebillpaymentreview = this.MediaBrowserCompat$MediaItem;
        if (getrtpebillpaymentreview == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        getrtpebillpaymentreview.IconCompatParcelizer.write();
    }

    public static final class IconCompatParcelizer implements C7123xc5801eb7 {
        private /* synthetic */ EasycashFeaturesAccountDynamicFragment read;

        IconCompatParcelizer(EasycashFeaturesAccountDynamicFragment easycashFeaturesAccountDynamicFragment) {
            this.read = easycashFeaturesAccountDynamicFragment;
        }

        public final void IconCompatParcelizer(getBatteryLevel getbatterylevel) {
            List<getReportsEndpointFilename> list;
            Object obj;
            onGetStartedClick.write((Object) getbatterylevel, "receivingAccount");
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) getbatterylevel, "receivingAccount");
            getfilebufferlength.MediaMetadataCompat = getbatterylevel;
            subscribe subscribe = getbatterylevel.MediaBrowserCompat$ItemReceiver;
            BytesBackedNativeSessionFile bytesBackedNativeSessionFile = getfilebufferlength.read;
            boolean z = false;
            if (!(bytesBackedNativeSessionFile == null || (list = bytesBackedNativeSessionFile.IconCompatParcelizer) == null)) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((getReportsEndpointFilename) obj) instanceof getBatteryVelocity) {
                        break;
                    }
                }
                getReportsEndpointFilename getreportsendpointfilename = (getReportsEndpointFilename) obj;
                if (getreportsendpointfilename != null) {
                    if (getreportsendpointfilename != null) {
                        getBatteryVelocity getbatteryvelocity = (getBatteryVelocity) getreportsendpointfilename;
                        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getbatteryvelocity.MediaBrowserCompat$CustomActionResultReceiver, (Object) subscribe)) {
                            getbatteryvelocity.MediaBrowserCompat$CustomActionResultReceiver = subscribe;
                            writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new getFileBufferLength.MediaDescriptionCompat(list, getreportsendpointfilename);
                            if (getfilebufferlength.RatingCompat != null) {
                                mediaDescriptionCompat.IconCompatParcelizer(getfilebufferlength.RatingCompat);
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.featureaccount.EasycashFeatureAccountDebitCardDisplay");
                    }
                }
            }
            if (getfilebufferlength.read()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFileBufferLength$MediaBrowserCompat$SearchResultReceiver.read;
                if (getfilebufferlength.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getfilebufferlength.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFileBufferLength.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfilebufferlength.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getfilebufferlength.RatingCompat);
            }
        }

        public final void IconCompatParcelizer(CrashlyticsReport.FilesPayload.File.Builder builder) {
            onGetStartedClick.write((Object) builder, "repaymentAccount");
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) builder, "repaymentAccount");
            getfilebufferlength.MediaDescriptionCompat = builder;
            boolean z = true;
            if (getfilebufferlength.read()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFileBufferLength$MediaBrowserCompat$SearchResultReceiver.read;
                if (getfilebufferlength.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getfilebufferlength.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFileBufferLength.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfilebufferlength.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getfilebufferlength.RatingCompat);
            }
        }

        public final void write(String str) {
            onGetStartedClick.write((Object) str, "repaymentMethod");
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "repaymentMethod");
            getfilebufferlength.MediaBrowserCompat$MediaItem = str;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "CASH")) {
                getfilebufferlength.MediaBrowserCompat$SearchResultReceiver = null;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFileBufferLength.read.IconCompatParcelizer;
            boolean z = true;
            if (getfilebufferlength.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getfilebufferlength.RatingCompat);
            }
            if (getfilebufferlength.read()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFileBufferLength$MediaBrowserCompat$SearchResultReceiver.read;
                if (getfilebufferlength.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(getfilebufferlength.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = getFileBufferLength.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfilebufferlength.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(getfilebufferlength.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(NativeSessionFileProvider nativeSessionFileProvider) {
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getfilebufferlength.MediaSessionCompat$ResultReceiverWrapper = nativeSessionFileProvider;
            boolean z = true;
            if (getfilebufferlength.read()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFileBufferLength$MediaBrowserCompat$SearchResultReceiver.read;
                if (getfilebufferlength.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getfilebufferlength.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFileBufferLength.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfilebufferlength.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getfilebufferlength.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            onGetStartedClick.write((Object) str, "repaymentPlan");
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getfilebufferlength.MediaBrowserCompat$SearchResultReceiver = str;
            boolean z = true;
            if (getfilebufferlength.read()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFileBufferLength$MediaBrowserCompat$SearchResultReceiver.read;
                if (getfilebufferlength.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getfilebufferlength.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFileBufferLength.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfilebufferlength.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getfilebufferlength.RatingCompat);
            }
        }

        public final boolean read() {
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getfilebufferlength.MediaBrowserCompat$MediaItem, (Object) "CASH");
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            getFileBufferLength getfilebufferlength = this.read.presenter;
            if (getfilebufferlength == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getfilebufferlength.IconCompatParcelizer = z ? "EMAIL" : "PAPER";
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(true);
    }

    public final void write() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(false);
    }

    @OnClick
    public final void onNextButtonClicked() {
        String str;
        String str2;
        String str3;
        zzev.zza zza;
        zzcb.zzg.zza zza2;
        onSharedPreferenceChanged onsharedpreferencechanged;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        List<zzcb.zzg.zza> list;
        List<getReportsEndpointFilename> list2;
        String str9;
        Iterator it;
        zzfb.zza zza3;
        List<C6960x24be0e72> list3;
        Object obj;
        String str10;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("easycashInterface");
        }
        getFileBufferLength getfilebufferlength = this.presenter;
        if (getfilebufferlength == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$SearchResultReceiver2, "it.productType");
        String read = iOrientationGuidanceCalculator.read();
        if (read == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) read, "it.applicationId!!");
        onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver2, "productType");
        onGetStartedClick.write((Object) read, "appId");
        if (getfilebufferlength.RatingCompat != null) {
            getfilebufferlength.RatingCompat.AlertController$RecycleListView();
        }
        Iterables.ConsumingQueueIterator consumingQueueIterator = getfilebufferlength.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity getfilebufferlength_mediabrowsercompat_customactionresultreceiver = new C9965x2dc738e5(getfilebufferlength);
        FundFactSheetActivity write2 = new getFileBufferLength.write(getfilebufferlength);
        onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver2, "productType");
        onGetStartedClick.write((Object) read, "appId");
        BytesBackedNativeSessionFile bytesBackedNativeSessionFile = getfilebufferlength.read;
        if (bytesBackedNativeSessionFile == null || (list2 = bytesBackedNativeSessionFile.IconCompatParcelizer) == null) {
            onsharedpreferencechanged = null;
            zza2 = null;
            zza = null;
            str3 = null;
            str2 = null;
            str = null;
        } else {
            Iterator it2 = list2.iterator();
            String str11 = null;
            String str12 = null;
            onsharedpreferencechanged = null;
            zza2 = null;
            zza = null;
            str3 = null;
            while (it2.hasNext()) {
                getReportsEndpointFilename getreportsendpointfilename = (getReportsEndpointFilename) it2.next();
                if (getreportsendpointfilename instanceof getStream) {
                    onsharedpreferencechanged = getfilebufferlength.MediaBrowserCompat$CustomActionResultReceiver();
                } else if (getreportsendpointfilename instanceof getBatteryVelocity) {
                    zza2 = getfilebufferlength.read(onsharedpreferencechanged);
                } else if ((getreportsendpointfilename instanceof populateSequenceNumber) || (getreportsendpointfilename instanceof populateTime)) {
                    String str13 = getfilebufferlength.MediaBrowserCompat$MediaItem;
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str13, (Object) "DIRECT_DEBIT")) {
                        BytesBackedNativeSessionFile bytesBackedNativeSessionFile2 = getfilebufferlength.read;
                        if (bytesBackedNativeSessionFile2 == null || (zza3 = bytesBackedNativeSessionFile2.MediaBrowserCompat$ItemReceiver) == null || (list3 = zza3.read) == null) {
                            it = it2;
                            str3 = str13;
                            str9 = str11;
                        } else {
                            Collection arrayList = new ArrayList();
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it2;
                                Object next = it3.next();
                                String str14 = str13;
                                C6960x24be0e72 merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding = (C6960x24be0e72) next;
                                String str15 = str11;
                                Iterator it5 = it3;
                                if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == zzcb.zzh.REPAYMENT_ACCOUNT_DIRECT_CASH || merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == zzcb.zzh.REPAYMENT_ACCOUNT_DIRECT_DEBIT) {
                                    arrayList.add(next);
                                }
                                str13 = str14;
                                it2 = it4;
                                str11 = str15;
                                it3 = it5;
                            }
                            it = it2;
                            str3 = str13;
                            str9 = str11;
                            Iterator it6 = ((List) arrayList).iterator();
                            if (it6.hasNext()) {
                                C6960x24be0e72 merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding2 = (C6960x24be0e72) it6.next();
                                if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding2 != null) {
                                    Iterator it7 = ((zzcb.zzi.zza) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding2).MediaBrowserCompat$ItemReceiver.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it7.next();
                                        String str16 = ((zzev.zza) obj).IconCompatParcelizer;
                                        CrashlyticsReport.FilesPayload.File.Builder builder = getfilebufferlength.MediaDescriptionCompat;
                                        if (builder != null) {
                                            str10 = builder.f2695x50fd9e4a;
                                        } else {
                                            str10 = null;
                                        }
                                        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str16, (Object) str10)) {
                                            break;
                                        }
                                    }
                                    zza = (zzev.zza) obj;
                                    it2 = it;
                                    str11 = str9;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.easycash.features.EasycashDisplayFeatureRepayment");
                                }
                            }
                        }
                        zza = null;
                        it2 = it;
                        str11 = str9;
                    } else {
                        str3 = str13;
                        String str17 = str11;
                    }
                } else if (getreportsendpointfilename instanceof convertLongToTwoByteBuffer) {
                    str11 = getfilebufferlength.MediaBrowserCompat$SearchResultReceiver;
                } else if (getreportsendpointfilename instanceof asFilePayload) {
                    str12 = getfilebufferlength.IconCompatParcelizer;
                }
            }
            str = str11;
            str2 = str12;
        }
        String str18 = onsharedpreferencechanged != null ? onsharedpreferencechanged.IconCompatParcelizer : null;
        if (onsharedpreferencechanged != null) {
            str4 = onsharedpreferencechanged.read;
        } else {
            str4 = null;
        }
        String str19 = onsharedpreferencechanged != null ? onsharedpreferencechanged.MediaBrowserCompat$ItemReceiver : null;
        if (zza2 != null) {
            str5 = zza2.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str5 = null;
        }
        if (zza2 != null) {
            str6 = zza2.MediaBrowserCompat$ItemReceiver;
        } else {
            str6 = null;
        }
        String str20 = zza != null ? zza.IconCompatParcelizer : null;
        if (zza != null) {
            str7 = zza.read;
        } else {
            str7 = null;
        }
        if (zza != null) {
            str8 = zza.MediaBrowserCompat$ItemReceiver;
        } else {
            str8 = null;
        }
        clearValue clearvalue = r4;
        String str21 = "presenter";
        clearValue clearvalue2 = new clearValue(MediaBrowserCompat$SearchResultReceiver2, read, str18, str4, str19, str20, str7, str8, str5, str6, str3, str, str2, (String) null, 8192);
        consumingQueueIterator.MediaBrowserCompat$CustomActionResultReceiver(getfilebufferlength_mediabrowsercompat_customactionresultreceiver, write2, clearvalue2);
        forEachClear foreachclear = this.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        getFileBufferLength getfilebufferlength2 = this.presenter;
        if (getfilebufferlength2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(str21);
        }
        foreachclear.MediaBrowserCompat$CustomActionResultReceiver(getfilebufferlength2.MediaBrowserCompat$MediaItem);
        forEachClear foreachclear2 = this.tracker;
        if (foreachclear2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        getFileBufferLength getfilebufferlength3 = this.presenter;
        if (getfilebufferlength3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(str21);
        }
        String str22 = getfilebufferlength3.MediaBrowserCompat$SearchResultReceiver;
        if (str22 != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(new ZSYR2K("repayment_plan", "FULL_AMOUNT".equals(str22) ? "full" : "minimum"));
        }
        forEachClear foreachclear3 = this.tracker;
        if (foreachclear3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        getFileBufferLength getfilebufferlength4 = this.presenter;
        if (getfilebufferlength4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(str21);
        }
        onSharedPreferenceChanged MediaBrowserCompat$CustomActionResultReceiver2 = getfilebufferlength4.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (list = MediaBrowserCompat$CustomActionResultReceiver2.write) == null) {
            bool = Boolean.FALSE;
        } else {
            bool = Boolean.valueOf(!list.isEmpty());
        }
        String str23 = "Yes";
        foreachclear3.MediaBrowserCompat$ItemReceiver(new ZSYR2K("debit_card", bool.booleanValue() ? str23 : "No"));
        forEachClear foreachclear4 = this.tracker;
        if (foreachclear4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        getFileBufferLength getfilebufferlength5 = this.presenter;
        if (getfilebufferlength5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(str21);
        }
        if (!getfilebufferlength5.IconCompatParcelizer.equals("EMAIL")) {
            str23 = "No";
        }
        foreachclear4.MediaBrowserCompat$ItemReceiver(new ZSYR2K("email_statement", str23));
        forEachClear foreachclear5 = this.tracker;
        if (foreachclear5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        ZTBSV ztbsv = foreachclear5;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_account");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends CrashlyticsReport.FilesPayload.File.Builder> list) {
        onGetStartedClick.write((Object) list, "accountSourceDisplays");
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashOccupationInfoFragment.IconCompatParcelizer((List<CrashlyticsReport.FilesPayload.File.Builder>) list));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    public final void onDestroyView() {
        getFileBufferLength getfilebufferlength = this.presenter;
        if (getfilebufferlength == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getfilebufferlength.onDestroy();
        super.onDestroyView();
    }

    public final String PlaybackStateCompat() {
        int hashCode;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("easycashInterface");
        }
        String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
        if (MediaBrowserCompat$SearchResultReceiver2 == null || ((hashCode = MediaBrowserCompat$SearchResultReceiver2.hashCode()) == 1033734720 ? !MediaBrowserCompat$SearchResultReceiver2.equals("SPEEDY_CASH") : hashCode != 1878720662 || !MediaBrowserCompat$SearchResultReceiver2.equals("CREDIT_CARD"))) {
            String string = getString(R.string.loan_info_title);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.loan_info_title)");
            return string;
        }
        String string2 = getString(R.string.card_info_title);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.card_info_title)");
        return string2;
    }

    public final void read() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity());
    }

    public static final EasycashFeaturesAccountDynamicFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new EasycashFeaturesAccountDynamicFragment();
    }
}
