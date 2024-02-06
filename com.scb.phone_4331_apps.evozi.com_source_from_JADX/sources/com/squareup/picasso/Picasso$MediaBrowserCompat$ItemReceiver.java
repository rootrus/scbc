package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p040o.FragmentBuilder_BindEditFavouriteFragment;
import p040o.FragmentBuilder_BindEkycRouterActivity;
import p040o.FragmentBuilder_BindExportStatementSuccessfulFragment;
import p040o.FragmentBuilder_BindFastPaySuccessFragment;
import p040o.FragmentBuilder_BindFixedTransferSuccessFragment;
import p040o.FragmentBuilder_BindFundActionsSuccessFragment;
import p040o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment;
import p040o.FragmentBuilder_BindFundInvestmentExperienceFragment;

public class Picasso$MediaBrowserCompat$ItemReceiver {
    private final Context IconCompatParcelizer;
    private FragmentBuilder_BindEditFavouriteFragment MediaBrowserCompat$CustomActionResultReceiver;
    private Picasso$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    private ExecutorService MediaDescriptionCompat;
    private Picasso$MediaBrowserCompat$SearchResultReceiver MediaMetadataCompat;
    private List<FragmentBuilder_BindFundInvestmentExperienceFragment> read;
    public FragmentBuilder_BindExportStatementSuccessfulFragment write;

    public Picasso$MediaBrowserCompat$ItemReceiver(Context context) {
        if (context != null) {
            this.IconCompatParcelizer = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public final Picasso$MediaBrowserCompat$ItemReceiver write(Picasso$MediaBrowserCompat$CustomActionResultReceiver picasso$MediaBrowserCompat$CustomActionResultReceiver) {
        if (picasso$MediaBrowserCompat$CustomActionResultReceiver == null) {
            throw new IllegalArgumentException("Listener must not be null.");
        } else if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = picasso$MediaBrowserCompat$CustomActionResultReceiver;
            return this;
        } else {
            throw new IllegalStateException("Listener already set.");
        }
    }

    public final Picasso$MediaBrowserCompat$ItemReceiver IconCompatParcelizer(FragmentBuilder_BindFundInvestmentExperienceFragment fragmentBuilder_BindFundInvestmentExperienceFragment) {
        if (this.read == null) {
            this.read = new ArrayList();
        }
        if (!this.read.contains(fragmentBuilder_BindFundInvestmentExperienceFragment)) {
            this.read.add(fragmentBuilder_BindFundInvestmentExperienceFragment);
            return this;
        }
        throw new IllegalStateException("RequestHandler already registered.");
    }

    public final Picasso MediaBrowserCompat$ItemReceiver() {
        Context context = this.IconCompatParcelizer;
        if (this.write == null) {
            this.write = new FragmentBuilder_BindFixedTransferSuccessFragment(context);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindFastPaySuccessFragment(context);
        }
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new FragmentBuilder_BindFundActionsSuccessFragment();
        }
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = Picasso$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        }
        FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment = new FragmentBuilder_BindFundAwaitingTransactionsTabFragment(this.MediaBrowserCompat$CustomActionResultReceiver);
        Context context2 = context;
        return new Picasso(context2, new FragmentBuilder_BindEkycRouterActivity(context2, this.MediaDescriptionCompat, Picasso.write, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindFundAwaitingTransactionsTabFragment), this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaMetadataCompat, this.read, fragmentBuilder_BindFundAwaitingTransactionsTabFragment, (Bitmap.Config) null, false, false);
    }
}
