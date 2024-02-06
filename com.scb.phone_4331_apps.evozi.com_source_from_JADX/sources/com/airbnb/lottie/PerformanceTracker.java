package com.airbnb.lottie;

import android.util.Log;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.setAutoSizeTextTypeUniformWithConfiguration;
import p040o.setImeOptions;

public class PerformanceTracker {
    private boolean enabled = false;
    private final Comparator<setImeOptions<String, Float>> floatComparator = new Comparator<setImeOptions<String, Float>>() {
        public int compare(setImeOptions<String, Float> setimeoptions, setImeOptions<String, Float> setimeoptions2) {
            float floatValue = ((Float) setimeoptions.read).floatValue();
            float floatValue2 = ((Float) setimeoptions2.read).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };
    private final Set<FrameListener> frameListeners = new setAutoSizeTextTypeUniformWithConfiguration();
    private final Map<String, MeanCalculator> layerRenderTimes = new HashMap();

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    /* access modifiers changed from: package-private */
    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void recordRenderTime(String str, float f) {
        if (this.enabled) {
            MeanCalculator meanCalculator = this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f);
            if (str.equals("__container")) {
                for (FrameListener onFrameRendered : this.frameListeners) {
                    onFrameRendered.onFrameRendered(f);
                }
            }
        }
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List<setImeOptions<String, Float>> sortedRenderTimes = getSortedRenderTimes();
            Log.d(C0088L.TAG, "Render times:");
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                setImeOptions setimeoptions = sortedRenderTimes.get(i);
                Log.d(C0088L.TAG, String.format("\t\t%30s:%.2f", new Object[]{setimeoptions.MediaBrowserCompat$ItemReceiver, setimeoptions.read}));
            }
        }
    }

    public List<setImeOptions<String, Float>> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry next : this.layerRenderTimes.entrySet()) {
            arrayList.add(new setImeOptions(next.getKey(), Float.valueOf(((MeanCalculator) next.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }
}
