package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p040o.setButtonDrawable;
import p040o.setTrackResource;

class KeyframeParser {
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final float MAX_CP_VALUE = 100.0f;
    static JsonReader.Options NAMES = JsonReader.Options.m33of("t", "s", "e", "o", "i", "h", "to", "ti");
    private static setButtonDrawable<WeakReference<Interpolator>> pathInterpolatorCache;

    KeyframeParser() {
    }

    private static setButtonDrawable<WeakReference<Interpolator>> pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new setButtonDrawable<>();
        }
        return pathInterpolatorCache;
    }

    private static WeakReference<Interpolator> getInterpolator(int i) {
        WeakReference<Interpolator> MediaBrowserCompat$CustomActionResultReceiver;
        synchronized (KeyframeParser.class) {
            MediaBrowserCompat$CustomActionResultReceiver = pathInterpolatorCache().MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    private static void putInterpolator(int i, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.read(i, weakReference);
        }
    }

    static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z) throws IOException {
        if (z) {
            return parseKeyframe(lottieComposition, jsonReader, f, valueParser);
        }
        return parseStaticValue(jsonReader, f, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolator;
        T t;
        JsonReader jsonReader2 = jsonReader;
        float f2 = f;
        ValueParser<T> valueParser2 = valueParser;
        jsonReader.beginObject();
        Interpolator interpolator2 = null;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (true) {
            boolean z = false;
            float f4 = f3;
            T t4 = t3;
            while (jsonReader.hasNext()) {
                switch (jsonReader2.selectName(NAMES)) {
                    case 0:
                        f4 = (float) jsonReader.nextDouble();
                        break;
                    case 1:
                        t4 = valueParser2.parse(jsonReader2, f2);
                        break;
                    case 2:
                        t2 = valueParser2.parse(jsonReader2, f2);
                        break;
                    case 3:
                        pointF4 = JsonUtils.jsonToPoint(jsonReader, f);
                        break;
                    case 4:
                        pointF3 = JsonUtils.jsonToPoint(jsonReader, f);
                        break;
                    case 5:
                        if (jsonReader.nextInt() == 1) {
                            z = true;
                            break;
                        } else {
                            t3 = t4;
                            f3 = f4;
                        }
                    case 6:
                        pointF2 = JsonUtils.jsonToPoint(jsonReader, f);
                        break;
                    case 7:
                        pointF = JsonUtils.jsonToPoint(jsonReader, f);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (z) {
                interpolator = LINEAR_INTERPOLATOR;
                t = t4;
            } else {
                if (pointF4 == null || pointF3 == null) {
                    interpolator = LINEAR_INTERPOLATOR;
                } else {
                    float f5 = -f2;
                    pointF4.x = MiscUtils.clamp(pointF4.x, f5, f2);
                    pointF4.y = MiscUtils.clamp(pointF4.y, -100.0f, (float) MAX_CP_VALUE);
                    pointF3.x = MiscUtils.clamp(pointF3.x, f5, f2);
                    pointF3.y = MiscUtils.clamp(pointF3.y, -100.0f, (float) MAX_CP_VALUE);
                    int hashFor = Utils.hashFor(pointF4.x, pointF4.y, pointF3.x, pointF3.y);
                    WeakReference<Interpolator> interpolator3 = getInterpolator(hashFor);
                    if (interpolator3 != null) {
                        interpolator2 = interpolator3.get();
                    }
                    if (interpolator3 == null || interpolator2 == null) {
                        interpolator2 = setTrackResource.read(pointF4.x / f2, pointF4.y / f2, pointF3.x / f2, pointF3.y / f2);
                        try {
                            putInterpolator(hashFor, new WeakReference(interpolator2));
                        } catch (ArrayIndexOutOfBoundsException unused) {
                        }
                    }
                    interpolator = interpolator2;
                }
                t = t2;
            }
            Keyframe keyframe = new Keyframe(lottieComposition, t4, t, interpolator, f4, (Float) null);
            keyframe.pathCp1 = pointF2;
            keyframe.pathCp2 = pointF;
            return keyframe;
        }
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        return new Keyframe<>(valueParser.parse(jsonReader, f));
    }
}
