package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.remittance.RemittanceInputActivity;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;
import com.scb.phone.view.fragment.transferandpay.TopUpTabFragment;
import com.scb.phone.view.fragment.transferandpay.TransferTabFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import p040o.AlertController$RecycleListView;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.C4794ig;
import p040o.C5172qR;
import p040o.C5199rQ;
import p040o.C5207rY;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaFragment;
import p040o.getBorderColor;
import p040o.getTopLeftCornerWidth;
import p040o.onGetStartedClick;
import p040o.onInfoWindowLongClick;
import p040o.setTapText;

public class FavouriteSelectedActivity extends BaseActivity implements getTopLeftCornerWidth.setHasDecor {
    private String MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public C5172qR favouriteSelectedPresenter;

    public static Intent read(Context context) {
        Intent intent = new Intent(context, FavouriteSelectedActivity.class);
        intent.putExtra("source", "favourite");
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77912131493016);
        this.MediaBrowserCompat$MediaItem = read("source", "");
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.favouriteSelectedPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5172qR qRVar = this.favouriteSelectedPresenter;
        boolean z = false;
        if (qRVar.RatingCompat != null) {
            String MediaDescriptionCompat = qRVar.read.write.MediaDescriptionCompat();
            char c = 65535;
            int hashCode = MediaDescriptionCompat.hashCode();
            if (hashCode != -486974465) {
                if (hashCode != 80008848) {
                    if (hashCode == 510594974 && MediaDescriptionCompat.equals("REMITTANCE")) {
                        c = 2;
                    }
                } else if (MediaDescriptionCompat.equals("TOPUP")) {
                    c = 0;
                }
            } else if (MediaDescriptionCompat.equals("BILLPAYMENT")) {
                c = 1;
            }
            if (c == 0) {
                getBorderColor getbordercolor = getBorderColor.IconCompatParcelizer;
                if (qRVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getbordercolor.IconCompatParcelizer(qRVar.RatingCompat);
                }
            } else if (c == 1) {
                C4794ig igVar = C4794ig.MediaBrowserCompat$CustomActionResultReceiver;
                if (qRVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    igVar.IconCompatParcelizer(qRVar.RatingCompat);
                }
            } else if (c != 2) {
                C5199rQ rQVar = C5199rQ.read;
                if (qRVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    rQVar.IconCompatParcelizer(qRVar.RatingCompat);
                }
            } else {
                onInfoWindowLongClick MediaBrowserCompat$ItemReceiver = qRVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver != null) {
                    onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "favouriteTarget");
                    String str = MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
                    String str2 = str;
                    onGetStartedClick.IconCompatParcelizer((Object) str, "countryName");
                    String str3 = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
                    String str4 = str3;
                    onGetStartedClick.IconCompatParcelizer((Object) str3, "channelType");
                    String str5 = MediaBrowserCompat$ItemReceiver.RatingCompat;
                    String str6 = str5;
                    onGetStartedClick.IconCompatParcelizer((Object) str5, "agentType");
                    String str7 = MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
                    onGetStartedClick.IconCompatParcelizer((Object) str7, "currencyCode");
                    C5207rY rYVar = new C5207rY(new C3088x7e3e3ebd.C30891((String) null, str2, str4, str6, str7, MediaBrowserCompat$ItemReceiver.read.PlaybackStateCompat, MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.read.setHasDecor, MediaBrowserCompat$ItemReceiver.read.PlaybackStateCompat$CustomAction, MediaBrowserCompat$ItemReceiver.read.RatingCompat, MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$QueueItem, MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$ResultReceiverWrapper, MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$MediaItem, MediaBrowserCompat$ItemReceiver.read.MediaMetadataCompat, MediaBrowserCompat$ItemReceiver.read.write, MediaBrowserCompat$ItemReceiver.read.read, MediaBrowserCompat$ItemReceiver.read.Keep, MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$Token, MediaBrowserCompat$ItemReceiver.read.MediaDescriptionCompat, MediaBrowserCompat$ItemReceiver.read.ParcelableVolumeInfo, MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$ItemReceiver.read.f2907x50fd9e4a, MediaBrowserCompat$ItemReceiver.AppCompatDialogFragment));
                    if (qRVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        rYVar.IconCompatParcelizer(qRVar.RatingCompat);
                    }
                }
            }
        }
    }

    public void onDestroy() {
        this.favouriteSelectedPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public final void write() {
        MediaBrowserCompat$CustomActionResultReceiver(R.string.transfer_tab, TransferTabFragment.read(this.MediaBrowserCompat$MediaItem));
    }

    public final void read() {
        MediaBrowserCompat$CustomActionResultReceiver(R.string.top_up_tab, TopUpTabFragment.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Serializable serializableExtra = getIntent().getSerializableExtra("com.scb.phone.EXTRA_BILL_PAY_METHOD");
        StreetViewPanoramaFragment.zzb zzb = StreetViewPanoramaFragment.zzb.PROFILE;
        if (serializableExtra != null && (serializableExtra instanceof StreetViewPanoramaFragment.zzb)) {
            zzb = (StreetViewPanoramaFragment.zzb) serializableExtra;
        }
        MediaBrowserCompat$CustomActionResultReceiver(R.string.bill_payment_tab, BillPaymentTabFragment.MediaBrowserCompat$CustomActionResultReceiver(zzb, this.MediaBrowserCompat$MediaItem));
    }

    public final void MediaBrowserCompat$ItemReceiver(C3088x7e3e3ebd.C30891 r4) {
        Intent MediaBrowserCompat$ItemReceiver = RemittanceInputActivity.MediaBrowserCompat$ItemReceiver(this, C3092xce3d994b.Builder.FAVOURITE, r4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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
        finish();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, Fragment fragment) {
        super.setStackedBackground();
        setTabContainer();
        setTitle(i);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, fragment).write();
    }
}
