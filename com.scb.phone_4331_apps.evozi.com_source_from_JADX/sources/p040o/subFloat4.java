package p040o;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p040o.subF64;

/* renamed from: o.subFloat4 */
public final class subFloat4 extends subF64<PieRadarChartBase<?>> {
    private ArrayList<IconCompatParcelizer> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    private long MediaBrowserCompat$SearchResultReceiver = 0;
    private float MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
    private float MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
    private subShort4 RatingCompat = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public subFloat4(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        if (!this.write.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.read).setItemInvoker) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
                this.MediaBrowserCompat$ItemReceiver.clear();
                if (((PieRadarChartBase) this.read).write) {
                    MediaBrowserCompat$CustomActionResultReceiver(x, y);
                }
                this.MediaDescriptionCompat = ((PieRadarChartBase) this.read).write(x, y) - ((PieRadarChartBase) this.read).setShortcut;
                this.RatingCompat.MediaBrowserCompat$ItemReceiver = x;
                this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.read).write) {
                    this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
                    MediaBrowserCompat$CustomActionResultReceiver(x, y);
                    if (this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                        f = 0.0f;
                    } else {
                        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.get(0);
                        ArrayList<IconCompatParcelizer> arrayList = this.MediaBrowserCompat$ItemReceiver;
                        IconCompatParcelizer iconCompatParcelizer2 = arrayList.get(arrayList.size() - 1);
                        IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer;
                        for (int size = this.MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
                            iconCompatParcelizer3 = this.MediaBrowserCompat$ItemReceiver.get(size);
                            if (iconCompatParcelizer3.MediaBrowserCompat$ItemReceiver != iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver) {
                                break;
                            }
                        }
                        float f2 = ((float) (iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver - iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver)) / 1000.0f;
                        if (f2 == BitmapDescriptorFactory.HUE_RED) {
                            f2 = 0.1f;
                        }
                        boolean z = iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver >= iconCompatParcelizer3.MediaBrowserCompat$ItemReceiver;
                        if (((double) Math.abs(iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver - iconCompatParcelizer3.MediaBrowserCompat$ItemReceiver)) > 270.0d) {
                            z = !z;
                        }
                        if (((double) (iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver - iconCompatParcelizer.MediaBrowserCompat$ItemReceiver)) > 180.0d) {
                            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = (float) (((double) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) + 360.0d);
                        } else if (((double) (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver - iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver)) > 180.0d) {
                            iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = (float) (((double) iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver) + 360.0d);
                        }
                        f = Math.abs((iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver - iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) / f2);
                        if (!z) {
                            f = -f;
                        }
                    }
                    this.MediaMetadataCompat = f;
                    if (f != BitmapDescriptorFactory.HUE_RED) {
                        this.MediaBrowserCompat$SearchResultReceiver = AnimationUtils.currentAnimationTimeMillis();
                        subShort3.IconCompatParcelizer((View) this.read);
                    }
                }
                ViewParent parent = ((PieRadarChartBase) this.read).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            } else if (action == 2) {
                if (((PieRadarChartBase) this.read).write) {
                    MediaBrowserCompat$CustomActionResultReceiver(x, y);
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                    float f3 = x - this.RatingCompat.MediaBrowserCompat$ItemReceiver;
                    float f4 = y - this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
                    if (((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) > subShort3.read(8.0f)) {
                        subF64.read read = subF64.read.ROTATE;
                        this.MediaBrowserCompat$CustomActionResultReceiver = 6;
                        ViewParent parent2 = ((PieRadarChartBase) this.read).getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver == 6) {
                    ((PieRadarChartBase) this.read).setRotationAngle(((PieRadarChartBase) this.read).write(x, y) - this.MediaDescriptionCompat);
                    ((PieRadarChartBase) this.read).invalidate();
                }
            }
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        subF64.read read = subF64.read.LONG_PRESS;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        subF64.read read = subF64.read.SINGLE_TAP;
        if (!((PieRadarChartBase) this.read).MediaDescriptionCompat) {
            return false;
        }
        write(((PieRadarChartBase) this.read).read(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.MediaBrowserCompat$ItemReceiver.add(new IconCompatParcelizer(currentAnimationTimeMillis, ((PieRadarChartBase) this.read).write(f, f2)));
        for (int size = this.MediaBrowserCompat$ItemReceiver.size(); size - 2 > 0 && currentAnimationTimeMillis - this.MediaBrowserCompat$ItemReceiver.get(0).MediaBrowserCompat$CustomActionResultReceiver > 1000; size--) {
            this.MediaBrowserCompat$ItemReceiver.remove(0);
        }
    }

    public final void read() {
        if (this.MediaMetadataCompat != BitmapDescriptorFactory.HUE_RED) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.MediaMetadataCompat *= ((PieRadarChartBase) this.read).MediaMetadataCompat;
            ((PieRadarChartBase) this.read).setRotationAngle(((PieRadarChartBase) this.read).setPopupCallback + (this.MediaMetadataCompat * (((float) (currentAnimationTimeMillis - this.MediaBrowserCompat$SearchResultReceiver)) / 1000.0f)));
            this.MediaBrowserCompat$SearchResultReceiver = currentAnimationTimeMillis;
            if (((double) Math.abs(this.MediaMetadataCompat)) >= 0.001d) {
                subShort3.IconCompatParcelizer((View) this.read);
            } else {
                this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    /* renamed from: o.subFloat4$IconCompatParcelizer */
    class IconCompatParcelizer {
        public long MediaBrowserCompat$CustomActionResultReceiver;
        public float MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(long j, float f) {
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
            this.MediaBrowserCompat$ItemReceiver = f;
        }
    }
}
