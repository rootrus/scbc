package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bulktransfer.AddNewRecipientActivity;
import com.scb.phone.view.fragment.bulktransfer.AddNewRecipientFragment;
import com.scb.phone.view.fragment.bulktransfer.SelectBankFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7156iL;
import p040o.C7159iO;
import p040o.CardView;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.parseFile;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class AddNewRecipientActivity extends BaseActivity {
    private Fragment MediaBrowserCompat$MediaItem;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        Intent intent = new Intent(context, AddNewRecipientActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_GROUP_ID", str);
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
        setContentView(R.layout.f76692131492894);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, SelectBankFragment.write()).write();
        String string = getString(R.string.add_recipient);
        IntentFilter intentFilter = new IntentFilter("com.scb.phone.ACTION_SELECT_BANK");
        intentFilter.addCategory(string);
        this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(this, intentFilter).subscribe(new C7156iL(this), C7159iO.MediaBrowserCompat$CustomActionResultReceiver);
        String string2 = getString(R.string.add_recipient);
        IntentFilter intentFilter2 = new IntentFilter("com.scb.phone.ACTION_ADD_RECIPIENT_BACK");
        intentFilter2.addCategory(string2);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(this, intentFilter2).subscribe(new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                AddNewRecipientActivity.read(AddNewRecipientActivity.this);
            }
        }, C7159iO.MediaBrowserCompat$CustomActionResultReceiver);
        setStackedBackground();
    }

    public void onDestroy() {
        super.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.add_new_recipient);
        setTabContainer();
    }

    public static /* synthetic */ void IconCompatParcelizer(AddNewRecipientActivity addNewRecipientActivity, Intent intent) {
        AddNewRecipientFragment IconCompatParcelizer = AddNewRecipientFragment.IconCompatParcelizer(addNewRecipientActivity.getIntent().getStringExtra("com.scb.phone.EXTRA_GROUP_ID"), (parseFile) intent.getParcelableExtra("com.scb.phone.EXTRA_BANK"));
        CardView read = addNewRecipientActivity.getSupportFragmentManager().read();
        read.MediaBrowserCompat$SearchResultReceiver();
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, IconCompatParcelizer);
        addNewRecipientActivity.MediaBrowserCompat$MediaItem = IconCompatParcelizer;
        read.write();
    }

    public static /* synthetic */ void read(AddNewRecipientActivity addNewRecipientActivity) {
        addNewRecipientActivity.PlaybackStateCompat$CustomAction();
        if (addNewRecipientActivity.MediaBrowserCompat$MediaItem != null) {
            CardView read = addNewRecipientActivity.getSupportFragmentManager().read();
            read.MediaBrowserCompat$SearchResultReceiver();
            read.write(addNewRecipientActivity.MediaBrowserCompat$MediaItem);
            read.write();
        }
        addNewRecipientActivity.MediaBrowserCompat$MediaItem = null;
    }
}
