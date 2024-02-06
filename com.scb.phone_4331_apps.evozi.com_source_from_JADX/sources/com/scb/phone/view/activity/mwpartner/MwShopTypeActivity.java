package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.mwpartner.MwShopTypeActivity;
import com.scb.phone.view.adapter.mwpartner.MwShopTypeAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.C1594tV;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getAltClassificationConfidence;
import p040o.getNextTransition;
import p040o.getStartTime;
import p040o.isSupportFragmentClass;
import p040o.postErrorInfoBusEvent;
import p040o.setEventType;
import p040o.setProcessedImage;
import p040o.setTapText;
import p040o.show;

public class MwShopTypeActivity extends BaseActivity implements C1594tV {
    private MwShopTypeAdapter MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public Button btnNext;
    @HmlPinActivity
    public postErrorInfoBusEvent presenter;
    @BindView
    RecyclerView recyclerView;

    public static Intent read(Context context) {
        return new Intent(context, MwShopTypeActivity.class);
    }

    public void onCreate(Bundle bundle) {
        isSupportFragmentClass issupportfragmentclass;
        super.onCreate(bundle);
        setContentView(R.layout.f78952131493120);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_shop_type_nev_title);
        setTabContainer();
        MwShopTypeAdapter mwShopTypeAdapter = new MwShopTypeAdapter();
        this.MediaBrowserCompat$SearchResultReceiver = mwShopTypeAdapter;
        mwShopTypeAdapter.write = new MwShopTypeAdapter.read() {
            public final void MediaBrowserCompat$ItemReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
                MwShopTypeActivity mwShopTypeActivity = MwShopTypeActivity.this;
                mwShopTypeActivity.btnNext.setEnabled(true);
                mwShopTypeActivity.presenter.read(crashlyticsReportSessionUserEncoder);
            }
        };
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        boolean z = false;
        this.btnNext.setEnabled(false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        postErrorInfoBusEvent posterrorinfobusevent = this.presenter;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder write = posterrorinfobusevent.read.write(posterrorinfobusevent.write.IconCompatParcelizer.MediaBrowserCompat$MediaItem());
        setEventType seteventtype = new setEventType(write);
        if (posterrorinfobusevent.RatingCompat != null) {
            z = true;
        }
        if (z) {
            seteventtype.IconCompatParcelizer(posterrorinfobusevent.RatingCompat);
        }
        String str = posterrorinfobusevent.write.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
        show read = new show(write.write).read();
        show show = new show(read.write, new getNextTransition(read.IconCompatParcelizer, new getStartTime(str)));
        if (show.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        getAltClassificationConfidence getaltclassificationconfidence = new getAltClassificationConfidence(posterrorinfobusevent);
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            getaltclassificationconfidence.MediaBrowserCompat$ItemReceiver(t);
        }
    }

    public final void write(List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder> list) {
        MwShopTypeAdapter mwShopTypeAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        mwShopTypeAdapter.read = list;
        mwShopTypeAdapter.IconCompatParcelizer.write();
    }

    @OnClick
    public void onClickNext() {
        postErrorInfoBusEvent posterrorinfobusevent = this.presenter;
        setProcessedImage setprocessedimage = new setProcessedImage(posterrorinfobusevent);
        if (posterrorinfobusevent.RatingCompat != null) {
            setprocessedimage.IconCompatParcelizer(posterrorinfobusevent.RatingCompat);
        }
    }

    public final void write(int i) {
        MwShopTypeAdapter mwShopTypeAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        mwShopTypeAdapter.MediaBrowserCompat$ItemReceiver = i;
        mwShopTypeAdapter.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
        this.btnNext.setEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void IconCompatParcelizer(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
        Intent IconCompatParcelizer = MwShopAddressActivity.IconCompatParcelizer(this, crashlyticsReportSessionUserEncoder.write);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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

    public void onBackPressed() {
        finish();
    }
}
