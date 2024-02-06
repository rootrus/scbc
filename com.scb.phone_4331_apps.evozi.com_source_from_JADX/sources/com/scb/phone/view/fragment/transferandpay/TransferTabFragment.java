package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.scb.phone.view.fragment.transferandpay.fixedtransfer.FixedTransferInputFormFragment;
import com.scb.phone.view.fragment.transferandpay.fixedtransfer.FixedTransferTargetTabFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferInputAmountFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferTargetTabFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToMeStep1Fragment;
import java.util.List;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerAccountSetupActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerGuidelinesActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity;
import p040o.BillCaptureModule;
import p040o.BillCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.BillCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.BillCaptureModule_GetIParametersFactory;
import p040o.BillCaptureModule_GetProcessingParametersFactory;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.HmlPinActivity;
import p040o.IBillDeserializer;
import p040o.IBillExtractorListener;
import p040o.IGoogleMapDelegate;
import p040o.containsEntry;
import p040o.eventToJson;
import p040o.getKernelIDSrcIn;
import p040o.getShortName;
import p040o.getTopLeftCornerWidth;
import p040o.getUriKta;
import p040o.getZip;
import p040o.parseSession;
import p040o.proxyGetIJsonExactionHelperKta;
import p040o.proxyGetIJsonExactionHelperRtti;
import p040o.setChildDrawingOrderCallback;

