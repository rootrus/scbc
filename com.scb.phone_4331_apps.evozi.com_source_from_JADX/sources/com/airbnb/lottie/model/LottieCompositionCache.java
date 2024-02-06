package com.airbnb.lottie.model;

import com.airbnb.lottie.LottieComposition;
import p040o.setSupportAllCaps;

public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final setSupportAllCaps<String, LottieComposition> cache = new setSupportAllCaps<>(20);

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    LottieCompositionCache() {
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return this.cache.get(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str != null) {
            this.cache.put(str, lottieComposition);
        }
    }

    public void clear() {
        this.cache.evictAll();
    }

    public void resize(int i) {
        this.cache.resize(i);
    }
}
