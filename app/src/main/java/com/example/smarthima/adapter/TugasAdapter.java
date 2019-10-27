package com.example.smarthima.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smarthima.model.Tugas;

import java.util.ArrayList;

public class TugasAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Tugas> TugasTugas;

    public TugasAdapter(Context context, ArrayList<Tugas> tugasTugas) {
        this.context = context;
        TugasTugas = tugasTugas;
    }


    // implementasi yang diperlukan karena extends BaseAdapter
    @Override
    public int getCount() {
        return TugasTugas.size();
    }

    @Override
    public Object getItem(int position) {
        return TugasTugas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
//            convertView = LayoutInflater.from(context).inflate(R.layout.item_student, parent, false);// belum ada layout
        }
        ViewHolder viewHolder = new ViewHolder(convertView);
        Tugas tugas = (Tugas) getItem(position);
        viewHolder.bind(tugas);
        return convertView;
    }
    // akhir implementasi BaseAdapter

    private class ViewHolder {
        private TextView title;
        private TextView date,numOfAttachment,numOfComments;

        public ViewHolder(View convertView) {
//            title = convertView.findViewById();
//            date = convertView.findViewById();
//            numOfAttachment = convertView.findViewById();
//            numOfComments = convertView.findViewById();
        }

        public void bind(Tugas tugas) {
//            txtName.setText(tugas.getNama());
//            txtNim.setText(tugas.getNim());
//            txtAngkatan.setText(tugas.getAngkatan());
//            imgPhoto.setImageResource(tugas.getImg());
        }
    }
}
