package com.roger.psdloadingview.library.animate;

import android.graphics.Canvas;

/**
 * Created by Administrator on 2016/1/8.
 */
public class TranslationX2Animate extends BaseAnimate {
    @Override public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isStop) {
            for (int i = 0; i < textLength; i++) {
                canvas.drawText(DOT + "", 0, 1, progress *
                                (mPsdLoadingView.getWidth() -
                                        (textLength + 2) * distance) +
                                (i + 1) * distance * (1 +
                                        (int) Math.abs(progress - 0.5) * 2),
                        startY, mPaint);
            }
        }
    }
}
