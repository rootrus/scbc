package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.C9766xa5c55d07;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ImageProcessor;
import p040o.ZSYR2K;
import p040o.forEachClear;
import p040o.getPrepaidTravelConversionConfirm;
import p040o.getTimeOutParameters;
import p040o.setAutoFocusEnabled;

public class AdditionDocumentScbAccountFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.read {
    private IOrientationGuidanceCalculator IconCompatParcelizer;
    @BindView
    protected CustomAccountSelector accountSelector;
    @BindView
    protected Button nextButton;
    @BindView
    protected RadioGroup rgScbAccount;
    @HmlPinActivity
    public ImageProcessor.ImageOutEvent scbAccountPresenter;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static AdditionDocumentScbAccountFragment IconCompatParcelizer(boolean z, List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment = new AdditionDocumentScbAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", z);
        if (list != null) {
            bundle.putParcelableArrayList("com.scb.phone.EXTRA_EASYCASH_ACCOUNT_LIST", new ArrayList(list));
        }
        additionDocumentScbAccountFragment.setArguments(bundle);
        return additionDocumentScbAccountFragment;
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.occupation_info_title);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            r6 = 0
            r0 = 2131493919(0x7f0c041f, float:1.8611332E38)
            android.view.View r4 = r4.inflate(r0, r5, r6)
            butterknife.ButterKnife.IconCompatParcelizer(r3, r4)
            o.ImageProcessor$ImageOutEvent r5 = r3.scbAccountPresenter
            r5.MediaBrowserCompat$ItemReceiver(r3)
            o.IOrientationGuidanceCalculator r5 = r3.IconCompatParcelizer
            java.lang.String r5 = r5.MediaBrowserCompat$SearchResultReceiver()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 277399877(0x1088c945, float:5.3952646E-29)
            if (r0 == r2) goto L_0x002f
            r2 = 2090361232(0x7c986190, float:6.3296634E36)
            if (r0 != r2) goto L_0x0039
            java.lang.String r0 = "PURPOSEFUL_LOAN"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003a
        L_0x002f:
            java.lang.String r0 = "HOME_TOP_UP"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0039
            r5 = r1
            goto L_0x003a
        L_0x0039:
            r5 = -1
        L_0x003a:
            if (r5 == 0) goto L_0x007f
            if (r5 == r1) goto L_0x0071
            android.os.Bundle r5 = r3.getArguments()
            if (r5 == 0) goto L_0x008c
            android.os.Bundle r5 = r3.getArguments()
            java.lang.String r0 = "com.scb.phone.EXTRA_EASYCASH_ACCOUNT_LIST"
            java.util.ArrayList r5 = r5.getParcelableArrayList(r0)
            if (r5 != 0) goto L_0x005b
            o.ImageProcessor$ImageOutEvent r5 = r3.scbAccountPresenter
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.read(r6)
            goto L_0x008c
        L_0x005b:
            o.ImageProcessor$ImageOutEvent r0 = r3.scbAccountPresenter
            r0.IconCompatParcelizer = r5
            o.getProcessedImageFilePath r2 = new o.getProcessedImageFilePath
            r2.<init>(r5)
            T r5 = r0.RatingCompat
            if (r5 == 0) goto L_0x0069
            r6 = r1
        L_0x0069:
            if (r6 == 0) goto L_0x008c
            T r5 = r0.RatingCompat
            r2.IconCompatParcelizer(r5)
            goto L_0x008c
        L_0x0071:
            o.ImageProcessor$ImageOutEvent r5 = r3.scbAccountPresenter
            o.IOrientationGuidanceCalculator r6 = r3.IconCompatParcelizer
            o.getTotalRamInBytes r6 = r6.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<o.isDebuggerAttached> r6 = r6.MediaBrowserCompat$ItemReceiver
            r5.read(r6)
            goto L_0x008c
        L_0x007f:
            o.ImageProcessor$ImageOutEvent r5 = r3.scbAccountPresenter
            o.IOrientationGuidanceCalculator r6 = r3.IconCompatParcelizer
            o.isRooted r6 = r6.MediaBrowserCompat$MediaItem()
            java.util.List<o.isDebuggerAttached> r6 = r6.MediaBrowserCompat$ItemReceiver
            r5.read(r6)
        L_0x008c:
            android.widget.RadioGroup r5 = r3.rgScbAccount
            o.getPrepaidTravelConversionLanding r6 = new o.getPrepaidTravelConversionLanding
            r6.<init>(r3)
            r5.setOnCheckedChangeListener(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentScbAccountFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == R.id.rb_not_use_scb) {
            this.accountSelector.setVisibility(8);
            this.scbAccountPresenter.MediaBrowserCompat$CustomActionResultReceiver(-1);
        } else if (i == R.id.rb_use_scb) {
            this.accountSelector.setVisibility(0);
            this.scbAccountPresenter.MediaBrowserCompat$CustomActionResultReceiver(0);
        }
        this.nextButton.setEnabled(true);
    }

    @OnClick
    public void onNextButtonClicked() {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator != null) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", iOrientationGuidanceCalculator.write()));
            boolean z = true;
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("use_scb_account", this.scbAccountPresenter.MediaBrowserCompat$ItemReceiver != null ? "Yes" : "No"));
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_operating_account");
            }
            ImageProcessor.ImageOutEvent imageOutEvent = this.scbAccountPresenter;
            String MediaBrowserCompat$SearchResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver();
            String read = this.IconCompatParcelizer.read();
            if (imageOutEvent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                imageOutEvent.RatingCompat.AlertController$RecycleListView();
            }
            setAutoFocusEnabled setautofocusenabled = imageOutEvent.write;
            CustomConcurrentHashMap.EntryFactory.C32966.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = CustomConcurrentHashMap.EntryFactory.C32966.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = imageOutEvent.MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$ItemReceiver.read = read;
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = MediaBrowserCompat$SearchResultReceiver;
            setautofocusenabled.MediaBrowserCompat$ItemReceiver(new CustomConcurrentHashMap.EntryFactory.C32966(MediaBrowserCompat$ItemReceiver, (byte) 0));
            imageOutEvent.write.IconCompatParcelizer(new C9766xa5c55d07(imageOutEvent, (byte) 0));
        }
    }

    public final void write() {
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        boolean z = false;
        if (getArguments() != null && getArguments().getBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", false)) {
            z = true;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", z);
        DocumentUploadFragment documentUploadFragment = new DocumentUploadFragment();
        documentUploadFragment.setArguments(bundle);
        gettimeoutparameters.IconCompatParcelizer(this, documentUploadFragment);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        this.accountSelector.IconCompatParcelizer(list, new getPrepaidTravelConversionConfirm(this));
    }

    public void onDestroyView() {
        this.tracker = null;
        this.IconCompatParcelizer = null;
        this.scbAccountPresenter.onDestroy();
        super.onDestroyView();
    }
}
