package com.thunderhead;

import android.animation.Animator;
import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p040o.C1188xc0532a8d;
import p040o.EasycashNcbCaseModule;
import p040o.FragmentBuilder_BindHmlEkycFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnBoardingTutorialActivity;

public class MiniOptimizationViewController extends RelativeLayout {
    public long IconCompatParcelizer;
    public Runnable MediaBrowserCompat$CustomActionResultReceiver;
    public FragmentBuilder_BindHmlEkycFragment MediaBrowserCompat$ItemReceiver;
    public long MediaBrowserCompat$MediaItem;
    public final View MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final ImageView f3103x50fd9e4a;
    public Runnable MediaDescriptionCompat;
    public Runnable MediaMetadataCompat;
    /* access modifiers changed from: private */
    public GestureDetector MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public long MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public boolean ParcelableVolumeInfo;
    public final RelativeLayout.LayoutParams RatingCompat;
    public final ViewGroup read;
    public Runnable write;

    public MiniOptimizationViewController(Activity activity, View view, FragmentBuilder_BindHmlEkycFragment fragmentBuilder_BindHmlEkycFragment, boolean z, long j, final boolean z2) {
        super(activity);
        this.MediaBrowserCompat$SearchResultReceiver = view;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlEkycFragment;
        this.f3103x50fd9e4a = (ImageView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.notificationContent);
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (decorView instanceof ViewGroup) {
            this.read = (ViewGroup) decorView;
        } else {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Decorview not instance of ViewGroup");
            this.read = viewGroup;
        }
        this.MediaSessionCompat$ResultReceiverWrapper = j == 0 ? 6000 : j;
        ImageView imageView = this.f3103x50fd9e4a;
        if (imageView != null && !z) {
            imageView.setVisibility(4);
        }
        int i = 0;
        setBackgroundColor(0);
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        if (windowManager != null) {
            i = windowManager.getDefaultDisplay().getRotation();
        } else {
            MyECouponActivity_ViewBinding.write("Window Manager Null. Can't set mini notification layout params correctly.");
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(viewGroup.getWidth(), this.MediaBrowserCompat$SearchResultReceiver.getLayoutParams().height);
        this.RatingCompat = layoutParams;
        if (i == 1) {
            layoutParams.addRule(9);
        } else if (i == 3) {
            layoutParams.addRule(11);
        }
        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
        if (z2) {
            this.RatingCompat.addRule(10);
            this.RatingCompat.topMargin = EasycashNcbCaseModule.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
        } else {
            this.RatingCompat.addRule(12);
            int read2 = EasycashNcbCaseModule.read(MediaBrowserCompat$ItemReceiver2);
            if (this.read.getBottom() > read2) {
                this.RatingCompat.bottomMargin = this.read.getBottom() - read2;
            }
        }
        this.MediaSessionCompat$QueueItem = new GestureDetector(activity, new write(z2));
        this.MediaBrowserCompat$SearchResultReceiver.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MiniOptimizationViewController.this.MediaSessionCompat$QueueItem.onTouchEvent(motionEvent);
            }
        });
        this.MediaMetadataCompat = new read(z2, z);
        this.MediaDescriptionCompat = new Runnable() {
            public final void run() {
                MiniOptimizationViewController miniOptimizationViewController = MiniOptimizationViewController.this;
                miniOptimizationViewController.addView(miniOptimizationViewController.MediaBrowserCompat$SearchResultReceiver, MiniOptimizationViewController.this.RatingCompat);
                MiniOptimizationViewController.this.read.addView(MiniOptimizationViewController.this);
                long unused = MiniOptimizationViewController.this.MediaBrowserCompat$MediaItem = System.currentTimeMillis();
                if (MiniOptimizationViewController.this.MediaSessionCompat$ResultReceiverWrapper != -1) {
                    long MediaBrowserCompat$CustomActionResultReceiver = MiniOptimizationViewController.this.MediaSessionCompat$ResultReceiverWrapper - MiniOptimizationViewController.this.IconCompatParcelizer;
                    if (MediaBrowserCompat$CustomActionResultReceiver < 0) {
                        MediaBrowserCompat$CustomActionResultReceiver = 0;
                    }
                    MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.postDelayed(MiniOptimizationViewController.this.write, MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        };
        this.MediaBrowserCompat$CustomActionResultReceiver = new Runnable() {
            public final void run() {
                MiniOptimizationViewController.this.IconCompatParcelizer(true, z2);
            }
        };
        this.write = new MiniOptimizationViewController$MediaBrowserCompat$ItemReceiver(this, z2);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(this.write);
        this.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(this.MediaDescriptionCompat);
        this.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(this.MediaMetadataCompat);
    }

    public final void IconCompatParcelizer(boolean z, final boolean z2) {
        if (!this.ParcelableVolumeInfo) {
            MediaBrowserCompat$ItemReceiver();
            this.ParcelableVolumeInfo = true;
            if (!z) {
                this.read.removeView(this);
            } else if (this.f3103x50fd9e4a != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188xc0532a8d.th_animation_scale_down);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        MiniOptimizationViewController.this.f3103x50fd9e4a.setVisibility(4);
                        MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.animate().setInterpolator(new LinearInterpolator()).translationYBy((float) (z2 ? -MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.getHeight() : MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.getHeight())).setDuration(100).setListener(new C6217xcef82892(MiniOptimizationViewController.this, (byte) 0)).start();
                    }
                });
                this.f3103x50fd9e4a.startAnimation(loadAnimation);
            } else {
                this.MediaBrowserCompat$SearchResultReceiver.animate().setInterpolator(new LinearInterpolator()).translationYBy((float) (z2 ? -this.MediaBrowserCompat$SearchResultReceiver.getHeight() : this.MediaBrowserCompat$SearchResultReceiver.getHeight())).setDuration(100).setListener(new C6217xcef82892(this, (byte) 0)).start();
            }
        }
    }

    class write implements GestureDetector.OnGestureListener {
        private final boolean read;

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        write(boolean z) {
            this.read = z;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.read && Math.abs(f2) > 50.0f && motionEvent.getY() - motionEvent2.getY() > 50.0f) {
                MediaBrowserCompat$ItemReceiver();
                return true;
            } else if (this.read || f2 <= 50.0f || motionEvent2.getY() - motionEvent.getY() <= 50.0f) {
                return false;
            } else {
                MediaBrowserCompat$ItemReceiver();
                return true;
            }
        }

        private void MediaBrowserCompat$ItemReceiver() {
            MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.post(MiniOptimizationViewController.this.MediaBrowserCompat$CustomActionResultReceiver);
            if (MiniOptimizationViewController.this.MediaBrowserCompat$ItemReceiver != null) {
                MiniOptimizationViewController.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (MiniOptimizationViewController.this.ParcelableVolumeInfo) {
                return true;
            }
            MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.post(MiniOptimizationViewController.this.MediaBrowserCompat$CustomActionResultReceiver);
            if (MiniOptimizationViewController.this.MediaBrowserCompat$ItemReceiver == null) {
                return true;
            }
            MiniOptimizationViewController.this.MediaBrowserCompat$ItemReceiver.RatingCompat();
            return true;
        }
    }

    class read implements Runnable, Animation.AnimationListener {
        private final boolean MediaBrowserCompat$ItemReceiver;
        final boolean read;

        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public read(boolean z, boolean z2) {
            this.MediaBrowserCompat$ItemReceiver = z;
            this.read = z2;
        }

        public final void run() {
            int i;
            MiniOptimizationViewController miniOptimizationViewController = MiniOptimizationViewController.this;
            miniOptimizationViewController.addView(miniOptimizationViewController.MediaBrowserCompat$SearchResultReceiver, MiniOptimizationViewController.this.RatingCompat);
            MiniOptimizationViewController.this.read.addView(MiniOptimizationViewController.this);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            MiniOptimizationViewController.this.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
            final Animation loadAnimation = AnimationUtils.loadAnimation(MiniOptimizationViewController.this.getContext(), C1188xc0532a8d.th_animation_scale_up);
            loadAnimation.setAnimationListener(this);
            if (this.MediaBrowserCompat$ItemReceiver) {
                i = -MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.getMeasuredHeight();
            } else {
                i = MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.getMeasuredHeight();
            }
            MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.setTranslationY((float) i);
            MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.animate().setInterpolator(new LinearInterpolator()).translationYBy((float) (-i)).setDuration(100).setListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (MiniOptimizationViewController.this.f3103x50fd9e4a != null && !read.this.read) {
                        MiniOptimizationViewController.this.f3103x50fd9e4a.startAnimation(loadAnimation);
                    }
                }
            }).start();
            long unused = MiniOptimizationViewController.this.MediaBrowserCompat$MediaItem = System.currentTimeMillis() + 100;
            if (MiniOptimizationViewController.this.MediaSessionCompat$ResultReceiverWrapper != -1) {
                MiniOptimizationViewController.this.MediaBrowserCompat$SearchResultReceiver.postDelayed(MiniOptimizationViewController.this.write, MiniOptimizationViewController.this.MediaSessionCompat$ResultReceiverWrapper + 100);
            }
        }

        public final void onAnimationStart(Animation animation) {
            if (MiniOptimizationViewController.this.f3103x50fd9e4a != null) {
                MiniOptimizationViewController.this.f3103x50fd9e4a.setVisibility(0);
            }
        }
    }
}
