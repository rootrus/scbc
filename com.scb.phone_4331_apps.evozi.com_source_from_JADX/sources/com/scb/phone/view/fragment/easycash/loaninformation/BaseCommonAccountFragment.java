package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ZTBSV;
import p040o.forEachClear;
import p040o.onGetStartedClick;
import p040o.setImageFilePath;
import p040o.setImageFilePath$MediaBrowserCompat$MediaItem;

public abstract class BaseCommonAccountFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.write {
    private IOrientationGuidanceCalculator IconCompatParcelizer;
    @BindView
    protected CustomAccountSelector accountRepaySelector;
    @BindView
    public CustomAccountSelector accountSelector;
    @BindView
    protected Button btnNext;
    @BindView
    protected View container;
    @BindView
    protected LinearLayout layoutRepayAccount;
    @BindView
    public RadioButton radioButtonCash;
    @BindView
    public RadioButton radioButtonDirectDebit;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public abstract setImageFilePath<?> write();

    /* access modifiers changed from: protected */
    public final LinearLayout MediaBrowserCompat$CustomActionResultReceiver() {
        LinearLayout linearLayout = this.layoutRepayAccount;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutRepayAccount");
        }
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [o.setImageMimeType] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            super.onViewCreated(r7, r8)
            android.widget.Button r7 = r6.btnNext
            if (r7 != 0) goto L_0x0011
            java.lang.String r8 = "btnNext"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0011:
            r8 = 0
            r7.setEnabled(r8)
            o.setImageFilePath r7 = r6.write()
            o.IOrientationGuidanceCalculator r0 = r6.IconCompatParcelizer
            if (r0 != 0) goto L_0x0022
            java.lang.String r1 = "easycashIntentInterface"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0022:
            java.lang.String r0 = r0.MediaBrowserCompat$SearchResultReceiver()
            java.lang.String r1 = "easycashIntentInterface.productType"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            android.os.Bundle r1 = r6.getArguments()
            if (r1 == 0) goto L_0x0038
            java.lang.String r2 = "com.scb.phone.view.activity.easycash.PRODUCT_PROGRAM"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            java.lang.String r2 = "productType"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            r7.read = r0
            o.setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver.write
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            if (r3 == 0) goto L_0x004c
            o.setImageMimeType r4 = new o.setImageMimeType
            r4.<init>(r3)
            r3 = r4
        L_0x004c:
            o.writeUInt64NoTag$IconCompatParcelizer r3 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r3
            T r4 = r7.RatingCompat
            r5 = 1
            if (r4 == 0) goto L_0x0055
            r4 = r5
            goto L_0x0056
        L_0x0055:
            r4 = r8
        L_0x0056:
            if (r4 == 0) goto L_0x005d
            T r4 = r7.RatingCompat
            r3.IconCompatParcelizer(r4)
        L_0x005d:
            T r3 = r7.RatingCompat
            if (r3 == 0) goto L_0x0062
            r8 = r5
        L_0x0062:
            if (r8 == 0) goto L_0x0069
            T r8 = r7.RatingCompat
            r8.AlertController$RecycleListView()
        L_0x0069:
            o.Iterables$ConsumingQueueIterator r8 = r7.MediaBrowserCompat$ItemReceiver
            o.setImageFilePath$RatingCompat r3 = new o.setImageFilePath$RatingCompat
            r3.<init>(r7)
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            o.setImageFilePath$MediaMetadataCompat r4 = new o.setImageFilePath$MediaMetadataCompat
            r4.<init>(r7)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            java.lang.String r7 = "onSuccess"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r7)
            java.lang.String r7 = "onError"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r7)
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            o.EngineManager$MediaBrowserCompat$CustomActionResultReceiver r7 = new o.EngineManager$MediaBrowserCompat$CustomActionResultReceiver
            r7.<init>(r0, r1)
            o.EngineManager r0 = r8.write
            o.frequency r0 = (p040o.frequency) r0
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r7 = (p040o.C4602xca7af99c) r7
            r8.IconCompatParcelizer(r0, r3, r4, r7)
            com.scb.phone.view.custom.easycash.CustomAccountSelector r7 = r6.accountRepaySelector
            if (r7 != 0) goto L_0x009d
            java.lang.String r8 = "accountRepaySelector"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x009d:
            r8 = 2131230897(0x7f0800b1, float:1.807786E38)
            r7.setBackgroundDrawable(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.loaninformation.BaseCommonAccountFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void IconCompatParcelizer(List<? extends CrashlyticsReport.FilesPayload.File.Builder> list) {
        onGetStartedClick.write((Object) list, "accountTargetDisplays");
        CustomAccountSelector customAccountSelector = this.accountSelector;
        if (customAccountSelector != null) {
            setImageFilePath<?> write2 = write();
            CrashlyticsReport.FilesPayload.File.Builder builder = (CrashlyticsReport.FilesPayload.File.Builder) list.get(0);
            onGetStartedClick.write((Object) builder, "receivingAccount");
            write2.MediaDescriptionCompat = builder;
            customAccountSelector.IconCompatParcelizer(list, new write(this, list));
        }
    }

    static final class write implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ BaseCommonAccountFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(BaseCommonAccountFragment baseCommonAccountFragment, List list) {
            this.MediaBrowserCompat$CustomActionResultReceiver = baseCommonAccountFragment;
            this.IconCompatParcelizer = list;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            setImageFilePath<?> write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
            CrashlyticsReport.FilesPayload.File.Builder builder = (CrashlyticsReport.FilesPayload.File.Builder) this.IconCompatParcelizer.get(i);
            onGetStartedClick.write((Object) builder, "receivingAccount");
            write.MediaDescriptionCompat = builder;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends CrashlyticsReport.FilesPayload.File.Builder> list) {
        onGetStartedClick.write((Object) list, "accountSourceDisplays");
        if (!list.isEmpty()) {
            setImageFilePath<?> write2 = write();
            CrashlyticsReport.FilesPayload.File.Builder builder = (CrashlyticsReport.FilesPayload.File.Builder) list.get(0);
            onGetStartedClick.write((Object) builder, "repaymentAccount");
            write2.MediaBrowserCompat$MediaItem = builder;
            CustomAccountSelector customAccountSelector = this.accountRepaySelector;
            if (customAccountSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountRepaySelector");
            }
            customAccountSelector.IconCompatParcelizer(list, new C5933x15a17a8e(this, list));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RadioButton radioButton = this.radioButtonDirectDebit;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonDirectDebit");
        }
        radioButton.setChecked(false);
        RadioButton radioButton2 = this.radioButtonDirectDebit;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonDirectDebit");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.radioButtonCash;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonCash");
        }
        radioButton3.setChecked(true);
    }

    @OnClick
    public final void onNextButtonClicked() {
        setImageFilePath<?> write2 = write();
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("easycashIntentInterface");
        }
        String read = iOrientationGuidanceCalculator.read();
        if (read == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) read, "easycashIntentInterface.applicationId!!");
        onGetStartedClick.write((Object) read, "appId");
        if (write2.RatingCompat != null) {
            write2.RatingCompat.AlertController$RecycleListView();
        }
        write2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new setImageFilePath.MediaDescriptionCompat(write2), new setImageFilePath$MediaBrowserCompat$MediaItem(write2), write2.write(read));
        forEachClear foreachclear = this.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear.MediaBrowserCompat$CustomActionResultReceiver(write().MediaMetadataCompat);
        forEachClear foreachclear2 = this.tracker;
        if (foreachclear2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        ZTBSV ztbsv = foreachclear2;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_account");
        }
    }

    public final void read(List<? extends CrashlyticsReport.FilesPayload.File.Builder> list) {
        onGetStartedClick.write((Object) list, "accountSourceDisplays");
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashOccupationInfoFragment.IconCompatParcelizer((List<CrashlyticsReport.FilesPayload.File.Builder>) list));
    }

    public final void read() {
        View view = this.container;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view.setVisibility(0);
    }

    public final void IconCompatParcelizer() {
        View view = this.container;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view.setVisibility(4);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(true);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroyView() {
        write().onDestroy();
        super.onDestroyView();
    }

    public void onStop() {
        super.onStop();
        setImageFilePath<?> write2 = write();
        boolean z = true;
        if (write2.RatingCompat != null) {
            write2.RatingCompat.ay_();
        }
        if (write2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.RatingCompat.aj_();
        }
        write2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    @OnCheckedChanged
    public final void cashOptionCheckedChange(boolean z) {
        if (z) {
            CustomAccountSelector customAccountSelector = this.accountRepaySelector;
            if (customAccountSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountRepaySelector");
            }
            customAccountSelector.setVisibility(8);
            setImageFilePath<?> write2 = write();
            onGetStartedClick.write((Object) "CASH", "repaymentMethod");
            write2.MediaMetadataCompat = "CASH";
        }
    }

    @OnCheckedChanged
    public final void directDebitOptionCheckedChange(boolean z) {
        if (z) {
            CustomAccountSelector customAccountSelector = this.accountRepaySelector;
            if (customAccountSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountRepaySelector");
            }
            customAccountSelector.setVisibility(0);
            setImageFilePath<?> write2 = write();
            onGetStartedClick.write((Object) "DIRECT_DEBIT", "repaymentMethod");
            write2.MediaMetadataCompat = "DIRECT_DEBIT";
        }
    }
}
