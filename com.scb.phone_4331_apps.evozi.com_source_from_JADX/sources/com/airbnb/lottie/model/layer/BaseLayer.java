package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C0088L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    private static final int CLIP_SAVE_FLAG = 2;
    private static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    private static final int MATRIX_SAVE_FLAG = 1;
    private static final int SAVE_FLAGS = 19;
    private final List<BaseKeyframeAnimation<?, ?>> animations = new ArrayList();
    final Matrix boundsMatrix = new Matrix();
    private final Paint clearPaint = new LPaint(PorterDuff.Mode.CLEAR);
    private final Paint contentPaint = new LPaint(1);
    private final String drawTraceName;
    private final Paint dstInPaint = new LPaint(1, PorterDuff.Mode.DST_IN);
    private final Paint dstOutPaint = new LPaint(1, PorterDuff.Mode.DST_OUT);
    final Layer layerModel;
    final LottieDrawable lottieDrawable;
    private MaskKeyframeAnimation mask;
    private final RectF maskBoundsRect = new RectF();
    private final Matrix matrix = new Matrix();
    private final RectF matteBoundsRect = new RectF();
    private BaseLayer matteLayer;
    private final Paint mattePaint = new LPaint(1);
    private BaseLayer parentLayer;
    private List<BaseLayer> parentLayers;
    private final Path path = new Path();
    private final RectF rect = new RectF();
    private final RectF tempMaskBoundsRect = new RectF();
    final TransformKeyframeAnimation transform;
    private boolean visible = true;

    /* access modifiers changed from: package-private */
    public abstract void drawLayer(Canvas canvas, Matrix matrix2, int i);

    /* access modifiers changed from: package-private */
    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
    }

    public void setContents(List<Content> list, List<Content> list2) {
    }

    static BaseLayer forModel(Layer layer, LottieDrawable lottieDrawable2, LottieComposition lottieComposition) {
        switch (C01302.$SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[layer.getLayerType().ordinal()]) {
            case 1:
                return new ShapeLayer(lottieDrawable2, layer);
            case 2:
                return new CompositionLayer(lottieDrawable2, layer, lottieComposition.getPrecomps(layer.getRefId()), lottieComposition);
            case 3:
                return new SolidLayer(lottieDrawable2, layer);
            case 4:
                return new ImageLayer(lottieDrawable2, layer);
            case 5:
                return new NullLayer(lottieDrawable2, layer);
            case 6:
                return new TextLayer(lottieDrawable2, layer);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown layer type ");
                sb.append(layer.getLayerType());
                Logger.warning(sb.toString());
                return null;
        }
    }

    BaseLayer(LottieDrawable lottieDrawable2, Layer layer) {
        this.lottieDrawable = lottieDrawable2;
        this.layerModel = layer;
        StringBuilder sb = new StringBuilder();
        sb.append(layer.getName());
        sb.append("#draw");
        this.drawTraceName = sb.toString();
        if (layer.getMatteType() == Layer.MatteType.INVERT) {
            this.mattePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.mattePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        TransformKeyframeAnimation createAnimation = layer.getTransform().createAnimation();
        this.transform = createAnimation;
        createAnimation.addListener(this);
        if (layer.getMasks() != null && !layer.getMasks().isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.getMasks());
            this.mask = maskKeyframeAnimation;
            for (BaseKeyframeAnimation<ShapeData, Path> addUpdateListener : maskKeyframeAnimation.getMaskAnimations()) {
                addUpdateListener.addUpdateListener(this);
            }
            for (BaseKeyframeAnimation next : this.mask.getOpacityAnimations()) {
                addAnimation(next);
                next.addUpdateListener(this);
            }
        }
        setupInOutAnimations();
    }

    public void onValueChanged() {
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public Layer getLayerModel() {
        return this.layerModel;
    }

    /* access modifiers changed from: package-private */
    public void setMatteLayer(BaseLayer baseLayer) {
        this.matteLayer = baseLayer;
    }

    /* access modifiers changed from: package-private */
    public boolean hasMatteOnThisLayer() {
        return this.matteLayer != null;
    }

    /* access modifiers changed from: package-private */
    public void setParentLayer(BaseLayer baseLayer) {
        this.parentLayer = baseLayer;
    }

    private void setupInOutAnimations() {
        boolean z = true;
        if (!this.layerModel.getInOutKeyframes().isEmpty()) {
            final FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.layerModel.getInOutKeyframes());
            floatKeyframeAnimation.setIsDiscrete();
            floatKeyframeAnimation.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() {
                public void onValueChanged() {
                    BaseLayer.this.setVisible(floatKeyframeAnimation.getFloatValue() == 1.0f);
                }
            });
            if (((Float) floatKeyframeAnimation.getValue()).floatValue() != 1.0f) {
                z = false;
            }
            setVisible(z);
            addAnimation(floatKeyframeAnimation);
            return;
        }
        setVisible(true);
    }

    private void invalidateSelf() {
        this.lottieDrawable.invalidateSelf();
    }

    public void addAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation != null) {
            this.animations.add(baseKeyframeAnimation);
        }
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animations.remove(baseKeyframeAnimation);
    }

    public void getBounds(RectF rectF, Matrix matrix2, boolean z) {
        this.rect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        buildParentLayerListIfNeeded();
        this.boundsMatrix.set(matrix2);
        if (z) {
            List<BaseLayer> list = this.parentLayers;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.boundsMatrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
                }
            } else {
                BaseLayer baseLayer = this.parentLayer;
                if (baseLayer != null) {
                    this.boundsMatrix.preConcat(baseLayer.transform.getMatrix());
                }
            }
        }
        this.boundsMatrix.preConcat(this.transform.getMatrix());
    }

    public void draw(Canvas canvas, Matrix matrix2, int i) {
        C0088L.beginSection(this.drawTraceName);
        if (!this.visible || this.layerModel.isHidden()) {
            C0088L.endSection(this.drawTraceName);
            return;
        }
        buildParentLayerListIfNeeded();
        C0088L.beginSection("Layer#parentMatrix");
        this.matrix.reset();
        this.matrix.set(matrix2);
        for (int size = this.parentLayers.size() - 1; size >= 0; size--) {
            this.matrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
        }
        C0088L.endSection("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue()))) / 100.0f) * 255.0f);
        if (hasMatteOnThisLayer() || hasMasksOnThisLayer()) {
            C0088L.beginSection("Layer#computeBounds");
            getBounds(this.rect, this.matrix, false);
            intersectBoundsWithMatte(this.rect, matrix2);
            this.matrix.preConcat(this.transform.getMatrix());
            intersectBoundsWithMask(this.rect, this.matrix);
            if (!this.rect.intersect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.rect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            C0088L.endSection("Layer#computeBounds");
            if (!this.rect.isEmpty()) {
                C0088L.beginSection("Layer#saveLayer");
                Utils.saveLayerCompat(canvas, this.rect, this.contentPaint);
                C0088L.endSection("Layer#saveLayer");
                clearCanvas(canvas);
                C0088L.beginSection("Layer#drawLayer");
                drawLayer(canvas, this.matrix, intValue);
                C0088L.endSection("Layer#drawLayer");
                if (hasMasksOnThisLayer()) {
                    applyMasks(canvas, this.matrix);
                }
                if (hasMatteOnThisLayer()) {
                    C0088L.beginSection("Layer#drawMatte");
                    C0088L.beginSection("Layer#saveLayer");
                    Utils.saveLayerCompat(canvas, this.rect, this.mattePaint, 19);
                    C0088L.endSection("Layer#saveLayer");
                    clearCanvas(canvas);
                    this.matteLayer.draw(canvas, matrix2, intValue);
                    C0088L.beginSection("Layer#restoreLayer");
                    canvas.restore();
                    C0088L.endSection("Layer#restoreLayer");
                    C0088L.endSection("Layer#drawMatte");
                }
                C0088L.beginSection("Layer#restoreLayer");
                canvas.restore();
                C0088L.endSection("Layer#restoreLayer");
            }
            recordRenderTime(C0088L.endSection(this.drawTraceName));
            return;
        }
        this.matrix.preConcat(this.transform.getMatrix());
        C0088L.beginSection("Layer#drawLayer");
        drawLayer(canvas, this.matrix, intValue);
        C0088L.endSection("Layer#drawLayer");
        recordRenderTime(C0088L.endSection(this.drawTraceName));
    }

    private void recordRenderTime(float f) {
        this.lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(this.layerModel.getName(), f);
    }

    private void clearCanvas(Canvas canvas) {
        C0088L.beginSection("Layer#clearLayer");
        canvas.drawRect(this.rect.left - 1.0f, this.rect.top - 1.0f, this.rect.right + 1.0f, this.rect.bottom + 1.0f, this.clearPaint);
        C0088L.endSection("Layer#clearLayer");
    }

    private void intersectBoundsWithMask(RectF rectF, Matrix matrix2) {
        this.maskBoundsRect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (hasMasksOnThisLayer()) {
            int size = this.mask.getMasks().size();
            int i = 0;
            while (i < size) {
                Mask mask2 = this.mask.getMasks().get(i);
                this.path.set((Path) this.mask.getMaskAnimations().get(i).getValue());
                this.path.transform(matrix2);
                int i2 = C01302.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[mask2.getMaskMode().ordinal()];
                if (i2 == 1) {
                    return;
                }
                if ((i2 != 2 && i2 != 3) || !mask2.isInverted()) {
                    this.path.computeBounds(this.tempMaskBoundsRect, false);
                    if (i == 0) {
                        this.maskBoundsRect.set(this.tempMaskBoundsRect);
                    } else {
                        RectF rectF2 = this.maskBoundsRect;
                        rectF2.set(Math.min(rectF2.left, this.tempMaskBoundsRect.left), Math.min(this.maskBoundsRect.top, this.tempMaskBoundsRect.top), Math.max(this.maskBoundsRect.right, this.tempMaskBoundsRect.right), Math.max(this.maskBoundsRect.bottom, this.tempMaskBoundsRect.bottom));
                    }
                    i++;
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.maskBoundsRect)) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$2 */
    static /* synthetic */ class C01302 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode;
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        static {
            /*
                com.airbnb.lottie.model.content.Mask$MaskMode[] r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode = r0
                r1 = 1
                com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.Mask$MaskMode r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.model.layer.Layer$LayerType[] r3 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType = r3
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.model.layer.Layer$LayerType r3 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x006e }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.BaseLayer.C01302.<clinit>():void");
        }
    }

    private void intersectBoundsWithMatte(RectF rectF, Matrix matrix2) {
        if (hasMatteOnThisLayer() && this.layerModel.getMatteType() != Layer.MatteType.INVERT) {
            this.matteBoundsRect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.matteLayer.getBounds(this.matteBoundsRect, matrix2, true);
            if (!rectF.intersect(this.matteBoundsRect)) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    private void applyMasks(Canvas canvas, Matrix matrix2) {
        C0088L.beginSection("Layer#saveLayer");
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint, 19);
        if (Build.VERSION.SDK_INT < 28) {
            canvas.drawColor(0);
        }
        C0088L.endSection("Layer#saveLayer");
        for (int i = 0; i < this.mask.getMasks().size(); i++) {
            Mask mask2 = this.mask.getMasks().get(i);
            BaseKeyframeAnimation baseKeyframeAnimation = this.mask.getMaskAnimations().get(i);
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.mask.getOpacityAnimations().get(i);
            int i2 = C01302.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[mask2.getMaskMode().ordinal()];
            if (i2 == 1) {
                if (i == 0) {
                    this.contentPaint.setColor(-16777216);
                    this.contentPaint.setAlpha(255);
                    canvas.drawRect(this.rect, this.contentPaint);
                }
                if (mask2.isInverted()) {
                    applyInvertedSubtractMask(canvas, matrix2, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    applySubtractMask(canvas, matrix2, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (mask2.isInverted()) {
                        applyInvertedAddMask(canvas, matrix2, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        applyAddMask(canvas, matrix2, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                    }
                }
            } else if (mask2.isInverted()) {
                applyInvertedIntersectMask(canvas, matrix2, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
            } else {
                applyIntersectMask(canvas, matrix2, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
            }
        }
        C0088L.beginSection("Layer#restoreLayer");
        canvas.restore();
        C0088L.endSection("Layer#restoreLayer");
    }

    private void applyAddMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        this.contentPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
    }

    private void applyInvertedAddMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.contentPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        this.contentPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applySubtractMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        canvas.drawPath(this.path, this.dstOutPaint);
    }

    private void applyInvertedSubtractMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstOutPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyIntersectMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        this.contentPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
        canvas.restore();
    }

    private void applyInvertedIntersectMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    /* access modifiers changed from: package-private */
    public boolean hasMasksOnThisLayer() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.mask;
        return maskKeyframeAnimation != null && !maskKeyframeAnimation.getMaskAnimations().isEmpty();
    }

    /* access modifiers changed from: private */
    public void setVisible(boolean z) {
        if (z != this.visible) {
            this.visible = z;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void setProgress(float f) {
        this.transform.setProgress(f);
        if (this.mask != null) {
            for (int i = 0; i < this.mask.getMaskAnimations().size(); i++) {
                this.mask.getMaskAnimations().get(i).setProgress(f);
            }
        }
        if (this.layerModel.getTimeStretch() != BitmapDescriptorFactory.HUE_RED) {
            f /= this.layerModel.getTimeStretch();
        }
        BaseLayer baseLayer = this.matteLayer;
        if (baseLayer != null) {
            this.matteLayer.setProgress(baseLayer.layerModel.getTimeStretch() * f);
        }
        for (int i2 = 0; i2 < this.animations.size(); i2++) {
            this.animations.get(i2).setProgress(f);
        }
    }

    private void buildParentLayerListIfNeeded() {
        if (this.parentLayers == null) {
            if (this.parentLayer == null) {
                this.parentLayers = Collections.emptyList();
                return;
            }
            this.parentLayers = new ArrayList();
            for (BaseLayer baseLayer = this.parentLayer; baseLayer != null; baseLayer = baseLayer.parentLayer) {
                this.parentLayers.add(baseLayer);
            }
        }
    }

    public String getName() {
        return this.layerModel.getName();
    }

    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (keyPath.matches(getName(), i)) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                resolveChildKeyPath(keyPath, i + keyPath.incrementDepthBy(getName(), i), list, keyPath2);
            }
        }
    }

    public <T> void addValueCallback(T t, LottieValueCallback<T> lottieValueCallback) {
        this.transform.applyValueCallback(t, lottieValueCallback);
    }
}
