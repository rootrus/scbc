package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.easycash.salesheets.EasycashSalesheetEmptyFragment;
import com.scb.phone.view.fragment.easycash.salesheets.EasycashSalesheetIndexFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsController;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1200;
import p040o.getIpOperations;
import p040o.recycle;
import p040o.setTapText;
import p040o.submit;

public class EasycashSalesheetIndexActivity extends BaseActivity implements CheckExtractActivity_MembersInjector.ActionMenuItemView {
    @HmlPinActivity
    public Image.C3461a easycashSalesheetIndexPresenter;

    public static void IconCompatParcelizer(Context context, access$1200 access_1200) {
        Intent intent = new Intent(context, EasycashSalesheetIndexActivity.class);
        intent.putExtra("com.scb.phone.SALESHEET_DISPLAYS", access_1200);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        setContentView(R.layout.f77622131492987);
        this.easycashSalesheetIndexPresenter.MediaBrowserCompat$ItemReceiver(this);
        Image.C3461a aVar = this.easycashSalesheetIndexPresenter;
        access$1200 access_1200 = (access$1200) getIntent().getParcelableExtra("com.scb.phone.SALESHEET_DISPLAYS");
        if (access_1200 != null) {
            boolean z = true;
            if (access_1200.IconCompatParcelizer) {
                recycle recycle = new recycle(access_1200);
                if (aVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    recycle.IconCompatParcelizer(aVar.RatingCompat);
                }
            } else {
                getIpOperations getipoperations = new getIpOperations(access_1200);
                if (aVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getipoperations.IconCompatParcelizer(aVar.RatingCompat);
                }
            }
        }
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.easycash_sale_sheet_title);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.easycash_sale_sheet_title);
        setTabContainer();
    }

    public final void IconCompatParcelizer(List<submit> list) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.salesheets_container, EasycashSalesheetIndexFragment.IconCompatParcelizer(list)).write();
    }

    public final void IconCompatParcelizer(CrashlyticsController crashlyticsController) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.salesheets_container, EasycashSalesheetEmptyFragment.read(crashlyticsController)).write();
    }

    public void onDestroy() {
        super.onDestroy();
        this.easycashSalesheetIndexPresenter.onDestroy();
    }
}
