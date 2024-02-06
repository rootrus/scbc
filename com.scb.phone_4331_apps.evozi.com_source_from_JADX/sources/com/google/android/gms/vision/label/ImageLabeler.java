package com.google.android.gms.vision.label;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.internal.vision.zzp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.label.internal.client.ImageLabelerOptions;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
import com.google.android.gms.vision.label.internal.client.zzi;
import java.util.Locale;

public class ImageLabeler extends Detector<ImageLabel> {
    private static final LabelOptions zzdq = new LabelOptions(-1);
    private final zzi zzdp;

    private ImageLabeler(zzi zzi) {
        this.zzdp = zzi;
    }

    public SparseArray<ImageLabel> detect(Frame frame) {
        return detect(frame, zzdq);
    }

    public static class Builder {
        private ImageLabelerOptions zzdr = new ImageLabelerOptions(ImageLabelerOptions.zza(Locale.getDefault().getLanguage()), -1, 0.5f, 1);
        private Context zze;

        public Builder(Context context) {
            this.zze = context;
        }

        public Builder setScoreThreshold(float f) {
            if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
                throw new IllegalArgumentException("scoreThreshold should be between [0, 1]");
            }
            this.zzdr.zzeh = f;
            return this;
        }

        public ImageLabeler build() {
            return new ImageLabeler(new zzi(this.zze, this.zzdr));
        }
    }

    public SparseArray<ImageLabel> detect(Frame frame, LabelOptions labelOptions) {
        if (frame != null) {
            ImageLabel[] zza = this.zzdp.zza(zzp.zzb(frame.getBitmap(), zzn.zzc(frame)), labelOptions);
            SparseArray<ImageLabel> sparseArray = new SparseArray<>(zza.length);
            for (int i = 0; i < zza.length; i++) {
                sparseArray.append(i, zza[i]);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    public boolean isOperational() {
        return this.zzdp.isOperational();
    }

    public void release() {
        super.release();
        this.zzdp.zzp();
    }
}
