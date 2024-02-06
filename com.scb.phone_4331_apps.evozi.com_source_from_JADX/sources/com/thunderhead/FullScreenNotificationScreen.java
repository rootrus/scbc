package com.thunderhead;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p040o.C6552xadbb583e;
import p040o.C6554xc460715d;
import p040o.C6801x9d294c38;
import p040o.FragmentBuilder_BindGiftingMoneyTransferInputFragment;
import p040o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment;
import p040o.FragmentBuilder_BindHmlETBSuccessFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindSmeLoanDetailFragment;
import p040o.MyECouponActivity_ViewBinding;

public class FullScreenNotificationScreen extends Activity implements View.OnClickListener, FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.write {
    private View IconCompatParcelizer;
    /* access modifiers changed from: private */
    public TextView MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public TextView MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public ImageView MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private boolean read = false;
    /* access modifiers changed from: private */
    public FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment write;

    static {
        FragmentBuilder_BindGiftingMoneyTransferInputFragment.MediaBrowserCompat$ItemReceiver(FullScreenNotificationScreen.class);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        FragmentBuilder_BindHmlLandingFragment fragmentBuilder_BindHmlLandingFragment;
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        try {
            FragmentBuilder_BindHmlETBSuccessFragment fragmentBuilder_BindHmlETBSuccessFragment = (FragmentBuilder_BindHmlETBSuccessFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setCheckable();
            if (fragmentBuilder_BindHmlETBSuccessFragment != null) {
                if (fragmentBuilder_BindHmlETBSuccessFragment.write != null) {
                    FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment = (FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment) fragmentBuilder_BindHmlETBSuccessFragment.write;
                    this.write = fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment;
                    fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.MediaBrowserCompat$SearchResultReceiver = new WeakReference<>(this);
                    if (this.write.IconCompatParcelizer == null) {
                        finish();
                        return;
                    }
                    setContentView(C6554xc460715d.th_full_screen_notification_layout);
                    this.IconCompatParcelizer = getWindow().getDecorView();
                    Bitmap IconCompatParcelizer2 = this.write.IconCompatParcelizer();
                    if (IconCompatParcelizer2 == null) {
                        MyECouponActivity_ViewBinding.write("Error occurred during preparation of a fullscreen optimization: background is null");
                        finish();
                        return;
                    }
                    this.IconCompatParcelizer.setBackground(new BitmapDrawable(getResources(), IconCompatParcelizer2));
                    ImageView imageView = (ImageView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.notificationContent);
                    this.MediaBrowserCompat$MediaItem = imageView;
                    imageView.setImageBitmap(this.write.IconCompatParcelizer);
                    this.MediaBrowserCompat$MediaItem.setOnClickListener(this);
                    FragmentBuilder_BindHmlLandingFragment fragmentBuilder_BindHmlLandingFragment2 = null;
                    if (this.write.f3144x50fd9e4a != null) {
                        fragmentBuilder_BindHmlLandingFragment = null;
                        for (FragmentBuilder_BindHmlLandingFragment next : this.write.f3144x50fd9e4a) {
                            if (C6552xadbb583e.NEUTRAL.equals(next.MediaBrowserCompat$ItemReceiver()) && next.MediaBrowserCompat$CustomActionResultReceiver() != null) {
                                fragmentBuilder_BindHmlLandingFragment = next;
                            } else if (C6552xadbb583e.NEGATIVE.equals(next.MediaBrowserCompat$ItemReceiver()) && next.MediaBrowserCompat$CustomActionResultReceiver() != null) {
                                fragmentBuilder_BindHmlLandingFragment2 = next;
                            }
                        }
                    } else {
                        fragmentBuilder_BindHmlLandingFragment = null;
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = (TextView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.labelNegative);
                    this.MediaBrowserCompat$ItemReceiver = (TextView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.labelNeutral);
                    if (fragmentBuilder_BindHmlLandingFragment2 != null) {
                        this.MediaBrowserCompat$CustomActionResultReceiver.setText(fragmentBuilder_BindHmlLandingFragment2.MediaBrowserCompat$CustomActionResultReceiver());
                        this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener(this);
                    } else {
                        this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(8);
                    }
                    if (fragmentBuilder_BindHmlLandingFragment != null) {
                        this.MediaBrowserCompat$ItemReceiver.setText(fragmentBuilder_BindHmlLandingFragment.MediaBrowserCompat$CustomActionResultReceiver());
                        this.MediaBrowserCompat$ItemReceiver.setOnClickListener(this);
                    } else {
                        this.MediaBrowserCompat$ItemReceiver.setVisibility(8);
                    }
                    this.IconCompatParcelizer.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    this.MediaBrowserCompat$MediaItem.setVisibility(4);
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() == 0) {
                        this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(4);
                    }
                    if (this.MediaBrowserCompat$ItemReceiver.getVisibility() == 0) {
                        this.MediaBrowserCompat$ItemReceiver.setVisibility(4);
                    }
                    FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSmeLoanDetailFragment.IconCompatParcelizer.write);
                    return;
                }
            }
            finish();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            finish();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!this.MediaBrowserCompat$SearchResultReceiver && z) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(500);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.IconCompatParcelizer, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            ofFloat.setDuration(330).setInterpolator(new LinearInterpolator());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.MediaBrowserCompat$MediaItem, View.TRANSLATION_Y, new float[]{-(((float) this.MediaBrowserCompat$MediaItem.getHeight()) + this.MediaBrowserCompat$MediaItem.getY()), 0.0f});
            ofFloat2.setInterpolator(new OvershootInterpolator());
            ofFloat2.addListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    FullScreenNotificationScreen.this.MediaBrowserCompat$MediaItem.setVisibility(0);
                    if (FullScreenNotificationScreen.this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() != 8) {
                        FullScreenNotificationScreen.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                    }
                    if (FullScreenNotificationScreen.this.MediaBrowserCompat$ItemReceiver.getVisibility() != 8) {
                        FullScreenNotificationScreen.this.MediaBrowserCompat$ItemReceiver.setVisibility(0);
                    }
                }
            });
            arrayList.add(ofFloat2);
            if (this.MediaBrowserCompat$ItemReceiver.getVisibility() != 8) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.MediaBrowserCompat$ItemReceiver, View.TRANSLATION_X, new float[]{((float) this.MediaBrowserCompat$ItemReceiver.getWidth()) + this.MediaBrowserCompat$ItemReceiver.getX(), 0.0f});
                ofFloat3.setInterpolator(new OvershootInterpolator());
                arrayList.add(ofFloat3);
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() != 8) {
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.MediaBrowserCompat$CustomActionResultReceiver, View.TRANSLATION_X, new float[]{-(this.MediaBrowserCompat$CustomActionResultReceiver.getX() + ((float) this.MediaBrowserCompat$CustomActionResultReceiver.getWidth())), 0.0f});
                ofFloat4.setInterpolator(new OvershootInterpolator());
                arrayList.add(ofFloat4);
            }
            animatorSet2.playTogether(arrayList);
            animatorSet.playSequentially(new Animator[]{ofFloat, animatorSet2});
            animatorSet.start();
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(final Runnable runnable) {
        C62051 r0 = new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                } catch (Throwable th) {
                    FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6801x9d294c38.MediaBrowserCompat$ItemReceiver);
                    FullScreenNotificationScreen.this.finish();
                    throw th;
                }
                FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6801x9d294c38.MediaBrowserCompat$ItemReceiver);
                FullScreenNotificationScreen.this.finish();
            }
        };
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(500);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.IconCompatParcelizer, View.ALPHA, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
        ofFloat.setDuration(330).setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.MediaBrowserCompat$MediaItem, View.TRANSLATION_Y, new float[]{0.0f, -(((float) this.MediaBrowserCompat$MediaItem.getHeight()) + this.MediaBrowserCompat$MediaItem.getY())});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addListener(new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                FullScreenNotificationScreen.this.MediaBrowserCompat$MediaItem.setVisibility(4);
                if (FullScreenNotificationScreen.this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() != 8) {
                    FullScreenNotificationScreen.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(4);
                }
                if (FullScreenNotificationScreen.this.MediaBrowserCompat$ItemReceiver.getVisibility() != 8) {
                    FullScreenNotificationScreen.this.MediaBrowserCompat$ItemReceiver.setVisibility(4);
                }
            }
        });
        arrayList.add(ofFloat2);
        if (this.MediaBrowserCompat$ItemReceiver.getVisibility() != 8) {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.MediaBrowserCompat$ItemReceiver, View.TRANSLATION_X, new float[]{0.0f, ((float) this.MediaBrowserCompat$ItemReceiver.getWidth()) + this.MediaBrowserCompat$ItemReceiver.getX()});
            ofFloat3.setInterpolator(new LinearInterpolator());
            arrayList.add(ofFloat3);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() != 8) {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.MediaBrowserCompat$CustomActionResultReceiver, View.TRANSLATION_X, new float[]{0.0f, -(this.MediaBrowserCompat$CustomActionResultReceiver.getX() + ((float) this.MediaBrowserCompat$CustomActionResultReceiver.getWidth()))});
            ofFloat4.setInterpolator(new LinearInterpolator());
            arrayList.add(ofFloat4);
        }
        animatorSet2.playTogether(arrayList);
        animatorSet.playSequentially(new Animator[]{animatorSet2, ofFloat});
        animatorSet.addListener(r0);
        animatorSet.start();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.notificationContent) {
            MediaBrowserCompat$CustomActionResultReceiver((Runnable) new Runnable() {
                public final void run() {
                    FullScreenNotificationScreen.this.write.RatingCompat();
                }
            });
        } else if (id == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.labelNeutral) {
            MediaBrowserCompat$CustomActionResultReceiver((Runnable) new Runnable() {
                public final void run() {
                    FullScreenNotificationScreen.this.write.MediaBrowserCompat$CustomActionResultReceiver(C6552xadbb583e.NEUTRAL);
                }
            });
        } else if (id == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.labelNegative) {
            MediaBrowserCompat$CustomActionResultReceiver((Runnable) new Runnable() {
                public final void run() {
                    FullScreenNotificationScreen.this.write.MediaBrowserCompat$CustomActionResultReceiver(C6552xadbb583e.NEGATIVE);
                }
            });
        }
    }

    public void onBackPressed() {
        if (!this.read) {
            this.read = true;
            MediaBrowserCompat$CustomActionResultReceiver((Runnable) new Runnable() {
                public final void run() {
                    if (!FullScreenNotificationScreen.this.isFinishing()) {
                        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6801x9d294c38.MediaBrowserCompat$ItemReceiver);
                        FullScreenNotificationScreen.this.finish();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (isChangingConfigurations()) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6801x9d294c38.MediaBrowserCompat$ItemReceiver);
            finish();
        }
        if (isFinishing()) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6801x9d294c38.MediaBrowserCompat$ItemReceiver);
            FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment = this.write;
            if (fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment != null && fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.write != null) {
                fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.write.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (!isFinishing()) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6801x9d294c38.MediaBrowserCompat$ItemReceiver);
            finish();
        }
    }
}
