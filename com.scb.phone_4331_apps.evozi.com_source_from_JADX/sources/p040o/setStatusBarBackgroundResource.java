package p040o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p040o.BetterViewPager;

/* renamed from: o.setStatusBarBackgroundResource */
public class setStatusBarBackgroundResource extends setContentPadding {
    public boolean MediaBrowserCompat$ItemReceiver(Object obj) {
        return obj instanceof BetterViewPager;
    }

    public Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj != null) {
            return ((BetterViewPager) obj).clone();
        }
        return null;
    }

    public Object write(Object obj) {
        if (obj == null) {
            return null;
        }
        OperationCanceledException operationCanceledException = new OperationCanceledException();
        operationCanceledException.IconCompatParcelizer((BetterViewPager) obj);
        return operationCanceledException;
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj, View view, ArrayList<View> arrayList) {
        OperationCanceledException operationCanceledException = (OperationCanceledException) obj;
        ArrayList<View> arrayList2 = operationCanceledException.MediaBrowserCompat$SearchResultReceiver;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            write((List<View>) arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        IconCompatParcelizer(operationCanceledException, arrayList);
    }

    public void write(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            write(view, rect);
            ((BetterViewPager) obj).write((BetterViewPager.write) new BetterViewPager.write() {
            });
        }
    }

    public void IconCompatParcelizer(Object obj, ArrayList<View> arrayList) {
        BetterViewPager betterViewPager = (BetterViewPager) obj;
        if (betterViewPager != null) {
            int i = 0;
            if (betterViewPager instanceof OperationCanceledException) {
                OperationCanceledException operationCanceledException = (OperationCanceledException) betterViewPager;
                int size = operationCanceledException.MediaBrowserCompat$MediaItem.size();
                while (i < size) {
                    IconCompatParcelizer((i < 0 || i >= operationCanceledException.MediaBrowserCompat$MediaItem.size()) ? null : operationCanceledException.MediaBrowserCompat$MediaItem.get(i), arrayList);
                    i++;
                }
            } else if (!MediaBrowserCompat$CustomActionResultReceiver(betterViewPager) && IconCompatParcelizer(betterViewPager.MediaBrowserCompat$SearchResultReceiver)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    betterViewPager.write(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public Object IconCompatParcelizer(Object obj, Object obj2, Object obj3) {
        OperationCanceledException operationCanceledException = new OperationCanceledException();
        if (obj != null) {
            operationCanceledException.IconCompatParcelizer((BetterViewPager) obj);
        }
        if (obj2 != null) {
            operationCanceledException.IconCompatParcelizer((BetterViewPager) obj2);
        }
        if (obj3 != null) {
            operationCanceledException.IconCompatParcelizer((BetterViewPager) obj3);
        }
        return operationCanceledException;
    }

    public void read(Object obj, final View view, final ArrayList<View> arrayList) {
        ((BetterViewPager) obj).IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) new BetterViewPager$MediaBrowserCompat$ItemReceiver() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
            }

            public final void MediaBrowserCompat$ItemReceiver() {
            }

            public final void read() {
            }

            public final void write(BetterViewPager betterViewPager) {
                betterViewPager.read((BetterViewPager$MediaBrowserCompat$ItemReceiver) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    public Object MediaBrowserCompat$ItemReceiver(Object obj, Object obj2, Object obj3) {
        BetterViewPager betterViewPager = (BetterViewPager) obj;
        BetterViewPager betterViewPager2 = (BetterViewPager) obj2;
        BetterViewPager betterViewPager3 = (BetterViewPager) obj3;
        if (betterViewPager != null && betterViewPager2 != null) {
            betterViewPager = new OperationCanceledException().IconCompatParcelizer(betterViewPager).IconCompatParcelizer(betterViewPager2).write(1);
        } else if (betterViewPager == null) {
            betterViewPager = betterViewPager2 != null ? betterViewPager2 : null;
        }
        if (betterViewPager3 == null) {
            return betterViewPager;
        }
        OperationCanceledException operationCanceledException = new OperationCanceledException();
        if (betterViewPager != null) {
            operationCanceledException.IconCompatParcelizer(betterViewPager);
        }
        operationCanceledException.IconCompatParcelizer(betterViewPager3);
        return operationCanceledException;
    }

    public void MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, Object obj) {
        IconCompat.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, (BetterViewPager) obj);
    }

    public void write(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((BetterViewPager) obj).IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) new BetterViewPager$MediaBrowserCompat$ItemReceiver() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
            }

            public final void MediaBrowserCompat$ItemReceiver() {
            }

            public final void write(BetterViewPager betterViewPager) {
            }

            public final void read() {
                Object obj = obj5;
                if (obj != null) {
                    setStatusBarBackgroundResource.this.MediaBrowserCompat$ItemReceiver(obj, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    setStatusBarBackgroundResource.this.MediaBrowserCompat$ItemReceiver(obj2, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    setStatusBarBackgroundResource.this.MediaBrowserCompat$ItemReceiver(obj3, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }
        });
    }

    public void read(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        OperationCanceledException operationCanceledException = (OperationCanceledException) obj;
        if (operationCanceledException != null) {
            operationCanceledException.MediaBrowserCompat$SearchResultReceiver.clear();
            operationCanceledException.MediaBrowserCompat$SearchResultReceiver.addAll(arrayList2);
            MediaBrowserCompat$ItemReceiver((Object) operationCanceledException, arrayList, arrayList2);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        BetterViewPager betterViewPager = (BetterViewPager) obj;
        int i2 = 0;
        if (betterViewPager instanceof OperationCanceledException) {
            OperationCanceledException operationCanceledException = (OperationCanceledException) betterViewPager;
            int size = operationCanceledException.MediaBrowserCompat$MediaItem.size();
            while (i2 < size) {
                MediaBrowserCompat$ItemReceiver((Object) (i2 < 0 || i2 >= operationCanceledException.MediaBrowserCompat$MediaItem.size()) ? null : operationCanceledException.MediaBrowserCompat$MediaItem.get(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!MediaBrowserCompat$CustomActionResultReceiver(betterViewPager)) {
            ArrayList<View> arrayList3 = betterViewPager.MediaBrowserCompat$SearchResultReceiver;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    betterViewPager.write(arrayList2.get(i2));
                    i2++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    betterViewPager.MediaBrowserCompat$ItemReceiver(arrayList.get(size2));
                }
            }
        }
    }

    public void read(Object obj, View view) {
        if (obj != null) {
            ((BetterViewPager) obj).write(view);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj, View view) {
        if (obj != null) {
            ((BetterViewPager) obj).MediaBrowserCompat$ItemReceiver(view);
        }
    }

    public void read(Object obj, final Rect rect) {
        if (obj != null) {
            ((BetterViewPager) obj).write((BetterViewPager.write) new BetterViewPager.write() {
            });
        }
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(BetterViewPager betterViewPager) {
        return !IconCompatParcelizer(betterViewPager.write) || !IconCompatParcelizer((List) null) || !IconCompatParcelizer((List) null);
    }
}
