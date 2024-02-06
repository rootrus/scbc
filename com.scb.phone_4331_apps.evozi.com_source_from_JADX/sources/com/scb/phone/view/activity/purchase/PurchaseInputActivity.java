package com.scb.phone.view.activity.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.purchase.PurchaseInputActivity;
import com.scb.phone.view.fragment.purchase.PurchaseFromTabSelectionFragment;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsReport;
import p040o.ZSYR2K;
import p040o.getAllowEnterTransitionOverlap;
import p040o.getSharedElementEnterTransition;
import p040o.onPageScrollStateChanged;
import p040o.parseDevice;
import p040o.show;

public class PurchaseInputActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79502131493175);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.scbAnalytics.write("purchase_landing", new ZSYR2K("source", read("source", "")));
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.purchase_header));
        setTabContainer();
        Intent intent = getIntent();
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = intent != null ? (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) intent.getParcelableExtra("com.scb.phone.EXTRA_DISPLAY") : null;
        PurchaseFromTabSelectionFragment purchaseFromTabSelectionFragment = (PurchaseFromTabSelectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_purchase_selection_tab);
        if (purchaseFromTabSelectionFragment != null && builder != null) {
            purchaseFromTabSelectionFragment.MediaBrowserCompat$CustomActionResultReceiver = builder;
            List<parseDevice> list = builder.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            show show = new show(list);
            purchaseFromTabSelectionFragment.MediaBrowserCompat$CustomActionResultReceiver("PCC".equals(builder.MediaBrowserCompat$SearchResultReceiver) ? "CREDIT_CARD_ONLY" : "DEPOSIT_AND_CREDIT_CARD", (String[]) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, onPageScrollStateChanged.MediaBrowserCompat$ItemReceiver)).MediaBrowserCompat$ItemReceiver((getAllowEnterTransitionOverlap<R[]>) new getAllowEnterTransitionOverlap(list) {
                private final /* synthetic */ List write;

                {
                    this.write = r1;
                }

                public final Object read(int i) {
                    return PurchaseInputActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                }
            }));
        }
    }

    public static /* synthetic */ String[] MediaBrowserCompat$CustomActionResultReceiver(List list) {
        return new String[list.size()];
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.purchase_header));
        setTabContainer();
    }
}
