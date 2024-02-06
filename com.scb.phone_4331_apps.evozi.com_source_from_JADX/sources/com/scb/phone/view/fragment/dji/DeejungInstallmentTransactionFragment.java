package com.scb.phone.view.fragment.dji;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.cardmanagement.UnbilledTransactionsAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.FirebaseApiNotAvailableException;
import p040o.FirebaseApp;
import p040o.HmlPinActivity;
import p040o.IdWorkflowActivity_MembersInjector;
import p040o.KtaIdExtractor_Factory;
import p040o.XVrsBlur;
import p040o.access$2200;
import p040o.onGetStartedClick;
import p040o.setExtractorListener;

public final class DeejungInstallmentTransactionFragment extends BaseFragment implements IdWorkflowActivity_MembersInjector, setExtractorListener {
    public String IconCompatParcelizer = "00";
    public KtaIdExtractor_Factory MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaMetadataCompat = "";
    private UnbilledTransactionsAdapter RatingCompat = new UnbilledTransactionsAdapter();
    @BindView
    public LinearLayout mEligibleMoreHolder;
    @BindView
    public TextView mErrorDescription;
    @BindView
    public ConstraintLayout mErrorHolder;
    @BindView
    public ImageView mErrorImageView;
    @BindView
    public TextView mErrorTitle;
    @HmlPinActivity
    public XVrsBlur mPresenter;
    @BindView
    public RecyclerView mRecyclerView;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [o.XVrsDocumentBoundary] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r8 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r8)
            r8 = 0
            r0 = 2131493885(0x7f0c03fd, float:1.8611263E38)
            android.view.View r6 = r6.inflate(r0, r7, r8)
            butterknife.ButterKnife.IconCompatParcelizer(r5, r6)
            o.XVrsBlur r7 = r5.mPresenter
            java.lang.String r0 = "mPresenter"
            if (r7 != 0) goto L_0x0019
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0019:
            r1 = r5
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r7.MediaBrowserCompat$ItemReceiver(r1)
            o.XVrsBlur r7 = r5.mPresenter
            if (r7 != 0) goto L_0x0026
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0026:
            java.lang.String r0 = r5.MediaMetadataCompat
            java.lang.String r1 = r5.IconCompatParcelizer
            java.lang.String r2 = "cardRefNo"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            java.lang.String r2 = "cycleNo"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            o.XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.XVrsBlur$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            if (r2 == 0) goto L_0x0040
            o.XVrsDocumentBoundary r3 = new o.XVrsDocumentBoundary
            r3.<init>(r2)
            r2 = r3
        L_0x0040:
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r3 = r7.RatingCompat
            r4 = 1
            if (r3 == 0) goto L_0x0049
            r3 = r4
            goto L_0x004a
        L_0x0049:
            r3 = r8
        L_0x004a:
            if (r3 == 0) goto L_0x0051
            T r3 = r7.RatingCompat
            r2.IconCompatParcelizer(r3)
        L_0x0051:
            o.getLocalPort r2 = r7.MediaBrowserCompat$ItemReceiver
            o.ConcurrentHashMultiset$EntrySet r3 = new o.ConcurrentHashMultiset$EntrySet
            r3.<init>(r0, r1)
            r2.MediaBrowserCompat$ItemReceiver((p040o.ConcurrentHashMultiset.EntrySet) r3)
            o.getLocalPort r0 = r7.MediaBrowserCompat$ItemReceiver
            o.XVrsBlur$IconCompatParcelizer r1 = new o.XVrsBlur$IconCompatParcelizer
            r1.<init>()
            o.IndoorBuilding$MediaBrowserCompat$ItemReceiver r1 = (p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver) r1
            r0.IconCompatParcelizer(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
            java.lang.String r0 = "mRecyclerView"
            if (r7 != 0) goto L_0x0070
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0070:
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r5.getContext()
            r1.<init>(r4, r8)
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r1 = (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver) r1
            r7.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
            if (r7 != 0) goto L_0x0084
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0084:
            r7.setNestedScrollingEnabled(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
            if (r7 != 0) goto L_0x008e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x008e:
            o.GoogleSigninService r8 = new o.GoogleSigninService
            r8.<init>()
            androidx.recyclerview.widget.RecyclerView$RatingCompat r8 = (androidx.recyclerview.widget.RecyclerView.RatingCompat) r8
            r1 = -1
            r7.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView.RatingCompat) r8, (int) r1)
            androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
            if (r7 != 0) goto L_0x00a0
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x00a0:
            com.scb.phone.view.adapter.cardmanagement.UnbilledTransactionsAdapter r8 = r5.RatingCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r8 = (androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer) r8
            r7.setAdapter(r8)
            com.scb.phone.view.adapter.cardmanagement.UnbilledTransactionsAdapter r7 = r5.RatingCompat
            r8 = r5
            o.setExtractorListener r8 = (p040o.setExtractorListener) r8
            r7.read = r8
            android.widget.LinearLayout r7 = r5.mEligibleMoreHolder
            if (r7 != 0) goto L_0x00b7
            java.lang.String r8 = "mEligibleMoreHolder"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00b7:
            com.scb.phone.view.fragment.dji.DeejungInstallmentTransactionFragment$MediaBrowserCompat$ItemReceiver r8 = new com.scb.phone.view.fragment.dji.DeejungInstallmentTransactionFragment$MediaBrowserCompat$ItemReceiver
            r8.<init>(r5)
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            r7.setOnClickListener(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.dji.DeejungInstallmentTransactionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final boolean read() {
        KtaIdExtractor_Factory ktaIdExtractor_Factory = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ktaIdExtractor_Factory == null) {
            return true;
        }
        if (ktaIdExtractor_Factory.MediaBrowserCompat$CustomActionResultReceiver()) {
            return false;
        }
        ktaIdExtractor_Factory.IconCompatParcelizer();
        return true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(FirebaseApp firebaseApp, boolean z) {
        onGetStartedClick.write((Object) firebaseApp, "cardTransactionModel");
        KtaIdExtractor_Factory ktaIdExtractor_Factory = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ktaIdExtractor_Factory != null) {
            ktaIdExtractor_Factory.write(firebaseApp, z);
        }
    }

    public final void read(String str, String str2) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "description");
        MediaBrowserCompat$CustomActionResultReceiver(str, str2, R.drawable.empty_state_icon);
        LinearLayout linearLayout = this.mEligibleMoreHolder;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEligibleMoreHolder");
        }
        linearLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "description");
        MediaBrowserCompat$CustomActionResultReceiver(str, str2, R.drawable.empty_state_icon);
        LinearLayout linearLayout = this.mEligibleMoreHolder;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEligibleMoreHolder");
        }
        linearLayout.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "description");
        MediaBrowserCompat$CustomActionResultReceiver(str, str2, R.drawable.ic_coming_soon);
        LinearLayout linearLayout = this.mEligibleMoreHolder;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEligibleMoreHolder");
        }
        linearLayout.setVisibility(8);
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, int i) {
        ConstraintLayout constraintLayout = this.mErrorHolder;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorHolder");
        }
        constraintLayout.setVisibility(0);
        TextView textView = this.mErrorTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorTitle");
        }
        textView.setText(str);
        TextView textView2 = this.mErrorDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorDescription");
        }
        textView2.setText(str2);
        ImageView imageView = this.mErrorImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorImageView");
        }
        imageView.setImageResource(i);
    }

    public final void read(FirebaseApiNotAvailableException firebaseApiNotAvailableException) {
        onGetStartedClick.write((Object) firebaseApiNotAvailableException, "dto");
        List<FirebaseApp> list = firebaseApiNotAvailableException.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) list, "dto.transactions");
        UnbilledTransactionsAdapter unbilledTransactionsAdapter = this.RatingCompat;
        unbilledTransactionsAdapter.write = list;
        unbilledTransactionsAdapter.IconCompatParcelizer.write();
        KtaIdExtractor_Factory ktaIdExtractor_Factory = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ktaIdExtractor_Factory != null) {
            ktaIdExtractor_Factory.IconCompatParcelizer(firebaseApiNotAvailableException);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        onGetStartedClick.write((Object) access_2200, "error");
        String str = access_2200.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "error.title");
        String str2 = access_2200.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "error.message");
        MediaBrowserCompat$CustomActionResultReceiver(str, str2, R.drawable.ic_notice);
        LinearLayout linearLayout = this.mEligibleMoreHolder;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEligibleMoreHolder");
        }
        linearLayout.setVisibility(8);
    }
}
