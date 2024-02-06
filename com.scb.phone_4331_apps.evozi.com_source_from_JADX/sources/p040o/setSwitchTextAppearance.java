package p040o;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.setSwitchTextAppearance */
public final class setSwitchTextAppearance {
    public static boolean write(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof setQueryHint) {
            return ((setQueryHint) viewParent).write(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onStartNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof setSuggestionsAdapter) {
            return ((setSuggestionsAdapter) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void read(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof setQueryHint) {
            ((setQueryHint) viewParent).MediaBrowserCompat$CustomActionResultReceiver(view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onNestedScrollAccepted");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof setSuggestionsAdapter) {
                ((setSuggestionsAdapter) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof setQueryHint) {
            ((setQueryHint) viewParent).IconCompatParcelizer(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof setSuggestionsAdapter) {
                ((setSuggestionsAdapter) viewParent).onStopNestedScroll(view);
            }
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof setQueryHint) {
            ((setQueryHint) viewParent).read(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof setSuggestionsAdapter) {
                ((setSuggestionsAdapter) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void write(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof setQueryHint) {
            ((setQueryHint) viewParent).IconCompatParcelizer(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onNestedPreScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof setSuggestionsAdapter) {
                ((setSuggestionsAdapter) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static boolean IconCompatParcelizer(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof setSuggestionsAdapter) {
            return ((setSuggestionsAdapter) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof setSuggestionsAdapter) {
            return ((setSuggestionsAdapter) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }
}
