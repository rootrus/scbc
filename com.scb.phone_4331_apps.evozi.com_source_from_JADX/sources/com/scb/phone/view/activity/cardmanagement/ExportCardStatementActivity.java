package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.EStatementsSuccessfulActivity;
import com.scb.phone.view.adapter.cardmanagement.ExportCardStatementSelectionAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AnalyticsConnector;
import p040o.Constraints;
import p040o.FirebaseVisionPoint;
import p040o.FirebaseVisionPoint$MediaBrowserCompat$MediaItem;
import p040o.FirebaseVisionPoint$MediaBrowserCompat$SearchResultReceiver;
import p040o.FundFactSheetActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.emptyIterator;
import p040o.getPort;
import p040o.onGetStartedClick;
import p040o.setExtractionServer;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ExportCardStatementActivity extends BaseActivity implements setExtractionServer, ExportCardStatementSelectionAdapter.read {
    private ExportCardStatementSelectionAdapter MediaDescriptionCompat;
    @BindView
    public Button btnActionNext;
    @HmlPinActivity
    public FirebaseVisionPoint presenter;
    @BindView
    public RecyclerView rvCycleSelection;

    public static final Intent IconCompatParcelizer(Context context, chain chain) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) chain, "selectedCard");
        Intent intent = new Intent(context, ExportCardStatementActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_SELECTED_CREDIT_CARD", chain);
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77832131493008);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.ccm_e_statement_selection_title);
        FirebaseVisionPoint firebaseVisionPoint = this.presenter;
        if (firebaseVisionPoint == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseVisionPoint.MediaBrowserCompat$ItemReceiver(this);
        FirebaseVisionPoint firebaseVisionPoint2 = this.presenter;
        if (firebaseVisionPoint2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Intent intent = getIntent();
        chain chain = intent != null ? (chain) intent.getParcelableExtra("com.scb.phone.EXTRA_SELECTED_CREDIT_CARD") : null;
        firebaseVisionPoint2.read = chain;
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new FirebaseVisionPoint.MediaDescriptionCompat(firebaseVisionPoint2, chain);
        if (firebaseVisionPoint2.RatingCompat != null) {
            mediaDescriptionCompat.IconCompatParcelizer(firebaseVisionPoint2.RatingCompat);
        }
        ExportCardStatementSelectionAdapter exportCardStatementSelectionAdapter = new ExportCardStatementSelectionAdapter();
        RecyclerView recyclerView = this.rvCycleSelection;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCycleSelection");
        }
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = recyclerView.setPadding;
        if (recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver == null) {
            recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver = new RecyclerView$MediaSessionCompat$QueueItem();
        }
        exportCardStatementSelectionAdapter.write = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver;
        exportCardStatementSelectionAdapter.read = this;
        this.MediaDescriptionCompat = exportCardStatementSelectionAdapter;
        RecyclerView recyclerView2 = this.rvCycleSelection;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCycleSelection");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = this.rvCycleSelection;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCycleSelection");
        }
        recyclerView3.setAdapter(this.MediaDescriptionCompat);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.ccm_e_statement_selection_title);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.btnActionNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnActionNext");
        }
        button.setEnabled(z);
    }

    public final void read(List<AnalyticsConnector.AnalyticsConnectorHandle> list) {
        onGetStartedClick.write((Object) list, "cycles");
        ExportCardStatementSelectionAdapter exportCardStatementSelectionAdapter = this.MediaDescriptionCompat;
        if (exportCardStatementSelectionAdapter != null) {
            exportCardStatementSelectionAdapter.MediaBrowserCompat$ItemReceiver = list;
            exportCardStatementSelectionAdapter.IconCompatParcelizer.write();
        }
    }

    public final void read() {
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        List<AnalyticsConnector.AnalyticsConnectorHandle> list;
        onGetStartedClick.write((Object) analyticsConnectorListener, "display");
        FirebaseVisionPoint firebaseVisionPoint = this.presenter;
        if (firebaseVisionPoint == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ExportCardStatementSelectionAdapter exportCardStatementSelectionAdapter = this.MediaDescriptionCompat;
        if (exportCardStatementSelectionAdapter == null || (list = exportCardStatementSelectionAdapter.MediaBrowserCompat$ItemReceiver) == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        onGetStartedClick.write((Object) list, "selectedItems");
        Collection arrayList = new ArrayList();
        for (AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle : list) {
            List<AnalyticsConnector.AnalyticsConnectorListener> list2 = analyticsConnectorHandle.IconCompatParcelizer;
            if (list2 == null) {
                list2 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList, list2);
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            if (((AnalyticsConnector.AnalyticsConnectorListener) next).MediaBrowserCompat$ItemReceiver) {
                arrayList2.add(next);
            }
        }
        List<AnalyticsConnector.AnalyticsConnectorListener> list3 = (List) arrayList2;
        firebaseVisionPoint.MediaBrowserCompat$ItemReceiver = list3;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new FirebaseVisionPoint.IconCompatParcelizer(list3);
        if (firebaseVisionPoint.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(Integer num) {
        FirebaseVisionPoint firebaseVisionPoint = this.presenter;
        if (firebaseVisionPoint == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String string = getString(R.string.error_default_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.error_default_title)");
        Object[] objArr = new Object[1];
        objArr[0] = num != null ? String.valueOf(num.intValue()) : null;
        String string2 = getString(R.string.max_select_billing_cycles_err, objArr);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.max_s…r, maxSelect?.toString())");
        onGetStartedClick.write((Object) string, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) string2, "msg");
        firebaseVisionPoint.read(string, string2);
    }

    public final void IconCompatParcelizer(String str, List<String> list, chain chain) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) list, "selectedMonths");
        onGetStartedClick.write((Object) chain, "selectedCard");
        EStatementsSuccessfulActivity.IconCompatParcelizer iconCompatParcelizer = EStatementsSuccessfulActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        ArrayList arrayList = new ArrayList(list);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) arrayList, "selectedMonths");
        Intent intent = new Intent(context, EStatementsSuccessfulActivity.class);
        intent.putExtra("CREDIT_CARD_DISPLAY_KEY", chain);
        intent.putExtra("EMAIL_KEY", str);
        intent.putStringArrayListExtra("LIST_BILLED_CYCLE_KEY", arrayList);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    @OnClick
    public final void onClickActionNext() {
        String str;
        ExportCardStatementSelectionAdapter exportCardStatementSelectionAdapter = this.MediaDescriptionCompat;
        if (exportCardStatementSelectionAdapter != null && exportCardStatementSelectionAdapter.MediaBrowserCompat$ItemReceiver != null) {
            FirebaseVisionPoint firebaseVisionPoint = this.presenter;
            if (firebaseVisionPoint == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            chain chain = firebaseVisionPoint.read;
            if (chain != null && (str = chain.MediaDescriptionCompat) != null) {
                boolean z = true;
                if (!firebaseVisionPoint.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseVisionPoint$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
                    if (firebaseVisionPoint.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
                    }
                    Collection arrayList = new ArrayList();
                    for (AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener : firebaseVisionPoint.MediaBrowserCompat$ItemReceiver) {
                        String str2 = analyticsConnectorListener.IconCompatParcelizer;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    List list = (List) arrayList;
                    emptyIterator emptyiterator = firebaseVisionPoint.IconCompatParcelizer;
                    FundFactSheetActivity mediaMetadataCompat = new FirebaseVisionPoint.MediaMetadataCompat(firebaseVisionPoint);
                    FundFactSheetActivity firebaseVisionPoint$MediaBrowserCompat$MediaItem = new FirebaseVisionPoint$MediaBrowserCompat$MediaItem(firebaseVisionPoint);
                    onGetStartedClick.write((Object) str, "cardRef");
                    onGetStartedClick.write((Object) list, "selectedMonths");
                    onGetStartedClick.write((Object) mediaMetadataCompat, "onSuccess");
                    onGetStartedClick.write((Object) firebaseVisionPoint$MediaBrowserCompat$MediaItem, "onError");
                    emptyiterator.write.IconCompatParcelizer(mediaMetadataCompat, firebaseVisionPoint$MediaBrowserCompat$MediaItem, new getPort.read(str, new Constraints.ConstrainedList(list)), emptyiterator.MediaBrowserCompat$ItemReceiver);
                }
            }
        }
    }

    public final void onDestroy() {
        FirebaseVisionPoint firebaseVisionPoint = this.presenter;
        if (firebaseVisionPoint == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseVisionPoint.onDestroy();
        if (this.MediaDescriptionCompat != null) {
            ExportCardStatementSelectionAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.scbAnalytics.write("requestccstmt_landing", new ZSYR2K("source", "services_tab"));
    }

    public static final class write {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public final String RatingCompat;
        public final String read;
        public final String write;

        private write() {
        }

        public write(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8) {
            onGetStartedClick.write((Object) str, "schemeId");
            onGetStartedClick.write((Object) str2, "code");
            onGetStartedClick.write((Object) str3, "descriptionTH");
            onGetStartedClick.write((Object) str4, "descriptionEN");
            onGetStartedClick.write((Object) str5, "remarksTH");
            onGetStartedClick.write((Object) str6, "remarksEN");
            onGetStartedClick.write((Object) str7, "classificationId");
            onGetStartedClick.write((Object) str8, "parentId");
            this.MediaDescriptionCompat = str;
            this.write = str2;
            this.MediaMetadataCompat = i;
            this.read = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.RatingCompat = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = str7;
            this.IconCompatParcelizer = str8;
        }
    }

    public final void write() {
        this.scbAnalytics.write("requestccstmt_successful", new ZSYR2K[0]);
    }
}
