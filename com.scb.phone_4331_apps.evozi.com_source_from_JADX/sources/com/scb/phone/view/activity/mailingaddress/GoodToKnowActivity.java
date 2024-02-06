package com.scb.phone.view.activity.mailingaddress;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.adapter.mailingaddress.MailingAddressGoodToKnowAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AppStatsDsExportHandler;
import p040o.AppStatsDsExportHandler$MediaBrowserCompat$SearchResultReceiver;
import p040o.C1354hx;
import p040o.C3587xe347fb20;
import p040o.FundFactSheetActivity;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.usedBytes;
import p040o.writeUInt64NoTag;

public final class GoodToKnowActivity extends BaseActivity implements C1354hx {
    private final MailingAddressGoodToKnowAdapter MediaMetadataCompat = new MailingAddressGoodToKnowAdapter(new ArrayList());
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public AppStatsDsExportHandler presenter;
    @BindView
    public RecyclerView recyclerView;

    public static final Intent IconCompatParcelizer(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, GoodToKnowActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78172131493042);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.auto_change_mailing_address_good_to_know_title);
        boolean z = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setAdapter(this.MediaMetadataCompat);
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView4.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        AppStatsDsExportHandler appStatsDsExportHandler = this.presenter;
        if (appStatsDsExportHandler == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        appStatsDsExportHandler.MediaBrowserCompat$ItemReceiver(this);
        AppStatsDsExportHandler appStatsDsExportHandler2 = this.presenter;
        if (appStatsDsExportHandler2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = AppStatsDsExportHandler$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (appStatsDsExportHandler2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(appStatsDsExportHandler2.RatingCompat);
        }
        LinkedListMultimap.MultisetView.C35822.C35831 r3 = appStatsDsExportHandler2.IconCompatParcelizer;
        AppStatsDsExportHandler appStatsDsExportHandler3 = appStatsDsExportHandler2;
        FundFactSheetActivity mediaDescriptionCompat = new AppStatsDsExportHandler.MediaDescriptionCompat(appStatsDsExportHandler3);
        FundFactSheetActivity ratingCompat = new AppStatsDsExportHandler.RatingCompat(appStatsDsExportHandler3);
        onGetStartedClick.write((Object) mediaDescriptionCompat, "onSuccess");
        onGetStartedClick.write((Object) ratingCompat, "onError");
        r3.MediaBrowserCompat$ItemReceiver(r3.RatingCompat, mediaDescriptionCompat, ratingCompat, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new C3587xe347fb20(r3));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.auto_change_mailing_address_good_to_know_title);
    }

    public final void onDestroy() {
        super.onDestroy();
        AppStatsDsExportHandler appStatsDsExportHandler = this.presenter;
        if (appStatsDsExportHandler == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        appStatsDsExportHandler.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<usedBytes> list) {
        onGetStartedClick.write((Object) list, "entities");
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setEnabled(true);
        MailingAddressGoodToKnowAdapter mailingAddressGoodToKnowAdapter = this.MediaMetadataCompat;
        Collection collection = list;
        onGetStartedClick.write((Object) collection, "items");
        ArrayList<usedBytes> arrayList = mailingAddressGoodToKnowAdapter.write;
        arrayList.clear();
        arrayList.addAll(collection);
        mailingAddressGoodToKnowAdapter.IconCompatParcelizer.write();
    }

    public final void read() {
        Intent read = ManageEmailLandingActivity.read((Activity) this);
        read.addFlags(33554432);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
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

    @OnClick
    public final void onNextClick() {
        MailingAddressLandingActivity$MediaBrowserCompat$ItemReceiver mailingAddressLandingActivity$MediaBrowserCompat$ItemReceiver = MailingAddressLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, MailingAddressLandingActivity.class);
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

    public final void write() {
        finish();
    }
}
