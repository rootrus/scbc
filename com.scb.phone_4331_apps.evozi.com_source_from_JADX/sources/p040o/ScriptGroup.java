package p040o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.FormatException;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.ScriptGroup */
public final class ScriptGroup {
    private static final int[][] write = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final execute MediaBrowserCompat$CustomActionResultReceiver;
    public final byte MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.ScriptGroup$ConnectLine */
    public abstract class ConnectLine {
        public abstract RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver();

        public abstract void read(RecyclerView.setContentView setcontentview);
    }

    /* renamed from: o.ScriptGroup$IO */
    public interface C1272IO<T extends RecyclerView.setContentView> {
        void IconCompatParcelizer(int i);

        boolean IconCompatParcelizer(T t, int i);

        void read(int i);

        boolean read(int i, int i2);

        ScriptIntrinsic write(int i);

        void write(int i, int i2);
    }

    /* renamed from: o.ScriptGroup$Input */
    public interface Input {
        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        int write();
    }

    /* renamed from: o.ScriptGroup$Node */
    public final class Node extends getFieldID {
        public Node(RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* access modifiers changed from: protected */
        public final int write(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 2;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: o.ScriptGroup$Builder2 */
    public final class Builder2 extends addInput {
        /* access modifiers changed from: protected */
        public final void MediaMetadataCompat() {
            super.MediaMetadataCompat();
            this.MediaSessionCompat$ResultReceiverWrapper = false;
        }

        public final boolean write(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4) {
            if (setcontentview != setcontentview2 || i != i3 || i2 != i4) {
                return super.write(setcontentview, setcontentview2, i, i2, i3, i4);
            }
            RecyclerView.MediaMetadataCompat.read read = this.MediaDescriptionCompat;
            if (read == null) {
                return false;
            }
            read.write(setcontentview);
            return false;
        }
    }

    /* renamed from: o.ScriptGroup$Closure */
    public abstract class Closure<T extends ConnectLine> {
        private static TimeInterpolator IconCompatParcelizer;
        protected final seperateArgsAndBindings MediaBrowserCompat$CustomActionResultReceiver;
        protected final List<RecyclerView.setContentView> MediaBrowserCompat$ItemReceiver = new ArrayList();
        protected final List<List<T>> read = new ArrayList();
        public List<T> write = new ArrayList();

        /* access modifiers changed from: protected */
        public abstract void MediaBrowserCompat$CustomActionResultReceiver(T t);

        public abstract void MediaBrowserCompat$CustomActionResultReceiver(T t, RecyclerView.setContentView setcontentview);

        /* access modifiers changed from: protected */
        public abstract void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview);

        /* access modifiers changed from: protected */
        public abstract boolean MediaBrowserCompat$ItemReceiver(T t, RecyclerView.setContentView setcontentview);

        /* access modifiers changed from: protected */
        public abstract void read(RecyclerView.setContentView setcontentview);

        public abstract void read(T t, RecyclerView.setContentView setcontentview);

        /* access modifiers changed from: protected */
        public abstract void write(T t, RecyclerView.setContentView setcontentview);

        /* renamed from: o.ScriptGroup$Closure$ValueAndSize */
        public final class ValueAndSize extends ConnectLine {
            public final int IconCompatParcelizer;
            public final int MediaBrowserCompat$CustomActionResultReceiver;
            public final int MediaBrowserCompat$ItemReceiver;
            public RecyclerView.setContentView read;
            public final int write;

            public ValueAndSize(RecyclerView.setContentView setcontentview, int i, int i2, int i3, int i4) {
                this.read = setcontentview;
                this.IconCompatParcelizer = i;
                this.write = i2;
                this.MediaBrowserCompat$CustomActionResultReceiver = i3;
                this.MediaBrowserCompat$ItemReceiver = i4;
            }

            public final RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver() {
                return this.read;
            }

            public final void read(RecyclerView.setContentView setcontentview) {
                if (this.read == setcontentview) {
                    this.read = null;
                }
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("MoveAnimationInfo{holder=");
                sb.append(this.read);
                sb.append(", fromX=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", fromY=");
                sb.append(this.write);
                sb.append(", toX=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", toY=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append('}');
                return sb.toString();
            }
        }

        public Closure(seperateArgsAndBindings seperateargsandbindings) {
            this.MediaBrowserCompat$CustomActionResultReceiver = seperateargsandbindings;
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return !this.write.isEmpty() || !this.MediaBrowserCompat$ItemReceiver.isEmpty() || !this.read.isEmpty();
        }

        public final boolean MediaMetadataCompat(RecyclerView.setContentView setcontentview) {
            return this.MediaBrowserCompat$ItemReceiver.remove(setcontentview);
        }

        public final void read() {
            List<RecyclerView.setContentView> list = this.MediaBrowserCompat$ItemReceiver;
            for (int size = list.size() - 1; size >= 0; size--) {
                SwitchCompat.write(list.get(size).write).read();
            }
        }

        public final void IconCompatParcelizer(boolean z, long j) {
            final ArrayList<ConnectLine> arrayList = new ArrayList<>(this.write);
            this.write.clear();
            if (z) {
                this.read.add(arrayList);
                SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(((ConnectLine) arrayList.get(0)).MediaBrowserCompat$CustomActionResultReceiver().write, (Runnable) new Runnable() {
                    public final void run() {
                        for (ConnectLine IconCompatParcelizer2 : arrayList) {
                            Closure.this.IconCompatParcelizer(IconCompatParcelizer2);
                        }
                        arrayList.clear();
                        Closure.this.read.remove(arrayList);
                    }
                }, j);
                return;
            }
            for (ConnectLine MediaBrowserCompat$CustomActionResultReceiver2 : arrayList) {
                MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
            }
            arrayList.clear();
        }

        public final void MediaBrowserCompat$MediaItem(RecyclerView.setContentView setcontentview) {
            List<T> list = this.write;
            for (int size = list.size() - 1; size >= 0; size--) {
                if (MediaBrowserCompat$ItemReceiver((ConnectLine) list.get(size), setcontentview) && setcontentview != null) {
                    list.remove(size);
                }
            }
            if (setcontentview == null) {
                list.clear();
            }
        }

        public final void IconCompatParcelizer() {
            MediaBrowserCompat$MediaItem((RecyclerView.setContentView) null);
        }

        public final void write(RecyclerView.setContentView setcontentview) {
            for (int size = this.read.size() - 1; size >= 0; size--) {
                List list = this.read.get(size);
                for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                    if (MediaBrowserCompat$ItemReceiver((ConnectLine) list.get(size2), setcontentview) && setcontentview != null) {
                        list.remove(size2);
                    }
                }
                if (setcontentview == null) {
                    list.clear();
                }
                if (list.isEmpty()) {
                    this.read.remove(list);
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            write((RecyclerView.setContentView) null);
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(T t) {
            MediaBrowserCompat$CustomActionResultReceiver(t);
        }

        /* access modifiers changed from: protected */
        public final void RatingCompat(RecyclerView.setContentView setcontentview) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new ValueAnimator().getInterpolator();
            }
            setcontentview.write.animate().setInterpolator(IconCompatParcelizer);
            this.MediaBrowserCompat$CustomActionResultReceiver.read(setcontentview);
        }

        /* access modifiers changed from: protected */
        public final void write() {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem();
        }

        /* access modifiers changed from: protected */
        public final void MediaBrowserCompat$ItemReceiver(T t) {
            this.write.add(t);
        }

        /* access modifiers changed from: protected */
        public final void write(T t, RecyclerView.setContentView setcontentview, setSwitchPadding setswitchpadding) {
            setswitchpadding.read((setSwitchTypeface) new write(this, t, setcontentview, setswitchpadding));
            if (setcontentview != null) {
                this.MediaBrowserCompat$ItemReceiver.add(setcontentview);
                setswitchpadding.write();
                return;
            }
            throw new IllegalStateException("item is null");
        }

        /* renamed from: o.ScriptGroup$Closure$write */
        public static class write implements setSwitchTypeface {
            private RecyclerView.setContentView IconCompatParcelizer;
            private Closure MediaBrowserCompat$CustomActionResultReceiver;
            private ConnectLine MediaBrowserCompat$ItemReceiver;
            private setSwitchPadding write;

            public write(Closure closure, ConnectLine connectLine, RecyclerView.setContentView setcontentview, setSwitchPadding setswitchpadding) {
                this.MediaBrowserCompat$CustomActionResultReceiver = closure;
                this.MediaBrowserCompat$ItemReceiver = connectLine;
                this.IconCompatParcelizer = setcontentview;
                this.write = setswitchpadding;
            }

            public final void write(View view) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
            }

            public final void MediaBrowserCompat$ItemReceiver(View view) {
                Closure closure = this.MediaBrowserCompat$CustomActionResultReceiver;
                ConnectLine connectLine = this.MediaBrowserCompat$ItemReceiver;
                RecyclerView.setContentView setcontentview = this.IconCompatParcelizer;
                this.write.read((setSwitchTypeface) null);
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                this.MediaBrowserCompat$ItemReceiver = null;
                this.IconCompatParcelizer = null;
                this.write = null;
                closure.read(setcontentview);
                closure.read(connectLine, setcontentview);
                connectLine.read(setcontentview);
                closure.MediaBrowserCompat$ItemReceiver.remove(setcontentview);
                closure.write();
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
            }
        }
    }

    /* renamed from: o.ScriptGroup$Builder */
    public final class Builder extends rsnScriptForEach {
        public final float write;

        public Builder(float f, float f2, float f3) {
            super(f, f2);
            this.write = f3;
        }
    }

    /* renamed from: o.ScriptGroup$Future */
    abstract class Future extends RecyclerView.RatingCompat {
        int IconCompatParcelizer = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
        Interpolator MediaBrowserCompat$CustomActionResultReceiver;
        protected final RecyclerView MediaBrowserCompat$ItemReceiver;
        protected RecyclerView.setContentView write;

        public Future(RecyclerView recyclerView, RecyclerView.setContentView setcontentview) {
            this.MediaBrowserCompat$ItemReceiver = recyclerView;
            this.write = setcontentview;
            float f = recyclerView.getResources().getDisplayMetrics().density;
        }

        /* access modifiers changed from: protected */
        public final void read(View view, float f, float f2, float f3, float f4, boolean z) {
            final float AlertController$RecycleListView = SwitchCompat.AlertController$RecycleListView(view);
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            int width = view.getWidth() / 2;
            int height = view.getHeight() / 2;
            float abs = width > 0 ? Math.abs(translationX / ((float) width)) : 0.0f;
            float abs2 = height > 0 ? Math.abs(translationY / ((float) height)) : 0.0f;
            int min = (int) (((float) this.IconCompatParcelizer) * Math.min(Math.max(Math.max(Math.max(Math.max(Math.max(BitmapDescriptorFactory.HUE_RED, abs), abs2), Math.abs(Math.max(f, f2) - 1.0f)), Math.abs(0.033333335f * f3)), Math.abs(f4 - 1.0f)), 1.0f));
            if (min > 20) {
                setSwitchPadding write2 = SwitchCompat.write(view);
                view.setScaleX(f);
                view.setScaleY(f2);
                view.setRotation(f3);
                view.setAlpha(f4);
                SwitchCompat.MediaDescriptionCompat(view, AlertController$RecycleListView + 1.0f);
                write2.read();
                write2.MediaBrowserCompat$ItemReceiver((long) min);
                write2.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
                write2.read((float) BitmapDescriptorFactory.HUE_RED);
                write2.MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED);
                write2.RatingCompat(AlertController$RecycleListView);
                write2.IconCompatParcelizer(1.0f);
                write2.write(BitmapDescriptorFactory.HUE_RED);
                write2.MediaBrowserCompat$ItemReceiver(1.0f);
                write2.MediaBrowserCompat$CustomActionResultReceiver(1.0f);
                write2.read((setSwitchTypeface) new setSwitchTypeface() {
                    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
                    }

                    public final void write(View view) {
                    }

                    public final void MediaBrowserCompat$ItemReceiver(View view) {
                        SwitchCompat.write(view).read((setSwitchTypeface) null);
                        Future.write(view, AlertController$RecycleListView);
                        if (view.getParent() instanceof RecyclerView) {
                            SwitchCompat.setItemInvoker((RecyclerView) view.getParent());
                        }
                    }
                });
                write2.write();
                return;
            }
            write(view, AlertController$RecycleListView);
        }

        protected static void write(View view, float f) {
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            SwitchCompat.MediaDescriptionCompat(view, f);
            view.setAlpha(1.0f);
            view.setRotation(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    /* renamed from: o.ScriptGroup$Binding */
    public final class Binding {
        private static final Binding[] MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        private static final int[] MediaMetadataCompat = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
        public final write[] IconCompatParcelizer;
        public final int[] MediaBrowserCompat$ItemReceiver;
        public final int read;
        public final int write;

        private Binding(int i, int[] iArr, write... writeArr) {
            this.read = i;
            this.MediaBrowserCompat$ItemReceiver = iArr;
            this.IconCompatParcelizer = writeArr;
            int i2 = writeArr[0].MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = 0;
            for (C1273x3da1f9e2 scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver : writeArr[0].MediaBrowserCompat$ItemReceiver) {
                i3 += scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver.write * (scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver + i2);
            }
            this.write = i3;
        }

        public static Binding write(int i) throws FormatException {
            if (i % 4 == 1) {
                try {
                    int i2 = (i - 17) / 4;
                    if (i2 > 0 && i2 <= 40) {
                        return MediaBrowserCompat$CustomActionResultReceiver[i2 - 1];
                    }
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException unused) {
                    throw FormatException.read();
                }
            } else {
                throw FormatException.read();
            }
        }

        public static Binding MediaBrowserCompat$ItemReceiver(int i) {
            if (i > 0 && i <= 40) {
                return MediaBrowserCompat$CustomActionResultReceiver[i - 1];
            }
            throw new IllegalArgumentException();
        }

        public static Binding MediaBrowserCompat$CustomActionResultReceiver(int i) {
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            while (true) {
                int[] iArr = MediaMetadataCompat;
                if (i2 < iArr.length) {
                    int i5 = iArr[i2];
                    if (i5 == i) {
                        int i6 = i2 + 7;
                        if (i6 > 0 && i6 <= 40) {
                            return MediaBrowserCompat$CustomActionResultReceiver[i6 - 1];
                        }
                        throw new IllegalArgumentException();
                    }
                    int MediaBrowserCompat$ItemReceiver2 = ScriptGroup.MediaBrowserCompat$ItemReceiver(i, i5);
                    if (MediaBrowserCompat$ItemReceiver2 < i3) {
                        i4 = i2 + 7;
                        i3 = MediaBrowserCompat$ItemReceiver2;
                    }
                    i2++;
                } else if (i3 > 3) {
                    return null;
                } else {
                    if (i4 > 0 && i4 <= 40) {
                        return MediaBrowserCompat$CustomActionResultReceiver[i4 - 1];
                    }
                    throw new IllegalArgumentException();
                }
            }
        }

        /* renamed from: o.ScriptGroup$Binding$write */
        public static final class write {
            public final int MediaBrowserCompat$CustomActionResultReceiver;
            public final C1273x3da1f9e2[] MediaBrowserCompat$ItemReceiver;

            write(int i, C1273x3da1f9e2... scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiverArr) {
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
                this.MediaBrowserCompat$ItemReceiver = scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiverArr;
            }

            public final int write() {
                int i = 0;
                for (C1273x3da1f9e2 scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver : this.MediaBrowserCompat$ItemReceiver) {
                    i += scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver.write;
                }
                return i;
            }

            public final int MediaBrowserCompat$ItemReceiver() {
                return this.MediaBrowserCompat$CustomActionResultReceiver * write();
            }
        }

        public final String toString() {
            return String.valueOf(this.read);
        }

        private static Binding[] MediaBrowserCompat$CustomActionResultReceiver() {
            return new Binding[]{new Binding(1, new int[0], new write(7, new C1273x3da1f9e2(1, 19)), new write(10, new C1273x3da1f9e2(1, 16)), new write(13, new C1273x3da1f9e2(1, 13)), new write(17, new C1273x3da1f9e2(1, 9))), new Binding(2, new int[]{6, 18}, new write(10, new C1273x3da1f9e2(1, 34)), new write(16, new C1273x3da1f9e2(1, 28)), new write(22, new C1273x3da1f9e2(1, 22)), new write(28, new C1273x3da1f9e2(1, 16))), new Binding(3, new int[]{6, 22}, new write(15, new C1273x3da1f9e2(1, 55)), new write(26, new C1273x3da1f9e2(1, 44)), new write(18, new C1273x3da1f9e2(2, 17)), new write(22, new C1273x3da1f9e2(2, 13))), new Binding(4, new int[]{6, 26}, new write(20, new C1273x3da1f9e2(1, 80)), new write(18, new C1273x3da1f9e2(2, 32)), new write(26, new C1273x3da1f9e2(2, 24)), new write(16, new C1273x3da1f9e2(4, 9))), new Binding(5, new int[]{6, 30}, new write(26, new C1273x3da1f9e2(1, 108)), new write(24, new C1273x3da1f9e2(2, 43)), new write(18, new C1273x3da1f9e2(2, 15), new C1273x3da1f9e2(2, 16)), new write(22, new C1273x3da1f9e2(2, 11), new C1273x3da1f9e2(2, 12))), new Binding(6, new int[]{6, 34}, new write(18, new C1273x3da1f9e2(2, 68)), new write(16, new C1273x3da1f9e2(4, 27)), new write(24, new C1273x3da1f9e2(4, 19)), new write(28, new C1273x3da1f9e2(4, 15))), new Binding(7, new int[]{6, 22, 38}, new write(20, new C1273x3da1f9e2(2, 78)), new write(18, new C1273x3da1f9e2(4, 31)), new write(18, new C1273x3da1f9e2(2, 14), new C1273x3da1f9e2(4, 15)), new write(26, new C1273x3da1f9e2(4, 13), new C1273x3da1f9e2(1, 14))), new Binding(8, new int[]{6, 24, 42}, new write(24, new C1273x3da1f9e2(2, 97)), new write(22, new C1273x3da1f9e2(2, 38), new C1273x3da1f9e2(2, 39)), new write(22, new C1273x3da1f9e2(4, 18), new C1273x3da1f9e2(2, 19)), new write(26, new C1273x3da1f9e2(4, 14), new C1273x3da1f9e2(2, 15))), new Binding(9, new int[]{6, 26, 46}, new write(30, new C1273x3da1f9e2(2, 116)), new write(22, new C1273x3da1f9e2(3, 36), new C1273x3da1f9e2(2, 37)), new write(20, new C1273x3da1f9e2(4, 16), new C1273x3da1f9e2(4, 17)), new write(24, new C1273x3da1f9e2(4, 12), new C1273x3da1f9e2(4, 13))), new Binding(10, new int[]{6, 28, 50}, new write(18, new C1273x3da1f9e2(2, 68), new C1273x3da1f9e2(2, 69)), new write(26, new C1273x3da1f9e2(4, 43), new C1273x3da1f9e2(1, 44)), new write(24, new C1273x3da1f9e2(6, 19), new C1273x3da1f9e2(2, 20)), new write(28, new C1273x3da1f9e2(6, 15), new C1273x3da1f9e2(2, 16))), new Binding(11, new int[]{6, 30, 54}, new write(20, new C1273x3da1f9e2(4, 81)), new write(30, new C1273x3da1f9e2(1, 50), new C1273x3da1f9e2(4, 51)), new write(28, new C1273x3da1f9e2(4, 22), new C1273x3da1f9e2(4, 23)), new write(24, new C1273x3da1f9e2(3, 12), new C1273x3da1f9e2(8, 13))), new Binding(12, new int[]{6, 32, 58}, new write(24, new C1273x3da1f9e2(2, 92), new C1273x3da1f9e2(2, 93)), new write(22, new C1273x3da1f9e2(6, 36), new C1273x3da1f9e2(2, 37)), new write(26, new C1273x3da1f9e2(4, 20), new C1273x3da1f9e2(6, 21)), new write(28, new C1273x3da1f9e2(7, 14), new C1273x3da1f9e2(4, 15))), new Binding(13, new int[]{6, 34, 62}, new write(26, new C1273x3da1f9e2(4, 107)), new write(22, new C1273x3da1f9e2(8, 37), new C1273x3da1f9e2(1, 38)), new write(24, new C1273x3da1f9e2(8, 20), new C1273x3da1f9e2(4, 21)), new write(22, new C1273x3da1f9e2(12, 11), new C1273x3da1f9e2(4, 12))), new Binding(14, new int[]{6, 26, 46, 66}, new write(30, new C1273x3da1f9e2(3, 115), new C1273x3da1f9e2(1, 116)), new write(24, new C1273x3da1f9e2(4, 40), new C1273x3da1f9e2(5, 41)), new write(20, new C1273x3da1f9e2(11, 16), new C1273x3da1f9e2(5, 17)), new write(24, new C1273x3da1f9e2(11, 12), new C1273x3da1f9e2(5, 13))), new Binding(15, new int[]{6, 26, 48, 70}, new write(22, new C1273x3da1f9e2(5, 87), new C1273x3da1f9e2(1, 88)), new write(24, new C1273x3da1f9e2(5, 41), new C1273x3da1f9e2(5, 42)), new write(30, new C1273x3da1f9e2(5, 24), new C1273x3da1f9e2(7, 25)), new write(24, new C1273x3da1f9e2(11, 12), new C1273x3da1f9e2(7, 13))), new Binding(16, new int[]{6, 26, 50, 74}, new write(24, new C1273x3da1f9e2(5, 98), new C1273x3da1f9e2(1, 99)), new write(28, new C1273x3da1f9e2(7, 45), new C1273x3da1f9e2(3, 46)), new write(24, new C1273x3da1f9e2(15, 19), new C1273x3da1f9e2(2, 20)), new write(30, new C1273x3da1f9e2(3, 15), new C1273x3da1f9e2(13, 16))), new Binding(17, new int[]{6, 30, 54, 78}, new write(28, new C1273x3da1f9e2(1, 107), new C1273x3da1f9e2(5, 108)), new write(28, new C1273x3da1f9e2(10, 46), new C1273x3da1f9e2(1, 47)), new write(28, new C1273x3da1f9e2(1, 22), new C1273x3da1f9e2(15, 23)), new write(28, new C1273x3da1f9e2(2, 14), new C1273x3da1f9e2(17, 15))), new Binding(18, new int[]{6, 30, 56, 82}, new write(30, new C1273x3da1f9e2(5, 120), new C1273x3da1f9e2(1, 121)), new write(26, new C1273x3da1f9e2(9, 43), new C1273x3da1f9e2(4, 44)), new write(28, new C1273x3da1f9e2(17, 22), new C1273x3da1f9e2(1, 23)), new write(28, new C1273x3da1f9e2(2, 14), new C1273x3da1f9e2(19, 15))), new Binding(19, new int[]{6, 30, 58, 86}, new write(28, new C1273x3da1f9e2(3, 113), new C1273x3da1f9e2(4, 114)), new write(26, new C1273x3da1f9e2(3, 44), new C1273x3da1f9e2(11, 45)), new write(26, new C1273x3da1f9e2(17, 21), new C1273x3da1f9e2(4, 22)), new write(26, new C1273x3da1f9e2(9, 13), new C1273x3da1f9e2(16, 14))), new Binding(20, new int[]{6, 34, 62, 90}, new write(28, new C1273x3da1f9e2(3, 107), new C1273x3da1f9e2(5, 108)), new write(26, new C1273x3da1f9e2(3, 41), new C1273x3da1f9e2(13, 42)), new write(30, new C1273x3da1f9e2(15, 24), new C1273x3da1f9e2(5, 25)), new write(28, new C1273x3da1f9e2(15, 15), new C1273x3da1f9e2(10, 16))), new Binding(21, new int[]{6, 28, 50, 72, 94}, new write(28, new C1273x3da1f9e2(4, 116), new C1273x3da1f9e2(4, 117)), new write(26, new C1273x3da1f9e2(17, 42)), new write(28, new C1273x3da1f9e2(17, 22), new C1273x3da1f9e2(6, 23)), new write(30, new C1273x3da1f9e2(19, 16), new C1273x3da1f9e2(6, 17))), new Binding(22, new int[]{6, 26, 50, 74, 98}, new write(28, new C1273x3da1f9e2(2, 111), new C1273x3da1f9e2(7, 112)), new write(28, new C1273x3da1f9e2(17, 46)), new write(30, new C1273x3da1f9e2(7, 24), new C1273x3da1f9e2(16, 25)), new write(24, new C1273x3da1f9e2(34, 13))), new Binding(23, new int[]{6, 30, 54, 78, 102}, new write(30, new C1273x3da1f9e2(4, 121), new C1273x3da1f9e2(5, 122)), new write(28, new C1273x3da1f9e2(4, 47), new C1273x3da1f9e2(14, 48)), new write(30, new C1273x3da1f9e2(11, 24), new C1273x3da1f9e2(14, 25)), new write(30, new C1273x3da1f9e2(16, 15), new C1273x3da1f9e2(14, 16))), new Binding(24, new int[]{6, 28, 54, 80, 106}, new write(30, new C1273x3da1f9e2(6, 117), new C1273x3da1f9e2(4, 118)), new write(28, new C1273x3da1f9e2(6, 45), new C1273x3da1f9e2(14, 46)), new write(30, new C1273x3da1f9e2(11, 24), new C1273x3da1f9e2(16, 25)), new write(30, new C1273x3da1f9e2(30, 16), new C1273x3da1f9e2(2, 17))), new Binding(25, new int[]{6, 32, 58, 84, 110}, new write(26, new C1273x3da1f9e2(8, 106), new C1273x3da1f9e2(4, 107)), new write(28, new C1273x3da1f9e2(8, 47), new C1273x3da1f9e2(13, 48)), new write(30, new C1273x3da1f9e2(7, 24), new C1273x3da1f9e2(22, 25)), new write(30, new C1273x3da1f9e2(22, 15), new C1273x3da1f9e2(13, 16))), new Binding(26, new int[]{6, 30, 58, 86, 114}, new write(28, new C1273x3da1f9e2(10, 114), new C1273x3da1f9e2(2, 115)), new write(28, new C1273x3da1f9e2(19, 46), new C1273x3da1f9e2(4, 47)), new write(28, new C1273x3da1f9e2(28, 22), new C1273x3da1f9e2(6, 23)), new write(30, new C1273x3da1f9e2(33, 16), new C1273x3da1f9e2(4, 17))), new Binding(27, new int[]{6, 34, 62, 90, 118}, new write(30, new C1273x3da1f9e2(8, 122), new C1273x3da1f9e2(4, EACTags.SECURITY_ENVIRONMENT_TEMPLATE)), new write(28, new C1273x3da1f9e2(22, 45), new C1273x3da1f9e2(3, 46)), new write(30, new C1273x3da1f9e2(8, 23), new C1273x3da1f9e2(26, 24)), new write(30, new C1273x3da1f9e2(12, 15), new C1273x3da1f9e2(28, 16))), new Binding(28, new int[]{6, 26, 50, 74, 98, 122}, new write(30, new C1273x3da1f9e2(3, 117), new C1273x3da1f9e2(10, 118)), new write(28, new C1273x3da1f9e2(3, 45), new C1273x3da1f9e2(23, 46)), new write(30, new C1273x3da1f9e2(4, 24), new C1273x3da1f9e2(31, 25)), new write(30, new C1273x3da1f9e2(11, 15), new C1273x3da1f9e2(31, 16))), new Binding(29, new int[]{6, 30, 54, 78, 102, 126}, new write(30, new C1273x3da1f9e2(7, 116), new C1273x3da1f9e2(7, 117)), new write(28, new C1273x3da1f9e2(21, 45), new C1273x3da1f9e2(7, 46)), new write(30, new C1273x3da1f9e2(1, 23), new C1273x3da1f9e2(37, 24)), new write(30, new C1273x3da1f9e2(19, 15), new C1273x3da1f9e2(26, 16))), new Binding(30, new int[]{6, 26, 52, 78, 104, ISO781611.BIOMETRIC_SUBTYPE_TAG}, new write(30, new C1273x3da1f9e2(5, 115), new C1273x3da1f9e2(10, 116)), new write(28, new C1273x3da1f9e2(19, 47), new C1273x3da1f9e2(10, 48)), new write(30, new C1273x3da1f9e2(15, 24), new C1273x3da1f9e2(25, 25)), new write(30, new C1273x3da1f9e2(23, 15), new C1273x3da1f9e2(25, 16))), new Binding(31, new int[]{6, 30, 56, 82, 108, 134}, new write(30, new C1273x3da1f9e2(13, 115), new C1273x3da1f9e2(3, 116)), new write(28, new C1273x3da1f9e2(2, 46), new C1273x3da1f9e2(29, 47)), new write(30, new C1273x3da1f9e2(42, 24), new C1273x3da1f9e2(1, 25)), new write(30, new C1273x3da1f9e2(23, 15), new C1273x3da1f9e2(28, 16))), new Binding(32, new int[]{6, 34, 60, 86, 112, CipherSuite.TLS_PSK_WITH_RC4_128_SHA}, new write(30, new C1273x3da1f9e2(17, 115)), new write(28, new C1273x3da1f9e2(10, 46), new C1273x3da1f9e2(23, 47)), new write(30, new C1273x3da1f9e2(10, 24), new C1273x3da1f9e2(35, 25)), new write(30, new C1273x3da1f9e2(19, 15), new C1273x3da1f9e2(35, 16))), new Binding(33, new int[]{6, 30, 58, 86, 114, 142}, new write(30, new C1273x3da1f9e2(17, 115), new C1273x3da1f9e2(1, 116)), new write(28, new C1273x3da1f9e2(14, 46), new C1273x3da1f9e2(21, 47)), new write(30, new C1273x3da1f9e2(29, 24), new C1273x3da1f9e2(19, 25)), new write(30, new C1273x3da1f9e2(11, 15), new C1273x3da1f9e2(46, 16))), new Binding(34, new int[]{6, 34, 62, 90, 118, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new write(30, new C1273x3da1f9e2(13, 115), new C1273x3da1f9e2(6, 116)), new write(28, new C1273x3da1f9e2(14, 46), new C1273x3da1f9e2(23, 47)), new write(30, new C1273x3da1f9e2(44, 24), new C1273x3da1f9e2(7, 25)), new write(30, new C1273x3da1f9e2(59, 16), new C1273x3da1f9e2(1, 17))), new Binding(35, new int[]{6, 30, 54, 78, 102, 126, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA}, new write(30, new C1273x3da1f9e2(12, 121), new C1273x3da1f9e2(7, 122)), new write(28, new C1273x3da1f9e2(12, 47), new C1273x3da1f9e2(26, 48)), new write(30, new C1273x3da1f9e2(39, 24), new C1273x3da1f9e2(14, 25)), new write(30, new C1273x3da1f9e2(22, 15), new C1273x3da1f9e2(41, 16))), new Binding(36, new int[]{6, 24, 50, 76, 102, 128, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA}, new write(30, new C1273x3da1f9e2(6, 121), new C1273x3da1f9e2(14, 122)), new write(28, new C1273x3da1f9e2(6, 47), new C1273x3da1f9e2(34, 48)), new write(30, new C1273x3da1f9e2(46, 24), new C1273x3da1f9e2(10, 25)), new write(30, new C1273x3da1f9e2(2, 15), new C1273x3da1f9e2(64, 16))), new Binding(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new write(30, new C1273x3da1f9e2(17, 122), new C1273x3da1f9e2(4, EACTags.SECURITY_ENVIRONMENT_TEMPLATE)), new write(28, new C1273x3da1f9e2(29, 46), new C1273x3da1f9e2(14, 47)), new write(30, new C1273x3da1f9e2(49, 24), new C1273x3da1f9e2(10, 25)), new write(30, new C1273x3da1f9e2(24, 15), new C1273x3da1f9e2(46, 16))), new Binding(38, new int[]{6, 32, 58, 84, 110, 136, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256}, new write(30, new C1273x3da1f9e2(4, 122), new C1273x3da1f9e2(18, EACTags.SECURITY_ENVIRONMENT_TEMPLATE)), new write(28, new C1273x3da1f9e2(13, 46), new C1273x3da1f9e2(32, 47)), new write(30, new C1273x3da1f9e2(48, 24), new C1273x3da1f9e2(14, 25)), new write(30, new C1273x3da1f9e2(42, 15), new C1273x3da1f9e2(32, 16))), new Binding(39, new int[]{6, 26, 54, 82, 110, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, new write(30, new C1273x3da1f9e2(20, 117), new C1273x3da1f9e2(4, 118)), new write(28, new C1273x3da1f9e2(40, 47), new C1273x3da1f9e2(7, 48)), new write(30, new C1273x3da1f9e2(43, 24), new C1273x3da1f9e2(22, 25)), new write(30, new C1273x3da1f9e2(10, 15), new C1273x3da1f9e2(67, 16))), new Binding(40, new int[]{6, 30, 58, 86, 114, 142, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, new write(30, new C1273x3da1f9e2(19, 118), new C1273x3da1f9e2(6, 119)), new write(28, new C1273x3da1f9e2(18, 47), new C1273x3da1f9e2(31, 48)), new write(30, new C1273x3da1f9e2(34, 24), new C1273x3da1f9e2(34, 25)), new write(30, new C1273x3da1f9e2(20, 15), new C1273x3da1f9e2(61, 16)))};
        }
    }

    private ScriptGroup(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = execute.read((i >> 3) & 3);
        this.MediaBrowserCompat$ItemReceiver = (byte) (i & 7);
    }

    static int MediaBrowserCompat$ItemReceiver(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public static ScriptGroup write(int i, int i2) {
        ScriptGroup IconCompatParcelizer = IconCompatParcelizer(i, i2);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        return IconCompatParcelizer(i ^ 21522, i2 ^ 21522);
    }

    private static ScriptGroup IconCompatParcelizer(int i, int i2) {
        int bitCount;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i4 = 0;
        for (int[] iArr : write) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new ScriptGroup(iArr[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i5);
            if (bitCount2 < i3) {
                i4 = iArr[1];
                i3 = bitCount2;
            }
            if (i != i2 && (bitCount = Integer.bitCount(i5 ^ i2)) < i3) {
                i4 = iArr[1];
                i3 = bitCount;
            }
        }
        if (i3 <= 3) {
            return new ScriptGroup(i4);
        }
        return null;
    }

    public final int hashCode() {
        return (this.MediaBrowserCompat$CustomActionResultReceiver.ordinal() << 3) | this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScriptGroup)) {
            return false;
        }
        ScriptGroup scriptGroup = (ScriptGroup) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == scriptGroup.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == scriptGroup.MediaBrowserCompat$ItemReceiver) {
            return true;
        }
        return false;
    }
}
