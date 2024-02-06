package com.scb.phone.view.activity.chequemanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.chequemanagement.activatecheque.ActivateChequeLandingActivity;
import com.scb.phone.view.activity.chequemanagement.chequestatus.ChequeStatusActivity;
import com.scb.phone.view.activity.chequemanagement.ordercheque.OrderChequeLandingActivity;
import com.scb.phone.view.activity.chequemanagement.stopcheque.StopChequeLandingActivity;
import com.scb.phone.view.adapter.chequemanagement.ManageChequeAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class ManageChequeActivity extends BaseActivity implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    @BindView
    RecyclerView menuRecyclerView;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, ManageChequeActivity.class);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78612131493086);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.manage_cheque);
        setTabContainer();
        this.menuRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.menuRecyclerView.setAdapter(new ManageChequeAdapter(this, this));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.manage_cheque);
        setTabContainer();
    }

    public final void read(int i) {
        if (i == 0) {
            mo13676d_("chqstatus");
            Intent intent = new Intent(this, ChequeStatusActivity.class);
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
        } else if (i == 1) {
            mo13676d_("orderchq");
            Intent write2 = ChequeAnnouncementActivity.write(this, new Intent(this, OrderChequeLandingActivity.class));
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, write2).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                startActivity(read2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } else if (i == 2) {
            mo13676d_("activatechq");
            Intent write4 = ChequeAnnouncementActivity.write(this, new Intent(this, ActivateChequeLandingActivity.class));
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read3 = setTapText.write(this, write4).read();
                MyECouponActivity_ViewBinding.write write5 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb3 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb3.append(read3.getData());
                sb3.append("\n with context ");
                sb3.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write5, sb3.toString());
                startActivity(read3);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        } else if (i == 3) {
            mo13676d_("stopchq");
            Intent intent2 = new Intent(this, StopChequeLandingActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read4 = setTapText.write(this, intent2).read();
                MyECouponActivity_ViewBinding.write write6 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb4 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb4.append(read4.getData());
                sb4.append("\n with context ");
                sb4.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write6, sb4.toString());
                startActivity(read4);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }
}
