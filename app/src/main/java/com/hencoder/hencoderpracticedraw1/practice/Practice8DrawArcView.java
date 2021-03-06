package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint=new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawArc(100,100,600,600,-150,100,true,paint);

        paint.setColor(Color.RED);

        canvas.drawArc(80,100,600,600,-150,-80,true,paint);

        paint.setColor(Color.GREEN);

        canvas.drawArc(100,100,600,600,-230,-100,true,paint);

        paint.setColor(Color.GRAY);

        canvas.drawArc(100,100,600,600,-50,100,true,paint);

        paint.setStyle(Paint.Style.STROKE); // 画线模式
        paint.setColor(Color.BLUE);
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint); // 绘制不封口的弧形

    }
}
