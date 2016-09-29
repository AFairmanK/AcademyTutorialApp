package com.example.adam.academytutorialapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Adam on 26/08/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private  int mImageHeight = 350;
    private  int mImageWith = 350;

    private static Integer[] mThumbnails = {
            R.drawable.aba, R.drawable.babba,R.drawable.gmana,R.drawable.kdmmd,R.drawable.sword,R.drawable.berserk_hd,};

    public ImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mThumbnails.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(mImageHeight,mImageWith));
            imageView.setPadding(8,8,8,8);


        }else{
            imageView = (ImageView) convertView;
        }
        Bitmap bitmap = ImageUtils.decodeSampleBitmapFromResource(mContext.getResources(),mThumbnails[position],mImageWith,mImageHeight);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }
}
