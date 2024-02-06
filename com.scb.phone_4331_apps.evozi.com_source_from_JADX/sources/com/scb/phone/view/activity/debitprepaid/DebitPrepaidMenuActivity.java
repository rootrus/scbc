package com.scb.phone.view.activity.debitprepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.debitcard.DebitCardLandingActivity;
import com.scb.phone.view.activity.prepaid.C5694x7cae54ca;
import com.scb.phone.view.activity.prepaid.PrepaidMenuActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.C1221xe3d724bd;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.makeAccessibleWithUnsafe;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class DebitPrepaidMenuActivity extends BaseActivity implements C1221xe3d724bd {
    public static final read MediaDescriptionCompat = new read((byte) 0);
    private HashMap MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public makeAccessibleWithUnsafe presenter;

    private View read(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$SearchResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$SearchResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77232131492948);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.debit_prepaid_title);
        setTabContainer();
        makeAccessibleWithUnsafe makeaccessiblewithunsafe = this.presenter;
        if (makeaccessiblewithunsafe == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        makeaccessiblewithunsafe.MediaBrowserCompat$ItemReceiver(this);
        ((TextView) read(ZHER2K.write.btnDebitCard)).setOnClickListener(new IconCompatParcelizer(this));
        ((TextView) read(ZHER2K.write.btnPrepaidCard)).setOnClickListener(new write(this));
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ DebitPrepaidMenuActivity IconCompatParcelizer;

        IconCompatParcelizer(DebitPrepaidMenuActivity debitPrepaidMenuActivity) {
            this.IconCompatParcelizer = debitPrepaidMenuActivity;
        }

        public final void onClick(View view) {
            makeAccessibleWithUnsafe makeaccessiblewithunsafe = this.IconCompatParcelizer.presenter;
            if (makeaccessiblewithunsafe == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = makeAccessibleWithUnsafe.read.IconCompatParcelizer;
            if (makeaccessiblewithunsafe.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(makeaccessiblewithunsafe.RatingCompat);
            }
        }
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ DebitPrepaidMenuActivity MediaBrowserCompat$ItemReceiver;

        write(DebitPrepaidMenuActivity debitPrepaidMenuActivity) {
            this.MediaBrowserCompat$ItemReceiver = debitPrepaidMenuActivity;
        }

        public final void onClick(View view) {
            makeAccessibleWithUnsafe makeaccessiblewithunsafe = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (makeaccessiblewithunsafe == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = makeAccessibleWithUnsafe.IconCompatParcelizer.read;
            if (makeaccessiblewithunsafe.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(makeaccessiblewithunsafe.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        DebitCardLandingActivity.IconCompatParcelizer(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C5694x7cae54ca prepaidMenuActivity$MediaBrowserCompat$CustomActionResultReceiver = PrepaidMenuActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PrepaidMenuActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
