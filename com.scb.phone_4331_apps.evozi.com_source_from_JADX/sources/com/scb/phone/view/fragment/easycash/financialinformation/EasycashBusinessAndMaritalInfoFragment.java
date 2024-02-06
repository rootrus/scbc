package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.AnalyticsConnectorReceiver;
import p040o.AnalyticsReceiver;
import p040o.AutoValue_CrashlyticsReportWithSessionId;
import p040o.C10827Iterators;
import p040o.C5319x61f2e3ab;
import p040o.CrashlyticsReport;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.RttiIdExtractor;
import p040o.forEachClear;
import p040o.getHttpRequest;
import p040o.getPerformPaymentWithReferer;
import p040o.onCrashlyticsOriginEvent;
import p040o.onGetStartedClick;
import p040o.onMissing;
import p040o.removeIfFromRandomAccessList;
import p040o.setImageJpegQuality;
import p040o.setImageJpegQuality$MediaSessionCompat$QueueItem;
import p040o.setImageJpegQuality$MediaSessionCompat$Token;
import p040o.writeUInt64NoTag;

public final class EasycashBusinessAndMaritalInfoFragment extends BreadcrumbFragment implements RttiIdExtractor {
    private final read IconCompatParcelizer = new read(this);
    public getPerformPaymentWithReferer MediaBrowserCompat$CustomActionResultReceiver;
    private IOrientationGuidanceCalculator MediaDescriptionCompat;
    private final HmlVerifyEmailActivity RatingCompat;
    @BindView
    public Button btnNext;
    @HmlPinActivity
    public setImageJpegQuality presenter;
    @BindView
    public RecyclerView recyclerView;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final boolean setHasDecor() {
        return true;
    }