public class TransferTabFragment extends BaseTransferAndPayTabFragment implements getTopLeftCornerWidth.ListMenuItemView, AccountSourceSelectFragment.write {
    public FixedTransferTargetTabFragment IconCompatParcelizer;
    public TransferTargetTabFragment MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem = "";
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private AccountSourceSelectFragment MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem = false;
    private getKernelIDSrcIn MediaSessionCompat$ResultReceiverWrapper = new getKernelIDSrcIn();
    private TransferToMeStep1Fragment MediaSessionCompat$Token;
    private TransferInputAmountFragment ParcelableVolumeInfo;
    private FixedTransferInputFormFragment RatingCompat;
    @BindView
    NestedScrollView scrollView;
    @HmlPinActivity
    public IBillDeserializer transferTabPresenter;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static TransferTabFragment read(String str) {
        TransferTabFragment transferTabFragment = new TransferTabFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.FAVOURITE", true);
        bundle.putString("source", str);
        transferTabFragment.setArguments(bundle);
        return transferTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CrashlyticsReportJsonTransform$$Lambda$4 crashlyticsReportJsonTransform$$Lambda$4;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90252131494252, viewGroup, false);
        String AbsActionBarView = AbsActionBarView();
        this.MediaMetadataCompat = AbsActionBarView;
        this.MediaSessionCompat$ResultReceiverWrapper.read(AbsActionBarView);
        getKernelIDSrcIn getkernelidsrcin = this.MediaSessionCompat$ResultReceiverWrapper;
        if (getActivity() != null) {
            getkernelidsrcin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "transfer_landing");
        }
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.transferTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = (getActivity() == null || getActivity().getIntent() == null) ? "" : getActivity().getIntent().getStringExtra("com.scb.phone.EXTRA_TRANSFER_DEFAULT_ACCOUNT_NUMBER");
        if (getArguments() != null) {
            this.MediaSessionCompat$QueueItem = getArguments().getBoolean("com.scb.phone.FAVOURITE", false);
        }
        IBillDeserializer iBillDeserializer = this.transferTabPresenter;
        boolean z2 = this.MediaSessionCompat$QueueItem;
        if (z2) {
            crashlyticsReportJsonTransform$$Lambda$4 = CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_FUNCTION;
        } else {
            crashlyticsReportJsonTransform$$Lambda$4 = CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_AND_FIXED_TRANSFER_FUNCTION;
        }
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(crashlyticsReportJsonTransform$$Lambda$4);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        BillCaptureModule_GetIJsonExactionHelperKtaFactory billCaptureModule_GetIJsonExactionHelperKtaFactory = new BillCaptureModule_GetIJsonExactionHelperKtaFactory(new CrashlyticsReport.FilesPayload.File(write, (byte) 0), stringExtra, z2);
        if (iBillDeserializer.RatingCompat != null) {
            z = true;
        }
        if (z) {
            billCaptureModule_GetIJsonExactionHelperKtaFactory.IconCompatParcelizer(iBillDeserializer.RatingCompat);
        }
        this.scrollView.setOnScrollChangeListener(new ActivityBuilder_ContributesHmlBusinessOwnerAccountSetupActivity(this));
        return inflate;
    }

    public void onResume() {
        super.onResume();
        if (!IconCompatParcelizer()) {
            if (getArguments() == null || !getArguments().getBoolean("com.scb.phone.FAVOURITE")) {
                MediaBrowserCompat$ItemReceiver("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP", "com.scb.phone/BROADCAST_TRANSFER_BACK_STEP");
            } else {
                CardView read = getFragmentManager().read();
                read.MediaBrowserCompat$ItemReceiver(getChildFragmentManager().findFragmentById(R.id.fragment_favourite_transfer_target));
                read.write();
                MediaBrowserCompat$ItemReceiver("com.scb.phone/BROADCAST_TRANSFER_NEXT_FAVOURITE_STEP", "com.scb.phone/BROADCAST_TRANSFER_BACK_STEP");
            }
        }
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_TRANSFER_CLEAR_FILTER_SOF")).subscribe(new ActivityBuilder_ContributesHmlBusinessOwnerGuidelinesActivity(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
        }
    }

    public void onDestroy() {
        this.transferTabPresenter.onDestroy();
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(eventToJson eventtojson) {
        this.MediaSessionCompat$Token = TransferToMeStep1Fragment.read(this.transferTabPresenter.IconCompatParcelizer, eventtojson);
        aA_();
        read(this.MediaSessionCompat$Token, R.id.container, "com.scb.phone.TransferTabFragment.TAG_NEXT_STEP", true, true);
    }

    public final void MediaBrowserCompat$ItemReceiver(parseSession parsesession, String str) {
        this.MediaSessionCompat$Token = TransferToMeStep1Fragment.read(str, "FIXED_TRANSFER", parsesession);
        aA_();
        read(this.MediaSessionCompat$Token, R.id.container, "com.scb.phone.TransferTabFragment.TAG_NEXT_STEP", true, true);
    }

    /* access modifiers changed from: package-private */
    public final void write(Intent intent) {
        parseSession parsesession;
        getZip getzip = new getZip();
        getzip.read = (parseSession) intent.getParcelableExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA");
        getzip.MediaBrowserCompat$ItemReceiver = intent.getStringExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION");
        boolean z = false;
        getzip.IconCompatParcelizer = intent.getBooleanExtra("com.scb.phone.EXTRA_FROM_TRANSFER_TO_ME_PAGE", false);
        getzip.write = (parseSession) intent.getParcelableExtra("fixed_transfer_display");
        getzip.MediaBrowserCompat$CustomActionResultReceiver = intent.getBooleanExtra("com.scb.phone.EXTRA_TRANSFER_TO_MAIN_AUTO", false);
        IBillDeserializer iBillDeserializer = this.transferTabPresenter;
        String str = this.MediaBrowserCompat$MediaItem;
        boolean z2 = this.MediaSessionCompat$QueueItem;
        if (getzip.write != null) {
            getzip.write.MediaDescriptionCompat = getzip.read.MediaDescriptionCompat;
        }
        if (z2 || !(getzip.read instanceof eventToJson) || !"000".equalsIgnoreCase(((eventToJson) getzip.read).MediaBrowserCompat$ItemReceiver) || getzip.IconCompatParcelizer) {
            boolean z3 = !TextUtils.isEmpty(getzip.MediaBrowserCompat$ItemReceiver) && getzip.MediaBrowserCompat$ItemReceiver.equals("FIXED_TRANSFER");
            if (z3 && !getzip.IconCompatParcelizer && !getzip.MediaBrowserCompat$CustomActionResultReceiver) {
                parsesession = getzip.write;
            } else {
                parsesession = getzip.read;
            }
            proxyGetIJsonExactionHelperKta proxygetijsonexactionhelperkta = new proxyGetIJsonExactionHelperKta(z3, getzip, parsesession);
            if (iBillDeserializer.RatingCompat != null) {
                z = true;
            }
            if (z) {
                proxygetijsonexactionhelperkta.IconCompatParcelizer(iBillDeserializer.RatingCompat);
                return;
            }
            return;
        }
        eventToJson eventtojson = (eventToJson) getzip.read;
        if (TextUtils.isEmpty(str)) {
            BillCaptureModule_GetIJsonExactionHelperRttiFactory billCaptureModule_GetIJsonExactionHelperRttiFactory = new BillCaptureModule_GetIJsonExactionHelperRttiFactory(eventtojson);
            if (iBillDeserializer.RatingCompat != null) {
                z = true;
            }
            if (z) {
                billCaptureModule_GetIJsonExactionHelperRttiFactory.IconCompatParcelizer(iBillDeserializer.RatingCompat);
                return;
            }
            return;
        }
        proxyGetIJsonExactionHelperRtti proxygetijsonexactionhelperrtti = new proxyGetIJsonExactionHelperRtti(getzip, str);
        if (iBillDeserializer.RatingCompat != null) {
            z = true;
        }
        if (z) {
            proxygetijsonexactionhelperrtti.IconCompatParcelizer(iBillDeserializer.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent) {
        super.IconCompatParcelizer(intent);
        String stringExtra = intent.getStringExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION");
        this.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver();
        this.MediaSessionCompat$ResultReceiverWrapper.read(this.MediaMetadataCompat);
        getKernelIDSrcIn getkernelidsrcin = this.MediaSessionCompat$ResultReceiverWrapper;
        if (getActivity() != null) {
            getkernelidsrcin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "transfer_landing");
        }
        if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals("FIXED_TRANSFER")) {
            read(this.MediaBrowserCompat$CustomActionResultReceiver, R.id.container, getString(R.string.transfer_target_tab), true);
            this.ParcelableVolumeInfo = null;
        } else {
            FixedTransferTargetTabFragment fixedTransferTargetTabFragment = this.IconCompatParcelizer;
            fixedTransferTargetTabFragment.ctlTargetAccount.setScrollPosition(0, BitmapDescriptorFactory.HUE_RED, true);
            fixedTransferTargetTabFragment.vpTargetAccount.setCurrentItem(0);
            read(this.IconCompatParcelizer, R.id.container, "com.scb.phone.TransferTabFragment.TAG_FIXED_TRANSFER", true);
            this.RatingCompat = null;
        }
        if (this.MediaSessionCompat$Token != null) {
            this.MediaSessionCompat$Token = null;
        }
    }

    public final void read(CrashlyticsReport.FilesPayload.File file, String str, boolean z) {
        this.MediaDescriptionCompat = AccountSourceSelectFragment.MediaBrowserCompat$ItemReceiver(file, str, z);
        CardView read = getChildFragmentManager().read();
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, this.MediaDescriptionCompat);
        read.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, getShortName getshortname, double d, parseSession parsesession) {
        PlaybackStateCompat$CustomAction();
        this.ParcelableVolumeInfo = TransferInputAmountFragment.write(parsesession, str, getshortname, d, this.MediaMetadataCompat);
        aA_();
        read(this.ParcelableVolumeInfo, R.id.container, "com.scb.phone.TransferTabFragment.TAG_NEXT_STEP", true, true);
    }

    public final void IconCompatParcelizer(parseSession parsesession, String str, boolean z) {
        PlaybackStateCompat$CustomAction();
        this.RatingCompat = FixedTransferInputFormFragment.MediaBrowserCompat$ItemReceiver(parsesession, str, z, this.MediaMetadataCompat);
        aA_();
        read(this.RatingCompat, R.id.container, "com.scb.phone.TransferTabFragment.TAG_FIXED_TRANSFER_INPUT", true, true);
        getChildFragmentManager().IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        boolean z;
        parseSession parsesession;
        if (builder != null) {
            List<String> list = builder.PlaybackStateCompat$CustomAction;
            boolean z2 = false;
            if (list != null) {
                z = list.contains("FIXED_TRANSFER_SOURCE");
            } else {
                z = false;
            }
            boolean z3 = true;
            if (z) {
                IBillDeserializer iBillDeserializer = this.transferTabPresenter;
                String str = builder.MediaSessionCompat$Token;
                getShortName getshortname = builder.MediaSessionCompat$ResultReceiverWrapper;
                double doubleValue = builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
                iBillDeserializer.IconCompatParcelizer = str;
                iBillDeserializer.MediaDescriptionCompat = getshortname;
                iBillDeserializer.MediaBrowserCompat$ItemReceiver = doubleValue;
                IBillDeserializer iBillDeserializer2 = this.transferTabPresenter;
                String str2 = builder.MediaSessionCompat$Token;
                String str3 = iBillDeserializer2.read;
                if (!(!(str3 == null || str3.length() == 0)) || !iBillDeserializer2.read.equals(str2)) {
                    z3 = false;
                }
                if (!z3) {
                    aA_();
                    this.MediaBrowserCompat$MediaItem = builder.MediaSessionCompat$Token;
                    this.IconCompatParcelizer = FixedTransferTargetTabFragment.IconCompatParcelizer(builder.MediaSessionCompat$Token);
                    this.transferTabPresenter.read = builder.MediaSessionCompat$Token;
                    this.transferTabPresenter.write = false;
                    read(this.IconCompatParcelizer, R.id.container, "com.scb.phone.TransferTabFragment.TAG_FIXED_TRANSFER", true, true);
                    return;
                }
                return;
            }
            this.MediaBrowserCompat$MediaItem = "";
            TransferInputAmountFragment transferInputAmountFragment = this.ParcelableVolumeInfo;
            if (transferInputAmountFragment != null && !transferInputAmountFragment.isDetached() && this.ParcelableVolumeInfo.isAdded()) {
                IBillExtractorListener iBillExtractorListener = this.ParcelableVolumeInfo.presenter;
                String str4 = builder.MediaSessionCompat$Token;
                getShortName getshortname2 = builder.MediaSessionCompat$ResultReceiverWrapper;
                double doubleValue2 = builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
                iBillExtractorListener.MediaBrowserCompat$MediaItem = getshortname2;
                iBillExtractorListener.MediaBrowserCompat$SearchResultReceiver = str4;
                if (str4 != null && (parsesession = iBillExtractorListener.MediaMetadataCompat) != null && str4.equals(parsesession.MediaBrowserCompat$CustomActionResultReceiver) && iBillExtractorListener.MediaMetadataCompat.RatingCompat == IGoogleMapDelegate.OWN) {
                    getUriKta geturikta = getUriKta.MediaBrowserCompat$CustomActionResultReceiver;
                    if (iBillExtractorListener.RatingCompat != null) {
                        geturikta.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
                    }
                }
                BillCaptureModule.C6335b bVar = new BillCaptureModule.C6335b(doubleValue2);
                if (iBillExtractorListener.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    bVar.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
                }
            }
            TransferToMeStep1Fragment transferToMeStep1Fragment = this.MediaSessionCompat$Token;
            if (transferToMeStep1Fragment != null && !transferToMeStep1Fragment.isDetached()) {
                TransferToMeStep1Fragment transferToMeStep1Fragment2 = this.MediaSessionCompat$Token;
                String str5 = builder.MediaSessionCompat$Token;
                if (str5 != null) {
                    transferToMeStep1Fragment2.presenter.MediaBrowserCompat$CustomActionResultReceiver(str5);
                }
            }
            FixedTransferTargetTabFragment fixedTransferTargetTabFragment = this.IconCompatParcelizer;
            if (fixedTransferTargetTabFragment != null) {
                containsEntry containsentry = fixedTransferTargetTabFragment.fixedTransferTargetPresenter.IconCompatParcelizer;
                if (!containsentry.MediaBrowserCompat$MediaItem.isDisposed()) {
                    containsentry.MediaBrowserCompat$MediaItem.dispose();
                }
            }
            IBillDeserializer iBillDeserializer3 = this.transferTabPresenter;
            String str6 = builder.MediaSessionCompat$Token;
            getShortName getshortname3 = builder.MediaSessionCompat$ResultReceiverWrapper;
            double doubleValue3 = builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
            iBillDeserializer3.IconCompatParcelizer = str6;
            iBillDeserializer3.MediaDescriptionCompat = getshortname3;
            iBillDeserializer3.MediaBrowserCompat$ItemReceiver = doubleValue3;
            if (!this.transferTabPresenter.write) {
                aA_();
                this.transferTabPresenter.write = true;
                this.transferTabPresenter.read = null;
                TransferTargetTabFragment write = TransferTargetTabFragment.write(builder.MediaSessionCompat$Token);
                this.MediaBrowserCompat$CustomActionResultReceiver = write;
                read(write, R.id.container, getString(R.string.transfer_target_tab), true);
            }
        }
    }

    public final void read(boolean z, boolean z2, parseSession parsesession) {
        boolean z3 = true;
        if (z) {
            IBillDeserializer iBillDeserializer = this.transferTabPresenter;
            BillCaptureModule_GetProcessingParametersFactory billCaptureModule_GetProcessingParametersFactory = new BillCaptureModule_GetProcessingParametersFactory(iBillDeserializer, parsesession, z2);
            if (iBillDeserializer.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                billCaptureModule_GetProcessingParametersFactory.IconCompatParcelizer(iBillDeserializer.RatingCompat);
                return;
            }
            return;
        }
        this.MediaDescriptionCompat.IconCompatParcelizer(parsesession.MediaBrowserCompat$CustomActionResultReceiver);
        IBillDeserializer iBillDeserializer2 = this.transferTabPresenter;
        BillCaptureModule_GetIParametersFactory billCaptureModule_GetIParametersFactory = new BillCaptureModule_GetIParametersFactory(iBillDeserializer2, parsesession);
        if (iBillDeserializer2.RatingCompat == null) {
            z3 = false;
        }
        if (z3) {
            billCaptureModule_GetIParametersFactory.IconCompatParcelizer(iBillDeserializer2.RatingCompat);
        }
    }
}
