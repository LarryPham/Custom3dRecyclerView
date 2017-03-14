package com.capsule.apps.broccoli;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class CustomSrollView extends LinearLayout {

    private static final String TAG = CustomRecyclerView.class.getSimpleName();

    private static final int AMBIENT_LIGHT = 55;
    private static final int DIFFUSE_LIGHT = 200;
    private static final float SPECULAR_LIGHT = 70;
    private static final float SHININESS = 200;
    private static final int MAX_INTENSITY = 0xFFFFFF;

    private Camera mCamera = new Camera();
    private Matrix mMatrix = new Matrix();

    public CustomSrollView(Context context) {
        super(context);
        initialize();
    }

    public CustomSrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public CustomSrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    private void initialize() {
        mCamera = new Camera();
        mMatrix = new Matrix();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mCamera.save();
        mCamera.rotate(20, 0, 0);
        mCamera.getMatrix(mMatrix);
        mMatrix.preTranslate(-getWidth() / 2, -getHeight() / 2);
        mMatrix.postTranslate(getWidth() / 2, getHeight() / 2);
        canvas.concat(mMatrix);
        super.onDraw(canvas);
        mCamera.restore();
    }

    /* @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mCamera.save();
        mCamera.translate(0, 0, getHeight() / 2);
        mCamera.getMatrix(mMatrix);
        mCamera.restore();

        mMatrix.preTranslate(-getWidth() / 2.0f, -getHeight() / 2.0f);
        mMatrix.postTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
    }*/

}
