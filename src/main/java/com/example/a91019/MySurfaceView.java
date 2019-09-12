package com.example.a91019;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

    }

    public void onDraw(Canvas canvas) {
        Bitmap myImageBMP = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        canvas.drawBitmap(myImageBMP, 200, 200, null);
        Log.i("onDraw", "Picture drawn");
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(5.0f);
        canvas.drawRect(100, 100, 300, 300, paint);
    }
}
