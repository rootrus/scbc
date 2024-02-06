package com.scb.phone.view.activity.etb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.etb.ETBSaleSheetAccountTypeAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C7378pq;
import p040o.FragmentBuilder_BindBondPurchaseSuccessFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.doOpenSession;
import p040o.ensureAnimationInfo;
import p040o.getArguments;
import p040o.getNextTransition;
import p040o.setTapText;
import p040o.setupDialog;
import p040o.show;

public class ETBSaleSheetAccountTypeActivity extends BaseActivity implements FragmentBuilder_BindBondPurchaseSuccessFragment {
    @BindView
    RecyclerView recyclerView;

    public static Intent read(Context context, List<doOpenSession> list, String str) {
        return new Intent(context, ETBSaleSheetAccountTypeActivity.class).putParcelableArrayListExtra("com.scb.phone.view.activity.etb.EXTRA_DEPOSIT_ACCOUNT_LIST", new ArrayList(list)).putExtra("DEPOSIT", str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77782131493003);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.etb_sale_sheet_title));
        setTabContainer();
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.scb.phone.view.activity.etb.EXTRA_DEPOSIT_ACCOUNT_LIST");
        if (parcelableArrayListExtra != null) {
            show show = new show(parcelableArrayListExtra);
            C7378pq pqVar = C7378pq.write;
            this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.recyclerView.setAdapter(new ETBSaleSheetAccountTypeAdapter((List) new show(show.write, new getNextTransition(show.IconCompatParcelizer, pqVar)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                public final /* synthetic */ Object read() {
                    return new ArrayList();
                }
            }, new ensureAnimationInfo<List<T>, T>() {
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                    ((List) obj).add(obj2);
                }
            })), this));
            return;
        }
        finish();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.etb_sale_sheet_title));
        setTabContainer();
    }

    public static /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(doOpenSession doopensession) {
        return Integer.parseInt(DiskLruCache.VERSION_1) == doopensession.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(doOpenSession doopensession) {
        Intent write = ETBSaleSheetProductListActivity.write(this, doopensession, doopensession.MediaBrowserCompat$ItemReceiver, doopensession.IconCompatParcelizer);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
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
    }
}
