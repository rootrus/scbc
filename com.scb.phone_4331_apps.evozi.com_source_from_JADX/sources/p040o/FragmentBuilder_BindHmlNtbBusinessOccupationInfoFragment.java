package p040o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment */
public final class FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment implements rsnScriptFieldIDCreate {
    public zzma write;

    /* renamed from: o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read */
    public static final class read {
        public int IconCompatParcelizer;
        public long MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public long read;
        public TimeInterpolator write;

        public read() {
        }

        public read(long j) {
            this.read = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = 300;
            this.write = null;
            this.IconCompatParcelizer = 0;
            this.MediaBrowserCompat$ItemReceiver = 1;
            this.read = j;
            this.MediaBrowserCompat$CustomActionResultReceiver = 150;
        }

        public read(long j, long j2, TimeInterpolator timeInterpolator) {
            this.read = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = 300;
            this.write = null;
            this.IconCompatParcelizer = 0;
            this.MediaBrowserCompat$ItemReceiver = 1;
            this.read = j;
            this.MediaBrowserCompat$CustomActionResultReceiver = j2;
            this.write = timeInterpolator;
        }

        public final void write(Animator animator) {
            animator.setStartDelay(this.read);
            animator.setDuration(this.MediaBrowserCompat$CustomActionResultReceiver);
            TimeInterpolator timeInterpolator = this.write;
            if (timeInterpolator == null) {
                timeInterpolator = zzlz.read;
            }
            animator.setInterpolator(timeInterpolator);
            if (animator instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setRepeatCount(this.IconCompatParcelizer);
                valueAnimator.setRepeatMode(this.MediaBrowserCompat$ItemReceiver);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            read read2 = (read) obj;
            if (this.read != read2.read || this.MediaBrowserCompat$CustomActionResultReceiver != read2.MediaBrowserCompat$CustomActionResultReceiver || this.IconCompatParcelizer != read2.IconCompatParcelizer || this.MediaBrowserCompat$ItemReceiver != read2.MediaBrowserCompat$ItemReceiver) {
                return false;
            }
            TimeInterpolator timeInterpolator = this.write;
            if (timeInterpolator == null) {
                timeInterpolator = zzlz.read;
            }
            Class<?> cls = timeInterpolator.getClass();
            TimeInterpolator timeInterpolator2 = read2.write;
            if (timeInterpolator2 == null) {
                timeInterpolator2 = zzlz.read;
            }
            return cls.equals(timeInterpolator2.getClass());
        }

        public final int hashCode() {
            long j = this.read;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = (int) ((j2 >>> 32) ^ j2);
            TimeInterpolator timeInterpolator = this.write;
            if (timeInterpolator == null) {
                timeInterpolator = zzlz.read;
            }
            return (((((((i * 31) + i2) * 31) + timeInterpolator.getClass().hashCode()) * 31) + this.IconCompatParcelizer) * 31) + this.MediaBrowserCompat$ItemReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(10);
            sb.append(getClass().getName());
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" delay: ");
            sb.append(this.read);
            sb.append(" duration: ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" interpolator: ");
            TimeInterpolator timeInterpolator = this.write;
            if (timeInterpolator == null) {
                timeInterpolator = zzlz.read;
            }
            sb.append(timeInterpolator.getClass());
            sb.append(" repeatCount: ");
            sb.append(this.IconCompatParcelizer);
            sb.append(" repeatMode: ");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append("}\n");
            return sb.toString();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(rsnScriptForEach rsnscriptforeach) {
        zzma zzma = this.write;
        if (zzma != null) {
            zzma.IconCompatParcelizer.add(rsnscriptforeach);
        }
    }
}
