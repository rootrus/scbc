package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.sme.gifting.GiftingMoneyTransferInputFragment;
import com.scb.phone.view.fragment.sme.gifting.GiftingPresentTransferInputFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C1164x8ffddf7b;
import p040o.C5258se;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.displayImageCapturedEvent;
import p040o.getRotateMsg;
import p040o.setTapText;

public class GiftingTransferLandingActivity extends BaseActivity implements C1164x8ffddf7b {
    @HmlPinActivity
    public C5258se giftingTransferLandingPresenter;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r4) {
        Intent intent = new Intent(context, GiftingTransferLandingActivity.class);
        intent.putExtra("GIFT_TRANSFER_INPUT", r4);
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
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78162131493041);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.giftingTransferLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5258se seVar = this.giftingTransferLandingPresenter;
        AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r0 = (AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991) getIntent().getParcelableExtra("GIFT_TRANSFER_INPUT");
        if (r0 != null) {
            boolean z = true;
            if ((seVar.RatingCompat != null) && r0.MediaBrowserCompat$MediaItem != null) {
                if (r0.MediaBrowserCompat$MediaItem.equals("money")) {
                    getRotateMsg getrotatemsg = new getRotateMsg(r0);
                    if (seVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getrotatemsg.IconCompatParcelizer(seVar.RatingCompat);
                    }
                } else if (r0.MediaBrowserCompat$MediaItem.equals("present")) {
                    displayImageCapturedEvent displayimagecapturedevent = new displayImageCapturedEvent(r0);
                    if (seVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        displayimagecapturedevent.IconCompatParcelizer(seVar.RatingCompat);
                    }
                }
            }
        }
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.gifts_selection_title);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.gifts_selection_title);
    }

    private void write(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        write("gifting_input", new ZSYR2K("gift_type", str), new ZSYR2K("gift_id", sb.toString()));
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r3) {
        if (r3 != null) {
            write("money", r3.RatingCompat);
        }
        GiftingMoneyTransferInputFragment write = GiftingMoneyTransferInputFragment.write(r3);
        CardView read = getSupportFragmentManager().read();
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.gift_transfer_input_fragment_container, write);
        read.write();
    }

    public final void read(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r3) {
        if (!(r3 == null || r3.RatingCompat == 0)) {
            write("present", r3.RatingCompat);
        }
        GiftingPresentTransferInputFragment read = GiftingPresentTransferInputFragment.read(r3);
        CardView read2 = getSupportFragmentManager().read();
        read2.MediaBrowserCompat$CustomActionResultReceiver(R.id.gift_transfer_input_fragment_container, read);
        read2.write();
    }
}
