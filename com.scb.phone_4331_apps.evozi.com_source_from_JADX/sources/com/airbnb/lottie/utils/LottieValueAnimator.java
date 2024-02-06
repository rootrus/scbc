package com.airbnb.lottie.utils;

import android.view.Choreographer;
import com.airbnb.lottie.C0088L;
import com.airbnb.lottie.LottieComposition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    private LottieComposition composition;
    private float frame = BitmapDescriptorFactory.HUE_RED;
    private long lastFrameTimeNs = 0;
    private float maxFrame = 2.14748365E9f;
    private float minFrame = -2.14748365E9f;
    private int repeatCount = 0;
    protected boolean running = false;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;

    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (this.frame - lottieComposition.getStartFrame()) / (this.composition.getEndFrame() - this.composition.getStartFrame());
    }

    public float getAnimatedFraction() {
        float f;
        float f2;
        float f3;
        if (this.composition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (isReversed()) {
            f3 = getMaxFrame() - this.frame;
            f2 = getMaxFrame();
            f = getMinFrame();
        } else {
            f3 = this.frame - getMinFrame();
            f2 = getMaxFrame();
            f = getMinFrame();
        }
        return f3 / (f2 - f);
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0;
        }
        return (long) lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.frame;
    }

    public boolean isRunning() {
        return this.running;
    }

    public void doFrame(long j) {
        postFrameCallback();
        if (this.composition != null && isRunning()) {
            C0088L.beginSection("LottieValueAnimator#doFrame");
            long j2 = this.lastFrameTimeNs;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float frameDurationNs = ((float) j3) / getFrameDurationNs();
            float f = this.frame;
            if (isReversed()) {
                frameDurationNs = -frameDurationNs;
            }
            float f2 = f + frameDurationNs;
            this.frame = f2;
            boolean contains = MiscUtils.contains(f2, getMinFrame(), getMaxFrame());
            this.frame = MiscUtils.clamp(this.frame, getMinFrame(), getMaxFrame());
            this.lastFrameTimeNs = j;
            notifyUpdate();
            if (!contains) {
                if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
                    notifyRepeat();
                    this.repeatCount++;
                    if (getRepeatMode() == 2) {
                        this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                        reverseAnimationSpeed();
                    } else {
                        this.frame = isReversed() ? getMaxFrame() : getMinFrame();
                    }
                    this.lastFrameTimeNs = j;
                } else {
                    this.frame = this.speed < BitmapDescriptorFactory.HUE_RED ? getMinFrame() : getMaxFrame();
                    removeFrameCallback();
                    notifyEnd(isReversed());
                }
            }
            verifyFrame();
            C0088L.endSection("LottieValueAnimator#doFrame");
        }
    }

    private float getFrameDurationNs() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.speed);
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.14748365E9f;
        this.maxFrame = 2.14748365E9f;
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z = this.composition == null;
        this.composition = lottieComposition;
        if (z) {
            setMinAndMaxFrames((float) ((int) Math.max(this.minFrame, lottieComposition.getStartFrame())), (float) ((int) Math.min(this.maxFrame, lottieComposition.getEndFrame())));
        } else {
            setMinAndMaxFrames((float) ((int) lottieComposition.getStartFrame()), (float) ((int) lottieComposition.getEndFrame()));
        }
        float f = this.frame;
        this.frame = BitmapDescriptorFactory.HUE_RED;
        setFrame((float) ((int) f));
    }

    public void setFrame(float f) {
        if (this.frame != f) {
            this.frame = MiscUtils.clamp(f, getMinFrame(), getMaxFrame());
            this.lastFrameTimeNs = 0;
            notifyUpdate();
        }
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames((float) i, (float) ((int) this.maxFrame));
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.minFrame, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f <= f2) {
            LottieComposition lottieComposition = this.composition;
            float startFrame = lottieComposition == null ? -3.4028235E38f : lottieComposition.getStartFrame();
            LottieComposition lottieComposition2 = this.composition;
            float endFrame = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.getEndFrame();
            this.minFrame = MiscUtils.clamp(f, startFrame, endFrame);
            this.maxFrame = MiscUtils.clamp(f2, startFrame, endFrame);
            setFrame((float) ((int) MiscUtils.clamp(this.frame, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.speedReversedForRepeatMode) {
            this.speedReversedForRepeatMode = false;
            reverseAnimationSpeed();
        }
    }

    public void playAnimation() {
        this.running = true;
        notifyStart(isReversed());
        setFrame((float) ((int) (isReversed() ? getMaxFrame() : getMinFrame())));
        this.lastFrameTimeNs = 0;
        this.repeatCount = 0;
        postFrameCallback();
    }

    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    public void pauseAnimation() {
        removeFrameCallback();
    }

    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0;
        if (isReversed() && getFrame() == getMinFrame()) {
            this.frame = getMaxFrame();
        } else if (!isReversed() && getFrame() == getMaxFrame()) {
            this.frame = getMinFrame();
        }
    }

    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    private boolean isReversed() {
        return getSpeed() < BitmapDescriptorFactory.HUE_RED;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.minFrame;
        return f == -2.14748365E9f ? lottieComposition.getStartFrame() : f;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.maxFrame;
        return f == 2.14748365E9f ? lottieComposition.getEndFrame() : f;
    }

    /* access modifiers changed from: protected */
    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    /* access modifiers changed from: protected */
    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }

    private void verifyFrame() {
        if (this.composition != null) {
            float f = this.frame;
            if (f < this.minFrame || f > this.maxFrame) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.minFrame), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)}));
            }
        }
    }
}
