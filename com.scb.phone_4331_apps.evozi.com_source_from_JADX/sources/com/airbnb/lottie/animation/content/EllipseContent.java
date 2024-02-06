package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

public class EllipseContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float ELLIPSE_CONTROL_POINT_PERCENTAGE = 0.55228f;
    private final CircleShape circleShape;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final Path path = new Path();
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, PointF> sizeAnimation;
    private CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable2, BaseLayer baseLayer, CircleShape circleShape2) {
        this.name = circleShape2.getName();
        this.lottieDrawable = lottieDrawable2;
        this.sizeAnimation = circleShape2.getSize().createAnimation();
        this.positionAnimation = circleShape2.getPosition().createAnimation();
        this.circleShape = circleShape2;
        baseLayer.addAnimation(this.sizeAnimation);
        baseLayer.addAnimation(this.positionAnimation);
        this.sizeAnimation.addUpdateListener(this);
        this.positionAnimation.addUpdateListener(this);
    }

    public void onValueChanged() {
        invalidate();
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.circleShape.isHidden()) {
            this.isPathValid = true;
            return this.path;
        }
        PointF value = this.sizeAnimation.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        float f3 = f * ELLIPSE_CONTROL_POINT_PERCENTAGE;
        float f4 = ELLIPSE_CONTROL_POINT_PERCENTAGE * f2;
        this.path.reset();
        if (this.circleShape.isReversed()) {
            float f5 = -f2;
            this.path.moveTo(BitmapDescriptorFactory.HUE_RED, f5);
            Path path2 = this.path;
            float f6 = BitmapDescriptorFactory.HUE_RED - f3;
            float f7 = -f;
            float f8 = BitmapDescriptorFactory.HUE_RED - f4;
            path2.cubicTo(f6, f5, f7, f8, f7, BitmapDescriptorFactory.HUE_RED);
            Path path3 = this.path;
            float f9 = f4 + BitmapDescriptorFactory.HUE_RED;
            float f10 = f5;
            path3.cubicTo(f7, f9, f6, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path4 = this.path;
            float f11 = f3 + BitmapDescriptorFactory.HUE_RED;
            path4.cubicTo(f11, f2, f, f9, f, BitmapDescriptorFactory.HUE_RED);
            this.path.cubicTo(f, f8, f11, f10, BitmapDescriptorFactory.HUE_RED, f10);
        } else {
            float f12 = -f2;
            this.path.moveTo(BitmapDescriptorFactory.HUE_RED, f12);
            Path path5 = this.path;
            float f13 = f3 + BitmapDescriptorFactory.HUE_RED;
            float f14 = BitmapDescriptorFactory.HUE_RED - f4;
            path5.cubicTo(f13, f12, f, f14, f, BitmapDescriptorFactory.HUE_RED);
            Path path6 = this.path;
            float f15 = f4 + BitmapDescriptorFactory.HUE_RED;
            path6.cubicTo(f, f15, f13, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path7 = this.path;
            float f16 = BitmapDescriptorFactory.HUE_RED - f3;
            float f17 = -f;
            path7.cubicTo(f16, f2, f17, f15, f17, BitmapDescriptorFactory.HUE_RED);
            float f18 = f12;
            this.path.cubicTo(f17, f14, f16, f18, BitmapDescriptorFactory.HUE_RED, f18);
        }
        PointF value2 = this.positionAnimation.getValue();
        this.path.offset(value2.x, value2.y);
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    public <T> void addValueCallback(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.ELLIPSE_SIZE) {
            this.sizeAnimation.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
        }
    }
}
