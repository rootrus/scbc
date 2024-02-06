package com.scb.phone.view.activity.deposit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.deposit.DepositMarketConductFragment;
import com.scb.phone.view.fragment.deposit.DepositMarketConductFragment$MediaBrowserCompat$ItemReceiver;
import p040o.CardView;
import p040o.GoodToKnowActivity;
import p040o.onGetStartedClick;
import p040o.setTitleMarginStart;

public final class DepositProductCatalogActivity extends BaseActivity {
    public static final C5593x7d741dc4 MediaMetadataCompat = new C5593x7d741dc4((byte) 0);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77352131492960);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(ImagesContract.URL) : null;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.getStringExtra("name");
        }
        DepositMarketConductFragment$MediaBrowserCompat$ItemReceiver depositMarketConductFragment$MediaBrowserCompat$ItemReceiver = DepositMarketConductFragment.IconCompatParcelizer;
        DepositMarketConductFragment depositMarketConductFragment = new DepositMarketConductFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ImagesContract.URL, stringExtra);
        depositMarketConductFragment.setArguments(bundle2);
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) supportFragmentManager, "supportFragmentManager");
        CardView read = supportFragmentManager.read();
        onGetStartedClick.IconCompatParcelizer((Object) read, "beginTransaction()");
        CardView MediaBrowserCompat$ItemReceiver = read.MediaBrowserCompat$ItemReceiver(R.id.container, depositMarketConductFragment);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "replace(R.id.container, fragment)");
        MediaBrowserCompat$ItemReceiver.write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        Intent intent = getIntent();
        String str = null;
        CharSequence stringExtra = intent != null ? intent.getStringExtra("name") : null;
        if (!(stringExtra == null || GoodToKnowActivity.read(stringExtra))) {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                str = intent2.getStringExtra("name");
            }
            MediaSessionCompat$QueueItem(str);
        } else {
            setTitle(R.string.etb_product_catalog);
        }
        setTabContainer();
    }

    public static final Intent read(Context context, String str, String str2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, DepositProductCatalogActivity.class);
        intent.putExtra(ImagesContract.URL, str).putExtra("name", str2);
        return intent;
    }
}
