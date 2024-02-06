package com.scb.phone.view.activity.ntb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;
import p040o.C4214cr;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.HmlPinActivity;
import p040o.IdType;
import p040o.MyECouponActivity_ViewBinding;
import p040o.cr$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.cr$MediaBrowserCompat$ItemReceiver;
import p040o.setFilename;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class ReviewInfoResultActivity extends BaseActivity implements IdType.IconCompatParcelizer {
    @BindView
    public Button findUsButton;
    @BindView
    ImageView imageInfo;
    @BindView
    LinearLayout linearLayoutBackground;
    @HmlPinActivity
    public C4214cr mPresenter;
    @BindView
    TextView textDescription;
    @BindView
    TextView textTitle;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3) {
        return new Intent(context, ReviewInfoResultActivity.class).putExtra("EXTRA_IMAGE_ID", R.drawable.ic_notice).putExtra("EXTRA_PAGE_TITLE", str).putExtra("EXTRA_TITLE", str2).putExtra("EXTRA_DESCRIPTION", str3);
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, setFilename setfilename) {
        return new Intent(context, ReviewInfoResultActivity.class).putExtra("EXTRA_REVIEW_DISPLAY", setfilename);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77732131492998);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        Intent intent = getIntent();
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
        setFilename setfilename = (setFilename) intent.getParcelableExtra("EXTRA_REVIEW_DISPLAY");
        boolean z = true;
        if (setfilename != null) {
            C4214cr crVar = this.mPresenter;
            crVar.read = setfilename;
            if (setfilename != null) {
                writeUInt64NoTag.IconCompatParcelizer cr_mediabrowsercompat_itemreceiver = new cr$MediaBrowserCompat$ItemReceiver(setfilename);
                if (crVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cr_mediabrowsercompat_itemreceiver.IconCompatParcelizer(crVar.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        C4214cr crVar2 = this.mPresenter;
        int intExtra = intent.getIntExtra("EXTRA_IMAGE_ID", 0);
        String stringExtra = intent.getStringExtra("EXTRA_PAGE_TITLE");
        String stringExtra2 = intent.getStringExtra("EXTRA_TITLE");
        String stringExtra3 = intent.getStringExtra("EXTRA_DESCRIPTION");
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_BACKGROUND_VISIBLE", false);
        boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_BACK_BUTTON_VISIBLE", false);
        crVar2.write = stringExtra;
        writeUInt64NoTag.IconCompatParcelizer read = new C4214cr.read(crVar2, stringExtra2, stringExtra3, intExtra, booleanExtra2, booleanExtra);
        if (crVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read.IconCompatParcelizer(crVar2.RatingCompat);
        }
    }

    @OnClick
    public void returnHome() {
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference(this));
    }

    @OnClick
    public void navigate() {
        setFilename.IconCompatParcelizer iconCompatParcelizer;
        setFilename.IconCompatParcelizer iconCompatParcelizer2;
        C4214cr crVar = this.mPresenter;
        setFilename setfilename = crVar.read;
        boolean z = true;
        if (setfilename != null) {
            if (setfilename != null) {
                iconCompatParcelizer = setfilename.write;
            } else {
                iconCompatParcelizer = null;
            }
            if (iconCompatParcelizer != null) {
                setFilename setfilename2 = crVar.read;
                if (setfilename2 != null && (iconCompatParcelizer2 = setfilename2.write) != null) {
                    writeUInt64NoTag.IconCompatParcelizer write = new C4214cr.write(iconCompatParcelizer2);
                    if (crVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        write.IconCompatParcelizer(crVar.RatingCompat);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = cr$MediaBrowserCompat$CustomActionResultReceiver.read;
        if (crVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer3.IconCompatParcelizer(crVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            setTabContainer();
        } else {
            ListMenuItemView();
        }
    }

    public void write(String str, String str2, String str3, String str4) {
        MediaSessionCompat$QueueItem(str);
        this.textTitle.setText(str2);
        this.textDescription.setText(str3);
        this.findUsButton.setText(str4);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        if (i == 0) {
            i = R.drawable.ic_notice;
        }
        this.imageInfo.setImageResource(i);
        if (i2 >= 0) {
            ViewGroup.LayoutParams layoutParams = this.imageInfo.getLayoutParams();
            int applyDimension = (int) TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
            layoutParams.width = applyDimension;
            layoutParams.height = applyDimension;
            this.imageInfo.setLayoutParams(layoutParams);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setFilename.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.write(this);
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, FindUsActivity.class);
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
    }

    public final void read(boolean z) {
        if (z) {
            this.linearLayoutBackground.setBackgroundColor(1724499661);
        }
    }
}
