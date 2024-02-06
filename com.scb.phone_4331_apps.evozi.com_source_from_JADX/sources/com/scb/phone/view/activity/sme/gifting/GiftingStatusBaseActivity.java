package com.scb.phone.view.activity.sme.gifting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.scb.phone.view.activity.BaseActivity;
import com.squareup.picasso.Picasso;
import org.json.JSONObject;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.FragmentBuilder_BindEkycFragment;

public abstract class GiftingStatusBaseActivity extends BaseActivity {
    protected boolean MediaBrowserCompat$MediaItem = false;
    private AutoValue_CrashlyticsReport_Session_User MediaBrowserCompat$SearchResultReceiver;
    @BindView
    protected LottieAnimationView giftAnimation;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User);

    /* access modifiers changed from: protected */
    public abstract int MediaSessionCompat$ResultReceiverWrapper();

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(MediaSessionCompat$ResultReceiverWrapper());
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$Token() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("EXTRA_GIFT_STATUS_SELECTED")) {
            this.MediaBrowserCompat$SearchResultReceiver = (AutoValue_CrashlyticsReport_Session_User) extras.get("EXTRA_GIFT_STATUS_SELECTED");
            this.MediaBrowserCompat$MediaItem = extras.getBoolean("EXTRA_GIFT_FROM_PREVIEW");
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final void read(JSONObject jSONObject) {
        try {
            this.giftAnimation.setAnimationFromJson(jSONObject.toString(), (String) null);
            this.giftAnimation.loop(true);
            this.giftAnimation.playAnimation();
        } catch (Exception unused) {
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            this.giftAnimation.setAnimationFromJson(jSONObject.toString(), (String) null);
            final LottieComposition fromJsonSync = LottieComposition.Factory.fromJsonSync(getResources(), jSONObject2);
            this.giftAnimation.loop(true);
            this.giftAnimation.addAnimatorListener(new AnimatorListenerAdapter() {
                public final void onAnimationRepeat(Animator animator) {
                    GiftingStatusBaseActivity.this.giftAnimation.removeAnimatorListener(this);
                    GiftingStatusBaseActivity.this.giftAnimation.setComposition(fromJsonSync);
                    GiftingStatusBaseActivity.this.giftAnimation.playAnimation();
                }
            });
            this.giftAnimation.playAnimation();
        } catch (Exception unused) {
        }
    }

    public final void read(JSONObject jSONObject, final String str) {
        try {
            this.giftAnimation.setAnimationFromJson(jSONObject.toString(), (String) null);
            this.giftAnimation.loop(false);
            this.giftAnimation.addAnimatorListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GiftingStatusBaseActivity.this.giftAnimation.cancelAnimation();
                    GiftingStatusBaseActivity.this.read(str);
                }
            });
            this.giftAnimation.playAnimation();
        } catch (Exception unused) {
        }
    }

    public final void read(String str) {
        Picasso.read().write(str).read(this.giftAnimation, (FragmentBuilder_BindEkycFragment) null);
    }
}
