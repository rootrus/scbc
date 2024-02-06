package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;
import p040o.setAutoSizeTextTypeWithDefaults;

public class GradientStrokeContent extends BaseStrokeContent {
    private static final int CACHE_STEPS_MS = 32;
    private final RectF boundsRect = new RectF();
    private final int cacheSteps;
    private final BaseKeyframeAnimation<GradientColor, GradientColor> colorAnimation;
    private ValueCallbackKeyframeAnimation colorCallbackAnimation;
    private final BaseKeyframeAnimation<PointF, PointF> endPointAnimation;
    private final boolean hidden;
    private final setAutoSizeTextTypeWithDefaults<LinearGradient> linearGradientCache = new setAutoSizeTextTypeWithDefaults<>();
    private final String name;
    private final setAutoSizeTextTypeWithDefaults<RadialGradient> radialGradientCache = new setAutoSizeTextTypeWithDefaults<>();
    private final BaseKeyframeAnimation<PointF, PointF> startPointAnimation;
    private final GradientType type;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.name = gradientStroke.getName();
        this.type = gradientStroke.getGradientType();
        this.hidden = gradientStroke.isHidden();
        this.cacheSteps = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientStroke.getGradientColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(this.colorAnimation);
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = gradientStroke.getStartPoint().createAnimation();
        this.startPointAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(this.startPointAnimation);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientStroke.getEndPoint().createAnimation();
        this.endPointAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(this.endPointAnimation);
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.hidden) {
            getBounds(this.boundsRect, matrix, false);
            if (this.type == GradientType.LINEAR) {
                shader = getLinearGradient();
            } else {
                shader = getRadialGradient();
            }
            shader.setLocalMatrix(matrix);
            this.paint.setShader(shader);
            super.draw(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.name;
    }

    private LinearGradient getLinearGradient() {
        long gradientHash = (long) getGradientHash();
        LinearGradient MediaBrowserCompat$ItemReceiver = this.linearGradientCache.MediaBrowserCompat$ItemReceiver(gradientHash, null);
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        PointF value = this.startPointAnimation.getValue();
        PointF value2 = this.endPointAnimation.getValue();
        GradientColor value3 = this.colorAnimation.getValue();
        LinearGradient linearGradient = new LinearGradient(value.x, value.y, value2.x, value2.y, applyDynamicColorsIfNeeded(value3.getColors()), value3.getPositions(), Shader.TileMode.CLAMP);
        this.linearGradientCache.read(gradientHash, linearGradient);
        return linearGradient;
    }

    private RadialGradient getRadialGradient() {
        long gradientHash = (long) getGradientHash();
        RadialGradient MediaBrowserCompat$ItemReceiver = this.radialGradientCache.MediaBrowserCompat$ItemReceiver(gradientHash, null);
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        PointF value = this.startPointAnimation.getValue();
        PointF value2 = this.endPointAnimation.getValue();
        GradientColor value3 = this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        float f = value.x;
        float f2 = value.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (value2.x - f), (double) (value2.y - f2)), applyDynamicColorsIfNeeded, positions, Shader.TileMode.CLAMP);
        this.radialGradientCache.read(gradientHash, radialGradient);
        return radialGradient;
    }

    private int getGradientHash() {
        int round = Math.round(this.startPointAnimation.getProgress() * ((float) this.cacheSteps));
        int round2 = Math.round(this.endPointAnimation.getProgress() * ((float) this.cacheSteps));
        int round3 = Math.round(this.colorAnimation.getProgress() * ((float) this.cacheSteps));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.colorCallbackAnimation;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public <T> void addValueCallback(T t, LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t != LottieProperty.GRADIENT_COLOR) {
            return;
        }
        if (lottieValueCallback == null) {
            if (this.colorCallbackAnimation != null) {
                this.layer.removeAnimation(this.colorCallbackAnimation);
            }
            this.colorCallbackAnimation = null;
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.colorCallbackAnimation = valueCallbackKeyframeAnimation;
        valueCallbackKeyframeAnimation.addUpdateListener(this);
        this.layer.addAnimation(this.colorCallbackAnimation);
    }
}
