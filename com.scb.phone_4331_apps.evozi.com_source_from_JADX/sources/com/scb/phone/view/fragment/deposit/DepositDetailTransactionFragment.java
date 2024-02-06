package com.scb.phone.view.fragment.deposit;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;
import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;
import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.HmlPinActivity;
import p040o.ScriptIntrinsicBLAS;
import p040o.access$2200;
import p040o.addInput;
import p040o.getBusinessOwnerDocumentList;
import p040o.getBusinessOwnerDocumentResubmissionList;
import p040o.getLastReturnCode;
import p040o.validateGER;
import p040o.validateGER$MediaBrowserCompat$ItemReceiver;
import p040o.validateHERK;
import p040o.writeSessionApp;

public class DepositDetailTransactionFragment extends BaseFragment implements CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat, validateGER.write, validateGER$MediaBrowserCompat$ItemReceiver, DepositTransactionAdapter$MediaBrowserCompat$ItemReceiver {
    public boolean IconCompatParcelizer = false;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public validateGER MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public ScriptIntrinsicBLAS.Side MediaDescriptionCompat = new ScriptIntrinsicBLAS.Side();
    public DepositTransactionAdapter MediaMetadataCompat;
    private RecyclerView.IconCompatParcelizer MediaSessionCompat$Token;
    public Handler RatingCompat;
    @HmlPinActivity
    public getLastReturnCode mDepositTransactionPresenter;
    @BindView
    public RelativeLayout mEmptyCard;
    @BindView
    TextView mEmptyDescription;
    @BindView
    ImageView mEmptyImage;
    @BindView
    TextView mEmptyTitle;
    @BindView
    public RecyclerView mRecyclerView;
    @BindView
    public TextView mTextMessage;
    @BindView
    public TextView mTextTxn;
    @BindView
    public TextView mTextTxnMonth;
    @BindView
    public Toolbar mToolbarTxn;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDepositTransactionPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.RatingCompat = new Handler();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86642131493891, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        validateGER validateger = new validateGER(bundle != null ? bundle.getParcelable("RecyclerViewExpandableItemManager") : null);
        this.MediaBrowserCompat$MediaItem = validateger;
        validateHERK validateherk = validateger.MediaDescriptionCompat;
        if (validateherk != null) {
            validateherk.MediaMetadataCompat = this;
        } else {
            validateger.MediaBrowserCompat$CustomActionResultReceiver = this;
        }
        validateGER validateger2 = this.MediaBrowserCompat$MediaItem;
        validateHERK validateherk2 = validateger2.MediaDescriptionCompat;
        if (validateherk2 != null) {
            validateherk2.RatingCompat = this;
        } else {
            validateger2.MediaBrowserCompat$ItemReceiver = this;
        }
        DepositTransactionAdapter depositTransactionAdapter = new DepositTransactionAdapter(getContext(), this.MediaBrowserCompat$MediaItem, this);
        this.MediaMetadataCompat = depositTransactionAdapter;
        this.MediaSessionCompat$Token = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) depositTransactionAdapter);
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.MediaSessionCompat$Token);
        this.mRecyclerView.setItemAnimator(addinput);
        this.mRecyclerView.setHasFixedSize(false);
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this.mRecyclerView);
        this.mToolbarTxn.IconCompatParcelizer(R.menu.f93072131558412);
        this.mTextTxnMonth.setVisibility(8);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        validateGER validateger = this.MediaBrowserCompat$MediaItem;
        if (validateger != null) {
            bundle.putParcelable("RecyclerViewExpandableItemManager", validateger.read());
        }
    }

    public void onDestroyView() {
        this.mDepositTransactionPresenter.onDestroy();
        validateGER validateger = this.MediaBrowserCompat$MediaItem;
        if (validateger != null) {
            validateger.write();
            this.MediaBrowserCompat$MediaItem = null;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.mRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.mRecyclerView = null;
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaSessionCompat$Token;
        if (iconCompatParcelizer != null) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
            this.MediaSessionCompat$Token = null;
        }
        this.RatingCompat = null;
        super.onDestroyView();
    }

    public final void read(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void write(String str) {
        ay_();
        this.mEmptyCard.setVisibility(8);
        this.mTextMessage.setText(str);
        this.mTextMessage.setVisibility(0);
        this.mRecyclerView.setVisibility(8);
        this.mToolbarTxn.setVisibility(0);
    }

    public final void read() {
        this.mTextMessage.setVisibility(8);
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
        this.mEmptyTitle.setGravity(3);
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
        this.mEmptyCard.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        read(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(int r11, java.lang.String r12) {
        /*
            r10 = this;
            o.getLastReturnCode r0 = r10.mDepositTransactionPresenter
            if (r11 < 0) goto L_0x00d0
            o.isUnderground r1 = r0.IconCompatParcelizer
            java.util.List<o.activate> r1 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x00d0
            r0.MediaBrowserCompat$SearchResultReceiver = r11
            r0.MediaMetadataCompat = r12
            o.isUnderground r1 = r0.IconCompatParcelizer
            java.util.List<o.activate> r1 = r1.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r1 = r1.get(r11)
            o.activate r1 = (p040o.activate) r1
            java.lang.String r2 = r1.write
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0026
            int r2 = r2.length()
            if (r2 == 0) goto L_0x0026
            r2 = r4
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            r5 = 3
            if (r2 == 0) goto L_0x003b
            if (r12 == 0) goto L_0x0034
            int r1 = r12.length()
            if (r1 == 0) goto L_0x0034
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            if (r1 == 0) goto L_0x0039
        L_0x0037:
            r1 = r4
            goto L_0x0054
        L_0x0039:
            r1 = r3
            goto L_0x0054
        L_0x003b:
            if (r12 == 0) goto L_0x0045
            int r2 = r12.length()
            if (r2 == 0) goto L_0x0045
            r2 = r4
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            if (r2 == 0) goto L_0x004a
            r1 = r5
            goto L_0x0054
        L_0x004a:
            java.lang.String r1 = r1.write
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L_0x0053
            goto L_0x0037
        L_0x0053:
            r1 = 2
        L_0x0054:
            o.isUnderground r2 = r0.IconCompatParcelizer
            o.immediateCheckedFuture r6 = r0.write
            o.getShortName r6 = r6.setBackgroundResource
            java.lang.String r6 = r6.value
            java.util.List<o.activate> r7 = r2.MediaBrowserCompat$SearchResultReceiver
            r8 = 0
            if (r7 == 0) goto L_0x006a
            java.util.List<o.activate> r7 = r2.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r11 = r7.get(r11)
            o.activate r11 = (p040o.activate) r11
            goto L_0x006b
        L_0x006a:
            r11 = r8
        L_0x006b:
            if (r11 == 0) goto L_0x00a1
            o.poll$MediaBrowserCompat$CustomActionResultReceiver r7 = new o.poll$MediaBrowserCompat$CustomActionResultReceiver
            r7.<init>()
            r7.MediaBrowserCompat$ItemReceiver = r6
            java.lang.String r2 = r2.write
            r7.IconCompatParcelizer = r2
            int r2 = r11.f2796x50fd9e4a
            r7.MediaDescriptionCompat = r2
            java.lang.String r2 = r11.ParcelableVolumeInfo
            r7.MediaBrowserCompat$SearchResultReceiver = r2
            java.lang.String r2 = r11.MediaBrowserCompat$SearchResultReceiver
            r7.MediaMetadataCompat = r2
            java.lang.String r2 = r11.MediaMetadataCompat
            r7.MediaBrowserCompat$MediaItem = r2
            o.isFlat r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r2.type
            r7.RatingCompat = r2
            double r8 = r11.MediaBrowserCompat$ItemReceiver
            r7.MediaBrowserCompat$CustomActionResultReceiver = r8
            if (r1 != r5) goto L_0x0096
            java.lang.String r12 = r11.write
        L_0x0096:
            r7.read = r12
            java.lang.String r11 = r11.read
            r7.write = r11
            o.poll r8 = new o.poll
            r8.<init>(r7, r4)
        L_0x00a1:
            o.nativeValidate r11 = new o.nativeValidate
            r11.<init>(r1)
            T r12 = r0.RatingCompat
            if (r12 == 0) goto L_0x00ac
            r12 = r3
            goto L_0x00ad
        L_0x00ac:
            r12 = r4
        L_0x00ad:
            if (r12 == 0) goto L_0x00b4
            T r12 = r0.RatingCompat
            r11.IconCompatParcelizer(r12)
        L_0x00b4:
            T r11 = r0.RatingCompat
            if (r11 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r3 = r4
        L_0x00ba:
            if (r3 == 0) goto L_0x00c1
            T r11 = r0.RatingCompat
            r11.AlertController$RecycleListView()
        L_0x00c1:
            o.icon r11 = r0.MediaBrowserCompat$MediaItem
            r11.write(r8, r1)
            o.icon r11 = r0.MediaBrowserCompat$MediaItem
            o.getLastReturnCode$IconCompatParcelizer r12 = new o.getLastReturnCode$IconCompatParcelizer
            r12.<init>(r0, r4)
            r11.IconCompatParcelizer(r12)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment.write(int, java.lang.String):void");
    }

    public final void IconCompatParcelizer(access$2200 access_2200) {
        write(access_2200);
    }

    public final void IconCompatParcelizer() {
        DepositTransactionAdapter depositTransactionAdapter = this.MediaMetadataCompat;
        int i = depositTransactionAdapter.MediaBrowserCompat$ItemReceiver;
        if (i >= 0) {
            writeSessionApp writesessionapp = depositTransactionAdapter.MediaBrowserCompat$MediaItem.get(i);
            writesessionapp.IconCompatParcelizer = depositTransactionAdapter.read;
            DepositTransactionAdapter.MediaBrowserCompat$CustomActionResultReceiver(writesessionapp);
            depositTransactionAdapter.IconCompatParcelizer.write();
            depositTransactionAdapter.MediaBrowserCompat$ItemReceiver = -1;
            depositTransactionAdapter.read = "";
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        DepositTransactionAdapter depositTransactionAdapter = this.MediaMetadataCompat;
        int i = depositTransactionAdapter.MediaBrowserCompat$ItemReceiver;
        if (i >= 0) {
            DepositTransactionAdapter.MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter.MediaBrowserCompat$MediaItem.get(i));
            depositTransactionAdapter.IconCompatParcelizer.write();
            depositTransactionAdapter.MediaBrowserCompat$ItemReceiver = -1;
            depositTransactionAdapter.read = "";
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 0) {
            if (i == 1) {
                this.MediaDescriptionCompat.read("save_note", ProductAction.ACTION_ADD);
            } else {
                this.MediaDescriptionCompat.read("save_note", "update");
            }
            ScriptIntrinsicBLAS.Side side = this.MediaDescriptionCompat;
            if (getActivity() != null) {
                side.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "annotation_save");
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<writeSessionApp> list, String str) {
        validateHERK validateherk;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str2 != null && str != null && str.equals(str2)) {
            ay_();
            if (list != null && !isDetached()) {
                this.mToolbarTxn.setVisibility(0);
                if (list.isEmpty()) {
                    this.mTextMessage.setVisibility(0);
                    this.mRecyclerView.setVisibility(8);
                    return;
                }
                this.mTextMessage.setVisibility(8);
                this.mRecyclerView.setVisibility(0);
                this.mRecyclerView.setFocusable(false);
                DepositTransactionAdapter depositTransactionAdapter = this.MediaMetadataCompat;
                depositTransactionAdapter.MediaBrowserCompat$MediaItem.clear();
                depositTransactionAdapter.MediaBrowserCompat$MediaItem.addAll(list);
                depositTransactionAdapter.IconCompatParcelizer.write();
                for (int i = 0; i < list.size(); i++) {
                    writeSessionApp writesessionapp = list.get(i);
                    if (!(writesessionapp == null || !writesessionapp.MediaBrowserCompat$MediaItem || (validateherk = this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat) == null)) {
                        boolean read = validateherk.read(i, false, (Object) null);
                    }
                }
                this.mRecyclerView.setFocusable(true);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        writeSessionApp IconCompatParcelizer2 = IconCompatParcelizer(i);
        if (IconCompatParcelizer2 != null) {
            IconCompatParcelizer2.MediaBrowserCompat$MediaItem = true;
        }
        read(i, 0);
    }

    public final void read(int i) {
        writeSessionApp IconCompatParcelizer2 = IconCompatParcelizer(i);
        if (IconCompatParcelizer2 != null) {
            IconCompatParcelizer2.MediaBrowserCompat$MediaItem = false;
        }
        read(i, 0);
    }

    private void read(int i, int i2) {
        int i3;
        int i4 = i + 1;
        if (i4 >= this.mRecyclerView.getChildCount()) {
            i3 = this.mRecyclerView.getTop() + this.mRecyclerView.getHeight() + i2;
        } else {
            i3 = this.mRecyclerView.getTop() + this.mRecyclerView.getChildAt(i4).getTop() + i2;
        }
        ((DepositDetailActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver = i3;
    }

    private writeSessionApp IconCompatParcelizer(int i) {
        List<writeSessionApp> list = this.MediaMetadataCompat.MediaBrowserCompat$MediaItem;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public final void aw_() {
        if (this.IconCompatParcelizer) {
            DepositTransactionAdapter depositTransactionAdapter = this.MediaMetadataCompat;
            Handler handler = this.RatingCompat;
            if (!isDetached() && handler != null && depositTransactionAdapter != null) {
                handler.post(new getBusinessOwnerDocumentResubmissionList(this, depositTransactionAdapter));
            }
        }
    }

    public final void write(List<writeSessionApp> list, String str) {
        String str2;
        DepositTransactionAdapter depositTransactionAdapter = this.MediaMetadataCompat;
        Handler handler = this.RatingCompat;
        if (!isDetached() && handler != null && this.MediaMetadataCompat != null && (str2 = this.MediaBrowserCompat$SearchResultReceiver) != null && str.equals(str2)) {
            handler.post(new getBusinessOwnerDocumentList(depositTransactionAdapter, list));
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter depositTransactionAdapter, List list) {
        depositTransactionAdapter.MediaBrowserCompat$CustomActionResultReceiver(false, (DepositTransactionAdapter.read) null);
        if (!list.isEmpty()) {
            int size = depositTransactionAdapter.MediaBrowserCompat$MediaItem.size();
            int size2 = list.size();
            depositTransactionAdapter.MediaBrowserCompat$MediaItem.addAll(list);
            depositTransactionAdapter.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(size, size2);
            depositTransactionAdapter.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(size - 1, 1);
        }
    }

    public final void write() {
        Keep();
        this.mTextMessage.setVisibility(8);
        this.mToolbarTxn.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
    }
}
