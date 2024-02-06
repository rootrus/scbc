package p040o;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setMaxCardElevation */
class setMaxCardElevation extends setContentPadding {
    setMaxCardElevation() {
    }

    public boolean MediaBrowserCompat$ItemReceiver(Object obj) {
        return obj instanceof Transition;
    }

    public Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object write(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            write((List<View>) targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        IconCompatParcelizer(transitionSet, arrayList);
    }

    public void write(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            write(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    public void IconCompatParcelizer(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    IconCompatParcelizer(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!read(transition) && IconCompatParcelizer(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    private static boolean read(Transition transition) {
        return !IconCompatParcelizer(transition.getTargetIds()) || !IconCompatParcelizer(transition.getTargetNames()) || !IconCompatParcelizer(transition.getTargetTypes());
    }

    public Object IconCompatParcelizer(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public void read(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    public Object MediaBrowserCompat$ItemReceiver(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public void MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public void write(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                Object obj = obj5;
                if (obj != null) {
                    setMaxCardElevation.this.MediaBrowserCompat$ItemReceiver(obj, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    setMaxCardElevation.this.MediaBrowserCompat$ItemReceiver(obj2, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    setMaxCardElevation.this.MediaBrowserCompat$ItemReceiver(obj3, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }
        });
    }

    public void read(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            MediaBrowserCompat$ItemReceiver((Object) transitionSet, arrayList, arrayList2);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                MediaBrowserCompat$ItemReceiver((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!read(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    public void read(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public void read(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                public Rect onGetEpicenter(Transition transition) {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}
