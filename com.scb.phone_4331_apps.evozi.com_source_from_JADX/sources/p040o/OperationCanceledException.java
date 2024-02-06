package p040o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.p042v1.XmlPullParser;
import p039io.beid.beidk.p058ui.camera.GraphicOverlay;
import p040o.AppCompatMultiAutoCompleteTextView;
import p040o.BetterViewPager;

/* renamed from: o.OperationCanceledException */
public class OperationCanceledException extends BetterViewPager {
    ArrayList<BetterViewPager> MediaBrowserCompat$MediaItem = new ArrayList<>();
    int MediaDescriptionCompat;
    private int MediaMetadataCompat = 0;
    private boolean MediaSessionCompat$QueueItem = true;
    boolean RatingCompat = false;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    public OperationCanceledException() {
    }

    public OperationCanceledException(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onSaveInstanceState.MediaBrowserCompat$CustomActionResultReceiver);
        write(AlertController$RecycleListView.read(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    public final OperationCanceledException write(int i) {
        if (i == 0) {
            this.MediaSessionCompat$QueueItem = true;
        } else if (i == 1) {
            this.MediaSessionCompat$QueueItem = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    public final OperationCanceledException IconCompatParcelizer(BetterViewPager betterViewPager) {
        this.MediaBrowserCompat$MediaItem.add(betterViewPager);
        betterViewPager.IconCompatParcelizer = this;
        if (this.MediaBrowserCompat$CustomActionResultReceiver >= 0) {
            betterViewPager.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if ((this.MediaMetadataCompat & 1) != 0) {
            betterViewPager.IconCompatParcelizer(IconCompatParcelizer());
        }
        if ((this.MediaMetadataCompat & 2) != 0) {
            betterViewPager.read(this.read);
        }
        if ((this.MediaMetadataCompat & 4) != 0) {
            betterViewPager.MediaBrowserCompat$ItemReceiver(RatingCompat());
        }
        if ((this.MediaMetadataCompat & 8) != 0) {
            betterViewPager.write(MediaBrowserCompat$CustomActionResultReceiver());
        }
        return this;
    }

    public final void MediaBrowserCompat$ItemReceiver(putExtraData putextradata) {
        super.MediaBrowserCompat$ItemReceiver(putextradata);
        this.MediaMetadataCompat |= 4;
        for (int i = 0; i < this.MediaBrowserCompat$MediaItem.size(); i++) {
            this.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$ItemReceiver(putextradata);
        }
    }

    /* renamed from: o.OperationCanceledException$read */
    static class read extends AppCompatMultiAutoCompleteTextView {
        private OperationCanceledException MediaBrowserCompat$ItemReceiver;

        read(OperationCanceledException operationCanceledException) {
            this.MediaBrowserCompat$ItemReceiver = operationCanceledException;
        }

        public final void read() {
            if (!this.MediaBrowserCompat$ItemReceiver.RatingCompat) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem();
                this.MediaBrowserCompat$ItemReceiver.RatingCompat = true;
            }
        }

        public final void write(BetterViewPager betterViewPager) {
            OperationCanceledException operationCanceledException = this.MediaBrowserCompat$ItemReceiver;
            operationCanceledException.MediaDescriptionCompat--;
            if (this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat == 0) {
                this.MediaBrowserCompat$ItemReceiver.RatingCompat = false;
                this.MediaBrowserCompat$ItemReceiver.read();
            }
            betterViewPager.read((BetterViewPager$MediaBrowserCompat$ItemReceiver) this);
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(ViewGroup viewGroup, AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer, AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer2, ArrayList<setChildrenDrawingOrderEnabledCompat> arrayList, ArrayList<setChildrenDrawingOrderEnabledCompat> arrayList2) {
        long MediaDescriptionCompat2 = MediaDescriptionCompat();
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            BetterViewPager betterViewPager = this.MediaBrowserCompat$MediaItem.get(i);
            if (MediaDescriptionCompat2 > 0 && (this.MediaSessionCompat$QueueItem || i == 0)) {
                long MediaDescriptionCompat3 = betterViewPager.MediaDescriptionCompat();
                if (MediaDescriptionCompat3 > 0) {
                    betterViewPager.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat3 + MediaDescriptionCompat2);
                } else {
                    betterViewPager.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat2);
                }
            }
            betterViewPager.IconCompatParcelizer(viewGroup, iconCompatParcelizer, iconCompatParcelizer2, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.MediaBrowserCompat$MediaItem.isEmpty()) {
            MediaBrowserCompat$MediaItem();
            read();
            return;
        }
        read read2 = new read(this);
        Iterator<BetterViewPager> it = this.MediaBrowserCompat$MediaItem.iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) read2);
        }
        this.MediaDescriptionCompat = this.MediaBrowserCompat$MediaItem.size();
        if (!this.MediaSessionCompat$QueueItem) {
            for (int i = 1; i < this.MediaBrowserCompat$MediaItem.size(); i++) {
                final BetterViewPager betterViewPager = this.MediaBrowserCompat$MediaItem.get(i);
                this.MediaBrowserCompat$MediaItem.get(i - 1).IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) new AppCompatMultiAutoCompleteTextView() {
                    public final void write(BetterViewPager betterViewPager) {
                        betterViewPager.MediaBrowserCompat$SearchResultReceiver();
                        betterViewPager.read((BetterViewPager$MediaBrowserCompat$ItemReceiver) this);
                    }
                });
            }
            BetterViewPager betterViewPager2 = this.MediaBrowserCompat$MediaItem.get(0);
            if (betterViewPager2 != null) {
                betterViewPager2.MediaBrowserCompat$SearchResultReceiver();
                return;
            }
            return;
        }
        Iterator<BetterViewPager> it2 = this.MediaBrowserCompat$MediaItem.iterator();
        while (it2.hasNext()) {
            it2.next().MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public final void read(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        if (IconCompatParcelizer(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver)) {
            Iterator<BetterViewPager> it = this.MediaBrowserCompat$MediaItem.iterator();
            while (it.hasNext()) {
                BetterViewPager next = it.next();
                if (next.IconCompatParcelizer(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver)) {
                    next.read(setchildrendrawingorderenabledcompat);
                    setchildrendrawingorderenabledcompat.IconCompatParcelizer.add(next);
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        if (IconCompatParcelizer(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver)) {
            Iterator<BetterViewPager> it = this.MediaBrowserCompat$MediaItem.iterator();
            while (it.hasNext()) {
                BetterViewPager next = it.next();
                if (next.IconCompatParcelizer(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver)) {
                    next.MediaBrowserCompat$CustomActionResultReceiver(setchildrendrawingorderenabledcompat);
                    setchildrendrawingorderenabledcompat.IconCompatParcelizer.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        super.write(setchildrendrawingorderenabledcompat);
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompat$MediaItem.get(i).write(setchildrendrawingorderenabledcompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        super.MediaBrowserCompat$CustomActionResultReceiver(view);
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$CustomActionResultReceiver(view);
        }
    }

    public final void read(View view) {
        super.read(view);
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompat$MediaItem.get(i).read(view);
        }
    }

    public final void read(GraphicOverlay.read read2) {
        super.read(read2);
        this.MediaMetadataCompat |= 2;
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompat$MediaItem.get(i).read(read2);
        }
    }

    public final void write(BetterViewPager.write write) {
        super.write(write);
        this.MediaMetadataCompat |= 8;
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompat$MediaItem.get(i).write(write);
        }
    }

    /* access modifiers changed from: package-private */
    public final String IconCompatParcelizer(String str) {
        String IconCompatParcelizer = super.IconCompatParcelizer(str);
        for (int i = 0; i < this.MediaBrowserCompat$MediaItem.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(IconCompatParcelizer);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(this.MediaBrowserCompat$MediaItem.get(i).IconCompatParcelizer(sb2.toString()));
            IconCompatParcelizer = sb.toString();
        }
        return IconCompatParcelizer;
    }

    public final BetterViewPager write() {
        OperationCanceledException operationCanceledException = (OperationCanceledException) super.clone();
        operationCanceledException.MediaBrowserCompat$MediaItem = new ArrayList<>();
        int size = this.MediaBrowserCompat$MediaItem.size();
        for (int i = 0; i < size; i++) {
            operationCanceledException.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem.get(i).clone());
        }
        return operationCanceledException;
    }

    public final /* bridge */ /* synthetic */ BetterViewPager IconCompatParcelizer(BetterViewPager$MediaBrowserCompat$ItemReceiver betterViewPager$MediaBrowserCompat$ItemReceiver) {
        return (OperationCanceledException) super.IconCompatParcelizer(betterViewPager$MediaBrowserCompat$ItemReceiver);
    }

    public final /* synthetic */ BetterViewPager write(View view) {
        for (int i = 0; i < this.MediaBrowserCompat$MediaItem.size(); i++) {
            this.MediaBrowserCompat$MediaItem.get(i).write(view);
        }
        return (OperationCanceledException) super.write(view);
    }

    public final /* bridge */ /* synthetic */ BetterViewPager read(BetterViewPager$MediaBrowserCompat$ItemReceiver betterViewPager$MediaBrowserCompat$ItemReceiver) {
        return (OperationCanceledException) super.read(betterViewPager$MediaBrowserCompat$ItemReceiver);
    }

    public final /* synthetic */ BetterViewPager MediaBrowserCompat$ItemReceiver(View view) {
        for (int i = 0; i < this.MediaBrowserCompat$MediaItem.size(); i++) {
            this.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$ItemReceiver(view);
        }
        return (OperationCanceledException) super.MediaBrowserCompat$ItemReceiver(view);
    }

    public final /* synthetic */ BetterViewPager write(long j) {
        super.write(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver >= 0) {
            int size = this.MediaBrowserCompat$MediaItem.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompat$MediaItem.get(i).write(j);
            }
        }
        return this;
    }

    public final /* synthetic */ BetterViewPager IconCompatParcelizer(TimeInterpolator timeInterpolator) {
        this.MediaMetadataCompat |= 1;
        ArrayList<BetterViewPager> arrayList = this.MediaBrowserCompat$MediaItem;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompat$MediaItem.get(i).IconCompatParcelizer(timeInterpolator);
            }
        }
        return (OperationCanceledException) super.IconCompatParcelizer(timeInterpolator);
    }

    public final /* bridge */ /* synthetic */ BetterViewPager MediaBrowserCompat$CustomActionResultReceiver(long j) {
        return (OperationCanceledException) super.MediaBrowserCompat$CustomActionResultReceiver(j);
    }
}
