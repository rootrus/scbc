package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: o.setSwitchPadding */
public final class setSwitchPadding {
    int IconCompatParcelizer = -1;
    Runnable MediaBrowserCompat$CustomActionResultReceiver = null;
    Runnable read = null;
    private WeakReference<View> write;

    setSwitchPadding(View view) {
        this.write = new WeakReference<>(view);
    }

    public final setSwitchPadding MediaBrowserCompat$ItemReceiver(long j) {
        View view = this.write.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final setSwitchPadding IconCompatParcelizer(float f) {
        View view = this.write.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final setSwitchPadding read(float f) {
        View view = this.write.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public final setSwitchPadding MediaMetadataCompat(float f) {
        View view = this.write.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        View view = this.write.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public final setSwitchPadding MediaBrowserCompat$CustomActionResultReceiver(Interpolator interpolator) {
        View view = this.write.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final setSwitchPadding MediaBrowserCompat$CustomActionResultReceiver(long j) {
        View view = this.write.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final setSwitchPadding write(float f) {
        View view = this.write.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public final setSwitchPadding MediaBrowserCompat$ItemReceiver(float f) {
        View view = this.write.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public final setSwitchPadding MediaBrowserCompat$CustomActionResultReceiver(float f) {
        View view = this.write.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public final void read() {
        View view = this.write.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final setSwitchPadding RatingCompat(float f) {
        View view = this.write.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZ(f);
        }
        return this;
    }

    public final void write() {
        View view = this.write.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final setSwitchPadding read(setSwitchTypeface setswitchtypeface) {
        View view = this.write.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                MediaBrowserCompat$ItemReceiver(view, setswitchtypeface);
            } else {
                view.setTag(2113929216, setswitchtypeface);
                MediaBrowserCompat$ItemReceiver(view, new setSwitchPadding$MediaBrowserCompat$CustomActionResultReceiver(this));
            }
        }
        return this;
    }

    private void MediaBrowserCompat$ItemReceiver(final View view, final setSwitchTypeface setswitchtypeface) {
        if (setswitchtypeface != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    setswitchtypeface.MediaBrowserCompat$CustomActionResultReceiver(view);
                }

                public void onAnimationEnd(Animator animator) {
                    setswitchtypeface.MediaBrowserCompat$ItemReceiver(view);
                }

                public void onAnimationStart(Animator animator) {
                    setswitchtypeface.write(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final setSwitchPadding read(final CheckCaptureModule_GetProcessingParametersFactory checkCaptureModule_GetProcessingParametersFactory) {
        final View view = this.write.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C15503 r1 = null;
            if (checkCaptureModule_GetProcessingParametersFactory != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        checkCaptureModule_GetProcessingParametersFactory.MediaBrowserCompat$ItemReceiver();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }
}
