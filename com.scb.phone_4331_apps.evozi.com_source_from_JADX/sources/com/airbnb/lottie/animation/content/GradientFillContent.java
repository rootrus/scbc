package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C0088L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p040o.setAutoSizeTextTypeWithDefaults;

public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final int CACHE_STEPS_MS = 32;
    private final RectF boundsRect = new RectF();
    private final int cacheSteps;
    private final BaseKeyframeAnimation<GradientColor, GradientColor> colorAnimation;
    private ValueCallbackKeyframeAnimation colorCallbackAnimation;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final BaseKeyframeAnimation<PointF, PointF> endPointAnimation;
    private final boolean hidden;
    private final BaseLayer layer;
    private final setAutoSizeTextTypeWithDefaults<LinearGradient> linearGradientCache = new setAutoSizeTextTypeWithDefaults<>();
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final Paint paint = new LPaint(1);
    private final Path path = new Path();
    private final List<PathContent> paths = new ArrayList();
    private final setAutoSizeTextTypeWithDefaults<RadialGradient> radialGradientCache = new setAutoSizeTextTypeWithDefaults<>();
    private final BaseKeyframeAnimation<PointF, PointF> startPointAnimation;
    private final GradientType type;

    public GradientFillContent(LottieDrawable lottieDrawable2, BaseLayer baseLayer, GradientFill gradientFill) {
        this.layer = baseLayer;
        this.name = gradientFill.getName();
        this.hidden = gradientFill.isHidden();
        this.lottieDrawable = lottieDrawable2;
        this.type = gradientFill.getGradientType();
        this.path.setFillType(gradientFill.getFillType());
        this.cacheSteps = (int) (lottieDrawable2.getComposition().getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientFill.getGradientColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(this.colorAnimation);
        BaseKeyframeAnimation<Integer, Integer> createAnimation2 = gradientFill.getOpacity().createAnimation();
        this.opacityAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(this.opacityAnimation);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.startPointAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(this.startPointAnimation);
        BaseKeyframeAnimation<PointF, PointF> createAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.endPointAnimation = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(this.endPointAnimation);
    }

    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof PathContent) {
                this.paths.add((PathContent) content);
            }
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.hidden) {
            C0088L.beginSection("GradientFillContent#draw");
            this.path.reset();
            for (int i2 = 0; i2 < this.paths.size(); i2++) {
                this.path.addPath(this.paths.get(i2).getPath(), matrix);
            }
            this.path.computeBounds(this.boundsRect, false);
            if (this.type == GradientType.LINEAR) {
                shader = getLinearGradient();
            } else {
                shader = getRadialGradient();
            }
            shader.setLocalMatrix(matrix);
            this.paint.setShader(shader);
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.paint.setColorFilter(baseKeyframeAnimation.getValue());
            }
            this.paint.setAlpha(MiscUtils.clamp((int) ((((((float) i) / 255.0f) * ((float) this.opacityAnimation.getValue().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.path, this.paint);
            C0088L.endSection("GradientFillContent#draw");
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.path.reset();
        for (int i = 0; i < this.paths.size(); i++) {
            this.path.addPath(this.paths.get(i).getPath(), matrix);
        }
        this.path.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
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
        float hypot = (float) Math.hypot((double) (value2.x - f), (double) (value2.y - f2));
        if (hypot <= BitmapDescriptorFactory.HUE_RED) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, applyDynamicColorsIfNeeded, positions, Shader.TileMode.CLAMP);
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

    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    public <T> void addValueCallback(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.colorFilterAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorFilterAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
        } else if (t != LottieProperty.GRADIENT_COLOR) {
        } else {
            if (lottieValueCallback == null) {
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.colorCallbackAnimation;
                if (valueCallbackKeyframeAnimation2 != null) {
                    this.layer.removeAnimation(valueCallbackKeyframeAnimation2);
                }
                this.colorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            this.layer.addAnimation(this.colorCallbackAnimation);
        }
    }
}
