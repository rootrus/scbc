package com.scb.phone.view.activity.bond;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewCommonActivity;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C7039x355e6121;
import p040o.HmlPinActivity;
import p040o.JsonDataEncoderBuilder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiJsonCheck;
import p040o.Service;
import p040o.configureWith;
import p040o.lambda$component$0;
import p040o.safeContains;
import p040o.safeContains$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;
import p040o.standardStartAndWait;

public class BondPurchaseReviewActivity extends ReviewCommonActivity implements RttiJsonCheck.C12561 {
    @HmlPinActivity
    public lambda$component$0 bondPurchaseReviewPresenter;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, Service service, C7039x355e6121.read read) {
        Intent intent = new Intent(context, BondPurchaseReviewActivity.class);
        intent.putExtra("BOND_INPUT_DISPLAY", service);
        intent.putExtra("PURCHASE_BOND_FLOW", read);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("bond_purchase_review");
        this.bondPurchaseReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("BOND_INPUT_DISPLAY") && intent.hasExtra("PURCHASE_BOND_FLOW")) {
            lambda$component$0 lambda_component_0 = this.bondPurchaseReviewPresenter;
            Service service = (Service) intent.getParcelableExtra("BOND_INPUT_DISPLAY");
            C7039x355e6121.read read = (C7039x355e6121.read) intent.getSerializableExtra("PURCHASE_BOND_FLOW");
            lambda_component_0.MediaBrowserCompat$ItemReceiver = service;
            lambda_component_0.MediaBrowserCompat$SearchResultReceiver = read;
            boolean z = true;
            if (!(lambda_component_0.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView() == null || service == null)) {
                configureWith configurewith = new configureWith(lambda_component_0, service, read);
                if (lambda_component_0.RatingCompat != null) {
                    configurewith.IconCompatParcelizer(lambda_component_0.RatingCompat);
                }
            }
            if (read == C7039x355e6121.read.DLT) {
                JsonDataEncoderBuilder.C35541 r6 = JsonDataEncoderBuilder.C35541.MediaBrowserCompat$ItemReceiver;
                if (lambda_component_0.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r6.IconCompatParcelizer(lambda_component_0.RatingCompat);
                }
            }
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        return getString(R.string.purchase_bond_scb_review_title);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        lambda$component$0 lambda_component_0 = this.bondPurchaseReviewPresenter;
        if (lambda_component_0.RatingCompat != null) {
            lambda_component_0.RatingCompat.AlertController$RecycleListView();
        }
        safeContains$MediaBrowserCompat$CustomActionResultReceiver write = safeContains.write();
        write.IconCompatParcelizer = lambda_component_0.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write().read;
        safeContains safecontains = new safeContains(write, (byte) 0);
        if (C7039x355e6121.read.SCB == lambda_component_0.MediaBrowserCompat$SearchResultReceiver) {
            lambda_component_0.read.IconCompatParcelizer(safecontains);
        } else {
            lambda_component_0.read.write(safecontains);
        }
        lambda_component_0.read.IconCompatParcelizer(new lambda$component$0.read(lambda_component_0, (byte) 0));
    }

    public final void read(standardStartAndWait standardstartandwait) {
        ReviewSuccessfulActivity.write(this, standardstartandwait);
        mo13676d_("bond_purchase_success");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver(Service service, C7039x355e6121.read read) {
        Intent IconCompatParcelizer = BondLandingActivity.IconCompatParcelizer(this, service, read);
        IconCompatParcelizer.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setTitle(i);
    }
}
