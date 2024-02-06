package com.scb.phone.view.activity.bond;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.bond.BondSelectionListAdapter;
import com.scb.phone.view.adapter.bond.BondSelectionListAdapter$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.CreditCardCaptureModule_GetExtractionParametersFactory;
import p040o.HeartBeatInfo;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.cannotBeInline;
import p040o.isTerminated;
import p040o.setTapText;

public class BondSelectionActivity extends BaseActivity implements CreditCardCaptureModule_GetExtractionParametersFactory, BondSelectionListAdapter$MediaBrowserCompat$ItemReceiver {
    private BondSelectionListAdapter MediaDescriptionCompat;
    @BindView
    RecyclerView bondSelectionRecycler;
    @HmlPinActivity
    public HeartBeatInfo.HeartBeat presenter;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, List<isTerminated> list) {
        return new Intent(context, BondSelectionActivity.class).putParcelableArrayListExtra("BOND_SELECTION_DISPLAYS_EXTRA", new ArrayList(list));
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, List<isTerminated> list, isTerminated isterminated) {
        return new Intent(context, BondSelectionActivity.class).putExtra("SELECTED_BOND_DISPLAY", isterminated).putParcelableArrayListExtra("BOND_SELECTION_DISPLAYS_EXTRA", new ArrayList(list));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76822131492907);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.bond_selection_title));
        setTabContainer();
        boolean z = false;
        this.bondSelectionRecycler.setLayoutManager(new LinearLayoutManager(1, false));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("BOND_SELECTION_DISPLAYS_EXTRA")) {
            HeartBeatInfo.HeartBeat heartBeat = this.presenter;
            ArrayList parcelableArrayList = extras.getParcelableArrayList("BOND_SELECTION_DISPLAYS_EXTRA");
            isTerminated isterminated = (isTerminated) extras.getParcelable("SELECTED_BOND_DISPLAY");
            if (isterminated != null && parcelableArrayList.contains(isterminated)) {
                ((isTerminated) parcelableArrayList.get(parcelableArrayList.indexOf(isterminated))).RatingCompat = true;
            }
            cannotBeInline cannotbeinline = new cannotBeInline(parcelableArrayList);
            if (heartBeat.RatingCompat != null) {
                z = true;
            }
            if (z) {
                cannotbeinline.IconCompatParcelizer(heartBeat.RatingCompat);
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.bond_selection_title));
    }

    public final void write(List<isTerminated> list) {
        BondSelectionListAdapter bondSelectionListAdapter = this.MediaDescriptionCompat;
        if (bondSelectionListAdapter == null) {
            BondSelectionListAdapter bondSelectionListAdapter2 = new BondSelectionListAdapter(list, this);
            this.MediaDescriptionCompat = bondSelectionListAdapter2;
            this.bondSelectionRecycler.setAdapter(bondSelectionListAdapter2);
            return;
        }
        bondSelectionListAdapter.MediaBrowserCompat$ItemReceiver = list;
        this.MediaDescriptionCompat.IconCompatParcelizer.write();
    }

    public final void write(isTerminated isterminated) {
        Intent intent = new Intent();
        intent.putExtra("BOND_SELECTED_DISPLAY_EXTRA", isterminated);
        setResult(-1, intent);
        finish();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
