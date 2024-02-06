package com.scb.phone.view.activity.bond;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ErrorFragment;
import com.scb.phone.view.fragment.bond.BondInputFragment;
import p040o.C7039x355e6121;
import p040o.CardView;
import p040o.ForwardingCheckedFuture;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.JsonDataEncoderBuilder$$Lambda$1;
import p040o.Publisher;
import p040o.RttiJsonCheck;
import p040o.Service;
import p040o.createSegment;
import p040o.zzxc;

public class BondLandingActivity extends BaseActivity implements RttiJsonCheck.C1257a {
    @HmlPinActivity
    public Publisher presenter;

    public static Intent IconCompatParcelizer(Context context, Service service, C7039x355e6121.read read) {
        Intent intent = new Intent(context, BondLandingActivity.class);
        intent.putExtra("BOND_INPUT_DISPLAY", service);
        intent.putExtra("PURCHASE_BOND_FLOW", read);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("BOND_INPUT_DISPLAY") && intent.hasExtra("PURCHASE_BOND_FLOW")) {
            Publisher publisher = this.presenter;
            Service service = (Service) intent.getParcelableExtra("BOND_INPUT_DISPLAY");
            C7039x355e6121.read read = (C7039x355e6121.read) intent.getSerializableExtra("PURCHASE_BOND_FLOW");
            publisher.IconCompatParcelizer = read;
            boolean z = true;
            if (service != null) {
                JsonDataEncoderBuilder$$Lambda$1 jsonDataEncoderBuilder$$Lambda$1 = new JsonDataEncoderBuilder$$Lambda$1(service, read);
                if (publisher.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    jsonDataEncoderBuilder$$Lambda$1.IconCompatParcelizer(publisher.RatingCompat);
                }
            } else {
                if (publisher.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    publisher.RatingCompat.AlertController$RecycleListView();
                }
                publisher.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new createSegment(publisher.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.read()));
                publisher.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxc.zzd>(read) {
                    private /* synthetic */ C7039x355e6121.read IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r2;
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        zzxc.zzd zzd = (zzxc.zzd) obj;
                        Publisher.read(Publisher.this);
                        boolean z = true;
                        if (!zzd.write.isEmpty()) {
                            Publisher publisher = Publisher.this;
                            EncoderConfig encoderConfig = new EncoderConfig(this, zzd, this.IconCompatParcelizer);
                            if (publisher.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                encoderConfig.IconCompatParcelizer(publisher.RatingCompat);
                            }
                        } else if (this.IconCompatParcelizer == C7039x355e6121.read.DLT) {
                            Publisher publisher2 = Publisher.this;
                            Configurator configurator = Configurator.read;
                            if (publisher2.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                configurator.IconCompatParcelizer(publisher2.RatingCompat);
                            }
                        } else {
                            Publisher publisher3 = Publisher.this;
                            JsonDataEncoderBuilder jsonDataEncoderBuilder = JsonDataEncoderBuilder.read;
                            if (publisher3.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                jsonDataEncoderBuilder.IconCompatParcelizer(publisher3.RatingCompat);
                            }
                        }
                    }

                    public final void onError(Throwable th) {
                        Publisher.IconCompatParcelizer(Publisher.this);
                        Publisher publisher = Publisher.this;
                        ValueEncoderContext valueEncoderContext = new ValueEncoderContext(this, th);
                        if (publisher.RatingCompat != null) {
                            valueEncoderContext.IconCompatParcelizer(publisher.RatingCompat);
                        }
                    }
                });
            }
        }
        super.setStackedBackground();
        setTabContainer();
        setTitle(this.presenter.IconCompatParcelizer == C7039x355e6121.read.DLT ? Iterables$3$MediaBrowserCompat$MediaItem.auto_purchase_bond_dlt_input_title : Iterables$3$MediaBrowserCompat$MediaItem.bond_landing_title);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(this.presenter.IconCompatParcelizer == C7039x355e6121.read.DLT ? Iterables$3$MediaBrowserCompat$MediaItem.auto_purchase_bond_dlt_input_title : Iterables$3$MediaBrowserCompat$MediaItem.bond_landing_title);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Service service, C7039x355e6121.read read) {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, BondInputFragment.MediaBrowserCompat$CustomActionResultReceiver(service, read)).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        CardView read = getSupportFragmentManager().read();
        ForwardingCheckedFuture.read MediaBrowserCompat$CustomActionResultReceiver = ForwardingCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = R.drawable.ic_coming_soon;
        MediaBrowserCompat$CustomActionResultReceiver.write = getString(R.string.bond_selection_error_title);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = getString(R.string.bond_selection_error_description);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = getString(i);
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, ErrorFragment.MediaBrowserCompat$CustomActionResultReceiver(new ForwardingCheckedFuture(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0))).write();
    }
}