    public EasycashBusinessAndMaritalInfoFragment() {
        FundActionsSuccessActivity easycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$CustomActionResultReceiver = new C5926xe9c620fd(this);
        onGetStartedClick.write((Object) easycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.RatingCompat = new HmlVerifyPhoneTermsConditionsActivity(easycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaDescriptionCompat = (IOrientationGuidanceCalculator) context;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f90322131494259, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver(this, view);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new getPerformPaymentWithReferer(this.IconCompatParcelizer);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        getPerformPaymentWithReferer getperformpaymentwithreferer = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getperformpaymentwithreferer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        recyclerView2.setAdapter(getperformpaymentwithreferer);
        boolean z = false;
        recyclerView2.setNestedScrollingEnabled(false);
        setImageJpegQuality setimagejpegquality = this.presenter;
        if (setimagejpegquality == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagejpegquality.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.MediaDescriptionCompat;
            if (iOrientationGuidanceCalculator == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("easycashIntentInterface");
            }
            String read2 = iOrientationGuidanceCalculator.read();
            boolean z2 = arguments.getBoolean("com.scb.phone.IS_REQUIRED_DOCUMENTS");
            boolean z3 = arguments.getBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG");
            ArrayList<CrashlyticsReport.FilesPayload.File.Builder> parcelableArrayList = arguments.getParcelableArrayList("com.scb.phone.EXTRA_EASYCASH_ACCOUNT_LIST");
            if (parcelableArrayList != null && read2 != null) {
                setImageJpegQuality setimagejpegquality2 = this.presenter;
                if (setimagejpegquality2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                IOrientationGuidanceCalculator iOrientationGuidanceCalculator2 = this.MediaDescriptionCompat;
                if (iOrientationGuidanceCalculator2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("easycashIntentInterface");
                }
                String MediaBrowserCompat$SearchResultReceiver = iOrientationGuidanceCalculator2.MediaBrowserCompat$SearchResultReceiver();
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$SearchResultReceiver, "easycashIntentInterface.productType");
                onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver, "productType");
                onGetStartedClick.write((Object) read2, "applicationId");
                onGetStartedClick.write((Object) parcelableArrayList, "accountList");
                setimagejpegquality2.MediaMetadataCompat = MediaBrowserCompat$SearchResultReceiver;
                setimagejpegquality2.MediaBrowserCompat$ItemReceiver = read2;
                setimagejpegquality2.IconCompatParcelizer = parcelableArrayList;
                setimagejpegquality2.MediaDescriptionCompat = z2;
                setimagejpegquality2.MediaBrowserCompat$MediaItem = z3;
                if (setimagejpegquality2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setimagejpegquality2.RatingCompat.AlertController$RecycleListView();
                }
                C10827Iterators.C35489 r7 = setimagejpegquality2.read;
                FundFactSheetActivity setimagejpegquality_mediabrowsercompat_customactionresultreceiver = new C5319x61f2e3ab(setimagejpegquality2);
                FundFactSheetActivity write2 = new setImageJpegQuality.write(setimagejpegquality2);
                onGetStartedClick.write((Object) setimagejpegquality_mediabrowsercompat_customactionresultreceiver, "onSuccess");
                onGetStartedClick.write((Object) write2, "onError");
                r7.IconCompatParcelizer(r7.read, setimagejpegquality_mediabrowsercompat_customactionresultreceiver, write2, new onMissing.IconCompatParcelizer());
            }
        }
    }

    public static final class read implements getPerformPaymentWithReferer.write {
        private /* synthetic */ EasycashBusinessAndMaritalInfoFragment read;

        read(EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment) {
            this.read = easycashBusinessAndMaritalInfoFragment;
        }

        public final void write() {
            setImageJpegQuality setimagejpegquality = this.read.presenter;
            if (setimagejpegquality == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean z = true;
            if (setimagejpegquality.MediaBrowserCompat$ItemReceiver()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setImageJpegQuality$MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
                if (setimagejpegquality.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setimagejpegquality.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setImageJpegQuality$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver;
            if (setimagejpegquality.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(setimagejpegquality.RatingCompat);
            }
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(AnalyticsConnectorReceiver.BreadcrumbHandler breadcrumbHandler) {
            onGetStartedClick.write((Object) breadcrumbHandler, "display");
            if (this.read.presenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            return setImageJpegQuality.read(breadcrumbHandler);
        }

        public final boolean read(AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId) {
            onGetStartedClick.write((Object) autoValue_CrashlyticsReportWithSessionId, "display");
            if (this.read.presenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            return setImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver(autoValue_CrashlyticsReportWithSessionId);
        }

        public final String IconCompatParcelizer(String str) {
            onGetStartedClick.write((Object) str, "nationalId");
            if (this.read.presenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "nationalId");
            String read2 = removeIfFromRandomAccessList.read(str, "[^0-9]", "X-XXXX-XXXXX-XX-X");
            onGetStartedClick.IconCompatParcelizer((Object) read2, "formatCitizenCase.formatString(nationalId)");
            return read2;
        }

        public final String write(String str) {
            if (this.read.presenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            return setImageJpegQuality.MediaBrowserCompat$ItemReceiver(str);
        }

        public final void read() {
            boolean z;
            Object obj;
            boolean z2;
            setImageJpegQuality setimagejpegquality = this.read.presenter;
            if (setimagejpegquality == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            List<? extends onCrashlyticsOriginEvent> list = setimagejpegquality.write;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("displayList");
            }
            Iterator it = list.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((onCrashlyticsOriginEvent) obj).MediaBrowserCompat$ItemReceiver == AnalyticsReceiver.CrashlyticsOriginEventListener.YEAR_MONTH_IN_BUSINESS) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            onCrashlyticsOriginEvent oncrashlyticsoriginevent = (onCrashlyticsOriginEvent) obj;
            if (oncrashlyticsoriginevent instanceof getHttpRequest) {
                writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new setImageJpegQuality.MediaDescriptionCompat(oncrashlyticsoriginevent);
                if (setimagejpegquality.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mediaDescriptionCompat.IconCompatParcelizer(setimagejpegquality.RatingCompat);
                }
            }
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            setImageJpegQuality setimagejpegquality = this.read.presenter;
            if (setimagejpegquality == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean z = true;
            if (setimagejpegquality.MediaBrowserCompat$ItemReceiver()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setImageJpegQuality$MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
                if (setimagejpegquality.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setimagejpegquality.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setImageJpegQuality$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver;
            if (setimagejpegquality.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(setimagejpegquality.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            onGetStartedClick.write((Object) str, "maritalStatus");
            setImageJpegQuality setimagejpegquality = this.read.presenter;
            if (setimagejpegquality == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setimagejpegquality.read(str);
        }
    }

    public final void IconCompatParcelizer(List<? extends onCrashlyticsOriginEvent> list) {
        onGetStartedClick.write((Object) list, "displayList");
        getPerformPaymentWithReferer getperformpaymentwithreferer = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getperformpaymentwithreferer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        onGetStartedClick.write((Object) list, "displayList");
        getperformpaymentwithreferer.MediaBrowserCompat$ItemReceiver.clear();
        getperformpaymentwithreferer.MediaBrowserCompat$ItemReceiver.addAll(list);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.post(new write(this));
    }

    static final class write implements Runnable {
        private /* synthetic */ EasycashBusinessAndMaritalInfoFragment read;

        write(EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment) {
            this.read = easycashBusinessAndMaritalInfoFragment;
        }

        public final void run() {
            getPerformPaymentWithReferer getperformpaymentwithreferer = this.read.MediaBrowserCompat$CustomActionResultReceiver;
            if (getperformpaymentwithreferer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
            }
            getperformpaymentwithreferer.IconCompatParcelizer.write();
        }
    }

    public static final class IconCompatParcelizer implements DurationEmploymentForBusinessDialog.IconCompatParcelizer {
        private /* synthetic */ getHttpRequest MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ EasycashBusinessAndMaritalInfoFragment read;

        IconCompatParcelizer(EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment, getHttpRequest gethttprequest) {
            this.read = easycashBusinessAndMaritalInfoFragment;
            this.MediaBrowserCompat$ItemReceiver = gethttprequest;
        }

        public final void IconCompatParcelizer(String str, String str2) {
            setImageJpegQuality setimagejpegquality = this.read.presenter;
            if (setimagejpegquality == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getHttpRequest gethttprequest = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) gethttprequest, "display");
            gethttprequest.read = setImageJpegQuality.IconCompatParcelizer(str);
            gethttprequest.IconCompatParcelizer = setImageJpegQuality.IconCompatParcelizer(str2);
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new setImageJpegQuality.RatingCompat(setimagejpegquality);
            boolean z = true;
            if (setimagejpegquality.RatingCompat != null) {
                ratingCompat.IconCompatParcelizer(setimagejpegquality.RatingCompat);
            }
            if (setimagejpegquality.MediaBrowserCompat$ItemReceiver()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setImageJpegQuality$MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
                if (setimagejpegquality.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setimagejpegquality.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setImageJpegQuality$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver;
            if (setimagejpegquality.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(setimagejpegquality.RatingCompat);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNextButtonClicked() {
        /*
            r21 = this;
            r0 = r21
            o.forEachClear r1 = r0.tracker
            if (r1 != 0) goto L_0x000b
            java.lang.String r2 = "tracker"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x000b:
            o.IOrientationGuidanceCalculator r2 = r0.MediaDescriptionCompat
            java.lang.String r3 = "easycashIntentInterface"
            if (r2 != 0) goto L_0x0014
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0014:
            java.lang.String r2 = r2.write()
            o.ZSYR2K r4 = new o.ZSYR2K
            java.lang.String r5 = "customer_type"
            r4.<init>(r5, r2)
            r1.MediaBrowserCompat$ItemReceiver((p040o.ZSYR2K) r4)
            o.IOrientationGuidanceCalculator r2 = r0.MediaDescriptionCompat
            if (r2 != 0) goto L_0x0029
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0029:
            java.lang.String r2 = r2.MediaBrowserCompat$SearchResultReceiver()
            o.ZSYR2K r3 = new o.ZSYR2K
            java.lang.String r4 = "product_type"
            r3.<init>(r4, r2)
            r1.MediaBrowserCompat$ItemReceiver((p040o.ZSYR2K) r3)
            o.ZTBSV r1 = (p040o.ZTBSV) r1
            androidx.fragment.app.FragmentActivity r2 = r21.getActivity()
            if (r2 == 0) goto L_0x004c
            androidx.fragment.app.FragmentActivity r2 = r21.getActivity()
            com.scb.phone.view.activity.BaseActivity r2 = (com.scb.phone.view.activity.BaseActivity) r2
            o.getKernelIDDst r2 = r2.scbAnalytics
            java.lang.String r3 = "apply_loan_business_info"
            r1.MediaBrowserCompat$ItemReceiver(r2, r3)
        L_0x004c:
            o.setImageJpegQuality r1 = r0.presenter
            if (r1 != 0) goto L_0x0055
            java.lang.String r2 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0055:
            T r2 = r1.RatingCompat
            r3 = 0
            if (r2 == 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = r3
        L_0x005d:
            if (r2 == 0) goto L_0x0064
            T r2 = r1.RatingCompat
            r2.AlertController$RecycleListView()
        L_0x0064:
            o.Iterators$9 r2 = r1.read
            o.setImageJpegQuality$MediaBrowserCompat$MediaItem r4 = new o.setImageJpegQuality$MediaBrowserCompat$MediaItem
            r4.<init>(r1)
            o.FundActionsSuccessActivity r4 = (p040o.FundActionsSuccessActivity) r4
            o.setImageJpegQuality$MediaBrowserCompat$SearchResultReceiver r5 = new o.setImageJpegQuality$MediaBrowserCompat$SearchResultReceiver
            r5.<init>(r1)
            o.FundFactSheetActivity r5 = (p040o.FundFactSheetActivity) r5
            java.util.List<? extends o.onCrashlyticsOriginEvent> r6 = r1.write
            if (r6 != 0) goto L_0x007d
            java.lang.String r7 = "displayList"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x007d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r7 = ""
            r8 = 0
            r13 = r3
            r14 = r13
            r15 = r14
            r12 = r7
            r16 = r12
            r17 = r8
            r18 = r17
            r19 = r18
            r20 = r19
        L_0x0094:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r6.next()
            o.onCrashlyticsOriginEvent r8 = (p040o.onCrashlyticsOriginEvent) r8
            o.AnalyticsReceiver$CrashlyticsOriginEventListener r9 = r8.MediaBrowserCompat$ItemReceiver
            int[] r10 = p040o.setImageOutputColor.IconCompatParcelizer
            int r9 = r9.ordinal()
            r9 = r10[r9]
            switch(r9) {
                case 1: goto L_0x0113;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00ae;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x0094
        L_0x00ae:
            java.lang.String r20 = p040o.setImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver((p040o.onCrashlyticsOriginEvent) r8)
            goto L_0x0094
        L_0x00b3:
            java.lang.String r19 = p040o.setImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver((p040o.onCrashlyticsOriginEvent) r8)
            goto L_0x0094
        L_0x00b8:
            boolean r9 = r8 instanceof p040o.AppData
            if (r9 == 0) goto L_0x00c3
            o.AppData r8 = (p040o.AppData) r8
            java.lang.String r8 = r8.RatingCompat
            r18 = r8
            goto L_0x0094
        L_0x00c3:
            r18 = r7
            goto L_0x0094
        L_0x00c6:
            boolean r9 = r8 instanceof p040o.AutoValue_CrashlyticsReportWithSessionId
            if (r9 == 0) goto L_0x00d1
            o.AutoValue_CrashlyticsReportWithSessionId r8 = (p040o.AutoValue_CrashlyticsReportWithSessionId) r8
            java.lang.String r8 = r8.RatingCompat
            r17 = r8
            goto L_0x0094
        L_0x00d1:
            r17 = r7
            goto L_0x0094
        L_0x00d4:
            boolean r9 = r8 instanceof p040o.AbstractSpiCall
            if (r9 == 0) goto L_0x00df
            o.AbstractSpiCall r8 = (p040o.AbstractSpiCall) r8
            java.lang.String r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r16 = r8
            goto L_0x0094
        L_0x00df:
            r16 = r7
            goto L_0x0094
        L_0x00e2:
            java.lang.String r8 = p040o.setImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver((p040o.onCrashlyticsOriginEvent) r8)
            int r15 = java.lang.Integer.parseInt(r8)
            goto L_0x0094
        L_0x00eb:
            boolean r9 = r8 instanceof p040o.getHttpRequest
            if (r9 == 0) goto L_0x0094
            o.getHttpRequest r8 = (p040o.getHttpRequest) r8
            java.lang.String r9 = r8.read
            java.lang.String r10 = ">15"
            boolean r10 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00ff
            r9 = 16
        L_0x00fd:
            r13 = r9
            goto L_0x0107
        L_0x00ff:
            if (r9 == 0) goto L_0x0106
            int r9 = java.lang.Integer.parseInt(r9)
            goto L_0x00fd
        L_0x0106:
            r13 = r3
        L_0x0107:
            java.lang.String r8 = r8.IconCompatParcelizer
            if (r8 == 0) goto L_0x0111
            int r8 = java.lang.Integer.parseInt(r8)
            r14 = r8
            goto L_0x0094
        L_0x0111:
            r14 = r3
            goto L_0x0094
        L_0x0113:
            java.lang.String r12 = p040o.setImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver((p040o.onCrashlyticsOriginEvent) r8)
            goto L_0x0094
        L_0x0119:
            java.lang.String r10 = r1.MediaMetadataCompat
            if (r10 != 0) goto L_0x0122
            java.lang.String r3 = "productType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0122:
            java.lang.String r11 = r1.MediaBrowserCompat$ItemReceiver
            if (r11 != 0) goto L_0x012b
            java.lang.String r1 = "applicationId"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x012b:
            o.CustomConcurrentHashMap$QueueHolder r1 = new o.CustomConcurrentHashMap$QueueHolder
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r3 = "onSuccess"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r3)
            java.lang.String r3 = "onError"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r3)
            java.lang.String r3 = "request"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            o.onNewItem$MediaBrowserCompat$ItemReceiver r3 = new o.onNewItem$MediaBrowserCompat$ItemReceiver
            r3.<init>(r1)
            o.onNewItem r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            o.any r1 = (p040o.any) r1
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r3 = (p040o.C4602xca7af99c) r3
            r2.MediaBrowserCompat$ItemReceiver(r1, r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.financialinformation.EasycashBusinessAndMaritalInfoFragment.onNextButtonClicked():void");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(true);
    }

    public final void read() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(false);
    }

    public final void write(boolean z, ArrayList<CrashlyticsReport.FilesPayload.File.Builder> arrayList) {
        onGetStartedClick.write((Object) arrayList, "displayList");
        this.MediaMetadataCompat.IconCompatParcelizer(this, AdditionDocumentScbAccountFragment.IconCompatParcelizer(z, arrayList));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", z);
        DocumentUploadFragment documentUploadFragment = new DocumentUploadFragment();
        documentUploadFragment.setArguments(bundle);
        this.MediaMetadataCompat.IconCompatParcelizer(this, documentUploadFragment);
    }

    public final void IconCompatParcelizer() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashContactInformationFragment.write());
    }

    public final String PlaybackStateCompat() {
        String string = getString(R.string.occupation_info_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.occupation_info_title)");
        return string;
    }

    public final void onDestroy() {
        setImageJpegQuality setimagejpegquality = this.presenter;
        if (setimagejpegquality == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagejpegquality.onDestroy();
        super.onDestroy();
    }

    public static final EasycashBusinessAndMaritalInfoFragment read(boolean z, boolean z2, ArrayList<CrashlyticsReport.FilesPayload.File.Builder> arrayList) {
        onGetStartedClick.write((Object) arrayList, "displayList");
        EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment = new EasycashBusinessAndMaritalInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.IS_REQUIRED_DOCUMENTS", z);
        bundle.putBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", z2);
        bundle.putParcelableArrayList("com.scb.phone.EXTRA_EASYCASH_ACCOUNT_LIST", arrayList);
        easycashBusinessAndMaritalInfoFragment.setArguments(bundle);
        return easycashBusinessAndMaritalInfoFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(getHttpRequest gethttprequest) {
        onGetStartedClick.write((Object) gethttprequest, "display");
        DurationEmploymentForBusinessDialog durationEmploymentForBusinessDialog = (DurationEmploymentForBusinessDialog) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
        DurationEmploymentForBusinessDialog.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, gethttprequest);
        onGetStartedClick.write((Object) iconCompatParcelizer, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        durationEmploymentForBusinessDialog.IconCompatParcelizer = iconCompatParcelizer;
        String str = gethttprequest.read;
        String str2 = gethttprequest.IconCompatParcelizer;
        durationEmploymentForBusinessDialog.MediaBrowserCompat$CustomActionResultReceiver = str;
        durationEmploymentForBusinessDialog.write = str2;
        durationEmploymentForBusinessDialog.show();
    }
}
