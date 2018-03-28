package com.example.techtron.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 2/5/2018.
 */

//recycler view has a lot of sub classes that we can extend to get most of the functions that we need
public class SchoolSubjectsAdapter extends RecyclerView.Adapter<SchoolSubjectsAdapter.CustomViewHolder> {
    Context context;
    ArrayList<SchoolSubject> schoolSubjects;

    public SchoolSubjectsAdapter(Context context, ArrayList<SchoolSubject> schoolSubjects) {
        this.context = context;
        this.schoolSubjects = schoolSubjects;
    }

    //this will make it stop complaining that there is no custome view holder
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, null, false);
        return new CustomViewHolder(view);
    }
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        SchoolSubject schoolSubject = schoolSubjects.get(position);
        holder.imageView.setImageResource(schoolSubject.imageResId);
        holder.textView.setText(schoolSubject.subjectName);
        hodler.checkBox.setChecked(schoolSubject.isHomeworkDone);
    }
    @Override
    public int getItemCount() {
        return 0;
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CheckBox checkBox;

        public CustomViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            textView = (TextView) view.findViewById(R.id.textView);
            checkBox = (CheckBox) view.findViewById(R.id.checkBox);
        }
    }

}
