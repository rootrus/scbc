package p040o;

/* renamed from: o.GroupBillerActivity */
final class GroupBillerActivity {
    public static final LifestyleCustomizationActivity IconCompatParcelizer;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        sb.append("[eE][+-]?(\\p{Digit}+)");
        sb.append(")?)|");
        sb.append("(\\.(");
        sb.append("(\\p{Digit}+)");
        sb.append(")(");
        sb.append("[eE][+-]?(\\p{Digit}+)");
        sb.append(")?)|");
        sb.append("((");
        sb.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        sb.append(")[pP][+-]?");
        sb.append("(\\p{Digit}+)");
        sb.append(')');
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb2.append(obj);
        sb2.append(")[fFdD]?))[\\x00-\\x20]*");
        IconCompatParcelizer = new LifestyleCustomizationActivity(sb2.toString());
    }
}
