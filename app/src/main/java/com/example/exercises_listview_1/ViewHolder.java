package com.example.exercises_listview_1;

import android.view.View;
import android.widget.RatingBar;

public class ViewHolder {
    RatingBar rate=null;
    ViewHolder(View base) {
        this.rate=(RatingBar)base.findViewById(R.id.ratingBarRow);
    }
}
