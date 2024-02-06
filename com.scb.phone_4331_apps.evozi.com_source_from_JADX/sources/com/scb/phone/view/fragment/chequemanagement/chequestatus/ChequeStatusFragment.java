package com.scb.phone.view.fragment.chequemanagement.chequestatus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.chequemanagement.chequestatus.ChequeDetailListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p040o.C3212x29c7ec22;
import p040o.C6382x38d8e0d1;
import p040o.ComponentRuntime$$Lambda$1;
import p040o.ConstructorConstructor;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.HmlPinActivity;
import p040o.PayNowApi;
import p040o.getBankingAgentTC;
import p040o.getOversizeImage;
import p040o.initializeEagerComponents;
import p040o.processSetComponents;
import p040o.setMaxHeight;
import p040o.validateDependencies;
import p040o.zzul;

public class ChequeStatusFragment extends BaseFragment implements C6382x38d8e0d1, AccountSourceSelectFragment.write {
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$MediaItem = false;
    private ChequeDetailListAdapter MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private List<validateDependencies> f3078x50fd9e4a = new ArrayList();
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    private List<String> MediaSessionCompat$QueueItem = new ArrayList();
    private View.OnClickListener MediaSessionCompat$ResultReceiverWrapper = new View.OnClickListener() {
        public final void onClick(View view) {
            FragmentBuilder_BindDeejungPlansFragment.read(ChequeStatusFragment.this.ivExpand);
            if (ChequeStatusFragment.this.viewChequeSummaryInfo.getVisibility() == 8) {
                FragmentBuilder_BindDeejungPlansFragment.write(ChequeStatusFragment.this.viewChequeSummaryInfo);
            } else {
                FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(ChequeStatusFragment.this.viewChequeSummaryInfo);
            }
        }
    };
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$Token;
    private ArrayAdapter ParcelableVolumeInfo;
    public int RatingCompat;
    @BindView
    View errorList;
    @BindView
    ImageView ivExpand;
    @HmlPinActivity
    public ConstructorConstructor.C32099 presenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    LinearLayout rootErrorNoAccount;
    @BindView
    NestedScrollView scrollView;
    private View setHasDecor;
    @BindView
    Spinner spFilter;
    @BindView
    TextView tvDownAccountLbl;
    @BindView
    TextView tvErrorNoAccountDetail;
    @BindView
    TextView tvErrorNoAccountTitle;
    @BindView
    TextView tvNoCheque;
    @BindView
    TextView tvTopAccountLbl;
    @BindView
    TextView tv_number_of_cheque;
    @BindView
    LinearLayout viewChequeSummaryInfo;
    @BindView
    View viewPaid;
    @BindView
    View viewPending;
    @BindView
    View viewReturn;
    @BindView
    LinearLayout viewRoot;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static ChequeStatusFragment IconCompatParcelizer(boolean z, int i) {
        Bundle bundle = new Bundle();
        ChequeStatusFragment chequeStatusFragment = new ChequeStatusFragment();
        bundle.putBoolean("com.scb.phone.EXTRA_IS_RECEIVED", z);
        bundle.putInt("com.scb.phone.EXTRA_SOURCE_SIZE", i);
        chequeStatusFragment.setArguments(bundle);
        return chequeStatusFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.setHasDecor = layoutInflater.inflate(R.layout.f86172131493844, viewGroup, false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ButterKnife.IconCompatParcelizer(this, this.setHasDecor);
        this.scrollView.setOnScrollChangeListener(new getBankingAgentTC(this));
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), R.layout.f81262131493352, this.MediaSessionCompat$QueueItem);
        this.ParcelableVolumeInfo = arrayAdapter;
        this.MediaSessionCompat$Token = false;
        this.spFilter.setAdapter(arrayAdapter);
        this.spFilter.setSelected(false);
        this.spFilter.setSelection(0, false);
        this.spFilter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                int unused = ChequeStatusFragment.this.RatingCompat = i;
                if (ChequeStatusFragment.this.MediaSessionCompat$Token) {
                    ChequeStatusFragment.this.ivExpand.setVisibility(4);
                    ChequeStatusFragment.this.MediaBrowserCompat$CustomActionResultReceiver();
                }
                boolean unused2 = ChequeStatusFragment.this.MediaSessionCompat$Token = true;
            }
        });
        this.MediaBrowserCompat$SearchResultReceiver = new ChequeDetailListAdapter(getContext(), this.f3078x50fd9e4a);
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setItemAnimator(new setMaxHeight());
        this.recyclerView.setHasFixedSize(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        return this.setHasDecor;
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        CrashlyticsReportJsonTransform$$Lambda$4 crashlyticsReportJsonTransform$$Lambda$4;
        super.onViewCreated(view, bundle);
        this.ivExpand.setOnClickListener(this.MediaSessionCompat$ResultReceiverWrapper);
        if (getArguments() != null) {
            this.MediaBrowserCompat$MediaItem = getArguments().getBoolean("com.scb.phone.EXTRA_IS_RECEIVED", false);
            i = getArguments().getInt("com.scb.phone.EXTRA_SOURCE_SIZE");
        } else {
            i = 0;
        }
        if (i > 0) {
            boolean z = this.MediaBrowserCompat$MediaItem;
            getString(z ? R.string.cheque_status_tab_received : R.string.cheque_status_tab_issued);
            if (z) {
                crashlyticsReportJsonTransform$$Lambda$4 = CrashlyticsReportJsonTransform$$Lambda$4.CHEQUE_STATUS_RECEIVED_FUNCTION;
            } else {
                crashlyticsReportJsonTransform$$Lambda$4 = CrashlyticsReportJsonTransform$$Lambda$4.CHEQUE_STATUS_ISSUED_FUNCTION;
            }
            CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(crashlyticsReportJsonTransform$$Lambda$4);
            write.MediaBrowserCompat$ItemReceiver = false;
            write.IconCompatParcelizer = true;
            write.MediaDescriptionCompat = true;
            write.RatingCompat = true;
            write.MediaDescriptionCompat = false;
            write.RatingCompat = false;
            write.IconCompatParcelizer = false;
            getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0))).write();
            this.rootErrorNoAccount.setVisibility(8);
            return;
        }
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem ? PayNowApi.RECEIVED : PayNowApi.ISSUED);
        String string = getString(this.MediaBrowserCompat$MediaItem ? R.string.error_deposit_cheque_no_account : R.string.error_issued_cheque_no_account);
        String string2 = getString(this.MediaBrowserCompat$MediaItem ? R.string.error_deposit_cheque_no_account_detail : R.string.error_issued_cheque_no_account_detail);
        this.tvErrorNoAccountTitle.setText(string);
        this.tvErrorNoAccountDetail.setText(string2);
        this.rootErrorNoAccount.setVisibility(0);
        this.ivExpand.setEnabled(false);
        FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.viewChequeSummaryInfo);
        this.tv_number_of_cheque.setText("0");
        write();
        ay_();
        this.ivExpand.setVisibility(4);
        this.ivExpand.setEnabled(false);
        IconCompatParcelizer();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.setHasDecor != null) {
            this.setHasDecor = null;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ComponentRuntime$$Lambda$1 componentRuntime$$Lambda$1, boolean z) {
        this.recyclerView.setVisibility(0);
        this.tvNoCheque.setVisibility(8);
        this.viewRoot.setVisibility(8);
        this.IconCompatParcelizer = false;
        this.MediaDescriptionCompat = componentRuntime$$Lambda$1.MediaBrowserCompat$ItemReceiver;
        this.MediaMetadataCompat = componentRuntime$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver.read = z;
        ChequeDetailListAdapter chequeDetailListAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        List<validateDependencies> list = componentRuntime$$Lambda$1.read;
        int i = componentRuntime$$Lambda$1.MediaBrowserCompat$ItemReceiver;
        if (chequeDetailListAdapter.write == i || list == null || list.size() <= 0) {
            chequeDetailListAdapter.read = true;
        } else {
            chequeDetailListAdapter.write = i;
            chequeDetailListAdapter.MediaBrowserCompat$ItemReceiver.addAll(list);
        }
        this.recyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        this.ivExpand.setVisibility(0);
    }

    public final void read() {
        this.ivExpand.setEnabled(false);
        FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.viewChequeSummaryInfo);
        this.tv_number_of_cheque.setText("0");
        write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ay_();
        this.ivExpand.setVisibility(4);
        this.ivExpand.setEnabled(false);
        IconCompatParcelizer();
    }

    public final void write(String str) {
        ay_();
        FragmentActivity activity = getActivity();
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.root_activity, str, getoversizeimage);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4) {
        this.tv_number_of_cheque.setText(str);
        MediaBrowserCompat$CustomActionResultReceiver(this.viewPending, getString(R.string.cheque_pending), str2, zzul.PENDING);
        MediaBrowserCompat$CustomActionResultReceiver(this.viewPaid, getString(R.string.cheque_paid), str3, zzul.PAID);
        MediaBrowserCompat$CustomActionResultReceiver(this.viewReturn, getString(R.string.cheque_return), str4, zzul.RETURN);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(View view, String str, String str2, zzul zzul) {
        ((TextView) view.findViewById(R.id.tv_cheque_summary_status)).setText(str);
        ((TextView) view.findViewById(R.id.tv_cheque_summary_money)).setText(str2);
        ((ImageView) view.findViewById(R.id.iv_cheque_summary_status)).setImageResource(write(zzul));
    }

    /* renamed from: com.scb.phone.view.fragment.chequemanagement.chequestatus.ChequeStatusFragment$2 */
    static /* synthetic */ class C58902 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.zzul[] r0 = p040o.zzul.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.zzul r1 = p040o.zzul.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.zzul r1 = p040o.zzul.PAID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.zzul r1 = p040o.zzul.RETURN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.zzul r1 = p040o.zzul.PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.chequemanagement.chequestatus.ChequeStatusFragment.C58902.<clinit>():void");
        }
    }

    private static int write(zzul zzul) {
        int[] iArr = C58902.write;
        if (zzul == null) {
            zzul = zzul.PENDING;
        }
        int i = iArr[zzul.ordinal()];
        if (i == 1) {
            return R.drawable.shape_circle_cheque_purple;
        }
        if (i != 2) {
            return i != 3 ? R.drawable.shape_circle_cheque_purple : R.drawable.shape_circle_cheque_red;
        }
        return R.drawable.shape_circle_cheque_green;
    }

    private void write() {
        this.recyclerView.setVisibility(8);
        this.viewRoot.setVisibility(0);
        this.errorList.setVisibility(0);
        this.tvNoCheque.setVisibility(8);
    }

    private void IconCompatParcelizer() {
        this.recyclerView.setVisibility(8);
        this.viewRoot.setVisibility(0);
        this.errorList.setVisibility(8);
        this.tvNoCheque.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$CustomActionResultReceiver() {
        ChequeDetailListAdapter chequeDetailListAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        chequeDetailListAdapter.read = false;
        chequeDetailListAdapter.write = -1;
        chequeDetailListAdapter.MediaBrowserCompat$ItemReceiver.clear();
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = 0;
        this.presenter.MediaBrowserCompat$ItemReceiver = 1;
        Keep();
        this.viewRoot.setVisibility(8);
        this.recyclerView.setVisibility(8);
        this.ivExpand.setEnabled(true);
        ChequeDetailListAdapter chequeDetailListAdapter2 = this.MediaBrowserCompat$SearchResultReceiver;
        chequeDetailListAdapter2.read = false;
        chequeDetailListAdapter2.write = -1;
        chequeDetailListAdapter2.MediaBrowserCompat$ItemReceiver.clear();
        this.tv_number_of_cheque.setText("0");
        FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.viewChequeSummaryInfo);
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            ConstructorConstructor.C32099 r5 = this.presenter;
            int i = this.RatingCompat;
            r5.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(ConstructorConstructor.C32099.MediaBrowserCompat$ItemReceiver(r5.MediaBrowserCompat$CustomActionResultReceiver(i), this.MediaBrowserCompat$CustomActionResultReceiver));
            ConstructorConstructor.C32099.read read = r5.write;
            if (read != null) {
                read.dispose();
            }
            ConstructorConstructor.C32099.read read2 = new ConstructorConstructor.C32099.read();
            r5.write = read2;
            r5.IconCompatParcelizer.IconCompatParcelizer(read2);
            return;
        }
        ConstructorConstructor.C32099 r52 = this.presenter;
        int i2 = this.RatingCompat;
        r52.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(ConstructorConstructor.C32099.MediaBrowserCompat$ItemReceiver(r52.MediaBrowserCompat$CustomActionResultReceiver(i2), this.MediaBrowserCompat$CustomActionResultReceiver));
        ConstructorConstructor.C32099.read read3 = r52.write;
        if (read3 != null) {
            read3.dispose();
        }
        ConstructorConstructor.C32099.read read4 = new ConstructorConstructor.C32099.read();
        r52.write = read4;
        r52.IconCompatParcelizer.IconCompatParcelizer(read4);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(PayNowApi payNowApi) {
        if (payNowApi == PayNowApi.RECEIVED) {
            this.tvTopAccountLbl.setText(R.string.cheque_lbl_to);
            this.tvDownAccountLbl.setText(R.string.cheque_lbl_from);
            return;
        }
        this.tvTopAccountLbl.setText(R.string.cheque_lbl_from);
        this.tvDownAccountLbl.setText(R.string.cheque_lbl_to);
    }

    private void write(List<String> list) {
        String format = new SimpleDateFormat("MMM").format(Calendar.getInstance().getTime());
        for (int i = 0; i < list.size(); i++) {
            if (format.contains(list.get(i))) {
                this.RatingCompat = i;
            }
        }
    }

    public final void write(processSetComponents processsetcomponents) {
        MediaBrowserCompat$CustomActionResultReceiver(processsetcomponents.MediaBrowserCompat$MediaItem, processsetcomponents.RatingCompat, processsetcomponents.IconCompatParcelizer, processsetcomponents.MediaMetadataCompat);
        if (processsetcomponents.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaSessionCompat$QueueItem.clear();
            this.MediaSessionCompat$QueueItem.addAll(processsetcomponents.MediaBrowserCompat$ItemReceiver);
            write(this.MediaSessionCompat$QueueItem);
            this.ParcelableVolumeInfo.notifyDataSetChanged();
        }
        this.ivExpand.setEnabled(true);
        this.presenter.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat);
    }

    public final void IconCompatParcelizer(initializeEagerComponents initializeeagercomponents) {
        MediaBrowserCompat$CustomActionResultReceiver(initializeeagercomponents.RatingCompat, initializeeagercomponents.MediaMetadataCompat, initializeeagercomponents.MediaBrowserCompat$CustomActionResultReceiver, initializeeagercomponents.MediaBrowserCompat$MediaItem);
        List<String> list = this.MediaSessionCompat$QueueItem;
        if (list != null) {
            list.clear();
            this.MediaSessionCompat$QueueItem.addAll(initializeeagercomponents.read);
            write(this.MediaSessionCompat$QueueItem);
            this.ParcelableVolumeInfo.notifyDataSetChanged();
        }
        this.ivExpand.setEnabled(true);
        this.presenter.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaSessionCompat$Token;
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem ? PayNowApi.RECEIVED : PayNowApi.ISSUED);
            this.ivExpand.setVisibility(4);
            ConstructorConstructor.C32099 r2 = this.presenter;
            ConstructorConstructor.C32099.read read = r2.write;
            if (read != null) {
                read.dispose();
            }
            C3212x29c7ec22 constructorConstructor$9$MediaBrowserCompat$CustomActionResultReceiver = r2.read;
            if (constructorConstructor$9$MediaBrowserCompat$CustomActionResultReceiver != null) {
                constructorConstructor$9$MediaBrowserCompat$CustomActionResultReceiver.dispose();
            }
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
