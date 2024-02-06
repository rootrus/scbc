package com.scb.phone.view.activity.investment.roboadvisor;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.FragmentBuilder_BindDirectDebitInputBillerListFragment;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.Lists;
import p040o.MyECouponActivity_ViewBinding;
import p040o.newPassportExtractor;
import p040o.onGetStartedClick;
import p040o.setBoxStrokeColor;
import p040o.setCounterEnabled;
import p040o.setCropLineColor;
import p040o.setCropLineColor$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setCropLineColor$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzvf;

public final class RoboAdvisorLandingActivity extends BaseActivity implements newPassportExtractor {
    public static final C5652x8cbd2afd MediaMetadataCompat = new C5652x8cbd2afd((byte) 0);
    private final String MediaBrowserCompat$MediaItem = FragmentBuilder_BindDirectDebitInputBillerListFragment.ROBO_ADVISOR_LANDING_SHOWN.value;
    private Handler MediaBrowserCompat$SearchResultReceiver;
    private Runnable MediaDescriptionCompat;
    @BindView
    public ConstraintLayout clMainLayout;
    @HmlPinActivity
    public setCropLineColor presenter;
    @BindView
    public TextView roboEasyText;
    @BindView
    public TextView roboManageText;
    @BindView
    public TextView roboReliableText;

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, RoboAdvisorLandingActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79762131493201);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.auto_scbs_investment_select_function_robo_advisor));
        setCropLineColor setcroplinecolor = this.presenter;
        if (setcroplinecolor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcroplinecolor.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void onStart() {
        boolean z;
        boolean z2;
        GoogleMap.OnMapClickListener onMapClickListener;
        GoogleMap.OnMapClickListener onMapClickListener2;
        super.onStart();
        setCropLineColor setcroplinecolor = this.presenter;
        if (setcroplinecolor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
        zzvf RatingCompat = setcroplinecolor.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat();
        boolean z3 = false;
        if (RatingCompat == null || (onMapClickListener2 = RatingCompat.MediaMetadataCompat) == null) {
            z = false;
        } else {
            z = onMapClickListener2.MediaBrowserCompat$ItemReceiver;
        }
        zzvf RatingCompat2 = setcroplinecolor.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat();
        if (RatingCompat2 == null || (onMapClickListener = RatingCompat2.MediaMetadataCompat) == null) {
            z2 = false;
        } else {
            z2 = onMapClickListener.read;
        }
        Lists.TransformingRandomAccessList transformingRandomAccessList = setcroplinecolor.read;
        onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
        setCounterEnabled setcounterenabled = transformingRandomAccessList.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
        if (!setcounterenabled.IconCompatParcelizer.IconCompatParcelizer(str) || !z) {
            String string = setcroplinecolor.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_robo_advisor_landing_bullet_1_topic);
            onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…r_landing_bullet_1_topic)");
            String string2 = setcroplinecolor.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_robo_advisor_landing_bullet_1_message);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…landing_bullet_1_message)");
            String string3 = setcroplinecolor.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_robo_advisor_landing_bullet_2_topic);
            onGetStartedClick.IconCompatParcelizer((Object) string3, "resources.getString(R.st…r_landing_bullet_2_topic)");
            String string4 = setcroplinecolor.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_robo_advisor_landing_bullet_2_message);
            onGetStartedClick.IconCompatParcelizer((Object) string4, "resources.getString(R.st…landing_bullet_2_message)");
            String string5 = setcroplinecolor.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_robo_advisor_landing_bullet_3_topic);
            onGetStartedClick.IconCompatParcelizer((Object) string5, "resources.getString(R.st…r_landing_bullet_3_topic)");
            String string6 = setcroplinecolor.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_robo_advisor_landing_bullet_3_message);
            onGetStartedClick.IconCompatParcelizer((Object) string6, "resources.getString(R.st…landing_bullet_3_message)");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new setCropLineColor.IconCompatParcelizer(setCropLineColor.MediaBrowserCompat$ItemReceiver(string, string2), setCropLineColor.MediaBrowserCompat$ItemReceiver(string3, string4), setCropLineColor.MediaBrowserCompat$ItemReceiver(string5, string6));
            if (setcroplinecolor.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                iconCompatParcelizer.IconCompatParcelizer(setcroplinecolor.RatingCompat);
            }
        } else if (z2) {
            writeUInt64NoTag.IconCompatParcelizer setcroplinecolor_mediabrowsercompat_itemreceiver = new setCropLineColor$MediaBrowserCompat$ItemReceiver(setcroplinecolor);
            if (setcroplinecolor.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                setcroplinecolor_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setcroplinecolor.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new setCropLineColor.MediaMetadataCompat(setcroplinecolor, z, z2);
            if (setcroplinecolor.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                mediaMetadataCompat.IconCompatParcelizer(setcroplinecolor.RatingCompat);
            }
        }
    }

    public final void onStop() {
        Handler handler = this.MediaBrowserCompat$SearchResultReceiver;
        if (handler != null) {
            handler.removeCallbacks(this.MediaDescriptionCompat);
        }
        super.onStop();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.auto_scbs_investment_select_function_robo_advisor));
    }

    @OnClick
    public final void onGetStartClicked() {
        boolean z;
        boolean z2;
        GoogleMap.OnMapClickListener onMapClickListener;
        GoogleMap.OnMapClickListener onMapClickListener2;
        setCropLineColor setcroplinecolor = this.presenter;
        if (setcroplinecolor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
        zzvf RatingCompat = setcroplinecolor.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat();
        boolean z3 = false;
        if (RatingCompat == null || (onMapClickListener2 = RatingCompat.MediaMetadataCompat) == null) {
            z = false;
        } else {
            z = onMapClickListener2.MediaBrowserCompat$ItemReceiver;
        }
        zzvf RatingCompat2 = setcroplinecolor.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat();
        if (RatingCompat2 == null || (onMapClickListener = RatingCompat2.MediaMetadataCompat) == null) {
            z2 = false;
        } else {
            z2 = onMapClickListener.read;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setCropLineColor.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (setcroplinecolor.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setcroplinecolor.RatingCompat);
        }
        Lists.TransformingRandomAccessList transformingRandomAccessList = setcroplinecolor.read;
        onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
        setCounterEnabled setcounterenabled = transformingRandomAccessList.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
        if (!setcounterenabled.IconCompatParcelizer.IconCompatParcelizer(str)) {
            Lists.TransformingRandomAccessList transformingRandomAccessList2 = setcroplinecolor.read;
            onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
            setBoxStrokeColor setboxstrokecolor = transformingRandomAccessList2.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) str, "roboAdvisorLandingShownKey");
            setboxstrokecolor.write.write(str);
        }
        if (!z || !z2) {
            writeUInt64NoTag.IconCompatParcelizer setcroplinecolor_mediabrowsercompat_customactionresultreceiver = new setCropLineColor$MediaBrowserCompat$CustomActionResultReceiver(setcroplinecolor, z, z2);
            if (setcroplinecolor.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                setcroplinecolor_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setcroplinecolor.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer read = new setCropLineColor.read(setcroplinecolor);
        if (setcroplinecolor.RatingCompat != null) {
            z3 = true;
        }
        if (z3) {
            read.IconCompatParcelizer(setcroplinecolor.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(SpannableString spannableString, SpannableString spannableString2, SpannableString spannableString3) {
        onGetStartedClick.write((Object) spannableString, "easyDescription");
        onGetStartedClick.write((Object) spannableString2, "reliableDescription");
        onGetStartedClick.write((Object) spannableString3, "manageDescription");
        ConstraintLayout constraintLayout = this.clMainLayout;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clMainLayout");
        }
        constraintLayout.setVisibility(0);
        TextView textView = this.roboEasyText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("roboEasyText");
        }
        textView.setText(spannableString);
        TextView textView2 = this.roboReliableText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("roboReliableText");
        }
        textView2.setText(spannableString2);
        TextView textView3 = this.roboManageText;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("roboManageText");
        }
        textView3.setText(spannableString3);
    }

    public final void IconCompatParcelizer(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("IS_NEED_HISTORY_STACK", true);
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
            finish();
        } catch (ActivityNotFoundException unused) {
            setCropLineColor setcroplinecolor = this.presenter;
            if (setcroplinecolor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setcroplinecolor.write((int) R.string.error_generic_resource);
        } catch (NullPointerException unused2) {
            setCropLineColor setcroplinecolor2 = this.presenter;
            if (setcroplinecolor2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setcroplinecolor2.write((int) R.string.error_generic_resource);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver addAccountInfoActivity$MediaBrowserCompat$ItemReceiver = AddAccountInfoActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, AddAccountInfoActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", i);
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
        finish();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "firebaseEventName");
        mo13676d_(str);
    }

    public final void write(String str) {
        AlertController$RecycleListView();
        this.MediaDescriptionCompat = new RoboAdvisorLandingActivity$MediaBrowserCompat$ItemReceiver(this, str);
        Handler handler = new Handler();
        this.MediaBrowserCompat$SearchResultReceiver = handler;
        handler.postDelayed(this.MediaDescriptionCompat, 500);
    }
}
