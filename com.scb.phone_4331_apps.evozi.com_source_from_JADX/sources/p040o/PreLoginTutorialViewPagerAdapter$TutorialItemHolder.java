package p040o;

import org.tensorflow.lite.TensorFlowLite;

/* renamed from: o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder */
public enum PreLoginTutorialViewPagerAdapter$TutorialItemHolder {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4);
    
    private static final PreLoginTutorialViewPagerAdapter$TutorialItemHolder[] values = null;
    private final int value;

    static {
        values = values();
    }

    private PreLoginTutorialViewPagerAdapter$TutorialItemHolder(int i) {
        this.value = i;
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder MediaBrowserCompat$CustomActionResultReceiver(int i) {
        for (PreLoginTutorialViewPagerAdapter$TutorialItemHolder preLoginTutorialViewPagerAdapter$TutorialItemHolder : values) {
            if (preLoginTutorialViewPagerAdapter$TutorialItemHolder.value == i) {
                return preLoginTutorialViewPagerAdapter$TutorialItemHolder;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DataType error: DataType ");
        sb.append(i);
        sb.append(" is not recognized in Java (version ");
        sb.append(TensorFlowLite.version());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
