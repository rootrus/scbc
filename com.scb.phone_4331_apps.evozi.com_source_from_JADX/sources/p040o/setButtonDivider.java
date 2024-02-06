package p040o;

import android.view.View;
import android.widget.SeekBar;
import java.lang.reflect.Field;

/* renamed from: o.setButtonDivider */
final class setButtonDivider extends BankingAgentSuccessActivity<SeekBar.OnSeekBarChangeListener, SeekBar> implements SeekBar.OnSeekBarChangeListener {
    protected setButtonDivider(String str, String str2) {
        super(str, str2);
    }

    private static SeekBar.OnSeekBarChangeListener MediaBrowserCompat$ItemReceiver(SeekBar seekBar) {
        try {
            Class cls = seekBar.getClass();
            while (cls != SeekBar.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mOnSeekBarChangeListener");
            declaredField.setAccessible(true);
            return (SeekBar.OnSeekBarChangeListener) declaredField.get(seekBar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void read(View view) {
        if (!(view instanceof SeekBar)) {
            MyECouponActivity_ViewBinding.write("View should be a sibling of a SeekBar");
        }
        SeekBar seekBar = (SeekBar) view;
        T MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(seekBar);
        if (MediaBrowserCompat$ItemReceiver != this) {
            this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
            seekBar.setOnSeekBarChangeListener(this);
        }
    }

    public final void write(View view) throws ClassCastException {
        super.write(view);
        ((SeekBar) view).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this.IconCompatParcelizer);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.IconCompatParcelizer != null) {
            ((SeekBar.OnSeekBarChangeListener) this.IconCompatParcelizer).onProgressChanged(seekBar, i, z);
        }
        MediaBrowserCompat$ItemReceiver(String.valueOf(seekBar.getProgress()));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.IconCompatParcelizer != null) {
            ((SeekBar.OnSeekBarChangeListener) this.IconCompatParcelizer).onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.IconCompatParcelizer != null) {
            ((SeekBar.OnSeekBarChangeListener) this.IconCompatParcelizer).onStopTrackingTouch(seekBar);
        }
    }
}
